package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ListenerTlsOptions {
    /** Represents TLS certificate. */
    public fun certificate(): TlsCertificate

    /** The TLS mode. */
    public fun mode(): TlsMode

    /**
     * Represents a listener's TLS validation context.
     *
     * The client certificate will only be validated if the client provides it, enabling mutual TLS.
     *
     * Default: - client TLS certificate is not required
     */
    public fun mutualTlsValidation(): MutualTlsValidation? =
        unwrap(this).getMutualTlsValidation()?.let(MutualTlsValidation::wrap)

    /** A builder for [ListenerTlsOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param certificate Represents TLS certificate. */
        public fun certificate(certificate: TlsCertificate)

        /** @param mode The TLS mode. */
        public fun mode(mode: TlsMode)

        /**
         * @param mutualTlsValidation Represents a listener's TLS validation context. The client
         *   certificate will only be validated if the client provides it, enabling mutual TLS.
         */
        public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation)

        /**
         * @param mutualTlsValidation Represents a listener's TLS validation context. The client
         *   certificate will only be validated if the client provides it, enabling mutual TLS.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2ec4217479ceb85446f582505d8719f66b85c0f5b545e50fd29876e73785781d")
        public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.ListenerTlsOptions.Builder =
            software.amazon.awscdk.services.appmesh.ListenerTlsOptions.builder()

        /** @param certificate Represents TLS certificate. */
        override fun certificate(certificate: TlsCertificate) {
            cdkBuilder.certificate(certificate.let(TlsCertificate::unwrap))
        }

        /** @param mode The TLS mode. */
        override fun mode(mode: TlsMode) {
            cdkBuilder.mode(mode.let(TlsMode::unwrap))
        }

        /**
         * @param mutualTlsValidation Represents a listener's TLS validation context. The client
         *   certificate will only be validated if the client provides it, enabling mutual TLS.
         */
        override fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation) {
            cdkBuilder.mutualTlsValidation(mutualTlsValidation.let(MutualTlsValidation::unwrap))
        }

        /**
         * @param mutualTlsValidation Represents a listener's TLS validation context. The client
         *   certificate will only be validated if the client provides it, enabling mutual TLS.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2ec4217479ceb85446f582505d8719f66b85c0f5b545e50fd29876e73785781d")
        override fun mutualTlsValidation(
            mutualTlsValidation: MutualTlsValidation.Builder.() -> Unit
        ): Unit = mutualTlsValidation(MutualTlsValidation(mutualTlsValidation))

        public fun build(): software.amazon.awscdk.services.appmesh.ListenerTlsOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.ListenerTlsOptions,
    ) : ListenerTlsOptions {
        /** Represents TLS certificate. */
        override fun certificate(): TlsCertificate =
            unwrap(this).getCertificate().let(TlsCertificate::wrap)

        /** The TLS mode. */
        override fun mode(): TlsMode = unwrap(this).getMode().let(TlsMode::wrap)

        /**
         * Represents a listener's TLS validation context.
         *
         * The client certificate will only be validated if the client provides it, enabling mutual
         * TLS.
         *
         * Default: - client TLS certificate is not required
         */
        override fun mutualTlsValidation(): MutualTlsValidation? =
            unwrap(this).getMutualTlsValidation()?.let(MutualTlsValidation::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.ListenerTlsOptions
        ): ListenerTlsOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ListenerTlsOptions
        ): software.amazon.awscdk.services.appmesh.ListenerTlsOptions =
            (wrapped as Wrapper).cdkObject
    }
}
