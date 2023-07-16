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

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun databaseHost(databaseHost: String) {
    cdkBuilder.databaseHost(databaseHost)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun databasePort(databasePort: Number) {
    cdkBuilder.databasePort(databasePort)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun secretManagerArn(secretManagerArn: String) {
    cdkBuilder.secretManagerArn(secretManagerArn)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: CfnAnomalyDetector.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAnomalyDetector.RedshiftSourceConfigProperty = cdkBuilder.build()
}
