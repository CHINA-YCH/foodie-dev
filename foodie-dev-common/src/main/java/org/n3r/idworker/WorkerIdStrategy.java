package org.n3r.idworker;

/**
 * @author Administrator
 */
public interface WorkerIdStrategy {
    /**
     * -
     */
    void initialize();

    /**
     * -
     */
    long availableWorkerId();

    /**
     * -
     */
    void release();
}
