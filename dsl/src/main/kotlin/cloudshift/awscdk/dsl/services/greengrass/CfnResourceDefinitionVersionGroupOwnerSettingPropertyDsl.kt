@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.GroupOwnerSettingProperty.Builder =
      CfnResourceDefinitionVersion.GroupOwnerSettingProperty.builder()

  /**
   * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that owns
   * the resource to the Lambda process. 
   * This gives the Lambda process the file access permissions of the Linux group.
   */
  public fun autoAddGroupOwner(autoAddGroupOwner: Boolean) {
    cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
  }

  /**
   * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that owns
   * the resource to the Lambda process. 
   * This gives the Lambda process the file access permissions of the Linux group.
   */
  public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable) {
    cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
  }

  /**
   * @param groupOwner The name of the Linux group whose privileges you want to add to the Lambda
   * process.
   * This value is ignored if `AutoAddGroupOwner` is true.
   */
  public fun groupOwner(groupOwner: String) {
    cdkBuilder.groupOwner(groupOwner)
  }

  public fun build(): CfnResourceDefinitionVersion.GroupOwnerSettingProperty = cdkBuilder.build()
}
