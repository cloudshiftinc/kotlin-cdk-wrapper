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

  /**
   * @param actions *[Event-based policies only]* The actions to be performed when the event-based
   * policy is activated.
   * You can specify only one action per policy.
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions *[Event-based policies only]* The actions to be performed when the event-based
   * policy is activated.
   * You can specify only one action per policy.
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions *[Event-based policies only]* The actions to be performed when the event-based
   * policy is activated.
   * You can specify only one action per policy.
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param eventSource *[Event-based policies only]* The event that activates the event-based
   * policy.
   */
  public fun eventSource(eventSource: IResolvable) {
    cdkBuilder.eventSource(eventSource)
  }

  /**
   * @param eventSource *[Event-based policies only]* The event that activates the event-based
   * policy.
   */
  public fun eventSource(eventSource: CfnLifecyclePolicy.EventSourceProperty) {
    cdkBuilder.eventSource(eventSource)
  }

  /**
   * @param parameters *[Snapshot and AMI policies only]* A set of optional parameters for snapshot
   * and AMI lifecycle policies.
   *
   * If you are modifying a policy that was created or previously modified using the Amazon Data
   * Lifecycle Manager console, then you must include this parameter and specify either the default
   * values or the new values that you require. You can't omit this parameter or set its values to
   * null.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters *[Snapshot and AMI policies only]* A set of optional parameters for snapshot
   * and AMI lifecycle policies.
   *
   * If you are modifying a policy that was created or previously modified using the Amazon Data
   * Lifecycle Manager console, then you must include this parameter and specify either the default
   * values or the new values that you require. You can't omit this parameter or set its values to
   * null.
   */
  public fun parameters(parameters: CfnLifecyclePolicy.ParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param policyType *[All policy types]* The valid target resource types and actions a policy can
   * manage.
   * Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of
   * Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the
   * lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that
   * performs specific actions when a defined event occurs in your AWS account .
   *
   * The default is `EBS_SNAPSHOT_MANAGEMENT` .
   */
  public fun policyType(policyType: String) {
    cdkBuilder.policyType(policyType)
  }

  /**
   * @param resourceLocations *[Snapshot and AMI policies only]* The location of the resources to
   * backup.
   * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
   * resources are located on an Outpost in your account, specify `OUTPOST` .
   *
   * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
   * specified type with matching target tags across all of the Outposts in your account.
   */
  public fun resourceLocations(vararg resourceLocations: String) {
    _resourceLocations.addAll(listOf(*resourceLocations))
  }

  /**
   * @param resourceLocations *[Snapshot and AMI policies only]* The location of the resources to
   * backup.
   * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
   * resources are located on an Outpost in your account, specify `OUTPOST` .
   *
   * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
   * specified type with matching target tags across all of the Outposts in your account.
   */
  public fun resourceLocations(resourceLocations: Collection<String>) {
    _resourceLocations.addAll(resourceLocations)
  }

  /**
   * @param resourceTypes *[Snapshot policies only]* The target resource type for snapshot and AMI
   * lifecycle policies.
   * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create multi-volume
   * snapshots from the volumes for an instance.
   */
  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  /**
   * @param resourceTypes *[Snapshot policies only]* The target resource type for snapshot and AMI
   * lifecycle policies.
   * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create multi-volume
   * snapshots from the volumes for an instance.
   */
  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  /**
   * @param schedules *[Snapshot and AMI policies only]* The schedules of policy-defined actions for
   * snapshot and AMI lifecycle policies.
   * A policy can have up to four schedules—one mandatory schedule and up to three optional
   * schedules.
   */
  public fun schedules(vararg schedules: Any) {
    _schedules.addAll(listOf(*schedules))
  }

  /**
   * @param schedules *[Snapshot and AMI policies only]* The schedules of policy-defined actions for
   * snapshot and AMI lifecycle policies.
   * A policy can have up to four schedules—one mandatory schedule and up to three optional
   * schedules.
   */
  public fun schedules(schedules: Collection<Any>) {
    _schedules.addAll(schedules)
  }

  /**
   * @param schedules *[Snapshot and AMI policies only]* The schedules of policy-defined actions for
   * snapshot and AMI lifecycle policies.
   * A policy can have up to four schedules—one mandatory schedule and up to three optional
   * schedules.
   */
  public fun schedules(schedules: IResolvable) {
    cdkBuilder.schedules(schedules)
  }

  /**
   * @param targetTags *[Snapshot and AMI policies only]* The single tag that identifies targeted
   * resources for this policy.
   */
  public fun targetTags(vararg targetTags: Any) {
    _targetTags.addAll(listOf(*targetTags))
  }

  /**
   * @param targetTags *[Snapshot and AMI policies only]* The single tag that identifies targeted
   * resources for this policy.
   */
  public fun targetTags(targetTags: Collection<Any>) {
    _targetTags.addAll(targetTags)
  }

  /**
   * @param targetTags *[Snapshot and AMI policies only]* The single tag that identifies targeted
   * resources for this policy.
   */
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
