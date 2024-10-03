@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnCloudWatchAlarmTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnCloudWatchAlarmTemplateProps cfnCloudWatchAlarmTemplateProps =
 * CfnCloudWatchAlarmTemplateProps.builder()
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * .groupIdentifier("groupIdentifier")
 * .metricName("metricName")
 * .name("name")
 * .period(123)
 * .statistic("statistic")
 * .targetResourceType("targetResourceType")
 * .threshold(123)
 * .treatMissingData("treatMissingData")
 * // the properties below are optional
 * .datapointsToAlarm(123)
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html)
 */
public interface CfnCloudWatchAlarmTemplateProps {
  /**
   * The comparison operator used to compare the specified statistic and the threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-comparisonoperator)
   */
  public fun comparisonOperator(): String

  /**
   * The number of datapoints within the evaluation period that must be breaching to trigger the
   * alarm.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-datapointstoalarm)
   */
  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * A resource's optional description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The number of periods over which data is compared to the specified threshold.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-evaluationperiods)
   */
  public fun evaluationPeriods(): Number

  /**
   * A cloudwatch alarm template group's identifier.
   *
   * Can be either be its id or current name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-groupidentifier)
   */
  public fun groupIdentifier(): String

  /**
   * The name of the metric associated with the alarm.
   *
   * Must be compatible with targetResourceType.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-metricname)
   */
  public fun metricName(): String

  /**
   * A resource's name.
   *
   * Names must be unique within the scope of a resource type in a specific region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-name)
   */
  public fun name(): String

  /**
   * The period, in seconds, over which the specified statistic is applied.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-period)
   */
  public fun period(): Number

  /**
   * The statistic to apply to the alarm's metric data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-statistic)
   */
  public fun statistic(): String

  /**
   * Represents the tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The resource type this template should dynamically generate CloudWatch metric alarms for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-targetresourcetype)
   */
  public fun targetResourceType(): String

  /**
   * The threshold value to compare with the specified statistic.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-threshold)
   */
  public fun threshold(): Number

  /**
   * Specifies how missing data points are treated when evaluating the alarm's condition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-treatmissingdata)
   */
  public fun treatMissingData(): String

  /**
   * A builder for [CfnCloudWatchAlarmTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comparisonOperator The comparison operator used to compare the specified statistic and
     * the threshold. 
     */
    public fun comparisonOperator(comparisonOperator: String)

    /**
     * @param datapointsToAlarm The number of datapoints within the evaluation period that must be
     * breaching to trigger the alarm.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param description A resource's optional description.
     */
    public fun description(description: String)

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * @param groupIdentifier A cloudwatch alarm template group's identifier. 
     * Can be either be its id or current name.
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * @param metricName The name of the metric associated with the alarm. 
     * Must be compatible with targetResourceType.
     */
    public fun metricName(metricName: String)

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    public fun name(name: String)

    /**
     * @param period The period, in seconds, over which the specified statistic is applied. 
     */
    public fun period(period: Number)

    /**
     * @param statistic The statistic to apply to the alarm's metric data. 
     */
    public fun statistic(statistic: String)

    /**
     * @param tags Represents the tags associated with a resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetResourceType The resource type this template should dynamically generate
     * CloudWatch metric alarms for. 
     */
    public fun targetResourceType(targetResourceType: String)

    /**
     * @param threshold The threshold value to compare with the specified statistic. 
     */
    public fun threshold(threshold: Number)

    /**
     * @param treatMissingData Specifies how missing data points are treated when evaluating the
     * alarm's condition. 
     */
    public fun treatMissingData(treatMissingData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps.Builder =
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps.builder()

    /**
     * @param comparisonOperator The comparison operator used to compare the specified statistic and
     * the threshold. 
     */
    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param datapointsToAlarm The number of datapoints within the evaluation period that must be
     * breaching to trigger the alarm.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param description A resource's optional description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param groupIdentifier A cloudwatch alarm template group's identifier. 
     * Can be either be its id or current name.
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * @param metricName The name of the metric associated with the alarm. 
     * Must be compatible with targetResourceType.
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param period The period, in seconds, over which the specified statistic is applied. 
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    /**
     * @param statistic The statistic to apply to the alarm's metric data. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param tags Represents the tags associated with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetResourceType The resource type this template should dynamically generate
     * CloudWatch metric alarms for. 
     */
    override fun targetResourceType(targetResourceType: String) {
      cdkBuilder.targetResourceType(targetResourceType)
    }

    /**
     * @param threshold The threshold value to compare with the specified statistic. 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * @param treatMissingData Specifies how missing data points are treated when evaluating the
     * alarm's condition. 
     */
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps,
  ) : CdkObject(cdkObject),
      CfnCloudWatchAlarmTemplateProps {
    /**
     * The comparison operator used to compare the specified statistic and the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-comparisonoperator)
     */
    override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the
     * alarm.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-datapointstoalarm)
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-evaluationperiods)
     */
    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-groupidentifier)
     */
    override fun groupIdentifier(): String = unwrap(this).getGroupIdentifier()

    /**
     * The name of the metric associated with the alarm.
     *
     * Must be compatible with targetResourceType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The period, in seconds, over which the specified statistic is applied.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-period)
     */
    override fun period(): Number = unwrap(this).getPeriod()

    /**
     * The statistic to apply to the alarm's metric data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-statistic)
     */
    override fun statistic(): String = unwrap(this).getStatistic()

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The resource type this template should dynamically generate CloudWatch metric alarms for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-targetresourcetype)
     */
    override fun targetResourceType(): String = unwrap(this).getTargetResourceType()

    /**
     * The threshold value to compare with the specified statistic.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-threshold)
     */
    override fun threshold(): Number = unwrap(this).getThreshold()

    /**
     * Specifies how missing data points are treated when evaluating the alarm's condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-treatmissingdata)
     */
    override fun treatMissingData(): String = unwrap(this).getTreatMissingData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudWatchAlarmTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps):
        CfnCloudWatchAlarmTemplateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudWatchAlarmTemplateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudWatchAlarmTemplateProps):
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps
  }
}
