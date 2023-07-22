@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.Fail
import software.constructs.Construct

@CdkDslMarker
public class FailDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Fail.Builder = Fail.Builder.create(scope, id)

  /**
   * A description for the cause of the failure.
   *
   * Default: No description
   *
   * @param cause A description for the cause of the failure. 
   */
  public fun cause(cause: String) {
    cdkBuilder.cause(cause)
  }

  /**
   * An optional description for this state.
   *
   * Default: No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * Error code used to represent this failure.
   *
   * Default: No error code
   *
   * @param error Error code used to represent this failure. 
   */
  public fun error(error: String) {
    cdkBuilder.error(error)
  }

  public fun build(): Fail = cdkBuilder.build()
}
