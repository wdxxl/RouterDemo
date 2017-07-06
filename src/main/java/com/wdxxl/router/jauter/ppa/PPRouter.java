package com.wdxxl.router.jauter.ppa;

import com.wdxxl.router.jauter.Router;
import com.wdxxl.router.jauter.ppa.impl.FullTextSearchAPI;
import com.wdxxl.service.IFullTextSearchServiceImpl;

public class PPRouter extends Router<PPMethod, Class<? extends PPAction>, PPRouter> {

    // This is to overcome method chaining inheritance problem
    // http://stackoverflow.com/questions/1069528/method-chaining-inheritance-don-t-play-well-together-java
    @Override protected PPRouter getThis() {
        return this;
    }

    @Override protected PPMethod CONNECT() { return PPMethod.CONNECT; }
    @Override protected PPMethod DELETE()  { return PPMethod.DELETE ; }
    @Override protected PPMethod GET()     { return PPMethod.GET    ; }
    @Override protected PPMethod HEAD()    { return PPMethod.HEAD   ; }
    @Override protected PPMethod OPTIONS() { return PPMethod.OPTIONS; }
    @Override protected PPMethod PATCH()   { return PPMethod.PATCH  ; }
    @Override protected PPMethod POST()    { return PPMethod.POST   ; }
    @Override protected PPMethod PUT()     { return PPMethod.PUT    ; }
    @Override protected PPMethod TRACE()   { return PPMethod.TRACE  ; }

    public void createPPActionFactory() {
        // Search
        this.GET(IFullTextSearchServiceImpl.FULLTEXT_SEARCH_INIT, FullTextSearchAPI.class);
    }

}
