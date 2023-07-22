@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.Effect
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyStatementProps

@CdkDslMarker
public class PolicyStatementPropsDsl {
  private val cdkBuilder: PolicyStatementProps.Builder = PolicyStatementProps.builder()

  private val _actions: MutableList<String> = mutableListOf()

  private val _notActions: MutableList<String> = mutableListOf()

  private val _notPrincipals: MutableList<IPrincipal> = mutableListOf()

  private val _notResources: MutableList<String> = mutableListOf()

  private val _principals: MutableList<IPrincipal> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  /**
   * @param actions List of actions to add to the statement.
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions List of actions to add to the statement.
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * @param conditions Conditions to add to the statement.
   */
  public fun conditions(conditions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(conditions)
    cdkBuilder.conditions(builder.map)
  }

  /**
   * @param conditions Conditions to add to the statement.
   */
  public fun conditions(conditions: Map<String, Any>) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param effect Whether to allow or deny the actions in this statement.
   */
  public fun effect(effect: Effect) {
    cdkBuilder.effect(effect)
  }

  /**
   * @param notActions List of not actions to add to the statement.
   */
  public fun notActions(vararg notActions: String) {
    _notActions.addAll(listOf(*notActions))
  }

  /**
   * @param notActions List of not actions to add to the statement.
   */
  public fun notActions(notActions: Collection<String>) {
    _notActions.addAll(notActions)
  }

  /**
   * @param notPrincipals List of not principals to add to the statement.
   */
  public fun notPrincipals(vararg notPrincipals: IPrincipal) {
    _notPrincipals.addAll(listOf(*notPrincipals))
  }

  /**
   * @param notPrincipals List of not principals to add to the statement.
   */
  public fun notPrincipals(notPrincipals: Collection<IPrincipal>) {
    _notPrincipals.addAll(notPrincipals)
  }

  /**
   * @param notResources NotResource ARNs to add to the statement.
   */
  public fun notResources(vararg notResources: String) {
    _notResources.addAll(listOf(*notResources))
  }

  /**
   * @param notResources NotResource ARNs to add to the statement.
   */
  public fun notResources(notResources: Collection<String>) {
    _notResources.addAll(notResources)
  }

  /**
   * @param principals List of principals to add to the statement.
   */
  public fun principals(vararg principals: IPrincipal) {
    _principals.addAll(listOf(*principals))
  }

  /**
   * @param principals List of principals to add to the statement.
   */
  public fun principals(principals: Collection<IPrincipal>) {
    _principals.addAll(principals)
  }

  /**
   * @param resources Resource ARNs to add to the statement.
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources Resource ARNs to add to the statement.
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  /**
   * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
   * statement.
   * You can assign a Sid value to each statement in a
   * statement array. In services that let you specify an ID element, such as
   * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
   * IAM, the Sid value must be unique within a JSON policy.
   */
  public fun sid(sid: String) {
    cdkBuilder.sid(sid)
  }

  public fun build(): PolicyStatementProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_notActions.isNotEmpty()) cdkBuilder.notActions(_notActions)
    if(_notPrincipals.isNotEmpty()) cdkBuilder.notPrincipals(_notPrincipals)
    if(_notResources.isNotEmpty()) cdkBuilder.notResources(_notResources)
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
