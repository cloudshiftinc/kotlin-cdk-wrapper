@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.FailProps

@CdkDslMarker
public class FailPropsDsl {
  private val cdkBuilder: FailProps.Builder = FailProps.builder()

  /**
   * @param cause A description for the cause of the failure.
   */
  public fun cause(cause: String) {
    cdkBuilder.cause(cause)
  }

  /**
   * @param comment An optional description for this state.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param error Error code used to represent this failure.
   */
  public fun error(error: String) {
    cdkBuilder.error(error)
  }

  public fun build(): FailProps = cdkBuilder.build()
}
