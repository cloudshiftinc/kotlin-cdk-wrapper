@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@CdkDslMarker
public class CfnGraphQLApiCognitoUserPoolConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder =
      CfnGraphQLApi.CognitoUserPoolConfigProperty.builder()

  /**
   * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito user
   * pool app client ID.
   * If this value isn't set, no filtering is applied.
   */
  public fun appIdClientRegex(appIdClientRegex: String) {
    cdkBuilder.appIdClientRegex(appIdClientRegex)
  }

  /**
   * @param awsRegion The AWS Region in which the user pool was created.
   */
  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  /**
   * @param userPoolId The user pool ID.
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnGraphQLApi.CognitoUserPoolConfigProperty = cdkBuilder.build()
}
