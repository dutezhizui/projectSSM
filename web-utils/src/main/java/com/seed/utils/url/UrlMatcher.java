package com.seed.utils.url;

/**
 * Created by OL on 2017/1/25.
 */
public interface UrlMatcher{
    Object compile(String paramString);
    boolean pathMatchesUrl(Object paramObject, String paramString);
    String getUniversalMatchPattern();
    boolean requiresLowerCaseUrl();
}  
