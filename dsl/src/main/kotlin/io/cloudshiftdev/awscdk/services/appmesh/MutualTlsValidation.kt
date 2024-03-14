package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface MutualTlsValidation {
    /**
     * Represents the subject alternative names (SANs) secured by the certificate.
     *
     * SANs must be in the FQDN or URI format.
     *
     * Default: - If you don't specify SANs on the terminating mesh endpoint, the Envoy proxy for
     * that node doesn't verify the SAN on a peer client certificate. If you don't specify SANs on
     * the originating mesh endpoint, the SAN on the certificate provided by the terminating
     * endpoint must match the mesh endpoint service discovery configuration.
     */
    public fun subjectAlternativeNames(): SubjectAlternativeNames? =
        unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

    /** Reference to where to retrieve the trust chain. */
    public fun trust(): MutualTlsValidationTrust

    /** A builder for [MutualTlsValidation] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by
         *   the certificate. SANs must be in the FQDN or URI format.
         */
        public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames)

        /** @param trust Reference to where to retrieve the trust chain. */
        public fun trust(trust: MutualTlsValidationTrust)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.MutualTlsValidation.Builder =
            software.amazon.awscdk.services.appmesh.MutualTlsValidation.builder()

        /**
         * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by
         *   the certificate. SANs must be in the FQDN or URI format.
         */
        override fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
            cdkBuilder.subjectAlternativeNames(
                subjectAlternativeNames.let(SubjectAlternativeNames::unwrap)
            )
        }

        /** @param trust Reference to where to retrieve the trust chain. */
        override fun trust(trust: MutualTlsValidationTrust) {
            cdkBuilder.trust(trust.let(MutualTlsValidationTrust::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation,
    ) : MutualTlsValidation {
        /**
         * Represents the subject alternative names (SANs) secured by the certificate.
         *
         * SANs must be in the FQDN or URI format.
         *
         * Default: - If you don't specify SANs on the terminating mesh endpoint, the Envoy proxy
         * for that node doesn't verify the SAN on a peer client certificate. If you don't specify
         * SANs on the originating mesh endpoint, the SAN on the certificate provided by the
         * terminating endpoint must match the mesh endpoint service discovery configuration.
         */
        override fun subjectAlternativeNames(): SubjectAlternativeNames? =
            unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

        /** Reference to where to retrieve the trust chain. */
        override fun trust(): MutualTlsValidationTrust =
            unwrap(this).getTrust().let(MutualTlsValidationTrust::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsValidation {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation
        ): MutualTlsValidation = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: MutualTlsValidation
        ): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
            (wrapped as Wrapper).cdkObject
    }
}
