@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMetricStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * CfnMetricStreamProps cfnMetricStreamProps = CfnMetricStreamProps.builder()
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
public interface CfnMetricStreamProps {
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
   */
  public fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

  /**
   * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
   *
   * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same account
   * as the metric stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-firehosearn)
   */
  public fun firehoseArn(): String

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
   */
  public fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

  /**
   * If you are creating a metric stream in a monitoring account, specify `true` to include metrics
   * from source accounts that are linked to this monitoring account, in the metric stream.
   *
   * The default is `false` .
   *
   * For more information about linking accounts, see [CloudWatch cross-account
   * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-includelinkedaccountsmetrics)
   */
  public fun includeLinkedAccountsMetrics(): Any? = unwrap(this).getIncludeLinkedAccountsMetrics()

  /**
   * If you are creating a new metric stream, this is the name for the new stream.
   *
   * The name must be different than the names of other metric streams in this account and Region.
   *
   * If you are updating a metric stream, specify the name of that stream here.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The output format for the stream.
   *
   * Valid values are `json` , `opentelemetry1.0` and `opentelemetry0.7` For more information about
   * metric stream output formats, see [Metric streams output
   * formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
   * .
   *
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-outputformat)
   */
  public fun outputFormat(): String

  /**
   * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
   * resources.
   *
   * This IAM role must already exist and must be in the same account as the metric stream. This IAM
   * role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-rolearn)
   */
  public fun roleArn(): String

  /**
   * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each
   * metric that is streamed.
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
   */
  public fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

  /**
   * An array of key-value pairs to apply to the metric stream.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMetricStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(excludeFilters: IResolvable)

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(excludeFilters: List<Any>)

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(vararg excludeFilters: Any)

    /**
     * @param firehoseArn The ARN of the Amazon Kinesis Firehose delivery stream to use for this
     * metric stream. 
     * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same
     * account as the metric stream.
     */
    public fun firehoseArn(firehoseArn: String)

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(includeFilters: IResolvable)

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(includeFilters: List<Any>)

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(vararg includeFilters: Any)

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream.
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean)

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream.
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable)

    /**
     * @param name If you are creating a new metric stream, this is the name for the new stream.
     * The name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     */
    public fun name(name: String)

    /**
     * @param outputFormat The output format for the stream. 
     * Valid values are `json` , `opentelemetry1.0` and `opentelemetry0.7` For more information
     * about metric stream output formats, see [Metric streams output
     * formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
     * .
     */
    public fun outputFormat(outputFormat: String)

    /**
     * @param roleArn The ARN of an IAM role that this metric stream will use to access Amazon
     * Kinesis Firehose resources. 
     * This IAM role must already exist and must be in the same account as the metric stream. This
     * IAM role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    public fun statisticsConfigurations(statisticsConfigurations: IResolvable)

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    public fun statisticsConfigurations(statisticsConfigurations: List<Any>)

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    public fun statisticsConfigurations(vararg statisticsConfigurations: Any)

    /**
     * @param tags An array of key-value pairs to apply to the metric stream.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the metric stream.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps.Builder
        = software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps.builder()

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun excludeFilters(excludeFilters: IResolvable) {
      cdkBuilder.excludeFilters(excludeFilters.let(IResolvable::unwrap))
    }

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun excludeFilters(excludeFilters: List<Any>) {
      cdkBuilder.excludeFilters(excludeFilters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     * namespaces except for the namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun excludeFilters(vararg excludeFilters: Any): Unit =
        excludeFilters(excludeFilters.toList())

    /**
     * @param firehoseArn The ARN of the Amazon Kinesis Firehose delivery stream to use for this
     * metric stream. 
     * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same
     * account as the metric stream.
     */
    override fun firehoseArn(firehoseArn: String) {
      cdkBuilder.firehoseArn(firehoseArn)
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun includeFilters(includeFilters: IResolvable) {
      cdkBuilder.includeFilters(includeFilters.let(IResolvable::unwrap))
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun includeFilters(includeFilters: List<Any>) {
      cdkBuilder.includeFilters(includeFilters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     * the metric namespaces that you specify here.
     * You cannot specify both `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    override fun includeFilters(vararg includeFilters: Any): Unit =
        includeFilters(includeFilters.toList())

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream.
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
    }

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     * account, specify `true` to include metrics from source accounts that are linked to this
     * monitoring account, in the metric stream.
     * The default is `false` .
     *
     * For more information about linking accounts, see [CloudWatch cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics.let(IResolvable::unwrap))
    }

    /**
     * @param name If you are creating a new metric stream, this is the name for the new stream.
     * The name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputFormat The output format for the stream. 
     * Valid values are `json` , `opentelemetry1.0` and `opentelemetry0.7` For more information
     * about metric stream output formats, see [Metric streams output
     * formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
     * .
     */
    override fun outputFormat(outputFormat: String) {
      cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * @param roleArn The ARN of an IAM role that this metric stream will use to access Amazon
     * Kinesis Firehose resources. 
     * This IAM role must already exist and must be in the same account as the metric stream. This
     * IAM role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    override fun statisticsConfigurations(statisticsConfigurations: IResolvable) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    override fun statisticsConfigurations(statisticsConfigurations: List<Any>) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     * and SAMPLECOUNT statistics for each metric that is streamed.
     * You can use this parameter to have the metric stream also send additional statistics in the
     * stream. This array can have up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend on
     * the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any additional
     * statistic that is supported by CloudWatch , listed in [CloudWatch statistics
     * definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html)
     * . If the `OutputFormat` is OpenTelemetry, you can stream percentile statistics.
     */
    override fun statisticsConfigurations(vararg statisticsConfigurations: Any): Unit =
        statisticsConfigurations(statisticsConfigurations.toList())

    /**
     * @param tags An array of key-value pairs to apply to the metric stream.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the metric stream.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps,
  ) : CdkObject(cdkObject), CfnMetricStreamProps {
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
     */
    override fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

    /**
     * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     *
     * This Amazon Kinesis Firehose delivery stream must already exist and must be in the same
     * account as the metric stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-firehosearn)
     */
    override fun firehoseArn(): String = unwrap(this).getFirehoseArn()

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
     */
    override fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

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
     */
    override fun includeLinkedAccountsMetrics(): Any? =
        unwrap(this).getIncludeLinkedAccountsMetrics()

    /**
     * If you are creating a new metric stream, this is the name for the new stream.
     *
     * The name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun outputFormat(): String = unwrap(this).getOutputFormat()

    /**
     * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose
     * resources.
     *
     * This IAM role must already exist and must be in the same account as the metric stream. This
     * IAM role must include the `firehose:PutRecord` and `firehose:PutRecordBatch` permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

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
     */
    override fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

    /**
     * An array of key-value pairs to apply to the metric stream.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html#cfn-cloudwatch-metricstream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMetricStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps):
        CfnMetricStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMetricStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMetricStreamProps):
        software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
  }
}
