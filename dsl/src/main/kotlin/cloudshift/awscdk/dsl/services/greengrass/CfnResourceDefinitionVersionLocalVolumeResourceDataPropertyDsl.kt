@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder =
      CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.builder()

  /**
   * @param destinationPath The absolute local path of the resource in the Lambda environment. 
   */
  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

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
   * @param sourcePath The local absolute path of the volume resource on the host. 
   * The source path for a volume resource type cannot start with `/sys` .
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty =
      cdkBuilder.build()
}
