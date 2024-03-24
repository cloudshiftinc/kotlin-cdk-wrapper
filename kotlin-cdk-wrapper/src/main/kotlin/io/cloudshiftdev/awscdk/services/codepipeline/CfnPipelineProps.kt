@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Object configuration;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
 * .roleArn("roleArn")
 * .stages(List.of(StageDeclarationProperty.builder()
 * .actions(List.of(ActionDeclarationProperty.builder()
 * .actionTypeId(ActionTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .namespace("namespace")
 * .outputArtifacts(List.of(OutputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .region("region")
 * .roleArn("roleArn")
 * .runOrder(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .blockers(List.of(BlockerDeclarationProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .artifactStore(ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build())
 * .artifactStores(List.of(ArtifactStoreMapProperty.builder()
 * .artifactStore(ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build())
 * .region("region")
 * .build()))
 * .disableInboundStageTransitions(List.of(StageTransitionProperty.builder()
 * .reason("reason")
 * .stageName("stageName")
 * .build()))
 * .executionMode("executionMode")
 * .name("name")
 * .pipelineType("pipelineType")
 * .restartExecutionOnUpdate(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .triggers(List.of(PipelineTriggerDeclarationProperty.builder()
 * .providerType("providerType")
 * // the properties below are optional
 * .gitConfiguration(GitConfigurationProperty.builder()
 * .sourceActionName("sourceActionName")
 * // the properties below are optional
 * .pullRequest(List.of(GitPullRequestFilterProperty.builder()
 * .branches(GitBranchFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .events(List.of("events"))
 * .filePaths(GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .build()))
 * .push(List.of(GitPushFilterProperty.builder()
 * .branches(GitBranchFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .filePaths(GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .tags(GitTagFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .build()))
 * .build())
 * .build()))
 * .variables(List.of(VariableDeclarationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .description("description")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
 */
public interface CfnPipelineProps {
  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   *
   *
   * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
   * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
   */
  public fun artifactStore(): Any? = unwrap(this).getArtifactStore()

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   *
   * There must be an artifact store for the pipeline Region and for each cross-region action in the
   * pipeline.
   *
   *
   * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
   * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores)
   */
  public fun artifactStores(): Any? = unwrap(this).getArtifactStores()

  /**
   * Represents the input of a `DisableStageTransition` action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
   */
  public fun disableInboundStageTransitions(): Any? =
      unwrap(this).getDisableInboundStageTransitions()

  /**
   * The method that the pipeline will use to handle multiple executions.
   *
   * The default mode is SUPERSEDED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-executionmode)
   */
  public fun executionMode(): String? = unwrap(this).getExecutionMode()

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * CodePipeline provides the following pipeline types, which differ in characteristics and price,
   * so that you can tailor your pipeline features and cost to the needs of your applications.
   *
   * * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and
   * action-level parameters.
   * * V2 type pipelines have the same structure as a V1 type, along with additional parameters for
   * release safety and trigger configuration.
   *
   *
   * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or
   * updating a pipeline will result in the pipeline having the V2 type of pipeline and the associated
   * costs.
   *
   *
   * For information about pricing for CodePipeline, see
   * [Pricing](https://docs.aws.amazon.com/codepipeline/pricing/) .
   *
   * For information about which type of pipeline to choose, see [What type of pipeline is right for
   * me?](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-pipelinetype)
   */
  public fun pipelineType(): String? = unwrap(this).getPipelineType()

  /**
   * Indicates whether to rerun the CodePipeline pipeline after you update it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
   */
  public fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

  /**
   * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
   * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
   */
  public fun roleArn(): String

  /**
   * Represents information about a stage and its definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
   */
  public fun stages(): Any

  /**
   * Specifies the tags applied to the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   *
   *
   * When a trigger configuration is specified, default change detection for repository and branch
   * commits is disabled.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-triggers)
   */
  public fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   *
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * `[A-Za-z0-9&#64;\-_]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
   */
  public fun variables(): Any? = unwrap(this).getVariables()

  /**
   * A builder for [CfnPipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    public fun artifactStore(artifactStore: IResolvable)

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty)

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("792996bb8bb1bd403f7dc818fba256270703f3b7b6f718c07a85c7af1c1df399")
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit)

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    public fun artifactStores(artifactStores: IResolvable)

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    public fun artifactStores(artifactStores: List<Any>)

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    public fun artifactStores(vararg artifactStores: Any)

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable)

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>)

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any)

    /**
     * @param executionMode The method that the pipeline will use to handle multiple executions.
     * The default mode is SUPERSEDED.
     */
    public fun executionMode(executionMode: String)

    /**
     * @param name The name of the pipeline.
     */
    public fun name(name: String)

    /**
     * @param pipelineType CodePipeline provides the following pipeline types, which differ in
     * characteristics and price, so that you can tailor your pipeline features and cost to the needs
     * of your applications.
     * * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and
     * action-level parameters.
     * * V2 type pipelines have the same structure as a V1 type, along with additional parameters
     * for release safety and trigger configuration.
     *
     *
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or
     * updating a pipeline will result in the pipeline having the V2 type of pipeline and the
     * associated costs.
     *
     *
     * For information about pricing for CodePipeline, see
     * [Pricing](https://docs.aws.amazon.com/codepipeline/pricing/) .
     *
     * For information about which type of pipeline to choose, see [What type of pipeline is right
     * for me?](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * .
     */
    public fun pipelineType(pipelineType: String)

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable)

    /**
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     * actions with no `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn`
     * . 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(stages: IResolvable)

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(stages: List<Any>)

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(vararg stages: Any)

    /**
     * @param tags Specifies the tags applied to the pipeline.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the tags applied to the pipeline.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    public fun triggers(triggers: IResolvable)

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    public fun triggers(triggers: List<Any>)

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    public fun triggers(vararg triggers: Any)

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    public fun variables(variables: IResolvable)

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    public fun variables(variables: List<Any>)

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    public fun variables(vararg variables: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnPipelineProps.builder()

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    override fun artifactStore(artifactStore: IResolvable) {
      cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
    }

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    override fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
      cdkBuilder.artifactStore(artifactStore.let(CfnPipeline.ArtifactStoreProperty::unwrap))
    }

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("792996bb8bb1bd403f7dc818fba256270703f3b7b6f718c07a85c7af1c1df399")
    override fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit):
        Unit = artifactStore(CfnPipeline.ArtifactStoreProperty(artifactStore))

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    override fun artifactStores(artifactStores: IResolvable) {
      cdkBuilder.artifactStores(artifactStores.let(IResolvable::unwrap))
    }

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    override fun artifactStores(artifactStores: List<Any>) {
      cdkBuilder.artifactStores(artifactStores.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions.
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     */
    override fun artifactStores(vararg artifactStores: Any): Unit =
        artifactStores(artifactStores.toList())

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    override fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.let(IResolvable::unwrap))
    }

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    override fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action.
     */
    override fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any): Unit =
        disableInboundStageTransitions(disableInboundStageTransitions.toList())

    /**
     * @param executionMode The method that the pipeline will use to handle multiple executions.
     * The default mode is SUPERSEDED.
     */
    override fun executionMode(executionMode: String) {
      cdkBuilder.executionMode(executionMode)
    }

    /**
     * @param name The name of the pipeline.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pipelineType CodePipeline provides the following pipeline types, which differ in
     * characteristics and price, so that you can tailor your pipeline features and cost to the needs
     * of your applications.
     * * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and
     * action-level parameters.
     * * V2 type pipelines have the same structure as a V1 type, along with additional parameters
     * for release safety and trigger configuration.
     *
     *
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or
     * updating a pipeline will result in the pipeline having the V2 type of pipeline and the
     * associated costs.
     *
     *
     * For information about pricing for CodePipeline, see
     * [Pricing](https://docs.aws.amazon.com/codepipeline/pricing/) .
     *
     * For information about which type of pipeline to choose, see [What type of pipeline is right
     * for me?](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * .
     */
    override fun pipelineType(pipelineType: String) {
      cdkBuilder.pipelineType(pipelineType)
    }

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it.
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it.
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate.let(IResolvable::unwrap))
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     * actions with no `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn`
     * . 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    /**
     * @param tags Specifies the tags applied to the pipeline.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the tags applied to the pipeline.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    override fun variables(variables: List<Any>) {
      cdkBuilder.variables(variables.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     */
    override fun variables(vararg variables: Any): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     */
    override fun artifactStore(): Any? = unwrap(this).getArtifactStore()

    /**
     * A mapping of `artifactStore` objects and their corresponding AWS Regions.
     *
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores)
     */
    override fun artifactStores(): Any? = unwrap(this).getArtifactStores()

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     */
    override fun disableInboundStageTransitions(): Any? =
        unwrap(this).getDisableInboundStageTransitions()

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * The default mode is SUPERSEDED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-executionmode)
     */
    override fun executionMode(): String? = unwrap(this).getExecutionMode()

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * CodePipeline provides the following pipeline types, which differ in characteristics and
     * price, so that you can tailor your pipeline features and cost to the needs of your applications.
     *
     * * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and
     * action-level parameters.
     * * V2 type pipelines have the same structure as a V1 type, along with additional parameters
     * for release safety and trigger configuration.
     *
     *
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or
     * updating a pipeline will result in the pipeline having the V2 type of pipeline and the
     * associated costs.
     *
     *
     * For information about pricing for CodePipeline, see
     * [Pricing](https://docs.aws.amazon.com/codepipeline/pricing/) .
     *
     * For information about which type of pipeline to choose, see [What type of pipeline is right
     * for me?](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-pipelinetype)
     */
    override fun pipelineType(): String? = unwrap(this).getPipelineType()

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     */
    override fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

    /**
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     */
    override fun stages(): Any = unwrap(this).getStages()

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-triggers)
     */
    override fun triggers(): Any? = unwrap(this).getTriggers()

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     */
    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipelineProps):
        CfnPipelineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPipelineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.codepipeline.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CfnPipelineProps
  }
}
