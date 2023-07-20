@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisvideo

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.amazon.awscdk.services.kinesisvideo.CfnStream
import software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
import software.constructs.Construct

public object kinesisvideo {
  public inline fun cfnSignalingChannel(
    scope: Construct,
    id: String,
    block: CfnSignalingChannelDsl.() -> Unit = {},
  ): CfnSignalingChannel {
    val builder = CfnSignalingChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSignalingChannelProps(block: CfnSignalingChannelPropsDsl.() -> Unit = {}):
      CfnSignalingChannelProps {
    val builder = CfnSignalingChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStream(
    scope: Construct,
    id: String,
    block: CfnStreamDsl.() -> Unit = {},
  ): CfnStream {
    val builder = CfnStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
    val builder = CfnStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
