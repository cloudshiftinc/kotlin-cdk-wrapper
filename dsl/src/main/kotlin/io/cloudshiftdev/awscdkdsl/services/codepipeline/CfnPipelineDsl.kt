@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.constructs.Construct

/**
 * The `AWS::CodePipeline::Pipeline` resource creates a CodePipeline pipeline that describes how
 * software changes go through a release process.
 *
 * For more information, see
 * [What Is CodePipeline?](https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html)
 * in the *CodePipeline User Guide* .
 *
 * For an example in YAML and JSON that contains the parameters in this reference, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#aws-resource-codepipeline-pipeline--examples)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Object configuration;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
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
@CdkDslMarker
public class CfnPipelineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPipeline.Builder = CfnPipeline.Builder.create(scope, id)

    private val _artifactStores: MutableList<Any> = mutableListOf()

    private val _disableInboundStageTransitions: MutableList<Any> = mutableListOf()

    private val _stages: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _triggers: MutableList<Any> = mutableListOf()

    private val _variables: MutableList<Any> = mutableListOf()

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     *
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     */
    public fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     *
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     */
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /**
     * A mapping of `artifactStore` objects and their corresponding AWS Regions.
     *
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores)
     *
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions.
     */
    public fun artifactStores(vararg artifactStores: Any) {
        _artifactStores.addAll(listOf(*artifactStores))
    }

    /**
     * A mapping of `artifactStore` objects and their corresponding AWS Regions.
     *
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores)
     *
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions.
     */
    public fun artifactStores(artifactStores: Collection<Any>) {
        _artifactStores.addAll(artifactStores)
    }

    /**
     * A mapping of `artifactStore` objects and their corresponding AWS Regions.
     *
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores)
     *
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions.
     */
    public fun artifactStores(artifactStores: IResolvable) {
        cdkBuilder.artifactStores(artifactStores)
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     *
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any) {
        _disableInboundStageTransitions.addAll(listOf(*disableInboundStageTransitions))
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     *
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: Collection<Any>) {
        _disableInboundStageTransitions.addAll(disableInboundStageTransitions)
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     *
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
        cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
    }

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * The default mode is SUPERSEDED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-executionmode)
     *
     * @param executionMode The method that the pipeline will use to handle multiple executions.
     */
    public fun executionMode(executionMode: String) {
        cdkBuilder.executionMode(executionMode)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
     *
     * @param name The name of the pipeline.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * CodePipeline provides the following pipeline types, which differ in characteristics and
     * price, so that you can tailor your pipeline features and cost to the needs of your
     * applications.
     * * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and
     *   action-level parameters.
     * * V2 type pipelines have the same structure as a V1 type, along with additional parameters
     *   for release safety and trigger configuration.
     *
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or
     * updating a pipeline will result in the pipeline having the V2 type of pipeline and the
     * associated costs.
     *
     * For information about pricing for CodePipeline, see
     * [Pricing](https://docs.aws.amazon.com/codepipeline/pricing/) .
     *
     * For information about which type of pipeline to choose, see
     * [What type of pipeline is right for me?](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-pipelinetype)
     *
     * @param pipelineType CodePipeline provides the following pipeline types, which differ in
     *   characteristics and price, so that you can tailor your pipeline features and cost to the
     *   needs of your applications.
     */
    public fun pipelineType(pipelineType: String) {
        cdkBuilder.pipelineType(pipelineType)
    }

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     *
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     *   you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
        cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     *
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     *   you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
        cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     *   actions with no `actionRoleArn` , or to use to assume roles for actions with an
     *   `actionRoleArn` .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     *
     * @param stages Represents information about a stage and its definition.
     */
    public fun stages(vararg stages: Any) {
        _stages.addAll(listOf(*stages))
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     *
     * @param stages Represents information about a stage and its definition.
     */
    public fun stages(stages: Collection<Any>) {
        _stages.addAll(stages)
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     *
     * @param stages Represents information about a stage and its definition.
     */
    public fun stages(stages: IResolvable) {
        cdkBuilder.stages(stages)
    }

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     *
     * @param tags Specifies the tags applied to the pipeline.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     *
     * @param tags Specifies the tags applied to the pipeline.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-triggers)
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     *   starts the pipeline.
     */
    public fun triggers(vararg triggers: Any) {
        _triggers.addAll(listOf(*triggers))
    }

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-triggers)
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     *   starts the pipeline.
     */
    public fun triggers(triggers: Collection<Any>) {
        _triggers.addAll(triggers)
    }

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-triggers)
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     *   starts the pipeline.
     */
    public fun triggers(triggers: IResolvable) {
        cdkBuilder.triggers(triggers)
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     */
    public fun variables(vararg variables: Any) {
        _variables.addAll(listOf(*variables))
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     */
    public fun variables(variables: Collection<Any>) {
        _variables.addAll(variables)
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     */
    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    public fun build(): CfnPipeline {
        if (_artifactStores.isNotEmpty()) cdkBuilder.artifactStores(_artifactStores)
        if (_disableInboundStageTransitions.isNotEmpty())
            cdkBuilder.disableInboundStageTransitions(_disableInboundStageTransitions)
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        return cdkBuilder.build()
    }
}
