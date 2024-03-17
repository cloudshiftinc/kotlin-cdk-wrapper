@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLaunch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evidently.*;
 * CfnLaunchProps cfnLaunchProps = CfnLaunchProps.builder()
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
public interface CfnLaunchProps {
  /**
   * An optional description for the launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A structure that you can use to start and stop the launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
   */
  public fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

  /**
   * An array of structures that contains the feature and variations that are to be used for the
   * launch.
   *
   * You can up to five launch groups in a launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
   */
  public fun groups(): Any

  /**
   * An array of structures that define the metrics that will be used to monitor the launch
   * performance.
   *
   * You can have up to three metric monitors in the array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
   */
  public fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

  /**
   * The name for the launch.
   *
   * It can include up to 127 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-name)
   */
  public fun name(): String

  /**
   * The name or ARN of the project that you want to create the launch in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-project)
   */
  public fun project(): String

  /**
   * When Evidently assigns a particular user session to a launch, it must use a randomization ID to
   * determine which variation the user session is served.
   *
   * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
   * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-randomizationsalt)
   */
  public fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  /**
   * An array of structures that define the traffic allocation percentages among the feature
   * variations during each step of the launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
   */
  public fun scheduledSplitsConfig(): Any

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLaunchProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description for the launch.
     */
    public fun description(description: String)

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    public fun executionStatus(executionStatus: IResolvable)

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    public fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty)

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eeb8846682a7d1705b35c29c63ee12d2c016160fc4d80d810b27869d96a6ee")
    public
        fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty.Builder.() -> Unit)

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    public fun groups(groups: IResolvable)

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    public fun groups(groups: List<Any>)

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    public fun groups(vararg groups: Any)

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(metricMonitors: IResolvable)

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(metricMonitors: List<Any>)

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(vararg metricMonitors: Any)

    /**
     * @param name The name for the launch. 
     * It can include up to 127 characters.
     */
    public fun name(name: String)

    /**
     * @param project The name or ARN of the project that you want to create the launch in. 
     */
    public fun project(project: String)

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to a launch, it
     * must use a randomization ID to determine which variation the user session is served.
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     */
    public fun randomizationSalt(randomizationSalt: String)

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable)

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>)

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    public fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnLaunchProps.Builder =
        software.amazon.awscdk.services.evidently.CfnLaunchProps.builder()

    /**
     * @param description An optional description for the launch.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    override fun executionStatus(executionStatus: IResolvable) {
      cdkBuilder.executionStatus(executionStatus.let(IResolvable::unwrap))
    }

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    override fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty) {
      cdkBuilder.executionStatus(executionStatus.let(CfnLaunch.ExecutionStatusObjectProperty::unwrap))
    }

    /**
     * @param executionStatus A structure that you can use to start and stop the launch.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eeb8846682a7d1705b35c29c63ee12d2c016160fc4d80d810b27869d96a6ee")
    override
        fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty.Builder.() -> Unit):
        Unit = executionStatus(CfnLaunch.ExecutionStatusObjectProperty(executionStatus))

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    override fun groups(groups: IResolvable) {
      cdkBuilder.groups(groups.let(IResolvable::unwrap))
    }

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    override fun groups(groups: List<Any>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     * used for the launch. 
     * You can up to five launch groups in a launch.
     */
    override fun groups(vararg groups: Any): Unit = groups(groups.toList())

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    override fun metricMonitors(metricMonitors: IResolvable) {
      cdkBuilder.metricMonitors(metricMonitors.let(IResolvable::unwrap))
    }

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    override fun metricMonitors(metricMonitors: List<Any>) {
      cdkBuilder.metricMonitors(metricMonitors)
    }

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     * monitor the launch performance.
     * You can have up to three metric monitors in the array.
     */
    override fun metricMonitors(vararg metricMonitors: Any): Unit =
        metricMonitors(metricMonitors.toList())

    /**
     * @param name The name for the launch. 
     * It can include up to 127 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param project The name or ARN of the project that you want to create the launch in. 
     */
    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to a launch, it
     * must use a randomization ID to determine which variation the user session is served.
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     */
    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(scheduledSplitsConfig: List<Any>) {
      cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     * percentages among the feature variations during each step of the launch. 
     */
    override fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any): Unit =
        scheduledSplitsConfig(scheduledSplitsConfig.toList())

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnLaunchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnLaunchProps,
  ) : CdkObject(cdkObject), CfnLaunchProps {
    /**
     * An optional description for the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A structure that you can use to start and stop the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-executionstatus)
     */
    override fun executionStatus(): Any? = unwrap(this).getExecutionStatus()

    /**
     * An array of structures that contains the feature and variations that are to be used for the
     * launch.
     *
     * You can up to five launch groups in a launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-groups)
     */
    override fun groups(): Any = unwrap(this).getGroups()

    /**
     * An array of structures that define the metrics that will be used to monitor the launch
     * performance.
     *
     * You can have up to three metric monitors in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-metricmonitors)
     */
    override fun metricMonitors(): Any? = unwrap(this).getMetricMonitors()

    /**
     * The name for the launch.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The name or ARN of the project that you want to create the launch in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-project)
     */
    override fun project(): String = unwrap(this).getProject()

    /**
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID
     * to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-randomizationsalt)
     */
    override fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

    /**
     * An array of structures that define the traffic allocation percentages among the feature
     * variations during each step of the launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html#cfn-evidently-launch-scheduledsplitsconfig)
     */
    override fun scheduledSplitsConfig(): Any = unwrap(this).getScheduledSplitsConfig()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnLaunchProps):
        CfnLaunchProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLaunchProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProps):
        software.amazon.awscdk.services.evidently.CfnLaunchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnLaunchProps
  }
}
