@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@CdkDslMarker
public class CfnWorkteamMemberDefinitionPropertyDsl {
  private val cdkBuilder: CfnWorkteam.MemberDefinitionProperty.Builder =
      CfnWorkteam.MemberDefinitionProperty.builder()

  public fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable) {
    cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition)
  }

  public
      fun cognitoMemberDefinition(cognitoMemberDefinition: CfnWorkteam.CognitoMemberDefinitionProperty) {
    cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition)
  }

  public fun oidcMemberDefinition(oidcMemberDefinition: IResolvable) {
    cdkBuilder.oidcMemberDefinition(oidcMemberDefinition)
  }

  public fun oidcMemberDefinition(oidcMemberDefinition: CfnWorkteam.OidcMemberDefinitionProperty) {
    cdkBuilder.oidcMemberDefinition(oidcMemberDefinition)
  }

  public fun build(): CfnWorkteam.MemberDefinitionProperty = cdkBuilder.build()
}
