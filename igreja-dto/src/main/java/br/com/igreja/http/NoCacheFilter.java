package br.com.igreja.http;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Filtro para aplicar headers anti-cache
 */
public class NoCacheFilter implements Filter
{

   @Override
   public void init(FilterConfig filterConfig) throws ServletException
   {
      //Metodo vazio
   }

   @Override
   public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException
   {
      ((HttpServletResponse) servletResponse).setHeader("Cache-Control", "no-cache, no-store");
      ((HttpServletResponse) servletResponse).setHeader("Expires", "-1");

      filterChain.doFilter(servletRequest, servletResponse);
   }

   @Override
   public void destroy()
   {
      //Metodo vazio
   }
}
