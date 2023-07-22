@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl {
  private val cdkBuilder:
      CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder =
      CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.builder()

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
   * @param s3Uri The URI of the source model in an Amazon S3 bucket. 
   * The model package must be in `tar.gz` or `.zip` format.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty =
      cdkBuilder.build()
}
