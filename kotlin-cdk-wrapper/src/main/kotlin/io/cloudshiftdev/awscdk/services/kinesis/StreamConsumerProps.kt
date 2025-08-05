@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Kinesis Stream Consumer.
 *
 * Example:
 *
 * ```
 * Role lambdaRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .description("Example role...")
 * .build();
 * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
 * .encryption(StreamEncryption.KMS)
 * .build();
 * StreamConsumer streamConsumer = StreamConsumer.Builder.create(this, "MyStreamConsumer")
 * .streamConsumerName("MyStreamConsumer")
 * .stream(stream)
 * .build();
 * // give lambda permissions to read stream via the stream consumer
 * streamConsumer.grantRead(lambdaRole);
 * ```
 */
public interface StreamConsumerProps {
  /**
   * The Kinesis data stream to associate this consumer with.
   */
  public fun stream(): IStream

  /**
   * The name of the stream consumer.
   */
  public fun streamConsumerName(): String

  /**
   * A builder for [StreamConsumerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stream The Kinesis data stream to associate this consumer with. 
     */
    public fun stream(stream: IStream)

    /**
     * @param streamConsumerName The name of the stream consumer. 
     */
    public fun streamConsumerName(streamConsumerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamConsumerProps.Builder =
        software.amazon.awscdk.services.kinesis.StreamConsumerProps.builder()

    /**
     * @param stream The Kinesis data stream to associate this consumer with. 
     */
    override fun stream(stream: IStream) {
      cdkBuilder.stream(stream.let(IStream.Companion::unwrap))
    }

    /**
     * @param streamConsumerName The name of the stream consumer. 
     */
    override fun streamConsumerName(streamConsumerName: String) {
      cdkBuilder.streamConsumerName(streamConsumerName)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumerProps,
  ) : CdkObject(cdkObject),
      StreamConsumerProps {
    /**
     * The Kinesis data stream to associate this consumer with.
     */
    override fun stream(): IStream = unwrap(this).getStream().let(IStream::wrap)

    /**
     * The name of the stream consumer.
     */
    override fun streamConsumerName(): String = unwrap(this).getStreamConsumerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamConsumerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumerProps):
        StreamConsumerProps = CdkObjectWrappers.wrap(cdkObject) as? StreamConsumerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamConsumerProps):
        software.amazon.awscdk.services.kinesis.StreamConsumerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.StreamConsumerProps
  }
}
