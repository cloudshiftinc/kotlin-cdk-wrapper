@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CodePipeline::Pipeline` resource creates a CodePipeline pipeline that describes how
 * software changes go through a release process.
 *
 * For more information, see [What Is
 * CodePipeline?](https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html) in the
 * *CodePipeline User Guide* .
 *
 * For an example in YAML and JSON that contains the parameters in this reference, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#aws-resource-codepipeline-pipeline--examples)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
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
public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(): Any? = unwrap(this).getArtifactStore()

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(`value`: IResolvable) {
    unwrap(this).setArtifactStore(`value`.let(IResolvable::unwrap))
  }

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(`value`: ArtifactStoreProperty) {
    unwrap(this).setArtifactStore(`value`.let(ArtifactStoreProperty::unwrap))
  }

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f3ad5a8ffa98a15e0168a3cb475339233d6b9ba22fccb25e0ad4d6e56249a5a")
  public open fun artifactStore(`value`: ArtifactStoreProperty.Builder.() -> Unit): Unit =
      artifactStore(ArtifactStoreProperty(`value`))

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(): Any? = unwrap(this).getArtifactStores()

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(`value`: IResolvable) {
    unwrap(this).setArtifactStores(`value`.let(IResolvable::unwrap))
  }

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(`value`: List<Any>) {
    unwrap(this).setArtifactStores(`value`)
  }

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(vararg `value`: Any): Unit = artifactStores(`value`.toList())

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The version of the pipeline.
   *
   *
   * A new pipeline is always assigned a version number of 1. This number increments when a pipeline
   * is updated.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Represents the input of a `DisableStageTransition` action.
   */
  public open fun disableInboundStageTransitions(): Any? =
      unwrap(this).getDisableInboundStageTransitions()

  /**
   * Represents the input of a `DisableStageTransition` action.
   */
  public open fun disableInboundStageTransitions(`value`: IResolvable) {
    unwrap(this).setDisableInboundStageTransitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents the input of a `DisableStageTransition` action.
   */
  public open fun disableInboundStageTransitions(`value`: List<Any>) {
    unwrap(this).setDisableInboundStageTransitions(`value`)
  }

  /**
   * Represents the input of a `DisableStageTransition` action.
   */
  public open fun disableInboundStageTransitions(vararg `value`: Any): Unit =
      disableInboundStageTransitions(`value`.toList())

  /**
   * The method that the pipeline will use to handle multiple executions.
   */
  public open fun executionMode(): String? = unwrap(this).getExecutionMode()

  /**
   * The method that the pipeline will use to handle multiple executions.
   */
  public open fun executionMode(`value`: String) {
    unwrap(this).setExecutionMode(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the pipeline.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the pipeline.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * CodePipeline provides the following pipeline types, which differ in characteristics and price,
   * so that you can tailor your pipeline features and cost to the needs of your applications.
   */
  public open fun pipelineType(): String? = unwrap(this).getPipelineType()

  /**
   * CodePipeline provides the following pipeline types, which differ in characteristics and price,
   * so that you can tailor your pipeline features and cost to the needs of your applications.
   */
  public open fun pipelineType(`value`: String) {
    unwrap(this).setPipelineType(`value`)
  }

  /**
   * Indicates whether to rerun the CodePipeline pipeline after you update it.
   */
  public open fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

  /**
   * Indicates whether to rerun the CodePipeline pipeline after you update it.
   */
  public open fun restartExecutionOnUpdate(`value`: Boolean) {
    unwrap(this).setRestartExecutionOnUpdate(`value`)
  }

  /**
   * Indicates whether to rerun the CodePipeline pipeline after you update it.
   */
  public open fun restartExecutionOnUpdate(`value`: IResolvable) {
    unwrap(this).setRestartExecutionOnUpdate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
   * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
   * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Represents information about a stage and its definition.
   */
  public open fun stages(): Any = unwrap(this).getStages()

  /**
   * Represents information about a stage and its definition.
   */
  public open fun stages(`value`: IResolvable) {
    unwrap(this).setStages(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents information about a stage and its definition.
   */
  public open fun stages(`value`: List<Any>) {
    unwrap(this).setStages(`value`)
  }

  /**
   * Represents information about a stage and its definition.
   */
  public open fun stages(vararg `value`: Any): Unit = stages(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies the tags applied to the pipeline.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies the tags applied to the pipeline.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies the tags applied to the pipeline.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   */
  public open fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   */
  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   */
  public open fun triggers(`value`: List<Any>) {
    unwrap(this).setTriggers(`value`)
  }

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   */
  public open fun triggers(vararg `value`: Any): Unit = triggers(`value`.toList())

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   */
  public open fun variables(): Any? = unwrap(this).getVariables()

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   */
  public open fun variables(`value`: IResolvable) {
    unwrap(this).setVariables(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   */
  public open fun variables(`value`: List<Any>) {
    unwrap(this).setVariables(`value`)
  }

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   */
  public open fun variables(vararg `value`: Any): Unit = variables(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.CfnPipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    public fun artifactStore(artifactStore: IResolvable)

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    public fun artifactStore(artifactStore: ArtifactStoreProperty)

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad238c725f05707649514fdc6656ca88d63083455d9ed90d441eac83027d20da")
    public fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit)

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    public fun artifactStores(artifactStores: IResolvable)

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    public fun artifactStores(artifactStores: List<Any>)

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    public fun artifactStores(vararg artifactStores: Any)

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable)

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>)

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any)

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * The default mode is SUPERSEDED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-executionmode)
     * @param executionMode The method that the pipeline will use to handle multiple executions. 
     */
    public fun executionMode(executionMode: String)

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
     * @param name The name of the pipeline. 
     */
    public fun name(name: String)

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
     * @param pipelineType CodePipeline provides the following pipeline types, which differ in
     * characteristics and price, so that you can tailor your pipeline features and cost to the needs
     * of your applications. 
     */
    public fun pipelineType(pipelineType: String)

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it. 
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it. 
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable)

    /**
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     * actions with no `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn`
     * . 
     */
    public fun roleArn(roleArn: String)

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(stages: IResolvable)

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(stages: List<Any>)

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    public fun stages(vararg stages: Any)

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     * @param tags Specifies the tags applied to the pipeline. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     * @param tags Specifies the tags applied to the pipeline. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    public fun triggers(triggers: IResolvable)

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    public fun triggers(triggers: List<Any>)

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    public fun triggers(vararg triggers: Any)

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    public fun variables(variables: IResolvable)

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    public fun variables(variables: List<Any>)

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    public fun variables(vararg variables: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder =
        software.amazon.awscdk.services.codepipeline.CfnPipeline.Builder.create(scope, id)

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    override fun artifactStore(artifactStore: IResolvable) {
      cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
    }

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    override fun artifactStore(artifactStore: ArtifactStoreProperty) {
      cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty::unwrap))
    }

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad238c725f05707649514fdc6656ca88d63083455d9ed90d441eac83027d20da")
    override fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit): Unit =
        artifactStore(ArtifactStoreProperty(artifactStore))

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    override fun artifactStores(artifactStores: IResolvable) {
      cdkBuilder.artifactStores(artifactStores.let(IResolvable::unwrap))
    }

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    override fun artifactStores(artifactStores: List<Any>) {
      cdkBuilder.artifactStores(artifactStores)
    }

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
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     * Regions. 
     */
    override fun artifactStores(vararg artifactStores: Any): Unit =
        artifactStores(artifactStores.toList())

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    override fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.let(IResolvable::unwrap))
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    override fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    override fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any): Unit =
        disableInboundStageTransitions(disableInboundStageTransitions.toList())

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * The default mode is SUPERSEDED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-executionmode)
     * @param executionMode The method that the pipeline will use to handle multiple executions. 
     */
    override fun executionMode(executionMode: String) {
      cdkBuilder.executionMode(executionMode)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
     * @param name The name of the pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param pipelineType CodePipeline provides the following pipeline types, which differ in
     * characteristics and price, so that you can tailor your pipeline features and cost to the needs
     * of your applications. 
     */
    override fun pipelineType(pipelineType: String) {
      cdkBuilder.pipelineType(pipelineType)
    }

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it. 
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * Indicates whether to rerun the CodePipeline pipeline after you update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     * you update it. 
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) for CodePipeline to use to either perform actions with no
     * `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     * actions with no `actionRoleArn` , or to use to assume roles for actions with an `actionRoleArn`
     * . 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     * @param tags Specifies the tags applied to the pipeline. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies the tags applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags)
     * @param tags Specifies the tags applied to the pipeline. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

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
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    override fun variables(variables: List<Any>) {
      cdkBuilder.variables(variables)
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * `[A-Za-z0-9&#64;\-_]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-variables)
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    override fun variables(vararg variables: Any): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codepipeline.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.codepipeline.CfnPipeline = wrapped.cdkObject
  }

  /**
   * Represents information about the output of an action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * OutputArtifactProperty outputArtifactProperty = OutputArtifactProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html)
   */
  public interface OutputArtifactProperty {
    /**
     * The name of the output of an artifact, such as "My App".
     *
     * The output artifact name must exactly match the input artifact declared for a downstream
     * action. However, the downstream action's input artifact does not have to be the next action in
     * strict sequence from the action that provided the output artifact. Actions in parallel can
     * declare different output artifacts, which are in turn consumed by different following actions.
     *
     * Output artifact names must be unique within a pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html#cfn-codepipeline-pipeline-outputartifact-name)
     */
    public fun name(): String

    /**
     * A builder for [OutputArtifactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the output of an artifact, such as "My App". 
       * The output artifact name must exactly match the input artifact declared for a downstream
       * action. However, the downstream action's input artifact does not have to be the next action in
       * strict sequence from the action that provided the output artifact. Actions in parallel can
       * declare different output artifacts, which are in turn consumed by different following actions.
       *
       * Output artifact names must be unique within a pipeline.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.builder()

      /**
       * @param name The name of the output of an artifact, such as "My App". 
       * The output artifact name must exactly match the input artifact declared for a downstream
       * action. However, the downstream action's input artifact does not have to be the next action in
       * strict sequence from the action that provided the output artifact. Actions in parallel can
       * declare different output artifacts, which are in turn consumed by different following actions.
       *
       * Output artifact names must be unique within a pipeline.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty,
    ) : CdkObject(cdkObject), OutputArtifactProperty {
      /**
       * The name of the output of an artifact, such as "My App".
       *
       * The output artifact name must exactly match the input artifact declared for a downstream
       * action. However, the downstream action's input artifact does not have to be the next action in
       * strict sequence from the action that provided the output artifact. Actions in parallel can
       * declare different output artifacts, which are in turn consumed by different following actions.
       *
       * Output artifact names must be unique within a pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html#cfn-codepipeline-pipeline-outputartifact-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty):
          OutputArtifactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty
    }
  }

  /**
   * The Git tags specified as filter criteria for whether a Git tag repository event will start the
   * pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitTagFilterCriteriaProperty gitTagFilterCriteriaProperty =
   * GitTagFilterCriteriaProperty.builder()
   * .excludes(List.of("excludes"))
   * .includes(List.of("includes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gittagfiltercriteria.html)
   */
  public interface GitTagFilterCriteriaProperty {
    /**
     * The list of patterns of Git tags that, when pushed, are to be excluded from starting the
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gittagfiltercriteria.html#cfn-codepipeline-pipeline-gittagfiltercriteria-excludes)
     */
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    /**
     * The list of patterns of Git tags that, when pushed, are to be included as criteria that
     * starts the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gittagfiltercriteria.html#cfn-codepipeline-pipeline-gittagfiltercriteria-includes)
     */
    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    /**
     * A builder for [GitTagFilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludes The list of patterns of Git tags that, when pushed, are to be excluded from
       * starting the pipeline.
       */
      public fun excludes(excludes: List<String>)

      /**
       * @param excludes The list of patterns of Git tags that, when pushed, are to be excluded from
       * starting the pipeline.
       */
      public fun excludes(vararg excludes: String)

      /**
       * @param includes The list of patterns of Git tags that, when pushed, are to be included as
       * criteria that starts the pipeline.
       */
      public fun includes(includes: List<String>)

      /**
       * @param includes The list of patterns of Git tags that, when pushed, are to be included as
       * criteria that starts the pipeline.
       */
      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty.builder()

      /**
       * @param excludes The list of patterns of Git tags that, when pushed, are to be excluded from
       * starting the pipeline.
       */
      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      /**
       * @param excludes The list of patterns of Git tags that, when pushed, are to be excluded from
       * starting the pipeline.
       */
      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      /**
       * @param includes The list of patterns of Git tags that, when pushed, are to be included as
       * criteria that starts the pipeline.
       */
      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      /**
       * @param includes The list of patterns of Git tags that, when pushed, are to be included as
       * criteria that starts the pipeline.
       */
      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitTagFilterCriteriaProperty {
      /**
       * The list of patterns of Git tags that, when pushed, are to be excluded from starting the
       * pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gittagfiltercriteria.html#cfn-codepipeline-pipeline-gittagfiltercriteria-excludes)
       */
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      /**
       * The list of patterns of Git tags that, when pushed, are to be included as criteria that
       * starts the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gittagfiltercriteria.html#cfn-codepipeline-pipeline-gittagfiltercriteria-includes)
       */
      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitTagFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty):
          GitTagFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitTagFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty
    }
  }

  /**
   * The name of the pipeline in which you want to disable the flow of artifacts from one stage to
   * another.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * StageTransitionProperty stageTransitionProperty = StageTransitionProperty.builder()
   * .reason("reason")
   * .stageName("stageName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html)
   */
  public interface StageTransitionProperty {
    /**
     * The reason given to the user that a stage is disabled, such as waiting for manual approval or
     * manual tests.
     *
     * This message is displayed in the pipeline console UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html#cfn-codepipeline-pipeline-stagetransition-reason)
     */
    public fun reason(): String

    /**
     * The name of the stage where you want to disable the inbound or outbound transition of
     * artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html#cfn-codepipeline-pipeline-stagetransition-stagename)
     */
    public fun stageName(): String

    /**
     * A builder for [StageTransitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reason The reason given to the user that a stage is disabled, such as waiting for
       * manual approval or manual tests. 
       * This message is displayed in the pipeline console UI.
       */
      public fun reason(reason: String)

      /**
       * @param stageName The name of the stage where you want to disable the inbound or outbound
       * transition of artifacts. 
       */
      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.builder()

      /**
       * @param reason The reason given to the user that a stage is disabled, such as waiting for
       * manual approval or manual tests. 
       * This message is displayed in the pipeline console UI.
       */
      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      /**
       * @param stageName The name of the stage where you want to disable the inbound or outbound
       * transition of artifacts. 
       */
      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty,
    ) : CdkObject(cdkObject), StageTransitionProperty {
      /**
       * The reason given to the user that a stage is disabled, such as waiting for manual approval
       * or manual tests.
       *
       * This message is displayed in the pipeline console UI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html#cfn-codepipeline-pipeline-stagetransition-reason)
       */
      override fun reason(): String = unwrap(this).getReason()

      /**
       * The name of the stage where you want to disable the inbound or outbound transition of
       * artifacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html#cfn-codepipeline-pipeline-stagetransition-stagename)
       */
      override fun stageName(): String = unwrap(this).getStageName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageTransitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty):
          StageTransitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageTransitionProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty
    }
  }

  /**
   * A type of trigger configuration for Git-based source actions.
   *
   *
   * You can specify the Git configuration trigger type for all third-party Git-based source actions
   * that are supported by the `CodeStarSourceConnection` action type.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitConfigurationProperty gitConfigurationProperty = GitConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html)
   */
  public interface GitConfigurationProperty {
    /**
     * The field where the repository event that will start the pipeline is specified as pull
     * requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-pullrequest)
     */
    public fun pullRequest(): Any? = unwrap(this).getPullRequest()

    /**
     * The field where the repository event that will start the pipeline, such as pushing Git tags,
     * is specified with details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-push)
     */
    public fun push(): Any? = unwrap(this).getPush()

    /**
     * The name of the pipeline source action where the trigger configuration, such as Git tags, is
     * specified.
     *
     * The trigger configuration will start the pipeline upon the specified change only.
     *
     *
     * You can only specify one trigger configuration per source action.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-sourceactionname)
     */
    public fun sourceActionName(): String

    /**
     * A builder for [GitConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      public fun pullRequest(pullRequest: IResolvable)

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      public fun pullRequest(pullRequest: List<Any>)

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      public fun pullRequest(vararg pullRequest: Any)

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      public fun push(push: IResolvable)

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      public fun push(push: List<Any>)

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      public fun push(vararg push: Any)

      /**
       * @param sourceActionName The name of the pipeline source action where the trigger
       * configuration, such as Git tags, is specified. 
       * The trigger configuration will start the pipeline upon the specified change only.
       *
       *
       * You can only specify one trigger configuration per source action.
       */
      public fun sourceActionName(sourceActionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty.builder()

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      override fun pullRequest(pullRequest: IResolvable) {
        cdkBuilder.pullRequest(pullRequest.let(IResolvable::unwrap))
      }

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      override fun pullRequest(pullRequest: List<Any>) {
        cdkBuilder.pullRequest(pullRequest)
      }

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      override fun pullRequest(vararg pullRequest: Any): Unit = pullRequest(pullRequest.toList())

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      override fun push(push: IResolvable) {
        cdkBuilder.push(push.let(IResolvable::unwrap))
      }

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      override fun push(push: List<Any>) {
        cdkBuilder.push(push)
      }

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      override fun push(vararg push: Any): Unit = push(push.toList())

      /**
       * @param sourceActionName The name of the pipeline source action where the trigger
       * configuration, such as Git tags, is specified. 
       * The trigger configuration will start the pipeline upon the specified change only.
       *
       *
       * You can only specify one trigger configuration per source action.
       */
      override fun sourceActionName(sourceActionName: String) {
        cdkBuilder.sourceActionName(sourceActionName)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty,
    ) : CdkObject(cdkObject), GitConfigurationProperty {
      /**
       * The field where the repository event that will start the pipeline is specified as pull
       * requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-pullrequest)
       */
      override fun pullRequest(): Any? = unwrap(this).getPullRequest()

      /**
       * The field where the repository event that will start the pipeline, such as pushing Git
       * tags, is specified with details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-push)
       */
      override fun push(): Any? = unwrap(this).getPush()

      /**
       * The name of the pipeline source action where the trigger configuration, such as Git tags,
       * is specified.
       *
       * The trigger configuration will start the pipeline upon the specified change only.
       *
       *
       * You can only specify one trigger configuration per source action.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html#cfn-codepipeline-pipeline-gitconfiguration-sourceactionname)
       */
      override fun sourceActionName(): String = unwrap(this).getSourceActionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty):
          GitConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitConfigurationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty
    }
  }

  /**
   * Represents information about an artifact to be worked on, such as a test or build artifact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * InputArtifactProperty inputArtifactProperty = InputArtifactProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-inputartifact.html)
   */
  public interface InputArtifactProperty {
    /**
     * The name of the artifact to be worked on (for example, "My App").
     *
     * Artifacts are the files that are worked on by actions in the pipeline. See the action
     * configuration for each action for details about artifact parameters. For example, the S3 source
     * action input artifact is a file name (or file path), and the files are generally provided as a
     * ZIP file. Example artifact name: SampleApp_Windows.zip
     *
     * The input artifact of an action must exactly match the output artifact declared in a
     * preceding action, but the input artifact does not have to be the next action in strict sequence
     * from the action that provided the output artifact. Actions in parallel can declare different
     * output artifacts, which are in turn consumed by different following actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-inputartifact.html#cfn-codepipeline-pipeline-inputartifact-name)
     */
    public fun name(): String

    /**
     * A builder for [InputArtifactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the artifact to be worked on (for example, "My App"). 
       * Artifacts are the files that are worked on by actions in the pipeline. See the action
       * configuration for each action for details about artifact parameters. For example, the S3
       * source action input artifact is a file name (or file path), and the files are generally
       * provided as a ZIP file. Example artifact name: SampleApp_Windows.zip
       *
       * The input artifact of an action must exactly match the output artifact declared in a
       * preceding action, but the input artifact does not have to be the next action in strict
       * sequence from the action that provided the output artifact. Actions in parallel can declare
       * different output artifacts, which are in turn consumed by different following actions.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.builder()

      /**
       * @param name The name of the artifact to be worked on (for example, "My App"). 
       * Artifacts are the files that are worked on by actions in the pipeline. See the action
       * configuration for each action for details about artifact parameters. For example, the S3
       * source action input artifact is a file name (or file path), and the files are generally
       * provided as a ZIP file. Example artifact name: SampleApp_Windows.zip
       *
       * The input artifact of an action must exactly match the output artifact declared in a
       * preceding action, but the input artifact does not have to be the next action in strict
       * sequence from the action that provided the output artifact. Actions in parallel can declare
       * different output artifacts, which are in turn consumed by different following actions.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty,
    ) : CdkObject(cdkObject), InputArtifactProperty {
      /**
       * The name of the artifact to be worked on (for example, "My App").
       *
       * Artifacts are the files that are worked on by actions in the pipeline. See the action
       * configuration for each action for details about artifact parameters. For example, the S3
       * source action input artifact is a file name (or file path), and the files are generally
       * provided as a ZIP file. Example artifact name: SampleApp_Windows.zip
       *
       * The input artifact of an action must exactly match the output artifact declared in a
       * preceding action, but the input artifact does not have to be the next action in strict
       * sequence from the action that provided the output artifact. Actions in parallel can declare
       * different output artifacts, which are in turn consumed by different following actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-inputartifact.html#cfn-codepipeline-pipeline-inputartifact-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty):
          InputArtifactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty
    }
  }

  /**
   * Represents information about the specified trigger configuration, such as the filter criteria
   * and the source stage for the action that contains the trigger.
   *
   *
   * This is only supported for the `CodeStarSourceConnection` action type. &gt; When a trigger
   * configuration is specified, default change detection for repository and branch commits is
   * disabled.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * PipelineTriggerDeclarationProperty pipelineTriggerDeclarationProperty =
   * PipelineTriggerDeclarationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html)
   */
  public interface PipelineTriggerDeclarationProperty {
    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html#cfn-codepipeline-pipeline-pipelinetriggerdeclaration-gitconfiguration)
     */
    public fun gitConfiguration(): Any? = unwrap(this).getGitConfiguration()

    /**
     * The source provider for the event, such as connections configured for a repository with Git
     * tags, for the specified trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html#cfn-codepipeline-pipeline-pipelinetriggerdeclaration-providertype)
     */
    public fun providerType(): String

    /**
     * A builder for [PipelineTriggerDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      public fun gitConfiguration(gitConfiguration: IResolvable)

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      public fun gitConfiguration(gitConfiguration: GitConfigurationProperty)

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51cb2b4e2bd58be2966f809a82c34fbd0a7affb16285727bcf432cf200ebb552")
      public fun gitConfiguration(gitConfiguration: GitConfigurationProperty.Builder.() -> Unit)

      /**
       * @param providerType The source provider for the event, such as connections configured for a
       * repository with Git tags, for the specified trigger configuration. 
       */
      public fun providerType(providerType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty.builder()

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      override fun gitConfiguration(gitConfiguration: IResolvable) {
        cdkBuilder.gitConfiguration(gitConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      override fun gitConfiguration(gitConfiguration: GitConfigurationProperty) {
        cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfigurationProperty::unwrap))
      }

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51cb2b4e2bd58be2966f809a82c34fbd0a7affb16285727bcf432cf200ebb552")
      override fun gitConfiguration(gitConfiguration: GitConfigurationProperty.Builder.() -> Unit):
          Unit = gitConfiguration(GitConfigurationProperty(gitConfiguration))

      /**
       * @param providerType The source provider for the event, such as connections configured for a
       * repository with Git tags, for the specified trigger configuration. 
       */
      override fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty,
    ) : CdkObject(cdkObject), PipelineTriggerDeclarationProperty {
      /**
       * Provides the filter criteria and the source stage for the repository event that starts the
       * pipeline, such as Git tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html#cfn-codepipeline-pipeline-pipelinetriggerdeclaration-gitconfiguration)
       */
      override fun gitConfiguration(): Any? = unwrap(this).getGitConfiguration()

      /**
       * The source provider for the event, such as connections configured for a repository with Git
       * tags, for the specified trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html#cfn-codepipeline-pipeline-pipelinetriggerdeclaration-providertype)
       */
      override fun providerType(): String = unwrap(this).getProviderType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipelineTriggerDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty):
          PipelineTriggerDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineTriggerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
    }
  }

  /**
   * Represents information about an action type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * ActionTypeIdProperty actionTypeIdProperty = ActionTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html)
   */
  public interface ActionTypeIdProperty {
    /**
     * A category defines what kind of action can be taken in the stage, and constrains the provider
     * type for the action.
     *
     * Valid categories are limited to one of the values below.
     *
     * * `Source`
     * * `Build`
     * * `Test`
     * * `Deploy`
     * * `Invoke`
     * * `Approval`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-category)
     */
    public fun category(): String

    /**
     * The creator of the action being called.
     *
     * There are three valid values for the `Owner` field in the action category section within your
     * pipeline structure: `AWS` , `ThirdParty` , and `Custom` . For more information, see [Valid
     * Action Types and Providers in
     * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-owner)
     */
    public fun owner(): String

    /**
     * The provider of the service being called by the action.
     *
     * Valid providers are determined by the action category. For example, an action in the Deploy
     * category type might have a provider of CodeDeploy, which would be specified as `CodeDeploy` .
     * For more information, see [Valid Action Types and Providers in
     * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-provider)
     */
    public fun provider(): String

    /**
     * A string that describes the action version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-version)
     */
    public fun version(): String

    /**
     * A builder for [ActionTypeIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param category A category defines what kind of action can be taken in the stage, and
       * constrains the provider type for the action. 
       * Valid categories are limited to one of the values below.
       *
       * * `Source`
       * * `Build`
       * * `Test`
       * * `Deploy`
       * * `Invoke`
       * * `Approval`
       */
      public fun category(category: String)

      /**
       * @param owner The creator of the action being called. 
       * There are three valid values for the `Owner` field in the action category section within
       * your pipeline structure: `AWS` , `ThirdParty` , and `Custom` . For more information, see
       * [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       */
      public fun owner(owner: String)

      /**
       * @param provider The provider of the service being called by the action. 
       * Valid providers are determined by the action category. For example, an action in the Deploy
       * category type might have a provider of CodeDeploy, which would be specified as `CodeDeploy` .
       * For more information, see [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       */
      public fun provider(provider: String)

      /**
       * @param version A string that describes the action version. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.builder()

      /**
       * @param category A category defines what kind of action can be taken in the stage, and
       * constrains the provider type for the action. 
       * Valid categories are limited to one of the values below.
       *
       * * `Source`
       * * `Build`
       * * `Test`
       * * `Deploy`
       * * `Invoke`
       * * `Approval`
       */
      override fun category(category: String) {
        cdkBuilder.category(category)
      }

      /**
       * @param owner The creator of the action being called. 
       * There are three valid values for the `Owner` field in the action category section within
       * your pipeline structure: `AWS` , `ThirdParty` , and `Custom` . For more information, see
       * [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       */
      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      /**
       * @param provider The provider of the service being called by the action. 
       * Valid providers are determined by the action category. For example, an action in the Deploy
       * category type might have a provider of CodeDeploy, which would be specified as `CodeDeploy` .
       * For more information, see [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       */
      override fun provider(provider: String) {
        cdkBuilder.provider(provider)
      }

      /**
       * @param version A string that describes the action version. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty,
    ) : CdkObject(cdkObject), ActionTypeIdProperty {
      /**
       * A category defines what kind of action can be taken in the stage, and constrains the
       * provider type for the action.
       *
       * Valid categories are limited to one of the values below.
       *
       * * `Source`
       * * `Build`
       * * `Test`
       * * `Deploy`
       * * `Invoke`
       * * `Approval`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-category)
       */
      override fun category(): String = unwrap(this).getCategory()

      /**
       * The creator of the action being called.
       *
       * There are three valid values for the `Owner` field in the action category section within
       * your pipeline structure: `AWS` , `ThirdParty` , and `Custom` . For more information, see
       * [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-owner)
       */
      override fun owner(): String = unwrap(this).getOwner()

      /**
       * The provider of the service being called by the action.
       *
       * Valid providers are determined by the action category. For example, an action in the Deploy
       * category type might have a provider of CodeDeploy, which would be specified as `CodeDeploy` .
       * For more information, see [Valid Action Types and Providers in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-provider)
       */
      override fun provider(): String = unwrap(this).getProvider()

      /**
       * A string that describes the action version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html#cfn-codepipeline-pipeline-actiontypeid-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionTypeIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty):
          ActionTypeIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionTypeIdProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty
    }
  }

  /**
   * The event criteria for the pull request trigger configuration, such as the lists of branches or
   * file paths to include and exclude.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitPullRequestFilterProperty gitPullRequestFilterProperty =
   * GitPullRequestFilterProperty.builder()
   * .branches(GitBranchFilterCriteriaProperty.builder()
   * .excludes(List.of("excludes"))
   * .includes(List.of("includes"))
   * .build())
   * .events(List.of("events"))
   * .filePaths(GitFilePathFilterCriteriaProperty.builder()
   * .excludes(List.of("excludes"))
   * .includes(List.of("includes"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html)
   */
  public interface GitPullRequestFilterProperty {
    /**
     * The field that specifies to filter on branches for the pull request trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-branches)
     */
    public fun branches(): Any? = unwrap(this).getBranches()

    /**
     * The field that specifies which pull request events to filter on (opened, updated, closed) for
     * the trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-events)
     */
    public fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

    /**
     * The field that specifies to filter on file paths for the pull request trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-filepaths)
     */
    public fun filePaths(): Any? = unwrap(this).getFilePaths()

    /**
     * A builder for [GitPullRequestFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      public fun branches(branches: IResolvable)

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      public fun branches(branches: GitBranchFilterCriteriaProperty)

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65cb80379ab7e3aa99eb8e992bafd8046bf7c6d0e0107faeefd4040cc6127ac2")
      public fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit)

      /**
       * @param events The field that specifies which pull request events to filter on (opened,
       * updated, closed) for the trigger configuration.
       */
      public fun events(events: List<String>)

      /**
       * @param events The field that specifies which pull request events to filter on (opened,
       * updated, closed) for the trigger configuration.
       */
      public fun events(vararg events: String)

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      public fun filePaths(filePaths: IResolvable)

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty)

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d5bf2731910e29c1c9b8d2d2b130cde8712135db84adebde46c8d9a907d77a6")
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty.builder()

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      override fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches.let(IResolvable::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65cb80379ab7e3aa99eb8e992bafd8046bf7c6d0e0107faeefd4040cc6127ac2")
      override fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit): Unit =
          branches(GitBranchFilterCriteriaProperty(branches))

      /**
       * @param events The field that specifies which pull request events to filter on (opened,
       * updated, closed) for the trigger configuration.
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The field that specifies which pull request events to filter on (opened,
       * updated, closed) for the trigger configuration.
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      override fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths.let(IResolvable::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d5bf2731910e29c1c9b8d2d2b130cde8712135db84adebde46c8d9a907d77a6")
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit): Unit
          = filePaths(GitFilePathFilterCriteriaProperty(filePaths))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty,
    ) : CdkObject(cdkObject), GitPullRequestFilterProperty {
      /**
       * The field that specifies to filter on branches for the pull request trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-branches)
       */
      override fun branches(): Any? = unwrap(this).getBranches()

      /**
       * The field that specifies which pull request events to filter on (opened, updated, closed)
       * for the trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-events)
       */
      override fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

      /**
       * The field that specifies to filter on file paths for the pull request trigger
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-filepaths)
       */
      override fun filePaths(): Any? = unwrap(this).getFilePaths()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitPullRequestFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty):
          GitPullRequestFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPullRequestFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty
    }
  }

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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * ArtifactStoreMapProperty artifactStoreMapProperty = ArtifactStoreMapProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html)
   */
  public interface ArtifactStoreMapProperty {
    /**
     * Represents information about the S3 bucket where artifacts are stored for the pipeline.
     *
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-artifactstore)
     */
    public fun artifactStore(): Any

    /**
     * The action declaration's AWS Region, such as us-east-1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region)
     */
    public fun region(): String

    /**
     * A builder for [ArtifactStoreMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      public fun artifactStore(artifactStore: IResolvable)

      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      public fun artifactStore(artifactStore: ArtifactStoreProperty)

      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("517dbcd794991f0a62ad3ab845d445462d9a0ab84342eb2be9405c85439e27e4")
      public fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit)

      /**
       * @param region The action declaration's AWS Region, such as us-east-1. 
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.builder()

      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      override fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
      }

      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      override fun artifactStore(artifactStore: ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty::unwrap))
      }

      /**
       * @param artifactStore Represents information about the S3 bucket where artifacts are stored
       * for the pipeline. 
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("517dbcd794991f0a62ad3ab845d445462d9a0ab84342eb2be9405c85439e27e4")
      override fun artifactStore(artifactStore: ArtifactStoreProperty.Builder.() -> Unit): Unit =
          artifactStore(ArtifactStoreProperty(artifactStore))

      /**
       * @param region The action declaration's AWS Region, such as us-east-1. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty,
    ) : CdkObject(cdkObject), ArtifactStoreMapProperty {
      /**
       * Represents information about the S3 bucket where artifacts are stored for the pipeline.
       *
       *
       * You must include either `artifactStore` or `artifactStores` in your pipeline, but you
       * cannot use both. If you create a cross-region action in your pipeline, you must use
       * `artifactStores` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-artifactstore)
       */
      override fun artifactStore(): Any = unwrap(this).getArtifactStore()

      /**
       * The action declaration's AWS Region, such as us-east-1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html#cfn-codepipeline-pipeline-artifactstoremap-region)
       */
      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactStoreMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty):
          ArtifactStoreMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactStoreMapProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty
    }
  }

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   *
   *
   * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
   * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * ArtifactStoreProperty artifactStoreProperty = ArtifactStoreProperty.builder()
   * .location("location")
   * .type("type")
   * // the properties below are optional
   * .encryptionKey(EncryptionKeyProperty.builder()
   * .id("id")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
   */
  public interface ArtifactStoreProperty {
    /**
     * The encryption key used to encrypt the data in the artifact store, such as an AWS Key
     * Management Service ( AWS KMS) key.
     *
     * If this is undefined, the default key for Amazon S3 is used. To see an example artifact store
     * encryption key field, see the example structure here:
     * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey)
     */
    public fun encryptionKey(): Any? = unwrap(this).getEncryptionKey()

    /**
     * The S3 bucket used for storing the artifacts for a pipeline.
     *
     * You can specify the name of an S3 bucket but not a folder in the bucket. A folder to contain
     * the pipeline artifacts is created for you based on the name of the pipeline. You can use any S3
     * bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location)
     */
    public fun location(): String

    /**
     * The type of the artifact store, such as S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type)
     */
    public fun type(): String

    /**
     * A builder for [ArtifactStoreProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      public fun encryptionKey(encryptionKey: IResolvable)

      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      public fun encryptionKey(encryptionKey: EncryptionKeyProperty)

      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c3aa9f37ce17445bbdd9e12eadba2c8a2843a6a19324999d3445e9540089011")
      public fun encryptionKey(encryptionKey: EncryptionKeyProperty.Builder.() -> Unit)

      /**
       * @param location The S3 bucket used for storing the artifacts for a pipeline. 
       * You can specify the name of an S3 bucket but not a folder in the bucket. A folder to
       * contain the pipeline artifacts is created for you based on the name of the pipeline. You can
       * use any S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
       */
      public fun location(location: String)

      /**
       * @param type The type of the artifact store, such as S3. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.builder()

      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      override fun encryptionKey(encryptionKey: IResolvable) {
        cdkBuilder.encryptionKey(encryptionKey.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      override fun encryptionKey(encryptionKey: EncryptionKeyProperty) {
        cdkBuilder.encryptionKey(encryptionKey.let(EncryptionKeyProperty::unwrap))
      }

      /**
       * @param encryptionKey The encryption key used to encrypt the data in the artifact store,
       * such as an AWS Key Management Service ( AWS KMS) key.
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c3aa9f37ce17445bbdd9e12eadba2c8a2843a6a19324999d3445e9540089011")
      override fun encryptionKey(encryptionKey: EncryptionKeyProperty.Builder.() -> Unit): Unit =
          encryptionKey(EncryptionKeyProperty(encryptionKey))

      /**
       * @param location The S3 bucket used for storing the artifacts for a pipeline. 
       * You can specify the name of an S3 bucket but not a folder in the bucket. A folder to
       * contain the pipeline artifacts is created for you based on the name of the pipeline. You can
       * use any S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param type The type of the artifact store, such as S3. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty,
    ) : CdkObject(cdkObject), ArtifactStoreProperty {
      /**
       * The encryption key used to encrypt the data in the artifact store, such as an AWS Key
       * Management Service ( AWS KMS) key.
       *
       * If this is undefined, the default key for Amazon S3 is used. To see an example artifact
       * store encryption key field, see the example structure here:
       * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey)
       */
      override fun encryptionKey(): Any? = unwrap(this).getEncryptionKey()

      /**
       * The S3 bucket used for storing the artifacts for a pipeline.
       *
       * You can specify the name of an S3 bucket but not a folder in the bucket. A folder to
       * contain the pipeline artifacts is created for you based on the name of the pipeline. You can
       * use any S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location)
       */
      override fun location(): String = unwrap(this).getLocation()

      /**
       * The type of the artifact store, such as S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactStoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty):
          ArtifactStoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactStoreProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty
    }
  }

  /**
   * Reserved for future use.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * BlockerDeclarationProperty blockerDeclarationProperty = BlockerDeclarationProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html)
   */
  public interface BlockerDeclarationProperty {
    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html#cfn-codepipeline-pipeline-blockerdeclaration-name)
     */
    public fun name(): String

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html#cfn-codepipeline-pipeline-blockerdeclaration-type)
     */
    public fun type(): String

    /**
     * A builder for [BlockerDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Reserved for future use. 
       */
      public fun name(name: String)

      /**
       * @param type Reserved for future use. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.builder()

      /**
       * @param name Reserved for future use. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Reserved for future use. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty,
    ) : CdkObject(cdkObject), BlockerDeclarationProperty {
      /**
       * Reserved for future use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html#cfn-codepipeline-pipeline-blockerdeclaration-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Reserved for future use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html#cfn-codepipeline-pipeline-blockerdeclaration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockerDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty):
          BlockerDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty
    }
  }

  /**
   * Represents information about a stage and its definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * StageDeclarationProperty stageDeclarationProperty = StageDeclarationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html)
   */
  public interface StageDeclarationProperty {
    /**
     * The actions included in a stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-actions)
     */
    public fun actions(): Any

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-blockers)
     */
    public fun blockers(): Any? = unwrap(this).getBlockers()

    /**
     * The name of the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-name)
     */
    public fun name(): String

    /**
     * A builder for [StageDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions included in a stage. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The actions included in a stage. 
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions The actions included in a stage. 
       */
      public fun actions(vararg actions: Any)

      /**
       * @param blockers Reserved for future use.
       */
      public fun blockers(blockers: IResolvable)

      /**
       * @param blockers Reserved for future use.
       */
      public fun blockers(blockers: List<Any>)

      /**
       * @param blockers Reserved for future use.
       */
      public fun blockers(vararg blockers: Any)

      /**
       * @param name The name of the stage. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.builder()

      /**
       * @param actions The actions included in a stage. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions The actions included in a stage. 
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions included in a stage. 
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param blockers Reserved for future use.
       */
      override fun blockers(blockers: IResolvable) {
        cdkBuilder.blockers(blockers.let(IResolvable::unwrap))
      }

      /**
       * @param blockers Reserved for future use.
       */
      override fun blockers(blockers: List<Any>) {
        cdkBuilder.blockers(blockers)
      }

      /**
       * @param blockers Reserved for future use.
       */
      override fun blockers(vararg blockers: Any): Unit = blockers(blockers.toList())

      /**
       * @param name The name of the stage. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty,
    ) : CdkObject(cdkObject), StageDeclarationProperty {
      /**
       * The actions included in a stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * Reserved for future use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-blockers)
       */
      override fun blockers(): Any? = unwrap(this).getBlockers()

      /**
       * The name of the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty):
          StageDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty
    }
  }

  /**
   * Represents information about the key used to encrypt data in the artifact store, such as an AWS
   * Key Management Service ( AWS KMS) key.
   *
   * `EncryptionKey` is a property of the
   * [ArtifactStore](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * EncryptionKeyProperty encryptionKeyProperty = EncryptionKeyProperty.builder()
   * .id("id")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html)
   */
  public interface EncryptionKeyProperty {
    /**
     * The ID used to identify the key.
     *
     * For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.
     *
     *
     * Aliases are recognized only in the account that created the AWS KMS key. For cross-account
     * actions, you can only use the key ID or key ARN to identify the key. Cross-account actions
     * involve using the role from the other account (AccountB), so specifying the key ID will use the
     * key from the other account (AccountB).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html#cfn-codepipeline-pipeline-encryptionkey-id)
     */
    public fun id(): String

    /**
     * The type of encryption key, such as an AWS KMS key.
     *
     * When creating or updating a pipeline, the value must be set to 'KMS'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html#cfn-codepipeline-pipeline-encryptionkey-type)
     */
    public fun type(): String

    /**
     * A builder for [EncryptionKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID used to identify the key. 
       * For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.
       *
       *
       * Aliases are recognized only in the account that created the AWS KMS key. For cross-account
       * actions, you can only use the key ID or key ARN to identify the key. Cross-account actions
       * involve using the role from the other account (AccountB), so specifying the key ID will use
       * the key from the other account (AccountB).
       */
      public fun id(id: String)

      /**
       * @param type The type of encryption key, such as an AWS KMS key. 
       * When creating or updating a pipeline, the value must be set to 'KMS'.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.builder()

      /**
       * @param id The ID used to identify the key. 
       * For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.
       *
       *
       * Aliases are recognized only in the account that created the AWS KMS key. For cross-account
       * actions, you can only use the key ID or key ARN to identify the key. Cross-account actions
       * involve using the role from the other account (AccountB), so specifying the key ID will use
       * the key from the other account (AccountB).
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param type The type of encryption key, such as an AWS KMS key. 
       * When creating or updating a pipeline, the value must be set to 'KMS'.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty,
    ) : CdkObject(cdkObject), EncryptionKeyProperty {
      /**
       * The ID used to identify the key.
       *
       * For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.
       *
       *
       * Aliases are recognized only in the account that created the AWS KMS key. For cross-account
       * actions, you can only use the key ID or key ARN to identify the key. Cross-account actions
       * involve using the role from the other account (AccountB), so specifying the key ID will use
       * the key from the other account (AccountB).
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html#cfn-codepipeline-pipeline-encryptionkey-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The type of encryption key, such as an AWS KMS key.
       *
       * When creating or updating a pipeline, the value must be set to 'KMS'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html#cfn-codepipeline-pipeline-encryptionkey-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty):
          EncryptionKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionKeyProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty
    }
  }

  /**
   * Represents information about an action declaration.
   *
   *
   * Documentation for the `timeoutInMinutes` parameter in the `ActionDeclaration` is not yet
   * available for CloudFormation and CDK resources in CodePipeline. For more information about the
   * configurable timeout for manual approval actions, see the
   * [ActionDeclaration](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_ActionDeclaration.html)
   * in the CodePipeline API Reference.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * ActionDeclarationProperty actionDeclarationProperty = ActionDeclarationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html)
   */
  public interface ActionDeclarationProperty {
    /**
     * Specifies the action type and the provider of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-actiontypeid)
     */
    public fun actionTypeId(): Any

    /**
     * The action's configuration.
     *
     * These are key-value pairs that specify input values for an action. For more information, see
     * [Action Structure Requirements in
     * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
     * . For the list of configuration properties for the AWS CloudFormation action type in
     * CodePipeline, see [Configuration Properties
     * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
     * in the *AWS CloudFormation User Guide* . For template snippets with examples, see [Using
     * Parameter Override Functions with CodePipeline
     * Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The values can be represented in either JSON or YAML format. For example, the JSON
     * configuration item format is as follows:
     *
     * *JSON:*
     *
     * `"Configuration" : { Key : Value },`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     *
     * While the field is not a required parameter, most actions have an action configuration that
     * requires a specified quantity of input artifacts. To refer to the action configuration
     * specification by action provider, see the [Action structure
     * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
     * the *AWS CodePipeline User Guide* .
     *
     *
     * For a CodeBuild action with multiple input artifacts, one of your input sources must be
     * designated the PrimarySource. For more information, see the [CodeBuild action reference
     * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
     * in the *AWS CodePipeline User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-inputartifacts)
     */
    public fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

    /**
     * The action declaration's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-name)
     */
    public fun name(): String

    /**
     * The variable namespace associated with the action.
     *
     * All variables produced as output by this action fall under this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     *
     * While the field is not a required parameter, most actions have an action configuration that
     * requires a specified quantity of output artifacts. To refer to the action configuration
     * specification by action provider, see the [Action structure
     * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
     * the *AWS CodePipeline User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-outputartifacts)
     */
    public fun outputArtifacts(): Any? = unwrap(this).getOutputArtifacts()

    /**
     * The action declaration's AWS Region, such as us-east-1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * The ARN of the IAM service role that performs the declared action.
     *
     * This is assumed through the roleArn for the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The order in which actions are run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-runorder)
     */
    public fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * A builder for [ActionDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      public fun actionTypeId(actionTypeId: IResolvable)

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      public fun actionTypeId(actionTypeId: ActionTypeIdProperty)

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2092269ef9990e90dc63fe85f23371fa1920f3a0164d9fae3941e98a5e81871")
      public fun actionTypeId(actionTypeId: ActionTypeIdProperty.Builder.() -> Unit)

      /**
       * @param configuration The action's configuration.
       * These are key-value pairs that specify input values for an action. For more information,
       * see [Action Structure Requirements in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
       * . For the list of configuration properties for the AWS CloudFormation action type in
       * CodePipeline, see [Configuration Properties
       * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
       * in the *AWS CloudFormation User Guide* . For template snippets with examples, see [Using
       * Parameter Override Functions with CodePipeline
       * Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
       * in the *AWS CloudFormation User Guide* .
       *
       * The values can be represented in either JSON or YAML format. For example, the JSON
       * configuration item format is as follows:
       *
       * *JSON:*
       *
       * `"Configuration" : { Key : Value },`
       */
      public fun configuration(configuration: Any)

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      public fun inputArtifacts(inputArtifacts: IResolvable)

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      public fun inputArtifacts(inputArtifacts: List<Any>)

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      public fun inputArtifacts(vararg inputArtifacts: Any)

      /**
       * @param name The action declaration's name. 
       */
      public fun name(name: String)

      /**
       * @param namespace The variable namespace associated with the action.
       * All variables produced as output by this action fall under this namespace.
       */
      public fun namespace(namespace: String)

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      public fun outputArtifacts(outputArtifacts: IResolvable)

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      public fun outputArtifacts(outputArtifacts: List<Any>)

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      public fun outputArtifacts(vararg outputArtifacts: Any)

      /**
       * @param region The action declaration's AWS Region, such as us-east-1.
       */
      public fun region(region: String)

      /**
       * @param roleArn The ARN of the IAM service role that performs the declared action.
       * This is assumed through the roleArn for the pipeline.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param runOrder The order in which actions are run.
       */
      public fun runOrder(runOrder: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.builder()

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      override fun actionTypeId(actionTypeId: IResolvable) {
        cdkBuilder.actionTypeId(actionTypeId.let(IResolvable::unwrap))
      }

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      override fun actionTypeId(actionTypeId: ActionTypeIdProperty) {
        cdkBuilder.actionTypeId(actionTypeId.let(ActionTypeIdProperty::unwrap))
      }

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2092269ef9990e90dc63fe85f23371fa1920f3a0164d9fae3941e98a5e81871")
      override fun actionTypeId(actionTypeId: ActionTypeIdProperty.Builder.() -> Unit): Unit =
          actionTypeId(ActionTypeIdProperty(actionTypeId))

      /**
       * @param configuration The action's configuration.
       * These are key-value pairs that specify input values for an action. For more information,
       * see [Action Structure Requirements in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
       * . For the list of configuration properties for the AWS CloudFormation action type in
       * CodePipeline, see [Configuration Properties
       * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
       * in the *AWS CloudFormation User Guide* . For template snippets with examples, see [Using
       * Parameter Override Functions with CodePipeline
       * Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
       * in the *AWS CloudFormation User Guide* .
       *
       * The values can be represented in either JSON or YAML format. For example, the JSON
       * configuration item format is as follows:
       *
       * *JSON:*
       *
       * `"Configuration" : { Key : Value },`
       */
      override fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
      }

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      override fun inputArtifacts(inputArtifacts: IResolvable) {
        cdkBuilder.inputArtifacts(inputArtifacts.let(IResolvable::unwrap))
      }

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      override fun inputArtifacts(inputArtifacts: List<Any>) {
        cdkBuilder.inputArtifacts(inputArtifacts)
      }

      /**
       * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
       * or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       */
      override fun inputArtifacts(vararg inputArtifacts: Any): Unit =
          inputArtifacts(inputArtifacts.toList())

      /**
       * @param name The action declaration's name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param namespace The variable namespace associated with the action.
       * All variables produced as output by this action fall under this namespace.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      override fun outputArtifacts(outputArtifacts: IResolvable) {
        cdkBuilder.outputArtifacts(outputArtifacts.let(IResolvable::unwrap))
      }

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      override fun outputArtifacts(outputArtifacts: List<Any>) {
        cdkBuilder.outputArtifacts(outputArtifacts)
      }

      /**
       * @param outputArtifacts The name or ID of the result of the action declaration, such as a
       * test or build artifact.
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       */
      override fun outputArtifacts(vararg outputArtifacts: Any): Unit =
          outputArtifacts(outputArtifacts.toList())

      /**
       * @param region The action declaration's AWS Region, such as us-east-1.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param roleArn The ARN of the IAM service role that performs the declared action.
       * This is assumed through the roleArn for the pipeline.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param runOrder The order in which actions are run.
       */
      override fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty,
    ) : CdkObject(cdkObject), ActionDeclarationProperty {
      /**
       * Specifies the action type and the provider of the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-actiontypeid)
       */
      override fun actionTypeId(): Any = unwrap(this).getActionTypeId()

      /**
       * The action's configuration.
       *
       * These are key-value pairs that specify input values for an action. For more information,
       * see [Action Structure Requirements in
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
       * . For the list of configuration properties for the AWS CloudFormation action type in
       * CodePipeline, see [Configuration Properties
       * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
       * in the *AWS CloudFormation User Guide* . For template snippets with examples, see [Using
       * Parameter Override Functions with CodePipeline
       * Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
       * in the *AWS CloudFormation User Guide* .
       *
       * The values can be represented in either JSON or YAML format. For example, the JSON
       * configuration item format is as follows:
       *
       * *JSON:*
       *
       * `"Configuration" : { Key : Value },`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * The name or ID of the artifact consumed by the action, such as a test or build artifact.
       *
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of input artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       *
       * For a CodeBuild action with multiple input artifacts, one of your input sources must be
       * designated the PrimarySource. For more information, see the [CodeBuild action reference
       * page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
       * in the *AWS CodePipeline User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-inputartifacts)
       */
      override fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

      /**
       * The action declaration's name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The variable namespace associated with the action.
       *
       * All variables produced as output by this action fall under this namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The name or ID of the result of the action declaration, such as a test or build artifact.
       *
       * While the field is not a required parameter, most actions have an action configuration that
       * requires a specified quantity of output artifacts. To refer to the action configuration
       * specification by action provider, see the [Action structure
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) in
       * the *AWS CodePipeline User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-outputartifacts)
       */
      override fun outputArtifacts(): Any? = unwrap(this).getOutputArtifacts()

      /**
       * The action declaration's AWS Region, such as us-east-1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * The ARN of the IAM service role that performs the declared action.
       *
       * This is assumed through the roleArn for the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The order in which actions are run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-runorder)
       */
      override fun runOrder(): Number? = unwrap(this).getRunOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty):
          ActionDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty
    }
  }

  /**
   * The event criteria that specify when a specified repository event will start the pipeline for
   * the specified trigger configuration, such as the lists of Git tags to include and exclude.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitPushFilterProperty gitPushFilterProperty = GitPushFilterProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html)
   */
  public interface GitPushFilterProperty {
    /**
     * The field that specifies to filter on branches for the push trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-branches)
     */
    public fun branches(): Any? = unwrap(this).getBranches()

    /**
     * The field that specifies to filter on file paths for the push trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-filepaths)
     */
    public fun filePaths(): Any? = unwrap(this).getFilePaths()

    /**
     * The field that contains the details for the Git tags trigger configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-tags)
     */
    public fun tags(): GitTagFilterCriteriaProperty? =
        unwrap(this).getTags()?.let(GitTagFilterCriteriaProperty::wrap)

    /**
     * A builder for [GitPushFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      public fun branches(branches: IResolvable)

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      public fun branches(branches: GitBranchFilterCriteriaProperty)

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddc8d1d60a7c59dd92f9a3fd0b948aabdedb5c2a813e665f3425b043167ecfa2")
      public fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit)

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      public fun filePaths(filePaths: IResolvable)

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty)

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b1024504832e9322cad548b5af6f2fa09f8daa9df5ff97b0054f20f7aacb5e1")
      public fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit)

      /**
       * @param tags The field that contains the details for the Git tags trigger configuration.
       */
      public fun tags(tags: GitTagFilterCriteriaProperty)

      /**
       * @param tags The field that contains the details for the Git tags trigger configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44cf19020829a8aec87bbe2965c6e33acffa44c7665020066918b4a1aceb2cb9")
      public fun tags(tags: GitTagFilterCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty.builder()

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      override fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches.let(IResolvable::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddc8d1d60a7c59dd92f9a3fd0b948aabdedb5c2a813e665f3425b043167ecfa2")
      override fun branches(branches: GitBranchFilterCriteriaProperty.Builder.() -> Unit): Unit =
          branches(GitBranchFilterCriteriaProperty(branches))

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      override fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths.let(IResolvable::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b1024504832e9322cad548b5af6f2fa09f8daa9df5ff97b0054f20f7aacb5e1")
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty.Builder.() -> Unit): Unit
          = filePaths(GitFilePathFilterCriteriaProperty(filePaths))

      /**
       * @param tags The field that contains the details for the Git tags trigger configuration.
       */
      override fun tags(tags: GitTagFilterCriteriaProperty) {
        cdkBuilder.tags(tags.let(GitTagFilterCriteriaProperty::unwrap))
      }

      /**
       * @param tags The field that contains the details for the Git tags trigger configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44cf19020829a8aec87bbe2965c6e33acffa44c7665020066918b4a1aceb2cb9")
      override fun tags(tags: GitTagFilterCriteriaProperty.Builder.() -> Unit): Unit =
          tags(GitTagFilterCriteriaProperty(tags))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty,
    ) : CdkObject(cdkObject), GitPushFilterProperty {
      /**
       * The field that specifies to filter on branches for the push trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-branches)
       */
      override fun branches(): Any? = unwrap(this).getBranches()

      /**
       * The field that specifies to filter on file paths for the push trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-filepaths)
       */
      override fun filePaths(): Any? = unwrap(this).getFilePaths()

      /**
       * The field that contains the details for the Git tags trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html#cfn-codepipeline-pipeline-gitpushfilter-tags)
       */
      override fun tags(): GitTagFilterCriteriaProperty? =
          unwrap(this).getTags()?.let(GitTagFilterCriteriaProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitPushFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty):
          GitPushFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPushFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty
    }
  }

  /**
   * A variable declared at the pipeline level.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * VariableDeclarationProperty variableDeclarationProperty = VariableDeclarationProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .defaultValue("defaultValue")
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html)
   */
  public interface VariableDeclarationProperty {
    /**
     * The value of a pipeline-level variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The description of a pipeline-level variable.
     *
     * It's used to add additional context about the variable, and not being used at time when
     * pipeline executes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of a pipeline-level variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-name)
     */
    public fun name(): String

    /**
     * A builder for [VariableDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue The value of a pipeline-level variable.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param description The description of a pipeline-level variable.
       * It's used to add additional context about the variable, and not being used at time when
       * pipeline executes.
       */
      public fun description(description: String)

      /**
       * @param name The name of a pipeline-level variable. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty.builder()

      /**
       * @param defaultValue The value of a pipeline-level variable.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param description The description of a pipeline-level variable.
       * It's used to add additional context about the variable, and not being used at time when
       * pipeline executes.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name of a pipeline-level variable. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty,
    ) : CdkObject(cdkObject), VariableDeclarationProperty {
      /**
       * The value of a pipeline-level variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The description of a pipeline-level variable.
       *
       * It's used to add additional context about the variable, and not being used at time when
       * pipeline executes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of a pipeline-level variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html#cfn-codepipeline-pipeline-variabledeclaration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariableDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty):
          VariableDeclarationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty
    }
  }

  /**
   * The Git repository file paths specified as filter criteria to start the pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitFilePathFilterCriteriaProperty gitFilePathFilterCriteriaProperty =
   * GitFilePathFilterCriteriaProperty.builder()
   * .excludes(List.of("excludes"))
   * .includes(List.of("includes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html)
   */
  public interface GitFilePathFilterCriteriaProperty {
    /**
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be
     * excluded from starting the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html#cfn-codepipeline-pipeline-gitfilepathfiltercriteria-excludes)
     */
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    /**
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be
     * included as criteria that starts the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html#cfn-codepipeline-pipeline-gitfilepathfiltercriteria-includes)
     */
    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    /**
     * A builder for [GitFilePathFilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be excluded from starting the pipeline.
       */
      public fun excludes(excludes: List<String>)

      /**
       * @param excludes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be excluded from starting the pipeline.
       */
      public fun excludes(vararg excludes: String)

      /**
       * @param includes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be included as criteria that starts the pipeline.
       */
      public fun includes(includes: List<String>)

      /**
       * @param includes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be included as criteria that starts the pipeline.
       */
      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty.builder()

      /**
       * @param excludes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be excluded from starting the pipeline.
       */
      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      /**
       * @param excludes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be excluded from starting the pipeline.
       */
      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      /**
       * @param includes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be included as criteria that starts the pipeline.
       */
      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      /**
       * @param includes The list of patterns of Git repository file paths that, when a commit is
       * pushed, are to be included as criteria that starts the pipeline.
       */
      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitFilePathFilterCriteriaProperty {
      /**
       * The list of patterns of Git repository file paths that, when a commit is pushed, are to be
       * excluded from starting the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html#cfn-codepipeline-pipeline-gitfilepathfiltercriteria-excludes)
       */
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      /**
       * The list of patterns of Git repository file paths that, when a commit is pushed, are to be
       * included as criteria that starts the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html#cfn-codepipeline-pipeline-gitfilepathfiltercriteria-includes)
       */
      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GitFilePathFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty):
          GitFilePathFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitFilePathFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
    }
  }

  /**
   * The Git repository branches specified as filter criteria to start the pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * GitBranchFilterCriteriaProperty gitBranchFilterCriteriaProperty =
   * GitBranchFilterCriteriaProperty.builder()
   * .excludes(List.of("excludes"))
   * .includes(List.of("includes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitbranchfiltercriteria.html)
   */
  public interface GitBranchFilterCriteriaProperty {
    /**
     * The list of patterns of Git branches that, when a commit is pushed, are to be excluded from
     * starting the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitbranchfiltercriteria.html#cfn-codepipeline-pipeline-gitbranchfiltercriteria-excludes)
     */
    public fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

    /**
     * The list of patterns of Git branches that, when a commit is pushed, are to be included as
     * criteria that starts the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitbranchfiltercriteria.html#cfn-codepipeline-pipeline-gitbranchfiltercriteria-includes)
     */
    public fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()

    /**
     * A builder for [GitBranchFilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludes The list of patterns of Git branches that, when a commit is pushed, are to
       * be excluded from starting the pipeline.
       */
      public fun excludes(excludes: List<String>)

      /**
       * @param excludes The list of patterns of Git branches that, when a commit is pushed, are to
       * be excluded from starting the pipeline.
       */
      public fun excludes(vararg excludes: String)

      /**
       * @param includes The list of patterns of Git branches that, when a commit is pushed, are to
       * be included as criteria that starts the pipeline.
       */
      public fun includes(includes: List<String>)

      /**
       * @param includes The list of patterns of Git branches that, when a commit is pushed, are to
       * be included as criteria that starts the pipeline.
       */
      public fun includes(vararg includes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty.builder()

      /**
       * @param excludes The list of patterns of Git branches that, when a commit is pushed, are to
       * be excluded from starting the pipeline.
       */
      override fun excludes(excludes: List<String>) {
        cdkBuilder.excludes(excludes)
      }

      /**
       * @param excludes The list of patterns of Git branches that, when a commit is pushed, are to
       * be excluded from starting the pipeline.
       */
      override fun excludes(vararg excludes: String): Unit = excludes(excludes.toList())

      /**
       * @param includes The list of patterns of Git branches that, when a commit is pushed, are to
       * be included as criteria that starts the pipeline.
       */
      override fun includes(includes: List<String>) {
        cdkBuilder.includes(includes)
      }

      /**
       * @param includes The list of patterns of Git branches that, when a commit is pushed, are to
       * be included as criteria that starts the pipeline.
       */
      override fun includes(vararg includes: String): Unit = includes(includes.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty,
    ) : CdkObject(cdkObject), GitBranchFilterCriteriaProperty {
      /**
       * The list of patterns of Git branches that, when a commit is pushed, are to be excluded from
       * starting the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitbranchfiltercriteria.html#cfn-codepipeline-pipeline-gitbranchfiltercriteria-excludes)
       */
      override fun excludes(): List<String> = unwrap(this).getExcludes() ?: emptyList()

      /**
       * The list of patterns of Git branches that, when a commit is pushed, are to be included as
       * criteria that starts the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitbranchfiltercriteria.html#cfn-codepipeline-pipeline-gitbranchfiltercriteria-includes)
       */
      override fun includes(): List<String> = unwrap(this).getIncludes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitBranchFilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty):
          GitBranchFilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitBranchFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty
    }
  }
}
