@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.LocalVolumeResourceDataProperty.Builder =
      CfnResourceDefinition.LocalVolumeResourceDataProperty.builder()

  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  public fun groupOwnerSetting(groupOwnerSetting: CfnResourceDefinition.GroupOwnerSettingProperty) {
    cdkBuilder.groupOwnerSetting(groupOwnerSetting)
  }

  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnResourceDefinition.LocalVolumeResourceDataProperty = cdkBuilder.build()
}
