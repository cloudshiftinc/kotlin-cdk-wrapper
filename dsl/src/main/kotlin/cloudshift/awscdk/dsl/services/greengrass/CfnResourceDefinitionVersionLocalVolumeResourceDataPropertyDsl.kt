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

  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  public
      fun groupOwnerSetting(groupOwnerSetting: CfnResourceDefinitionVersion.GroupOwnerSettingProperty) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty =
      cdkBuilder.build()
}
