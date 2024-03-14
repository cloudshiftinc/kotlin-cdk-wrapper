package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnTag {
    /**  */
    public fun key(): String

    /**  */
    public fun `value`(): String

    /** A builder for [CfnTag] */
    @CdkDslMarker
    public interface Builder {
        /** @param key the value to be set. */
        public fun key(key: String)

        /** @param value the value to be set. */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.CfnTag.Builder =
            software.amazon.awscdk.CfnTag.builder()

        /** @param key the value to be set. */
        override fun key(key: String) {
            cdkBuilder.key(key)
        }

        /** @param value the value to be set. */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.CfnTag = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.CfnTag,
    ) : CfnTag {
        /**  */
        override fun key(): String = unwrap(this).getKey()

        /**  */
        override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CfnTag {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.CfnTag): CfnTag = Wrapper(cdkObject)

        internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.CfnTag =
            (wrapped as Wrapper).cdkObject
    }
}
