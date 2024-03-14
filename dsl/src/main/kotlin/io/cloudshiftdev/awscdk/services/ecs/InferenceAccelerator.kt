package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface InferenceAccelerator {
  /**
   * The Elastic Inference accelerator device name.
   *
   * Default: - empty
   */
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * The Elastic Inference accelerator type to use.
   *
   * The allowed values are: eia2.medium, eia2.large and eia2.xlarge.
   *
   * Default: - empty
   */
  public fun deviceType(): String? = unwrap(this).getDeviceType()

  /**
   * A builder for [InferenceAccelerator]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceName The Elastic Inference accelerator device name.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param deviceType The Elastic Inference accelerator type to use.
     * The allowed values are: eia2.medium, eia2.large and eia2.xlarge.
     */
    public fun deviceType(deviceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.InferenceAccelerator.Builder =
        software.amazon.awscdk.services.ecs.InferenceAccelerator.builder()

    /**
     * @param deviceName The Elastic Inference accelerator device name.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param deviceType The Elastic Inference accelerator type to use.
     * The allowed values are: eia2.medium, eia2.large and eia2.xlarge.
     */
    override fun deviceType(deviceType: String) {
      cdkBuilder.deviceType(deviceType)
    }

    public fun build(): software.amazon.awscdk.services.ecs.InferenceAccelerator =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.InferenceAccelerator,
  ) : CdkObject(cdkObject), InferenceAccelerator {
    /**
     * The Elastic Inference accelerator device name.
     *
     * Default: - empty
     */
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * The Elastic Inference accelerator type to use.
     *
     * The allowed values are: eia2.medium, eia2.large and eia2.xlarge.
     *
     * Default: - empty
     */
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
