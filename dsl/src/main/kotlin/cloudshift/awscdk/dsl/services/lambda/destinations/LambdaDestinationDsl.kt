@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.destinations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination

@CdkDslMarker
public class LambdaDestinationDsl(
  fn: IFunction,
) {
  private val cdkBuilder: LambdaDestination.Builder = LambdaDestination.Builder.create(fn)

  public fun responseOnly(responseOnly: Boolean) {
    cdkBuilder.responseOnly(responseOnly)
  }

  public fun build(): LambdaDestination = cdkBuilder.build()
}
