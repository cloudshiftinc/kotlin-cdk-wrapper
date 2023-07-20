@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl {
  private val cdkBuilder: CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.Builder =
      CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.builder()

  private val _relatedFindings: MutableList<Any> = mutableListOf()

  private val _types: MutableList<String> = mutableListOf()

  public fun confidence(confidence: Number) {
    cdkBuilder.confidence(confidence)
  }

  public fun criticality(criticality: Number) {
    cdkBuilder.criticality(criticality)
  }

  public fun note(note: IResolvable) {
    cdkBuilder.note(note)
  }

  public fun note(note: CfnAutomationRule.NoteUpdateProperty) {
    cdkBuilder.note(note)
  }

  public fun relatedFindings(vararg relatedFindings: Any) {
    _relatedFindings.addAll(listOf(*relatedFindings))
  }

  public fun relatedFindings(relatedFindings: Collection<Any>) {
    _relatedFindings.addAll(relatedFindings)
  }

  public fun relatedFindings(relatedFindings: IResolvable) {
    cdkBuilder.relatedFindings(relatedFindings)
  }

  public fun severity(severity: IResolvable) {
    cdkBuilder.severity(severity)
  }

  public fun severity(severity: CfnAutomationRule.SeverityUpdateProperty) {
    cdkBuilder.severity(severity)
  }

  public fun types(vararg types: String) {
    _types.addAll(listOf(*types))
  }

  public fun types(types: Collection<String>) {
    _types.addAll(types)
  }

  public fun userDefinedFields(userDefinedFields: Map<String, String>) {
    cdkBuilder.userDefinedFields(userDefinedFields)
  }

  public fun userDefinedFields(userDefinedFields: IResolvable) {
    cdkBuilder.userDefinedFields(userDefinedFields)
  }

  public fun verificationState(verificationState: String) {
    cdkBuilder.verificationState(verificationState)
  }

  public fun workflow(workflow: IResolvable) {
    cdkBuilder.workflow(workflow)
  }

  public fun workflow(workflow: CfnAutomationRule.WorkflowUpdateProperty) {
    cdkBuilder.workflow(workflow)
  }

  public fun build(): CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty {
    if(_relatedFindings.isNotEmpty()) cdkBuilder.relatedFindings(_relatedFindings)
    if(_types.isNotEmpty()) cdkBuilder.types(_types)
    return cdkBuilder.build()
  }
}
