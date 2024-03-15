@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface InferenceAccelerator {
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  public fun deviceType(): String? = unwrap(this).getDeviceType()

  @CdkDslMarker
  public interface Builder {
    public fun deviceName(deviceName: String)

    public fun deviceType(deviceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.InferenceAccelerator.Builder =
        software.amazon.awscdk.services.ecs.InferenceAccelerator.builder()

    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    override fun deviceType(deviceType: String) {
      cdkBuilder.deviceType(deviceType)
    }

    public fun build(): software.amazon.awscdk.services.ecs.InferenceAccelerator =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.InferenceAccelerator,
  ) : CdkObject(cdkObject), InferenceAccelerator {
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    override fun deviceType(): String? = unwrap(this).getDeviceType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAccelerator {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.InferenceAccelerator):
        InferenceAccelerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InferenceAccelerator):
        software.amazon.awscdk.services.ecs.InferenceAccelerator = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.InferenceAccelerator
  }
}
