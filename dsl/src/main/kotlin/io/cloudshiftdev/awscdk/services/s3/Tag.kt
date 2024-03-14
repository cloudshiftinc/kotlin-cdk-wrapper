package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Tag {
    /** key to e tagged. */
    public fun key(): String

    /** additional value. */
    public fun `value`(): String

    /** A builder for [Tag] */
    @CdkDslMarker
    public interface Builder {
        /** @param key key to e tagged. */
        public fun key(key: String)

        /** @param value additional value. */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.Tag.Builder =
            software.amazon.awscdk.services.s3.Tag.builder()

        /** @param key key to e tagged. */
        override fun key(key: String) {
            cdkBuilder.key(key)
        }

        /** @param value additional value. */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.services.s3.Tag = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.Tag,
    ) : Tag {
        /** key to e tagged. */
        override fun key(): String = unwrap(this).getKey()

        /** additional value. */
        override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Tag): Tag =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: Tag): software.amazon.awscdk.services.s3.Tag =
            (wrapped as Wrapper).cdkObject
    }
}
