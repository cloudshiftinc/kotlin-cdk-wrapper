@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelKeyProviderSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.KeyProviderSettingsProperty.Builder =
      CfnChannel.KeyProviderSettingsProperty.builder()

  public fun staticKeySettings(staticKeySettings: IResolvable) {
    cdkBuilder.staticKeySettings(staticKeySettings)
  }

  public fun staticKeySettings(staticKeySettings: CfnChannel.StaticKeySettingsProperty) {
    cdkBuilder.staticKeySettings(staticKeySettings)
  }

  public fun build(): CfnChannel.KeyProviderSettingsProperty = cdkBuilder.build()
}
