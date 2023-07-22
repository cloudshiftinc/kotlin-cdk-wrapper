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

  /**
   * @param account The account the Action is supposed to live in.
   * For Actions backed by resources,
   * this is inferred from the Stack `resource` is part of.
   * However, some Actions, like the CloudFormation ones,
   * are not backed by any resource, and they still might want to be cross-account.
   * In general, a concrete Action class should specify either `resource`,
   * or `account` - but not both.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param actionName the value to be set. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param artifactBounds the value to be set. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBoundsDsl.() -> Unit = {}) {
    val builder = ActionArtifactBoundsDsl()
    builder.apply(artifactBounds)
    cdkBuilder.artifactBounds(builder.build())
  }

  /**
   * @param artifactBounds the value to be set. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBounds) {
    cdkBuilder.artifactBounds(artifactBounds)
  }

  /**
   * @param category The category of the action. 
   * The category defines which action type the owner
   * (the entity that performs the action) performs.
   */
  public fun category(category: ActionCategory) {
    cdkBuilder.category(category)
  }

  /**
   * @param inputs the value to be set.
   */
  public fun inputs(vararg inputs: Artifact) {
    _inputs.addAll(listOf(*inputs))
  }

  /**
   * @param inputs the value to be set.
   */
  public fun inputs(inputs: Collection<Artifact>) {
    _inputs.addAll(inputs)
  }

  /**
   * @param outputs the value to be set.
   */
  public fun outputs(vararg outputs: Artifact) {
    _outputs.addAll(listOf(*outputs))
  }

  /**
   * @param outputs the value to be set.
   */
  public fun outputs(outputs: Collection<Artifact>) {
    _outputs.addAll(outputs)
  }

  /**
   * @param owner the value to be set.
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param provider The service provider that the action calls. 
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param region The AWS region the given Action resides in.
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param resource The optional resource that is backing this Action.
   * This is used for automatically handling Actions backed by
   * resources from a different account and/or region.
   */
  public fun resource(resource: IResource) {
    cdkBuilder.resource(resource)
  }

  /**
   * @param role the value to be set.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The order in which AWS CodePipeline runs this action. For more information, see
   * the AWS CodePipeline User Guide.
   * https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  /**
   * @param version the value to be set.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): ActionProperties {
    if(_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    return cdkBuilder.build()
  }
}
