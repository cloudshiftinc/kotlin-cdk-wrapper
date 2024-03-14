package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface StreamAttributes {
    /**
     * The KMS key securing the contents of the stream if encryption is enabled.
     *
     * Default: - No encryption
     */
    public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /** The ARN of the stream. */
    public fun streamArn(): String

    /** A builder for [StreamAttributes] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param encryptionKey The KMS key securing the contents of the stream if encryption is
         *   enabled.
         */
        public fun encryptionKey(encryptionKey: IKey)

        /** @param streamArn The ARN of the stream. */
        public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamAttributes.Builder =
            software.amazon.awscdk.services.kinesis.StreamAttributes.builder()

        /**
         * @param encryptionKey The KMS key securing the contents of the stream if encryption is
         *   enabled.
         */
        override fun encryptionKey(encryptionKey: IKey) {
            cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
        }

        /** @param streamArn The ARN of the stream. */
        override fun streamArn(streamArn: String) {
            cdkBuilder.streamArn(streamArn)
        }

        public fun build(): software.amazon.awscdk.services.kinesis.StreamAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes,
    ) : StreamAttributes {
        /**
         * The KMS key securing the contents of the stream if encryption is enabled.
         *
         * Default: - No encryption
         */
        override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

        /** The ARN of the stream. */
        override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): StreamAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.kinesis.StreamAttributes
        ): StreamAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: StreamAttributes
        ): software.amazon.awscdk.services.kinesis.StreamAttributes = (wrapped as Wrapper).cdkObject
    }
}
