@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@CdkDslMarker
public class CfnWorkteamCognitoMemberDefinitionPropertyDsl {
  private val cdkBuilder: CfnWorkteam.CognitoMemberDefinitionProperty.Builder =
      CfnWorkteam.CognitoMemberDefinitionProperty.builder()

  public fun cognitoClientId(cognitoClientId: String) {
    cdkBuilder.cognitoClientId(cognitoClientId)
  }

  public fun cognitoUserGroup(cognitoUserGroup: String) {
    cdkBuilder.cognitoUserGroup(cognitoUserGroup)
  }

  public fun cognitoUserPool(cognitoUserPool: String) {
    cdkBuilder.cognitoUserPool(cognitoUserPool)
  }

  public fun build(): CfnWorkteam.CognitoMemberDefinitionProperty = cdkBuilder.build()
}
