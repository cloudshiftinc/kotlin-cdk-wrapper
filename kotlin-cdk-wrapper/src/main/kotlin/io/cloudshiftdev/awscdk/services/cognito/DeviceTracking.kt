@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface DeviceTracking {
  public fun challengeRequiredOnNewDevice(): Boolean

  public fun deviceOnlyRememberedOnUserPrompt(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean)

    public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.DeviceTracking.Builder =
        software.amazon.awscdk.services.cognito.DeviceTracking.builder()

    override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
      cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
    }

    override fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
      cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
    }

    public fun build(): software.amazon.awscdk.services.cognito.DeviceTracking = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking,
  ) : CdkObject(cdkObject), DeviceTracking {
    override fun challengeRequiredOnNewDevice(): Boolean =
        unwrap(this).getChallengeRequiredOnNewDevice()

    override fun deviceOnlyRememberedOnUserPrompt(): Boolean =
        unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeviceTracking {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking):
        DeviceTracking = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeviceTracking):
        software.amazon.awscdk.services.cognito.DeviceTracking = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.DeviceTracking
  }
}
