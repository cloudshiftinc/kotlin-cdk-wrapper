@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMediaPackageOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MediaPackageOutputSettingsProperty.Builder =
      CfnChannel.MediaPackageOutputSettingsProperty.builder()

  public fun build(): CfnChannel.MediaPackageOutputSettingsProperty = cdkBuilder.build()
}
