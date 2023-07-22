@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricSourcePropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricSourceProperty.Builder =
      CfnAnomalyDetector.MetricSourceProperty.builder()

  /**
   * @param appFlowConfig Details about an AppFlow datasource.
   */
  public fun appFlowConfig(appFlowConfig: IResolvable) {
    cdkBuilder.appFlowConfig(appFlowConfig)
  }

  /**
   * @param appFlowConfig Details about an AppFlow datasource.
   */
  public fun appFlowConfig(appFlowConfig: CfnAnomalyDetector.AppFlowConfigProperty) {
    cdkBuilder.appFlowConfig(appFlowConfig)
  }

  /**
   * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
   */
  public fun cloudwatchConfig(cloudwatchConfig: IResolvable) {
    cdkBuilder.cloudwatchConfig(cloudwatchConfig)
  }

  /**
   * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
   */
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

  /**
   * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
   */
  public fun redshiftSourceConfig(redshiftSourceConfig: IResolvable) {
    cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
  }

  /**
   * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
   */
  public
      fun redshiftSourceConfig(redshiftSourceConfig: CfnAnomalyDetector.RedshiftSourceConfigProperty) {
    cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
  }

  /**
   * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
   * contains source files.
   */
  public fun s3SourceConfig(s3SourceConfig: IResolvable) {
    cdkBuilder.s3SourceConfig(s3SourceConfig)
  }

  /**
   * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
   * contains source files.
   */
  public fun s3SourceConfig(s3SourceConfig: CfnAnomalyDetector.S3SourceConfigProperty) {
    cdkBuilder.s3SourceConfig(s3SourceConfig)
  }

  public fun build(): CfnAnomalyDetector.MetricSourceProperty = cdkBuilder.build()
}
