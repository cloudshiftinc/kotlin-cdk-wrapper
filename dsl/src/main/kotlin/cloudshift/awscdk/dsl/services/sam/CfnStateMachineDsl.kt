@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.constructs.Construct

@CdkDslMarker
public class CfnStateMachineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStateMachine.Builder = CfnStateMachine.Builder.create(scope, id)

  private val _policies: MutableList<Any> = mutableListOf()

  public fun definition(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.definition(builder.map)
  }

  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun events(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.events(builder.map)
  }

  public fun events(events: Map<String, *>) {
    cdkBuilder.events(events)
  }

  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty) {
    cdkBuilder.logging(logging)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun permissionsBoundaries(permissionsBoundaries: String) {
    cdkBuilder.permissionsBoundaries(permissionsBoundaries)
  }

  public fun policies(policies: String) {
    cdkBuilder.policies(policies)
  }

  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty) {
    cdkBuilder.policies(policies)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun tracing(tracing: IResolvable) {
    cdkBuilder.tracing(tracing)
  }

  public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty) {
    cdkBuilder.tracing(tracing)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStateMachine {
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    return cdkBuilder.build()
  }
}
