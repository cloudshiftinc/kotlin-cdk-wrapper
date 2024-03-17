@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an experiment template.
 *
 * An experiment template includes the following components:
 *
 * * *Targets* : A target can be a specific resource in your AWS environment, or one or more
 * resources that match criteria that you specify, for example, resources that have specific tags.
 * * *Actions* : The actions to carry out on the target. You can specify multiple actions, the
 * duration of each action, and when to start each action during an experiment.
 * * *Stop conditions* : If a stop condition is triggered while an experiment is running, the
 * experiment is automatically stopped. You can define a stop condition as a CloudWatch alarm.
 *
 * For more information, see [Experiment
 * templates](https://docs.aws.amazon.com/fis/latest/userguide/experiment-templates.html) in the *AWS
 * Fault Injection Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fis.*;
 * Object cloudWatchLogsConfiguration;
 * Object s3Configuration;
 * CfnExperimentTemplate cfnExperimentTemplate = CfnExperimentTemplate.Builder.create(this,
 * "MyCfnExperimentTemplate")
 * .description("description")
 * .roleArn("roleArn")
 * .stopConditions(List.of(ExperimentTemplateStopConditionProperty.builder()
 * .source("source")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .targets(Map.of(
 * "targetsKey", ExperimentTemplateTargetProperty.builder()
 * .resourceType("resourceType")
 * .selectionMode("selectionMode")
 * // the properties below are optional
 * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
 * .path("path")
 * .values(List.of("values"))
 * .build()))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceArns(List.of("resourceArns"))
 * .resourceTags(Map.of(
 * "resourceTagsKey", "resourceTags"))
 * .build()))
 * // the properties below are optional
 * .actions(Map.of(
 * "actionsKey", ExperimentTemplateActionProperty.builder()
 * .actionId("actionId")
 * // the properties below are optional
 * .description("description")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .startAfter(List.of("startAfter"))
 * .targets(Map.of(
 * "targetsKey", "targets"))
 * .build()))
 * .experimentOptions(ExperimentTemplateExperimentOptionsProperty.builder()
 * .accountTargeting("accountTargeting")
 * .emptyTargetResolutionMode("emptyTargetResolutionMode")
 * .build())
 * .logConfiguration(ExperimentTemplateLogConfigurationProperty.builder()
 * .logSchemaVersion(123)
 * // the properties below are optional
 * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
 * .s3Configuration(s3Configuration)
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html)
 */
public open class CfnExperimentTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The actions for the experiment.
   */
  public open fun actions(): Any? = unwrap(this).getActions()

  /**
   * The actions for the experiment.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The actions for the experiment.
   */
  public open fun actions(`value`: Map<String, Any>) {
    unwrap(this).setActions(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description for the experiment template.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description for the experiment template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The experiment options for an experiment template.
   */
  public open fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

  /**
   * The experiment options for an experiment template.
   */
  public open fun experimentOptions(`value`: IResolvable) {
    unwrap(this).setExperimentOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The experiment options for an experiment template.
   */
  public open fun experimentOptions(`value`: ExperimentTemplateExperimentOptionsProperty) {
    unwrap(this).setExperimentOptions(`value`.let(ExperimentTemplateExperimentOptionsProperty::unwrap))
  }

  /**
   * The experiment options for an experiment template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a68fd568b1ee455e011fefb0079750fff55b15abd2d76c90aa1a98209c5e03e")
  public open
      fun experimentOptions(`value`: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
      Unit = experimentOptions(ExperimentTemplateExperimentOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration for experiment logging.
   */
  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The configuration for experiment logging.
   */
  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for experiment logging.
   */
  public open fun logConfiguration(`value`: ExperimentTemplateLogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(ExperimentTemplateLogConfigurationProperty::unwrap))
  }

  /**
   * The configuration for experiment logging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1903bbf82fe1aa6109b4ed61aeddd4255fbf59faaf7fca7e3c69515d398c9638")
  public open
      fun logConfiguration(`value`: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
      Unit = logConfiguration(ExperimentTemplateLogConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of an IAM role.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The stop conditions for the experiment.
   */
  public open fun stopConditions(): Any = unwrap(this).getStopConditions()

  /**
   * The stop conditions for the experiment.
   */
  public open fun stopConditions(`value`: IResolvable) {
    unwrap(this).setStopConditions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The stop conditions for the experiment.
   */
  public open fun stopConditions(`value`: List<Any>) {
    unwrap(this).setStopConditions(`value`)
  }

  /**
   * The stop conditions for the experiment.
   */
  public open fun stopConditions(vararg `value`: Any): Unit = stopConditions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the experiment template.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags for the experiment template.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The targets for the experiment.
   */
  public open fun targets(): Any = unwrap(this).getTargets()

  /**
   * The targets for the experiment.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * The targets for the experiment.
   */
  public open fun targets(`value`: Map<String, Any>) {
    unwrap(this).setTargets(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fis.CfnExperimentTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     * @param actions The actions for the experiment. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     * @param actions The actions for the experiment. 
     */
    public fun actions(actions: Map<String, Any>)

    /**
     * The description for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
     * @param description The description for the experiment template. 
     */
    public fun description(description: String)

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    public fun experimentOptions(experimentOptions: IResolvable)

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    public fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty)

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b2a656422787a97a708d2580eec4e1c60a9b5cc48903943948c7f8119b43d0")
    public
        fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit)

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    public fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty)

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe63142c92764aa56294f606a6c0d291ce9297af2391022a95186c98cf92218")
    public
        fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(stopConditions: IResolvable)

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(stopConditions: List<Any>)

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(vararg stopConditions: Any)

    /**
     * The tags for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
     * @param tags The tags for the experiment template. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     * @param targets The targets for the experiment. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     * @param targets The targets for the experiment. 
     */
    public fun targets(targets: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder =
        software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder.create(scope, id)

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     * @param actions The actions for the experiment. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     * @param actions The actions for the experiment. 
     */
    override fun actions(actions: Map<String, Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The description for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
     * @param description The description for the experiment template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    override fun experimentOptions(experimentOptions: IResolvable) {
      cdkBuilder.experimentOptions(experimentOptions.let(IResolvable::unwrap))
    }

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    override fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty) {
      cdkBuilder.experimentOptions(experimentOptions.let(ExperimentTemplateExperimentOptionsProperty::unwrap))
    }

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     * @param experimentOptions The experiment options for an experiment template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b2a656422787a97a708d2580eec4e1c60a9b5cc48903943948c7f8119b43d0")
    override
        fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
        Unit = experimentOptions(ExperimentTemplateExperimentOptionsProperty(experimentOptions))

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    override fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(ExperimentTemplateLogConfigurationProperty::unwrap))
    }

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     * @param logConfiguration The configuration for experiment logging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe63142c92764aa56294f606a6c0d291ce9297af2391022a95186c98cf92218")
    override
        fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(ExperimentTemplateLogConfigurationProperty(logConfiguration))

    /**
     * The Amazon Resource Name (ARN) of an IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(stopConditions: IResolvable) {
      cdkBuilder.stopConditions(stopConditions.let(IResolvable::unwrap))
    }

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(stopConditions: List<Any>) {
      cdkBuilder.stopConditions(stopConditions)
    }

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(vararg stopConditions: Any): Unit =
        stopConditions(stopConditions.toList())

    /**
     * The tags for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
     * @param tags The tags for the experiment template. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     * @param targets The targets for the experiment. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     * @param targets The targets for the experiment. 
     */
    override fun targets(targets: Map<String, Any>) {
      cdkBuilder.targets(targets)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnExperimentTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fis.CfnExperimentTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExperimentTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExperimentTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate):
        CfnExperimentTemplate = CfnExperimentTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentTemplate):
        software.amazon.awscdk.services.fis.CfnExperimentTemplate = wrapped.cdkObject
  }

  /**
   * Specifies a filter used for the target resource input in an experiment template.
   *
   * For more information, see [Resource
   * filters](https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters) in the *AWS
   * Fault Injection Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * ExperimentTemplateTargetFilterProperty experimentTemplateTargetFilterProperty =
   * ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html)
   */
  public interface ExperimentTemplateTargetFilterProperty {
    /**
     * The attribute path for the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html#cfn-fis-experimenttemplate-experimenttemplatetargetfilter-path)
     */
    public fun path(): String

    /**
     * The attribute values for the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html#cfn-fis-experimenttemplate-experimenttemplatetargetfilter-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [ExperimentTemplateTargetFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param path The attribute path for the filter. 
       */
      public fun path(path: String)

      /**
       * @param values The attribute values for the filter. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The attribute values for the filter. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.builder()

      /**
       * @param path The attribute path for the filter. 
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param values The attribute values for the filter. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The attribute values for the filter. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateTargetFilterProperty {
      /**
       * The attribute path for the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html#cfn-fis-experimenttemplate-experimenttemplatetargetfilter-path)
       */
      override fun path(): String = unwrap(this).getPath()

      /**
       * The attribute values for the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html#cfn-fis-experimenttemplate-experimenttemplatetargetfilter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateTargetFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty):
          ExperimentTemplateTargetFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateTargetFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateTargetFilterProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty
    }
  }

  /**
   * Specifies a target for an experiment.
   *
   * You must specify at least one Amazon Resource Name (ARN) or at least one resource tag. You
   * cannot specify both ARNs and tags.
   *
   * For more information, see
   * [Targets](https://docs.aws.amazon.com/fis/latest/userguide/targets.html) in the *AWS Fault
   * Injection Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * ExperimentTemplateTargetProperty experimentTemplateTargetProperty =
   * ExperimentTemplateTargetProperty.builder()
   * .resourceType("resourceType")
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build()))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTags(Map.of(
   * "resourceTagsKey", "resourceTags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html)
   */
  public interface ExperimentTemplateTargetProperty {
    /**
     * The filters to apply to identify target resources using specific attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * The parameters for the resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The Amazon Resource Names (ARNs) of the targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcearns)
     */
    public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    /**
     * The tags for the target resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcetags)
     */
    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * The resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcetype)
     */
    public fun resourceType(): String

    /**
     * Scopes the identified resources to a specific count or percentage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-selectionmode)
     */
    public fun selectionMode(): String

    /**
     * A builder for [ExperimentTemplateTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      public fun filters(vararg filters: Any)

      /**
       * @param parameters The parameters for the resource type.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The parameters for the resource type.
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param resourceArns The Amazon Resource Names (ARNs) of the targets.
       */
      public fun resourceArns(resourceArns: List<String>)

      /**
       * @param resourceArns The Amazon Resource Names (ARNs) of the targets.
       */
      public fun resourceArns(vararg resourceArns: String)

      /**
       * @param resourceTags The tags for the target resources.
       */
      public fun resourceTags(resourceTags: IResolvable)

      /**
       * @param resourceTags The tags for the target resources.
       */
      public fun resourceTags(resourceTags: Map<String, String>)

      /**
       * @param resourceType The resource type. 
       */
      public fun resourceType(resourceType: String)

      /**
       * @param selectionMode Scopes the identified resources to a specific count or percentage. 
       */
      public fun selectionMode(selectionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.builder()

      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param filters The filters to apply to identify target resources using specific attributes.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      /**
       * @param parameters The parameters for the resource type.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters The parameters for the resource type.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param resourceArns The Amazon Resource Names (ARNs) of the targets.
       */
      override fun resourceArns(resourceArns: List<String>) {
        cdkBuilder.resourceArns(resourceArns)
      }

      /**
       * @param resourceArns The Amazon Resource Names (ARNs) of the targets.
       */
      override fun resourceArns(vararg resourceArns: String): Unit =
          resourceArns(resourceArns.toList())

      /**
       * @param resourceTags The tags for the target resources.
       */
      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
      }

      /**
       * @param resourceTags The tags for the target resources.
       */
      override fun resourceTags(resourceTags: Map<String, String>) {
        cdkBuilder.resourceTags(resourceTags)
      }

      /**
       * @param resourceType The resource type. 
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param selectionMode Scopes the identified resources to a specific count or percentage. 
       */
      override fun selectionMode(selectionMode: String) {
        cdkBuilder.selectionMode(selectionMode)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateTargetProperty {
      /**
       * The filters to apply to identify target resources using specific attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()

      /**
       * The parameters for the resource type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The Amazon Resource Names (ARNs) of the targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcearns)
       */
      override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

      /**
       * The tags for the target resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcetags)
       */
      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      /**
       * The resource type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()

      /**
       * Scopes the identified resources to a specific count or percentage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html#cfn-fis-experimenttemplate-experimenttemplatetarget-selectionmode)
       */
      override fun selectionMode(): String = unwrap(this).getSelectionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExperimentTemplateTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty):
          ExperimentTemplateTargetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateTargetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateTargetProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty
    }
  }

  /**
   * Specifies the configuration for experiment logging.
   *
   * For more information, see [Experiment
   * logging](https://docs.aws.amazon.com/fis/latest/userguide/monitoring-logging.html) in the *AWS
   * Fault Injection Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * Object cloudWatchLogsConfiguration;
   * Object s3Configuration;
   * ExperimentTemplateLogConfigurationProperty experimentTemplateLogConfigurationProperty =
   * ExperimentTemplateLogConfigurationProperty.builder()
   * .logSchemaVersion(123)
   * // the properties below are optional
   * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
   * .s3Configuration(s3Configuration)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html)
   */
  public interface ExperimentTemplateLogConfigurationProperty {
    /**
     * The configuration for experiment logging to CloudWatch Logs .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-cloudwatchlogsconfiguration)
     */
    public fun cloudWatchLogsConfiguration(): Any? = unwrap(this).getCloudWatchLogsConfiguration()

    /**
     * The schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-logschemaversion)
     */
    public fun logSchemaVersion(): Number

    /**
     * The configuration for experiment logging to Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    /**
     * A builder for [ExperimentTemplateLogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch
       * Logs .
       */
      public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any)

      /**
       * @param logSchemaVersion The schema version. 
       */
      public fun logSchemaVersion(logSchemaVersion: Number)

      /**
       * @param s3Configuration The configuration for experiment logging to Amazon S3 .
       */
      public fun s3Configuration(s3Configuration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.builder()

      /**
       * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch
       * Logs .
       */
      override fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
      }

      /**
       * @param logSchemaVersion The schema version. 
       */
      override fun logSchemaVersion(logSchemaVersion: Number) {
        cdkBuilder.logSchemaVersion(logSchemaVersion)
      }

      /**
       * @param s3Configuration The configuration for experiment logging to Amazon S3 .
       */
      override fun s3Configuration(s3Configuration: Any) {
        cdkBuilder.s3Configuration(s3Configuration)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateLogConfigurationProperty {
      /**
       * The configuration for experiment logging to CloudWatch Logs .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-cloudwatchlogsconfiguration)
       */
      override fun cloudWatchLogsConfiguration(): Any? =
          unwrap(this).getCloudWatchLogsConfiguration()

      /**
       * The schema version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-logschemaversion)
       */
      override fun logSchemaVersion(): Number = unwrap(this).getLogSchemaVersion()

      /**
       * The configuration for experiment logging to Amazon S3 .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html#cfn-fis-experimenttemplate-experimenttemplatelogconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty):
          ExperimentTemplateLogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateLogConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateLogConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
    }
  }

  /**
   * Describes the experiment options for an experiment template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * ExperimentTemplateExperimentOptionsProperty experimentTemplateExperimentOptionsProperty =
   * ExperimentTemplateExperimentOptionsProperty.builder()
   * .accountTargeting("accountTargeting")
   * .emptyTargetResolutionMode("emptyTargetResolutionMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html)
   */
  public interface ExperimentTemplateExperimentOptionsProperty {
    /**
     * The account targeting setting for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html#cfn-fis-experimenttemplate-experimenttemplateexperimentoptions-accounttargeting)
     */
    public fun accountTargeting(): String? = unwrap(this).getAccountTargeting()

    /**
     * The empty target resolution mode for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html#cfn-fis-experimenttemplate-experimenttemplateexperimentoptions-emptytargetresolutionmode)
     */
    public fun emptyTargetResolutionMode(): String? = unwrap(this).getEmptyTargetResolutionMode()

    /**
     * A builder for [ExperimentTemplateExperimentOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountTargeting The account targeting setting for an experiment template.
       */
      public fun accountTargeting(accountTargeting: String)

      /**
       * @param emptyTargetResolutionMode The empty target resolution mode for an experiment
       * template.
       */
      public fun emptyTargetResolutionMode(emptyTargetResolutionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.builder()

      /**
       * @param accountTargeting The account targeting setting for an experiment template.
       */
      override fun accountTargeting(accountTargeting: String) {
        cdkBuilder.accountTargeting(accountTargeting)
      }

      /**
       * @param emptyTargetResolutionMode The empty target resolution mode for an experiment
       * template.
       */
      override fun emptyTargetResolutionMode(emptyTargetResolutionMode: String) {
        cdkBuilder.emptyTargetResolutionMode(emptyTargetResolutionMode)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateExperimentOptionsProperty {
      /**
       * The account targeting setting for an experiment template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html#cfn-fis-experimenttemplate-experimenttemplateexperimentoptions-accounttargeting)
       */
      override fun accountTargeting(): String? = unwrap(this).getAccountTargeting()

      /**
       * The empty target resolution mode for an experiment template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html#cfn-fis-experimenttemplate-experimenttemplateexperimentoptions-emptytargetresolutionmode)
       */
      override fun emptyTargetResolutionMode(): String? =
          unwrap(this).getEmptyTargetResolutionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateExperimentOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty):
          ExperimentTemplateExperimentOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateExperimentOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateExperimentOptionsProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
    }
  }

  /**
   * Specifies the configuration for experiment logging to Amazon S3 .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html)
   */
  public interface S3ConfigurationProperty {
    /**
     * The name of the destination bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html#cfn-fis-experimenttemplate-s3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * The bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html#cfn-fis-experimenttemplate-s3configuration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the destination bucket. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param prefix The bucket prefix.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty.builder()

      /**
       * @param bucketName The name of the destination bucket. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param prefix The bucket prefix.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty,
    ) : CdkObject(cdkObject), S3ConfigurationProperty {
      /**
       * The name of the destination bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html#cfn-fis-experimenttemplate-s3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html#cfn-fis-experimenttemplate-s3configuration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty):
          S3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty
    }
  }

  /**
   * Specifies a stop condition for an experiment template.
   *
   * For more information, see [Stop
   * conditions](https://docs.aws.amazon.com/fis/latest/userguide/stop-conditions.html) in the *AWS
   * Fault Injection Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * ExperimentTemplateStopConditionProperty experimentTemplateStopConditionProperty =
   * ExperimentTemplateStopConditionProperty.builder()
   * .source("source")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html)
   */
  public interface ExperimentTemplateStopConditionProperty {
    /**
     * The source for the stop condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html#cfn-fis-experimenttemplate-experimenttemplatestopcondition-source)
     */
    public fun source(): String

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html#cfn-fis-experimenttemplate-experimenttemplatestopcondition-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ExperimentTemplateStopConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source The source for the stop condition. 
       */
      public fun source(source: String)

      /**
       * @param value The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.builder()

      /**
       * @param source The source for the stop condition. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param value The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateStopConditionProperty {
      /**
       * The source for the stop condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html#cfn-fis-experimenttemplate-experimenttemplatestopcondition-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html#cfn-fis-experimenttemplate-experimenttemplatestopcondition-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateStopConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty):
          ExperimentTemplateStopConditionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateStopConditionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateStopConditionProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty
    }
  }

  /**
   * Specifies an action for an experiment template.
   *
   * For more information, see
   * [Actions](https://docs.aws.amazon.com/fis/latest/userguide/actions.html) in the *AWS Fault
   * Injection Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * ExperimentTemplateActionProperty experimentTemplateActionProperty =
   * ExperimentTemplateActionProperty.builder()
   * .actionId("actionId")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .startAfter(List.of("startAfter"))
   * .targets(Map.of(
   * "targetsKey", "targets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html)
   */
  public interface ExperimentTemplateActionProperty {
    /**
     * The ID of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-actionid)
     */
    public fun actionId(): String

    /**
     * A description for the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The parameters for the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The name of the action that must be completed before the current action starts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-startafter)
     */
    public fun startAfter(): List<String> = unwrap(this).getStartAfter() ?: emptyList()

    /**
     * The targets for the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-targets)
     */
    public fun targets(): Any? = unwrap(this).getTargets()

    /**
     * A builder for [ExperimentTemplateActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionId The ID of the action. 
       */
      public fun actionId(actionId: String)

      /**
       * @param description A description for the action.
       */
      public fun description(description: String)

      /**
       * @param parameters The parameters for the action.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The parameters for the action.
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param startAfter The name of the action that must be completed before the current action
       * starts.
       */
      public fun startAfter(startAfter: List<String>)

      /**
       * @param startAfter The name of the action that must be completed before the current action
       * starts.
       */
      public fun startAfter(vararg startAfter: String)

      /**
       * @param targets The targets for the action.
       */
      public fun targets(targets: IResolvable)

      /**
       * @param targets The targets for the action.
       */
      public fun targets(targets: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty.builder()

      /**
       * @param actionId The ID of the action. 
       */
      override fun actionId(actionId: String) {
        cdkBuilder.actionId(actionId)
      }

      /**
       * @param description A description for the action.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param parameters The parameters for the action.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters The parameters for the action.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param startAfter The name of the action that must be completed before the current action
       * starts.
       */
      override fun startAfter(startAfter: List<String>) {
        cdkBuilder.startAfter(startAfter)
      }

      /**
       * @param startAfter The name of the action that must be completed before the current action
       * starts.
       */
      override fun startAfter(vararg startAfter: String): Unit = startAfter(startAfter.toList())

      /**
       * @param targets The targets for the action.
       */
      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable::unwrap))
      }

      /**
       * @param targets The targets for the action.
       */
      override fun targets(targets: Map<String, String>) {
        cdkBuilder.targets(targets)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty,
    ) : CdkObject(cdkObject), ExperimentTemplateActionProperty {
      /**
       * The ID of the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-actionid)
       */
      override fun actionId(): String = unwrap(this).getActionId()

      /**
       * A description for the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The parameters for the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The name of the action that must be completed before the current action starts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-startafter)
       */
      override fun startAfter(): List<String> = unwrap(this).getStartAfter() ?: emptyList()

      /**
       * The targets for the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html#cfn-fis-experimenttemplate-experimenttemplateaction-targets)
       */
      override fun targets(): Any? = unwrap(this).getTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExperimentTemplateActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty):
          ExperimentTemplateActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExperimentTemplateActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateActionProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty
    }
  }

  /**
   * Specifies the configuration for experiment logging to CloudWatch Logs .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fis.*;
   * CloudWatchLogsConfigurationProperty cloudWatchLogsConfigurationProperty =
   * CloudWatchLogsConfigurationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-cloudwatchlogsconfiguration.html)
   */
  public interface CloudWatchLogsConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-cloudwatchlogsconfiguration.html#cfn-fis-experimenttemplate-cloudwatchlogsconfiguration-loggrouparn)
     */
    public fun logGroupArn(): String

    /**
     * A builder for [CloudWatchLogsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs
       * log group. 
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.builder()

      /**
       * @param logGroupArn The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs
       * log group. 
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-cloudwatchlogsconfiguration.html#cfn-fis-experimenttemplate-cloudwatchlogsconfiguration-loggrouparn)
       */
      override fun logGroupArn(): String = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty):
          CloudWatchLogsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty
    }
  }
}
