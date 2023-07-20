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

  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  public fun conditions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.conditions(builder.map)
  }

  public fun conditions(conditions: Map<String, Any>) {
    cdkBuilder.conditions(conditions)
  }

  public fun effect(effect: Effect) {
    cdkBuilder.effect(effect)
  }

  public fun notActions(vararg notActions: String) {
    _notActions.addAll(listOf(*notActions))
  }

  public fun notActions(notActions: Collection<String>) {
    _notActions.addAll(notActions)
  }

  public fun notPrincipals(vararg notPrincipals: IPrincipal) {
    _notPrincipals.addAll(listOf(*notPrincipals))
  }

  public fun notPrincipals(notPrincipals: Collection<IPrincipal>) {
    _notPrincipals.addAll(notPrincipals)
  }

  public fun notResources(vararg notResources: String) {
    _notResources.addAll(listOf(*notResources))
  }

  public fun notResources(notResources: Collection<String>) {
    _notResources.addAll(notResources)
  }

  public fun principals(vararg principals: IPrincipal) {
    _principals.addAll(listOf(*principals))
  }

  public fun principals(principals: Collection<IPrincipal>) {
    _principals.addAll(principals)
  }

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

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
