@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

/**
 * Defines an Amazon Cognito or your own OIDC IdP user group that is part of a work team.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MemberDefinitionProperty memberDefinitionProperty = MemberDefinitionProperty.builder()
 * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
 * .cognitoClientId("cognitoClientId")
 * .cognitoUserGroup("cognitoUserGroup")
 * .cognitoUserPool("cognitoUserPool")
 * .build())
 * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
 * .oidcGroups(List.of("oidcGroups"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html)
 */
@CdkDslMarker
public class CfnWorkteamMemberDefinitionPropertyDsl {
  private val cdkBuilder: CfnWorkteam.MemberDefinitionProperty.Builder =
      CfnWorkteam.MemberDefinitionProperty.builder()

  /**
   * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
   */
  public fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable) {
    cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition)
  }

  /**
   * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
   */
  public
      fun cognitoMemberDefinition(cognitoMemberDefinition: CfnWorkteam.CognitoMemberDefinitionProperty) {
    cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition)
  }

  /**
   * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider (IdP).
   * One to ten groups can be used to create a single private work team. When you add a user group
   * to the list of `Groups` , you can add that user group to one or more private work teams. If you
   * add a user group to a private work team, all workers in that user group are added to the work
   * team.
   */
  public fun oidcMemberDefinition(oidcMemberDefinition: IResolvable) {
    cdkBuilder.oidcMemberDefinition(oidcMemberDefinition)
  }

  /**
   * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider (IdP).
   * One to ten groups can be used to create a single private work team. When you add a user group
   * to the list of `Groups` , you can add that user group to one or more private work teams. If you
   * add a user group to a private work team, all workers in that user group are added to the work
   * team.
   */
  public fun oidcMemberDefinition(oidcMemberDefinition: CfnWorkteam.OidcMemberDefinitionProperty) {
    cdkBuilder.oidcMemberDefinition(oidcMemberDefinition)
  }

  public fun build(): CfnWorkteam.MemberDefinitionProperty = cdkBuilder.build()
}
