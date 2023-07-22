@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelStaticKeySettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.StaticKeySettingsProperty.Builder =
      CfnChannel.StaticKeySettingsProperty.builder()

  /**
   * @param keyProviderServer The URL of the license server that is used for protecting content.
   */
  public fun keyProviderServer(keyProviderServer: IResolvable) {
    cdkBuilder.keyProviderServer(keyProviderServer)
  }

  /**
   * @param keyProviderServer The URL of the license server that is used for protecting content.
   */
  public fun keyProviderServer(keyProviderServer: CfnChannel.InputLocationProperty) {
    cdkBuilder.keyProviderServer(keyProviderServer)
  }

  /**
   * @param staticKeyValue The static key value as a 32 character hexadecimal string.
   */
  public fun staticKeyValue(staticKeyValue: String) {
    cdkBuilder.staticKeyValue(staticKeyValue)
  }

  public fun build(): CfnChannel.StaticKeySettingsProperty = cdkBuilder.build()
}
