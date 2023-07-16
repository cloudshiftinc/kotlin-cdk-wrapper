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

  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  public fun deltaSyncConfig(deltaSyncConfig: IResolvable) {
    cdkBuilder.deltaSyncConfig(deltaSyncConfig)
  }

  public fun deltaSyncConfig(deltaSyncConfig: CfnDataSource.DeltaSyncConfigProperty) {
    cdkBuilder.deltaSyncConfig(deltaSyncConfig)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun useCallerCredentials(useCallerCredentials: Boolean) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  public fun useCallerCredentials(useCallerCredentials: IResolvable) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  public fun versioned(versioned: Boolean) {
    cdkBuilder.versioned(versioned)
  }

  public fun versioned(versioned: IResolvable) {
    cdkBuilder.versioned(versioned)
  }

  public fun build(): CfnDataSource.DynamoDBConfigProperty = cdkBuilder.build()
}
