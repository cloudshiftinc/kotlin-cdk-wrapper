@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder =
      CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.builder()

  /**
   * @param groupOwner The group owner of the machine learning resource. 
   * This is the group ID (GID) of an existing Linux OS group on the system. The group's permissions
   * are added to the Lambda process.
   */
  public fun groupOwner(groupOwner: String) {
    cdkBuilder.groupOwner(groupOwner)
  }

  /**
   * @param groupPermission The permissions that the group owner has to the machine learning
   * resource. 
   * Valid values are `rw` (read-write) or `ro` (read-only).
   */
  public fun groupPermission(groupPermission: String) {
    cdkBuilder.groupPermission(groupPermission)
  }

  public fun build(): CfnResourceDefinition.ResourceDownloadOwnerSettingProperty =
      cdkBuilder.build()
}
