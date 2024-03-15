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

public interface FlowLogDestinationConfig {
  public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

  public fun destinationOptions(): DestinationOptions? =
      unwrap(this).getDestinationOptions()?.let(DestinationOptions::wrap)

  public fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

  public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  public fun logDestinationType(): FlowLogDestinationType

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deliveryStreamArn(deliveryStreamArn: String)

    public fun destinationOptions(destinationOptions: DestinationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    public fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit)

    public fun iamRole(iamRole: IRole)

    public fun keyPrefix(keyPrefix: String)

    public fun logDestinationType(logDestinationType: FlowLogDestinationType)

    public fun logGroup(logGroup: ILogGroup)

    public fun s3Bucket(s3Bucket: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.Builder =
        software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.builder()

    override fun deliveryStreamArn(deliveryStreamArn: String) {
      cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    override fun destinationOptions(destinationOptions: DestinationOptions) {
      cdkBuilder.destinationOptions(destinationOptions.let(DestinationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    override fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit): Unit
        = destinationOptions(DestinationOptions(destinationOptions))

    override fun iamRole(iamRole: IRole) {
      cdkBuilder.iamRole(iamRole.let(IRole::unwrap))
    }

    override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    override fun logDestinationType(logDestinationType: FlowLogDestinationType) {
      cdkBuilder.logDestinationType(logDestinationType.let(FlowLogDestinationType::unwrap))
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig,
  ) : CdkObject(cdkObject), FlowLogDestinationConfig {
    override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    override fun destinationOptions(): DestinationOptions? =
        unwrap(this).getDestinationOptions()?.let(DestinationOptions::wrap)

    override fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

    override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    override fun logDestinationType(): FlowLogDestinationType =
        unwrap(this).getLogDestinationType().let(FlowLogDestinationType::wrap)

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

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
