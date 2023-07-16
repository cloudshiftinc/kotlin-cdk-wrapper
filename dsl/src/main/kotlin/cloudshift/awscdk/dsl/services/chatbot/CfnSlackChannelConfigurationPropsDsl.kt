@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps

@CdkDslMarker
public class CfnSlackChannelConfigurationPropsDsl {
  private val cdkBuilder: CfnSlackChannelConfigurationProps.Builder =
      CfnSlackChannelConfigurationProps.builder()

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

  public fun slackChannelId(slackChannelId: String) {
    cdkBuilder.slackChannelId(slackChannelId)
  }

  public fun slackWorkspaceId(slackWorkspaceId: String) {
    cdkBuilder.slackWorkspaceId(slackWorkspaceId)
  }

  public fun snsTopicArns(vararg snsTopicArns: String) {
    _snsTopicArns.addAll(listOf(*snsTopicArns))
  }

  public fun snsTopicArns(snsTopicArns: Collection<String>) {
    _snsTopicArns.addAll(snsTopicArns)
  }

  public fun userRoleRequired(userRoleRequired: Boolean) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  public fun userRoleRequired(userRoleRequired: IResolvable) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  public fun build(): CfnSlackChannelConfigurationProps {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_snsTopicArns.isNotEmpty()) cdkBuilder.snsTopicArns(_snsTopicArns)
    return cdkBuilder.build()
  }
}
