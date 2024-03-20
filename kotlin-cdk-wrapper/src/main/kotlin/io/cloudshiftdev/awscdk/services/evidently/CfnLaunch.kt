@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a *launch* of a given feature.
 *
 * Before you create a launch, you must create the feature to use for the launch.
 *
 * You can use a launch to safely validate new features by serving them to a specified percentage of
 * your users while you roll out the feature. You can monitor the performance of the new feature to
 * help you decide when to ramp up traffic to more users. This helps you reduce risk and identify
 * unintended consequences before you fully launch the feature.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evidently.*;
 * CfnLaunch cfnLaunch = CfnLaunch.Builder.create(this, "MyCfnLaunch")
 * .groups(List.of(LaunchGroupObjectProperty.builder()
 * .feature("feature")
 * .groupName("groupName")
 * .variation("variation")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .name("name")
 * .project("project")
 * .scheduledSplitsConfig(List.of(StepConfigProperty.builder()
 * .groupWeights(List.of(GroupToWeightProperty.builder()
 * .groupName("groupName")
 * .splitWeight(123)
 * .build()))
 * .startTime("startTime")
 * // the properties below are optional
 * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
 * .evaluationOrder(123)
 * .segment("segment")
 * .weights(List.of(GroupToWeightProperty.builder()
 * .groupName("groupName")
 * .splitWeight(123)
 * .build()))
 * .build()))
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .executionStatus(ExecutionStatusObjectProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .desiredState("desiredState")
 * .reason("reason")
 * .build())
 * .metricMonitors(List.of(MetricDefinitionObjectProperty.builder()
 * .entityIdKey("entityIdKey")
 * .metricName("metricName")
 * .valueKey("valueKey")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .unitLabel("unitLabel")
 * .build()))
 * .randomizationSalt("randomizationSalt")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html)
 */
public open class CfnLaunch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchProps,
  ) :
      this(software.amazon.awscdk.services.evidently.CfnLaunch(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLaunchProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLaunchProps(props)
  )

  /**
   * The ARN of the launch.
   *
   * For example, `arn:aws:evidently:us-west-2:0123455678912:project/myProject/launch/myLaunch`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An optional description for the launch.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for the launch.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A structure that you can use to start and stop the launch.
   */
  public open fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

  /**
   * A structure that you can use to start and stop the launch.
   */
  public open fun executionStatus(`value`: IResolvable) {
    unwrap(this).setExecutionStatus(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that you can use to start and stop the launch.
   */
  public open fun executionStatus(`value`: ExecutionStatusObjectProperty) {
    unwrap(this).setExecutionStatus(`value`.let(ExecutionStatusObjectProperty::unwrap))
  }

  /**
   * A structure that you can use to start and stop the launch.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("421639b5867705b19607b010be6f3c66cf8250bede6fb9b463f295924e6cdbb6")
  public open fun executionStatus(`value`: ExecutionStatusObjectProperty.Builder.() -> Unit): Unit =
      executionStatus(ExecutionStatusObjectProperty(`value`))

  /**
   * An array of structures that contains the feature and variations that are to be used for the
   * launch.
   */
  public open fun groups(): Any = unwrap(this).getGroups()

  /**
   * An array of structures that contains the feature and variations that are to be used for the
   * launch.
   */
  public open fun groups(`value`: IResolvable) {
    unwrap(this).setGroups(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that contains the feature and variations that are to be used for the
   * launch.
   */
  public open fun groups(`value`: List<Any>) {
    unwrap(this).setGroups(`value`)
  }

  /**
   * An array of structures that contains the feature and variations that are to be used for the
   * launch.
   */
  public open fun groups(vararg `value`: Any): Unit = groups(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An array of structures that define the metrics that will be used to monitor the launch
   * performance.
   */
  public open fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

  /**
   * An array of structures that define the metrics that will be used to monitor the launch
   * performance.
   */
  public open fun metricMonitors(`value`: IResolvable) {
    unwrap(this).setMetricMonitors(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that define the metrics that will be used to monitor the launch
   * performance.
   */
  public open fun metricMonitors(`value`: List<Any>) {
    unwrap(this).setMetricMonitors(`value`)
  }

  /**
   * An array of structures that define the metrics that will be used to monitor the launch
   * performance.
   */
  public open fun metricMonitors(vararg `value`: Any): Unit = metricMonitors(`value`.toList())

  /**
   * The name for the launch.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the launch.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The name or ARN of the project that you want to create the launch in.
   */
  public open fun project(): String = unwrap(this).getProject()

  /**
   * The name or ARN of the project that you want to create the launch in.
   */
  public open fun project(`value`: String) {
    unwrap(this).setProject(`value`)
  }

  /**
   * When Evidently assigns a particular user session to a launch, it must use a randomization ID to
   * determine which variation the user session is served.
   */
  public open fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  /**
   * When Evidently assigns a particular user session to a launch, it must use a randomization ID to
   * determine which variation the user session is served.
   */
  public open fun randomizationSalt(`value`: String) {
    unwrap(this).setRandomizationSalt(`value`)
  }

  /**
   * An array of structures that define the traffic allocation percentages among the feature
   * variations during each step of the launch.
   */
  public open fun scheduledSplitsConfig(): Any = unwrap(this).getScheduledSplitsConfig()

  /**
   * An array of structures that define the traffic allocation percentages among the feature
   * variations during each step of the launch.
   */
  public open fun scheduledSplitsConfig(`value`: IResolvable) {
    unwrap(this).setScheduledSplitsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of structures that define the traffic allocation percentages among the feature
   * variations during each step of the launch.
   */
  public open fun scheduledSplitsConfig(`value`: List<Any>) {
    unwrap(this).setScheduledSplitsConfig(`value`)
  }

  /**
   * An array of structures that define the traffic allocation percentages among the feature
   * variations during each step of the launch.
   */
  public open fun scheduledSplitsConfig(vararg `value`: Any): Unit =
      scheduledSplitsConfig(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the launch.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the launch.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the launch.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evidently.CfnLaunch].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-description)
     * @param description An optional description for the launch. 
     */
    public fun description(description: String)

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    public fun executionStatus(executionStatus: IResolvable)

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    public fun executionStatus(executionStatus: ExecutionStatusObjectProperty)

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d344654ec827a3b4bc87d8750cac4d2f48b3f11158d00d01bfd16475e040555")
    public fun executionStatus(executionStatus: ExecutionStatusObjectProperty.Builder.() -> Unit)

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    public fun groups(groups: IResolvable)

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    public fun groups(groups: List<Any>)

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    public fun groups(vararg groups: Any)

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    public fun metricMonitors(metricMonitors: IResolvable)

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    public fun metricMonitors(metricMonitors: List<Any>)

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    public fun metricMonitors(vararg metricMonitors: Any)

    /**
     * The name for the launch.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-name)
     * @param name The name for the launch. 
     */
    public fun name(name: String)

    /**
     * The name or ARN of the project that you want to create the launch in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-project)
     * @param project The name or ARN of the project that you want to create the launch in. 
     */
    public fun project(project: String)

    /**
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID
     * to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-randomizationsalt)
     * @param randomizationSalt When Evidently assigns a particular user session to a launch, it
     * must use a randomization ID to determine which variation the user session is served. 
     */
    public fun randomizationSalt(randomizationSalt: String)

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable)

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>)

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any)

    /**
     * Assigns one or more tags (key-value pairs) to the launch.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the launch. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns one or more tags (key-value pairs) to the launch.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the launch. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnLaunch.Builder =
        software.amazon.awscdk.services.evidently.CfnLaunch.Builder.create(scope, id)

    /**
     * An optional description for the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-description)
     * @param description An optional description for the launch. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    override fun executionStatus(executionStatus: IResolvable) {
      cdkBuilder.executionStatus(executionStatus.let(IResolvable::unwrap))
    }

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    override fun executionStatus(executionStatus: ExecutionStatusObjectProperty) {
      cdkBuilder.executionStatus(executionStatus.let(ExecutionStatusObjectProperty::unwrap))
    }

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     * @param executionStatus A structure that you can use to start and stop the launch. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d344654ec827a3b4bc87d8750cac4d2f48b3f11158d00d01bfd16475e040555")
    override fun executionStatus(executionStatus: ExecutionStatusObjectProperty.Builder.() -> Unit):
        Unit = executionStatus(ExecutionStatusObjectProperty(executionStatus))

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    override fun groups(groups: IResolvable) {
      cdkBuilder.groups(groups.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    override fun groups(groups: List<Any>) {
      cdkBuilder.groups(groups)
    }

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     */
    override fun groups(vararg groups: Any): Unit = groups(groups.toList())

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    override fun metricMonitors(metricMonitors: IResolvable) {
      cdkBuilder.metricMonitors(metricMonitors.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    override fun metricMonitors(metricMonitors: List<Any>) {
      cdkBuilder.metricMonitors(metricMonitors)
    }

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance. 
     */
    override fun metricMonitors(vararg metricMonitors: Any): Unit =
        metricMonitors(metricMonitors.toList())

    /**
     * The name for the launch.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-name)
     * @param name The name for the launch. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The name or ARN of the project that you want to create the launch in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-project)
     * @param project The name or ARN of the project that you want to create the launch in. 
     */
    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    /**
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID
     * to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-randomizationsalt)
     * @param randomizationSalt When Evidently assigns a particular user session to a launch, it
     * must use a randomization ID to determine which variation the user session is served. 
     */
    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig.let(IResolvable::unwrap))
    }

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
    }

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any): Unit =
        scheduledSplitsConfig(scheduledSplitsConfig.toList())

    /**
     * Assigns one or more tags (key-value pairs) to the launch.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the launch. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Assigns one or more tags (key-value pairs) to the launch.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the launch. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.evidently.CfnLaunch.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunch {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunch(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch): CfnLaunch =
        CfnLaunch(cdkObject)

    internal fun unwrap(wrapped: CfnLaunch): software.amazon.awscdk.services.evidently.CfnLaunch =
        wrapped.cdkObject
  }

  /**
   * A structure that defines one launch group in a launch.
   *
   * A launch group is a variation of the feature that you are including in the launch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * LaunchGroupObjectProperty launchGroupObjectProperty = LaunchGroupObjectProperty.builder()
   * .feature("feature")
   * .groupName("groupName")
   * .variation("variation")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html)
   */
  public interface LaunchGroupObjectProperty {
    /**
     * A description of the launch group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The feature that this launch is using.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-feature)
     */
    public fun feature(): String

    /**
     * A name for this launch group.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-groupname)
     */
    public fun groupName(): String

    /**
     * The feature variation to use for this launch group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-variation)
     */
    public fun variation(): String

    /**
     * A builder for [LaunchGroupObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the launch group.
       */
      public fun description(description: String)

      /**
       * @param feature The feature that this launch is using. 
       */
      public fun feature(feature: String)

      /**
       * @param groupName A name for this launch group. 
       * It can include up to 127 characters.
       */
      public fun groupName(groupName: String)

      /**
       * @param variation The feature variation to use for this launch group. 
       */
      public fun variation(variation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty.builder()

      /**
       * @param description A description of the launch group.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param feature The feature that this launch is using. 
       */
      override fun feature(feature: String) {
        cdkBuilder.feature(feature)
      }

      /**
       * @param groupName A name for this launch group. 
       * It can include up to 127 characters.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param variation The feature variation to use for this launch group. 
       */
      override fun variation(variation: String) {
        cdkBuilder.variation(variation)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty,
    ) : CdkObject(cdkObject), LaunchGroupObjectProperty {
      /**
       * A description of the launch group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The feature that this launch is using.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-feature)
       */
      override fun feature(): String = unwrap(this).getFeature()

      /**
       * A name for this launch group.
       *
       * It can include up to 127 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-groupname)
       */
      override fun groupName(): String = unwrap(this).getGroupName()

      /**
       * The feature variation to use for this launch group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html#cfn-evidently-launch-launchgroupobject-variation)
       */
      override fun variation(): String = unwrap(this).getVariation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchGroupObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty):
          LaunchGroupObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchGroupObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchGroupObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.LaunchGroupObjectProperty
    }
  }

  /**
   * Use this structure to start and stop the launch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * ExecutionStatusObjectProperty executionStatusObjectProperty =
   * ExecutionStatusObjectProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .desiredState("desiredState")
   * .reason("reason")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html)
   */
  public interface ExecutionStatusObjectProperty {
    /**
     * If you are using AWS CloudFormation to stop this launch, specify either `COMPLETED` or
     * `CANCELLED` here to indicate how to classify this experiment.
     *
     * If you omit this parameter, the default of `COMPLETED` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-desiredstate)
     */
    public fun desiredState(): String? = unwrap(this).getDesiredState()

    /**
     * If you are using AWS CloudFormation to stop this launch, this is an optional field that you
     * can use to record why the launch is being stopped or cancelled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-reason)
     */
    public fun reason(): String? = unwrap(this).getReason()

    /**
     * To start the launch now, specify `START` for this parameter.
     *
     * If this launch is currently running and you want to stop it now, specify `STOP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-status)
     */
    public fun status(): String

    /**
     * A builder for [ExecutionStatusObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredState If you are using AWS CloudFormation to stop this launch, specify either
       * `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment.
       * If you omit this parameter, the default of `COMPLETED` is used.
       */
      public fun desiredState(desiredState: String)

      /**
       * @param reason If you are using AWS CloudFormation to stop this launch, this is an optional
       * field that you can use to record why the launch is being stopped or cancelled.
       */
      public fun reason(reason: String)

      /**
       * @param status To start the launch now, specify `START` for this parameter. 
       * If this launch is currently running and you want to stop it now, specify `STOP` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty.builder()

      /**
       * @param desiredState If you are using AWS CloudFormation to stop this launch, specify either
       * `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment.
       * If you omit this parameter, the default of `COMPLETED` is used.
       */
      override fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
      }

      /**
       * @param reason If you are using AWS CloudFormation to stop this launch, this is an optional
       * field that you can use to record why the launch is being stopped or cancelled.
       */
      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      /**
       * @param status To start the launch now, specify `START` for this parameter. 
       * If this launch is currently running and you want to stop it now, specify `STOP` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty,
    ) : CdkObject(cdkObject), ExecutionStatusObjectProperty {
      /**
       * If you are using AWS CloudFormation to stop this launch, specify either `COMPLETED` or
       * `CANCELLED` here to indicate how to classify this experiment.
       *
       * If you omit this parameter, the default of `COMPLETED` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-desiredstate)
       */
      override fun desiredState(): String? = unwrap(this).getDesiredState()

      /**
       * If you are using AWS CloudFormation to stop this launch, this is an optional field that you
       * can use to record why the launch is being stopped or cancelled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-reason)
       */
      override fun reason(): String? = unwrap(this).getReason()

      /**
       * To start the launch now, specify `START` for this parameter.
       *
       * If this launch is currently running and you want to stop it now, specify `STOP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html#cfn-evidently-launch-executionstatusobject-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionStatusObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty):
          ExecutionStatusObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExecutionStatusObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionStatusObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.ExecutionStatusObjectProperty
    }
  }

  /**
   * A structure containing the percentage of launch traffic to allocate to one launch group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * GroupToWeightProperty groupToWeightProperty = GroupToWeightProperty.builder()
   * .groupName("groupName")
   * .splitWeight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html)
   */
  public interface GroupToWeightProperty {
    /**
     * The name of the launch group.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html#cfn-evidently-launch-grouptoweight-groupname)
     */
    public fun groupName(): String

    /**
     * The portion of launch traffic to allocate to this launch group.
     *
     * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20%
     * of the launch audience to this launch group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html#cfn-evidently-launch-grouptoweight-splitweight)
     */
    public fun splitWeight(): Number

    /**
     * A builder for [GroupToWeightProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupName The name of the launch group. 
       * It can include up to 127 characters.
       */
      public fun groupName(groupName: String)

      /**
       * @param splitWeight The portion of launch traffic to allocate to this launch group. 
       * This is represented in thousandths of a percent. For example, specify 20,000 to allocate
       * 20% of the launch audience to this launch group.
       */
      public fun splitWeight(splitWeight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty.builder()

      /**
       * @param groupName The name of the launch group. 
       * It can include up to 127 characters.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param splitWeight The portion of launch traffic to allocate to this launch group. 
       * This is represented in thousandths of a percent. For example, specify 20,000 to allocate
       * 20% of the launch audience to this launch group.
       */
      override fun splitWeight(splitWeight: Number) {
        cdkBuilder.splitWeight(splitWeight)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty,
    ) : CdkObject(cdkObject), GroupToWeightProperty {
      /**
       * The name of the launch group.
       *
       * It can include up to 127 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html#cfn-evidently-launch-grouptoweight-groupname)
       */
      override fun groupName(): String = unwrap(this).getGroupName()

      /**
       * The portion of launch traffic to allocate to this launch group.
       *
       * This is represented in thousandths of a percent. For example, specify 20,000 to allocate
       * 20% of the launch audience to this launch group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html#cfn-evidently-launch-grouptoweight-splitweight)
       */
      override fun splitWeight(): Number = unwrap(this).getSplitWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupToWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty):
          GroupToWeightProperty = CdkObjectWrappers.wrap(cdkObject) as? GroupToWeightProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupToWeightProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.GroupToWeightProperty
    }
  }

  /**
   * This structure defines a metric that you want to use to evaluate the variations during a launch
   * or experiment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * MetricDefinitionObjectProperty metricDefinitionObjectProperty =
   * MetricDefinitionObjectProperty.builder()
   * .entityIdKey("entityIdKey")
   * .metricName("metricName")
   * .valueKey("valueKey")
   * // the properties below are optional
   * .eventPattern("eventPattern")
   * .unitLabel("unitLabel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html)
   */
  public interface MetricDefinitionObjectProperty {
    /**
     * The entity, such as a user or session, that does an action that causes a metric value to be
     * recorded.
     *
     * An example is `userDetails.userID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-entityidkey)
     */
    public fun entityIdKey(): String

    /**
     * The EventBridge event pattern that defines how the metric is recorded.
     *
     * For more information about EventBridge event patterns, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-eventpattern)
     */
    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    /**
     * A name for the metric.
     *
     * It can include up to 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-metricname)
     */
    public fun metricName(): String

    /**
     * A label for the units that the metric is measuring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-unitlabel)
     */
    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    /**
     * The value that is tracked to produce the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-valuekey)
     */
    public fun valueKey(): String

    /**
     * A builder for [MetricDefinitionObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
       * @param valueKey The value that is tracked to produce the metric. 
       */
      public fun valueKey(valueKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty.builder()

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
       * @param valueKey The value that is tracked to produce the metric. 
       */
      override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty,
    ) : CdkObject(cdkObject), MetricDefinitionObjectProperty {
      /**
       * The entity, such as a user or session, that does an action that causes a metric value to be
       * recorded.
       *
       * An example is `userDetails.userID` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-entityidkey)
       */
      override fun entityIdKey(): String = unwrap(this).getEntityIdKey()

      /**
       * The EventBridge event pattern that defines how the metric is recorded.
       *
       * For more information about EventBridge event patterns, see [Amazon EventBridge event
       * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-eventpattern)
       */
      override fun eventPattern(): String? = unwrap(this).getEventPattern()

      /**
       * A name for the metric.
       *
       * It can include up to 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * A label for the units that the metric is measuring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-unitlabel)
       */
      override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      /**
       * The value that is tracked to produce the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html#cfn-evidently-launch-metricdefinitionobject-valuekey)
       */
      override fun valueKey(): String = unwrap(this).getValueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinitionObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty):
          MetricDefinitionObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetricDefinitionObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDefinitionObjectProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.MetricDefinitionObjectProperty
    }
  }

  /**
   * Use this structure to specify different traffic splits for one or more audience *segments* .
   *
   * A segment is a portion of your audience that share one or more characteristics. Examples could
   * be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other
   * criteria that your application collects, such as age.
   *
   * For more information, see [Use segments to focus your
   * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
   * .
   *
   * This sructure is an array of up to six segment override objects. Each of these objects
   * specifies a segment that you have already created, and defines the traffic split for that segment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * SegmentOverrideProperty segmentOverrideProperty = SegmentOverrideProperty.builder()
   * .evaluationOrder(123)
   * .segment("segment")
   * .weights(List.of(GroupToWeightProperty.builder()
   * .groupName("groupName")
   * .splitWeight(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html)
   */
  public interface SegmentOverrideProperty {
    /**
     * A number indicating the order to use to evaluate segment overrides, if there are more than
     * one.
     *
     * Segment overrides with lower numbers are evaluated first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-evaluationorder)
     */
    public fun evaluationOrder(): Number

    /**
     * The ARN of the segment to use for this override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-segment)
     */
    public fun segment(): String

    /**
     * The traffic allocation percentages among the feature variations to assign to this segment.
     *
     * This is a set of key-value pairs. The keys are variation names. The values represent the
     * amount of traffic to allocate to that variation for this segment. This is expressed in
     * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-weights)
     */
    public fun weights(): Any

    /**
     * A builder for [SegmentOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluationOrder A number indicating the order to use to evaluate segment overrides,
       * if there are more than one. 
       * Segment overrides with lower numbers are evaluated first.
       */
      public fun evaluationOrder(evaluationOrder: Number)

      /**
       * @param segment The ARN of the segment to use for this override. 
       */
      public fun segment(segment: String)

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      public fun weights(weights: IResolvable)

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      public fun weights(weights: List<Any>)

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      public fun weights(vararg weights: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty.builder()

      /**
       * @param evaluationOrder A number indicating the order to use to evaluate segment overrides,
       * if there are more than one. 
       * Segment overrides with lower numbers are evaluated first.
       */
      override fun evaluationOrder(evaluationOrder: Number) {
        cdkBuilder.evaluationOrder(evaluationOrder)
      }

      /**
       * @param segment The ARN of the segment to use for this override. 
       */
      override fun segment(segment: String) {
        cdkBuilder.segment(segment)
      }

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      override fun weights(weights: IResolvable) {
        cdkBuilder.weights(weights.let(IResolvable::unwrap))
      }

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      override fun weights(weights: List<Any>) {
        cdkBuilder.weights(weights)
      }

      /**
       * @param weights The traffic allocation percentages among the feature variations to assign to
       * this segment. 
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       */
      override fun weights(vararg weights: Any): Unit = weights(weights.toList())

      public fun build():
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty,
    ) : CdkObject(cdkObject), SegmentOverrideProperty {
      /**
       * A number indicating the order to use to evaluate segment overrides, if there are more than
       * one.
       *
       * Segment overrides with lower numbers are evaluated first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-evaluationorder)
       */
      override fun evaluationOrder(): Number = unwrap(this).getEvaluationOrder()

      /**
       * The ARN of the segment to use for this override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-segment)
       */
      override fun segment(): String = unwrap(this).getSegment()

      /**
       * The traffic allocation percentages among the feature variations to assign to this segment.
       *
       * This is a set of key-value pairs. The keys are variation names. The values represent the
       * amount of traffic to allocate to that variation for this segment. This is expressed in
       * thousandths of a percent, so a weight of 50000 represents 50% of traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html#cfn-evidently-launch-segmentoverride-weights)
       */
      override fun weights(): Any = unwrap(this).getWeights()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty):
          SegmentOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as? SegmentOverrideProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentOverrideProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.SegmentOverrideProperty
    }
  }

  /**
   * A structure that defines when each step of the launch is to start, and how much launch traffic
   * is to be allocated to each variation during each step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evidently.*;
   * StepConfigProperty stepConfigProperty = StepConfigProperty.builder()
   * .groupWeights(List.of(GroupToWeightProperty.builder()
   * .groupName("groupName")
   * .splitWeight(123)
   * .build()))
   * .startTime("startTime")
   * // the properties below are optional
   * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
   * .evaluationOrder(123)
   * .segment("segment")
   * .weights(List.of(GroupToWeightProperty.builder()
   * .groupName("groupName")
   * .splitWeight(123)
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html)
   */
  public interface StepConfigProperty {
    /**
     * An array of structures that define how much launch traffic to allocate to each launch group
     * during this step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-groupweights)
     */
    public fun groupWeights(): Any

    /**
     * An array of structures that you can use to specify different traffic splits for one or more
     * audience *segments* .
     *
     * A segment is a portion of your audience that share one or more characteristics. Examples
     * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit
     * other criteria that your application collects, such as age.
     *
     * For more information, see [Use segments to focus your
     * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-segmentoverrides)
     */
    public fun segmentOverrides(): Any? = unwrap(this).getSegmentOverrides()

    /**
     * The date and time to start this step of the launch.
     *
     * Use UTC format, `yyyy-MM-ddTHH:mm:ssZ` . For example, `2025-11-25T23:59:59Z`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-starttime)
     */
    public fun startTime(): String

    /**
     * A builder for [StepConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      public fun groupWeights(groupWeights: IResolvable)

      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      public fun groupWeights(groupWeights: List<Any>)

      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      public fun groupWeights(vararg groupWeights: Any)

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      public fun segmentOverrides(segmentOverrides: IResolvable)

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      public fun segmentOverrides(segmentOverrides: List<Any>)

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      public fun segmentOverrides(vararg segmentOverrides: Any)

      /**
       * @param startTime The date and time to start this step of the launch. 
       * Use UTC format, `yyyy-MM-ddTHH:mm:ssZ` . For example, `2025-11-25T23:59:59Z`
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty.builder()

      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      override fun groupWeights(groupWeights: IResolvable) {
        cdkBuilder.groupWeights(groupWeights.let(IResolvable::unwrap))
      }

      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      override fun groupWeights(groupWeights: List<Any>) {
        cdkBuilder.groupWeights(groupWeights)
      }

      /**
       * @param groupWeights An array of structures that define how much launch traffic to allocate
       * to each launch group during this step of the launch. 
       */
      override fun groupWeights(vararg groupWeights: Any): Unit =
          groupWeights(groupWeights.toList())

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      override fun segmentOverrides(segmentOverrides: IResolvable) {
        cdkBuilder.segmentOverrides(segmentOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      override fun segmentOverrides(segmentOverrides: List<Any>) {
        cdkBuilder.segmentOverrides(segmentOverrides)
      }

      /**
       * @param segmentOverrides An array of structures that you can use to specify different
       * traffic splits for one or more audience *segments* .
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       */
      override fun segmentOverrides(vararg segmentOverrides: Any): Unit =
          segmentOverrides(segmentOverrides.toList())

      /**
       * @param startTime The date and time to start this step of the launch. 
       * Use UTC format, `yyyy-MM-ddTHH:mm:ssZ` . For example, `2025-11-25T23:59:59Z`
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty,
    ) : CdkObject(cdkObject), StepConfigProperty {
      /**
       * An array of structures that define how much launch traffic to allocate to each launch group
       * during this step of the launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-groupweights)
       */
      override fun groupWeights(): Any = unwrap(this).getGroupWeights()

      /**
       * An array of structures that you can use to specify different traffic splits for one or more
       * audience *segments* .
       *
       * A segment is a portion of your audience that share one or more characteristics. Examples
       * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
       * fit other criteria that your application collects, such as age.
       *
       * For more information, see [Use segments to focus your
       * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-segmentoverrides)
       */
      override fun segmentOverrides(): Any? = unwrap(this).getSegmentOverrides()

      /**
       * The date and time to start this step of the launch.
       *
       * Use UTC format, `yyyy-MM-ddTHH:mm:ssZ` . For example, `2025-11-25T23:59:59Z`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html#cfn-evidently-launch-stepconfig-starttime)
       */
      override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty):
          StepConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? StepConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepConfigProperty):
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evidently.CfnLaunch.StepConfigProperty
    }
  }
}
