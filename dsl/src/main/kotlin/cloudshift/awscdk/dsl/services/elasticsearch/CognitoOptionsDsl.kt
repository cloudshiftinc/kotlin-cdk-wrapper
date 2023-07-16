@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CognitoOptionsDsl {
  private val cdkBuilder: CognitoOptions.Builder = CognitoOptions.builder()

  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CognitoOptions = cdkBuilder.build()
}
