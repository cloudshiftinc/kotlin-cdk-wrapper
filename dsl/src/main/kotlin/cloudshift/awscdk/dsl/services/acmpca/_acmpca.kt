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

package cloudshift.awscdk.dsl.services.acmpca

import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
import software.amazon.awscdk.services.acmpca.CfnCertificateProps
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.amazon.awscdk.services.acmpca.CfnPermissionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object acmpca {
    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateApiPassthroughProperty(
        block: CfnCertificateApiPassthroughPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.ApiPassthroughProperty {
        val builder = CfnCertificateApiPassthroughPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthority(
        scope: Construct,
        id: String,
        block: CfnCertificateAuthorityDsl.() -> Unit = {},
    ): CfnCertificateAuthority {
        val builder = CfnCertificateAuthorityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityAccessDescriptionProperty(
        block: CfnCertificateAuthorityAccessDescriptionPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.AccessDescriptionProperty {
        val builder = CfnCertificateAuthorityAccessDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityAccessMethodProperty(
        block: CfnCertificateAuthorityAccessMethodPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.AccessMethodProperty {
        val builder = CfnCertificateAuthorityAccessMethodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityActivation(
        scope: Construct,
        id: String,
        block: CfnCertificateAuthorityActivationDsl.() -> Unit = {},
    ): CfnCertificateAuthorityActivation {
        val builder = CfnCertificateAuthorityActivationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityActivationProps(
        block: CfnCertificateAuthorityActivationPropsDsl.() -> Unit =
            {},
    ): CfnCertificateAuthorityActivationProps {
        val builder = CfnCertificateAuthorityActivationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityCrlConfigurationProperty(
        block: CfnCertificateAuthorityCrlConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.CrlConfigurationProperty {
        val builder = CfnCertificateAuthorityCrlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityCsrExtensionsProperty(
        block: CfnCertificateAuthorityCsrExtensionsPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.CsrExtensionsProperty {
        val builder = CfnCertificateAuthorityCsrExtensionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityCustomAttributeProperty(
        block: CfnCertificateAuthorityCustomAttributePropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.CustomAttributeProperty {
        val builder = CfnCertificateAuthorityCustomAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityEdiPartyNameProperty(
        block: CfnCertificateAuthorityEdiPartyNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.EdiPartyNameProperty {
        val builder = CfnCertificateAuthorityEdiPartyNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityGeneralNameProperty(
        block: CfnCertificateAuthorityGeneralNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.GeneralNameProperty {
        val builder = CfnCertificateAuthorityGeneralNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityKeyUsageProperty(
        block: CfnCertificateAuthorityKeyUsagePropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.KeyUsageProperty {
        val builder = CfnCertificateAuthorityKeyUsagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityOcspConfigurationProperty(
        block: CfnCertificateAuthorityOcspConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.OcspConfigurationProperty {
        val builder = CfnCertificateAuthorityOcspConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityOtherNameProperty(
        block: CfnCertificateAuthorityOtherNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.OtherNameProperty {
        val builder = CfnCertificateAuthorityOtherNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityProps(
        block: CfnCertificateAuthorityPropsDsl.() -> Unit =
            {},
    ): CfnCertificateAuthorityProps {
        val builder = CfnCertificateAuthorityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthorityRevocationConfigurationProperty(
        block: CfnCertificateAuthorityRevocationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.RevocationConfigurationProperty {
        val builder = CfnCertificateAuthorityRevocationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateAuthoritySubjectProperty(
        block: CfnCertificateAuthoritySubjectPropertyDsl.() -> Unit =
            {},
    ): CfnCertificateAuthority.SubjectProperty {
        val builder = CfnCertificateAuthoritySubjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateCustomAttributeProperty(
        block: CfnCertificateCustomAttributePropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.CustomAttributeProperty {
        val builder = CfnCertificateCustomAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateCustomExtensionProperty(
        block: CfnCertificateCustomExtensionPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.CustomExtensionProperty {
        val builder = CfnCertificateCustomExtensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateEdiPartyNameProperty(
        block: CfnCertificateEdiPartyNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.EdiPartyNameProperty {
        val builder = CfnCertificateEdiPartyNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateExtendedKeyUsageProperty(
        block: CfnCertificateExtendedKeyUsagePropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.ExtendedKeyUsageProperty {
        val builder = CfnCertificateExtendedKeyUsagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateExtensionsProperty(
        block: CfnCertificateExtensionsPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.ExtensionsProperty {
        val builder = CfnCertificateExtensionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateGeneralNameProperty(
        block: CfnCertificateGeneralNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.GeneralNameProperty {
        val builder = CfnCertificateGeneralNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateKeyUsageProperty(
        block: CfnCertificateKeyUsagePropertyDsl.() -> Unit = {
        },
    ): CfnCertificate.KeyUsageProperty {
        val builder = CfnCertificateKeyUsagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateOtherNameProperty(
        block: CfnCertificateOtherNamePropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.OtherNameProperty {
        val builder = CfnCertificateOtherNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificatePolicyInformationProperty(
        block: CfnCertificatePolicyInformationPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.PolicyInformationProperty {
        val builder = CfnCertificatePolicyInformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificatePolicyQualifierInfoProperty(
        block: CfnCertificatePolicyQualifierInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.PolicyQualifierInfoProperty {
        val builder = CfnCertificatePolicyQualifierInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateQualifierProperty(
        block: CfnCertificateQualifierPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.QualifierProperty {
        val builder = CfnCertificateQualifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateSubjectProperty(
        block: CfnCertificateSubjectPropertyDsl.() -> Unit =
            {},
    ): CfnCertificate.SubjectProperty {
        val builder = CfnCertificateSubjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateValidityProperty(
        block: CfnCertificateValidityPropertyDsl.() -> Unit = {
        },
    ): CfnCertificate.ValidityProperty {
        val builder = CfnCertificateValidityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermission(
        scope: Construct,
        id: String,
        block: CfnPermissionDsl.() -> Unit = {},
    ): CfnPermission {
        val builder = CfnPermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionProps(block: CfnPermissionPropsDsl.() -> Unit = {}): CfnPermissionProps {
        val builder = CfnPermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
