@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::CloudWatchAlarmTemplate Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnCloudWatchAlarmTemplate cfnCloudWatchAlarmTemplate =
 * CfnCloudWatchAlarmTemplate.Builder.create(this, "MyCfnCloudWatchAlarmTemplate")
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
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
 * .groupIdentifier("groupIdentifier")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html)
 */
public open class CfnCloudWatchAlarmTemplate(
  cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudWatchAlarmTemplateProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudWatchAlarmTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudWatchAlarmTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudWatchAlarmTemplateProps(props)
  )

  /**
   * A cloudwatch alarm template's ARN (Amazon Resource Name).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time of resource creation.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * A CloudWatch alarm template group's id.
   *
   * Amazon Web Services provided template groups have ids that start with ``aws-``
   */
  public open fun attrGroupId(): String = unwrap(this).getAttrGroupId()

  /**
   * A cloudwatch alarm template's id.
   *
   * Amazon Web Services provided templates have ids that start with ``aws-``.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The date and time of latest resource modification.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The comparison operator used to compare the specified statistic and the threshold.
   */
  public open fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

  /**
   * The comparison operator used to compare the specified statistic and the threshold.
   */
  public open fun comparisonOperator(`value`: String) {
    unwrap(this).setComparisonOperator(`value`)
  }

  /**
   * The number of datapoints within the evaluation period that must be breaching to trigger the
   * alarm.
   */
  public open fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * The number of datapoints within the evaluation period that must be breaching to trigger the
   * alarm.
   */
  public open fun datapointsToAlarm(`value`: Number) {
    unwrap(this).setDatapointsToAlarm(`value`)
  }

  /**
   * A resource's optional description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's optional description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(`value`: Number) {
    unwrap(this).setEvaluationPeriods(`value`)
  }

  /**
   * A cloudwatch alarm template group's identifier.
   */
  public open fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

  /**
   * A cloudwatch alarm template group's identifier.
   */
  public open fun groupIdentifier(`value`: String) {
    unwrap(this).setGroupIdentifier(`value`)
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
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * A resource's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A resource's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The period, in seconds, over which the specified statistic is applied.
   */
  public open fun period(): Number = unwrap(this).getPeriod()

  /**
   * The period, in seconds, over which the specified statistic is applied.
   */
  public open fun period(`value`: Number) {
    unwrap(this).setPeriod(`value`)
  }

  /**
   * The statistic to apply to the alarm's metric data.
   */
  public open fun statistic(): String = unwrap(this).getStatistic()

  /**
   * The statistic to apply to the alarm's metric data.
   */
  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The resource type this template should dynamically generate CloudWatch metric alarms for.
   */
  public open fun targetResourceType(): String = unwrap(this).getTargetResourceType()

  /**
   * The resource type this template should dynamically generate CloudWatch metric alarms for.
   */
  public open fun targetResourceType(`value`: String) {
    unwrap(this).setTargetResourceType(`value`)
  }

  /**
   * The threshold value to compare with the specified statistic.
   */
  public open fun threshold(): Number = unwrap(this).getThreshold()

  /**
   * The threshold value to compare with the specified statistic.
   */
  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  /**
   * Specifies how missing data points are treated when evaluating the alarm's condition.
   */
  public open fun treatMissingData(): String = unwrap(this).getTreatMissingData()

  /**
   * Specifies how missing data points are treated when evaluating the alarm's condition.
   */
  public open fun treatMissingData(`value`: String) {
    unwrap(this).setTreatMissingData(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnCloudWatchAlarmTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The comparison operator used to compare the specified statistic and the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-comparisonoperator)
     * @param comparisonOperator The comparison operator used to compare the specified statistic and
     * the threshold. 
     */
    public fun comparisonOperator(comparisonOperator: String)

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the
     * alarm.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-datapointstoalarm)
     * @param datapointsToAlarm The number of datapoints within the evaluation period that must be
     * breaching to trigger the alarm. 
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-description)
     * @param description A resource's optional description. 
     */
    public fun description(description: String)

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-evaluationperiods)
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-groupidentifier)
     * @param groupIdentifier A cloudwatch alarm template group's identifier. 
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * The name of the metric associated with the alarm.
     *
     * Must be compatible with targetResourceType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    public fun metricName(metricName: String)

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-name)
     * @param name A resource's name. 
     */
    public fun name(name: String)

    /**
     * The period, in seconds, over which the specified statistic is applied.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-period)
     * @param period The period, in seconds, over which the specified statistic is applied. 
     */
    public fun period(period: Number)

    /**
     * The statistic to apply to the alarm's metric data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-statistic)
     * @param statistic The statistic to apply to the alarm's metric data. 
     */
    public fun statistic(statistic: String)

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The resource type this template should dynamically generate CloudWatch metric alarms for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-targetresourcetype)
     * @param targetResourceType The resource type this template should dynamically generate
     * CloudWatch metric alarms for. 
     */
    public fun targetResourceType(targetResourceType: String)

    /**
     * The threshold value to compare with the specified statistic.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-threshold)
     * @param threshold The threshold value to compare with the specified statistic. 
     */
    public fun threshold(threshold: Number)

    /**
     * Specifies how missing data points are treated when evaluating the alarm's condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-treatmissingdata)
     * @param treatMissingData Specifies how missing data points are treated when evaluating the
     * alarm's condition. 
     */
    public fun treatMissingData(treatMissingData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate.Builder =
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate.Builder.create(scope,
        id)

    /**
     * The comparison operator used to compare the specified statistic and the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-comparisonoperator)
     * @param comparisonOperator The comparison operator used to compare the specified statistic and
     * the threshold. 
     */
    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * The number of datapoints within the evaluation period that must be breaching to trigger the
     * alarm.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-datapointstoalarm)
     * @param datapointsToAlarm The number of datapoints within the evaluation period that must be
     * breaching to trigger the alarm. 
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-description)
     * @param description A resource's optional description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-evaluationperiods)
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-groupidentifier)
     * @param groupIdentifier A cloudwatch alarm template group's identifier. 
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * The name of the metric associated with the alarm.
     *
     * Must be compatible with targetResourceType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-name)
     * @param name A resource's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The period, in seconds, over which the specified statistic is applied.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-period)
     * @param period The period, in seconds, over which the specified statistic is applied. 
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    /**
     * The statistic to apply to the alarm's metric data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-statistic)
     * @param statistic The statistic to apply to the alarm's metric data. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The resource type this template should dynamically generate CloudWatch metric alarms for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-targetresourcetype)
     * @param targetResourceType The resource type this template should dynamically generate
     * CloudWatch metric alarms for. 
     */
    override fun targetResourceType(targetResourceType: String) {
      cdkBuilder.targetResourceType(targetResourceType)
    }

    /**
     * The threshold value to compare with the specified statistic.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-threshold)
     * @param threshold The threshold value to compare with the specified statistic. 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * Specifies how missing data points are treated when evaluating the alarm's condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplate.html#cfn-medialive-cloudwatchalarmtemplate-treatmissingdata)
     * @param treatMissingData Specifies how missing data points are treated when evaluating the
     * alarm's condition. 
     */
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudWatchAlarmTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudWatchAlarmTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate):
        CfnCloudWatchAlarmTemplate = CfnCloudWatchAlarmTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnCloudWatchAlarmTemplate):
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate
  }
}
