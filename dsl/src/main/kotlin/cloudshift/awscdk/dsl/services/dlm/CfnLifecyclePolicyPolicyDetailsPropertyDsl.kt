@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyPolicyDetailsPropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.PolicyDetailsProperty.Builder =
      CfnLifecyclePolicy.PolicyDetailsProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _resourceLocations: MutableList<String> = mutableListOf()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  private val _schedules: MutableList<Any> = mutableListOf()

  private val _targetTags: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun eventSource(eventSource: IResolvable) {
    cdkBuilder.eventSource(eventSource)
  }

  public fun eventSource(eventSource: CfnLifecyclePolicy.EventSourceProperty) {
    cdkBuilder.eventSource(eventSource)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: CfnLifecyclePolicy.ParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  public fun policyType(policyType: String) {
    cdkBuilder.policyType(policyType)
  }

  public fun resourceLocations(vararg resourceLocations: String) {
    _resourceLocations.addAll(listOf(*resourceLocations))
  }

  public fun resourceLocations(resourceLocations: Collection<String>) {
    _resourceLocations.addAll(resourceLocations)
  }

  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  public fun schedules(vararg schedules: Any) {
    _schedules.addAll(listOf(*schedules))
  }

  public fun schedules(schedules: Collection<Any>) {
    _schedules.addAll(schedules)
  }

  public fun schedules(schedules: IResolvable) {
    cdkBuilder.schedules(schedules)
  }

  public fun targetTags(vararg targetTags: Any) {
    _targetTags.addAll(listOf(*targetTags))
  }

  public fun targetTags(targetTags: Collection<Any>) {
    _targetTags.addAll(targetTags)
  }

  public fun targetTags(targetTags: IResolvable) {
    cdkBuilder.targetTags(targetTags)
  }

  public fun build(): CfnLifecyclePolicy.PolicyDetailsProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_resourceLocations.isNotEmpty()) cdkBuilder.resourceLocations(_resourceLocations)
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    if(_schedules.isNotEmpty()) cdkBuilder.schedules(_schedules)
    if(_targetTags.isNotEmpty()) cdkBuilder.targetTags(_targetTags)
    return cdkBuilder.build()
  }
}
