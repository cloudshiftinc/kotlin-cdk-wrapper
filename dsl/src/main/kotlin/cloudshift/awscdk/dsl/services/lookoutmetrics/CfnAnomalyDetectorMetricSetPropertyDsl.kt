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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about a dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * MetricSetProperty metricSetProperty = MetricSetProperty.builder()
 * .metricList(List.of(MetricProperty.builder()
 * .aggregationFunction("aggregationFunction")
 * .metricName("metricName")
 * // the properties below are optional
 * .namespace("namespace")
 * .build()))
 * .metricSetName("metricSetName")
 * .metricSource(MetricSourceProperty.builder()
 * .appFlowConfig(AppFlowConfigProperty.builder()
 * .flowName("flowName")
 * .roleArn("roleArn")
 * .build())
 * .cloudwatchConfig(CloudwatchConfigProperty.builder()
 * .roleArn("roleArn")
 * .build())
 * .rdsSourceConfig(RDSSourceConfigProperty.builder()
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .roleArn("roleArn")
 * .secretManagerArn("secretManagerArn")
 * .tableName("tableName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .build())
 * .redshiftSourceConfig(RedshiftSourceConfigProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .roleArn("roleArn")
 * .secretManagerArn("secretManagerArn")
 * .tableName("tableName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .build())
 * .s3SourceConfig(S3SourceConfigProperty.builder()
 * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
 * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
 * .charset("charset")
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .fileCompression("fileCompression")
 * .headerList(List.of("headerList"))
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
 * .charset("charset")
 * .fileCompression("fileCompression")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .historicalDataPathList(List.of("historicalDataPathList"))
 * .templatedPathList(List.of("templatedPathList"))
 * .build())
 * .build())
 * // the properties below are optional
 * .dimensionList(List.of("dimensionList"))
 * .metricSetDescription("metricSetDescription")
 * .metricSetFrequency("metricSetFrequency")
 * .offset(123)
 * .timestampColumn(TimestampColumnProperty.builder()
 * .columnFormat("columnFormat")
 * .columnName("columnName")
 * .build())
 * .timezone("timezone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorMetricSetPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricSetProperty.Builder =
        CfnAnomalyDetector.MetricSetProperty.builder()

    private val _dimensionList: MutableList<String> = mutableListOf()

    private val _metricList: MutableList<Any> = mutableListOf()

    /** @param dimensionList A list of the fields you want to treat as dimensions. */
    public fun dimensionList(vararg dimensionList: String) {
        _dimensionList.addAll(listOf(*dimensionList))
    }

    /** @param dimensionList A list of the fields you want to treat as dimensions. */
    public fun dimensionList(dimensionList: Collection<String>) {
        _dimensionList.addAll(dimensionList)
    }

    /** @param metricList A list of metrics that the dataset will contain. */
    public fun metricList(vararg metricList: Any) {
        _metricList.addAll(listOf(*metricList))
    }

    /** @param metricList A list of metrics that the dataset will contain. */
    public fun metricList(metricList: Collection<Any>) {
        _metricList.addAll(metricList)
    }

    /** @param metricList A list of metrics that the dataset will contain. */
    public fun metricList(metricList: IResolvable) {
        cdkBuilder.metricList(metricList)
    }

    /** @param metricSetDescription A description of the dataset you are creating. */
    public fun metricSetDescription(metricSetDescription: String) {
        cdkBuilder.metricSetDescription(metricSetDescription)
    }

    /**
     * @param metricSetFrequency The frequency with which the source data will be analyzed for
     *   anomalies.
     */
    public fun metricSetFrequency(metricSetFrequency: String) {
        cdkBuilder.metricSetFrequency(metricSetFrequency)
    }

    /** @param metricSetName The name of the dataset. */
    public fun metricSetName(metricSetName: String) {
        cdkBuilder.metricSetName(metricSetName)
    }

    /** @param metricSource Contains information about how the source data should be interpreted. */
    public fun metricSource(metricSource: IResolvable) {
        cdkBuilder.metricSource(metricSource)
    }

    /** @param metricSource Contains information about how the source data should be interpreted. */
    public fun metricSource(metricSource: CfnAnomalyDetector.MetricSourceProperty) {
        cdkBuilder.metricSource(metricSource)
    }

    /**
     * @param offset After an interval ends, the amount of seconds that the detector waits before
     *   importing data. Offset is only supported for S3, Redshift, Athena and datasources.
     */
    public fun offset(offset: Number) {
        cdkBuilder.offset(offset)
    }

    /**
     * @param timestampColumn Contains information about the column used for tracking time in your
     *   source data.
     */
    public fun timestampColumn(timestampColumn: IResolvable) {
        cdkBuilder.timestampColumn(timestampColumn)
    }

    /**
     * @param timestampColumn Contains information about the column used for tracking time in your
     *   source data.
     */
    public fun timestampColumn(timestampColumn: CfnAnomalyDetector.TimestampColumnProperty) {
        cdkBuilder.timestampColumn(timestampColumn)
    }

    /** @param timezone The time zone in which your source data was recorded. */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun build(): CfnAnomalyDetector.MetricSetProperty {
        if (_dimensionList.isNotEmpty()) cdkBuilder.dimensionList(_dimensionList)
        if (_metricList.isNotEmpty()) cdkBuilder.metricList(_metricList)
        return cdkBuilder.build()
    }
}
