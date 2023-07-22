@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible
 * from your Amazon Virtual Private Cloud (VPC).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
 * .repositoryAccessMode("repositoryAccessMode")
 * // the properties below are optional
 * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
 * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html)
 */
@CdkDslMarker
public class CfnModelImageConfigPropertyDsl {
  private val cdkBuilder: CfnModel.ImageConfigProperty.Builder =
      CfnModel.ImageConfigProperty.builder()

  /**
   * @param repositoryAccessMode Set this to one of the following values:. 
   * * `Platform` - The model image is hosted in Amazon ECR.
   * * `Vpc` - The model image is hosted in a private Docker registry in your VPC.
   */
  public fun repositoryAccessMode(repositoryAccessMode: String) {
    cdkBuilder.repositoryAccessMode(repositoryAccessMode)
  }

  /**
   * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
   * private docker registry where your model image is hosted.
   * Specify a value for this property only if you specified `Vpc` as the value for the
   * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
   * requires authentication.
   */
  public fun repositoryAuthConfig(repositoryAuthConfig: IResolvable) {
    cdkBuilder.repositoryAuthConfig(repositoryAuthConfig)
  }

  /**
   * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
   * private docker registry where your model image is hosted.
   * Specify a value for this property only if you specified `Vpc` as the value for the
   * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
   * requires authentication.
   */
  public fun repositoryAuthConfig(repositoryAuthConfig: CfnModel.RepositoryAuthConfigProperty) {
    cdkBuilder.repositoryAuthConfig(repositoryAuthConfig)
  }

  public fun build(): CfnModel.ImageConfigProperty = cdkBuilder.build()
}
