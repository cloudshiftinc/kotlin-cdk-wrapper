@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.certificatemanager

import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CertificateProps
import software.amazon.awscdk.services.certificatemanager.CertificationValidationProps
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.CfnAccountProps
import software.amazon.awscdk.services.certificatemanager.CfnCertificate
import software.amazon.awscdk.services.certificatemanager.CfnCertificateProps
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
import software.constructs.Construct
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public object certificatemanager {
    public inline fun certificate(
        scope: Construct,
        id: String,
        block: CertificateDsl.() -> Unit = {},
    ): Certificate {
        val builder = CertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun certificateProps(block: CertificatePropsDsl.() -> Unit = {}): CertificateProps {
        val builder = CertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun certificationValidationProps(
        block: CertificationValidationPropsDsl.() -> Unit =
            {},
    ): CertificationValidationProps {
        val builder = CertificationValidationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccount(
        scope: Construct,
        id: String,
        block: CfnAccountDsl.() -> Unit = {},
    ): CfnAccount {
        val builder = CfnAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountExpiryEventsConfigurationProperty(
        block: CfnAccountExpiryEventsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAccount.ExpiryEventsConfigurationProperty {
        val builder = CfnAccountExpiryEventsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
        val builder = CfnAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateDomainValidationOptionProperty(
        block: CfnCertificateDomainValidationOptionPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.DomainValidationOptionProperty {
        val builder = CfnCertificateDomainValidationOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    @Deprecated(message = "deprecated in CDK")
    public inline fun dnsValidatedCertificate(
        scope: Construct,
        id: String,
        block: DnsValidatedCertificateDsl.() -> Unit = {},
    ): DnsValidatedCertificate {
        val builder = DnsValidatedCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dnsValidatedCertificateProps(
        block: DnsValidatedCertificatePropsDsl.() -> Unit =
            {},
    ): DnsValidatedCertificateProps {
        val builder = DnsValidatedCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateCertificate(
        scope: Construct,
        id: String,
        block: PrivateCertificateDsl.() -> Unit = {},
    ): PrivateCertificate {
        val builder = PrivateCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateCertificateProps(block: PrivateCertificatePropsDsl.() -> Unit = {}): PrivateCertificateProps {
        val builder = PrivateCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
