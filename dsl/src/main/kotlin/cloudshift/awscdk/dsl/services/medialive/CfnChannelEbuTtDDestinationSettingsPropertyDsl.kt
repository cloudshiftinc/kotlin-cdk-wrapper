@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEbuTtDDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.EbuTtDDestinationSettingsProperty.Builder =
      CfnChannel.EbuTtDDestinationSettingsProperty.builder()

  public fun copyrightHolder(copyrightHolder: String) {
    cdkBuilder.copyrightHolder(copyrightHolder)
  }

  public fun fillLineGap(fillLineGap: String) {
    cdkBuilder.fillLineGap(fillLineGap)
  }

  public fun fontFamily(fontFamily: String) {
    cdkBuilder.fontFamily(fontFamily)
  }

  public fun styleControl(styleControl: String) {
    cdkBuilder.styleControl(styleControl)
  }

  public fun build(): CfnChannel.EbuTtDDestinationSettingsProperty = cdkBuilder.build()
}
