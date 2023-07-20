@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelDvbSubSourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.DvbSubSourceSettingsProperty.Builder =
      CfnChannel.DvbSubSourceSettingsProperty.builder()

  public fun ocrLanguage(ocrLanguage: String) {
    cdkBuilder.ocrLanguage(ocrLanguage)
  }

  public fun pid(pid: Number) {
    cdkBuilder.pid(pid)
  }

  public fun build(): CfnChannel.DvbSubSourceSettingsProperty = cdkBuilder.build()
}
