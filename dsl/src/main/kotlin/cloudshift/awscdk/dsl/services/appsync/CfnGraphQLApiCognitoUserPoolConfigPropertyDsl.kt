@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@CdkDslMarker
public class CfnGraphQLApiCognitoUserPoolConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder =
      CfnGraphQLApi.CognitoUserPoolConfigProperty.builder()

  public fun appIdClientRegex(appIdClientRegex: String) {
    cdkBuilder.appIdClientRegex(appIdClientRegex)
  }

  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnGraphQLApi.CognitoUserPoolConfigProperty = cdkBuilder.build()
}
