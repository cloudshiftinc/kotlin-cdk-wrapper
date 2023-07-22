@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

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
@CdkDslMarker
public class CfnAnomalyDetectorRDSSourceConfigPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.RDSSourceConfigProperty.Builder =
      CfnAnomalyDetector.RDSSourceConfigProperty.builder()

  /**
   * @param databaseHost The host name of the database. 
   */
  public fun databaseHost(databaseHost: String) {
    cdkBuilder.databaseHost(databaseHost)
  }

  /**
   * @param databaseName The name of the RDS database. 
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
   * @param dbInstanceIdentifier A string identifying the database instance. 
   */
  public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
    cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role. 
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
   * @param tableName The name of the table in the database. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param vpcConfiguration An object containing information about the Amazon Virtual Private Cloud
   * (VPC) configuration. 
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration An object containing information about the Amazon Virtual Private Cloud
   * (VPC) configuration. 
   */
  public fun vpcConfiguration(vpcConfiguration: CfnAnomalyDetector.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAnomalyDetector.RDSSourceConfigProperty = cdkBuilder.build()
}
