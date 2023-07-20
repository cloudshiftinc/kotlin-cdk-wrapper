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

  public fun cause(cause: String) {
    cdkBuilder.cause(cause)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun error(error: String) {
    cdkBuilder.error(error)
  }

  public fun build(): Fail = cdkBuilder.build()
}
