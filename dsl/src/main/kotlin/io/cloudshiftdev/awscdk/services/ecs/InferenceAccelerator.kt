package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface InferenceAccelerator {
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  public fun deviceType(): String? = unwrap(this).getDeviceType()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.InferenceAccelerator,
  ) : InferenceAccelerator {
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    override fun deviceType(): String? = unwrap(this).getDeviceType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAccelerator {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.InferenceAccelerator):
        InferenceAccelerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InferenceAccelerator):
        software.amazon.awscdk.services.ecs.InferenceAccelerator = (wrapped as Wrapper).cdkObject
  }
}
