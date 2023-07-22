@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of key provider settings.
 *
 * The parent of this entity is HlsGroupSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * KeyProviderSettingsProperty keyProviderSettingsProperty = KeyProviderSettingsProperty.builder()
 * .staticKeySettings(StaticKeySettingsProperty.builder()
 * .keyProviderServer(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .staticKeyValue("staticKeyValue")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-keyprovidersettings.html)
 */
@CdkDslMarker
public class CfnChannelKeyProviderSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.KeyProviderSettingsProperty.Builder =
      CfnChannel.KeyProviderSettingsProperty.builder()

  /**
   * @param staticKeySettings The configuration of static key settings.
   */
  public fun staticKeySettings(staticKeySettings: IResolvable) {
    cdkBuilder.staticKeySettings(staticKeySettings)
  }

  /**
   * @param staticKeySettings The configuration of static key settings.
   */
  public fun staticKeySettings(staticKeySettings: CfnChannel.StaticKeySettingsProperty) {
    cdkBuilder.staticKeySettings(staticKeySettings)
  }

  public fun build(): CfnChannel.KeyProviderSettingsProperty = cdkBuilder.build()
}
