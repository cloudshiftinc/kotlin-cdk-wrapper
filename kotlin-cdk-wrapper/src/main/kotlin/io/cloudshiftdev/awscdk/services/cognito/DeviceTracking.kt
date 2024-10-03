@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Device tracking settings.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .deviceTracking(DeviceTracking.builder()
 * .challengeRequiredOnNewDevice(true)
 * .deviceOnlyRememberedOnUserPrompt(true)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
 */
public interface DeviceTracking {
  /**
   * Indicates whether a challenge is required on a new device.
   *
   * Only applicable to a new device.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
   */
  public fun challengeRequiredOnNewDevice(): Boolean

  /**
   * If true, a device is only remembered on user prompt.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
   */
  public fun deviceOnlyRememberedOnUserPrompt(): Boolean

  /**
   * A builder for [DeviceTracking]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param challengeRequiredOnNewDevice Indicates whether a challenge is required on a new
     * device. 
     * Only applicable to a new device.
     */
    public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean)

    /**
     * @param deviceOnlyRememberedOnUserPrompt If true, a device is only remembered on user prompt. 
     */
    public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.DeviceTracking.Builder =
        software.amazon.awscdk.services.cognito.DeviceTracking.builder()

    /**
     * @param challengeRequiredOnNewDevice Indicates whether a challenge is required on a new
     * device. 
     * Only applicable to a new device.
     */
    override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
      cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
    }

    /**
     * @param deviceOnlyRememberedOnUserPrompt If true, a device is only remembered on user prompt. 
     */
    override fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
      cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
    }

    public fun build(): software.amazon.awscdk.services.cognito.DeviceTracking = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking,
  ) : CdkObject(cdkObject),
      DeviceTracking {
    /**
     * Indicates whether a challenge is required on a new device.
     *
     * Only applicable to a new device.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     */
    override fun challengeRequiredOnNewDevice(): Boolean =
        unwrap(this).getChallengeRequiredOnNewDevice()

    /**
     * If true, a device is only remembered on user prompt.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     */
    override fun deviceOnlyRememberedOnUserPrompt(): Boolean =
        unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeviceTracking {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking):
        DeviceTracking = CdkObjectWrappers.wrap(cdkObject) as? DeviceTracking ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeviceTracking):
        software.amazon.awscdk.services.cognito.DeviceTracking = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.DeviceTracking
  }
}
