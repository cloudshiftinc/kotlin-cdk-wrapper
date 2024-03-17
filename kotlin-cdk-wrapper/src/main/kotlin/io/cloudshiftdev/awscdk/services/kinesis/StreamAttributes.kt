@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * A reference to a stream.
 *
 * The easiest way to instantiate is to call
 * `stream.export()`. Then, the consumer can use `Stream.import(this, ref)` and
 * get a `Stream`.
 *
 * Example:
 *
 * ```
 * IStream importedStream = Stream.fromStreamAttributes(this, "ImportedEncryptedStream",
 * StreamAttributes.builder()
 * .streamArn("arn:aws:kinesis:us-east-2:123456789012:stream/f3j09j2230j")
 * .encryptionKey(Key.fromKeyArn(this, "key",
 * "arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012"))
 * .build());
 * ```
 */
public interface StreamAttributes {
  /**
   * The KMS key securing the contents of the stream if encryption is enabled.
   *
   * Default: - No encryption
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The ARN of the stream.
   */
  public fun streamArn(): String

  /**
   * A builder for [StreamAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey The KMS key securing the contents of the stream if encryption is
     * enabled.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param streamArn The ARN of the stream. 
     */
    public fun streamArn(streamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamAttributes.Builder =
        software.amazon.awscdk.services.kinesis.StreamAttributes.builder()

    /**
     * @param encryptionKey The KMS key securing the contents of the stream if encryption is
     * enabled.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param streamArn The ARN of the stream. 
     */
    override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes,
  ) : CdkObject(cdkObject), StreamAttributes {
    /**
     * The KMS key securing the contents of the stream if encryption is enabled.
     *
     * Default: - No encryption
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The ARN of the stream.
     */
    override fun streamArn(): String = unwrap(this).getStreamArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes):
        StreamAttributes = CdkObjectWrappers.wrap(cdkObject) as? StreamAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamAttributes):
        software.amazon.awscdk.services.kinesis.StreamAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.kinesis.StreamAttributes
  }
}
