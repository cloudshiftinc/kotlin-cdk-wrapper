@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CognitoOptionsDsl {
  private val cdkBuilder: CognitoOptions.Builder = CognitoOptions.builder()

  /**
   * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon ES to use for
   * Kibana authentication. 
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  /**
   * @param role A role that allows Amazon ES to configure your user pool and identity pool. 
   * It must have the `AmazonESCognitoAccess` policy attached to it.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param userPoolId The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
   * authentication. 
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CognitoOptions = cdkBuilder.build()
}
