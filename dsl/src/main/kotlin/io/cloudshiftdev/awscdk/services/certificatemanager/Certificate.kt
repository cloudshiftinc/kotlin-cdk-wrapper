package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Certificate
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.certificatemanager.Certificate,
) : Resource(cdkObject), ICertificate {
    /** The certificate's ARN. */
    public override fun certificateArn(): String = unwrap(this).getCertificateArn()

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively expired, so alarms
     * configured on this metric should probably treat missing data as "breaching".
     *
     * @param props
     */
    public override fun metricDaysToExpiry(): Metric =
        unwrap(this).metricDaysToExpiry().let(Metric::wrap)

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively expired, so alarms
     * configured on this metric should probably treat missing data as "breaching".
     *
     * @param props
     */
    public override fun metricDaysToExpiry(props: MetricOptions): Metric =
        unwrap(this).metricDaysToExpiry(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively expired, so alarms
     * configured on this metric should probably treat missing data as "breaching".
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
    public override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDaysToExpiry(MetricOptions(props))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.certificatemanager.Certificate]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Certificate name.
         *
         * Since the Certificate resource doesn't support providing a physical name, the value
         * provided here will be recorded in the `Name` tag
         *
         * Default: the full, absolute path of this construct
         *
         * @param certificateName The Certificate name.
         */
        public fun certificateName(certificateName: String)

        /**
         * Fully-qualified domain name to request a certificate for.
         *
         * May contain wildcards, such as `*.domain.com`.
         *
         * @param domainName Fully-qualified domain name to request a certificate for.
         */
        public fun domainName(domainName: String)

        /**
         * Specifies the algorithm of the public and private key pair that your certificate uses to
         * encrypt data.
         *
         * Default: KeyAlgorithm.RSA_2048
         *
         * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
         *
         * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
         *   certificate uses to encrypt data.
         */
        public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

        /**
         * Alternative domain names on your certificate.
         *
         * Use this to register alternative domain names that represent the same site.
         *
         * Default: - No additional FQDNs will be included as alternative domain names.
         *
         * @param subjectAlternativeNames Alternative domain names on your certificate.
         */
        public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

        /**
         * Alternative domain names on your certificate.
         *
         * Use this to register alternative domain names that represent the same site.
         *
         * Default: - No additional FQDNs will be included as alternative domain names.
         *
         * @param subjectAlternativeNames Alternative domain names on your certificate.
         */
        public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

        /**
         * Enable or disable transparency logging for this certificate.
         *
         * Once a certificate has been logged, it cannot be removed from the log. Opting out at that
         * point will have no effect. If you opt out of logging when you request a certificate and
         * then choose later to opt back in, your certificate will not be logged until it is
         * renewed. If you want the certificate to be logged immediately, we recommend that you
         * issue a new one.
         *
         * Default: true
         *
         * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
         *
         * @param transparencyLoggingEnabled Enable or disable transparency logging for this
         *   certificate.
         */
        public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

        /**
         * How to validate this certificate.
         *
         * Default: CertificateValidation.fromEmail()
         *
         * @param validation How to validate this certificate.
         */
        public fun validation(validation: CertificateValidation)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.certificatemanager.Certificate.Builder =
            software.amazon.awscdk.services.certificatemanager.Certificate.Builder.create(scope, id)

        /**
         * The Certificate name.
         *
         * Since the Certificate resource doesn't support providing a physical name, the value
         * provided here will be recorded in the `Name` tag
         *
         * Default: the full, absolute path of this construct
         *
         * @param certificateName The Certificate name.
         */
        override fun certificateName(certificateName: String) {
            cdkBuilder.certificateName(certificateName)
        }

        /**
         * Fully-qualified domain name to request a certificate for.
         *
         * May contain wildcards, such as `*.domain.com`.
         *
         * @param domainName Fully-qualified domain name to request a certificate for.
         */
        override fun domainName(domainName: String) {
            cdkBuilder.domainName(domainName)
        }

        /**
         * Specifies the algorithm of the public and private key pair that your certificate uses to
         * encrypt data.
         *
         * Default: KeyAlgorithm.RSA_2048
         *
         * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms.title)
         *
         * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
         *   certificate uses to encrypt data.
         */
        override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
            cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
        }

        /**
         * Alternative domain names on your certificate.
         *
         * Use this to register alternative domain names that represent the same site.
         *
         * Default: - No additional FQDNs will be included as alternative domain names.
         *
         * @param subjectAlternativeNames Alternative domain names on your certificate.
         */
        override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
            cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
        }

        /**
         * Alternative domain names on your certificate.
         *
         * Use this to register alternative domain names that represent the same site.
         *
         * Default: - No additional FQDNs will be included as alternative domain names.
         *
         * @param subjectAlternativeNames Alternative domain names on your certificate.
         */
        override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
            subjectAlternativeNames(subjectAlternativeNames.toList())

        /**
         * Enable or disable transparency logging for this certificate.
         *
         * Once a certificate has been logged, it cannot be removed from the log. Opting out at that
         * point will have no effect. If you opt out of logging when you request a certificate and
         * then choose later to opt back in, your certificate will not be logged until it is
         * renewed. If you want the certificate to be logged immediately, we recommend that you
         * issue a new one.
         *
         * Default: true
         *
         * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
         *
         * @param transparencyLoggingEnabled Enable or disable transparency logging for this
         *   certificate.
         */
        override fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
            cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
        }

        /**
         * How to validate this certificate.
         *
         * Default: CertificateValidation.fromEmail()
         *
         * @param validation How to validate this certificate.
         */
        override fun validation(validation: CertificateValidation) {
            cdkBuilder.validation(validation.let(CertificateValidation::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.certificatemanager.Certificate =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromCertificateArn(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            certificateArn: String,
        ): ICertificate =
            software.amazon.awscdk.services.certificatemanager.Certificate.fromCertificateArn(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    certificateArn
                )
                .let(ICertificate::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Certificate {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Certificate(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.certificatemanager.Certificate
        ): Certificate = Certificate(cdkObject)

        internal fun unwrap(
            wrapped: Certificate
        ): software.amazon.awscdk.services.certificatemanager.Certificate = wrapped.cdkObject
    }
}
