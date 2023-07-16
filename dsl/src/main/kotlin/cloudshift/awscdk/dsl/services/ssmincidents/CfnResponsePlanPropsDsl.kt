@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps

@CdkDslMarker
public class CfnResponsePlanPropsDsl {
  private val cdkBuilder: CfnResponsePlanProps.Builder = CfnResponsePlanProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _engagements: MutableList<String> = mutableListOf()

  private val _integrations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun chatChannel(chatChannel: IResolvable) {
    cdkBuilder.chatChannel(chatChannel)
  }

  public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty) {
    cdkBuilder.chatChannel(chatChannel)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun engagements(vararg engagements: String) {
    _engagements.addAll(listOf(*engagements))
  }

  public fun engagements(engagements: Collection<String>) {
    _engagements.addAll(engagements)
  }

  public fun incidentTemplate(incidentTemplate: IResolvable) {
    cdkBuilder.incidentTemplate(incidentTemplate)
  }

  public fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty) {
    cdkBuilder.incidentTemplate(incidentTemplate)
  }

  public fun integrations(vararg integrations: Any) {
    _integrations.addAll(listOf(*integrations))
  }

  public fun integrations(integrations: Collection<Any>) {
    _integrations.addAll(integrations)
  }

  public fun integrations(integrations: IResolvable) {
    cdkBuilder.integrations(integrations)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnResponsePlanProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_engagements.isNotEmpty()) cdkBuilder.engagements(_engagements)
    if(_integrations.isNotEmpty()) cdkBuilder.integrations(_integrations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
