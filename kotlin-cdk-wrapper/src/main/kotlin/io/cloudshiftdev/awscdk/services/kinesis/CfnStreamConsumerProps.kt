@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnStreamConsumerProps {
  public fun consumerName(): String

  public fun streamArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun consumerName(consumerName: String)

    public fun streamArn(streamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.builder()

    override fun consumerName(consumerName: String) {
      cdkBuilder.consumerName(consumerName)
    }

    override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps,
  ) : CdkObject(cdkObject), CfnStreamConsumerProps {
    override fun consumerName(): String = unwrap(this).getConsumerName()

    override fun streamArn(): String = unwrap(this).getStreamArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamConsumerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps):
        CfnStreamConsumerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamConsumerProps):
        software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
  }
}
