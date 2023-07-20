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
  public inline fun cfnAlert(
    scope: Construct,
    id: String,
    block: CfnAlertDsl.() -> Unit = {},
  ): CfnAlert {
    val builder = CfnAlertDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlertActionProperty(block: CfnAlertActionPropertyDsl.() -> Unit = {}):
      CfnAlert.ActionProperty {
    val builder = CfnAlertActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlertLambdaConfigurationProperty(block: CfnAlertLambdaConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlert.LambdaConfigurationProperty {
    val builder = CfnAlertLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlertProps(block: CfnAlertPropsDsl.() -> Unit = {}): CfnAlertProps {
    val builder = CfnAlertPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlertSNSConfigurationProperty(block: CfnAlertSNSConfigurationPropertyDsl.() -> Unit =
      {}): CfnAlert.SNSConfigurationProperty {
    val builder = CfnAlertSNSConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnomalyDetector(
    scope: Construct,
    id: String,
    block: CfnAnomalyDetectorDsl.() -> Unit = {},
  ): CfnAnomalyDetector {
    val builder = CfnAnomalyDetectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorAnomalyDetectorConfigProperty(block: CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.AnomalyDetectorConfigProperty {
    val builder = CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorAppFlowConfigProperty(block: CfnAnomalyDetectorAppFlowConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.AppFlowConfigProperty {
    val builder = CfnAnomalyDetectorAppFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorCloudwatchConfigProperty(block: CfnAnomalyDetectorCloudwatchConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.CloudwatchConfigProperty {
    val builder = CfnAnomalyDetectorCloudwatchConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorCsvFormatDescriptorProperty(block: CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.CsvFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorFileFormatDescriptorProperty(block: CfnAnomalyDetectorFileFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.FileFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorFileFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorJsonFormatDescriptorProperty(block: CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.JsonFormatDescriptorProperty {
    val builder = CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricProperty(block: CfnAnomalyDetectorMetricPropertyDsl.() -> Unit =
      {}): CfnAnomalyDetector.MetricProperty {
    val builder = CfnAnomalyDetectorMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricSetProperty(block: CfnAnomalyDetectorMetricSetPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricSetProperty {
    val builder = CfnAnomalyDetectorMetricSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricSourceProperty(block: CfnAnomalyDetectorMetricSourcePropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricSourceProperty {
    val builder = CfnAnomalyDetectorMetricSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnomalyDetectorProps(block: CfnAnomalyDetectorPropsDsl.() -> Unit = {}):
      CfnAnomalyDetectorProps {
    val builder = CfnAnomalyDetectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorRDSSourceConfigProperty(block: CfnAnomalyDetectorRDSSourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.RDSSourceConfigProperty {
    val builder = CfnAnomalyDetectorRDSSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorRedshiftSourceConfigProperty(block: CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.RedshiftSourceConfigProperty {
    val builder = CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorS3SourceConfigProperty(block: CfnAnomalyDetectorS3SourceConfigPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.S3SourceConfigProperty {
    val builder = CfnAnomalyDetectorS3SourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorTimestampColumnProperty(block: CfnAnomalyDetectorTimestampColumnPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.TimestampColumnProperty {
    val builder = CfnAnomalyDetectorTimestampColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorVpcConfigurationProperty(block: CfnAnomalyDetectorVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.VpcConfigurationProperty {
    val builder = CfnAnomalyDetectorVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
