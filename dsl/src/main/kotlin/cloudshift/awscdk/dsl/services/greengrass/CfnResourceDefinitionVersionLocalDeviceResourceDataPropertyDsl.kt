@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder =
      CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.builder()

  /**
   * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give to
   * the Lambda function process.
   */
  public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  /**
   * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give to
   * the Lambda function process.
   */
  public
      fun groupOwnerSetting(groupOwnerSetting: CfnResourceDefinitionVersion.GroupOwnerSettingProperty) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  /**
   * @param sourcePath The local absolute path of the device resource. 
   * The source path for a device resource can refer only to a character device or block device
   * under `/dev` .
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty =
      cdkBuilder.build()
}
