@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `RegistryCredential` is a property of the [AWS CodeBuild Project
 * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
 * property type that specifies information about credentials that provide access to a private Docker
 * registry. When this is set:.
 *
 * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
 * * images cannot be curated or an Amazon ECR image.
 *
 * For more information, see [Private Registry with AWS Secrets Manager Sample for AWS
 * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * RegistryCredentialProperty registryCredentialProperty = RegistryCredentialProperty.builder()
 * .credential("credential")
 * .credentialProvider("credentialProvider")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html)
 */
@CdkDslMarker
public class CfnProjectRegistryCredentialPropertyDsl {
  private val cdkBuilder: CfnProject.RegistryCredentialProperty.Builder =
      CfnProject.RegistryCredentialProperty.builder()

  /**
   * @param credential The Amazon Resource Name (ARN) or name of credentials created using AWS
   * Secrets Manager . 
   *
   * The `credential` can use the name of the credentials only if they exist in your current AWS
   * Region .
   */
  public fun credential(credential: String) {
    cdkBuilder.credential(credential)
  }

  /**
   * @param credentialProvider The service that created the credentials to access a private Docker
   * registry. 
   * The valid value, SECRETS_MANAGER, is for AWS Secrets Manager .
   */
  public fun credentialProvider(credentialProvider: String) {
    cdkBuilder.credentialProvider(credentialProvider)
  }

  public fun build(): CfnProject.RegistryCredentialProperty = cdkBuilder.build()
}
