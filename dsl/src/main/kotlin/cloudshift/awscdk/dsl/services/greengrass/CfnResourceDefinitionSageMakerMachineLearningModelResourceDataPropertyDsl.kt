@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionSageMakerMachineLearningModelResourceDataPropertyDsl {
  private val cdkBuilder:
      CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.Builder =
      CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.builder()

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

  public fun sageMakerJobArn(sageMakerJobArn: String) {
    cdkBuilder.sageMakerJobArn(sageMakerJobArn)
  }

  public fun build(): CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty =
      cdkBuilder.build()
}
