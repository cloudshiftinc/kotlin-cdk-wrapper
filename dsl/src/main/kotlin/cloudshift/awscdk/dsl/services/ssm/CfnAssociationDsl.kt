@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAssociation.Builder = CfnAssociation.Builder.create(scope, id)

  private val _calendarNames: MutableList<String> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
    cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
  }

  public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
    cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
  }

  public fun associationName(associationName: String) {
    cdkBuilder.associationName(associationName)
  }

  public fun automationTargetParameterName(automationTargetParameterName: String) {
    cdkBuilder.automationTargetParameterName(automationTargetParameterName)
  }

  public fun calendarNames(vararg calendarNames: String) {
    _calendarNames.addAll(listOf(*calendarNames))
  }

  public fun calendarNames(calendarNames: Collection<String>) {
    _calendarNames.addAll(calendarNames)
  }

  public fun complianceSeverity(complianceSeverity: String) {
    cdkBuilder.complianceSeverity(complianceSeverity)
  }

  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun maxConcurrency(maxConcurrency: String) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  public fun maxErrors(maxErrors: String) {
    cdkBuilder.maxErrors(maxErrors)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outputLocation(outputLocation: IResolvable) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public
      fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  public fun syncCompliance(syncCompliance: String) {
    cdkBuilder.syncCompliance(syncCompliance)
  }

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
    cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
  }

  public fun build(): CfnAssociation {
    if(_calendarNames.isNotEmpty()) cdkBuilder.calendarNames(_calendarNames)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
