package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface DeviceTracking {
  public fun challengeRequiredOnNewDevice(): Boolean

  public fun deviceOnlyRememberedOnUserPrompt(): Boolean

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking,
  ) : DeviceTracking {
    override fun challengeRequiredOnNewDevice(): Boolean =
        unwrap(this).getChallengeRequiredOnNewDevice()

    override fun deviceOnlyRememberedOnUserPrompt(): Boolean =
        unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DeviceTracking {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.DeviceTracking):
        DeviceTracking = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeviceTracking):
        software.amazon.awscdk.services.cognito.DeviceTracking = (wrapped as Wrapper).cdkObject
  }
}
