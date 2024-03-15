@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Flow Log Destination configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * LogGroup logGroup;
 * Role role;
 * FlowLogDestinationConfig flowLogDestinationConfig = FlowLogDestinationConfig.builder()
 * .logDestinationType(FlowLogDestinationType.CLOUD_WATCH_LOGS)
 * // the properties below are optional
 * .deliveryStreamArn("deliveryStreamArn")
 * .destinationOptions(DestinationOptions.builder()
 * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
 * .hiveCompatiblePartitions(false)
 * .perHourPartition(false)
 * .build())
 * .iamRole(role)
 * .keyPrefix("keyPrefix")
 * .logGroup(logGroup)
 * .s3Bucket(bucket)
 * .build();
 * ```
 */
public interface FlowLogDestinationConfig {
  /**
   * The ARN of Kinesis Data Firehose delivery stream to publish the flow logs to.
   *
   * Default: - undefined
   */
  public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

  /**
   * Options for writing flow logs to a supported destination.
   *
   * Default: - undefined
   */
  public fun destinationOptions(): DestinationOptions? =
      unwrap(this).getDestinationOptions()?.let(DestinationOptions::wrap)

  /**
   * The IAM Role that has access to publish to CloudWatch logs.
   *
   * Default: - default IAM role is created for you
   */
  public fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

  /**
   * S3 bucket key prefix to publish the flow logs to.
   *
   * Default: - undefined
   */
  public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  /**
   * The type of destination to publish the flow logs to.
   *
   * Default: - CLOUD_WATCH_LOGS
   */
  public fun logDestinationType(): FlowLogDestinationType

  /**
   * The CloudWatch Logs Log Group to publish the flow logs to.
   *
   * Default: - default log group is created for you
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * S3 bucket to publish the flow logs to.
   *
   * Default: - undefined
   */
  public fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

  /**
   * A builder for [FlowLogDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryStreamArn The ARN of Kinesis Data Firehose delivery stream to publish the flow
     * logs to.
     */
    public fun deliveryStreamArn(deliveryStreamArn: String)

    /**
     * @param destinationOptions Options for writing flow logs to a supported destination.
     */
    public fun destinationOptions(destinationOptions: DestinationOptions)

    /**
     * @param destinationOptions Options for writing flow logs to a supported destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    public fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit)

    /**
     * @param iamRole The IAM Role that has access to publish to CloudWatch logs.
     */
    public fun iamRole(iamRole: IRole)

    /**
     * @param keyPrefix S3 bucket key prefix to publish the flow logs to.
     */
    public fun keyPrefix(keyPrefix: String)

    /**
     * @param logDestinationType The type of destination to publish the flow logs to. 
     */
    public fun logDestinationType(logDestinationType: FlowLogDestinationType)

    /**
     * @param logGroup The CloudWatch Logs Log Group to publish the flow logs to.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param s3Bucket S3 bucket to publish the flow logs to.
     */
    public fun s3Bucket(s3Bucket: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.Builder =
        software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.builder()

    /**
     * @param deliveryStreamArn The ARN of Kinesis Data Firehose delivery stream to publish the flow
     * logs to.
     */
    override fun deliveryStreamArn(deliveryStreamArn: String) {
      cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    /**
     * @param destinationOptions Options for writing flow logs to a supported destination.
     */
    override fun destinationOptions(destinationOptions: DestinationOptions) {
      cdkBuilder.destinationOptions(destinationOptions.let(DestinationOptions::unwrap))
    }

    /**
     * @param destinationOptions Options for writing flow logs to a supported destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    override fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit): Unit
        = destinationOptions(DestinationOptions(destinationOptions))

    /**
     * @param iamRole The IAM Role that has access to publish to CloudWatch logs.
     */
    override fun iamRole(iamRole: IRole) {
      cdkBuilder.iamRole(iamRole.let(IRole::unwrap))
    }

    /**
     * @param keyPrefix S3 bucket key prefix to publish the flow logs to.
     */
    override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    /**
     * @param logDestinationType The type of destination to publish the flow logs to. 
     */
    override fun logDestinationType(logDestinationType: FlowLogDestinationType) {
      cdkBuilder.logDestinationType(logDestinationType.let(FlowLogDestinationType::unwrap))
    }

    /**
     * @param logGroup The CloudWatch Logs Log Group to publish the flow logs to.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param s3Bucket S3 bucket to publish the flow logs to.
     */
    override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig,
  ) : CdkObject(cdkObject), FlowLogDestinationConfig {
    /**
     * The ARN of Kinesis Data Firehose delivery stream to publish the flow logs to.
     *
     * Default: - undefined
     */
    override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    /**
     * Options for writing flow logs to a supported destination.
     *
     * Default: - undefined
     */
    override fun destinationOptions(): DestinationOptions? =
        unwrap(this).getDestinationOptions()?.let(DestinationOptions::wrap)

    /**
     * The IAM Role that has access to publish to CloudWatch logs.
     *
     * Default: - default IAM role is created for you
     */
    override fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

    /**
     * S3 bucket key prefix to publish the flow logs to.
     *
     * Default: - undefined
     */
    override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * The type of destination to publish the flow logs to.
     *
     * Default: - CLOUD_WATCH_LOGS
     */
    override fun logDestinationType(): FlowLogDestinationType =
        unwrap(this).getLogDestinationType().let(FlowLogDestinationType::wrap)

    /**
     * The CloudWatch Logs Log Group to publish the flow logs to.
     *
     * Default: - default log group is created for you
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * S3 bucket to publish the flow logs to.
     *
     * Default: - undefined
     */
    override fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig):
        FlowLogDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogDestinationConfig):
        software.amazon.awscdk.services.ec2.FlowLogDestinationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.FlowLogDestinationConfig
  }
}
