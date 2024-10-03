@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationsignals

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
 * Properties for defining a `CfnServiceLevelObjective`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
 * CfnServiceLevelObjectiveProps cfnServiceLevelObjectiveProps =
 * CfnServiceLevelObjectiveProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .goal(GoalProperty.builder()
 * .attainmentGoal(123)
 * .interval(IntervalProperty.builder()
 * .calendarInterval(CalendarIntervalProperty.builder()
 * .duration(123)
 * .durationUnit("durationUnit")
 * .startTime(123)
 * .build())
 * .rollingInterval(RollingIntervalProperty.builder()
 * .duration(123)
 * .durationUnit("durationUnit")
 * .build())
 * .build())
 * .warningThreshold(123)
 * .build())
 * .requestBasedSli(RequestBasedSliProperty.builder()
 * .requestBasedSliMetric(RequestBasedSliMetricProperty.builder()
 * .keyAttributes(Map.of(
 * "keyAttributesKey", "keyAttributes"))
 * .metricType("metricType")
 * .monitoredRequestCountMetric(MonitoredRequestCountMetricProperty.builder()
 * .badCountMetric(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .goodCountMetric(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .operationName("operationName")
 * .totalRequestCountMetric(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * // the properties below are optional
 * .comparisonOperator("comparisonOperator")
 * .metricThreshold(123)
 * .build())
 * .sli(SliProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricThreshold(123)
 * .sliMetric(SliMetricProperty.builder()
 * .keyAttributes(Map.of(
 * "keyAttributesKey", "keyAttributes"))
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .metricType("metricType")
 * .operationName("operationName")
 * .periodSeconds(123)
 * .statistic("statistic")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html)
 */
public interface CfnServiceLevelObjectiveProps {
  /**
   * An optional description for this SLO.
   *
   * Default: - "No description"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   *
   * This includes the time period for evaluation and the attainment threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
   */
  public fun goal(): Any? = unwrap(this).getGoal()

  /**
   * A name for this SLO.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-name)
   */
  public fun name(): String

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a request-based SLO.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
   */
  public fun requestBasedSli(): Any? = unwrap(this).getRequestBasedSli()

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a period-based SLO.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
   */
  public fun sli(): Any? = unwrap(this).getSli()

  /**
   * A list of key-value pairs to associate with the SLO.
   *
   * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
   * when you create the SLO, you must have the cloudwatch:TagResource permission.
   *
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceLevelObjectiveProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description for this SLO.
     */
    public fun description(description: String)

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    public fun goal(goal: IResolvable)

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    public fun goal(goal: CfnServiceLevelObjective.GoalProperty)

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7d8e6fa676dacee31e34791ede9d863ce887b233f1872a37a794531b35a76af")
    public fun goal(goal: CfnServiceLevelObjective.GoalProperty.Builder.() -> Unit)

    /**
     * @param name A name for this SLO. 
     */
    public fun name(name: String)

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    public fun requestBasedSli(requestBasedSli: IResolvable)

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    public fun requestBasedSli(requestBasedSli: CfnServiceLevelObjective.RequestBasedSliProperty)

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("000f980b425d0b6891f6ef36960a0636e60afbc6da06a21ad970ba2fd73b78f9")
    public
        fun requestBasedSli(requestBasedSli: CfnServiceLevelObjective.RequestBasedSliProperty.Builder.() -> Unit)

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    public fun sli(sli: IResolvable)

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    public fun sli(sli: CfnServiceLevelObjective.SliProperty)

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8470aec0aed83ad84a657d500f29ecab171b088c041f1b60ad5288eb501cab8")
    public fun sli(sli: CfnServiceLevelObjective.SliProperty.Builder.() -> Unit)

    /**
     * @param tags A list of key-value pairs to associate with the SLO.
     * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
     * when you create the SLO, you must have the cloudwatch:TagResource permission.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to associate with the SLO.
     * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
     * when you create the SLO, you must have the cloudwatch:TagResource permission.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps.Builder =
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps.builder()

    /**
     * @param description An optional description for this SLO.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    override fun goal(goal: IResolvable) {
      cdkBuilder.goal(goal.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    override fun goal(goal: CfnServiceLevelObjective.GoalProperty) {
      cdkBuilder.goal(goal.let(CfnServiceLevelObjective.GoalProperty.Companion::unwrap))
    }

    /**
     * @param goal This structure contains the attributes that determine the goal of an SLO.
     * This includes the time period for evaluation and the attainment threshold.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7d8e6fa676dacee31e34791ede9d863ce887b233f1872a37a794531b35a76af")
    override fun goal(goal: CfnServiceLevelObjective.GoalProperty.Builder.() -> Unit): Unit =
        goal(CfnServiceLevelObjective.GoalProperty(goal))

    /**
     * @param name A name for this SLO. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    override fun requestBasedSli(requestBasedSli: IResolvable) {
      cdkBuilder.requestBasedSli(requestBasedSli.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    override
        fun requestBasedSli(requestBasedSli: CfnServiceLevelObjective.RequestBasedSliProperty) {
      cdkBuilder.requestBasedSli(requestBasedSli.let(CfnServiceLevelObjective.RequestBasedSliProperty.Companion::unwrap))
    }

    /**
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("000f980b425d0b6891f6ef36960a0636e60afbc6da06a21ad970ba2fd73b78f9")
    override
        fun requestBasedSli(requestBasedSli: CfnServiceLevelObjective.RequestBasedSliProperty.Builder.() -> Unit):
        Unit = requestBasedSli(CfnServiceLevelObjective.RequestBasedSliProperty(requestBasedSli))

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    override fun sli(sli: IResolvable) {
      cdkBuilder.sli(sli.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    override fun sli(sli: CfnServiceLevelObjective.SliProperty) {
      cdkBuilder.sli(sli.let(CfnServiceLevelObjective.SliProperty.Companion::unwrap))
    }

    /**
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8470aec0aed83ad84a657d500f29ecab171b088c041f1b60ad5288eb501cab8")
    override fun sli(sli: CfnServiceLevelObjective.SliProperty.Builder.() -> Unit): Unit =
        sli(CfnServiceLevelObjective.SliProperty(sli))

    /**
     * @param tags A list of key-value pairs to associate with the SLO.
     * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
     * when you create the SLO, you must have the cloudwatch:TagResource permission.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to associate with the SLO.
     * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
     * when you create the SLO, you must have the cloudwatch:TagResource permission.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps,
  ) : CdkObject(cdkObject),
      CfnServiceLevelObjectiveProps {
    /**
     * An optional description for this SLO.
     *
     * Default: - "No description"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     */
    override fun goal(): Any? = unwrap(this).getGoal()

    /**
     * A name for this SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     */
    override fun requestBasedSli(): Any? = unwrap(this).getRequestBasedSli()

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     */
    override fun sli(): Any? = unwrap(this).getSli()

    /**
     * A list of key-value pairs to associate with the SLO.
     *
     * You can associate as many as 50 tags with an SLO. To be able to associate tags with the SLO
     * when you create the SLO, you must have the cloudwatch:TagResource permission.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceLevelObjectiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps):
        CfnServiceLevelObjectiveProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnServiceLevelObjectiveProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLevelObjectiveProps):
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps
  }
}
