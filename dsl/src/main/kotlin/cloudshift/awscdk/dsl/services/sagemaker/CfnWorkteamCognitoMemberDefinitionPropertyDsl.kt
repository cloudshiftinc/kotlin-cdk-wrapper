@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@CdkDslMarker
public class CfnWorkteamCognitoMemberDefinitionPropertyDsl {
  private val cdkBuilder: CfnWorkteam.CognitoMemberDefinitionProperty.Builder =
      CfnWorkteam.CognitoMemberDefinitionProperty.builder()

  /**
   * @param cognitoClientId An identifier for an application client. 
   * You must create the app client ID using Amazon Cognito.
   */
  public fun cognitoClientId(cognitoClientId: String) {
    cdkBuilder.cognitoClientId(cognitoClientId)
  }

  /**
   * @param cognitoUserGroup An identifier for a user group. 
   */
  public fun cognitoUserGroup(cognitoUserGroup: String) {
    cdkBuilder.cognitoUserGroup(cognitoUserGroup)
  }

  /**
   * @param cognitoUserPool An identifier for a user pool. 
   * The user pool must be in the same region as the service that you are calling.
   */
  public fun cognitoUserPool(cognitoUserPool: String) {
    cdkBuilder.cognitoUserPool(cognitoUserPool)
  }

  public fun build(): CfnWorkteam.CognitoMemberDefinitionProperty = cdkBuilder.build()
}
