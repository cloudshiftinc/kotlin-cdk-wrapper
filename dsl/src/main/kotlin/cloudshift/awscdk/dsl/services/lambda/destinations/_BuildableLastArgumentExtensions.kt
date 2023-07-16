@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.destinations

import cloudshift.awscdk.dsl.services.lambda.DestinationOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DestinationConfig
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination
import software.amazon.awscdk.services.lambda.destinations.SnsDestination
import software.amazon.awscdk.services.lambda.destinations.SqsDestination
import software.constructs.Construct

public inline fun EventBridgeDestination.bind(
  arg0: Construct,
  arg1: IFunction,
  block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
  val builder = DestinationOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun LambdaDestination.bind(
  arg0: Construct,
  arg1: IFunction,
  block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
  val builder = DestinationOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun SnsDestination.bind(
  arg0: Construct,
  arg1: IFunction,
  block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
  val builder = DestinationOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun SqsDestination.bind(
  arg0: Construct,
  arg1: IFunction,
  block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
  val builder = DestinationOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}
