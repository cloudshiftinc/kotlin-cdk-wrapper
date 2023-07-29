@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver

/**
 * Specify the driver that the EMR Containers job runs on.
 *
 * The job driver is used to provide an input for the job that will be run.
 *
 * Example:
 * ```
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobName("EMR-Containers-Job")
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .build())
 * .build())
 * .applicationConfig(List.of(ApplicationConfiguration.builder()
 * .classification(Classification.SPARK_DEFAULTS)
 * .properties(Map.of(
 * "spark.executor.instances", "1",
 * "spark.executor.memory", "512M"))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class JobDriverDsl {
    private val cdkBuilder: JobDriver.Builder = JobDriver.builder()

    /** @param sparkSubmitJobDriver The job driver parameters specified for spark submit. */
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriverDsl.() -> Unit = {}) {
        val builder = SparkSubmitJobDriverDsl()
        builder.apply(sparkSubmitJobDriver)
        cdkBuilder.sparkSubmitJobDriver(builder.build())
    }

    /** @param sparkSubmitJobDriver The job driver parameters specified for spark submit. */
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver) {
        cdkBuilder.sparkSubmitJobDriver(sparkSubmitJobDriver)
    }

    public fun build(): JobDriver = cdkBuilder.build()
}
