package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnExperimentTemplateProps {
  /**
   * The actions for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
   */
  public fun actions(): Any? = unwrap(this).getActions()

  /**
   * The description for the experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
   */
  public fun description(): String

  /**
   * The experiment options for an experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
   */
  public fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

  /**
   * The configuration for experiment logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
   */
  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The Amazon Resource Name (ARN) of an IAM role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
   */
  public fun roleArn(): String

  /**
   * The stop conditions for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
   */
  public fun stopConditions(): Any

  /**
   * The tags for the experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The targets for the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
   */
  public fun targets(): Any

  /**
   * A builder for [CfnExperimentTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions for the experiment.
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The actions for the experiment.
     */
    public fun actions(actions: Map<String, Any>)

    /**
     * @param description The description for the experiment template. 
     */
    public fun description(description: String)

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    public fun experimentOptions(experimentOptions: IResolvable)

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    public
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty)

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbdc1f234d99a5c5a8e37a49d7fd2300e00ed88a5f41732748f1139103378e60")
    public
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit)

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    public
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty)

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("008e95c28cc0f3bf73077846cd94298726ccb0c4f4682232d394ccf492ddffc7")
    public
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(stopConditions: IResolvable)

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(stopConditions: List<Any>)

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    public fun stopConditions(vararg stopConditions: Any)

    /**
     * @param tags The tags for the experiment template.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targets The targets for the experiment. 
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The targets for the experiment. 
     */
    public fun targets(targets: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.Builder =
        software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.builder()

    /**
     * @param actions The actions for the experiment.
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * @param actions The actions for the experiment.
     */
    override fun actions(actions: Map<String, Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param description The description for the experiment template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    override fun experimentOptions(experimentOptions: IResolvable) {
      cdkBuilder.experimentOptions(experimentOptions.let(IResolvable::unwrap))
    }

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    override
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty) {
      cdkBuilder.experimentOptions(experimentOptions.let(CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty::unwrap))
    }

    /**
     * @param experimentOptions The experiment options for an experiment template.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbdc1f234d99a5c5a8e37a49d7fd2300e00ed88a5f41732748f1139103378e60")
    override
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
        Unit =
        experimentOptions(CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty(experimentOptions))

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    override
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty::unwrap))
    }

    /**
     * @param logConfiguration The configuration for experiment logging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("008e95c28cc0f3bf73077846cd94298726ccb0c4f4682232d394ccf492ddffc7")
    override
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
        Unit =
        logConfiguration(CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty(logConfiguration))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(stopConditions: IResolvable) {
      cdkBuilder.stopConditions(stopConditions.let(IResolvable::unwrap))
    }

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(stopConditions: List<Any>) {
      cdkBuilder.stopConditions(stopConditions)
    }

    /**
     * @param stopConditions The stop conditions for the experiment. 
     */
    override fun stopConditions(vararg stopConditions: Any): Unit =
        stopConditions(stopConditions.toList())

    /**
     * @param tags The tags for the experiment template.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targets The targets for the experiment. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets The targets for the experiment. 
     */
    override fun targets(targets: Map<String, Any>) {
      cdkBuilder.targets(targets)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnExperimentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps,
  ) : CdkObject(cdkObject), CfnExperimentTemplateProps {
    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     */
    override fun actions(): Any? = unwrap(this).getActions()

    /**
     * The description for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The experiment options for an experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-experimentoptions)
     */
    override fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     */
    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The Amazon Resource Name (ARN) of an IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The stop conditions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     */
    override fun stopConditions(): Any = unwrap(this).getStopConditions()

    /**
     * The tags for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     */
    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExperimentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps):
        CfnExperimentTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentTemplateProps):
        software.amazon.awscdk.services.fis.CfnExperimentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
  }
}
