@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

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
