@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps

/**
 * Properties for defining a `CfnMetricStream`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
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
@CdkDslMarker
public class CfnMetricStreamPropsDsl {
    private val cdkBuilder: CfnMetricStreamProps.Builder = CfnMetricStreamProps.builder()

    private val _excludeFilters: MutableList<Any> = mutableListOf()

    private val _includeFilters: MutableList<Any> = mutableListOf()

    private val _statisticsConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     *   namespaces except for the namespaces that you specify here. You cannot specify both
     *   `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(vararg excludeFilters: Any) {
        _excludeFilters.addAll(listOf(*excludeFilters))
    }

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     *   namespaces except for the namespaces that you specify here. You cannot specify both
     *   `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(excludeFilters: Collection<Any>) {
        _excludeFilters.addAll(excludeFilters)
    }

    /**
     * @param excludeFilters If you specify this parameter, the stream sends metrics from all metric
     *   namespaces except for the namespaces that you specify here. You cannot specify both
     *   `IncludeFilters` and `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun excludeFilters(excludeFilters: IResolvable) {
        cdkBuilder.excludeFilters(excludeFilters)
    }

    /**
     * @param firehoseArn The ARN of the Amazon Kinesis Firehose delivery stream to use for this
     *   metric stream. This Amazon Kinesis Firehose delivery stream must already exist and must be
     *   in the same account as the metric stream.
     */
    public fun firehoseArn(firehoseArn: String) {
        cdkBuilder.firehoseArn(firehoseArn)
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     *   the metric namespaces that you specify here. You cannot specify both `IncludeFilters` and
     *   `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(vararg includeFilters: Any) {
        _includeFilters.addAll(listOf(*includeFilters))
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     *   the metric namespaces that you specify here. You cannot specify both `IncludeFilters` and
     *   `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(includeFilters: Collection<Any>) {
        _includeFilters.addAll(includeFilters)
    }

    /**
     * @param includeFilters If you specify this parameter, the stream sends only the metrics from
     *   the metric namespaces that you specify here. You cannot specify both `IncludeFilters` and
     *   `ExcludeFilters` in the same metric stream.
     *
     * When you modify the `IncludeFilters` or `ExcludeFilters` of an existing metric stream in any
     * way, the metric stream is effectively restarted, so after such a change you will get only the
     * datapoints that have a timestamp after the time of the update.
     */
    public fun includeFilters(includeFilters: IResolvable) {
        cdkBuilder.includeFilters(includeFilters)
    }

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     *   account, specify `true` to include metrics from source accounts that are linked to this
     *   monitoring account, in the metric stream. The default is `false` .
     *
     * For more information about linking accounts, see
     * [CloudWatch cross-account observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean) {
        cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
    }

    /**
     * @param includeLinkedAccountsMetrics If you are creating a metric stream in a monitoring
     *   account, specify `true` to include metrics from source accounts that are linked to this
     *   monitoring account, in the metric stream. The default is `false` .
     *
     * For more information about linking accounts, see
     * [CloudWatch cross-account observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html)
     */
    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable) {
        cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
    }

    /**
     * @param name If you are creating a new metric stream, this is the name for the new stream. The
     *   name must be different than the names of other metric streams in this account and Region.
     *
     * If you are updating a metric stream, specify the name of that stream here.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param outputFormat The output format for the stream. Valid values are `json` and
     *   `opentelemetry0.7` For more information about metric stream output formats, see
     *   [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html)
     *   .
     */
    public fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * @param roleArn The ARN of an IAM role that this metric stream will use to access Amazon
     *   Kinesis Firehose resources. This IAM role must already exist and must be in the same
     *   account as the metric stream. This IAM role must include the `firehose:PutRecord` and
     *   `firehose:PutRecordBatch` permissions.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     *   and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to
     *   have the metric stream also send additional statistics in the stream. This array can have
     *   up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend
     * on the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any
     * additional statistic that is supported by CloudWatch , listed in
     * [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html)
     * . If the `OutputFormat` is `opentelemetry0` .7, you can stream percentile statistics *(p??)*
     * .
     */
    public fun statisticsConfigurations(vararg statisticsConfigurations: Any) {
        _statisticsConfigurations.addAll(listOf(*statisticsConfigurations))
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     *   and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to
     *   have the metric stream also send additional statistics in the stream. This array can have
     *   up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend
     * on the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any
     * additional statistic that is supported by CloudWatch , listed in
     * [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html)
     * . If the `OutputFormat` is `opentelemetry0` .7, you can stream percentile statistics *(p??)*
     * .
     */
    public fun statisticsConfigurations(statisticsConfigurations: Collection<Any>) {
        _statisticsConfigurations.addAll(statisticsConfigurations)
    }

    /**
     * @param statisticsConfigurations By default, a metric stream always sends the MAX, MIN, SUM,
     *   and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to
     *   have the metric stream also send additional statistics in the stream. This array can have
     *   up to 100 members.
     *
     * For each entry in this array, you specify one or more metrics and the list of additional
     * statistics to stream for those metrics. The additional statistics that you can stream depend
     * on the stream's `OutputFormat` . If the `OutputFormat` is `json` , you can stream any
     * additional statistic that is supported by CloudWatch , listed in
     * [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html)
     * . If the `OutputFormat` is `opentelemetry0` .7, you can stream percentile statistics *(p??)*
     * .
     */
    public fun statisticsConfigurations(statisticsConfigurations: IResolvable) {
        cdkBuilder.statisticsConfigurations(statisticsConfigurations)
    }

    /**
     * @param tags An array of key-value pairs to apply to the metric stream. For more information,
     *   see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to the metric stream. For more information,
     *   see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMetricStreamProps {
        if (_excludeFilters.isNotEmpty()) cdkBuilder.excludeFilters(_excludeFilters)
        if (_includeFilters.isNotEmpty()) cdkBuilder.includeFilters(_includeFilters)
        if (_statisticsConfigurations.isNotEmpty())
            cdkBuilder.statisticsConfigurations(_statisticsConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
