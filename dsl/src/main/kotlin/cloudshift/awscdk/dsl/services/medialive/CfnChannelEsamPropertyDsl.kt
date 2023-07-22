@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * EsamProperty esamProperty = EsamProperty.builder()
 * .acquisitionPointId("acquisitionPointId")
 * .adAvailOffset(123)
 * .passwordParam("passwordParam")
 * .poisEndpoint("poisEndpoint")
 * .username("username")
 * .zoneIdentity("zoneIdentity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-esam.html)
 */
@CdkDslMarker
public class CfnChannelEsamPropertyDsl {
  private val cdkBuilder: CfnChannel.EsamProperty.Builder = CfnChannel.EsamProperty.builder()

  /**
   * @param acquisitionPointId the value to be set.
   */
  public fun acquisitionPointId(acquisitionPointId: String) {
    cdkBuilder.acquisitionPointId(acquisitionPointId)
  }

  /**
   * @param adAvailOffset the value to be set.
   */
  public fun adAvailOffset(adAvailOffset: Number) {
    cdkBuilder.adAvailOffset(adAvailOffset)
  }

  /**
   * @param passwordParam the value to be set.
   */
  public fun passwordParam(passwordParam: String) {
    cdkBuilder.passwordParam(passwordParam)
  }

  /**
   * @param poisEndpoint the value to be set.
   */
  public fun poisEndpoint(poisEndpoint: String) {
    cdkBuilder.poisEndpoint(poisEndpoint)
  }

  /**
   * @param username the value to be set.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  /**
   * @param zoneIdentity the value to be set.
   */
  public fun zoneIdentity(zoneIdentity: String) {
    cdkBuilder.zoneIdentity(zoneIdentity)
  }

  public fun build(): CfnChannel.EsamProperty = cdkBuilder.build()
}
