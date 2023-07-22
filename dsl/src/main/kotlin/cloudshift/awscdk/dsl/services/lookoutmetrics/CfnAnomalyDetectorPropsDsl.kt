@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps

/**
 * Properties for defining a `CfnAnomalyDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * CfnAnomalyDetectorProps cfnAnomalyDetectorProps = CfnAnomalyDetectorProps.builder()
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
public class CfnAnomalyDetectorPropsDsl {
  private val cdkBuilder: CfnAnomalyDetectorProps.Builder = CfnAnomalyDetectorProps.builder()

  private val _metricSetList: MutableList<Any> = mutableListOf()

  /**
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public
      fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * @param anomalyDetectorDescription A description of the detector.
   */
  public fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
    cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
  }

  /**
   * @param anomalyDetectorName The name of the detector.
   */
  public fun anomalyDetectorName(anomalyDetectorName: String) {
    cdkBuilder.anomalyDetectorName(anomalyDetectorName)
  }

  /**
   * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(vararg metricSetList: Any) {
    _metricSetList.addAll(listOf(*metricSetList))
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: Collection<Any>) {
    _metricSetList.addAll(metricSetList)
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: IResolvable) {
    cdkBuilder.metricSetList(metricSetList)
  }

  public fun build(): CfnAnomalyDetectorProps {
    if(_metricSetList.isNotEmpty()) cdkBuilder.metricSetList(_metricSetList)
    return cdkBuilder.build()
  }
}
