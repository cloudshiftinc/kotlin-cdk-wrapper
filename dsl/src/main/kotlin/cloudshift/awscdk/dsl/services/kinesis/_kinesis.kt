@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
import software.amazon.awscdk.services.kinesis.CfnStreamProps
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamAttributes
import software.amazon.awscdk.services.kinesis.StreamProps
import software.constructs.Construct

public object kinesis {
  public inline fun cfnStream(
    scope: Construct,
    id: String,
    block: CfnStreamDsl.() -> Unit = {},
  ): CfnStream {
    val builder = CfnStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamConsumer(
    scope: Construct,
    id: String,
    block: CfnStreamConsumerDsl.() -> Unit = {},
  ): CfnStreamConsumer {
    val builder = CfnStreamConsumerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamConsumerProps(block: CfnStreamConsumerPropsDsl.() -> Unit = {}):
      CfnStreamConsumerProps {
    val builder = CfnStreamConsumerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
    val builder = CfnStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamStreamEncryptionProperty(block: CfnStreamStreamEncryptionPropertyDsl.() -> Unit =
      {}): CfnStream.StreamEncryptionProperty {
    val builder = CfnStreamStreamEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamStreamModeDetailsProperty(block: CfnStreamStreamModeDetailsPropertyDsl.() -> Unit
      = {}): CfnStream.StreamModeDetailsProperty {
    val builder = CfnStreamStreamModeDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stream(
    scope: Construct,
    id: String,
    block: StreamDsl.() -> Unit = {},
  ): Stream {
    val builder = StreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun streamAttributes(block: StreamAttributesDsl.() -> Unit = {}): StreamAttributes {
    val builder = StreamAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun streamProps(block: StreamPropsDsl.() -> Unit = {}): StreamProps {
    val builder = StreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
