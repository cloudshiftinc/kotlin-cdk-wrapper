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

  @Deprecated(message = "deprecated in CDK")
  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CognitoOptions = cdkBuilder.build()
}
