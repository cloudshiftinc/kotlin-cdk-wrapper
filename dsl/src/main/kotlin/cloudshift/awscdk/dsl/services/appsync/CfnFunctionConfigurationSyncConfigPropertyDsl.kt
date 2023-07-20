@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration

@CdkDslMarker
public class CfnFunctionConfigurationSyncConfigPropertyDsl {
  private val cdkBuilder: CfnFunctionConfiguration.SyncConfigProperty.Builder =
      CfnFunctionConfiguration.SyncConfigProperty.builder()

  public fun conflictDetection(conflictDetection: String) {
    cdkBuilder.conflictDetection(conflictDetection)
  }

  public fun conflictHandler(conflictHandler: String) {
    cdkBuilder.conflictHandler(conflictHandler)
  }

  public fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable) {
    cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig)
  }

  public
      fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty) {
    cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig)
  }

  public fun build(): CfnFunctionConfiguration.SyncConfigProperty = cdkBuilder.build()
}
