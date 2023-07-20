@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionS3MachineLearningModelResourceDataPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.Builder =
      CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.builder()

  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  public fun ownerSetting(ownerSetting: IResolvable) {
    cdkBuilder.ownerSetting(ownerSetting)
  }

  public
      fun ownerSetting(ownerSetting: CfnResourceDefinition.ResourceDownloadOwnerSettingProperty) {
    cdkBuilder.ownerSetting(ownerSetting)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnResourceDefinition.S3MachineLearningModelResourceDataProperty =
      cdkBuilder.build()
}
