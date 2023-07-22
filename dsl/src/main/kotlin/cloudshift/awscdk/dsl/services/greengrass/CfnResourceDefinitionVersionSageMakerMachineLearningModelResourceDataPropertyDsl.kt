@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl {
  private val cdkBuilder:
      CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder =
      CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.builder()

  /**
   * @param destinationPath The absolute local path of the resource inside the Lambda environment. 
   */
  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  /**
   * @param ownerSetting The owner setting for the downloaded machine learning resource.
   * For more information, see [Access Machine Learning Resources from Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-ml-resources.html)
   * in the *Developer Guide* .
   */
  public fun ownerSetting(ownerSetting: IResolvable) {
    cdkBuilder.ownerSetting(ownerSetting)
  }

  /**
   * @param ownerSetting The owner setting for the downloaded machine learning resource.
   * For more information, see [Access Machine Learning Resources from Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-ml-resources.html)
   * in the *Developer Guide* .
   */
  public
      fun ownerSetting(ownerSetting: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty) {
    cdkBuilder.ownerSetting(ownerSetting)
  }

  /**
   * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job that
   * represents the source model. 
   */
  public fun sageMakerJobArn(sageMakerJobArn: String) {
    cdkBuilder.sageMakerJobArn(sageMakerJobArn)
  }

  public fun build(): CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
      = cdkBuilder.build()
}
