@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceRdsHttpEndpointConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.RdsHttpEndpointConfigProperty.Builder =
      CfnDataSource.RdsHttpEndpointConfigProperty.builder()

  /**
   * @param awsRegion AWS Region for RDS HTTP endpoint. 
   */
  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  /**
   * @param awsSecretStoreArn The ARN for database credentials stored in AWS Secrets Manager . 
   */
  public fun awsSecretStoreArn(awsSecretStoreArn: String) {
    cdkBuilder.awsSecretStoreArn(awsSecretStoreArn)
  }

  /**
   * @param databaseName Logical database name.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param dbClusterIdentifier Amazon RDS cluster Amazon Resource Name (ARN). 
   */
  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  /**
   * @param schema Logical schema name.
   */
  public fun schema(schema: String) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnDataSource.RdsHttpEndpointConfigProperty = cdkBuilder.build()
}
