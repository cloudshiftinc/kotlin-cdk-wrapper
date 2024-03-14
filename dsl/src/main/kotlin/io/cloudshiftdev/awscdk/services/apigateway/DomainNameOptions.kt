package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DomainNameOptions {
    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`).
     */
    public fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for the
     * domain name.
     *
     * For "EDGE" domain names, the certificate needs to be in the US East (N. Virginia) region.
     */
    public fun certificate(): ICertificate

    /**
     * The custom domain name for your API.
     *
     * Uppercase letters are not supported.
     */
    public fun domainName(): String

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: REGIONAL
     */
    public fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     */
    public fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     */
    public fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)

    /** A builder for [DomainNameOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param basePath The base path name that callers of the API must provide in the URL after
         *   the domain name (e.g. `example.com/base-path`). If you specify this property, it can't
         *   be an empty string.
         */
        public fun basePath(basePath: String)

        /**
         * @param certificate The reference to an AWS-managed certificate for use by the
         *   edge-optimized endpoint for the domain name. For "EDGE" domain names, the certificate
         *   needs to be in the US East (N. Virginia) region.
         */
        public fun certificate(certificate: ICertificate)

        /**
         * @param domainName The custom domain name for your API. Uppercase letters are not
         *   supported.
         */
        public fun domainName(domainName: String)

        /** @param endpointType The type of endpoint for this DomainName. */
        public fun endpointType(endpointType: EndpointType)

        /** @param mtls The mutual TLS authentication configuration for a custom domain name. */
        public fun mtls(mtls: MTLSConfig)

        /** @param mtls The mutual TLS authentication configuration for a custom domain name. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
        public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

        /**
         * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
         *   domain name.
         */
        public fun securityPolicy(securityPolicy: SecurityPolicy)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigateway.DomainNameOptions.Builder =
            software.amazon.awscdk.services.apigateway.DomainNameOptions.builder()

        /**
         * @param basePath The base path name that callers of the API must provide in the URL after
         *   the domain name (e.g. `example.com/base-path`). If you specify this property, it can't
         *   be an empty string.
         */
        override fun basePath(basePath: String) {
            cdkBuilder.basePath(basePath)
        }

        /**
         * @param certificate The reference to an AWS-managed certificate for use by the
         *   edge-optimized endpoint for the domain name. For "EDGE" domain names, the certificate
         *   needs to be in the US East (N. Virginia) region.
         */
        override fun certificate(certificate: ICertificate) {
            cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
        }

        /**
         * @param domainName The custom domain name for your API. Uppercase letters are not
         *   supported.
         */
        override fun domainName(domainName: String) {
            cdkBuilder.domainName(domainName)
        }

        /** @param endpointType The type of endpoint for this DomainName. */
        override fun endpointType(endpointType: EndpointType) {
            cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
        }

        /** @param mtls The mutual TLS authentication configuration for a custom domain name. */
        override fun mtls(mtls: MTLSConfig) {
            cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
        }

        /** @param mtls The mutual TLS authentication configuration for a custom domain name. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
        override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

        /**
         * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
         *   domain name.
         */
        override fun securityPolicy(securityPolicy: SecurityPolicy) {
            cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.apigateway.DomainNameOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions,
    ) : DomainNameOptions {
        /**
         * The base path name that callers of the API must provide in the URL after the domain name
         * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
         * string.
         *
         * Default: - map requests from the domain root (e.g. `example.com`).
         */
        override fun basePath(): String? = unwrap(this).getBasePath()

        /**
         * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for
         * the domain name.
         *
         * For "EDGE" domain names, the certificate needs to be in the US East (N. Virginia) region.
         */
        override fun certificate(): ICertificate =
            unwrap(this).getCertificate().let(ICertificate::wrap)

        /**
         * The custom domain name for your API.
         *
         * Uppercase letters are not supported.
         */
        override fun domainName(): String = unwrap(this).getDomainName()

        /**
         * The type of endpoint for this DomainName.
         *
         * Default: REGIONAL
         */
        override fun endpointType(): EndpointType? =
            unwrap(this).getEndpointType()?.let(EndpointType::wrap)

        /**
         * The mutual TLS authentication configuration for a custom domain name.
         *
         * Default: - mTLS is not configured.
         */
        override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

        /**
         * The Transport Layer Security (TLS) version + cipher suite for this domain name.
         *
         * Default: SecurityPolicy.TLS_1_2
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
         */
        override fun securityPolicy(): SecurityPolicy? =
            unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions
        ): DomainNameOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DomainNameOptions
        ): software.amazon.awscdk.services.apigateway.DomainNameOptions =
            (wrapped as Wrapper).cdkObject
    }
}
