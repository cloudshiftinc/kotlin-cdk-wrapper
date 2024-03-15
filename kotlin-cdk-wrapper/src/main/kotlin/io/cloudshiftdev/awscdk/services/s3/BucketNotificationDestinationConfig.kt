@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BucketNotificationDestinationConfig {
  public fun arn(): String

  public fun dependencies(): List<IDependable> =
      unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

  public fun type(): BucketNotificationDestinationType

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun dependencies(dependencies: List<IDependable>)

    public fun dependencies(vararg dependencies: IDependable)

    public fun type(type: BucketNotificationDestinationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.Builder =
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun dependencies(dependencies: List<IDependable>) {
      cdkBuilder.dependencies(dependencies.map(IDependable::unwrap))
    }

    override fun dependencies(vararg dependencies: IDependable): Unit =
        dependencies(dependencies.toList())

    override fun type(type: BucketNotificationDestinationType) {
      cdkBuilder.type(type.let(BucketNotificationDestinationType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig,
  ) : CdkObject(cdkObject), BucketNotificationDestinationConfig {
    override fun arn(): String = unwrap(this).getArn()

    override fun dependencies(): List<IDependable> =
        unwrap(this).getDependencies()?.map(IDependable::wrap) ?: emptyList()

    override fun type(): BucketNotificationDestinationType =
        unwrap(this).getType().let(BucketNotificationDestinationType::wrap)
  }

  public companion object {
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
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
  }
}
