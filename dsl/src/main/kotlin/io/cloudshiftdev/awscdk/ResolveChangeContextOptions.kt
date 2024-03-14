package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface ResolveChangeContextOptions {
    /**
     * Change the 'allowIntrinsicKeys' option.
     *
     * Default: - Unchanged
     */
    public fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

    /**
     * Whether to remove undefined elements from arrays and objects when resolving.
     *
     * Default: - Unchanged
     */
    public fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

    /** A builder for [ResolveChangeContextOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param allowIntrinsicKeys Change the 'allowIntrinsicKeys' option. */
        public fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean)

        /**
         * @param removeEmpty Whether to remove undefined elements from arrays and objects when
         *   resolving.
         */
        public fun removeEmpty(removeEmpty: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.ResolveChangeContextOptions.Builder =
            software.amazon.awscdk.ResolveChangeContextOptions.builder()

        /** @param allowIntrinsicKeys Change the 'allowIntrinsicKeys' option. */
        override fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean) {
            cdkBuilder.allowIntrinsicKeys(allowIntrinsicKeys)
        }

        /**
         * @param removeEmpty Whether to remove undefined elements from arrays and objects when
         *   resolving.
         */
        override fun removeEmpty(removeEmpty: Boolean) {
            cdkBuilder.removeEmpty(removeEmpty)
        }

        public fun build(): software.amazon.awscdk.ResolveChangeContextOptions = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.ResolveChangeContextOptions,
    ) : ResolveChangeContextOptions {
        /**
         * Change the 'allowIntrinsicKeys' option.
         *
         * Default: - Unchanged
         */
        override fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

        /**
         * Whether to remove undefined elements from arrays and objects when resolving.
         *
         * Default: - Unchanged
         */
        override fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResolveChangeContextOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.ResolveChangeContextOptions
        ): ResolveChangeContextOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResolveChangeContextOptions
        ): software.amazon.awscdk.ResolveChangeContextOptions = (wrapped as Wrapper).cdkObject
    }
}
