@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMsSmoothOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MsSmoothOutputSettingsProperty.Builder =
      CfnChannel.MsSmoothOutputSettingsProperty.builder()

  public fun h265PackagingType(h265PackagingType: String) {
    cdkBuilder.h265PackagingType(h265PackagingType)
  }

  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  public fun build(): CfnChannel.MsSmoothOutputSettingsProperty = cdkBuilder.build()
}
