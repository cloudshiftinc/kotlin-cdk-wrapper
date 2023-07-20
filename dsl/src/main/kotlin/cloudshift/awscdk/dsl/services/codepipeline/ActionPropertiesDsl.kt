@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResource
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
import software.amazon.awscdk.services.codepipeline.ActionCategory
import software.amazon.awscdk.services.codepipeline.ActionProperties
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ActionPropertiesDsl {
  private val cdkBuilder: ActionProperties.Builder = ActionProperties.builder()

  private val _inputs: MutableList<Artifact> = mutableListOf()

  private val _outputs: MutableList<Artifact> = mutableListOf()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun artifactBounds(block: ActionArtifactBoundsDsl.() -> Unit = {}) {
    val builder = ActionArtifactBoundsDsl()
    builder.apply(block)
    cdkBuilder.artifactBounds(builder.build())
  }

  public fun artifactBounds(artifactBounds: ActionArtifactBounds) {
    cdkBuilder.artifactBounds(artifactBounds)
  }

  public fun category(category: ActionCategory) {
    cdkBuilder.category(category)
  }

  public fun inputs(vararg inputs: Artifact) {
    _inputs.addAll(listOf(*inputs))
  }

  public fun inputs(inputs: Collection<Artifact>) {
    _inputs.addAll(inputs)
  }

  public fun outputs(vararg outputs: Artifact) {
    _outputs.addAll(listOf(*outputs))
  }

  public fun outputs(outputs: Collection<Artifact>) {
    _outputs.addAll(outputs)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun resource(resource: IResource) {
    cdkBuilder.resource(resource)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): ActionProperties {
    if(_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    return cdkBuilder.build()
  }
}
