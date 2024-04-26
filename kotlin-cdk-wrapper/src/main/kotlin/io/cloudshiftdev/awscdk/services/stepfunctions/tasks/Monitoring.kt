@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Configuration setting for monitoring.
 *
 * Example:
 *
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
public interface Monitoring {
  /**
   * Amazon S3 Bucket for monitoring log publishing.
   *
   * You can configure your jobs to send log information to Amazon S3.
   *
   * Default: - if `logging` is manually set to `true` and a `logBucket` is not provided, a
   * `logBucket` will be automatically generated`.
   */
  public fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

  /**
   * A log group for CloudWatch monitoring.
   *
   * You can configure your jobs to send log information to CloudWatch Logs.
   *
   * Default: - if `logging` is manually set to `true` and a `logGroup` is not provided, a
   * `logGroup` will be automatically generated`.
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * A log stream name prefix for Cloudwatch monitoring.
   *
   * Default: - Log streams created in this log group have no default prefix
   */
  public fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

  /**
   * Enable logging for this job.
   *
   * If set to true, will automatically create a Cloudwatch Log Group and S3 bucket.
   * This will be set to `true` implicitly if values are provided for `logGroup` or `logBucket`.
   *
   * Default: true - true if values are provided for `logGroup` or `logBucket`, false otherwise
   */
  public fun logging(): Boolean? = unwrap(this).getLogging()

  /**
   * Monitoring configurations for the persistent application UI.
   *
   * Default: true
   */
  public fun persistentAppUI(): Boolean? = unwrap(this).getPersistentAppUI()

  /**
   * A builder for [Monitoring]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logBucket Amazon S3 Bucket for monitoring log publishing.
     * You can configure your jobs to send log information to Amazon S3.
     */
    public fun logBucket(logBucket: IBucket)

    /**
     * @param logGroup A log group for CloudWatch monitoring.
     * You can configure your jobs to send log information to CloudWatch Logs.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logStreamNamePrefix A log stream name prefix for Cloudwatch monitoring.
     */
    public fun logStreamNamePrefix(logStreamNamePrefix: String)

    /**
     * @param logging Enable logging for this job.
     * If set to true, will automatically create a Cloudwatch Log Group and S3 bucket.
     * This will be set to `true` implicitly if values are provided for `logGroup` or `logBucket`.
     */
    public fun logging(logging: Boolean)

    /**
     * @param persistentAppUi Monitoring configurations for the persistent application UI.
     */
    public fun persistentAppUi(persistentAppUi: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.Monitoring.builder()

    /**
     * @param logBucket Amazon S3 Bucket for monitoring log publishing.
     * You can configure your jobs to send log information to Amazon S3.
     */
    override fun logBucket(logBucket: IBucket) {
      cdkBuilder.logBucket(logBucket.let(IBucket::unwrap))
    }

    /**
     * @param logGroup A log group for CloudWatch monitoring.
     * You can configure your jobs to send log information to CloudWatch Logs.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logStreamNamePrefix A log stream name prefix for Cloudwatch monitoring.
     */
    override fun logStreamNamePrefix(logStreamNamePrefix: String) {
      cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
    }

    /**
     * @param logging Enable logging for this job.
     * If set to true, will automatically create a Cloudwatch Log Group and S3 bucket.
     * This will be set to `true` implicitly if values are provided for `logGroup` or `logBucket`.
     */
    override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    /**
     * @param persistentAppUi Monitoring configurations for the persistent application UI.
     */
    override fun persistentAppUi(persistentAppUi: Boolean) {
      cdkBuilder.persistentAppUi(persistentAppUi)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.Monitoring =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring,
  ) : CdkObject(cdkObject), Monitoring {
    /**
     * Amazon S3 Bucket for monitoring log publishing.
     *
     * You can configure your jobs to send log information to Amazon S3.
     *
     * Default: - if `logging` is manually set to `true` and a `logBucket` is not provided, a
     * `logBucket` will be automatically generated`.
     */
    override fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

    /**
     * A log group for CloudWatch monitoring.
     *
     * You can configure your jobs to send log information to CloudWatch Logs.
     *
     * Default: - if `logging` is manually set to `true` and a `logGroup` is not provided, a
     * `logGroup` will be automatically generated`.
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * A log stream name prefix for Cloudwatch monitoring.
     *
     * Default: - Log streams created in this log group have no default prefix
     */
    override fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

    /**
     * Enable logging for this job.
     *
     * If set to true, will automatically create a Cloudwatch Log Group and S3 bucket.
     * This will be set to `true` implicitly if values are provided for `logGroup` or `logBucket`.
     *
     * Default: true - true if values are provided for `logGroup` or `logBucket`, false otherwise
     */
    override fun logging(): Boolean? = unwrap(this).getLogging()

    /**
     * Monitoring configurations for the persistent application UI.
     *
     * Default: true
     */
    override fun persistentAppUI(): Boolean? = unwrap(this).getPersistentAppUI()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Monitoring {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring):
        Monitoring = CdkObjectWrappers.wrap(cdkObject) as? Monitoring ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Monitoring):
        software.amazon.awscdk.services.stepfunctions.tasks.Monitoring = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
  }
}
