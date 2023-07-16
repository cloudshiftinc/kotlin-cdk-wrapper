@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionResourceDownloadOwnerSettingPropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.Builder
      = CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.builder()

  public fun groupOwner(groupOwner: String) {
    cdkBuilder.groupOwner(groupOwner)
  }

  public fun groupPermission(groupPermission: String) {
    cdkBuilder.groupPermission(groupPermission)
  }

  public fun build(): CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty =
      cdkBuilder.build()
}
