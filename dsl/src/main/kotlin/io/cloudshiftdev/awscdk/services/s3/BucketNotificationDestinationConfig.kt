package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BucketNotificationDestinationConfig {
  public fun arn(): String

  public fun dependencies(): List<IDependable> =
      unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

  public fun type(): BucketNotificationDestinationType

  public interface Builder {
    public fun arn(arn: String) {
    }

    public fun dependencies(dependencies: List<IDependable>) {
    }

    public fun type(type: BucketNotificationDestinationType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.Builder =
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.builder()

    public override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    public override fun dependencies(dependencies: List<IDependable>) {
      cdkBuilder.dependencies(dependencies.map(IDependable::unwrap))
    }

    public override fun type(type: BucketNotificationDestinationType) {
      cdkBuilder.type(type.let(BucketNotificationDestinationType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig,
  ) : BucketNotificationDestinationConfig {
    public override fun arn(): String = unwrap(this).getArn()

    public override fun dependencies(): List<IDependable> =
        unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

    public override fun type(): BucketNotificationDestinationType =
        unwrap(this).getType().let(BucketNotificationDestinationType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        BucketNotificationDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig):
        BucketNotificationDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketNotificationDestinationConfig):
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
