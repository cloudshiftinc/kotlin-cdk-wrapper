@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a metric stream.
 *
 * Metrics streams can automatically stream CloudWatch metrics to AWS destinations including Amazon
 * S3 and to many third-party solutions. For more information, see [Metric
 * streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Metric-Streams.html)
 * .
 *
 * To create a metric stream, you must be logged on to an account that has the `iam:PassRole`
 * permission and either the *CloudWatchFullAccess* policy or the `cloudwatch:PutMetricStream`
 * permission.
 *
 * When you create or update a metric stream, you choose one of the following:
 *
 * * Stream metrics from all metric namespaces in the account.
 * * Stream metrics from all metric namespaces in the account, except for the namespaces that you
 * list in `ExcludeFilters` .
 * * Stream metrics from only the metric namespaces that you list in `IncludeFilters` .
 *
 * When you create a metric stream, the stream is created in the `running` state. If you update an
 * existing metric stream, the state does not change.
 *
 * If you create a metric stream in an account that has been set up as a monitoring account in
 * CloudWatch cross-account observability, you can choose whether to include metrics from linked source
 * accounts in the metric stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * CfnMetricStream cfnMetricStream = CfnMetricStream.Builder.create(this, "MyCfnMetricStream")
 * .firehoseArn("firehoseArn")
 * .outputFormat("outputFormat")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .excludeFilters(List.of(MetricStreamFilterProperty.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .metricNames(List.of("metricNames"))
 * .build()))
 * .includeFilters(List.of(MetricStreamFilterProperty.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .metricNames(List.of("metricNames"))
 * .build()))
 * .includeLinkedAccountsMetrics(false)
 * .name("name")
 * .statisticsConfigurations(List.of(MetricStreamStatisticsConfigurationProperty.builder()
 * .additionalStatistics(List.of("additionalStatistics"))
 * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html)
 */
public open class CfnMetricStream(
  cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMetricStreamProps,
  ) :
      this(software.amazon.awscdk.services.cloudwatch.CfnMetricStream(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMetricStreamProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMetricStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMetricStreamProps(props)
  )

  /**
   * The ARN of the metric stream.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date that the metric stream was originally created.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The date that the metric stream was most recently updated.
   */
  public open fun attrLastUpdateDate(): String = unwrap(this).getAttrLastUpdateDate()

  /**
   * The state of the metric stream, either `running` or `stopped` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * If you specify this parameter, the stream sends metrics from all metric namespaces except for
   * the namespaces that you specify here.
   */
  public open fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

  /**
   * If you specify this parameter, the stream sends metrics from all metric namespaces except for
   * the namespaces that you specify here.
   */
  public open fun excludeFilters(`value`: IResolvable) {
    unwrap(this).setExcludeFilters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If you specify this parameter, the stream sends metrics from all metric namespaces except for
   * the namespaces that you specify here.
   */
  public open fun excludeFilters(`value`: List<Any>) {
    unwrap(this).setExcludeFilters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * If you specify this parameter, the stream sends metrics from all metric namespaces except for
   * the namespaces that you specify here.
   */
  public open fun excludeFilters(vararg `value`: Any): Unit = excludeFilters(`value`.toList())

  /**
   * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
   */
  public open fun firehoseArn(): String = unwrap(this).getFirehoseArn()

  /**
   * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
   */
  public open fun firehoseArn(`value`: String) {
    unwrap(this).setFirehoseArn(`value`)
  }

  /**
   * If you specify this parameter, the stream sends only the metrics from the metric namespaces
   * that you specify here.
   */
  public open fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

  /**
   * If you specify this parameter, the stream sends only the metrics from the metric namespaces
   * that you specify here.
   */
  public open fun includeFilters(`value`: IResolvable) {
    unwrap(this).setIncludeFilters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If you specify this parameter, the stream sends only the metrics from the metric namespaces
   * that you specify here.
   */
  public open fun includeFilters(`value`: List<Any>) {
    unwrap(this).setIncludeFilters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * If you specify this parameter, the stream sends only the metrics from the metric namespaces
   * that you specify here.
   */
  public open fun includeFilters(vararg `value`: Any): Unit = includeFilters(`value`.toList())

  /**
   * If you are creating a metric stream in a monitoring account, specify `true` to include metrics
   * from source accounts that are linked to this monitoring account, in the metric stream.
   */
  public open fun includeLinkedAccountsMetrics(): Any? =
      unwrap(this).getIncludeLinkedAccountsMetrics()

  /**
   * If you are creating a metric stream in a monitoring account, specify `true` to include metrics
   * from source accounts that are linked to this monitoring account, in the metric stream.
   */
  public open fun includeLinkedAccountsMetrics(`value`: Boolean) {
    unwrap(this).setIncludeLinkedAccountsMetrics(`value`)
  }

  /**
   * If you are creating a metric stream in a monitoring account, specify `true` to include metrics
   * from source accounts that are linked to this monitoring account, in the metric stream.
   */
  public open fun includeLinkedAccountsMetrics(`value`: IResolvable) {
    unwrap(this).setIncludeLinkedAccountsMetrics(`value`.let(IResolvable.Companion::unwrap))
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
   * If you are creating a new metric stream, this is the name for the new stream.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * If you are creating a new metric stream, this is the name for the new stream.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The output format for the stream.
   */
  public open fun outputFormat(): String = unwrap(this).getOutputFormat()

  /**
   * The output format for the stream.
   */
  public open fun outputFormat(`value`: String) {
    unwrap(this).setOutputFormat(`value`)
  }

  /**
   * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
   * resources.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
   * resources.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each
   * metric that is streamed.
   */
  public open fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

  /**
   * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each
   * metric that is streamed.
   */
  public open fun statisticsConfigurations(`value`: IResolvable) {
    unwrap(this).setStatisticsConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each
   * metric that is streamed.
   */
  public open fun statisticsConfigurations(`value`: List<Any>) {
    unwrap(this).setStatisticsConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each
   * metric that is streamed.
   */
  public open fun statisticsConfigurations(vararg `value`: Any): Unit =
      statisticsConfigurations(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to the metric stream.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to the metric stream.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the metric stream.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnMetricStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    public fun excludeFilters(excludeFilters: IResolvable)

    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    public fun excludeFilters(excludeFilters: List<Any>)

    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    public fun excludeFilters(vararg excludeFilters: Any)

    /**
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     *
     * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same
     * account as the metric stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-firehosearn)
     * @param firehoseArn The ARN of the Amazon Kinesis Firehose delivery stream to use for this
     * metric stream. 
     */
    public fun firehoseArn(firehoseArn: String)

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    public fun includeFilters(includeFilters: IResolvable)

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    public fun includeFilters(includeFilters: List<Any>)

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    public fun includeFilters(vararg includeFilters: Any)

    /**
     * If you are creating a metric stream in a monitoring account, specify `true` to include
     * metrics from source accounts that are linked to this monitoring account, in the metric stream.
     *
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includelinkedaccountsmetrics)
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream. 
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean)

    /**
     * If you are creating a metric stream in a monitoring account, specify `true` to include
     * metrics from source accounts that are linked to this monitoring account, in the metric stream.
     *
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includelinkedaccountsmetrics)
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream. 
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable)

    /**
     * If you are creating a new metric stream, this is the name for the new stream.
     *
     * The name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-name)
     * @param name If you are creating a new metric stream, this is the name for the new stream. 
     */
    public fun name(name: String)

    /**
     * The output format for the stream.
     *
     * Valid values are `json` , `opentelemetry1.0` and `opentelemetry0.7` For more information
     * about metric stream output formats, see [Metric streams output
     * formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
     * .
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-outputformat)
     * @param outputFormat The output format for the stream. 
     */
    public fun outputFormat(outputFormat: String)

    /**
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
     * resources.
     *
     * This IAM role must already exist and must be in the same account as the metric stream. This
     * IAM role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-rolearn)
     * @param roleArn The ARN of an IAM role that this metric stream will use to access Amazon
     * Kinesis Firehose resources. 
     */
    public fun roleArn(roleArn: String)

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    public fun statisticsConfigurations(statisticsConfigurations: IResolvable)

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    public fun statisticsConfigurations(statisticsConfigurations: List<Any>)

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    public fun statisticsConfigurations(vararg statisticsConfigurations: Any)

    /**
     * An array of key-value pairs to apply to the metric stream.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
     * @param tags An array of key-value pairs to apply to the metric stream. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the metric stream.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
     * @param tags An array of key-value pairs to apply to the metric stream. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream.Builder.create(scope, id)

    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    override fun excludeFilters(excludeFilters: IResolvable) {
      cdkBuilder.excludeFilters(excludeFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    override fun excludeFilters(excludeFilters: List<Any>) {
      cdkBuilder.excludeFilters(excludeFilters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * If you specify this parameter, the stream sends metrics from all metric namespaces except for
     * the namespaces that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-excludefilters)
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here. 
     */
    override fun excludeFilters(vararg excludeFilters: Any): Unit =
        excludeFilters(excludeFilters.toList())

    /**
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     *
     * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same
     * account as the metric stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-firehosearn)
     * @param firehoseArn The ARN of the Amazon Kinesis Firehose delivery stream to use for this
     * metric stream. 
     */
    override fun firehoseArn(firehoseArn: String) {
      cdkBuilder.firehoseArn(firehoseArn)
    }

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    override fun includeFilters(includeFilters: IResolvable) {
      cdkBuilder.includeFilters(includeFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    override fun includeFilters(includeFilters: List<Any>) {
      cdkBuilder.includeFilters(includeFilters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * If you specify this parameter, the stream sends only the metrics from the metric namespaces
     * that you specify here.
     *
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includefilters)
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here. 
     */
    override fun includeFilters(vararg includeFilters: Any): Unit =
        includeFilters(includeFilters.toList())

    /**
     * If you are creating a metric stream in a monitoring account, specify `true` to include
     * metrics from source accounts that are linked to this monitoring account, in the metric stream.
     *
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includelinkedaccountsmetrics)
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream. 
     */
    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
    }

    /**
     * If you are creating a metric stream in a monitoring account, specify `true` to include
     * metrics from source accounts that are linked to this monitoring account, in the metric stream.
     *
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includelinkedaccountsmetrics)
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream. 
     */
    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics.let(IResolvable.Companion::unwrap))
    }

    /**
     * If you are creating a new metric stream, this is the name for the new stream.
     *
     * The name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-name)
     * @param name If you are creating a new metric stream, this is the name for the new stream. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The output format for the stream.
     *
     * Valid values are `json` , `opentelemetry1.0` and `opentelemetry0.7` For more information
     * about metric stream output formats, see [Metric streams output
     * formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
     * .
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-outputformat)
     * @param outputFormat The output format for the stream. 
     */
    override fun outputFormat(outputFormat: String) {
      cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
     * resources.
     *
     * This IAM role must already exist and must be in the same account as the metric stream. This
     * IAM role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-rolearn)
     * @param roleArn The ARN of an IAM role that this metric stream will use to access Amazon
     * Kinesis Firehose resources. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    override fun statisticsConfigurations(statisticsConfigurations: IResolvable) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    override fun statisticsConfigurations(statisticsConfigurations: List<Any>) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for
     * each metric that is streamed.
     *
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-statisticsconfigurations)
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed. 
     */
    override fun statisticsConfigurations(vararg statisticsConfigurations: Any): Unit =
        statisticsConfigurations(statisticsConfigurations.toList())

    /**
     * An array of key-value pairs to apply to the metric stream.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
     * @param tags An array of key-value pairs to apply to the metric stream. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the metric stream.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
     * @param tags An array of key-value pairs to apply to the metric stream. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnMetricStream =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMetricStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMetricStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream):
        CfnMetricStream = CfnMetricStream(cdkObject)

    internal fun unwrap(wrapped: CfnMetricStream):
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream
  }

  /**
   * This structure contains a metric namespace and optionally, a list of metric names, to either
   * include in a metric ' stream or exclude from a metric stream.
   *
   * A metric stream's filters can include up to 1000 total names. This limit applies to the sum of
   * namespace names and metric names in the filters. For example, this could include 10 metric
   * namespace filters with 99 metrics each, or 20 namespace filters with 49 metrics specified in each
   * filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
   * MetricStreamFilterProperty metricStreamFilterProperty = MetricStreamFilterProperty.builder()
   * .namespace("namespace")
   * // the properties below are optional
   * .metricNames(List.of("metricNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html)
   */
  public interface MetricStreamFilterProperty {
    /**
     * The names of the metrics to either include or exclude from the metric stream.
     *
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending
     * on whether this filter is specified as an exclude filter or an include filter.
     *
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
     * Each metric name must contain at least one non-whitespace character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html#cfn-cloudwatch-metricstream-metricstreamfilter-metricnames)
     */
    public fun metricNames(): List<String> = unwrap(this).getMetricNames() ?: emptyList()

    /**
     * The name of the metric namespace in the filter.
     *
     * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It
     * must contain at least one non-whitespace character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html#cfn-cloudwatch-metricstream-metricstreamfilter-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [MetricStreamFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricNames The names of the metrics to either include or exclude from the metric
       * stream.
       * If you omit this parameter, all metrics in the namespace are included or excluded,
       * depending on whether this filter is specified as an exclude filter or an include filter.
       *
       * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
       * Each metric name must contain at least one non-whitespace character.
       */
      public fun metricNames(metricNames: List<String>)

      /**
       * @param metricNames The names of the metrics to either include or exclude from the metric
       * stream.
       * If you omit this parameter, all metrics in the namespace are included or excluded,
       * depending on whether this filter is specified as an exclude filter or an include filter.
       *
       * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
       * Each metric name must contain at least one non-whitespace character.
       */
      public fun metricNames(vararg metricNames: String)

      /**
       * @param namespace The name of the metric namespace in the filter. 
       * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It
       * must contain at least one non-whitespace character.
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.builder()

      /**
       * @param metricNames The names of the metrics to either include or exclude from the metric
       * stream.
       * If you omit this parameter, all metrics in the namespace are included or excluded,
       * depending on whether this filter is specified as an exclude filter or an include filter.
       *
       * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
       * Each metric name must contain at least one non-whitespace character.
       */
      override fun metricNames(metricNames: List<String>) {
        cdkBuilder.metricNames(metricNames)
      }

      /**
       * @param metricNames The names of the metrics to either include or exclude from the metric
       * stream.
       * If you omit this parameter, all metrics in the namespace are included or excluded,
       * depending on whether this filter is specified as an exclude filter or an include filter.
       *
       * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
       * Each metric name must contain at least one non-whitespace character.
       */
      override fun metricNames(vararg metricNames: String): Unit = metricNames(metricNames.toList())

      /**
       * @param namespace The name of the metric namespace in the filter. 
       * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It
       * must contain at least one non-whitespace character.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty,
    ) : CdkObject(cdkObject),
        MetricStreamFilterProperty {
      /**
       * The names of the metrics to either include or exclude from the metric stream.
       *
       * If you omit this parameter, all metrics in the namespace are included or excluded,
       * depending on whether this filter is specified as an exclude filter or an include filter.
       *
       * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126).
       * Each metric name must contain at least one non-whitespace character.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html#cfn-cloudwatch-metricstream-metricstreamfilter-metricnames)
       */
      override fun metricNames(): List<String> = unwrap(this).getMetricNames() ?: emptyList()

      /**
       * The name of the metric namespace in the filter.
       *
       * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It
       * must contain at least one non-whitespace character.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html#cfn-cloudwatch-metricstream-metricstreamfilter-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStreamFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty):
          MetricStreamFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetricStreamFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamFilterProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty
    }
  }

  /**
   * This structure specifies a list of additional statistics to stream, and the metrics to stream
   * those additional statistics for.
   *
   * All metrics that match the combination of metric name and namespace will be streamed with the
   * additional statistics, no matter their dimensions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
   * MetricStreamStatisticsConfigurationProperty metricStreamStatisticsConfigurationProperty =
   * MetricStreamStatisticsConfigurationProperty.builder()
   * .additionalStatistics(List.of("additionalStatistics"))
   * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
   * .metricName("metricName")
   * .namespace("namespace")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html)
   */
  public interface MetricStreamStatisticsConfigurationProperty {
    /**
     * The additional statistics to stream for the metrics listed in `IncludeMetrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html#cfn-cloudwatch-metricstream-metricstreamstatisticsconfiguration-additionalstatistics)
     */
    public fun additionalStatistics(): List<String>

    /**
     * An array that defines the metrics that are to have additional statistics streamed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html#cfn-cloudwatch-metricstream-metricstreamstatisticsconfiguration-includemetrics)
     */
    public fun includeMetrics(): Any

    /**
     * A builder for [MetricStreamStatisticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalStatistics The additional statistics to stream for the metrics listed in
       * `IncludeMetrics` . 
       */
      public fun additionalStatistics(additionalStatistics: List<String>)

      /**
       * @param additionalStatistics The additional statistics to stream for the metrics listed in
       * `IncludeMetrics` . 
       */
      public fun additionalStatistics(vararg additionalStatistics: String)

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      public fun includeMetrics(includeMetrics: IResolvable)

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      public fun includeMetrics(includeMetrics: List<Any>)

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      public fun includeMetrics(vararg includeMetrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder()

      /**
       * @param additionalStatistics The additional statistics to stream for the metrics listed in
       * `IncludeMetrics` . 
       */
      override fun additionalStatistics(additionalStatistics: List<String>) {
        cdkBuilder.additionalStatistics(additionalStatistics)
      }

      /**
       * @param additionalStatistics The additional statistics to stream for the metrics listed in
       * `IncludeMetrics` . 
       */
      override fun additionalStatistics(vararg additionalStatistics: String): Unit =
          additionalStatistics(additionalStatistics.toList())

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      override fun includeMetrics(includeMetrics: IResolvable) {
        cdkBuilder.includeMetrics(includeMetrics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      override fun includeMetrics(includeMetrics: List<Any>) {
        cdkBuilder.includeMetrics(includeMetrics.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param includeMetrics An array that defines the metrics that are to have additional
       * statistics streamed. 
       */
      override fun includeMetrics(vararg includeMetrics: Any): Unit =
          includeMetrics(includeMetrics.toList())

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty,
    ) : CdkObject(cdkObject),
        MetricStreamStatisticsConfigurationProperty {
      /**
       * The additional statistics to stream for the metrics listed in `IncludeMetrics` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html#cfn-cloudwatch-metricstream-metricstreamstatisticsconfiguration-additionalstatistics)
       */
      override fun additionalStatistics(): List<String> = unwrap(this).getAdditionalStatistics()

      /**
       * An array that defines the metrics that are to have additional statistics streamed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html#cfn-cloudwatch-metricstream-metricstreamstatisticsconfiguration-includemetrics)
       */
      override fun includeMetrics(): Any = unwrap(this).getIncludeMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetricStreamStatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty):
          MetricStreamStatisticsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetricStreamStatisticsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamStatisticsConfigurationProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty
    }
  }

  /**
   * A structure that specifies the metric name and namespace for one metric that is going to have
   * additional statistics included in the stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
   * MetricStreamStatisticsMetricProperty metricStreamStatisticsMetricProperty =
   * MetricStreamStatisticsMetricProperty.builder()
   * .metricName("metricName")
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html)
   */
  public interface MetricStreamStatisticsMetricProperty {
    /**
     * The name of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html#cfn-cloudwatch-metricstream-metricstreamstatisticsmetric-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html#cfn-cloudwatch-metricstream-metricstreamstatisticsmetric-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [MetricStreamStatisticsMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricName The name of the metric. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric. 
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty.builder()

      /**
       * @param metricName The name of the metric. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty,
    ) : CdkObject(cdkObject),
        MetricStreamStatisticsMetricProperty {
      /**
       * The name of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html#cfn-cloudwatch-metricstream-metricstreamstatisticsmetric-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html#cfn-cloudwatch-metricstream-metricstreamstatisticsmetric-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetricStreamStatisticsMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty):
          MetricStreamStatisticsMetricProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetricStreamStatisticsMetricProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamStatisticsMetricProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty
    }
  }
}
