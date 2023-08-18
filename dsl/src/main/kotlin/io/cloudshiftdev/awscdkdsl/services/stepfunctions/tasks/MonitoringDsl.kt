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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring

/**
 * Configuration setting for monitoring.
 *
 * Example:
 * ```
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .sparkSubmitParameters("--conf spark.executor.instances=2 --conf spark.executor.memory=2G --conf
 * spark.executor.cores=2 --conf spark.driver.cores=1")
 * .build())
 * .build())
 * .monitoring(Monitoring.builder()
 * .logging(true)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MonitoringDsl {
    private val cdkBuilder: Monitoring.Builder = Monitoring.builder()

    /**
     * @param logBucket Amazon S3 Bucket for monitoring log publishing. You can configure your jobs
     *   to send log information to Amazon S3.
     */
    public fun logBucket(logBucket: IBucket) {
        cdkBuilder.logBucket(logBucket)
    }

    /**
     * @param logGroup A log group for CloudWatch monitoring. You can configure your jobs to send
     *   log information to CloudWatch Logs.
     */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /** @param logStreamNamePrefix A log stream name prefix for Cloudwatch monitoring. */
    public fun logStreamNamePrefix(logStreamNamePrefix: String) {
        cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
    }

    /**
     * @param logging Enable logging for this job. If set to true, will automatically create a
     *   Cloudwatch Log Group and S3 bucket. This will be set to `true` implicitly if values are
     *   provided for `logGroup` or `logBucket`.
     */
    public fun logging(logging: Boolean) {
        cdkBuilder.logging(logging)
    }

    /** @param persistentAppUi Monitoring configurations for the persistent application UI. */
    public fun persistentAppUi(persistentAppUi: Boolean) {
        cdkBuilder.persistentAppUi(persistentAppUi)
    }

    public fun build(): Monitoring = cdkBuilder.build()
}
