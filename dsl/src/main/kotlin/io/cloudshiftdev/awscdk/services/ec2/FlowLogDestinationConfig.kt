package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Suppress
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

  public interface Builder {
    public fun deliveryStreamArn(deliveryStreamArn: String) {
    }

    public fun destinationOptions(destinationOptions: DestinationOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    public fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit) {
    }

    public fun iamRole(iamRole: IRole) {
    }

    public fun keyPrefix(keyPrefix: String) {
    }

    public fun logDestinationType(logDestinationType: FlowLogDestinationType) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun s3Bucket(s3Bucket: IBucket) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.Builder =
        software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.builder()

    public override fun deliveryStreamArn(deliveryStreamArn: String) {
      cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    public override fun destinationOptions(destinationOptions: DestinationOptions) {
      cdkBuilder.destinationOptions(destinationOptions.let(DestinationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d09c7315047db96eb323140996abee62be981bb530359a8954e74ded966af4")
    public override
        fun destinationOptions(destinationOptions: DestinationOptions.Builder.() -> Unit): Unit =
        destinationOptions(DestinationOptions(destinationOptions))

    public override fun iamRole(iamRole: IRole) {
      cdkBuilder.iamRole(iamRole.let(IRole::unwrap))
    }

    public override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    public override fun logDestinationType(logDestinationType: FlowLogDestinationType) {
      cdkBuilder.logDestinationType(logDestinationType.let(FlowLogDestinationType::unwrap))
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig,
  ) : FlowLogDestinationConfig {
    public override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    public override fun destinationOptions(): DestinationOptions? =
        unwrap(this).getDestinationOptions()?.let(DestinationOptions::wrap)

    public override fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

    public override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    public override fun logDestinationType(): FlowLogDestinationType =
        unwrap(this).getLogDestinationType().let(FlowLogDestinationType::wrap)

    public override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    public override fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationConfig):
        FlowLogDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogDestinationConfig):
        software.amazon.awscdk.services.ec2.FlowLogDestinationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
