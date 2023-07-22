@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder =
      CfnAnomalyDetector.RedshiftSourceConfigProperty.builder()

  /**
   * @param clusterIdentifier A string identifying the Redshift cluster. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * @param databaseHost The name of the database host. 
   */
  public fun databaseHost(databaseHost: String) {
    cdkBuilder.databaseHost(databaseHost)
  }

  /**
   * @param databaseName The Redshift database name. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param databasePort The port number where the database can be accessed. 
   */
  public fun databasePort(databasePort: Number) {
    cdkBuilder.databasePort(databasePort)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role providing access to the database. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. 
   */
  public fun secretManagerArn(secretManagerArn: String) {
    cdkBuilder.secretManagerArn(secretManagerArn)
  }

  /**
   * @param tableName The table name of the Redshift database. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
   * configuration. 
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
   * configuration. 
   */
  public fun vpcConfiguration(vpcConfiguration: CfnAnomalyDetector.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAnomalyDetector.RedshiftSourceConfigProperty = cdkBuilder.build()
}
