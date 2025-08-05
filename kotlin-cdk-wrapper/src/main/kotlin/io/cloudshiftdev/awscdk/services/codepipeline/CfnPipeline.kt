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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * .commands(List.of("commands"))
 * .configuration(configuration)
 * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * // the properties below are optional
 * .type("type")
 * .build()))
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .namespace("namespace")
 * .outputArtifacts(List.of(OutputArtifactProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .files(List.of("files"))
 * .build()))
 * .outputVariables(List.of("outputVariables"))
 * .region("region")
 * .roleArn("roleArn")
 * .runOrder(123)
 * .timeoutInMinutes(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .beforeEntry(BeforeEntryConditionsProperty.builder()
 * .conditions(List.of(ConditionProperty.builder()
 * .result("result")
 * .rules(List.of(RuleDeclarationProperty.builder()
 * .commands(List.of("commands"))
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .region("region")
 * .roleArn("roleArn")
 * .ruleTypeId(RuleTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .build()))
 * .build()))
 * .build())
 * .blockers(List.of(BlockerDeclarationProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .onFailure(FailureConditionsProperty.builder()
 * .conditions(List.of(ConditionProperty.builder()
 * .result("result")
 * .rules(List.of(RuleDeclarationProperty.builder()
 * .commands(List.of("commands"))
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .region("region")
 * .roleArn("roleArn")
 * .ruleTypeId(RuleTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .build()))
 * .build()))
 * .result("result")
 * .retryConfiguration(RetryConfigurationProperty.builder()
 * .retryMode("retryMode")
 * .build())
 * .build())
 * .onSuccess(SuccessConditionsProperty.builder()
 * .conditions(List.of(ConditionProperty.builder()
 * .result("result")
 * .rules(List.of(RuleDeclarationProperty.builder()
 * .commands(List.of("commands"))
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .region("region")
 * .roleArn("roleArn")
 * .ruleTypeId(RuleTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .build()))
 * .build()))
 * .build())
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
public open class CfnPipeline(
  cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPipelineProps,
  ) :
      this(software.amazon.awscdk.services.codepipeline.CfnPipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPipelineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPipelineProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPipelineProps(props)
  )

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(): Any? = unwrap(this).getArtifactStore()

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(`value`: IResolvable) {
    unwrap(this).setArtifactStore(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The S3 bucket where artifacts for the pipeline are stored.
   */
  public open fun artifactStore(`value`: ArtifactStoreProperty) {
    unwrap(this).setArtifactStore(`value`.let(ArtifactStoreProperty.Companion::unwrap))
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
    unwrap(this).setArtifactStores(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(`value`: List<Any>) {
    unwrap(this).setArtifactStores(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A mapping of `artifactStore` objects and their corresponding AWS Regions.
   */
  public open fun artifactStores(vararg `value`: Any): Unit = artifactStores(`value`.toList())

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
    unwrap(this).setDisableInboundStageTransitions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Represents the input of a `DisableStageTransition` action.
   */
  public open fun disableInboundStageTransitions(`value`: List<Any>) {
    unwrap(this).setDisableInboundStageTransitions(`value`.map{CdkObjectWrappers.unwrap(it)})
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setRestartExecutionOnUpdate(`value`.let(IResolvable.Companion::unwrap))
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
    unwrap(this).setStages(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Represents information about a stage and its definition.
   */
  public open fun stages(`value`: List<Any>) {
    unwrap(this).setStages(`value`.map{CdkObjectWrappers.unwrap(it)})
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
    unwrap(this).setTriggers(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The trigger configuration specifying a type of event, such as Git tags, that starts the
   * pipeline.
   */
  public open fun triggers(`value`: List<Any>) {
    unwrap(this).setTriggers(`value`.map{CdkObjectWrappers.unwrap(it)})
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
    unwrap(this).setVariables(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   */
  public open fun variables(`value`: List<Any>) {
    unwrap(this).setVariables(`value`.map{CdkObjectWrappers.unwrap(it)})
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
     * Default: - "SUPERSEDED"
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
      cdkBuilder.artifactStore(artifactStore.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty.Companion::unwrap))
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
      cdkBuilder.artifactStores(artifactStores.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.artifactStores(artifactStores.map{CdkObjectWrappers.unwrap(it)})
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
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Represents the input of a `DisableStageTransition` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     * action. 
     */
    override fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.map{CdkObjectWrappers.unwrap(it)})
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
     * Default: - "SUPERSEDED"
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
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.stages(stages.let(IResolvable.Companion::unwrap))
    }

    /**
     * Represents information about a stage and its definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
     * @param stages Represents information about a stage and its definition. 
     */
    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages.map{CdkObjectWrappers.unwrap(it)})
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
      cdkBuilder.triggers(triggers.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.triggers(triggers.map{CdkObjectWrappers.unwrap(it)})
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
      cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.variables(variables.map{CdkObjectWrappers.unwrap(it)})
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
        software.amazon.awscdk.services.codepipeline.CfnPipeline = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.CfnPipeline
  }

  /**
   * Represents information about an action declaration.
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
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build()))
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .namespace("namespace")
   * .outputArtifacts(List.of(OutputArtifactProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .files(List.of("files"))
   * .build()))
   * .outputVariables(List.of("outputVariables"))
   * .region("region")
   * .roleArn("roleArn")
   * .runOrder(123)
   * .timeoutInMinutes(123)
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
     * The shell commands to run with your compute action in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used, you do not need to create any resources in CodeBuild.
     *
     *
     * Using compute time for this action will incur separate charges in AWS CodeBuild .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-commands)
     */
    public fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

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
     * The environment variables for the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-environmentvariables)
     */
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

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
     * The list of variables that are to be exported from the compute action.
     *
     * This is specifically CodeBuild environment variables as used for that action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-outputvariables)
     */
    public fun outputVariables(): List<String> = unwrap(this).getOutputVariables() ?: emptyList()

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
     * A timeout duration in minutes that can be applied against the ActionType’s default timeout
     * value specified in [Quotas for AWS
     * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/limits.html) . This
     * attribute is available only to the manual approval ActionType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-timeoutinminutes)
     */
    public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

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
       * @param commands The shell commands to run with your compute action in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      public fun commands(commands: List<String>)

      /**
       * @param commands The shell commands to run with your compute action in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      public fun commands(vararg commands: String)

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
       * @param environmentVariables The environment variables for the action.
       */
      public fun environmentVariables(environmentVariables: IResolvable)

      /**
       * @param environmentVariables The environment variables for the action.
       */
      public fun environmentVariables(environmentVariables: List<Any>)

      /**
       * @param environmentVariables The environment variables for the action.
       */
      public fun environmentVariables(vararg environmentVariables: Any)

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
       * @param outputVariables The list of variables that are to be exported from the compute
       * action.
       * This is specifically CodeBuild environment variables as used for that action.
       */
      public fun outputVariables(outputVariables: List<String>)

      /**
       * @param outputVariables The list of variables that are to be exported from the compute
       * action.
       * This is specifically CodeBuild environment variables as used for that action.
       */
      public fun outputVariables(vararg outputVariables: String)

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

      /**
       * @param timeoutInMinutes A timeout duration in minutes that can be applied against the
       * ActionType’s default timeout value specified in [Quotas for AWS
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/limits.html) . This
       * attribute is available only to the manual approval ActionType.
       */
      public fun timeoutInMinutes(timeoutInMinutes: Number)
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
        cdkBuilder.actionTypeId(actionTypeId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      override fun actionTypeId(actionTypeId: ActionTypeIdProperty) {
        cdkBuilder.actionTypeId(actionTypeId.let(ActionTypeIdProperty.Companion::unwrap))
      }

      /**
       * @param actionTypeId Specifies the action type and the provider of the action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2092269ef9990e90dc63fe85f23371fa1920f3a0164d9fae3941e98a5e81871")
      override fun actionTypeId(actionTypeId: ActionTypeIdProperty.Builder.() -> Unit): Unit =
          actionTypeId(ActionTypeIdProperty(actionTypeId))

      /**
       * @param commands The shell commands to run with your compute action in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      override fun commands(commands: List<String>) {
        cdkBuilder.commands(commands)
      }

      /**
       * @param commands The shell commands to run with your compute action in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      override fun commands(vararg commands: String): Unit = commands(commands.toList())

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
       * @param environmentVariables The environment variables for the action.
       */
      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentVariables The environment variables for the action.
       */
      override fun environmentVariables(environmentVariables: List<Any>) {
        cdkBuilder.environmentVariables(environmentVariables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environmentVariables The environment variables for the action.
       */
      override fun environmentVariables(vararg environmentVariables: Any): Unit =
          environmentVariables(environmentVariables.toList())

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
        cdkBuilder.inputArtifacts(inputArtifacts.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.inputArtifacts(inputArtifacts.map{CdkObjectWrappers.unwrap(it)})
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
        cdkBuilder.outputArtifacts(outputArtifacts.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.outputArtifacts(outputArtifacts.map{CdkObjectWrappers.unwrap(it)})
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
       * @param outputVariables The list of variables that are to be exported from the compute
       * action.
       * This is specifically CodeBuild environment variables as used for that action.
       */
      override fun outputVariables(outputVariables: List<String>) {
        cdkBuilder.outputVariables(outputVariables)
      }

      /**
       * @param outputVariables The list of variables that are to be exported from the compute
       * action.
       * This is specifically CodeBuild environment variables as used for that action.
       */
      override fun outputVariables(vararg outputVariables: String): Unit =
          outputVariables(outputVariables.toList())

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

      /**
       * @param timeoutInMinutes A timeout duration in minutes that can be applied against the
       * ActionType’s default timeout value specified in [Quotas for AWS
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/limits.html) . This
       * attribute is available only to the manual approval ActionType.
       */
      override fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty,
    ) : CdkObject(cdkObject),
        ActionDeclarationProperty {
      /**
       * Specifies the action type and the provider of the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-actiontypeid)
       */
      override fun actionTypeId(): Any = unwrap(this).getActionTypeId()

      /**
       * The shell commands to run with your compute action in CodePipeline.
       *
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-commands)
       */
      override fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

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
       * The environment variables for the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-environmentvariables)
       */
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

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
       * The list of variables that are to be exported from the compute action.
       *
       * This is specifically CodeBuild environment variables as used for that action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-outputvariables)
       */
      override fun outputVariables(): List<String> = unwrap(this).getOutputVariables() ?:
          emptyList()

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

      /**
       * A timeout duration in minutes that can be applied against the ActionType’s default timeout
       * value specified in [Quotas for AWS
       * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/limits.html) . This
       * attribute is available only to the manual approval ActionType.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html#cfn-codepipeline-pipeline-actiondeclaration-timeoutinminutes)
       */
      override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty):
          ActionDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActionDeclarationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty
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
     * * `Compute`
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
       * * `Compute`
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
       * * `Compute`
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty,
    ) : CdkObject(cdkObject),
        ActionTypeIdProperty {
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
       * * `Compute`
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
          ActionTypeIdProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionTypeIdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionTypeIdProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty
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
        cdkBuilder.artifactStore(artifactStore.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.artifactStore(artifactStore.let(ArtifactStoreProperty.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty,
    ) : CdkObject(cdkObject),
        ArtifactStoreMapProperty {
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
          ArtifactStoreMapProperty = CdkObjectWrappers.wrap(cdkObject) as? ArtifactStoreMapProperty
          ?: Wrapper(cdkObject)

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
        cdkBuilder.encryptionKey(encryptionKey.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.encryptionKey(encryptionKey.let(EncryptionKeyProperty.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty,
    ) : CdkObject(cdkObject),
        ArtifactStoreProperty {
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
          ArtifactStoreProperty = CdkObjectWrappers.wrap(cdkObject) as? ArtifactStoreProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactStoreProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty
    }
  }

  /**
   * The conditions for making checks for entry to a stage.
   *
   * For more information about conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
   * [How do stage conditions
   * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * BeforeEntryConditionsProperty beforeEntryConditionsProperty =
   * BeforeEntryConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-beforeentryconditions.html)
   */
  public interface BeforeEntryConditionsProperty {
    /**
     * The conditions that are configured as entry conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-beforeentryconditions.html#cfn-codepipeline-pipeline-beforeentryconditions-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * A builder for [BeforeEntryConditionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      public fun conditions(vararg conditions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty.builder()

      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions The conditions that are configured as entry conditions.
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty,
    ) : CdkObject(cdkObject),
        BeforeEntryConditionsProperty {
      /**
       * The conditions that are configured as entry conditions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-beforeentryconditions.html#cfn-codepipeline-pipeline-beforeentryconditions-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BeforeEntryConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty):
          BeforeEntryConditionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BeforeEntryConditionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BeforeEntryConditionsProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BeforeEntryConditionsProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty,
    ) : CdkObject(cdkObject),
        BlockerDeclarationProperty {
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
          BlockerDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlockerDeclarationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty
    }
  }

  /**
   * The condition for the stage.
   *
   * A condition is made up of the rules and the result for the condition. For more information
   * about conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
   * [How do stage conditions
   * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
   * .. For more information about rules, see the [AWS CodePipeline rule
   * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-condition.html)
   */
  public interface ConditionProperty {
    /**
     * The action to be done when the condition is met.
     *
     * For example, rolling back an execution for a failure condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-condition.html#cfn-codepipeline-pipeline-condition-result)
     */
    public fun result(): String? = unwrap(this).getResult()

    /**
     * The rules that make up the condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-condition.html#cfn-codepipeline-pipeline-condition-rules)
     */
    public fun rules(): Any? = unwrap(this).getRules()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param result The action to be done when the condition is met.
       * For example, rolling back an execution for a failure condition.
       */
      public fun result(result: String)

      /**
       * @param rules The rules that make up the condition.
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The rules that make up the condition.
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The rules that make up the condition.
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty.builder()

      /**
       * @param result The action to be done when the condition is met.
       * For example, rolling back an execution for a failure condition.
       */
      override fun result(result: String) {
        cdkBuilder.result(result)
      }

      /**
       * @param rules The rules that make up the condition.
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rules The rules that make up the condition.
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param rules The rules that make up the condition.
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty,
    ) : CdkObject(cdkObject),
        ConditionProperty {
      /**
       * The action to be done when the condition is met.
       *
       * For example, rolling back an execution for a failure condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-condition.html#cfn-codepipeline-pipeline-condition-result)
       */
      override fun result(): String? = unwrap(this).getResult()

      /**
       * The rules that make up the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-condition.html#cfn-codepipeline-pipeline-condition-rules)
       */
      override fun rules(): Any? = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.ConditionProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty,
    ) : CdkObject(cdkObject),
        EncryptionKeyProperty {
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
          EncryptionKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionKeyProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty
    }
  }

  /**
   * The environment variables for the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html)
   */
  public interface EnvironmentVariableProperty {
    /**
     * The environment variable name in the key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-name)
     */
    public fun name(): String

    /**
     * Specifies the type of use for the environment variable value.
     *
     * The value can be either `PLAINTEXT` or `SECRETS_MANAGER` . If the value is `SECRETS_MANAGER`
     * , provide the Secrets reference in the EnvironmentVariable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The environment variable value in the key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The environment variable name in the key-value pair. 
       */
      public fun name(name: String)

      /**
       * @param type Specifies the type of use for the environment variable value.
       * The value can be either `PLAINTEXT` or `SECRETS_MANAGER` . If the value is
       * `SECRETS_MANAGER` , provide the Secrets reference in the EnvironmentVariable value.
       */
      public fun type(type: String)

      /**
       * @param value The environment variable value in the key-value pair. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty.builder()

      /**
       * @param name The environment variable name in the key-value pair. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Specifies the type of use for the environment variable value.
       * The value can be either `PLAINTEXT` or `SECRETS_MANAGER` . If the value is
       * `SECRETS_MANAGER` , provide the Secrets reference in the EnvironmentVariable value.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The environment variable value in the key-value pair. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject),
        EnvironmentVariableProperty {
      /**
       * The environment variable name in the key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Specifies the type of use for the environment variable value.
       *
       * The value can be either `PLAINTEXT` or `SECRETS_MANAGER` . If the value is
       * `SECRETS_MANAGER` , provide the Secrets reference in the EnvironmentVariable value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The environment variable value in the key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-environmentvariable.html#cfn-codepipeline-pipeline-environmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty):
          EnvironmentVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.EnvironmentVariableProperty
    }
  }

  /**
   * The configuration that specifies the result, such as rollback, to occur upon stage failure.
   *
   * For more information about conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
   * [How do stage conditions
   * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * FailureConditionsProperty failureConditionsProperty = FailureConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .result("result")
   * .retryConfiguration(RetryConfigurationProperty.builder()
   * .retryMode("retryMode")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html)
   */
  public interface FailureConditionsProperty {
    /**
     * The conditions that are configured as failure conditions.
     *
     * For more information about conditions, see [Stage
     * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
     * [How do stage conditions
     * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * The specified result for when the failure conditions are met, such as rolling back the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-result)
     */
    public fun result(): String? = unwrap(this).getResult()

    /**
     * The retry configuration specifies automatic retry for a failed stage, along with the
     * configured retry mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-retryconfiguration)
     */
    public fun retryConfiguration(): Any? = unwrap(this).getRetryConfiguration()

    /**
     * A builder for [FailureConditionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      public fun conditions(vararg conditions: Any)

      /**
       * @param result The specified result for when the failure conditions are met, such as rolling
       * back the stage.
       */
      public fun result(result: String)

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      public fun retryConfiguration(retryConfiguration: IResolvable)

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      public fun retryConfiguration(retryConfiguration: RetryConfigurationProperty)

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d12112b500e01adb31da47cdca5f39d3da7575bfa0423cb60c0699532e9b1d9a")
      public
          fun retryConfiguration(retryConfiguration: RetryConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty.builder()

      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions The conditions that are configured as failure conditions.
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      /**
       * @param result The specified result for when the failure conditions are met, such as rolling
       * back the stage.
       */
      override fun result(result: String) {
        cdkBuilder.result(result)
      }

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      override fun retryConfiguration(retryConfiguration: IResolvable) {
        cdkBuilder.retryConfiguration(retryConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      override fun retryConfiguration(retryConfiguration: RetryConfigurationProperty) {
        cdkBuilder.retryConfiguration(retryConfiguration.let(RetryConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param retryConfiguration The retry configuration specifies automatic retry for a failed
       * stage, along with the configured retry mode.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d12112b500e01adb31da47cdca5f39d3da7575bfa0423cb60c0699532e9b1d9a")
      override
          fun retryConfiguration(retryConfiguration: RetryConfigurationProperty.Builder.() -> Unit):
          Unit = retryConfiguration(RetryConfigurationProperty(retryConfiguration))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty,
    ) : CdkObject(cdkObject),
        FailureConditionsProperty {
      /**
       * The conditions that are configured as failure conditions.
       *
       * For more information about conditions, see [Stage
       * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html)
       * and [How do stage conditions
       * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()

      /**
       * The specified result for when the failure conditions are met, such as rolling back the
       * stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-result)
       */
      override fun result(): String? = unwrap(this).getResult()

      /**
       * The retry configuration specifies automatic retry for a failed stage, along with the
       * configured retry mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-failureconditions.html#cfn-codepipeline-pipeline-failureconditions-retryconfiguration)
       */
      override fun retryConfiguration(): Any? = unwrap(this).getRetryConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailureConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty):
          FailureConditionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FailureConditionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailureConditionsProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.FailureConditionsProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty,
    ) : CdkObject(cdkObject),
        GitBranchFilterCriteriaProperty {
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
          GitBranchFilterCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GitBranchFilterCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitBranchFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitBranchFilterCriteriaProperty
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
        cdkBuilder.pullRequest(pullRequest.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param pullRequest The field where the repository event that will start the pipeline is
       * specified as pull requests.
       */
      override fun pullRequest(pullRequest: List<Any>) {
        cdkBuilder.pullRequest(pullRequest.map{CdkObjectWrappers.unwrap(it)})
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
        cdkBuilder.push(push.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param push The field where the repository event that will start the pipeline, such as
       * pushing Git tags, is specified with details.
       */
      override fun push(push: List<Any>) {
        cdkBuilder.push(push.map{CdkObjectWrappers.unwrap(it)})
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty,
    ) : CdkObject(cdkObject),
        GitConfigurationProperty {
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
          GitConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? GitConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitConfigurationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitConfigurationProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty,
    ) : CdkObject(cdkObject),
        GitFilePathFilterCriteriaProperty {
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
          GitFilePathFilterCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GitFilePathFilterCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitFilePathFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitFilePathFilterCriteriaProperty
    }
  }

  /**
   * The event criteria for the pull request trigger configuration, such as the lists of branches or
   * file paths to include and exclude.
   *
   * The following are valid values for the events for this filter:
   *
   * * CLOSED
   * * OPEN
   * * UPDATED
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
     * The field that specifies which pull request events to filter on (OPEN, UPDATED, CLOSED) for
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
       * @param events The field that specifies which pull request events to filter on (OPEN,
       * UPDATED, CLOSED) for the trigger configuration.
       */
      public fun events(events: List<String>)

      /**
       * @param events The field that specifies which pull request events to filter on (OPEN,
       * UPDATED, CLOSED) for the trigger configuration.
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
        cdkBuilder.branches(branches.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the pull request trigger
       * configuration.
       */
      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty.Companion::unwrap))
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
       * @param events The field that specifies which pull request events to filter on (OPEN,
       * UPDATED, CLOSED) for the trigger configuration.
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The field that specifies which pull request events to filter on (OPEN,
       * UPDATED, CLOSED) for the trigger configuration.
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      override fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the pull request
       * trigger configuration.
       */
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty,
    ) : CdkObject(cdkObject),
        GitPullRequestFilterProperty {
      /**
       * The field that specifies to filter on branches for the pull request trigger configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html#cfn-codepipeline-pipeline-gitpullrequestfilter-branches)
       */
      override fun branches(): Any? = unwrap(this).getBranches()

      /**
       * The field that specifies which pull request events to filter on (OPEN, UPDATED, CLOSED) for
       * the trigger configuration.
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
          GitPullRequestFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GitPullRequestFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPullRequestFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPullRequestFilterProperty
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
        cdkBuilder.branches(branches.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param branches The field that specifies to filter on branches for the push trigger
       * configuration.
       */
      override fun branches(branches: GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches.let(GitBranchFilterCriteriaProperty.Companion::unwrap))
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
        cdkBuilder.filePaths(filePaths.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filePaths The field that specifies to filter on file paths for the push trigger
       * configuration.
       */
      override fun filePaths(filePaths: GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths.let(GitFilePathFilterCriteriaProperty.Companion::unwrap))
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
        cdkBuilder.tags(tags.let(GitTagFilterCriteriaProperty.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty,
    ) : CdkObject(cdkObject),
        GitPushFilterProperty {
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
          GitPushFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? GitPushFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitPushFilterProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitPushFilterProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty,
    ) : CdkObject(cdkObject),
        GitTagFilterCriteriaProperty {
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
          GitTagFilterCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GitTagFilterCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitTagFilterCriteriaProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.GitTagFilterCriteriaProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty,
    ) : CdkObject(cdkObject),
        InputArtifactProperty {
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
          InputArtifactProperty = CdkObjectWrappers.wrap(cdkObject) as? InputArtifactProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty
    }
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
   * // the properties below are optional
   * .files(List.of("files"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html)
   */
  public interface OutputArtifactProperty {
    /**
     * The files that you want to associate with the output artifact that will be exported from the
     * compute action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html#cfn-codepipeline-pipeline-outputartifact-files)
     */
    public fun files(): List<String> = unwrap(this).getFiles() ?: emptyList()

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
       * @param files The files that you want to associate with the output artifact that will be
       * exported from the compute action.
       */
      public fun files(files: List<String>)

      /**
       * @param files The files that you want to associate with the output artifact that will be
       * exported from the compute action.
       */
      public fun files(vararg files: String)

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
       * @param files The files that you want to associate with the output artifact that will be
       * exported from the compute action.
       */
      override fun files(files: List<String>) {
        cdkBuilder.files(files)
      }

      /**
       * @param files The files that you want to associate with the output artifact that will be
       * exported from the compute action.
       */
      override fun files(vararg files: String): Unit = files(files.toList())

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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty,
    ) : CdkObject(cdkObject),
        OutputArtifactProperty {
      /**
       * The files that you want to associate with the output artifact that will be exported from
       * the compute action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html#cfn-codepipeline-pipeline-outputartifact-files)
       */
      override fun files(): List<String> = unwrap(this).getFiles() ?: emptyList()

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
          OutputArtifactProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputArtifactProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputArtifactProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty
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
        cdkBuilder.gitConfiguration(gitConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param gitConfiguration Provides the filter criteria and the source stage for the
       * repository event that starts the pipeline, such as Git tags.
       */
      override fun gitConfiguration(gitConfiguration: GitConfigurationProperty) {
        cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfigurationProperty.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty,
    ) : CdkObject(cdkObject),
        PipelineTriggerDeclarationProperty {
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
          PipelineTriggerDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PipelineTriggerDeclarationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineTriggerDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.PipelineTriggerDeclarationProperty
    }
  }

  /**
   * The retry configuration specifies automatic retry for a failed stage, along with the configured
   * retry mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * RetryConfigurationProperty retryConfigurationProperty = RetryConfigurationProperty.builder()
   * .retryMode("retryMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-retryconfiguration.html)
   */
  public interface RetryConfigurationProperty {
    /**
     * The method that you want to configure for automatic stage retry on stage failure.
     *
     * You can specify to retry only failed action in the stage or all actions in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-retryconfiguration.html#cfn-codepipeline-pipeline-retryconfiguration-retrymode)
     */
    public fun retryMode(): String? = unwrap(this).getRetryMode()

    /**
     * A builder for [RetryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retryMode The method that you want to configure for automatic stage retry on stage
       * failure.
       * You can specify to retry only failed action in the stage or all actions in the stage.
       */
      public fun retryMode(retryMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty.builder()

      /**
       * @param retryMode The method that you want to configure for automatic stage retry on stage
       * failure.
       * You can specify to retry only failed action in the stage or all actions in the stage.
       */
      override fun retryMode(retryMode: String) {
        cdkBuilder.retryMode(retryMode)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetryConfigurationProperty {
      /**
       * The method that you want to configure for automatic stage retry on stage failure.
       *
       * You can specify to retry only failed action in the stage or all actions in the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-retryconfiguration.html#cfn-codepipeline-pipeline-retryconfiguration-retrymode)
       */
      override fun retryMode(): String? = unwrap(this).getRetryMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty):
          RetryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryConfigurationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RetryConfigurationProperty
    }
  }

  /**
   * Represents information about the rule to be created for an associated condition.
   *
   * An example would be creating a new rule for an entry condition, such as a rule that checks for
   * a test result before allowing the run to enter the deployment stage. For more information about
   * conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
   * [How do stage conditions
   * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
   * . For more information about rules, see the [AWS CodePipeline rule
   * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * RuleDeclarationProperty ruleDeclarationProperty = RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html)
   */
  public interface RuleDeclarationProperty {
    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used, you do not need to create any resources in CodeBuild.
     *
     *
     * Using compute time for this action will incur separate charges in AWS CodeBuild .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-commands)
     */
    public fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

    /**
     * The action configuration fields for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-inputartifacts)
     */
    public fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

    /**
     * The name of the rule that is created for the condition, such as `VariableCheck` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The Region for the condition associated with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * The pipeline role ARN associated with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The ID for the rule type, which is made up of the combined values for category, owner,
     * provider, and version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-ruletypeid)
     */
    public fun ruleTypeId(): Any? = unwrap(this).getRuleTypeId()

    /**
     * A builder for [RuleDeclarationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commands The shell commands to run with your commands rule in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      public fun commands(commands: List<String>)

      /**
       * @param commands The shell commands to run with your commands rule in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      public fun commands(vararg commands: String)

      /**
       * @param configuration The action configuration fields for the rule.
       */
      public fun configuration(configuration: Any)

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      public fun inputArtifacts(inputArtifacts: IResolvable)

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      public fun inputArtifacts(inputArtifacts: List<Any>)

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      public fun inputArtifacts(vararg inputArtifacts: Any)

      /**
       * @param name The name of the rule that is created for the condition, such as `VariableCheck`
       * .
       */
      public fun name(name: String)

      /**
       * @param region The Region for the condition associated with the rule.
       */
      public fun region(region: String)

      /**
       * @param roleArn The pipeline role ARN associated with the rule.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      public fun ruleTypeId(ruleTypeId: IResolvable)

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      public fun ruleTypeId(ruleTypeId: RuleTypeIdProperty)

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61b2082f5015c0f123336765dcaa6a805691941bf3776ff63854afb715a827e1")
      public fun ruleTypeId(ruleTypeId: RuleTypeIdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty.builder()

      /**
       * @param commands The shell commands to run with your commands rule in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      override fun commands(commands: List<String>) {
        cdkBuilder.commands(commands)
      }

      /**
       * @param commands The shell commands to run with your commands rule in CodePipeline.
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       */
      override fun commands(vararg commands: String): Unit = commands(commands.toList())

      /**
       * @param configuration The action configuration fields for the rule.
       */
      override fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
      }

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      override fun inputArtifacts(inputArtifacts: IResolvable) {
        cdkBuilder.inputArtifacts(inputArtifacts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      override fun inputArtifacts(inputArtifacts: List<Any>) {
        cdkBuilder.inputArtifacts(inputArtifacts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
       * file for the rule.
       */
      override fun inputArtifacts(vararg inputArtifacts: Any): Unit =
          inputArtifacts(inputArtifacts.toList())

      /**
       * @param name The name of the rule that is created for the condition, such as `VariableCheck`
       * .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param region The Region for the condition associated with the rule.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param roleArn The pipeline role ARN associated with the rule.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      override fun ruleTypeId(ruleTypeId: IResolvable) {
        cdkBuilder.ruleTypeId(ruleTypeId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      override fun ruleTypeId(ruleTypeId: RuleTypeIdProperty) {
        cdkBuilder.ruleTypeId(ruleTypeId.let(RuleTypeIdProperty.Companion::unwrap))
      }

      /**
       * @param ruleTypeId The ID for the rule type, which is made up of the combined values for
       * category, owner, provider, and version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61b2082f5015c0f123336765dcaa6a805691941bf3776ff63854afb715a827e1")
      override fun ruleTypeId(ruleTypeId: RuleTypeIdProperty.Builder.() -> Unit): Unit =
          ruleTypeId(RuleTypeIdProperty(ruleTypeId))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty,
    ) : CdkObject(cdkObject),
        RuleDeclarationProperty {
      /**
       * The shell commands to run with your commands rule in CodePipeline.
       *
       * All commands are supported except multi-line formats. While CodeBuild logs and permissions
       * are used, you do not need to create any resources in CodeBuild.
       *
       *
       * Using compute time for this action will incur separate charges in AWS CodeBuild .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-commands)
       */
      override fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

      /**
       * The action configuration fields for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * The input artifacts fields for the rule, such as specifying an input file for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-inputartifacts)
       */
      override fun inputArtifacts(): Any? = unwrap(this).getInputArtifacts()

      /**
       * The name of the rule that is created for the condition, such as `VariableCheck` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The Region for the condition associated with the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * The pipeline role ARN associated with the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The ID for the rule type, which is made up of the combined values for category, owner,
       * provider, and version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruledeclaration.html#cfn-codepipeline-pipeline-ruledeclaration-ruletypeid)
       */
      override fun ruleTypeId(): Any? = unwrap(this).getRuleTypeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty):
          RuleDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleDeclarationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleDeclarationProperty
    }
  }

  /**
   * The ID for the rule type, which is made up of the combined values for category, owner,
   * provider, and version.
   *
   * For more information about conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) . For
   * more information about rules, see the [AWS CodePipeline rule
   * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * RuleTypeIdProperty ruleTypeIdProperty = RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html)
   */
  public interface RuleTypeIdProperty {
    /**
     * A category defines what kind of rule can be run in the stage, and constrains the provider
     * type for the rule.
     *
     * The valid category is `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-category)
     */
    public fun category(): String? = unwrap(this).getCategory()

    /**
     * The creator of the rule being called.
     *
     * The valid value for the `Owner` field in the rule category is `AWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-owner)
     */
    public fun owner(): String? = unwrap(this).getOwner()

    /**
     * The rule provider, such as the `DeploymentWindow` rule.
     *
     * For a list of rule provider names, see the rules listed in the [AWS CodePipeline rule
     * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-provider)
     */
    public fun provider(): String? = unwrap(this).getProvider()

    /**
     * A string that describes the rule version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [RuleTypeIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param category A category defines what kind of rule can be run in the stage, and
       * constrains the provider type for the rule.
       * The valid category is `Rule` .
       */
      public fun category(category: String)

      /**
       * @param owner The creator of the rule being called.
       * The valid value for the `Owner` field in the rule category is `AWS` .
       */
      public fun owner(owner: String)

      /**
       * @param provider The rule provider, such as the `DeploymentWindow` rule.
       * For a list of rule provider names, see the rules listed in the [AWS CodePipeline rule
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
       */
      public fun provider(provider: String)

      /**
       * @param version A string that describes the rule version.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty.Builder =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty.builder()

      /**
       * @param category A category defines what kind of rule can be run in the stage, and
       * constrains the provider type for the rule.
       * The valid category is `Rule` .
       */
      override fun category(category: String) {
        cdkBuilder.category(category)
      }

      /**
       * @param owner The creator of the rule being called.
       * The valid value for the `Owner` field in the rule category is `AWS` .
       */
      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      /**
       * @param provider The rule provider, such as the `DeploymentWindow` rule.
       * For a list of rule provider names, see the rules listed in the [AWS CodePipeline rule
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
       */
      override fun provider(provider: String) {
        cdkBuilder.provider(provider)
      }

      /**
       * @param version A string that describes the rule version.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty,
    ) : CdkObject(cdkObject),
        RuleTypeIdProperty {
      /**
       * A category defines what kind of rule can be run in the stage, and constrains the provider
       * type for the rule.
       *
       * The valid category is `Rule` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-category)
       */
      override fun category(): String? = unwrap(this).getCategory()

      /**
       * The creator of the rule being called.
       *
       * The valid value for the `Owner` field in the rule category is `AWS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-owner)
       */
      override fun owner(): String? = unwrap(this).getOwner()

      /**
       * The rule provider, such as the `DeploymentWindow` rule.
       *
       * For a list of rule provider names, see the rules listed in the [AWS CodePipeline rule
       * reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/rule-reference.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-provider)
       */
      override fun provider(): String? = unwrap(this).getProvider()

      /**
       * A string that describes the rule version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-ruletypeid.html#cfn-codepipeline-pipeline-ruletypeid-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleTypeIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty):
          RuleTypeIdProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleTypeIdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleTypeIdProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.RuleTypeIdProperty
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
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build()))
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .namespace("namespace")
   * .outputArtifacts(List.of(OutputArtifactProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .files(List.of("files"))
   * .build()))
   * .outputVariables(List.of("outputVariables"))
   * .region("region")
   * .roleArn("roleArn")
   * .runOrder(123)
   * .timeoutInMinutes(123)
   * .build()))
   * .name("name")
   * // the properties below are optional
   * .beforeEntry(BeforeEntryConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .build())
   * .blockers(List.of(BlockerDeclarationProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .onFailure(FailureConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .result("result")
   * .retryConfiguration(RetryConfigurationProperty.builder()
   * .retryMode("retryMode")
   * .build())
   * .build())
   * .onSuccess(SuccessConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .build())
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
     * The method to use when a stage allows entry.
     *
     * For example, configuring this field for conditions will allow entry to the stage when the
     * conditions are met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-beforeentry)
     */
    public fun beforeEntry(): Any? = unwrap(this).getBeforeEntry()

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
     * The method to use when a stage has not completed successfully.
     *
     * For example, configuring this field for rollback will roll back a failed stage automatically
     * to the last successful pipeline execution in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-onfailure)
     */
    public fun onFailure(): Any? = unwrap(this).getOnFailure()

    /**
     * The method to use when a stage has succeeded.
     *
     * For example, configuring this field for conditions will allow the stage to succeed when the
     * conditions are met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-onsuccess)
     */
    public fun onSuccess(): Any? = unwrap(this).getOnSuccess()

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
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      public fun beforeEntry(beforeEntry: IResolvable)

      /**
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      public fun beforeEntry(beforeEntry: BeforeEntryConditionsProperty)

      /**
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dbb1eab7fd97554a551465e01e2d90a907e6441fabdefbb53d7df95a84480be")
      public fun beforeEntry(beforeEntry: BeforeEntryConditionsProperty.Builder.() -> Unit)

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

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      public fun onFailure(onFailure: FailureConditionsProperty)

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c6e0dbf179ccee8d0ab2dabb47f8a736d9ad278bda6cb08974dc4dccb574cb9")
      public fun onFailure(onFailure: FailureConditionsProperty.Builder.() -> Unit)

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      public fun onSuccess(onSuccess: IResolvable)

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      public fun onSuccess(onSuccess: SuccessConditionsProperty)

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b06be9ab8f13ba274fdd172a8d20effc92949b4f771014843c72951c2342466b")
      public fun onSuccess(onSuccess: SuccessConditionsProperty.Builder.() -> Unit)
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
        cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actions The actions included in a stage. 
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param actions The actions included in a stage. 
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      override fun beforeEntry(beforeEntry: IResolvable) {
        cdkBuilder.beforeEntry(beforeEntry.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      override fun beforeEntry(beforeEntry: BeforeEntryConditionsProperty) {
        cdkBuilder.beforeEntry(beforeEntry.let(BeforeEntryConditionsProperty.Companion::unwrap))
      }

      /**
       * @param beforeEntry The method to use when a stage allows entry.
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dbb1eab7fd97554a551465e01e2d90a907e6441fabdefbb53d7df95a84480be")
      override fun beforeEntry(beforeEntry: BeforeEntryConditionsProperty.Builder.() -> Unit): Unit
          = beforeEntry(BeforeEntryConditionsProperty(beforeEntry))

      /**
       * @param blockers Reserved for future use.
       */
      override fun blockers(blockers: IResolvable) {
        cdkBuilder.blockers(blockers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blockers Reserved for future use.
       */
      override fun blockers(blockers: List<Any>) {
        cdkBuilder.blockers(blockers.map{CdkObjectWrappers.unwrap(it)})
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

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      override fun onFailure(onFailure: FailureConditionsProperty) {
        cdkBuilder.onFailure(onFailure.let(FailureConditionsProperty.Companion::unwrap))
      }

      /**
       * @param onFailure The method to use when a stage has not completed successfully.
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c6e0dbf179ccee8d0ab2dabb47f8a736d9ad278bda6cb08974dc4dccb574cb9")
      override fun onFailure(onFailure: FailureConditionsProperty.Builder.() -> Unit): Unit =
          onFailure(FailureConditionsProperty(onFailure))

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      override fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      override fun onSuccess(onSuccess: SuccessConditionsProperty) {
        cdkBuilder.onSuccess(onSuccess.let(SuccessConditionsProperty.Companion::unwrap))
      }

      /**
       * @param onSuccess The method to use when a stage has succeeded.
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b06be9ab8f13ba274fdd172a8d20effc92949b4f771014843c72951c2342466b")
      override fun onSuccess(onSuccess: SuccessConditionsProperty.Builder.() -> Unit): Unit =
          onSuccess(SuccessConditionsProperty(onSuccess))

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty,
    ) : CdkObject(cdkObject),
        StageDeclarationProperty {
      /**
       * The actions included in a stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * The method to use when a stage allows entry.
       *
       * For example, configuring this field for conditions will allow entry to the stage when the
       * conditions are met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-beforeentry)
       */
      override fun beforeEntry(): Any? = unwrap(this).getBeforeEntry()

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

      /**
       * The method to use when a stage has not completed successfully.
       *
       * For example, configuring this field for rollback will roll back a failed stage
       * automatically to the last successful pipeline execution in the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-onfailure)
       */
      override fun onFailure(): Any? = unwrap(this).getOnFailure()

      /**
       * The method to use when a stage has succeeded.
       *
       * For example, configuring this field for conditions will allow the stage to succeed when the
       * conditions are met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html#cfn-codepipeline-pipeline-stagedeclaration-onsuccess)
       */
      override fun onSuccess(): Any? = unwrap(this).getOnSuccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageDeclarationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty):
          StageDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as? StageDeclarationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty,
    ) : CdkObject(cdkObject),
        StageTransitionProperty {
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
          StageTransitionProperty = CdkObjectWrappers.wrap(cdkObject) as? StageTransitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageTransitionProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty
    }
  }

  /**
   * The conditions for making checks that, if met, succeed a stage.
   *
   * For more information about conditions, see [Stage
   * conditions](https://docs.aws.amazon.com/codepipeline/latest/userguide/stage-conditions.html) and
   * [How do stage conditions
   * work?](https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-how-it-works-conditions.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codepipeline.*;
   * Object configuration;
   * SuccessConditionsProperty successConditionsProperty = SuccessConditionsProperty.builder()
   * .conditions(List.of(ConditionProperty.builder()
   * .result("result")
   * .rules(List.of(RuleDeclarationProperty.builder()
   * .commands(List.of("commands"))
   * .configuration(configuration)
   * .inputArtifacts(List.of(InputArtifactProperty.builder()
   * .name("name")
   * .build()))
   * .name("name")
   * .region("region")
   * .roleArn("roleArn")
   * .ruleTypeId(RuleTypeIdProperty.builder()
   * .category("category")
   * .owner("owner")
   * .provider("provider")
   * .version("version")
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-successconditions.html)
   */
  public interface SuccessConditionsProperty {
    /**
     * The conditions that are success conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-successconditions.html#cfn-codepipeline-pipeline-successconditions-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * A builder for [SuccessConditionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions The conditions that are success conditions.
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions The conditions that are success conditions.
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions The conditions that are success conditions.
       */
      public fun conditions(vararg conditions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty.builder()

      /**
       * @param conditions The conditions that are success conditions.
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions The conditions that are success conditions.
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions The conditions that are success conditions.
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty,
    ) : CdkObject(cdkObject),
        SuccessConditionsProperty {
      /**
       * The conditions that are success conditions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-successconditions.html#cfn-codepipeline-pipeline-successconditions-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SuccessConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty):
          SuccessConditionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SuccessConditionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuccessConditionsProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.SuccessConditionsProperty
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
      cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty,
    ) : CdkObject(cdkObject),
        VariableDeclarationProperty {
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
          VariableDeclarationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VariableDeclarationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableDeclarationProperty):
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnPipeline.VariableDeclarationProperty
    }
  }
}
