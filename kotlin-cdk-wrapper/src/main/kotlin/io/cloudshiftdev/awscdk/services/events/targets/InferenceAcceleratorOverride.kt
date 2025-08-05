@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Override inference accelerators for the task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * InferenceAcceleratorOverride inferenceAcceleratorOverride =
 * InferenceAcceleratorOverride.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build();
 * ```
 */
public interface InferenceAcceleratorOverride {
  /**
   * The Elastic Inference accelerator device name to override for the task.
   *
   * This parameter must match a `deviceName` specified in the task definition.
   */
  public fun deviceName(): String

  /**
   * The Elastic Inference accelerator type to use.
   */
  public fun deviceType(): String

  /**
   * A builder for [InferenceAcceleratorOverride]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceName The Elastic Inference accelerator device name to override for the task. 
     * This parameter must match a `deviceName` specified in the task definition.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param deviceType The Elastic Inference accelerator type to use. 
     */
    public fun deviceType(deviceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride.Builder =
        software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride.builder()

    /**
     * @param deviceName The Elastic Inference accelerator device name to override for the task. 
     * This parameter must match a `deviceName` specified in the task definition.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param deviceType The Elastic Inference accelerator type to use. 
     */
    override fun deviceType(deviceType: String) {
      cdkBuilder.deviceType(deviceType)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride,
  ) : CdkObject(cdkObject),
      InferenceAcceleratorOverride {
    /**
     * The Elastic Inference accelerator device name to override for the task.
     *
     * This parameter must match a `deviceName` specified in the task definition.
     */
    override fun deviceName(): String = unwrap(this).getDeviceName()

    /**
     * The Elastic Inference accelerator type to use.
     */
    override fun deviceType(): String = unwrap(this).getDeviceType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAcceleratorOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride):
        InferenceAcceleratorOverride = CdkObjectWrappers.wrap(cdkObject) as?
        InferenceAcceleratorOverride ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InferenceAcceleratorOverride):
        software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.InferenceAcceleratorOverride
  }
}
