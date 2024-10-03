@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationsignals

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a service level objective (SLO), which can help you ensure that your critical
 * business operations are meeting customer expectations.
 *
 * Use SLOs to set and track specific target levels for the reliability and availability of your
 * applications and services. SLOs use service level indicators (SLIs) to calculate whether the
 * application is performing at the level that you want.
 *
 * Create an SLO to set a target for a service or operation’s availability or latency. CloudWatch
 * measures this target frequently you can find whether it has been breached.
 *
 * The target performance quality that is defined for an SLO is the *attainment goal* . An
 * attainment goal is the percentage of time or requests that the SLI is expected to meet the threshold
 * over each time interval. For example, an attainment goal of 99.9% means that within your interval,
 * you are targeting 99.9% of the periods to be in healthy state.
 *
 * When you create an SLO, you specify whether it is a *period-based SLO* or a *request-based SLO* .
 * Each type of SLO has a different way of evaluating your application's performance against its
 * attainment goal.
 *
 * * A *period-based SLO* uses defined *periods* of time within a specified total time interval. For
 * each period of time, Application Signals determines whether the application met its goal. The
 * attainment rate is calculated as the `number of good periods/number of total periods` .
 *
 * For example, for a period-based SLO, meeting an attainment goal of 99.9% means that within your
 * interval, your application must meet its performance goal during at least 99.9% of the time periods.
 *
 * * A *request-based SLO* doesn't use pre-defined periods of time. Instead, the SLO measures
 * `number of good requests/number of total requests` during the interval. At any time, you can find
 * the ratio of good requests to total requests for the interval up to the time stamp that you specify,
 * and measure that ratio against the goal set in your SLO.
 *
 * After you have created an SLO, you can retrieve error budget reports for it. An *error budget* is
 * the amount of time or amount of requests that your application can be non-compliant with the SLO's
 * goal, and still have your application meet the goal.
 *
 * * For a period-based SLO, the error budget starts at a number defined by the highest number of
 * periods that can fail to meet the threshold, while still meeting the overall goal. The *remaining
 * error budget* decreases with every failed period that is recorded. The error budget within one
 * interval can never increase.
 *
 * For example, an SLO with a threshold that 99.95% of requests must be completed under 2000ms every
 * month translates to an error budget of 21.9 minutes of downtime per month.
 *
 * * For a request-based SLO, the remaining error budget is dynamic and can increase or decrease,
 * depending on the ratio of good requests to total requests.
 *
 * When you call this operation, Application Signals creates the
 * *AWSServiceRoleForCloudWatchApplicationSignals* service-linked role, if it doesn't already exist in
 * your account. This service- linked role has the following permissions:
 *
 * * `xray:GetServiceGraph`
 * * `logs:StartQuery`
 * * `logs:GetQueryResults`
 * * `cloudwatch:GetMetricData`
 * * `cloudwatch:ListMetrics`
 * * `tag:GetResources`
 * * `autoscaling:DescribeAutoScalingGroups`
 *
 * You can easily set SLO targets for your applications that are discovered by Application Signals,
 * using critical metrics such as latency and availability. You can also set SLOs against any
 * CloudWatch metric or math expression that produces a time series.
 *
 * You cannot change from a period-based SLO to a request-based SLO, or change from a request-based
 * SLO to a period-based SLO.
 *
 * For more information about SLOs, see [Service level objectives
 * (SLOs)](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-ServiceLevelObjectives.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
 * CfnServiceLevelObjective cfnServiceLevelObjective = CfnServiceLevelObjective.Builder.create(this,
 * "MyCfnServiceLevelObjective")
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
public open class CfnServiceLevelObjective(
  cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceLevelObjectiveProps,
  ) :
      this(software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServiceLevelObjectiveProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceLevelObjectiveProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceLevelObjectiveProps(props)
  )

  /**
   * The ARN of this SLO.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that this SLO was created.
   */
  public open fun attrCreatedTime(): Number = unwrap(this).getAttrCreatedTime()

  /**
   * Displays whether this is a period-based SLO or a request-based SLO.
   */
  public open fun attrEvaluationType(): String = unwrap(this).getAttrEvaluationType()

  /**
   * The time that this SLO was most recently updated.
   */
  public open fun attrLastUpdatedTime(): Number = unwrap(this).getAttrLastUpdatedTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An optional description for this SLO.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for this SLO.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   */
  public open fun goal(): Any? = unwrap(this).getGoal()

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   */
  public open fun goal(`value`: IResolvable) {
    unwrap(this).setGoal(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   */
  public open fun goal(`value`: GoalProperty) {
    unwrap(this).setGoal(`value`.let(GoalProperty.Companion::unwrap))
  }

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa6bcfd902000791ad13e327df68e926d9668e1656c871aa3f8450bdd32a2cb8")
  public open fun goal(`value`: GoalProperty.Builder.() -> Unit): Unit = goal(GoalProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A name for this SLO.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for this SLO.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a request-based SLO.
   */
  public open fun requestBasedSli(): Any? = unwrap(this).getRequestBasedSli()

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a request-based SLO.
   */
  public open fun requestBasedSli(`value`: IResolvable) {
    unwrap(this).setRequestBasedSli(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a request-based SLO.
   */
  public open fun requestBasedSli(`value`: RequestBasedSliProperty) {
    unwrap(this).setRequestBasedSli(`value`.let(RequestBasedSliProperty.Companion::unwrap))
  }

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a request-based SLO.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e647ed381bc3bbb7aff483cb78c4e9e654eaca034e3ba32784c8a6791db8a387")
  public open fun requestBasedSli(`value`: RequestBasedSliProperty.Builder.() -> Unit): Unit =
      requestBasedSli(RequestBasedSliProperty(`value`))

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a period-based SLO.
   */
  public open fun sli(): Any? = unwrap(this).getSli()

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a period-based SLO.
   */
  public open fun sli(`value`: IResolvable) {
    unwrap(this).setSli(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a period-based SLO.
   */
  public open fun sli(`value`: SliProperty) {
    unwrap(this).setSli(`value`.let(SliProperty.Companion::unwrap))
  }

  /**
   * A structure containing information about the performance metric that this SLO monitors, if this
   * is a period-based SLO.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("424c566889a591a72c8b0a73b7a40e1165e54abe884c884ff5ed0ef5d2ec9be4")
  public open fun sli(`value`: SliProperty.Builder.() -> Unit): Unit = sli(SliProperty(`value`))

  /**
   * A list of key-value pairs to associate with the SLO.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs to associate with the SLO.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to associate with the SLO.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.applicationsignals.CfnServiceLevelObjective].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this SLO.
     *
     * Default: - "No description"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-description)
     * @param description An optional description for this SLO. 
     */
    public fun description(description: String)

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    public fun goal(goal: IResolvable)

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    public fun goal(goal: GoalProperty)

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad6ce6db124d50326efc75d49850dd75b48dec1b9861eaf5d99c8c83594a04")
    public fun goal(goal: GoalProperty.Builder.() -> Unit)

    /**
     * A name for this SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-name)
     * @param name A name for this SLO. 
     */
    public fun name(name: String)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    public fun requestBasedSli(requestBasedSli: IResolvable)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    public fun requestBasedSli(requestBasedSli: RequestBasedSliProperty)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba34371f44a1dc55bff04108b0fe8dbb17b8c87d323d4eb665b401f4c7de27cb")
    public fun requestBasedSli(requestBasedSli: RequestBasedSliProperty.Builder.() -> Unit)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    public fun sli(sli: IResolvable)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    public fun sli(sli: SliProperty)

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8e30b6292deeb3544d91aa8c7e6006b7d2eca4069967bca8afa3d27095e924b")
    public fun sli(sli: SliProperty.Builder.() -> Unit)

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
     * @param tags A list of key-value pairs to associate with the SLO. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of key-value pairs to associate with the SLO. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.Builder =
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.Builder.create(scope,
        id)

    /**
     * An optional description for this SLO.
     *
     * Default: - "No description"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-description)
     * @param description An optional description for this SLO. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    override fun goal(goal: IResolvable) {
      cdkBuilder.goal(goal.let(IResolvable.Companion::unwrap))
    }

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    override fun goal(goal: GoalProperty) {
      cdkBuilder.goal(goal.let(GoalProperty.Companion::unwrap))
    }

    /**
     * This structure contains the attributes that determine the goal of an SLO.
     *
     * This includes the time period for evaluation and the attainment threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-goal)
     * @param goal This structure contains the attributes that determine the goal of an SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad6ce6db124d50326efc75d49850dd75b48dec1b9861eaf5d99c8c83594a04")
    override fun goal(goal: GoalProperty.Builder.() -> Unit): Unit = goal(GoalProperty(goal))

    /**
     * A name for this SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-name)
     * @param name A name for this SLO. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    override fun requestBasedSli(requestBasedSli: IResolvable) {
      cdkBuilder.requestBasedSli(requestBasedSli.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    override fun requestBasedSli(requestBasedSli: RequestBasedSliProperty) {
      cdkBuilder.requestBasedSli(requestBasedSli.let(RequestBasedSliProperty.Companion::unwrap))
    }

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a request-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli)
     * @param requestBasedSli A structure containing information about the performance metric that
     * this SLO monitors, if this is a request-based SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba34371f44a1dc55bff04108b0fe8dbb17b8c87d323d4eb665b401f4c7de27cb")
    override fun requestBasedSli(requestBasedSli: RequestBasedSliProperty.Builder.() -> Unit): Unit
        = requestBasedSli(RequestBasedSliProperty(requestBasedSli))

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    override fun sli(sli: IResolvable) {
      cdkBuilder.sli(sli.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    override fun sli(sli: SliProperty) {
      cdkBuilder.sli(sli.let(SliProperty.Companion::unwrap))
    }

    /**
     * A structure containing information about the performance metric that this SLO monitors, if
     * this is a period-based SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-servicelevelobjective.html#cfn-applicationsignals-servicelevelobjective-sli)
     * @param sli A structure containing information about the performance metric that this SLO
     * monitors, if this is a period-based SLO. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8e30b6292deeb3544d91aa8c7e6006b7d2eca4069967bca8afa3d27095e924b")
    override fun sli(sli: SliProperty.Builder.() -> Unit): Unit = sli(SliProperty(sli))

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
     * @param tags A list of key-value pairs to associate with the SLO. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A list of key-value pairs to associate with the SLO. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceLevelObjective {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceLevelObjective(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective):
        CfnServiceLevelObjective = CfnServiceLevelObjective(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLevelObjective):
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective =
        wrapped.cdkObject as
        software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective
  }

  /**
   * If the interval for this service level objective is a calendar interval, this structure
   * contains the interval specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * CalendarIntervalProperty calendarIntervalProperty = CalendarIntervalProperty.builder()
   * .duration(123)
   * .durationUnit("durationUnit")
   * .startTime(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html)
   */
  public interface CalendarIntervalProperty {
    /**
     * Specifies the duration of each calendar interval.
     *
     * For example, if `Duration` is `1` and `DurationUnit` is `MONTH` , each interval is one month,
     * aligned with the calendar.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-duration)
     */
    public fun duration(): Number

    /**
     * Specifies the calendar interval unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-durationunit)
     */
    public fun durationUnit(): String

    /**
     * The date and time when you want the first interval to start.
     *
     * Be sure to choose a time that configures the intervals the way that you want. For example, if
     * you want weekly intervals starting on Mondays at 6 a.m., be sure to specify a start time that is
     * a Monday at 6 a.m.
     *
     * When used in a raw HTTP Query API, it is formatted as be epoch time in seconds. For example:
     * `1698778057`
     *
     * As soon as one calendar interval ends, another automatically begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-starttime)
     */
    public fun startTime(): Number

    /**
     * A builder for [CalendarIntervalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param duration Specifies the duration of each calendar interval. 
       * For example, if `Duration` is `1` and `DurationUnit` is `MONTH` , each interval is one
       * month, aligned with the calendar.
       */
      public fun duration(duration: Number)

      /**
       * @param durationUnit Specifies the calendar interval unit. 
       */
      public fun durationUnit(durationUnit: String)

      /**
       * @param startTime The date and time when you want the first interval to start. 
       * Be sure to choose a time that configures the intervals the way that you want. For example,
       * if you want weekly intervals starting on Mondays at 6 a.m., be sure to specify a start time
       * that is a Monday at 6 a.m.
       *
       * When used in a raw HTTP Query API, it is formatted as be epoch time in seconds. For
       * example: `1698778057`
       *
       * As soon as one calendar interval ends, another automatically begins.
       */
      public fun startTime(startTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty.builder()

      /**
       * @param duration Specifies the duration of each calendar interval. 
       * For example, if `Duration` is `1` and `DurationUnit` is `MONTH` , each interval is one
       * month, aligned with the calendar.
       */
      override fun duration(duration: Number) {
        cdkBuilder.duration(duration)
      }

      /**
       * @param durationUnit Specifies the calendar interval unit. 
       */
      override fun durationUnit(durationUnit: String) {
        cdkBuilder.durationUnit(durationUnit)
      }

      /**
       * @param startTime The date and time when you want the first interval to start. 
       * Be sure to choose a time that configures the intervals the way that you want. For example,
       * if you want weekly intervals starting on Mondays at 6 a.m., be sure to specify a start time
       * that is a Monday at 6 a.m.
       *
       * When used in a raw HTTP Query API, it is formatted as be epoch time in seconds. For
       * example: `1698778057`
       *
       * As soon as one calendar interval ends, another automatically begins.
       */
      override fun startTime(startTime: Number) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty,
    ) : CdkObject(cdkObject),
        CalendarIntervalProperty {
      /**
       * Specifies the duration of each calendar interval.
       *
       * For example, if `Duration` is `1` and `DurationUnit` is `MONTH` , each interval is one
       * month, aligned with the calendar.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-duration)
       */
      override fun duration(): Number = unwrap(this).getDuration()

      /**
       * Specifies the calendar interval unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-durationunit)
       */
      override fun durationUnit(): String = unwrap(this).getDurationUnit()

      /**
       * The date and time when you want the first interval to start.
       *
       * Be sure to choose a time that configures the intervals the way that you want. For example,
       * if you want weekly intervals starting on Mondays at 6 a.m., be sure to specify a start time
       * that is a Monday at 6 a.m.
       *
       * When used in a raw HTTP Query API, it is formatted as be epoch time in seconds. For
       * example: `1698778057`
       *
       * As soon as one calendar interval ends, another automatically begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-calendarinterval.html#cfn-applicationsignals-servicelevelobjective-calendarinterval-starttime)
       */
      override fun startTime(): Number = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CalendarIntervalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty):
          CalendarIntervalProperty = CdkObjectWrappers.wrap(cdkObject) as? CalendarIntervalProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CalendarIntervalProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.CalendarIntervalProperty
    }
  }

  /**
   * A dimension is a name/value pair that is part of the identity of a metric.
   *
   * Because dimensions are part of the unique identifier for a metric, whenever you add a unique
   * name/value pair to one of your metrics, you are creating a new variation of that metric. For
   * example, many Amazon EC2 metrics publish `InstanceId` as a dimension name, and the actual instance
   * ID as the value for that dimension.
   *
   * You can assign up to 30 dimensions to a metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * DimensionProperty dimensionProperty = DimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-dimension.html)
   */
  public interface DimensionProperty {
    /**
     * The name of the dimension.
     *
     * Dimension names must contain only ASCII characters, must include at least one non-whitespace
     * character, and cannot start with a colon ( `:` ). ASCII control characters are not supported as
     * part of dimension names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-dimension.html#cfn-applicationsignals-servicelevelobjective-dimension-name)
     */
    public fun name(): String

    /**
     * The value of the dimension.
     *
     * Dimension values must contain only ASCII characters and must include at least one
     * non-whitespace character. ASCII control characters are not supported as part of dimension
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-dimension.html#cfn-applicationsignals-servicelevelobjective-dimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [DimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the dimension. 
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon ( `:` ). ASCII control characters are
       * not supported as part of dimension names.
       */
      public fun name(name: String)

      /**
       * @param value The value of the dimension. 
       * Dimension values must contain only ASCII characters and must include at least one
       * non-whitespace character. ASCII control characters are not supported as part of dimension
       * values.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty.builder()

      /**
       * @param name The name of the dimension. 
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon ( `:` ). ASCII control characters are
       * not supported as part of dimension names.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the dimension. 
       * Dimension values must contain only ASCII characters and must include at least one
       * non-whitespace character. ASCII control characters are not supported as part of dimension
       * values.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty,
    ) : CdkObject(cdkObject),
        DimensionProperty {
      /**
       * The name of the dimension.
       *
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon ( `:` ). ASCII control characters are
       * not supported as part of dimension names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-dimension.html#cfn-applicationsignals-servicelevelobjective-dimension-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the dimension.
       *
       * Dimension values must contain only ASCII characters and must include at least one
       * non-whitespace character. ASCII control characters are not supported as part of dimension
       * values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-dimension.html#cfn-applicationsignals-servicelevelobjective-dimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty):
          DimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? DimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.DimensionProperty
    }
  }

  /**
   * This structure contains the attributes that determine the goal of an SLO.
   *
   * This includes the time period for evaluation and the attainment threshold.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * GoalProperty goalProperty = GoalProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html)
   */
  public interface GoalProperty {
    /**
     * The threshold that determines if the goal is being met.
     *
     * If this is a period-based SLO, the attainment goal is the percentage of good periods that
     * meet the threshold requirements to the total periods within the interval. For example, an
     * attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the periods
     * to be in healthy state.
     *
     * If this is a request-based SLO, the attainment goal is the percentage of requests that must
     * be successful to meet the attainment goal.
     *
     * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-attainmentgoal)
     */
    public fun attainmentGoal(): Number? = unwrap(this).getAttainmentGoal()

    /**
     * The time period used to evaluate the SLO. It can be either a calendar interval or rolling
     * interval.
     *
     * If you omit this parameter, a rolling interval of 7 days is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-interval)
     */
    public fun interval(): Any? = unwrap(this).getInterval()

    /**
     * The percentage of remaining budget over total budget that you want to get warnings for.
     *
     * If you omit this parameter, the default of 50.0 is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-warningthreshold)
     */
    public fun warningThreshold(): Number? = unwrap(this).getWarningThreshold()

    /**
     * A builder for [GoalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attainmentGoal The threshold that determines if the goal is being met.
       * If this is a period-based SLO, the attainment goal is the percentage of good periods that
       * meet the threshold requirements to the total periods within the interval. For example, an
       * attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the
       * periods to be in healthy state.
       *
       * If this is a request-based SLO, the attainment goal is the percentage of requests that must
       * be successful to meet the attainment goal.
       *
       * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
       */
      public fun attainmentGoal(attainmentGoal: Number)

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      public fun interval(interval: IResolvable)

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      public fun interval(interval: IntervalProperty)

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f282cbde9eaab94591b2248fadbdecdc9b1180104b975db69ddbe468d6fb5f")
      public fun interval(interval: IntervalProperty.Builder.() -> Unit)

      /**
       * @param warningThreshold The percentage of remaining budget over total budget that you want
       * to get warnings for.
       * If you omit this parameter, the default of 50.0 is used.
       */
      public fun warningThreshold(warningThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty.builder()

      /**
       * @param attainmentGoal The threshold that determines if the goal is being met.
       * If this is a period-based SLO, the attainment goal is the percentage of good periods that
       * meet the threshold requirements to the total periods within the interval. For example, an
       * attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the
       * periods to be in healthy state.
       *
       * If this is a request-based SLO, the attainment goal is the percentage of requests that must
       * be successful to meet the attainment goal.
       *
       * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
       */
      override fun attainmentGoal(attainmentGoal: Number) {
        cdkBuilder.attainmentGoal(attainmentGoal)
      }

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      override fun interval(interval: IResolvable) {
        cdkBuilder.interval(interval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      override fun interval(interval: IntervalProperty) {
        cdkBuilder.interval(interval.let(IntervalProperty.Companion::unwrap))
      }

      /**
       * @param interval The time period used to evaluate the SLO. It can be either a calendar
       * interval or rolling interval.
       * If you omit this parameter, a rolling interval of 7 days is used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f282cbde9eaab94591b2248fadbdecdc9b1180104b975db69ddbe468d6fb5f")
      override fun interval(interval: IntervalProperty.Builder.() -> Unit): Unit =
          interval(IntervalProperty(interval))

      /**
       * @param warningThreshold The percentage of remaining budget over total budget that you want
       * to get warnings for.
       * If you omit this parameter, the default of 50.0 is used.
       */
      override fun warningThreshold(warningThreshold: Number) {
        cdkBuilder.warningThreshold(warningThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty,
    ) : CdkObject(cdkObject),
        GoalProperty {
      /**
       * The threshold that determines if the goal is being met.
       *
       * If this is a period-based SLO, the attainment goal is the percentage of good periods that
       * meet the threshold requirements to the total periods within the interval. For example, an
       * attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the
       * periods to be in healthy state.
       *
       * If this is a request-based SLO, the attainment goal is the percentage of requests that must
       * be successful to meet the attainment goal.
       *
       * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-attainmentgoal)
       */
      override fun attainmentGoal(): Number? = unwrap(this).getAttainmentGoal()

      /**
       * The time period used to evaluate the SLO. It can be either a calendar interval or rolling
       * interval.
       *
       * If you omit this parameter, a rolling interval of 7 days is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-interval)
       */
      override fun interval(): Any? = unwrap(this).getInterval()

      /**
       * The percentage of remaining budget over total budget that you want to get warnings for.
       *
       * If you omit this parameter, the default of 50.0 is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-goal.html#cfn-applicationsignals-servicelevelobjective-goal-warningthreshold)
       */
      override fun warningThreshold(): Number? = unwrap(this).getWarningThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GoalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty):
          GoalProperty = CdkObjectWrappers.wrap(cdkObject) as? GoalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoalProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.GoalProperty
    }
  }

  /**
   * The time period used to evaluate the SLO.
   *
   * It can be either a calendar interval or rolling interval.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * IntervalProperty intervalProperty = IntervalProperty.builder()
   * .calendarInterval(CalendarIntervalProperty.builder()
   * .duration(123)
   * .durationUnit("durationUnit")
   * .startTime(123)
   * .build())
   * .rollingInterval(RollingIntervalProperty.builder()
   * .duration(123)
   * .durationUnit("durationUnit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-interval.html)
   */
  public interface IntervalProperty {
    /**
     * If the interval is a calendar interval, this structure contains the interval specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-interval.html#cfn-applicationsignals-servicelevelobjective-interval-calendarinterval)
     */
    public fun calendarInterval(): Any? = unwrap(this).getCalendarInterval()

    /**
     * If the interval is a rolling interval, this structure contains the interval specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-interval.html#cfn-applicationsignals-servicelevelobjective-interval-rollinginterval)
     */
    public fun rollingInterval(): Any? = unwrap(this).getRollingInterval()

    /**
     * A builder for [IntervalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      public fun calendarInterval(calendarInterval: IResolvable)

      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      public fun calendarInterval(calendarInterval: CalendarIntervalProperty)

      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d833aacc255893f0ec6c9ce725e9c7de1d6729085c3a474f97af1653d29f09")
      public fun calendarInterval(calendarInterval: CalendarIntervalProperty.Builder.() -> Unit)

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      public fun rollingInterval(rollingInterval: IResolvable)

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      public fun rollingInterval(rollingInterval: RollingIntervalProperty)

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3beb98a9fcd1121f0abdc45b85d9a0f3adc4a958246d4532670b2e6547fe45")
      public fun rollingInterval(rollingInterval: RollingIntervalProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty.builder()

      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      override fun calendarInterval(calendarInterval: IResolvable) {
        cdkBuilder.calendarInterval(calendarInterval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      override fun calendarInterval(calendarInterval: CalendarIntervalProperty) {
        cdkBuilder.calendarInterval(calendarInterval.let(CalendarIntervalProperty.Companion::unwrap))
      }

      /**
       * @param calendarInterval If the interval is a calendar interval, this structure contains the
       * interval specifications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d833aacc255893f0ec6c9ce725e9c7de1d6729085c3a474f97af1653d29f09")
      override fun calendarInterval(calendarInterval: CalendarIntervalProperty.Builder.() -> Unit):
          Unit = calendarInterval(CalendarIntervalProperty(calendarInterval))

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      override fun rollingInterval(rollingInterval: IResolvable) {
        cdkBuilder.rollingInterval(rollingInterval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      override fun rollingInterval(rollingInterval: RollingIntervalProperty) {
        cdkBuilder.rollingInterval(rollingInterval.let(RollingIntervalProperty.Companion::unwrap))
      }

      /**
       * @param rollingInterval If the interval is a rolling interval, this structure contains the
       * interval specifications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3beb98a9fcd1121f0abdc45b85d9a0f3adc4a958246d4532670b2e6547fe45")
      override fun rollingInterval(rollingInterval: RollingIntervalProperty.Builder.() -> Unit):
          Unit = rollingInterval(RollingIntervalProperty(rollingInterval))

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty,
    ) : CdkObject(cdkObject),
        IntervalProperty {
      /**
       * If the interval is a calendar interval, this structure contains the interval
       * specifications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-interval.html#cfn-applicationsignals-servicelevelobjective-interval-calendarinterval)
       */
      override fun calendarInterval(): Any? = unwrap(this).getCalendarInterval()

      /**
       * If the interval is a rolling interval, this structure contains the interval specifications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-interval.html#cfn-applicationsignals-servicelevelobjective-interval-rollinginterval)
       */
      override fun rollingInterval(): Any? = unwrap(this).getRollingInterval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntervalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty):
          IntervalProperty = CdkObjectWrappers.wrap(cdkObject) as? IntervalProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntervalProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.IntervalProperty
    }
  }

  /**
   * Use this structure to define a metric or metric math expression that you want to use as for a
   * service level objective.
   *
   * Each `MetricDataQuery` in the `MetricDataQueries` array specifies either a metric to retrieve,
   * or a metric math expression to be performed on retrieved metrics. A single `MetricDataQueries`
   * array can include as many as 20 `MetricDataQuery` structures in the array. The 20 structures can
   * include as many as 10 structures that contain a `MetricStat` parameter to retrieve a metric, and
   * as many as 10 structures that contain the `Expression` parameter to perform a math expression. Of
   * those `Expression` structures, exactly one must have true as the value for `ReturnData` . The
   * result of this expression used for the SLO.
   *
   * For more information about metric math expressions, see [Use metric
   * math](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html) .
   *
   * Within each `MetricDataQuery` object, you must specify either `Expression` or `MetricStat` but
   * not both.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * MetricDataQueryProperty metricDataQueryProperty = MetricDataQueryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html)
   */
  public interface MetricDataQueryProperty {
    /**
     * The ID of the account where this metric is located.
     *
     * If you are performing this operation in a monitoring account, use this to specify which
     * source account to retrieve this metric from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-accountid)
     */
    public fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * This field can contain a metric math expression to be performed on the other metrics that you
     * are retrieving within this `MetricDataQueries` structure.
     *
     * A math expression can use the `Id` of the other metrics or queries to refer to those metrics,
     * and can also use the `Id` of other expressions to use the result of those expressions. For more
     * information about metric math expressions, see [Metric Math Syntax and
     * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Within each `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A short name used to tie this object to the results in the response.
     *
     * This `Id` must be unique within a `MetricDataQueries` array. If you are performing math
     * expressions on this set of data, this name represents that data and can serve as a variable in
     * the metric math expression. The valid characters are letters, numbers, and underscore. The first
     * character must be a lowercase letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-id)
     */
    public fun id(): String

    /**
     * A metric to be used directly for the SLO, or to be used in the math expression that will be
     * used for the SLO.
     *
     * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat` but
     * not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-metricstat)
     */
    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    /**
     * Use this only if you are using a metric math expression for the SLO.
     *
     * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
     * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
     * `ReturnData` as `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-returndata)
     */
    public fun returnData(): Any? = unwrap(this).getReturnData()

    /**
     * A builder for [MetricDataQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountId The ID of the account where this metric is located.
       * If you are performing this operation in a monitoring account, use this to specify which
       * source account to retrieve this metric from.
       */
      public fun accountId(accountId: String)

      /**
       * @param expression This field can contain a metric math expression to be performed on the
       * other metrics that you are retrieving within this `MetricDataQueries` structure.
       * A math expression can use the `Id` of the other metrics or queries to refer to those
       * metrics, and can also use the `Id` of other expressions to use the result of those
       * expressions. For more information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      public fun expression(expression: String)

      /**
       * @param id A short name used to tie this object to the results in the response. 
       * This `Id` must be unique within a `MetricDataQueries` array. If you are performing math
       * expressions on this set of data, this name represents that data and can serve as a variable in
       * the metric math expression. The valid characters are letters, numbers, and underscore. The
       * first character must be a lowercase letter.
       */
      public fun id(id: String)

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      public fun metricStat(metricStat: IResolvable)

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      public fun metricStat(metricStat: MetricStatProperty)

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923a1f9634f7423f4a141f43f1a4bce47b0561d157e938d6f5022cbd11b65d71")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

      /**
       * @param returnData Use this only if you are using a metric math expression for the SLO.
       * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
       * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
       * `ReturnData` as `false` .
       */
      public fun returnData(returnData: Boolean)

      /**
       * @param returnData Use this only if you are using a metric math expression for the SLO.
       * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
       * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
       * `ReturnData` as `false` .
       */
      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty.builder()

      /**
       * @param accountId The ID of the account where this metric is located.
       * If you are performing this operation in a monitoring account, use this to specify which
       * source account to retrieve this metric from.
       */
      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      /**
       * @param expression This field can contain a metric math expression to be performed on the
       * other metrics that you are retrieving within this `MetricDataQueries` structure.
       * A math expression can use the `Id` of the other metrics or queries to refer to those
       * metrics, and can also use the `Id` of other expressions to use the result of those
       * expressions. For more information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param id A short name used to tie this object to the results in the response. 
       * This `Id` must be unique within a `MetricDataQueries` array. If you are performing math
       * expressions on this set of data, this name represents that data and can serve as a variable in
       * the metric math expression. The valid characters are letters, numbers, and underscore. The
       * first character must be a lowercase letter.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      override fun metricStat(metricStat: MetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(MetricStatProperty.Companion::unwrap))
      }

      /**
       * @param metricStat A metric to be used directly for the SLO, or to be used in the math
       * expression that will be used for the SLO.
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923a1f9634f7423f4a141f43f1a4bce47b0561d157e938d6f5022cbd11b65d71")
      override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      /**
       * @param returnData Use this only if you are using a metric math expression for the SLO.
       * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
       * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
       * `ReturnData` as `false` .
       */
      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      /**
       * @param returnData Use this only if you are using a metric math expression for the SLO.
       * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
       * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
       * `ReturnData` as `false` .
       */
      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty,
    ) : CdkObject(cdkObject),
        MetricDataQueryProperty {
      /**
       * The ID of the account where this metric is located.
       *
       * If you are performing this operation in a monitoring account, use this to specify which
       * source account to retrieve this metric from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-accountid)
       */
      override fun accountId(): String? = unwrap(this).getAccountId()

      /**
       * This field can contain a metric math expression to be performed on the other metrics that
       * you are retrieving within this `MetricDataQueries` structure.
       *
       * A math expression can use the `Id` of the other metrics or queries to refer to those
       * metrics, and can also use the `Id` of other expressions to use the result of those
       * expressions. For more information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A short name used to tie this object to the results in the response.
       *
       * This `Id` must be unique within a `MetricDataQueries` array. If you are performing math
       * expressions on this set of data, this name represents that data and can serve as a variable in
       * the metric math expression. The valid characters are letters, numbers, and underscore. The
       * first character must be a lowercase letter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * A metric to be used directly for the SLO, or to be used in the math expression that will be
       * used for the SLO.
       *
       * Within one `MetricDataQuery` object, you must specify either `Expression` or `MetricStat`
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-metricstat)
       */
      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      /**
       * Use this only if you are using a metric math expression for the SLO.
       *
       * Specify `true` for `ReturnData` for only the one expression result to use as the alarm. For
       * all other metrics and expressions in the same `CreateServiceLevelObjective` operation, specify
       * `ReturnData` as `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricdataquery.html#cfn-applicationsignals-servicelevelobjective-metricdataquery-returndata)
       */
      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty):
          MetricDataQueryProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDataQueryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricDataQueryProperty
    }
  }

  /**
   * This structure defines the metric used for a service level indicator, including the metric
   * name, namespace, and dimensions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * MetricProperty metricProperty = MetricProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .metricName("metricName")
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html)
   */
  public interface MetricProperty {
    /**
     * An array of one or more dimensions to use to define the metric that you want to use.
     *
     * For more information, see
     * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The namespace of the metric.
     *
     * For more information, see
     * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [MetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric to use.
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric.
       * For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty.builder()

      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensions An array of one or more dimensions to use to define the metric that you
       * want to use.
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric to use.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric.
       * For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty,
    ) : CdkObject(cdkObject),
        MetricProperty {
      /**
       * An array of one or more dimensions to use to define the metric that you want to use.
       *
       * For more information, see
       * [Dimensions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * The namespace of the metric.
       *
       * For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metric.html#cfn-applicationsignals-servicelevelobjective-metric-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty):
          MetricProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricProperty
    }
  }

  /**
   * This structure defines the metric to be used as the service level indicator, along with the
   * statistics, period, and unit.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * MetricStatProperty metricStatProperty = MetricStatProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html)
   */
  public interface MetricStatProperty {
    /**
     * The metric to use as the service level indicator, including the metric name, namespace, and
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-metric)
     */
    public fun metric(): Any

    /**
     * The granularity, in seconds, to be used for the metric.
     *
     * For metrics with regular resolution, a period can be as short as one minute (60 seconds) and
     * must be a multiple of 60. For high-resolution metrics that are collected at intervals of less
     * than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a `PutMetricData` call that includes a `StorageResolution`
     * of 1 second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-period)
     */
    public fun period(): Number

    /**
     * The statistic to use for comparison to the threshold.
     *
     * It can be any CloudWatch statistic or extended statistic. For more information about
     * statistics, see [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-stat)
     */
    public fun stat(): String

    /**
     * If you omit `Unit` then all data that was collected with any unit is returned, along with the
     * corresponding units that were specified when the data was reported to CloudWatch.
     *
     * If you specify a unit, the operation returns only data that was collected with that unit
     * specified. If you specify a unit that does not match the data collected, the results of the
     * operation are null. CloudWatch does not perform unit conversions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [MetricStatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      public fun metric(metric: MetricProperty)

      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8f07d0e72d73c0b5b5f26bd053e6853b061599fe92ad9a9c995e095a7ab9295")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      /**
       * @param period The granularity, in seconds, to be used for the metric. 
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       */
      public fun period(period: Number)

      /**
       * @param stat The statistic to use for comparison to the threshold. 
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       */
      public fun stat(stat: String)

      /**
       * @param unit If you omit `Unit` then all data that was collected with any unit is returned,
       * along with the corresponding units that were specified when the data was reported to
       * CloudWatch.
       * If you specify a unit, the operation returns only data that was collected with that unit
       * specified. If you specify a unit that does not match the data collected, the results of the
       * operation are null. CloudWatch does not perform unit conversions.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty.builder()

      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty.Companion::unwrap))
      }

      /**
       * @param metric The metric to use as the service level indicator, including the metric name,
       * namespace, and dimensions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8f07d0e72d73c0b5b5f26bd053e6853b061599fe92ad9a9c995e095a7ab9295")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      /**
       * @param period The granularity, in seconds, to be used for the metric. 
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param stat The statistic to use for comparison to the threshold. 
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       */
      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      /**
       * @param unit If you omit `Unit` then all data that was collected with any unit is returned,
       * along with the corresponding units that were specified when the data was reported to
       * CloudWatch.
       * If you specify a unit, the operation returns only data that was collected with that unit
       * specified. If you specify a unit that does not match the data collected, the results of the
       * operation are null. CloudWatch does not perform unit conversions.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty,
    ) : CdkObject(cdkObject),
        MetricStatProperty {
      /**
       * The metric to use as the service level indicator, including the metric name, namespace, and
       * dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-metric)
       */
      override fun metric(): Any = unwrap(this).getMetric()

      /**
       * The granularity, in seconds, to be used for the metric.
       *
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-period)
       */
      override fun period(): Number = unwrap(this).getPeriod()

      /**
       * The statistic to use for comparison to the threshold.
       *
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-stat)
       */
      override fun stat(): String = unwrap(this).getStat()

      /**
       * If you omit `Unit` then all data that was collected with any unit is returned, along with
       * the corresponding units that were specified when the data was reported to CloudWatch.
       *
       * If you specify a unit, the operation returns only data that was collected with that unit
       * specified. If you specify a unit that does not match the data collected, the results of the
       * operation are null. CloudWatch does not perform unit conversions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-metricstat.html#cfn-applicationsignals-servicelevelobjective-metricstat-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty):
          MetricStatProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricStatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MetricStatProperty
    }
  }

  /**
   * This structure defines the metric that is used as the "good request" or "bad request" value for
   * a request-based SLO.
   *
   * This value observed for the metric defined in `TotalRequestCountMetric` is divided by the
   * number found for `MonitoredRequestCountMetric` to determine the percentage of successful requests
   * that this SLO tracks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * MonitoredRequestCountMetricProperty monitoredRequestCountMetricProperty =
   * MonitoredRequestCountMetricProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-monitoredrequestcountmetric.html)
   */
  public interface MonitoredRequestCountMetricProperty {
    /**
     * If you want to count "bad requests" to determine the percentage of successful requests for
     * this request-based SLO, specify the metric to use as "bad requests" in this structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-monitoredrequestcountmetric.html#cfn-applicationsignals-servicelevelobjective-monitoredrequestcountmetric-badcountmetric)
     */
    public fun badCountMetric(): Any? = unwrap(this).getBadCountMetric()

    /**
     * If you want to count "good requests" to determine the percentage of successful requests for
     * this request-based SLO, specify the metric to use as "good requests" in this structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-monitoredrequestcountmetric.html#cfn-applicationsignals-servicelevelobjective-monitoredrequestcountmetric-goodcountmetric)
     */
    public fun goodCountMetric(): Any? = unwrap(this).getGoodCountMetric()

    /**
     * A builder for [MonitoredRequestCountMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      public fun badCountMetric(badCountMetric: IResolvable)

      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      public fun badCountMetric(badCountMetric: List<Any>)

      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      public fun badCountMetric(vararg badCountMetric: Any)

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      public fun goodCountMetric(goodCountMetric: IResolvable)

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      public fun goodCountMetric(goodCountMetric: List<Any>)

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      public fun goodCountMetric(vararg goodCountMetric: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty.builder()

      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      override fun badCountMetric(badCountMetric: IResolvable) {
        cdkBuilder.badCountMetric(badCountMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      override fun badCountMetric(badCountMetric: List<Any>) {
        cdkBuilder.badCountMetric(badCountMetric.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param badCountMetric If you want to count "bad requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "bad requests" in
       * this structure.
       */
      override fun badCountMetric(vararg badCountMetric: Any): Unit =
          badCountMetric(badCountMetric.toList())

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      override fun goodCountMetric(goodCountMetric: IResolvable) {
        cdkBuilder.goodCountMetric(goodCountMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      override fun goodCountMetric(goodCountMetric: List<Any>) {
        cdkBuilder.goodCountMetric(goodCountMetric.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param goodCountMetric If you want to count "good requests" to determine the percentage of
       * successful requests for this request-based SLO, specify the metric to use as "good requests"
       * in this structure.
       */
      override fun goodCountMetric(vararg goodCountMetric: Any): Unit =
          goodCountMetric(goodCountMetric.toList())

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty,
    ) : CdkObject(cdkObject),
        MonitoredRequestCountMetricProperty {
      /**
       * If you want to count "bad requests" to determine the percentage of successful requests for
       * this request-based SLO, specify the metric to use as "bad requests" in this structure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-monitoredrequestcountmetric.html#cfn-applicationsignals-servicelevelobjective-monitoredrequestcountmetric-badcountmetric)
       */
      override fun badCountMetric(): Any? = unwrap(this).getBadCountMetric()

      /**
       * If you want to count "good requests" to determine the percentage of successful requests for
       * this request-based SLO, specify the metric to use as "good requests" in this structure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-monitoredrequestcountmetric.html#cfn-applicationsignals-servicelevelobjective-monitoredrequestcountmetric-goodcountmetric)
       */
      override fun goodCountMetric(): Any? = unwrap(this).getGoodCountMetric()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoredRequestCountMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty):
          MonitoredRequestCountMetricProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitoredRequestCountMetricProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoredRequestCountMetricProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.MonitoredRequestCountMetricProperty
    }
  }

  /**
   * This structure contains the information about the metric that is used for a request-based SLO.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * RequestBasedSliMetricProperty requestBasedSliMetricProperty =
   * RequestBasedSliMetricProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html)
   */
  public interface RequestBasedSliMetricProperty {
    /**
     * This is a string-to-string map that contains information about the type of object that this
     * SLO is related to.
     *
     * It can include the following fields.
     *
     * * `Type` designates the type of object that this SLO is related to.
     * * `ResourceType` specifies the type of the resource. This field is used only when the value
     * of the `Type` field is `Resource` or `AWS::Resource` .
     * * `Name` specifies the name of the object. This is used only if the value of the `Type` field
     * is `Service` , `RemoteService` , or `AWS::Service` .
     * * `Identifier` identifies the resource objects of this resource. This is used only if the
     * value of the `Type` field is `Resource` or `AWS::Resource` .
     * * `Environment` specifies the location where this object is hosted, or what it belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-keyattributes)
     */
    public fun keyAttributes(): Any? = unwrap(this).getKeyAttributes()

    /**
     * If the SLO monitors either the `LATENCY` or `AVAILABILITY` metric that Application Signals
     * collects, this field displays which of those metrics is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-metrictype)
     */
    public fun metricType(): String? = unwrap(this).getMetricType()

    /**
     * Use this structure to define the metric that you want to use as the "good request" or "bad
     * request" value for a request-based SLO.
     *
     * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
     * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
     * requests that this SLO tracks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-monitoredrequestcountmetric)
     */
    public fun monitoredRequestCountMetric(): Any? = unwrap(this).getMonitoredRequestCountMetric()

    /**
     * If the SLO monitors a specific operation of the service, this field displays that operation
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-operationname)
     */
    public fun operationName(): String? = unwrap(this).getOperationName()

    /**
     * This structure defines the metric that is used as the "total requests" number for a
     * request-based SLO.
     *
     * The number observed for this metric is divided by the number of "good requests" or "bad
     * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-totalrequestcountmetric)
     */
    public fun totalRequestCountMetric(): Any? = unwrap(this).getTotalRequestCountMetric()

    /**
     * A builder for [RequestBasedSliMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyAttributes This is a string-to-string map that contains information about the
       * type of object that this SLO is related to.
       * It can include the following fields.
       *
       * * `Type` designates the type of object that this SLO is related to.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      public fun keyAttributes(keyAttributes: IResolvable)

      /**
       * @param keyAttributes This is a string-to-string map that contains information about the
       * type of object that this SLO is related to.
       * It can include the following fields.
       *
       * * `Type` designates the type of object that this SLO is related to.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      public fun keyAttributes(keyAttributes: Map<String, String>)

      /**
       * @param metricType If the SLO monitors either the `LATENCY` or `AVAILABILITY` metric that
       * Application Signals collects, this field displays which of those metrics is used.
       */
      public fun metricType(metricType: String)

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      public fun monitoredRequestCountMetric(monitoredRequestCountMetric: IResolvable)

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      public
          fun monitoredRequestCountMetric(monitoredRequestCountMetric: MonitoredRequestCountMetricProperty)

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cb391d6919914ca8c8b7f9ea8d900bd5df48e17fc14c24a13c4f9887e6e2fc")
      public
          fun monitoredRequestCountMetric(monitoredRequestCountMetric: MonitoredRequestCountMetricProperty.Builder.() -> Unit)

      /**
       * @param operationName If the SLO monitors a specific operation of the service, this field
       * displays that operation name.
       */
      public fun operationName(operationName: String)

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      public fun totalRequestCountMetric(totalRequestCountMetric: IResolvable)

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      public fun totalRequestCountMetric(totalRequestCountMetric: List<Any>)

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      public fun totalRequestCountMetric(vararg totalRequestCountMetric: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty.builder()

      /**
       * @param keyAttributes This is a string-to-string map that contains information about the
       * type of object that this SLO is related to.
       * It can include the following fields.
       *
       * * `Type` designates the type of object that this SLO is related to.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      override fun keyAttributes(keyAttributes: IResolvable) {
        cdkBuilder.keyAttributes(keyAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param keyAttributes This is a string-to-string map that contains information about the
       * type of object that this SLO is related to.
       * It can include the following fields.
       *
       * * `Type` designates the type of object that this SLO is related to.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      override fun keyAttributes(keyAttributes: Map<String, String>) {
        cdkBuilder.keyAttributes(keyAttributes)
      }

      /**
       * @param metricType If the SLO monitors either the `LATENCY` or `AVAILABILITY` metric that
       * Application Signals collects, this field displays which of those metrics is used.
       */
      override fun metricType(metricType: String) {
        cdkBuilder.metricType(metricType)
      }

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      override fun monitoredRequestCountMetric(monitoredRequestCountMetric: IResolvable) {
        cdkBuilder.monitoredRequestCountMetric(monitoredRequestCountMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      override
          fun monitoredRequestCountMetric(monitoredRequestCountMetric: MonitoredRequestCountMetricProperty) {
        cdkBuilder.monitoredRequestCountMetric(monitoredRequestCountMetric.let(MonitoredRequestCountMetricProperty.Companion::unwrap))
      }

      /**
       * @param monitoredRequestCountMetric Use this structure to define the metric that you want to
       * use as the "good request" or "bad request" value for a request-based SLO.
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cb391d6919914ca8c8b7f9ea8d900bd5df48e17fc14c24a13c4f9887e6e2fc")
      override
          fun monitoredRequestCountMetric(monitoredRequestCountMetric: MonitoredRequestCountMetricProperty.Builder.() -> Unit):
          Unit =
          monitoredRequestCountMetric(MonitoredRequestCountMetricProperty(monitoredRequestCountMetric))

      /**
       * @param operationName If the SLO monitors a specific operation of the service, this field
       * displays that operation name.
       */
      override fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
      }

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      override fun totalRequestCountMetric(totalRequestCountMetric: IResolvable) {
        cdkBuilder.totalRequestCountMetric(totalRequestCountMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      override fun totalRequestCountMetric(totalRequestCountMetric: List<Any>) {
        cdkBuilder.totalRequestCountMetric(totalRequestCountMetric.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param totalRequestCountMetric This structure defines the metric that is used as the "total
       * requests" number for a request-based SLO.
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       */
      override fun totalRequestCountMetric(vararg totalRequestCountMetric: Any): Unit =
          totalRequestCountMetric(totalRequestCountMetric.toList())

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty,
    ) : CdkObject(cdkObject),
        RequestBasedSliMetricProperty {
      /**
       * This is a string-to-string map that contains information about the type of object that this
       * SLO is related to.
       *
       * It can include the following fields.
       *
       * * `Type` designates the type of object that this SLO is related to.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-keyattributes)
       */
      override fun keyAttributes(): Any? = unwrap(this).getKeyAttributes()

      /**
       * If the SLO monitors either the `LATENCY` or `AVAILABILITY` metric that Application Signals
       * collects, this field displays which of those metrics is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-metrictype)
       */
      override fun metricType(): String? = unwrap(this).getMetricType()

      /**
       * Use this structure to define the metric that you want to use as the "good request" or "bad
       * request" value for a request-based SLO.
       *
       * This value observed for the metric defined in `TotalRequestCountMetric` will be divided by
       * the number found for `MonitoredRequestCountMetric` to determine the percentage of successful
       * requests that this SLO tracks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-monitoredrequestcountmetric)
       */
      override fun monitoredRequestCountMetric(): Any? =
          unwrap(this).getMonitoredRequestCountMetric()

      /**
       * If the SLO monitors a specific operation of the service, this field displays that operation
       * name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-operationname)
       */
      override fun operationName(): String? = unwrap(this).getOperationName()

      /**
       * This structure defines the metric that is used as the "total requests" number for a
       * request-based SLO.
       *
       * The number observed for this metric is divided by the number of "good requests" or "bad
       * requests" that is observed for the metric defined in `MonitoredRequestCountMetric` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedslimetric.html#cfn-applicationsignals-servicelevelobjective-requestbasedslimetric-totalrequestcountmetric)
       */
      override fun totalRequestCountMetric(): Any? = unwrap(this).getTotalRequestCountMetric()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestBasedSliMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty):
          RequestBasedSliMetricProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RequestBasedSliMetricProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestBasedSliMetricProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliMetricProperty
    }
  }

  /**
   * This structure contains information about the performance metric that a request-based SLO
   * monitors.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * RequestBasedSliProperty requestBasedSliProperty = RequestBasedSliProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html)
   */
  public interface RequestBasedSliProperty {
    /**
     * The arithmetic operation used when comparing the specified metric to the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-comparisonoperator)
     */
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    /**
     * This value is the threshold that the observed metric values of the SLI metric are compared
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-metricthreshold)
     */
    public fun metricThreshold(): Number? = unwrap(this).getMetricThreshold()

    /**
     * A structure that contains information about the metric that the SLO monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-requestbasedslimetric)
     */
    public fun requestBasedSliMetric(): Any

    /**
     * A builder for [RequestBasedSliProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The arithmetic operation used when comparing the specified metric
       * to the threshold.
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param metricThreshold This value is the threshold that the observed metric values of the
       * SLI metric are compared to.
       */
      public fun metricThreshold(metricThreshold: Number)

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      public fun requestBasedSliMetric(requestBasedSliMetric: IResolvable)

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      public fun requestBasedSliMetric(requestBasedSliMetric: RequestBasedSliMetricProperty)

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca176a0d6d3856c643a2cf3e079e7b6db95d2ee1b612ce959f2a61a47a8ab5fc")
      public
          fun requestBasedSliMetric(requestBasedSliMetric: RequestBasedSliMetricProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty.builder()

      /**
       * @param comparisonOperator The arithmetic operation used when comparing the specified metric
       * to the threshold.
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param metricThreshold This value is the threshold that the observed metric values of the
       * SLI metric are compared to.
       */
      override fun metricThreshold(metricThreshold: Number) {
        cdkBuilder.metricThreshold(metricThreshold)
      }

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      override fun requestBasedSliMetric(requestBasedSliMetric: IResolvable) {
        cdkBuilder.requestBasedSliMetric(requestBasedSliMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      override fun requestBasedSliMetric(requestBasedSliMetric: RequestBasedSliMetricProperty) {
        cdkBuilder.requestBasedSliMetric(requestBasedSliMetric.let(RequestBasedSliMetricProperty.Companion::unwrap))
      }

      /**
       * @param requestBasedSliMetric A structure that contains information about the metric that
       * the SLO monitors. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca176a0d6d3856c643a2cf3e079e7b6db95d2ee1b612ce959f2a61a47a8ab5fc")
      override
          fun requestBasedSliMetric(requestBasedSliMetric: RequestBasedSliMetricProperty.Builder.() -> Unit):
          Unit = requestBasedSliMetric(RequestBasedSliMetricProperty(requestBasedSliMetric))

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty,
    ) : CdkObject(cdkObject),
        RequestBasedSliProperty {
      /**
       * The arithmetic operation used when comparing the specified metric to the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-comparisonoperator)
       */
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      /**
       * This value is the threshold that the observed metric values of the SLI metric are compared
       * to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-metricthreshold)
       */
      override fun metricThreshold(): Number? = unwrap(this).getMetricThreshold()

      /**
       * A structure that contains information about the metric that the SLO monitors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-requestbasedsli.html#cfn-applicationsignals-servicelevelobjective-requestbasedsli-requestbasedslimetric)
       */
      override fun requestBasedSliMetric(): Any = unwrap(this).getRequestBasedSliMetric()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestBasedSliProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty):
          RequestBasedSliProperty = CdkObjectWrappers.wrap(cdkObject) as? RequestBasedSliProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestBasedSliProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RequestBasedSliProperty
    }
  }

  /**
   * If the interval for this SLO is a rolling interval, this structure contains the interval
   * specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * RollingIntervalProperty rollingIntervalProperty = RollingIntervalProperty.builder()
   * .duration(123)
   * .durationUnit("durationUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-rollinginterval.html)
   */
  public interface RollingIntervalProperty {
    /**
     * Specifies the duration of each rolling interval.
     *
     * For example, if `Duration` is `7` and `DurationUnit` is `DAY` , each rolling interval is
     * seven days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-rollinginterval.html#cfn-applicationsignals-servicelevelobjective-rollinginterval-duration)
     */
    public fun duration(): Number

    /**
     * Specifies the rolling interval unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-rollinginterval.html#cfn-applicationsignals-servicelevelobjective-rollinginterval-durationunit)
     */
    public fun durationUnit(): String

    /**
     * A builder for [RollingIntervalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param duration Specifies the duration of each rolling interval. 
       * For example, if `Duration` is `7` and `DurationUnit` is `DAY` , each rolling interval is
       * seven days.
       */
      public fun duration(duration: Number)

      /**
       * @param durationUnit Specifies the rolling interval unit. 
       */
      public fun durationUnit(durationUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty.builder()

      /**
       * @param duration Specifies the duration of each rolling interval. 
       * For example, if `Duration` is `7` and `DurationUnit` is `DAY` , each rolling interval is
       * seven days.
       */
      override fun duration(duration: Number) {
        cdkBuilder.duration(duration)
      }

      /**
       * @param durationUnit Specifies the rolling interval unit. 
       */
      override fun durationUnit(durationUnit: String) {
        cdkBuilder.durationUnit(durationUnit)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty,
    ) : CdkObject(cdkObject),
        RollingIntervalProperty {
      /**
       * Specifies the duration of each rolling interval.
       *
       * For example, if `Duration` is `7` and `DurationUnit` is `DAY` , each rolling interval is
       * seven days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-rollinginterval.html#cfn-applicationsignals-servicelevelobjective-rollinginterval-duration)
       */
      override fun duration(): Number = unwrap(this).getDuration()

      /**
       * Specifies the rolling interval unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-rollinginterval.html#cfn-applicationsignals-servicelevelobjective-rollinginterval-durationunit)
       */
      override fun durationUnit(): String = unwrap(this).getDurationUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RollingIntervalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty):
          RollingIntervalProperty = CdkObjectWrappers.wrap(cdkObject) as? RollingIntervalProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RollingIntervalProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.RollingIntervalProperty
    }
  }

  /**
   * Use this structure to specify the metric to be used for the SLO.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * SliMetricProperty sliMetricProperty = SliMetricProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html)
   */
  public interface SliMetricProperty {
    /**
     * If this SLO is related to a metric collected by Application Signals, you must use this field
     * to specify which service the SLO metric is related to.
     *
     * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
     *
     * This is a string-to-string map. It can include the following fields.
     *
     * * `Type` designates the type of object this is.
     * * `ResourceType` specifies the type of the resource. This field is used only when the value
     * of the `Type` field is `Resource` or `AWS::Resource` .
     * * `Name` specifies the name of the object. This is used only if the value of the `Type` field
     * is `Service` , `RemoteService` , or `AWS::Service` .
     * * `Identifier` identifies the resource objects of this resource. This is used only if the
     * value of the `Type` field is `Resource` or `AWS::Resource` .
     * * `Environment` specifies the location where this object is hosted, or what it belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-keyattributes)
     */
    public fun keyAttributes(): Any? = unwrap(this).getKeyAttributes()

    /**
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math
     * expression, use this structure to specify that metric or expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-metricdataqueries)
     */
    public fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()

    /**
     * If the SLO is to monitor either the `LATENCY` or `AVAILABILITY` metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-metrictype)
     */
    public fun metricType(): String? = unwrap(this).getMetricType()

    /**
     * If the SLO is to monitor a specific operation of the service, use this field to specify the
     * name of that operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-operationname)
     */
    public fun operationName(): String? = unwrap(this).getOperationName()

    /**
     * The number of seconds to use as the period for SLO evaluation.
     *
     * Your application's performance is compared to the SLI during each period. For each period,
     * the application is determined to have either achieved or not achieved the necessary performance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-periodseconds)
     */
    public fun periodSeconds(): Number? = unwrap(this).getPeriodSeconds()

    /**
     * The statistic to use for comparison to the threshold.
     *
     * It can be any CloudWatch statistic or extended statistic. For more information about
     * statistics, see [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-statistic)
     */
    public fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * A builder for [SliMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyAttributes If this SLO is related to a metric collected by Application Signals,
       * you must use this field to specify which service the SLO metric is related to.
       * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
       *
       * This is a string-to-string map. It can include the following fields.
       *
       * * `Type` designates the type of object this is.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      public fun keyAttributes(keyAttributes: IResolvable)

      /**
       * @param keyAttributes If this SLO is related to a metric collected by Application Signals,
       * you must use this field to specify which service the SLO metric is related to.
       * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
       *
       * This is a string-to-string map. It can include the following fields.
       *
       * * `Type` designates the type of object this is.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      public fun keyAttributes(keyAttributes: Map<String, String>)

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      public fun metricDataQueries(metricDataQueries: IResolvable)

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      public fun metricDataQueries(metricDataQueries: List<Any>)

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      public fun metricDataQueries(vararg metricDataQueries: Any)

      /**
       * @param metricType If the SLO is to monitor either the `LATENCY` or `AVAILABILITY` metric
       * that Application Signals collects, use this field to specify which of those metrics is used.
       */
      public fun metricType(metricType: String)

      /**
       * @param operationName If the SLO is to monitor a specific operation of the service, use this
       * field to specify the name of that operation.
       */
      public fun operationName(operationName: String)

      /**
       * @param periodSeconds The number of seconds to use as the period for SLO evaluation.
       * Your application's performance is compared to the SLI during each period. For each period,
       * the application is determined to have either achieved or not achieved the necessary
       * performance.
       */
      public fun periodSeconds(periodSeconds: Number)

      /**
       * @param statistic The statistic to use for comparison to the threshold.
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       */
      public fun statistic(statistic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty.builder()

      /**
       * @param keyAttributes If this SLO is related to a metric collected by Application Signals,
       * you must use this field to specify which service the SLO metric is related to.
       * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
       *
       * This is a string-to-string map. It can include the following fields.
       *
       * * `Type` designates the type of object this is.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      override fun keyAttributes(keyAttributes: IResolvable) {
        cdkBuilder.keyAttributes(keyAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param keyAttributes If this SLO is related to a metric collected by Application Signals,
       * you must use this field to specify which service the SLO metric is related to.
       * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
       *
       * This is a string-to-string map. It can include the following fields.
       *
       * * `Type` designates the type of object this is.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       */
      override fun keyAttributes(keyAttributes: Map<String, String>) {
        cdkBuilder.keyAttributes(keyAttributes)
      }

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param metricDataQueries If this SLO monitors a CloudWatch metric or the result of a
       * CloudWatch metric math expression, use this structure to specify that metric or expression.
       */
      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      /**
       * @param metricType If the SLO is to monitor either the `LATENCY` or `AVAILABILITY` metric
       * that Application Signals collects, use this field to specify which of those metrics is used.
       */
      override fun metricType(metricType: String) {
        cdkBuilder.metricType(metricType)
      }

      /**
       * @param operationName If the SLO is to monitor a specific operation of the service, use this
       * field to specify the name of that operation.
       */
      override fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
      }

      /**
       * @param periodSeconds The number of seconds to use as the period for SLO evaluation.
       * Your application's performance is compared to the SLI during each period. For each period,
       * the application is determined to have either achieved or not achieved the necessary
       * performance.
       */
      override fun periodSeconds(periodSeconds: Number) {
        cdkBuilder.periodSeconds(periodSeconds)
      }

      /**
       * @param statistic The statistic to use for comparison to the threshold.
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty,
    ) : CdkObject(cdkObject),
        SliMetricProperty {
      /**
       * If this SLO is related to a metric collected by Application Signals, you must use this
       * field to specify which service the SLO metric is related to.
       *
       * To do so, you must specify at least the `Type` , `Name` , and `Environment` attributes.
       *
       * This is a string-to-string map. It can include the following fields.
       *
       * * `Type` designates the type of object this is.
       * * `ResourceType` specifies the type of the resource. This field is used only when the value
       * of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Name` specifies the name of the object. This is used only if the value of the `Type`
       * field is `Service` , `RemoteService` , or `AWS::Service` .
       * * `Identifier` identifies the resource objects of this resource. This is used only if the
       * value of the `Type` field is `Resource` or `AWS::Resource` .
       * * `Environment` specifies the location where this object is hosted, or what it belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-keyattributes)
       */
      override fun keyAttributes(): Any? = unwrap(this).getKeyAttributes()

      /**
       * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math
       * expression, use this structure to specify that metric or expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-metricdataqueries)
       */
      override fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()

      /**
       * If the SLO is to monitor either the `LATENCY` or `AVAILABILITY` metric that Application
       * Signals collects, use this field to specify which of those metrics is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-metrictype)
       */
      override fun metricType(): String? = unwrap(this).getMetricType()

      /**
       * If the SLO is to monitor a specific operation of the service, use this field to specify the
       * name of that operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-operationname)
       */
      override fun operationName(): String? = unwrap(this).getOperationName()

      /**
       * The number of seconds to use as the period for SLO evaluation.
       *
       * Your application's performance is compared to the SLI during each period. For each period,
       * the application is determined to have either achieved or not achieved the necessary
       * performance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-periodseconds)
       */
      override fun periodSeconds(): Number? = unwrap(this).getPeriodSeconds()

      /**
       * The statistic to use for comparison to the threshold.
       *
       * It can be any CloudWatch statistic or extended statistic. For more information about
       * statistics, see [CloudWatch statistics
       * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-slimetric.html#cfn-applicationsignals-servicelevelobjective-slimetric-statistic)
       */
      override fun statistic(): String? = unwrap(this).getStatistic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SliMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty):
          SliMetricProperty = CdkObjectWrappers.wrap(cdkObject) as? SliMetricProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SliMetricProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliMetricProperty
    }
  }

  /**
   * This structure specifies the information about the service and the performance metric that an
   * SLO is to monitor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
   * SliProperty sliProperty = SliProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html)
   */
  public interface SliProperty {
    /**
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * The value that the SLI metric is compared to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-metricthreshold)
     */
    public fun metricThreshold(): Number

    /**
     * Use this structure to specify the metric to be used for the SLO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-slimetric)
     */
    public fun sliMetric(): Any

    /**
     * A builder for [SliProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The arithmetic operation to use when comparing the specified
       * metric to the threshold. 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param metricThreshold The value that the SLI metric is compared to. 
       */
      public fun metricThreshold(metricThreshold: Number)

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      public fun sliMetric(sliMetric: IResolvable)

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      public fun sliMetric(sliMetric: SliMetricProperty)

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7169265480dcba48db20567a7d8a7727f7c8ba171b801acab3161141de11df84")
      public fun sliMetric(sliMetric: SliMetricProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty.Builder
          =
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty.builder()

      /**
       * @param comparisonOperator The arithmetic operation to use when comparing the specified
       * metric to the threshold. 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param metricThreshold The value that the SLI metric is compared to. 
       */
      override fun metricThreshold(metricThreshold: Number) {
        cdkBuilder.metricThreshold(metricThreshold)
      }

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      override fun sliMetric(sliMetric: IResolvable) {
        cdkBuilder.sliMetric(sliMetric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      override fun sliMetric(sliMetric: SliMetricProperty) {
        cdkBuilder.sliMetric(sliMetric.let(SliMetricProperty.Companion::unwrap))
      }

      /**
       * @param sliMetric Use this structure to specify the metric to be used for the SLO. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7169265480dcba48db20567a7d8a7727f7c8ba171b801acab3161141de11df84")
      override fun sliMetric(sliMetric: SliMetricProperty.Builder.() -> Unit): Unit =
          sliMetric(SliMetricProperty(sliMetric))

      public fun build():
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty,
    ) : CdkObject(cdkObject),
        SliProperty {
      /**
       * The arithmetic operation to use when comparing the specified metric to the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * The value that the SLI metric is compared to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-metricthreshold)
       */
      override fun metricThreshold(): Number = unwrap(this).getMetricThreshold()

      /**
       * Use this structure to specify the metric to be used for the SLO.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationsignals-servicelevelobjective-sli.html#cfn-applicationsignals-servicelevelobjective-sli-slimetric)
       */
      override fun sliMetric(): Any = unwrap(this).getSliMetric()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SliProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty):
          SliProperty = CdkObjectWrappers.wrap(cdkObject) as? SliProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SliProperty):
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective.SliProperty
    }
  }
}
