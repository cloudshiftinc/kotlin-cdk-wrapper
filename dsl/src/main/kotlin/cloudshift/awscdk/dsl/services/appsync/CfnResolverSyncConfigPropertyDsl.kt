@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnResolver

@CdkDslMarker
public class CfnResolverSyncConfigPropertyDsl {
  private val cdkBuilder: CfnResolver.SyncConfigProperty.Builder =
      CfnResolver.SyncConfigProperty.builder()

  /**
   * @param conflictDetection The Conflict Detection strategy to use. 
   * * *VERSION* : Detect conflicts based on object versions for this resolver.
   * * *NONE* : Do not detect conflicts when invoking this resolver.
   */
  public fun conflictDetection(conflictDetection: String) {
    cdkBuilder.conflictDetection(conflictDetection)
  }

  /**
   * @param conflictHandler The Conflict Resolution strategy to perform in the event of a conflict.
   * * *OPTIMISTIC_CONCURRENCY* : Resolve conflicts by rejecting mutations when versions don't match
   * the latest version at the server.
   * * *AUTOMERGE* : Resolve conflicts with the Automerge conflict resolution strategy.
   * * *LAMBDA* : Resolve conflicts with an AWS Lambda function supplied in the
   * `LambdaConflictHandlerConfig` .
   */
  public fun conflictHandler(conflictHandler: String) {
    cdkBuilder.conflictHandler(conflictHandler)
  }

  /**
   * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring `LAMBDA`
   * as the Conflict Handler.
   */
  public fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable) {
    cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig)
  }

  /**
   * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring `LAMBDA`
   * as the Conflict Handler.
   */
  public
      fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: CfnResolver.LambdaConflictHandlerConfigProperty) {
    cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig)
  }

  public fun build(): CfnResolver.SyncConfigProperty = cdkBuilder.build()
}
