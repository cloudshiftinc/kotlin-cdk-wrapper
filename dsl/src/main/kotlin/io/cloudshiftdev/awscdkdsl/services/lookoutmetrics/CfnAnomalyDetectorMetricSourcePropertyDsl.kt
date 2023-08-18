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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about how the source data should be interpreted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * MetricSourceProperty metricSourceProperty = MetricSourceProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorMetricSourcePropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricSourceProperty.Builder =
        CfnAnomalyDetector.MetricSourceProperty.builder()

    /** @param appFlowConfig Details about an AppFlow datasource. */
    public fun appFlowConfig(appFlowConfig: IResolvable) {
        cdkBuilder.appFlowConfig(appFlowConfig)
    }

    /** @param appFlowConfig Details about an AppFlow datasource. */
    public fun appFlowConfig(appFlowConfig: CfnAnomalyDetector.AppFlowConfigProperty) {
        cdkBuilder.appFlowConfig(appFlowConfig)
    }

    /** @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource. */
    public fun cloudwatchConfig(cloudwatchConfig: IResolvable) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig)
    }

    /** @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource. */
    public fun cloudwatchConfig(cloudwatchConfig: CfnAnomalyDetector.CloudwatchConfigProperty) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig)
    }

    /**
     * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS) datasource.
     */
    public fun rdsSourceConfig(rdsSourceConfig: IResolvable) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig)
    }

    /**
     * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS) datasource.
     */
    public fun rdsSourceConfig(rdsSourceConfig: CfnAnomalyDetector.RDSSourceConfigProperty) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig)
    }

    /** @param redshiftSourceConfig Details about an Amazon Redshift database datasource. */
    public fun redshiftSourceConfig(redshiftSourceConfig: IResolvable) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
    }

    /** @param redshiftSourceConfig Details about an Amazon Redshift database datasource. */
    public fun redshiftSourceConfig(
        redshiftSourceConfig: CfnAnomalyDetector.RedshiftSourceConfigProperty
    ) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
    }

    /**
     * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
     *   contains source files.
     */
    public fun s3SourceConfig(s3SourceConfig: IResolvable) {
        cdkBuilder.s3SourceConfig(s3SourceConfig)
    }

    /**
     * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
     *   contains source files.
     */
    public fun s3SourceConfig(s3SourceConfig: CfnAnomalyDetector.S3SourceConfigProperty) {
        cdkBuilder.s3SourceConfig(s3SourceConfig)
    }

    public fun build(): CfnAnomalyDetector.MetricSourceProperty = cdkBuilder.build()
}
