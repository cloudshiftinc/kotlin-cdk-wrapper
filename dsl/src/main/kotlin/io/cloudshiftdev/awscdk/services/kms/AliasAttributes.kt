package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AliasAttributes {
    /**
     * Specifies the alias name.
     *
     * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
     */
    public fun aliasName(): String

    /** The customer master key (CMK) to which the Alias refers. */
    public fun aliasTargetKey(): IKey

    /** A builder for [AliasAttributes] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by
         *   a name (i.e. alias/ExampleAlias)
         */
        public fun aliasName(aliasName: String)

        /** @param aliasTargetKey The customer master key (CMK) to which the Alias refers. */
        public fun aliasTargetKey(aliasTargetKey: IKey)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.kms.AliasAttributes.Builder =
            software.amazon.awscdk.services.kms.AliasAttributes.builder()

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by
         *   a name (i.e. alias/ExampleAlias)
         */
        override fun aliasName(aliasName: String) {
            cdkBuilder.aliasName(aliasName)
        }

        /** @param aliasTargetKey The customer master key (CMK) to which the Alias refers. */
        override fun aliasTargetKey(aliasTargetKey: IKey) {
            cdkBuilder.aliasTargetKey(aliasTargetKey.let(IKey::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.kms.AliasAttributes = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.kms.AliasAttributes,
    ) : AliasAttributes {
        /**
         * Specifies the alias name.
         *
         * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
         */
        override fun aliasName(): String = unwrap(this).getAliasName()

        /** The customer master key (CMK) to which the Alias refers. */
        override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AliasAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.kms.AliasAttributes
        ): AliasAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AliasAttributes
        ): software.amazon.awscdk.services.kms.AliasAttributes = (wrapped as Wrapper).cdkObject
    }
}
