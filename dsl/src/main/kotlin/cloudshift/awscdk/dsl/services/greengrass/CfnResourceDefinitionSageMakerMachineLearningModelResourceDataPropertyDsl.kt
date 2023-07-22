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
      fun ownerSetting(ownerSetting: CfnResourceDefinition.ResourceDownloadOwnerSettingProperty) {
    cdkBuilder.ownerSetting(ownerSetting)
  }

  /**
   * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job that
   * represents the source model. 
   */
  public fun sageMakerJobArn(sageMakerJobArn: String) {
    cdkBuilder.sageMakerJobArn(sageMakerJobArn)
  }

  public fun build(): CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty =
      cdkBuilder.build()
}
