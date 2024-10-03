@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCertificateAuthority`.
 *
 * Example:
 *
 * ```
 * CfnCertificateAuthority cfnCertificateAuthority = CfnCertificateAuthority.Builder.create(this,
 * "CA")
 * .type("ROOT")
 * .keyAlgorithm("RSA_2048")
 * .signingAlgorithm("SHA256WITHRSA")
 * .subject(SubjectProperty.builder()
 * .country("US")
 * .organization("string")
 * .organizationalUnit("string")
 * .distinguishedNameQualifier("string")
 * .state("string")
 * .commonName("123")
 * .serialNumber("string")
 * .locality("string")
 * .title("string")
 * .surname("string")
 * .givenName("string")
 * .initials("DG")
 * .pseudonym("string")
 * .generationQualifier("DBG")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html)
 */
public interface CfnCertificateAuthorityProps {
  /**
   * Specifies information to be added to the extension section of the certificate signing request
   * (CSR).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
   */
  public fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

  /**
   * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
   * it issues a certificate.
   *
   * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm)
   */
  public fun keyAlgorithm(): String

  /**
   * Specifies a cryptographic key management compliance standard used for handling CA keys.
   *
   * Default: FIPS_140_2_LEVEL_3_OR_HIGHER
   *
   *
   * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
   * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` . Failure
   * to do this results in an `InvalidArgsException` with the message, "A certificate authority cannot
   * be created in this region with the specified security standard."
   *
   * For information about security standard support in various Regions, see [Storage and security
   * compliance of AWS Private CA private
   * keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keystoragesecuritystandard)
   */
  public fun keyStorageSecurityStandard(): String? = unwrap(this).getKeyStorageSecurityStandard()

  /**
   * Information about the Online Certificate Status Protocol (OCSP) configuration or certificate
   * revocation list (CRL) created and maintained by your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
   */
  public fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

  /**
   * Name of the algorithm your private CA uses to sign certificate requests.
   *
   * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
   * certificates when they are issued.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm)
   */
  public fun signingAlgorithm(): String

  /**
   * Structure that contains X.500 distinguished name information for your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
   */
  public fun subject(): Any

  /**
   * Key-value pairs that will be attached to the new private CA.
   *
   * You can associate up to 50 tags with a private CA. For information using tags with IAM to
   * manage permissions, see [Controlling Access Using IAM
   * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Type of your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type)
   */
  public fun type(): String

  /**
   * Specifies whether the CA issues general-purpose certificates that typically require a
   * revocation mechanism, or short-lived certificates that may optionally omit revocation because they
   * expire quickly.
   *
   * Short-lived certificate validity is limited to seven days.
   *
   * The default value is GENERAL_PURPOSE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-usagemode)
   */
  public fun usageMode(): String? = unwrap(this).getUsageMode()

  /**
   * A builder for [CfnCertificateAuthorityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: IResolvable)

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    public fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty)

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6bebd295ea06d57572be0da693ba0d33881ffa0c57c6c2ef37ca0382d52c3a")
    public
        fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty.Builder.() -> Unit)

    /**
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     * your CA creates when it issues a certificate. 
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     */
    public fun keyAlgorithm(keyAlgorithm: String)

