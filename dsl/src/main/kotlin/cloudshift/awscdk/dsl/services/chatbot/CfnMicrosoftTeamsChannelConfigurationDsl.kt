@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnMicrosoftTeamsChannelConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMicrosoftTeamsChannelConfiguration.Builder =
      CfnMicrosoftTeamsChannelConfiguration.Builder.create(scope, id)

  private val _guardrailPolicies: MutableList<String> = mutableListOf()

  private val _snsTopicArns: MutableList<String> = mutableListOf()

  public fun configurationName(configurationName: String) {
    cdkBuilder.configurationName(configurationName)
  }

  public fun guardrailPolicies(vararg guardrailPolicies: String) {
    _guardrailPolicies.addAll(listOf(*guardrailPolicies))
  }

  public fun guardrailPolicies(guardrailPolicies: Collection<String>) {
    _guardrailPolicies.addAll(guardrailPolicies)
  }

  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  public fun snsTopicArns(vararg snsTopicArns: String) {
    _snsTopicArns.addAll(listOf(*snsTopicArns))
  }

  public fun snsTopicArns(snsTopicArns: Collection<String>) {
    _snsTopicArns.addAll(snsTopicArns)
  }

  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  public fun teamsChannelId(teamsChannelId: String) {
    cdkBuilder.teamsChannelId(teamsChannelId)
  }

  public fun teamsTenantId(teamsTenantId: String) {
    cdkBuilder.teamsTenantId(teamsTenantId)
  }

  public fun userRoleRequired(userRoleRequired: Boolean) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  public fun userRoleRequired(userRoleRequired: IResolvable) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  public fun build(): CfnMicrosoftTeamsChannelConfiguration {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_snsTopicArns.isNotEmpty()) cdkBuilder.snsTopicArns(_snsTopicArns)
    return cdkBuilder.build()
  }
}
