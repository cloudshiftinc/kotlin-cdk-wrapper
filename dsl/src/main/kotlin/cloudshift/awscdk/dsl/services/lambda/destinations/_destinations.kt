@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.destinations

import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions

public object destinations {
  public inline fun lambdaDestination(fn: IFunction, block: LambdaDestinationDsl.() -> Unit = {}):
      LambdaDestination {
    val builder = LambdaDestinationDsl(fn)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaDestinationOptions(block: LambdaDestinationOptionsDsl.() -> Unit = {}):
      LambdaDestinationOptions {
    val builder = LambdaDestinationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
