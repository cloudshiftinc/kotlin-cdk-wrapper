@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps

@CdkDslMarker
public class CfnWorkteamPropsDsl {
  private val cdkBuilder: CfnWorkteamProps.Builder = CfnWorkteamProps.builder()

  private val _memberDefinitions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the work team.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
   * identify the workers that make up the work team.
   * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
   * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
   * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
   */
  public fun memberDefinitions(vararg memberDefinitions: Any) {
    _memberDefinitions.addAll(listOf(*memberDefinitions))
  }

  /**
   * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
   * identify the workers that make up the work team.
   * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
   * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
   * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
   */
  public fun memberDefinitions(memberDefinitions: Collection<Any>) {
    _memberDefinitions.addAll(memberDefinitions)
  }

  /**
   * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
   * identify the workers that make up the work team.
   * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
   * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
   * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
   */
  public fun memberDefinitions(memberDefinitions: IResolvable) {
    cdkBuilder.memberDefinitions(memberDefinitions)
  }

  /**
   * @param notificationConfiguration Configures SNS notifications of available or expiring work
   * items for work teams.
   */
  public fun notificationConfiguration(notificationConfiguration: IResolvable) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  /**
   * @param notificationConfiguration Configures SNS notifications of available or expiring work
   * items for work teams.
   */
  public
      fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  /**
   * @param tags An array of key-value pairs.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param workforceName the value to be set.
   */
  public fun workforceName(workforceName: String) {
    cdkBuilder.workforceName(workforceName)
  }

  /**
   * @param workteamName The name of the work team.
   */
  public fun workteamName(workteamName: String) {
    cdkBuilder.workteamName(workteamName)
  }

  public fun build(): CfnWorkteamProps {
    if(_memberDefinitions.isNotEmpty()) cdkBuilder.memberDefinitions(_memberDefinitions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
