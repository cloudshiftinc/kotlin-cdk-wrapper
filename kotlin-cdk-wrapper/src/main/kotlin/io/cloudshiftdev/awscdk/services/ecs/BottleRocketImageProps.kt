@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceArchitecture
import kotlin.Boolean
import kotlin.Unit

public interface BottleRocketImageProps {
  public fun architecture(): InstanceArchitecture? =
      unwrap(this).getArchitecture()?.let(InstanceArchitecture::wrap)

  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  public fun variant(): BottlerocketEcsVariant? =
      unwrap(this).getVariant()?.let(BottlerocketEcsVariant::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun architecture(architecture: InstanceArchitecture)

    public fun cachedInContext(cachedInContext: Boolean)

    public fun variant(variant: BottlerocketEcsVariant)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BottleRocketImageProps.Builder =
        software.amazon.awscdk.services.ecs.BottleRocketImageProps.builder()

    override fun architecture(architecture: InstanceArchitecture) {
      cdkBuilder.architecture(architecture.let(InstanceArchitecture::unwrap))
    }

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun variant(variant: BottlerocketEcsVariant) {
      cdkBuilder.variant(variant.let(BottlerocketEcsVariant::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.BottleRocketImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImageProps,
  ) : CdkObject(cdkObject), BottleRocketImageProps {
    override fun architecture(): InstanceArchitecture? =
        unwrap(this).getArchitecture()?.let(InstanceArchitecture::wrap)

    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun variant(): BottlerocketEcsVariant? =
        unwrap(this).getVariant()?.let(BottlerocketEcsVariant::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BottleRocketImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImageProps):
        BottleRocketImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BottleRocketImageProps):
        software.amazon.awscdk.services.ecs.BottleRocketImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.BottleRocketImageProps
  }
}
