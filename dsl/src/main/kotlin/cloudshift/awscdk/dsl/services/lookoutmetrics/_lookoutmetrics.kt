@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
import software.constructs.Construct

public object lookoutmetrics {
  /**
   * The `AWS::LookoutMetrics::Alert` type creates an alert for an anomaly detector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * CfnAlert cfnAlert = CfnAlert.Builder.create(this, "MyCfnAlert")
   * .action(ActionProperty.builder()
   * .lambdaConfiguration(LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build())
   * .snsConfiguration(SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build())
   * .build())
   * .alertSensitivityThreshold(123)
   * .anomalyDetectorArn("anomalyDetectorArn")
   * // the properties below are optional
   * .alertDescription("alertDescription")
   * .alertName("alertName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html)
   */
  public inline fun cfnAlert(
    scope: Construct,
    id: String,
    block: CfnAlertDsl.() -> Unit = {},
  ): CfnAlert {
    val builder = CfnAlertDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration that specifies the action to perform when anomalies are detected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .lambdaConfiguration(LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build())
   * .snsConfiguration(SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html)
   */
  public inline fun cfnAlertActionProperty(block: CfnAlertActionPropertyDsl.() -> Unit = {}):
      CfnAlert.ActionProperty {
    val builder = CfnAlertActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a Lambda configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * LambdaConfigurationProperty lambdaConfigurationProperty = LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html)
   */
  public inline
      fun cfnAlertLambdaConfigurationProperty(block: CfnAlertLambdaConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlert.LambdaConfigurationProperty {
    val builder = CfnAlertLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAlert`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * CfnAlertProps cfnAlertProps = CfnAlertProps.builder()
   * .action(ActionProperty.builder()
   * .lambdaConfiguration(LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build())
   * .snsConfiguration(SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build())
   * .build())
   * .alertSensitivityThreshold(123)
   * .anomalyDetectorArn("anomalyDetectorArn")
   * // the properties below are optional
   * .alertDescription("alertDescription")
   * .alertName("alertName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html)
   */
  public inline fun cfnAlertProps(block: CfnAlertPropsDsl.() -> Unit = {}): CfnAlertProps {
    val builder = CfnAlertPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the SNS topic to which you want to send your alerts and the IAM role
   * that has access to that topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * SNSConfigurationProperty sNSConfigurationProperty = SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html)
   */
  public inline
      fun cfnAlertSNSConfigurationProperty(block: CfnAlertSNSConfigurationPropertyDsl.() -> Unit =
      {}): CfnAlert.SNSConfigurationProperty {
    val builder = CfnAlertSNSConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::LookoutMetrics::AnomalyDetector` type creates an anomaly detector.
   *
   * Example:
   *
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
  public inline fun cfnAnomalyDetector(
    scope: Construct,
    id: String,
    block: CfnAnomalyDetectorDsl.() -> Unit = {},
  ): CfnAnomalyDetector {
    val builder = CfnAnomalyDetectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a detector's configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * AnomalyDetectorConfigProperty anomalyDetectorConfigProperty =
   * AnomalyDetectorConfigProperty.builder()
   * .anomalyDetectorFrequency("anomalyDetectorFrequency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-anomalydetectorconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorAnomalyDetectorConfigProperty(block: CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.AnomalyDetectorConfigProperty {
    val builder = CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about an Amazon AppFlow flow datasource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * AppFlowConfigProperty appFlowConfigProperty = AppFlowConfigProperty.builder()
   * .flowName("flowName")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorAppFlowConfigProperty(block: CfnAnomalyDetectorAppFlowConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.AppFlowConfigProperty {
    val builder = CfnAnomalyDetectorAppFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about an Amazon CloudWatch datasource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * CloudwatchConfigProperty cloudwatchConfigProperty = CloudwatchConfigProperty.builder()
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-cloudwatchconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorCloudwatchConfigProperty(block: CfnAnomalyDetectorCloudwatchConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.CloudwatchConfigProperty {
    val builder = CfnAnomalyDetectorCloudwatchConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about how a source CSV data file should be analyzed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * CsvFormatDescriptorProperty csvFormatDescriptorProperty = CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html)
   */
  public inline
      fun cfnAnomalyDetectorCsvFormatDescriptorProperty(block: CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.CsvFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a source file's formatting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * FileFormatDescriptorProperty fileFormatDescriptorProperty =
   * FileFormatDescriptorProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html)
   */
  public inline
      fun cfnAnomalyDetectorFileFormatDescriptorProperty(block: CfnAnomalyDetectorFileFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.FileFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorFileFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about how a source JSON data file should be analyzed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * JsonFormatDescriptorProperty jsonFormatDescriptorProperty =
   * JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html)
   */
  public inline
      fun cfnAnomalyDetectorJsonFormatDescriptorProperty(block: CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.JsonFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A calculation made by contrasting a measure and a dimension from your source data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * MetricProperty metricProperty = MetricProperty.builder()
   * .aggregationFunction("aggregationFunction")
   * .metricName("metricName")
   * // the properties below are optional
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html)
   */
  public inline
      fun cfnAnomalyDetectorMetricProperty(block: CfnAnomalyDetectorMetricPropertyDsl.() -> Unit =
      {}): CfnAnomalyDetector.MetricProperty {
    val builder = CfnAnomalyDetectorMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a dataset.
   *
   * Example:
   *
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
  public inline
      fun cfnAnomalyDetectorMetricSetProperty(block: CfnAnomalyDetectorMetricSetPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricSetProperty {
    val builder = CfnAnomalyDetectorMetricSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about how the source data should be interpreted.
   *
   * Example:
   *
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
  public inline
      fun cfnAnomalyDetectorMetricSourceProperty(block: CfnAnomalyDetectorMetricSourcePropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricSourceProperty {
    val builder = CfnAnomalyDetectorMetricSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

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
  public inline fun cfnAnomalyDetectorProps(block: CfnAnomalyDetectorPropsDsl.() -> Unit = {}):
      CfnAnomalyDetectorProps {
    val builder = CfnAnomalyDetectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the Amazon Relational Database Service (RDS) configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * RDSSourceConfigProperty rDSSourceConfigProperty = RDSSourceConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorRDSSourceConfigProperty(block: CfnAnomalyDetectorRDSSourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.RDSSourceConfigProperty {
    val builder = CfnAnomalyDetectorRDSSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides information about the Amazon Redshift database configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * RedshiftSourceConfigProperty redshiftSourceConfigProperty =
   * RedshiftSourceConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorRedshiftSourceConfigProperty(block: CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.RedshiftSourceConfigProperty {
    val builder = CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the configuration of the S3 bucket that contains source files.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * S3SourceConfigProperty s3SourceConfigProperty = S3SourceConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html)
   */
  public inline
      fun cfnAnomalyDetectorS3SourceConfigProperty(block: CfnAnomalyDetectorS3SourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.S3SourceConfigProperty {
    val builder = CfnAnomalyDetectorS3SourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the column used to track time in a source data file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * TimestampColumnProperty timestampColumnProperty = TimestampColumnProperty.builder()
   * .columnFormat("columnFormat")
   * .columnName("columnName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html)
   */
  public inline
      fun cfnAnomalyDetectorTimestampColumnProperty(block: CfnAnomalyDetectorTimestampColumnPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.TimestampColumnProperty {
    val builder = CfnAnomalyDetectorTimestampColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains configuration information about the Amazon Virtual Private Cloud (VPC).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutmetrics.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html)
   */
  public inline
      fun cfnAnomalyDetectorVpcConfigurationProperty(block: CfnAnomalyDetectorVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.VpcConfigurationProperty {
    val builder = CfnAnomalyDetectorVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
