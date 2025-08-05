@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A reference to a StreamConsumer, which can be imported using
 * `StreamConsumer.fromStreamConsumerAttributes`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * StreamConsumerAttributes streamConsumerAttributes = StreamConsumerAttributes.builder()
 * .streamConsumerArn("streamConsumerArn")
 * .build();
 * ```
 */
public interface StreamConsumerAttributes {
  /**
   * The Amazon Resource Name (ARN) of the stream consumer.
   */
  public fun streamConsumerArn(): String

  /**
   * A builder for [StreamConsumerAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param streamConsumerArn The Amazon Resource Name (ARN) of the stream consumer. 
     */
    public fun streamConsumerArn(streamConsumerArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamConsumerAttributes.Builder
        = software.amazon.awscdk.services.kinesis.StreamConsumerAttributes.builder()

    /**
     * @param streamConsumerArn The Amazon Resource Name (ARN) of the stream consumer. 
     */
    override fun streamConsumerArn(streamConsumerArn: String) {
      cdkBuilder.streamConsumerArn(streamConsumerArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamConsumerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumerAttributes,
  ) : CdkObject(cdkObject),
      StreamConsumerAttributes {
    /**
     * The Amazon Resource Name (ARN) of the stream consumer.
     */
    override fun streamConsumerArn(): String = unwrap(this).getStreamConsumerArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamConsumerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumerAttributes):
        StreamConsumerAttributes = CdkObjectWrappers.wrap(cdkObject) as? StreamConsumerAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamConsumerAttributes):
        software.amazon.awscdk.services.kinesis.StreamConsumerAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.StreamConsumerAttributes
  }
}
