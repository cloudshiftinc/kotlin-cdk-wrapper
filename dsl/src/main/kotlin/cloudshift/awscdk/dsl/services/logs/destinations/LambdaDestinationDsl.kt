@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.destinations.LambdaDestination

@CdkDslMarker
public class LambdaDestinationDsl(
  arg0: IFunction,
) {
  private val cdkBuilder: LambdaDestination.Builder = LambdaDestination.Builder.create(arg0)

  public fun addPermissions(addPermissions: Boolean) {
    cdkBuilder.addPermissions(addPermissions)
  }

  public fun build(): LambdaDestination = cdkBuilder.build()
}
