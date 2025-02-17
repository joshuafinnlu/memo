package com.zeoflow.memo;

/**
 * Interceptor for all logs happens in the library
 */
public interface ILogInterceptor
{

    /**
     * Will be triggered each time when a log is written
     *
     * @param message is the log message
     */
    void onLog(String message);

}
