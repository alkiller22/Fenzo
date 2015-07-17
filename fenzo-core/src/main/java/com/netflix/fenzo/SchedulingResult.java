/*
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.fenzo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @warn class description missing
 */
public class SchedulingResult {
    private final Map<String, VMAssignmentResult> resultMap;
    private final Map<TaskRequest, List<TaskAssignmentResult>> failures;
    private int leasesAdded;
    private int leasesRejected;
    private long runtime;
    private int numAllocations;
    private int totalVMsCount;
    private int idleVMsCount;

    SchedulingResult(Map<String, VMAssignmentResult> resultMap) {
        this.resultMap = resultMap;
        failures = new HashMap<>();
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public Map<String, VMAssignmentResult> getResultMap() {
        return resultMap;
    }

    /**
     * @warn method description missing
     * @warn parameter descriptions missing
     *
     * @param request
     * @param f
     */
    void addFailures(TaskRequest request, List<TaskAssignmentResult> f) {
        failures.put(request, f);
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public Map<TaskRequest, List<TaskAssignmentResult>> getFailures() {
        return failures;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public int getLeasesAdded() {
        return leasesAdded;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param leasesAdded
     */
    void setLeasesAdded(int leasesAdded) {
        this.leasesAdded = leasesAdded;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public int getLeasesRejected() {
        return leasesRejected;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param leasesRejected
     */
    void setLeasesRejected(int leasesRejected) {
        this.leasesRejected = leasesRejected;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public long getRuntime() {
        return runtime;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param runtime
     */
    void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public int getNumAllocations() {
        return numAllocations;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param numAllocations
     */
    void setNumAllocations(int numAllocations) {
        this.numAllocations = numAllocations;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public int getTotalVMsCount() {
        return totalVMsCount;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param totalVMsCount
     */
    void setTotalVMsCount(int totalVMsCount) {
        this.totalVMsCount = totalVMsCount;
    }

    /**
     * @warn method description missing
     *
     * @return
     */
    public int getIdleVMsCount() {
        return idleVMsCount;
    }

    /**
     * @warn method description missing
     * @warn parameter description missing
     *
     * @param idleVMsCount
     */
    void setIdleVMsCount(int idleVMsCount) {
        this.idleVMsCount = idleVMsCount;
    }
}