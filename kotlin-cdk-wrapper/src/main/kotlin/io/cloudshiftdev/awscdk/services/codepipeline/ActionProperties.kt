@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Artifact artifact;
 * Resource resource;
 * Role role;
 * ActionProperties actionProperties = ActionProperties.builder()
 * .actionName("actionName")
 * .artifactBounds(ActionArtifactBounds.builder()
 * .maxInputs(123)
 * .maxOutputs(123)
 * .minInputs(123)
 * .minOutputs(123)
 * .build())
 * .category(ActionCategory.SOURCE)
 * .provider("provider")
 * // the properties below are optional
 * .account("account")
 * .inputs(List.of(artifact))
 * .outputs(List.of(artifact))
 * .owner("owner")
 * .region("region")
 * .resource(resource)
 * .role(role)
 * .runOrder(123)
 * .variablesNamespace("variablesNamespace")
 * .version("version")
 * .build();
 * ```
 */
public interface ActionProperties {
  /**
   * The account the Action is supposed to live in.
   *
   * For Actions backed by resources,
   * this is inferred from the Stack `resource` is part of.
   * However, some Actions, like the CloudFormation ones,
   * are not backed by any resource, and they still might want to be cross-account.
   * In general, a concrete Action class should specify either `resource`,
   * or `account` - but not both.
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   *
   */
  public fun actionName(): String

  /**
   *
   */
  public fun artifactBounds(): ActionArtifactBounds

  /**
   * The category of the action.
   *
   * The category defines which action type the owner
   * (the entity that performs the action) performs.
   */
  public fun category(): ActionCategory

  /**
   *
   */
  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  /**
   *
   */
  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   *
   */
  public fun owner(): String? = unwrap(this).getOwner()

  /**
   * The service provider that the action calls.
   */
  public fun provider(): String

  /**
   * The AWS region the given Action resides in.
   *
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   *
   * Default: the Action resides in the same region as the Pipeline
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The optional resource that is backing this Action.
   *
   * This is used for automatically handling Actions backed by
   * resources from a different account and/or region.
   */
  public fun resource(): IResource? = unwrap(this).getResource()?.let(IResource::wrap)

  /**
   *
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The order in which AWS CodePipeline runs this action. For more information, see the AWS
   * CodePipeline User Guide.
   *
   * https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements
   */
  public fun runOrder(): Number? = unwrap(this).getRunOrder()

  /**
   * The name of the namespace to use for variables emitted by this action.
   *
   * Default: - a name will be generated, based on the stage and action names
   */
  public fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

  /**
   *
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [ActionProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The account the Action is supposed to live in.
     * For Actions backed by resources,
     * this is inferred from the Stack `resource` is part of.
     * However, some Actions, like the CloudFormation ones,
     * are not backed by any resource, and they still might want to be cross-account.
     * In general, a concrete Action class should specify either `resource`,
     * or `account` - but not both.
     */
    public fun account(account: String)

    /**
     * @param actionName the value to be set. 
     */
    public fun actionName(actionName: String)

    /**
     * @param artifactBounds the value to be set. 
     */
    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    /**
     * @param artifactBounds the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6099b65dcf2f09bb493af592c9431d5733bcd10b0d137c52e34d7d769ffa62ff")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    /**
     * @param category The category of the action. 
     * The category defines which action type the owner
     * (the entity that performs the action) performs.
     */
    public fun category(category: ActionCategory)

    /**
     * @param inputs the value to be set.
     */
    public fun inputs(inputs: List<Artifact>)

    /**
     * @param inputs the value to be set.
     */
    public fun inputs(vararg inputs: Artifact)

    /**
     * @param outputs the value to be set.
     */
    public fun outputs(outputs: List<Artifact>)

    /**
     * @param outputs the value to be set.
     */
    public fun outputs(vararg outputs: Artifact)

    /**
     * @param owner the value to be set.
     */
    public fun owner(owner: String)

    /**
     * @param provider The service provider that the action calls. 
     */
    public fun provider(provider: String)

    /**
     * @param region The AWS region the given Action resides in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun region(region: String)

    /**
     * @param resource The optional resource that is backing this Action.
     * This is used for automatically handling Actions backed by
     * resources from a different account and/or region.
     */
    public fun resource(resource: IResource)

    /**
     * @param role the value to be set.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The order in which AWS CodePipeline runs this action. For more information,
     * see the AWS CodePipeline User Guide.
     * https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)

    /**
     * @param version the value to be set.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionProperties.Builder =
        software.amazon.awscdk.services.codepipeline.ActionProperties.builder()

    /**
     * @param account The account the Action is supposed to live in.
     * For Actions backed by resources,
     * this is inferred from the Stack `resource` is part of.
     * However, some Actions, like the CloudFormation ones,
     * are not backed by any resource, and they still might want to be cross-account.
     * In general, a concrete Action class should specify either `resource`,
     * or `account` - but not both.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param actionName the value to be set. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param artifactBounds the value to be set. 
     */
    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    /**
     * @param artifactBounds the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6099b65dcf2f09bb493af592c9431d5733bcd10b0d137c52e34d7d769ffa62ff")
    override fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit): Unit =
        artifactBounds(ActionArtifactBounds(artifactBounds))

    /**
     * @param category The category of the action. 
     * The category defines which action type the owner
     * (the entity that performs the action) performs.
     */
    override fun category(category: ActionCategory) {
      cdkBuilder.category(category.let(ActionCategory::unwrap))
    }

    /**
     * @param inputs the value to be set.
     */
    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    /**
     * @param inputs the value to be set.
     */
    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    /**
     * @param outputs the value to be set.
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    /**
     * @param outputs the value to be set.
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    /**
     * @param owner the value to be set.
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param provider The service provider that the action calls. 
     */
    override fun provider(provider: String) {
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
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param resource The optional resource that is backing this Action.
     * This is used for automatically handling Actions backed by
     * resources from a different account and/or region.
     */
    override fun resource(resource: IResource) {
      cdkBuilder.resource(resource.let(IResource::unwrap))
    }

    /**
     * @param role the value to be set.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The order in which AWS CodePipeline runs this action. For more information,
     * see the AWS CodePipeline User Guide.
     * https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    /**
     * @param version the value to be set.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.ActionProperties,
  ) : CdkObject(cdkObject), ActionProperties {
    /**
     * The account the Action is supposed to live in.
     *
     * For Actions backed by resources,
     * this is inferred from the Stack `resource` is part of.
     * However, some Actions, like the CloudFormation ones,
     * are not backed by any resource, and they still might want to be cross-account.
     * In general, a concrete Action class should specify either `resource`,
     * or `account` - but not both.
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     *
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     *
     */
    override fun artifactBounds(): ActionArtifactBounds =
        unwrap(this).getArtifactBounds().let(ActionArtifactBounds::wrap)

    /**
     * The category of the action.
     *
     * The category defines which action type the owner
     * (the entity that performs the action) performs.
     */
    override fun category(): ActionCategory = unwrap(this).getCategory().let(ActionCategory::wrap)

    /**
     *
     */
    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     *
     */
    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     *
     */
    override fun owner(): String? = unwrap(this).getOwner()

    /**
     * The service provider that the action calls.
     */
    override fun provider(): String = unwrap(this).getProvider()

    /**
     * The AWS region the given Action resides in.
     *
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     *
     * Default: the Action resides in the same region as the Pipeline
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The optional resource that is backing this Action.
     *
     * This is used for automatically handling Actions backed by
     * resources from a different account and/or region.
     */
    override fun resource(): IResource? = unwrap(this).getResource()?.let(IResource::wrap)

    /**
     *
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The order in which AWS CodePipeline runs this action. For more information, see the AWS
     * CodePipeline User Guide.
     *
     * https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

    /**
     *
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionProperties):
        ActionProperties = CdkObjectWrappers.wrap(cdkObject) as? ActionProperties ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionProperties):
        software.amazon.awscdk.services.codepipeline.ActionProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.ActionProperties
  }
}
