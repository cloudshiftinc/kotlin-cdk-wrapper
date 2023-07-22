@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDynamoDBConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.DynamoDBConfigProperty.Builder =
      CfnDataSource.DynamoDBConfigProperty.builder()

  /**
   * @param awsRegion The AWS Region. 
   */
  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  /**
   * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
   */
  public fun deltaSyncConfig(deltaSyncConfig: IResolvable) {
    cdkBuilder.deltaSyncConfig(deltaSyncConfig)
  }

  /**
   * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
   */
  public fun deltaSyncConfig(deltaSyncConfig: CfnDataSource.DeltaSyncConfigProperty) {
    cdkBuilder.deltaSyncConfig(deltaSyncConfig)
  }

  /**
   * @param tableName The table name. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with this
   * data source.
   */
  public fun useCallerCredentials(useCallerCredentials: Boolean) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  /**
   * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with this
   * data source.
   */
  public fun useCallerCredentials(useCallerCredentials: IResolvable) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  /**
   * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data source.
   */
  public fun versioned(versioned: Boolean) {
    cdkBuilder.versioned(versioned)
  }

  /**
   * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data source.
   */
  public fun versioned(versioned: IResolvable) {
    cdkBuilder.versioned(versioned)
  }

  public fun build(): CfnDataSource.DynamoDBConfigProperty = cdkBuilder.build()
}
