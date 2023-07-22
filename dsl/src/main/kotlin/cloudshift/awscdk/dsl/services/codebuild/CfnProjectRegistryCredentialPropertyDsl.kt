@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

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
