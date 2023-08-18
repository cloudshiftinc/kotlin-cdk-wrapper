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

package io.cloudshiftdev.awscdkdsl.services.lookoutmetrics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.constructs.Construct

/**
 * The `AWS::LookoutMetrics::AnomalyDetector` type creates an anomaly detector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * CfnAnomalyDetector cfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this,
 * "MyCfnAnomalyDetector")
 * .anomalyDetectorConfig(AnomalyDetectorConfigProperty.builder()
 * .anomalyDetectorFrequency("anomalyDetectorFrequency")
 * .build())
 * .metricSetList(List.of(MetricSetProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .anomalyDetectorDescription("anomalyDetectorDescription")
 * .anomalyDetectorName("anomalyDetectorName")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnomalyDetector.Builder =
        CfnAnomalyDetector.Builder.create(scope, id)

    private val _metricSetList: MutableList<Any> = mutableListOf()

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     *
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     *   detector.
     */
    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
        cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
    }

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     *
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     *   detector.
     */
    public fun anomalyDetectorConfig(
        anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty
    ) {
        cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
    }

    /**
     * A description of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
     *
     * @param anomalyDetectorDescription A description of the detector.
     */
    public fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
        cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    /**
     * The name of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
     *
     * @param anomalyDetectorName The name of the detector.
     */
    public fun anomalyDetectorName(anomalyDetectorName: String) {
        cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    /**
     * The ARN of the KMS key to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
     *
     * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     *
     * @param metricSetList The detector's dataset.
     */
    public fun metricSetList(vararg metricSetList: Any) {
        _metricSetList.addAll(listOf(*metricSetList))
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     *
     * @param metricSetList The detector's dataset.
     */
    public fun metricSetList(metricSetList: Collection<Any>) {
        _metricSetList.addAll(metricSetList)
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     *
     * @param metricSetList The detector's dataset.
     */
    public fun metricSetList(metricSetList: IResolvable) {
        cdkBuilder.metricSetList(metricSetList)
    }

    public fun build(): CfnAnomalyDetector {
        if (_metricSetList.isNotEmpty()) cdkBuilder.metricSetList(_metricSetList)
        return cdkBuilder.build()
    }
}
