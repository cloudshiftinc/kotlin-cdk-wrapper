package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExperiment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the experiment.
   *
   * For example,
   * `arn:aws:evidently:us-west-2:0123455678912:project/myProject/experiment/myExperiment`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An optional description of the experiment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the experiment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   */
  public open fun metricGoals(): Any = unwrap(this).getMetricGoals()

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   */
  public open fun metricGoals(`value`: IResolvable) {
    unwrap(this).setMetricGoals(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   */
  public open fun metricGoals(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricGoals(__idx_ac66f0)
  }

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   */
  public open fun metricGoals(vararg __idx_ac66f0: Any): Unit = metricGoals(__idx_ac66f0.toList())

  /**
   * A name for the new experiment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the new experiment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   */
  public open fun onlineAbConfig(): Any = unwrap(this).getOnlineAbConfig()

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   */
  public open fun onlineAbConfig(`value`: IResolvable) {
    unwrap(this).setOnlineAbConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   */
  public open fun onlineAbConfig(`value`: OnlineAbConfigObjectProperty) {
    unwrap(this).setOnlineAbConfig(`value`.let(OnlineAbConfigObjectProperty::unwrap))
  }

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46111b28f3dd2af8c414d87851d4491190752e75b07b117d2b353035174e1bed")
  public open fun onlineAbConfig(`value`: OnlineAbConfigObjectProperty.Builder.() -> Unit): Unit =
      onlineAbConfig(OnlineAbConfigObjectProperty(`value`))

  /**
   * The name or the ARN of the project where this experiment is to be created.
   */
  public open fun project(): String = unwrap(this).getProject()

  /**
   * The name or the ARN of the project where this experiment is to be created.
   */
  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  /**
   * When Evidently assigns a particular user session to an experiment, it must use a randomization
   * ID to determine which variation the user session is served.
   */
  public open fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  /**
   * When Evidently assigns a particular user session to an experiment, it must use a randomization
   * ID to determine which variation the user session is served.
   */
  public open fun randomizationSalt(`value`: String) {
    unwrap(this).setRandomizationSalt(`value`)
  }

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   */
  public open fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   */
  public open fun removeSegment(`value`: Boolean) {
    unwrap(this).setRemoveSegment(`value`)
  }

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   */
  public open fun removeSegment(`value`: IResolvable) {
    unwrap(this).setRemoveSegment(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that you can use to start and stop the experiment.
   */
  public open fun runningStatus(): Any? = unwrap(this).getRunningStatus()

  /**
   * A structure that you can use to start and stop the experiment.
   */
  public open fun runningStatus(`value`: IResolvable) {
    unwrap(this).setRunningStatus(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that you can use to start and stop the experiment.
   */
  public open fun runningStatus(`value`: RunningStatusObjectProperty) {
    unwrap(this).setRunningStatus(`value`.let(RunningStatusObjectProperty::unwrap))
  }

  /**
   * A structure that you can use to start and stop the experiment.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b51759e60b7ceedf1adde2b6aa775cb2dc9f3049de44c459807109c9fcec66f6")
  public open fun runningStatus(`value`: RunningStatusObjectProperty.Builder.() -> Unit): Unit =
      runningStatus(RunningStatusObjectProperty(`value`))

  /**
   * The portion of the available audience that you want to allocate to this experiment, in
   * thousandths of a percent.
   */
  public open fun samplingRate(): Number? = unwrap(this).getSamplingRate()

  /**
   * The portion of the available audience that you want to allocate to this experiment, in
   * thousandths of a percent.
   */
  public open fun samplingRate(`value`: Number) {
    unwrap(this).setSamplingRate(`value`)
  }

  /**
   * Specifies an audience *segment* to use in the experiment.
   */
  public open fun segment(): String? = unwrap(this).getSegment()

  /**
   * Specifies an audience *segment* to use in the experiment.
   */
  public open fun segment(`value`: String) {
    unwrap(this).setSegment(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the experiment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the experiment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the experiment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   */
  public open fun treatments(): Any = unwrap(this).getTreatments()

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   */
  public open fun treatments(`value`: IResolvable) {
    unwrap(this).setTreatments(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   */
  public open fun treatments(__idx_ac66f0: List<Any>) {
    unwrap(this).setTreatments(__idx_ac66f0)
  }

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   */
  public open fun treatments(vararg __idx_ac66f0: Any): Unit = treatments(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evidently.CfnExperiment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description of the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-description)
     * @param description An optional description of the experiment. 
     */
    public fun description(description: String)

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    public fun metricGoals(metricGoals: IResolvable)

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    public fun metricGoals(metricGoals: List<Any>)

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    public fun metricGoals(vararg metricGoals: Any)

    /**
     * A name for the new experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-name)
     * @param name A name for the new experiment. 
     */
    public fun name(name: String)

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    public fun onlineAbConfig(onlineAbConfig: IResolvable)

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    public fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty)

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("862d38592f3888a79f5461082228603345d6544d9a808f77a8db7edf6c319354")
    public fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty.Builder.() -> Unit)

    /**
     * The name or the ARN of the project where this experiment is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-project)
     * @param project The name or the ARN of the project where this experiment is to be created. 
     */
    public fun project(project: String)

    /**
     * When Evidently assigns a particular user session to an experiment, it must use a
     * randomization ID to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-randomizationsalt)
     * @param randomizationSalt When Evidently assigns a particular user session to an experiment,
     * it must use a randomization ID to determine which variation the user session is served. 
     */
    public fun randomizationSalt(randomizationSalt: String)

    /**
     * Set this to `true` to remove the segment that is associated with this experiment.
     *
     * You can't use this parameter if the experiment is currently running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment. 
     */
    public fun removeSegment(removeSegment: Boolean)

    /**
     * Set this to `true` to remove the segment that is associated with this experiment.
     *
     * You can't use this parameter if the experiment is currently running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment. 
     */
    public fun removeSegment(removeSegment: IResolvable)

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    public fun runningStatus(runningStatus: IResolvable)

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    public fun runningStatus(runningStatus: RunningStatusObjectProperty)

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02995d143134d43c96b097a1a914adef4caefd28099e90f563cf8211181a48c9")
    public fun runningStatus(runningStatus: RunningStatusObjectProperty.Builder.() -> Unit)

    /**
     * The portion of the available audience that you want to allocate to this experiment, in
     * thousandths of a percent.
     *
     * The available audience is the total audience minus the audience that you have allocated to
     * overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-samplingrate)
     * @param samplingRate The portion of the available audience that you want to allocate to this
     * experiment, in thousandths of a percent. 
     */
    public fun samplingRate(samplingRate: Number)

    /**
     * Specifies an audience *segment* to use in the experiment.
     *
     * When a segment is used in an experiment, only user sessions that match the segment pattern
     * are used in the experiment.
     *
     * For more information, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-segment)
     * @param segment Specifies an audience *segment* to use in the experiment. 
     */
    public fun segment(segment: String)

    /**
     * Assigns one or more tags (key-value pairs) to the experiment.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns one or more tags (key-value pairs) to the experiment.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(treatments: IResolvable)

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(treatments: List<Any>)

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(vararg treatments: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnExperiment.Builder =
        software.amazon.awscdk.services.evidently.CfnExperiment.Builder.create(scope, id)

    /**
     * An optional description of the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-description)
     * @param description An optional description of the experiment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    override fun metricGoals(metricGoals: IResolvable) {
      cdkBuilder.metricGoals(metricGoals.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    override fun metricGoals(metricGoals: List<Any>) {
      cdkBuilder.metricGoals(metricGoals)
    }

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     */
    override fun metricGoals(vararg metricGoals: Any): Unit = metricGoals(metricGoals.toList())

    /**
     * A name for the new experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-name)
     * @param name A name for the new experiment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    override fun onlineAbConfig(onlineAbConfig: IResolvable) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(IResolvable::unwrap))
    }

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    override fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(OnlineAbConfigObjectProperty::unwrap))
    }

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("862d38592f3888a79f5461082228603345d6544d9a808f77a8db7edf6c319354")
    override fun onlineAbConfig(onlineAbConfig: OnlineAbConfigObjectProperty.Builder.() -> Unit):
        Unit = onlineAbConfig(OnlineAbConfigObjectProperty(onlineAbConfig))

    /**
     * The name or the ARN of the project where this experiment is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-project)
     * @param project The name or the ARN of the project where this experiment is to be created. 
     */
    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    /**
     * When Evidently assigns a particular user session to an experiment, it must use a
     * randomization ID to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-randomizationsalt)
     * @param randomizationSalt When Evidently assigns a particular user session to an experiment,
     * it must use a randomization ID to determine which variation the user session is served. 
     */
    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * Set this to `true` to remove the segment that is associated with this experiment.
     *
     * You can't use this parameter if the experiment is currently running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment. 
     */
    override fun removeSegment(removeSegment: Boolean) {
      cdkBuilder.removeSegment(removeSegment)
    }

    /**
     * Set this to `true` to remove the segment that is associated with this experiment.
     *
     * You can't use this parameter if the experiment is currently running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment. 
     */
    override fun removeSegment(removeSegment: IResolvable) {
      cdkBuilder.removeSegment(removeSegment.let(IResolvable::unwrap))
    }

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    override fun runningStatus(runningStatus: IResolvable) {
      cdkBuilder.runningStatus(runningStatus.let(IResolvable::unwrap))
    }

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    override fun runningStatus(runningStatus: RunningStatusObjectProperty) {
      cdkBuilder.runningStatus(runningStatus.let(RunningStatusObjectProperty::unwrap))
    }

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     * @param runningStatus A structure that you can use to start and stop the experiment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02995d143134d43c96b097a1a914adef4caefd28099e90f563cf8211181a48c9")
    override fun runningStatus(runningStatus: RunningStatusObjectProperty.Builder.() -> Unit): Unit
        = runningStatus(RunningStatusObjectProperty(runningStatus))

    /**
     * The portion of the available audience that you want to allocate to this experiment, in
     * thousandths of a percent.
     *
     * The available audience is the total audience minus the audience that you have allocated to
     * overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-samplingrate)
     * @param samplingRate The portion of the available audience that you want to allocate to this
     * experiment, in thousandths of a percent. 
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    /**
     * Specifies an audience *segment* to use in the experiment.
     *
     * When a segment is used in an experiment, only user sessions that match the segment pattern
     * are used in the experiment.
     *
     * For more information, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-segment)
     * @param segment Specifies an audience *segment* to use in the experiment. 
     */
    override fun segment(segment: String) {
      cdkBuilder.segment(segment)
    }

    /**
     * Assigns one or more tags (key-value pairs) to the experiment.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Assigns one or more tags (key-value pairs) to the experiment.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(treatments: IResolvable) {
      cdkBuilder.treatments(treatments.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(treatments: List<Any>) {
      cdkBuilder.treatments(treatments)
    }

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(vararg treatments: Any): Unit = treatments(treatments.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnExperiment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.evidently.CfnExperiment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExperiment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExperiment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment):
        CfnExperiment = CfnExperiment(cdkObject)

    internal fun unwrap(wrapped: CfnExperiment):
        software.amazon.awscdk.services.evidently.CfnExperiment = wrapped.cdkObject
  }

  public interface MetricGoalObjectProperty {
    /**
     * `INCREASE` means that a variation with a higher number for this metric is performing better.
     *
     * `DECREASE` means that a variation with a lower number for this metric is performing better.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-desiredchange)
     */
    public fun desiredChange(): String

    /**
     * The entity, such as a user or session, that does an action that causes a metric value to be
     * recorded.
     *
     * An example is `userDetails.userID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-entityidkey)
     */
    public fun entityIdKey(): String

    /**
     * The EventBridge event pattern that defines how the metric is recorded.
     *
     * For more information about EventBridge event patterns, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-eventpattern)
     */
    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    /**
     * A name for the metric.
     *
     * It can include up to 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-metricname)
     */
    public fun metricName(): String

    /**
     * A label for the units that the metric is measuring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-unitlabel)
     */
    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    /**
     * The JSON path to reference the numerical metric value in the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-valuekey)
     */
    public fun valueKey(): String

    /**
     * A builder for [MetricGoalObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredChange `INCREASE` means that a variation with a higher number for this metric
       * is performing better. 
       * `DECREASE` means that a variation with a lower number for this metric is performing better.
       */
      public fun desiredChange(desiredChange: String)

      /**
       * @param entityIdKey The entity, such as a user or session, that does an action that causes a
       * metric value to be recorded. 
       * An example is `userDetails.userID` .
       */
      public fun entityIdKey(entityIdKey: String)

      /**
       * @param eventPattern The EventBridge event pattern that defines how the metric is recorded.
       * For more information about EventBridge event patterns, see [Amazon EventBridge event
       * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
       */
      public fun eventPattern(eventPattern: String)

      /**
       * @param metricName A name for the metric. 
       * It can include up to 255 characters.
       */
      public fun metricName(metricName: String)

      /**
       * @param unitLabel A label for the units that the metric is measuring.
       */
      public fun unitLabel(unitLabel: String)

      /**
       * @param valueKey The JSON path to reference the numerical metric value in the event. 
       */
      public fun valueKey(valueKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty.builder()

      /**
       * @param desiredChange `INCREASE` means that a variation with a higher number for this metric
       * is performing better. 
       * `DECREASE` means that a variation with a lower number for this metric is performing better.
       */
      override fun desiredChange(desiredChange: String) {
        cdkBuilder.desiredChange(desiredChange)
      }

      /**
       * @param entityIdKey The entity, such as a user or session, that does an action that causes a
       * metric value to be recorded. 
       * An example is `userDetails.userID` .
       */
      override fun entityIdKey(entityIdKey: String) {
        cdkBuilder.entityIdKey(entityIdKey)
      }

      /**
       * @param eventPattern The EventBridge event pattern that defines how the metric is recorded.
       * For more information about EventBridge event patterns, see [Amazon EventBridge event
       * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
       */
      override fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
      }

      /**
       * @param metricName A name for the metric. 
       * It can include up to 255 characters.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param unitLabel A label for the units that the metric is measuring.
       */
      override fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
      }

      /**
       * @param valueKey The JSON path to reference the numerical metric value in the event. 
       */
      override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty,
    ) : CdkObject(cdkObject), MetricGoalObjectProperty {
      /**
       * `INCREASE` means that a variation with a higher number for this metric is performing
       * better.
       *
       * `DECREASE` means that a variation with a lower number for this metric is performing better.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-desiredchange)
       */
      override fun desiredChange(): String = unwrap(this).getDesiredChange()

      /**
       * The entity, such as a user or session, that does an action that causes a metric value to be
       * recorded.
       *
       * An example is `userDetails.userID` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-entityidkey)
       */
      override fun entityIdKey(): String = unwrap(this).getEntityIdKey()

      /**
       * The EventBridge event pattern that defines how the metric is recorded.
       *
       * For more information about EventBridge event patterns, see [Amazon EventBridge event
       * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-eventpattern)
       */
      override fun eventPattern(): String? = unwrap(this).getEventPattern()

      /**
       * A name for the metric.
       *
       * It can include up to 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * A label for the units that the metric is measuring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-unitlabel)
       */
      override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      /**
       * The JSON path to reference the numerical metric value in the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html#cfn-evidently-experiment-metricgoalobject-valuekey)
       */
      override fun valueKey(): String = unwrap(this).getValueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricGoalObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty):
          MetricGoalObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricGoalObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnExperiment.MetricGoalObjectProperty
    }
  }

  public interface TreatmentToWeightProperty {
    /**
     * The portion of experiment traffic to allocate to this treatment.
     *
     * Specify the traffic portion in thousandths of a percent, so 20,000 allocated to a treatment
     * would allocate 20% of the experiment traffic to that treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmenttoweight.html#cfn-evidently-experiment-treatmenttoweight-splitweight)
     */
    public fun splitWeight(): Number

    /**
     * The name of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmenttoweight.html#cfn-evidently-experiment-treatmenttoweight-treatment)
     */
    public fun treatment(): String

    /**
     * A builder for [TreatmentToWeightProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param splitWeight The portion of experiment traffic to allocate to this treatment. 
       * Specify the traffic portion in thousandths of a percent, so 20,000 allocated to a treatment
       * would allocate 20% of the experiment traffic to that treatment.
       */
      public fun splitWeight(splitWeight: Number)

      /**
       * @param treatment The name of the treatment. 
       */
      public fun treatment(treatment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty.builder()

      /**
       * @param splitWeight The portion of experiment traffic to allocate to this treatment. 
       * Specify the traffic portion in thousandths of a percent, so 20,000 allocated to a treatment
       * would allocate 20% of the experiment traffic to that treatment.
       */
      override fun splitWeight(splitWeight: Number) {
        cdkBuilder.splitWeight(splitWeight)
      }

      /**
       * @param treatment The name of the treatment. 
       */
      override fun treatment(treatment: String) {
        cdkBuilder.treatment(treatment)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty,
    ) : CdkObject(cdkObject), TreatmentToWeightProperty {
      /**
       * The portion of experiment traffic to allocate to this treatment.
       *
       * Specify the traffic portion in thousandths of a percent, so 20,000 allocated to a treatment
       * would allocate 20% of the experiment traffic to that treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmenttoweight.html#cfn-evidently-experiment-treatmenttoweight-splitweight)
       */
      override fun splitWeight(): Number = unwrap(this).getSplitWeight()

      /**
       * The name of the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmenttoweight.html#cfn-evidently-experiment-treatmenttoweight-treatment)
       */
      override fun treatment(): String = unwrap(this).getTreatment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TreatmentToWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty):
          TreatmentToWeightProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TreatmentToWeightProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentToWeightProperty
    }
  }

  public interface RunningStatusObjectProperty {
    /**
     * If you are using AWS CloudFormation to start the experiment, use this field to specify when
     * the experiment is to end.
     *
     * The format is as a UNIX timestamp. For more information about this format, see [The Current
     * Epoch Unix Timestamp](https://docs.aws.amazon.com/https://www.unixtimestamp.com/index.php) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-analysiscompletetime)
     */
    public fun analysisCompleteTime(): String? = unwrap(this).getAnalysisCompleteTime()

    /**
     * If you are using AWS CloudFormation to stop this experiment, specify either `COMPLETED` or
     * `CANCELLED` here to indicate how to classify this experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-desiredstate)
     */
    public fun desiredState(): String? = unwrap(this).getDesiredState()

    /**
     * If you are using AWS CloudFormation to stop this experiment, this is an optional field that
     * you can use to record why the experiment is being stopped or cancelled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-reason)
     */
    public fun reason(): String? = unwrap(this).getReason()

    /**
     * To start the experiment now, specify `START` for this parameter.
     *
     * If this experiment is currently running and you want to stop it now, specify `STOP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-status)
     */
    public fun status(): String

    /**
     * A builder for [RunningStatusObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysisCompleteTime If you are using AWS CloudFormation to start the experiment,
       * use this field to specify when the experiment is to end.
       * The format is as a UNIX timestamp. For more information about this format, see [The Current
       * Epoch Unix Timestamp](https://docs.aws.amazon.com/https://www.unixtimestamp.com/index.php) .
       */
      public fun analysisCompleteTime(analysisCompleteTime: String)

      /**
       * @param desiredState If you are using AWS CloudFormation to stop this experiment, specify
       * either `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment.
       */
      public fun desiredState(desiredState: String)

      /**
       * @param reason If you are using AWS CloudFormation to stop this experiment, this is an
       * optional field that you can use to record why the experiment is being stopped or cancelled.
       */
      public fun reason(reason: String)

      /**
       * @param status To start the experiment now, specify `START` for this parameter. 
       * If this experiment is currently running and you want to stop it now, specify `STOP` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty.builder()

      /**
       * @param analysisCompleteTime If you are using AWS CloudFormation to start the experiment,
       * use this field to specify when the experiment is to end.
       * The format is as a UNIX timestamp. For more information about this format, see [The Current
       * Epoch Unix Timestamp](https://docs.aws.amazon.com/https://www.unixtimestamp.com/index.php) .
       */
      override fun analysisCompleteTime(analysisCompleteTime: String) {
        cdkBuilder.analysisCompleteTime(analysisCompleteTime)
      }

      /**
       * @param desiredState If you are using AWS CloudFormation to stop this experiment, specify
       * either `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment.
       */
      override fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
      }

      /**
       * @param reason If you are using AWS CloudFormation to stop this experiment, this is an
       * optional field that you can use to record why the experiment is being stopped or cancelled.
       */
      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      /**
       * @param status To start the experiment now, specify `START` for this parameter. 
       * If this experiment is currently running and you want to stop it now, specify `STOP` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty,
    ) : CdkObject(cdkObject), RunningStatusObjectProperty {
      /**
       * If you are using AWS CloudFormation to start the experiment, use this field to specify when
       * the experiment is to end.
       *
       * The format is as a UNIX timestamp. For more information about this format, see [The Current
       * Epoch Unix Timestamp](https://docs.aws.amazon.com/https://www.unixtimestamp.com/index.php) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-analysiscompletetime)
       */
      override fun analysisCompleteTime(): String? = unwrap(this).getAnalysisCompleteTime()

      /**
       * If you are using AWS CloudFormation to stop this experiment, specify either `COMPLETED` or
       * `CANCELLED` here to indicate how to classify this experiment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-desiredstate)
       */
      override fun desiredState(): String? = unwrap(this).getDesiredState()

      /**
       * If you are using AWS CloudFormation to stop this experiment, this is an optional field that
       * you can use to record why the experiment is being stopped or cancelled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-reason)
       */
      override fun reason(): String? = unwrap(this).getReason()

      /**
       * To start the experiment now, specify `START` for this parameter.
       *
       * If this experiment is currently running and you want to stop it now, specify `STOP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html#cfn-evidently-experiment-runningstatusobject-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunningStatusObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty):
          RunningStatusObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunningStatusObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnExperiment.RunningStatusObjectProperty
    }
  }

  public interface TreatmentObjectProperty {
    /**
     * The description of the treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the feature for this experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-feature)
     */
    public fun feature(): String

    /**
     * A name for this treatment.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-treatmentname)
     */
    public fun treatmentName(): String

    /**
     * The name of the variation to use for this treatment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-variation)
     */
    public fun variation(): String

    /**
     * A builder for [TreatmentObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the treatment.
       */
      public fun description(description: String)

      /**
       * @param feature The name of the feature for this experiment. 
       */
      public fun feature(feature: String)

      /**
       * @param treatmentName A name for this treatment. 
       * It can include up to 127 characters.
       */
      public fun treatmentName(treatmentName: String)

      /**
       * @param variation The name of the variation to use for this treatment. 
       */
      public fun variation(variation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty.builder()

      /**
       * @param description The description of the treatment.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param feature The name of the feature for this experiment. 
       */
      override fun feature(feature: String) {
        cdkBuilder.feature(feature)
      }

      /**
       * @param treatmentName A name for this treatment. 
       * It can include up to 127 characters.
       */
      override fun treatmentName(treatmentName: String) {
        cdkBuilder.treatmentName(treatmentName)
      }

      /**
       * @param variation The name of the variation to use for this treatment. 
       */
      override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty,
    ) : CdkObject(cdkObject), TreatmentObjectProperty {
      /**
       * The description of the treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the feature for this experiment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-feature)
       */
      override fun feature(): String = unwrap(this).getFeature()

      /**
       * A name for this treatment.
       *
       * It can include up to 127 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-treatmentname)
       */
      override fun treatmentName(): String = unwrap(this).getTreatmentName()

      /**
       * The name of the variation to use for this treatment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html#cfn-evidently-experiment-treatmentobject-variation)
       */
      override fun variation(): String = unwrap(this).getVariation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TreatmentObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty):
          TreatmentObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TreatmentObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnExperiment.TreatmentObjectProperty
    }
  }

  public interface OnlineAbConfigObjectProperty {
    /**
     * The name of the variation that is to be the default variation that the other variations are
     * compared to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-onlineabconfigobject.html#cfn-evidently-experiment-onlineabconfigobject-controltreatmentname)
     */
    public fun controlTreatmentName(): String? = unwrap(this).getControlTreatmentName()

    /**
     * A set of key-value pairs.
     *
     * The keys are treatment names, and the values are the portion of experiment traffic to be
     * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
     * for a variation would allocate 20% of the experiment traffic to that variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-onlineabconfigobject.html#cfn-evidently-experiment-onlineabconfigobject-treatmentweights)
     */
    public fun treatmentWeights(): Any? = unwrap(this).getTreatmentWeights()

    /**
     * A builder for [OnlineAbConfigObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param controlTreatmentName The name of the variation that is to be the default variation
       * that the other variations are compared to.
       */
      public fun controlTreatmentName(controlTreatmentName: String)

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      public fun treatmentWeights(treatmentWeights: IResolvable)

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      public fun treatmentWeights(treatmentWeights: List<Any>)

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      public fun treatmentWeights(vararg treatmentWeights: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty.builder()

      /**
       * @param controlTreatmentName The name of the variation that is to be the default variation
       * that the other variations are compared to.
       */
      override fun controlTreatmentName(controlTreatmentName: String) {
        cdkBuilder.controlTreatmentName(controlTreatmentName)
      }

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      override fun treatmentWeights(treatmentWeights: IResolvable) {
        cdkBuilder.treatmentWeights(treatmentWeights.let(IResolvable::unwrap))
      }

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      override fun treatmentWeights(treatmentWeights: List<Any>) {
        cdkBuilder.treatmentWeights(treatmentWeights)
      }

      /**
       * @param treatmentWeights A set of key-value pairs.
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       */
      override fun treatmentWeights(vararg treatmentWeights: Any): Unit =
          treatmentWeights(treatmentWeights.toList())

      public fun build():
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty,
    ) : CdkObject(cdkObject), OnlineAbConfigObjectProperty {
      /**
       * The name of the variation that is to be the default variation that the other variations are
       * compared to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-onlineabconfigobject.html#cfn-evidently-experiment-onlineabconfigobject-controltreatmentname)
       */
      override fun controlTreatmentName(): String? = unwrap(this).getControlTreatmentName()

      /**
       * A set of key-value pairs.
       *
       * The keys are treatment names, and the values are the portion of experiment traffic to be
       * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000
       * for a variation would allocate 20% of the experiment traffic to that variation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-onlineabconfigobject.html#cfn-evidently-experiment-onlineabconfigobject-treatmentweights)
       */
      override fun treatmentWeights(): Any? = unwrap(this).getTreatmentWeights()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnlineAbConfigObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty):
          OnlineAbConfigObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineAbConfigObjectProperty):
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnExperiment.OnlineAbConfigObjectProperty
    }
  }
}
