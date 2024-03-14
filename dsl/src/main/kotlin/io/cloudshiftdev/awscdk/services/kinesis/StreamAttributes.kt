package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface StreamAttributes {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun streamArn(): String

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun streamArn(streamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamAttributes.Builder =
        software.amazon.awscdk.services.kinesis.StreamAttributes.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes,
  ) : StreamAttributes {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun streamArn(): String = unwrap(this).getStreamArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StreamAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes):
        StreamAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamAttributes):
        software.amazon.awscdk.services.kinesis.StreamAttributes = (wrapped as Wrapper).cdkObject
  }
}
