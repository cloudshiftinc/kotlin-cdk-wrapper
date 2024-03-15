@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.InstanceArchitecture
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

public open class BottleRocketImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun architecture(architecture: InstanceArchitecture)

    public fun cachedInContext(cachedInContext: Boolean)

    public fun variant(variant: BottlerocketEcsVariant)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BottleRocketImage.Builder =
        software.amazon.awscdk.services.ecs.BottleRocketImage.Builder.create()

    override fun architecture(architecture: InstanceArchitecture) {
      cdkBuilder.architecture(architecture.let(InstanceArchitecture::unwrap))
    }

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun variant(variant: BottlerocketEcsVariant) {
      cdkBuilder.variant(variant.let(BottlerocketEcsVariant::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.BottleRocketImage = cdkBuilder.build()
  }

  public companion object {
    public fun isBottleRocketImage(x: Any): Boolean =
        software.amazon.awscdk.services.ecs.BottleRocketImage.isBottleRocketImage(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): BottleRocketImage {
      val builderImpl = BuilderImpl()
      return BottleRocketImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BottleRocketImage):
        BottleRocketImage = BottleRocketImage(cdkObject)

    internal fun unwrap(wrapped: BottleRocketImage):
        software.amazon.awscdk.services.ecs.BottleRocketImage = wrapped.cdkObject
  }
}
