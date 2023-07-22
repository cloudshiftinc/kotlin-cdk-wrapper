@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolDeviceConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPool.DeviceConfigurationProperty.Builder =
      CfnUserPool.DeviceConfigurationProperty.builder()

  /**
   * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
   * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
   * authentication (MFA).
   *
   * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that have
   * not been confirmed or remembered must still provide a second factor in a user pool that requires
   * MFA.
   */
  public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
    cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
  }

  /**
   * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
   * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
   * authentication (MFA).
   *
   * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that have
   * not been confirmed or remembered must still provide a second factor in a user pool that requires
   * MFA.
   */
  public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
    cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
  }

  /**
   * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
   * remember a user's device when your app sends a
   * [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
   * API request. In your app, create a prompt for your user to choose whether they want to remember
   * their device. Return the user's choice in an
   * [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
   * API request.
   * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
   * devices that you register in a `ConfirmDevice` API request.
   */
  public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
    cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
  }

  /**
   * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
   * remember a user's device when your app sends a
   * [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
   * API request. In your app, create a prompt for your user to choose whether they want to remember
   * their device. Return the user's choice in an
   * [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
   * API request.
   * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
   * devices that you register in a `ConfirmDevice` API request.
   */
  public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable) {
    cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
  }

  public fun build(): CfnUserPool.DeviceConfigurationProperty = cdkBuilder.build()
}
