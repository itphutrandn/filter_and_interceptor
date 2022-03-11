package h2.console.h2console_junittest_mock.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class BeforeRequestFilter implements Filter {
    private final static Logger log = LoggerFactory.getLogger(BeforeRequestFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("This is init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Heloooooooooooooo filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("This is destroy");
    }
}
