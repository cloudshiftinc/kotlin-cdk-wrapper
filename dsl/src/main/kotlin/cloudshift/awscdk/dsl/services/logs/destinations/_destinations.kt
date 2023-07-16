@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs.destinations

import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.destinations.KinesisDestination
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps
import software.amazon.awscdk.services.logs.destinations.LambdaDestination
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions

public object destinations {
  public inline fun kinesisDestination(arg0: IStream, block: KinesisDestinationDsl.() -> Unit = {}):
      KinesisDestination {
    val builder = KinesisDestinationDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisDestinationProps(block: KinesisDestinationPropsDsl.() -> Unit = {}):
      KinesisDestinationProps {
    val builder = KinesisDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaDestination(arg0: IFunction, block: LambdaDestinationDsl.() -> Unit = {}):
      LambdaDestination {
    val builder = LambdaDestinationDsl(arg0)
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
