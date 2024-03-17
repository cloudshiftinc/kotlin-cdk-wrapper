@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The destination type for the flow log.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * LogGroup logGroup = new LogGroup(this, "MyCustomLogGroup");
 * Role role = Role.Builder.create(this, "MyCustomRole")
 * .assumedBy(new ServicePrincipal("vpc-flow-logs.amazonaws.com"))
 * .build();
 * FlowLog.Builder.create(this, "FlowLog")
 * .resourceType(FlowLogResourceType.fromVpc(vpc))
 * .destination(FlowLogDestination.toCloudWatchLogs(logGroup, role))
 * .build();
 * ```
 */
public abstract class FlowLogDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestination,
) : CdkObject(cdkObject) {
  /**
   * Generates a flow log destination configuration.
   *
   * @param scope 
   * @param flowLog 
   */
  public open fun bind(scope: Construct, flowLog: FlowLog): FlowLogDestinationConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      flowLog.let(FlowLog::unwrap)).let(FlowLogDestinationConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestination,
  ) : FlowLogDestination(cdkObject)

  public companion object {
    public fun toCloudWatchLogs(): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toCloudWatchLogs().let(FlowLogDestination::wrap)

    public fun toCloudWatchLogs(logGroup: ILogGroup): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toCloudWatchLogs(logGroup.let(ILogGroup::unwrap)).let(FlowLogDestination::wrap)

    public fun toCloudWatchLogs(logGroup: ILogGroup, iamRole: IRole): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toCloudWatchLogs(logGroup.let(ILogGroup::unwrap),
        iamRole.let(IRole::unwrap)).let(FlowLogDestination::wrap)

    public fun toKinesisDataFirehoseDestination(deliveryStreamArn: String): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toKinesisDataFirehoseDestination(deliveryStreamArn).let(FlowLogDestination::wrap)

    public fun toS3(): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toS3().let(FlowLogDestination::wrap)

    public fun toS3(bucket: IBucket): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toS3(bucket.let(IBucket::unwrap)).let(FlowLogDestination::wrap)

    public fun toS3(bucket: IBucket, keyPrefix: String): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toS3(bucket.let(IBucket::unwrap),
        keyPrefix).let(FlowLogDestination::wrap)

    public fun toS3(
      bucket: IBucket,
      keyPrefix: String,
      options: S3DestinationOptions,
    ): FlowLogDestination =
        software.amazon.awscdk.services.ec2.FlowLogDestination.toS3(bucket.let(IBucket::unwrap),
        keyPrefix, options.let(S3DestinationOptions::unwrap)).let(FlowLogDestination::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69da5a41e3236503effbe0827193df601789cf0de6500d681257d51ba7c16be2")
    public fun toS3(
      bucket: IBucket,
      keyPrefix: String,
      options: S3DestinationOptions.Builder.() -> Unit,
    ): FlowLogDestination = toS3(bucket, keyPrefix, S3DestinationOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestination):
        FlowLogDestination = CdkObjectWrappers.wrap(cdkObject) as? FlowLogDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogDestination):
        software.amazon.awscdk.services.ec2.FlowLogDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.FlowLogDestination
  }
}