    /**
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     * standard used for handling CA keys.
     * Default: FIPS_140_2_LEVEL_3_OR_HIGHER
     *
     *
     * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
     * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` .
     * Failure to do this results in an `InvalidArgsException` with the message, "A certificate
     * authority cannot be created in this region with the specified security standard."
     *
     * For information about security standard support in various Regions, see [Storage and security
     * compliance of AWS Private CA private
     * keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys)
     * .
     */
    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String)

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    public fun revocationConfiguration(revocationConfiguration: IResolvable)

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    public
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty)

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2b01af94adf2e175ad0dd59a68765bc3e45738e6e3241377373ef3329455eb6")
    public
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     * requests. 
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     */
    public fun signingAlgorithm(signingAlgorithm: String)

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    public fun subject(subject: IResolvable)

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    public fun subject(subject: CfnCertificateAuthority.SubjectProperty)

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8303ea251795b2f267cd4f552de639cfcb95af2349a7d94e9518c6277037d370")
    public fun subject(subject: CfnCertificateAuthority.SubjectProperty.Builder.() -> Unit)

    /**
     * @param tags Key-value pairs that will be attached to the new private CA.
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that will be attached to the new private CA.
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type Type of your private CA. 
     */
    public fun type(type: String)

    /**
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     * require a revocation mechanism, or short-lived certificates that may optionally omit revocation
     * because they expire quickly.
     * Short-lived certificate validity is limited to seven days.
     *
     * The default value is GENERAL_PURPOSE.
     */
    public fun usageMode(usageMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps.builder()

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    override fun csrExtensions(csrExtensions: IResolvable) {
      cdkBuilder.csrExtensions(csrExtensions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    override fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty) {
      cdkBuilder.csrExtensions(csrExtensions.let(CfnCertificateAuthority.CsrExtensionsProperty.Companion::unwrap))
    }

    /**
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6bebd295ea06d57572be0da693ba0d33881ffa0c57c6c2ef37ca0382d52c3a")
    override
        fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty.Builder.() -> Unit):
        Unit = csrExtensions(CfnCertificateAuthority.CsrExtensionsProperty(csrExtensions))

    /**
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     * your CA creates when it issues a certificate. 
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     */
    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     * standard used for handling CA keys.
     * Default: FIPS_140_2_LEVEL_3_OR_HIGHER
     *
     *
     * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
     * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` .
     * Failure to do this results in an `InvalidArgsException` with the message, "A certificate
     * authority cannot be created in this region with the specified security standard."
     *
     * For information about security standard support in various Regions, see [Storage and security
     * compliance of AWS Private CA private
     * keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys)
     * .
     */
    override fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
      cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    override fun revocationConfiguration(revocationConfiguration: IResolvable) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    override
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(CfnCertificateAuthority.RevocationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param revocationConfiguration Information about the Online Certificate Status Protocol
     * (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private
     * CA.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2b01af94adf2e175ad0dd59a68765bc3e45738e6e3241377373ef3329455eb6")
    override
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        revocationConfiguration(CfnCertificateAuthority.RevocationConfigurationProperty(revocationConfiguration))

    /**
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     * requests. 
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     */
    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    override fun subject(subject: IResolvable) {
      cdkBuilder.subject(subject.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    override fun subject(subject: CfnCertificateAuthority.SubjectProperty) {
      cdkBuilder.subject(subject.let(CfnCertificateAuthority.SubjectProperty.Companion::unwrap))
    }

    /**
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8303ea251795b2f267cd4f552de639cfcb95af2349a7d94e9518c6277037d370")
    override fun subject(subject: CfnCertificateAuthority.SubjectProperty.Builder.() -> Unit): Unit
        = subject(CfnCertificateAuthority.SubjectProperty(subject))

    /**
     * @param tags Key-value pairs that will be attached to the new private CA.
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs that will be attached to the new private CA.
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type Type of your private CA. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     * require a revocation mechanism, or short-lived certificates that may optionally omit revocation
     * because they expire quickly.
     * Short-lived certificate validity is limited to seven days.
     *
     * The default value is GENERAL_PURPOSE.
     */
    override fun usageMode(usageMode: String) {
      cdkBuilder.usageMode(usageMode)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps,
  ) : CdkObject(cdkObject),
      CfnCertificateAuthorityProps {
    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     */
    override fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
     * it issues a certificate.
     *
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm)
     */
    override fun keyAlgorithm(): String = unwrap(this).getKeyAlgorithm()

    /**
     * Specifies a cryptographic key management compliance standard used for handling CA keys.
     *
     * Default: FIPS_140_2_LEVEL_3_OR_HIGHER
     *
     *
     * Some AWS Regions do not support the default. When creating a CA in these Regions, you must
     * provide `FIPS_140_2_LEVEL_2_OR_HIGHER` as the argument for `KeyStorageSecurityStandard` .
     * Failure to do this results in an `InvalidArgsException` with the message, "A certificate
     * authority cannot be created in this region with the specified security standard."
     *
     * For information about security standard support in various Regions, see [Storage and security
     * compliance of AWS Private CA private
     * keys](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keystoragesecuritystandard)
     */
    override fun keyStorageSecurityStandard(): String? =
        unwrap(this).getKeyStorageSecurityStandard()

    /**
     * Information about the Online Certificate Status Protocol (OCSP) configuration or certificate
     * revocation list (CRL) created and maintained by your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     */
    override fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

    /**
     * Name of the algorithm your private CA uses to sign certificate requests.
     *
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm)
     */
    override fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     */
    override fun subject(): Any = unwrap(this).getSubject()

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Type of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a
     * revocation mechanism, or short-lived certificates that may optionally omit revocation because
     * they expire quickly.
     *
     * Short-lived certificate validity is limited to seven days.
     *
     * The default value is GENERAL_PURPOSE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-usagemode)
     */
    override fun usageMode(): String? = unwrap(this).getUsageMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateAuthorityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps):
        CfnCertificateAuthorityProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCertificateAuthorityProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
  }
}
