@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder =
      CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.builder()

  public fun groupOwner(groupOwner: String) {
    cdkBuilder.groupOwner(groupOwner)
  }

  public fun groupPermission(groupPermission: String) {
    cdkBuilder.groupPermission(groupPermission)
  }

  public fun build(): CfnResourceDefinition.ResourceDownloadOwnerSettingProperty =
      cdkBuilder.build()
}
