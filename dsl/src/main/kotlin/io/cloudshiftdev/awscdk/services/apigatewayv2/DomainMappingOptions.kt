package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface DomainMappingOptions {
    /** The domain name for the mapping. */
    public fun domainName(): IDomainName

    /**
     * The API mapping key.
     *
     * Leave it undefined for the root path mapping.
     *
     * Default: - empty key for the root path mapping
     */
    public fun mappingKey(): String? = unwrap(this).getMappingKey()

    /** A builder for [DomainMappingOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param domainName The domain name for the mapping. */
        public fun domainName(domainName: IDomainName)

        /** @param mappingKey The API mapping key. Leave it undefined for the root path mapping. */
        public fun mappingKey(mappingKey: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions.Builder =
            software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions.builder()

        /** @param domainName The domain name for the mapping. */
        override fun domainName(domainName: IDomainName) {
            cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
        }

        /** @param mappingKey The API mapping key. Leave it undefined for the root path mapping. */
        override fun mappingKey(mappingKey: String) {
            cdkBuilder.mappingKey(mappingKey)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions,
    ) : DomainMappingOptions {
        /** The domain name for the mapping. */
        override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

        /**
         * The API mapping key.
         *
         * Leave it undefined for the root path mapping.
         *
         * Default: - empty key for the root path mapping
         */
        override fun mappingKey(): String? = unwrap(this).getMappingKey()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DomainMappingOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
        ): DomainMappingOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DomainMappingOptions
        ): software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions =
            (wrapped as Wrapper).cdkObject
    }
}
