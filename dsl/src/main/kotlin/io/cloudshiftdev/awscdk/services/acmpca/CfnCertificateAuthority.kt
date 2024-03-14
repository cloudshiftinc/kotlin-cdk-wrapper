package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificateAuthority internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) for the private CA that issued the certificate.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Base64 PEM-encoded certificate signing request (CSR) for your certificate authority
   * certificate.
   */
  public open fun attrCertificateSigningRequest(): String =
      unwrap(this).getAttrCertificateSigningRequest()

  /**
   * Specifies information to be added to the extension section of the certificate signing request
   * (CSR).
   */
  public open fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

  /**
   * Specifies information to be added to the extension section of the certificate signing request
   * (CSR).
   */
  public open fun csrExtensions(`value`: IResolvable) {
    unwrap(this).setCsrExtensions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies information to be added to the extension section of the certificate signing request
   * (CSR).
   */
  public open fun csrExtensions(`value`: CsrExtensionsProperty) {
    unwrap(this).setCsrExtensions(`value`.let(CsrExtensionsProperty::unwrap))
  }

  /**
   * Specifies information to be added to the extension section of the certificate signing request
   * (CSR).
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcfad6e60f76a697015566819c3bb647af8a3d6be9901dbda0a8c3613fde9afe")
  public open fun csrExtensions(`value`: CsrExtensionsProperty.Builder.() -> Unit): Unit =
      csrExtensions(CsrExtensionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
   * it issues a certificate.
   */
  public open fun keyAlgorithm(): String = unwrap(this).getKeyAlgorithm()

  /**
   * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
   * it issues a certificate.
   */
  public open fun keyAlgorithm(`value`: String) {
    unwrap(this).setKeyAlgorithm(`value`)
  }

  /**
   * Specifies a cryptographic key management compliance standard used for handling CA keys.
   */
  public open fun keyStorageSecurityStandard(): String? =
      unwrap(this).getKeyStorageSecurityStandard()

  /**
   * Specifies a cryptographic key management compliance standard used for handling CA keys.
   */
  public open fun keyStorageSecurityStandard(`value`: String) {
    unwrap(this).setKeyStorageSecurityStandard(`value`)
  }

  /**
   * Certificate revocation information used by the
   * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
   * and
   * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
   * actions. Your private certificate authority (CA) can configure Online Certificate Status Protocol
   * (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns validation
   * information about certificates as requested by clients, and a CRL contains an updated list of
   * certificates revoked by your CA. For more information, see
   * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
   * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
   * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the *AWS
   * Private CA User Guide* .
   */
  public open fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

  /**
   * Certificate revocation information used by the
   * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
   * and
   * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
   * actions. Your private certificate authority (CA) can configure Online Certificate Status Protocol
   * (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns validation
   * information about certificates as requested by clients, and a CRL contains an updated list of
   * certificates revoked by your CA. For more information, see
   * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
   * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
   * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the *AWS
   * Private CA User Guide* .
   */
  public open fun revocationConfiguration(`value`: IResolvable) {
    unwrap(this).setRevocationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Certificate revocation information used by the
   * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
   * and
   * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
   * actions. Your private certificate authority (CA) can configure Online Certificate Status Protocol
   * (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns validation
   * information about certificates as requested by clients, and a CRL contains an updated list of
   * certificates revoked by your CA. For more information, see
   * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
   * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
   * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the *AWS
   * Private CA User Guide* .
   */
  public open fun revocationConfiguration(`value`: RevocationConfigurationProperty) {
    unwrap(this).setRevocationConfiguration(`value`.let(RevocationConfigurationProperty::unwrap))
  }

  /**
   * Certificate revocation information used by the
   * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
   * and
   * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
   * actions. Your private certificate authority (CA) can configure Online Certificate Status Protocol
   * (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns validation
   * information about certificates as requested by clients, and a CRL contains an updated list of
   * certificates revoked by your CA. For more information, see
   * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
   * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
   * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the *AWS
   * Private CA User Guide* .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("872c32b575520dea0d4be4d42390262794c9658a7cb0ff2a4cf08e81a1dbdebf")
  public open
      fun revocationConfiguration(`value`: RevocationConfigurationProperty.Builder.() -> Unit): Unit
      = revocationConfiguration(RevocationConfigurationProperty(`value`))

  /**
   * Name of the algorithm your private CA uses to sign certificate requests.
   */
  public open fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

  /**
   * Name of the algorithm your private CA uses to sign certificate requests.
   */
  public open fun signingAlgorithm(`value`: String) {
    unwrap(this).setSigningAlgorithm(`value`)
  }

  /**
   * Structure that contains X.500 distinguished name information for your private CA.
   */
  public open fun subject(): Any = unwrap(this).getSubject()

  /**
   * Structure that contains X.500 distinguished name information for your private CA.
   */
  public open fun subject(`value`: IResolvable) {
    unwrap(this).setSubject(`value`.let(IResolvable::unwrap))
  }

  /**
   * Structure that contains X.500 distinguished name information for your private CA.
   */
  public open fun subject(`value`: SubjectProperty) {
    unwrap(this).setSubject(`value`.let(SubjectProperty::unwrap))
  }

  /**
   * Structure that contains X.500 distinguished name information for your private CA.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f0cdc0265ff00f08c1503121d08f39681bf21d2d1e4672885f52f80dbac91b7")
  public open fun subject(`value`: SubjectProperty.Builder.() -> Unit): Unit =
      subject(SubjectProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that will be attached to the new private CA.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that will be attached to the new private CA.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that will be attached to the new private CA.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Type of your private CA.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Type of your private CA.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * Specifies whether the CA issues general-purpose certificates that typically require a
   * revocation mechanism, or short-lived certificates that may optionally omit revocation because they
   * expire quickly.
   */
  public open fun usageMode(): String? = unwrap(this).getUsageMode()

  /**
   * Specifies whether the CA issues general-purpose certificates that typically require a
   * revocation mechanism, or short-lived certificates that may optionally omit revocation because they
   * expire quickly.
   */
  public open fun usageMode(`value`: String) {
    unwrap(this).setUsageMode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.acmpca.CfnCertificateAuthority].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    public fun csrExtensions(csrExtensions: IResolvable)

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    public fun csrExtensions(csrExtensions: CsrExtensionsProperty)

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3588d79ec2a4bbbfd46f35946af39067613e03a5bfac28f5bb29032a8c13e2cf")
    public fun csrExtensions(csrExtensions: CsrExtensionsProperty.Builder.() -> Unit)

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
     * it issues a certificate.
     *
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm)
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     * your CA creates when it issues a certificate. 
     */
    public fun keyAlgorithm(keyAlgorithm: String)

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
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     * standard used for handling CA keys. 
     */
    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String)

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    public fun revocationConfiguration(revocationConfiguration: IResolvable)

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    public fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty)

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b3e444ce362ba61faaa26b8350cddfed08d805dca8f5b73a4b307724c9fed74")
    public
        fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty.Builder.() -> Unit)

    /**
     * Name of the algorithm your private CA uses to sign certificate requests.
     *
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm)
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     * requests. 
     */
    public fun signingAlgorithm(signingAlgorithm: String)

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    public fun subject(subject: IResolvable)

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    public fun subject(subject: SubjectProperty)

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627b67d75d0d706282cd5f2d373217b36fe336f138ddb77c4e08238b89bbb54c")
    public fun subject(subject: SubjectProperty.Builder.() -> Unit)

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     * @param tags Key-value pairs that will be attached to the new private CA. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     * @param tags Key-value pairs that will be attached to the new private CA. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Type of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type)
     * @param type Type of your private CA. 
     */
    public fun type(type: String)

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
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     * require a revocation mechanism, or short-lived certificates that may optionally omit revocation
     * because they expire quickly. 
     */
    public fun usageMode(usageMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder.create(scope, id)

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    override fun csrExtensions(csrExtensions: IResolvable) {
      cdkBuilder.csrExtensions(csrExtensions.let(IResolvable::unwrap))
    }

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    override fun csrExtensions(csrExtensions: CsrExtensionsProperty) {
      cdkBuilder.csrExtensions(csrExtensions.let(CsrExtensionsProperty::unwrap))
    }

    /**
     * Specifies information to be added to the extension section of the certificate signing request
     * (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-csrextensions)
     * @param csrExtensions Specifies information to be added to the extension section of the
     * certificate signing request (CSR). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3588d79ec2a4bbbfd46f35946af39067613e03a5bfac28f5bb29032a8c13e2cf")
    override fun csrExtensions(csrExtensions: CsrExtensionsProperty.Builder.() -> Unit): Unit =
        csrExtensions(CsrExtensionsProperty(csrExtensions))

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when
     * it issues a certificate.
     *
     * When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm)
     * @param keyAlgorithm Type of the public key algorithm and size, in bits, of the key pair that
     * your CA creates when it issues a certificate. 
     */
    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

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
     * @param keyStorageSecurityStandard Specifies a cryptographic key management compliance
     * standard used for handling CA keys. 
     */
    override fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
      cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    override fun revocationConfiguration(revocationConfiguration: IResolvable) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    override fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(RevocationConfigurationProperty::unwrap))
    }

    /**
     * Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* .
     *
     *
     * The following requirements apply to revocation configurations.
     *
     * * A configuration disabling CRLs or OCSP must contain only the `Enabled=False` parameter, and
     * will fail if other parameters such as `CustomCname` or `ExpirationInDays` are included.
     * * In a CRL configuration, the `S3BucketName` parameter must conform to the [Amazon S3 bucket
     * naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     * * A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must
     * conform to [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt)
     * restrictions on the use of special characters in a CNAME.
     * * In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol
     * prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-revocationconfiguration)
     * @param revocationConfiguration Certificate revocation information used by the
     * [CreateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_CreateCertificateAuthority.html)
     * and
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * actions. Your private certificate authority (CA) can configure Online Certificate Status
     * Protocol (OCSP) support and/or maintain a certificate revocation list (CRL). OCSP returns
     * validation information about certificates as requested by clients, and a CRL contains an updated
     * list of certificates revoked by your CA. For more information, see
     * [RevokeCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_RevokeCertificate.html)
     * in the *AWS Private CA API Reference* and [Setting up a certificate revocation
     * method](https://docs.aws.amazon.com/privateca/latest/userguide/revocation-setup.html) in the
     * *AWS Private CA User Guide* . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b3e444ce362ba61faaa26b8350cddfed08d805dca8f5b73a4b307724c9fed74")
    override
        fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty.Builder.() -> Unit):
        Unit = revocationConfiguration(RevocationConfigurationProperty(revocationConfiguration))

    /**
     * Name of the algorithm your private CA uses to sign certificate requests.
     *
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign
     * certificates when they are issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm)
     * @param signingAlgorithm Name of the algorithm your private CA uses to sign certificate
     * requests. 
     */
    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    override fun subject(subject: IResolvable) {
      cdkBuilder.subject(subject.let(IResolvable::unwrap))
    }

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    override fun subject(subject: SubjectProperty) {
      cdkBuilder.subject(subject.let(SubjectProperty::unwrap))
    }

    /**
     * Structure that contains X.500 distinguished name information for your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-subject)
     * @param subject Structure that contains X.500 distinguished name information for your private
     * CA. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627b67d75d0d706282cd5f2d373217b36fe336f138ddb77c4e08238b89bbb54c")
    override fun subject(subject: SubjectProperty.Builder.() -> Unit): Unit =
        subject(SubjectProperty(subject))

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     * @param tags Key-value pairs that will be attached to the new private CA. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that will be attached to the new private CA.
     *
     * You can associate up to 50 tags with a private CA. For information using tags with IAM to
     * manage permissions, see [Controlling Access Using IAM
     * Tags](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags)
     * @param tags Key-value pairs that will be attached to the new private CA. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Type of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type)
     * @param type Type of your private CA. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

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
     * @param usageMode Specifies whether the CA issues general-purpose certificates that typically
     * require a revocation mechanism, or short-lived certificates that may optionally omit revocation
     * because they expire quickly. 
     */
    override fun usageMode(usageMode: String) {
      cdkBuilder.usageMode(usageMode)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateAuthority {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateAuthority(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority):
        CfnCertificateAuthority = CfnCertificateAuthority(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthority):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthority = wrapped.cdkObject
  }

  public interface EdiPartyNameProperty {
    /**
     * Specifies the name assigner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html#cfn-acmpca-certificateauthority-edipartyname-nameassigner)
     */
    public fun nameAssigner(): String

    /**
     * Specifies the party name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html#cfn-acmpca-certificateauthority-edipartyname-partyname)
     */
    public fun partyName(): String

    /**
     * A builder for [EdiPartyNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nameAssigner Specifies the name assigner. 
       */
      public fun nameAssigner(nameAssigner: String)

      /**
       * @param partyName Specifies the party name. 
       */
      public fun partyName(partyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty.builder()

      /**
       * @param nameAssigner Specifies the name assigner. 
       */
      override fun nameAssigner(nameAssigner: String) {
        cdkBuilder.nameAssigner(nameAssigner)
      }

      /**
       * @param partyName Specifies the party name. 
       */
      override fun partyName(partyName: String) {
        cdkBuilder.partyName(partyName)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty,
    ) : CdkObject(cdkObject), EdiPartyNameProperty {
      /**
       * Specifies the name assigner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html#cfn-acmpca-certificateauthority-edipartyname-nameassigner)
       */
      override fun nameAssigner(): String = unwrap(this).getNameAssigner()

      /**
       * Specifies the party name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html#cfn-acmpca-certificateauthority-edipartyname-partyname)
       */
      override fun partyName(): String = unwrap(this).getPartyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdiPartyNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty):
          EdiPartyNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiPartyNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty
    }
  }

  public interface OtherNameProperty {
    /**
     * Specifies an OID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-othername.html#cfn-acmpca-certificateauthority-othername-typeid)
     */
    public fun typeId(): String

    /**
     * Specifies an OID value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-othername.html#cfn-acmpca-certificateauthority-othername-value)
     */
    public fun `value`(): String

    /**
     * A builder for [OtherNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param typeId Specifies an OID. 
       */
      public fun typeId(typeId: String)

      /**
       * @param value Specifies an OID value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty.builder()

      /**
       * @param typeId Specifies an OID. 
       */
      override fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
      }

      /**
       * @param value Specifies an OID value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty,
    ) : CdkObject(cdkObject), OtherNameProperty {
      /**
       * Specifies an OID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-othername.html#cfn-acmpca-certificateauthority-othername-typeid)
       */
      override fun typeId(): String = unwrap(this).getTypeId()

      /**
       * Specifies an OID value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-othername.html#cfn-acmpca-certificateauthority-othername-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OtherNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty):
          OtherNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtherNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty
    }
  }

  public interface AccessDescriptionProperty {
    /**
     * The location of `AccessDescription` information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html#cfn-acmpca-certificateauthority-accessdescription-accesslocation)
     */
    public fun accessLocation(): Any

    /**
     * The type and format of `AccessDescription` information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html#cfn-acmpca-certificateauthority-accessdescription-accessmethod)
     */
    public fun accessMethod(): Any

    /**
     * A builder for [AccessDescriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      public fun accessLocation(accessLocation: IResolvable)

      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      public fun accessLocation(accessLocation: GeneralNameProperty)

      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5a597013ed07b1773f4061cf6b689bdab60e580241398175d0e17b064edaa9")
      public fun accessLocation(accessLocation: GeneralNameProperty.Builder.() -> Unit)

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      public fun accessMethod(accessMethod: IResolvable)

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      public fun accessMethod(accessMethod: AccessMethodProperty)

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20b75f916b502e4fd62642433190cfbf1527eebbacdd86547ac494a10c71f682")
      public fun accessMethod(accessMethod: AccessMethodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.builder()

      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      override fun accessLocation(accessLocation: IResolvable) {
        cdkBuilder.accessLocation(accessLocation.let(IResolvable::unwrap))
      }

      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      override fun accessLocation(accessLocation: GeneralNameProperty) {
        cdkBuilder.accessLocation(accessLocation.let(GeneralNameProperty::unwrap))
      }

      /**
       * @param accessLocation The location of `AccessDescription` information. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5a597013ed07b1773f4061cf6b689bdab60e580241398175d0e17b064edaa9")
      override fun accessLocation(accessLocation: GeneralNameProperty.Builder.() -> Unit): Unit =
          accessLocation(GeneralNameProperty(accessLocation))

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      override fun accessMethod(accessMethod: IResolvable) {
        cdkBuilder.accessMethod(accessMethod.let(IResolvable::unwrap))
      }

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      override fun accessMethod(accessMethod: AccessMethodProperty) {
        cdkBuilder.accessMethod(accessMethod.let(AccessMethodProperty::unwrap))
      }

      /**
       * @param accessMethod The type and format of `AccessDescription` information. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20b75f916b502e4fd62642433190cfbf1527eebbacdd86547ac494a10c71f682")
      override fun accessMethod(accessMethod: AccessMethodProperty.Builder.() -> Unit): Unit =
          accessMethod(AccessMethodProperty(accessMethod))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty,
    ) : CdkObject(cdkObject), AccessDescriptionProperty {
      /**
       * The location of `AccessDescription` information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html#cfn-acmpca-certificateauthority-accessdescription-accesslocation)
       */
      override fun accessLocation(): Any = unwrap(this).getAccessLocation()

      /**
       * The type and format of `AccessDescription` information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html#cfn-acmpca-certificateauthority-accessdescription-accessmethod)
       */
      override fun accessMethod(): Any = unwrap(this).getAccessMethod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty):
          AccessDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessDescriptionProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty
    }
  }

  public interface KeyUsageProperty {
    /**
     * Key can be used to sign CRLs.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-crlsign)
     */
    public fun crlSign(): Any? = unwrap(this).getCrlSign()

    /**
     * Key can be used to decipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-dataencipherment)
     */
    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    /**
     * Key can be used only to decipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-decipheronly)
     */
    public fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

    /**
     * Key can be used for digital signing.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-digitalsignature)
     */
    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    /**
     * Key can be used only to encipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-encipheronly)
     */
    public fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

    /**
     * Key can be used in a key-agreement protocol.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keyagreement)
     */
    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    /**
     * Key can be used to sign certificates.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keycertsign)
     */
    public fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

    /**
     * Key can be used to encipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keyencipherment)
     */
    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    /**
     * Key can be used for non-repudiation.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-nonrepudiation)
     */
    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    /**
     * A builder for [KeyUsageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      public fun crlSign(crlSign: Boolean)

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      public fun crlSign(crlSign: IResolvable)

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      public fun dataEncipherment(dataEncipherment: Boolean)

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      public fun dataEncipherment(dataEncipherment: IResolvable)

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      public fun decipherOnly(decipherOnly: Boolean)

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      public fun decipherOnly(decipherOnly: IResolvable)

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      public fun digitalSignature(digitalSignature: Boolean)

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      public fun digitalSignature(digitalSignature: IResolvable)

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      public fun encipherOnly(encipherOnly: Boolean)

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      public fun encipherOnly(encipherOnly: IResolvable)

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      public fun keyAgreement(keyAgreement: Boolean)

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      public fun keyAgreement(keyAgreement: IResolvable)

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      public fun keyCertSign(keyCertSign: Boolean)

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      public fun keyCertSign(keyCertSign: IResolvable)

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      public fun keyEncipherment(keyEncipherment: Boolean)

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      public fun keyEncipherment(keyEncipherment: IResolvable)

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      public fun nonRepudiation(nonRepudiation: Boolean)

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      public fun nonRepudiation(nonRepudiation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty.builder()

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      override fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
      }

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      override fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign.let(IResolvable::unwrap))
      }

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      override fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
      }

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      override fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly.let(IResolvable::unwrap))
      }

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      override fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
      }

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      override fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly.let(IResolvable::unwrap))
      }

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      override fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
      }

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      override fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign.let(IResolvable::unwrap))
      }

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      override fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
      }

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      override fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      override fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
      }

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      override fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty,
    ) : CdkObject(cdkObject), KeyUsageProperty {
      /**
       * Key can be used to sign CRLs.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-crlsign)
       */
      override fun crlSign(): Any? = unwrap(this).getCrlSign()

      /**
       * Key can be used to decipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-dataencipherment)
       */
      override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      /**
       * Key can be used only to decipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-decipheronly)
       */
      override fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

      /**
       * Key can be used for digital signing.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-digitalsignature)
       */
      override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      /**
       * Key can be used only to encipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-encipheronly)
       */
      override fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

      /**
       * Key can be used in a key-agreement protocol.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keyagreement)
       */
      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      /**
       * Key can be used to sign certificates.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keycertsign)
       */
      override fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

      /**
       * Key can be used to encipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-keyencipherment)
       */
      override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      /**
       * Key can be used for non-repudiation.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html#cfn-acmpca-certificateauthority-keyusage-nonrepudiation)
       */
      override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty
    }
  }

  public interface CsrExtensionsProperty {
    /**
     * Indicates the purpose of the certificate and of the key contained in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html#cfn-acmpca-certificateauthority-csrextensions-keyusage)
     */
    public fun keyUsage(): Any? = unwrap(this).getKeyUsage()

    /**
     * For CA certificates, provides a path to additional information pertaining to the CA, such as
     * revocation and policy.
     *
     * For more information, see [Subject Information
     * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
     * in RFC 5280.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html#cfn-acmpca-certificateauthority-csrextensions-subjectinformationaccess)
     */
    public fun subjectInformationAccess(): Any? = unwrap(this).getSubjectInformationAccess()

    /**
     * A builder for [CsrExtensionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      public fun keyUsage(keyUsage: IResolvable)

      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      public fun keyUsage(keyUsage: KeyUsageProperty)

      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2eec907f4ab3f8f3fe73d3fa8e50c0be7a1ced4cf16db0702e97fb00670a2812")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      public fun subjectInformationAccess(subjectInformationAccess: IResolvable)

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      public fun subjectInformationAccess(subjectInformationAccess: List<Any>)

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      public fun subjectInformationAccess(vararg subjectInformationAccess: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty.builder()

      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      /**
       * @param keyUsage Indicates the purpose of the certificate and of the key contained in the
       * certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2eec907f4ab3f8f3fe73d3fa8e50c0be7a1ced4cf16db0702e97fb00670a2812")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      override fun subjectInformationAccess(subjectInformationAccess: IResolvable) {
        cdkBuilder.subjectInformationAccess(subjectInformationAccess.let(IResolvable::unwrap))
      }

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      override fun subjectInformationAccess(subjectInformationAccess: List<Any>) {
        cdkBuilder.subjectInformationAccess(subjectInformationAccess)
      }

      /**
       * @param subjectInformationAccess For CA certificates, provides a path to additional
       * information pertaining to the CA, such as revocation and policy.
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       */
      override fun subjectInformationAccess(vararg subjectInformationAccess: Any): Unit =
          subjectInformationAccess(subjectInformationAccess.toList())

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty,
    ) : CdkObject(cdkObject), CsrExtensionsProperty {
      /**
       * Indicates the purpose of the certificate and of the key contained in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html#cfn-acmpca-certificateauthority-csrextensions-keyusage)
       */
      override fun keyUsage(): Any? = unwrap(this).getKeyUsage()

      /**
       * For CA certificates, provides a path to additional information pertaining to the CA, such
       * as revocation and policy.
       *
       * For more information, see [Subject Information
       * Access](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.2.2)
       * in RFC 5280.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html#cfn-acmpca-certificateauthority-csrextensions-subjectinformationaccess)
       */
      override fun subjectInformationAccess(): Any? = unwrap(this).getSubjectInformationAccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsrExtensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty):
          CsrExtensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsrExtensionsProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty
    }
  }

  public interface RevocationConfigurationProperty {
    /**
     * Configuration of the certificate revocation list (CRL), if any, maintained by your private
     * CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html#cfn-acmpca-certificateauthority-revocationconfiguration-crlconfiguration)
     */
    public fun crlConfiguration(): Any? = unwrap(this).getCrlConfiguration()

    /**
     * Configuration of Online Certificate Status Protocol (OCSP) support, if any, maintained by
     * your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html#cfn-acmpca-certificateauthority-revocationconfiguration-ocspconfiguration)
     */
    public fun ocspConfiguration(): Any? = unwrap(this).getOcspConfiguration()

    /**
     * A builder for [RevocationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      public fun crlConfiguration(crlConfiguration: IResolvable)

      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      public fun crlConfiguration(crlConfiguration: CrlConfigurationProperty)

      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e08ccbba1511e80806605dced01835b990496478d99ab49fcf289028aa4592")
      public fun crlConfiguration(crlConfiguration: CrlConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      public fun ocspConfiguration(ocspConfiguration: IResolvable)

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      public fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty)

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cc9b7b1bbd7af3bd90deea00d53454783d53fa73e507b733560d62cdc208a0")
      public fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty.builder()

      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      override fun crlConfiguration(crlConfiguration: IResolvable) {
        cdkBuilder.crlConfiguration(crlConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      override fun crlConfiguration(crlConfiguration: CrlConfigurationProperty) {
        cdkBuilder.crlConfiguration(crlConfiguration.let(CrlConfigurationProperty::unwrap))
      }

      /**
       * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
       * maintained by your private CA.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e08ccbba1511e80806605dced01835b990496478d99ab49fcf289028aa4592")
      override fun crlConfiguration(crlConfiguration: CrlConfigurationProperty.Builder.() -> Unit):
          Unit = crlConfiguration(CrlConfigurationProperty(crlConfiguration))

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      override fun ocspConfiguration(ocspConfiguration: IResolvable) {
        cdkBuilder.ocspConfiguration(ocspConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      override fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty) {
        cdkBuilder.ocspConfiguration(ocspConfiguration.let(OcspConfigurationProperty::unwrap))
      }

      /**
       * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP)
       * support, if any, maintained by your private CA.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cc9b7b1bbd7af3bd90deea00d53454783d53fa73e507b733560d62cdc208a0")
      override
          fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty.Builder.() -> Unit):
          Unit = ocspConfiguration(OcspConfigurationProperty(ocspConfiguration))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty,
    ) : CdkObject(cdkObject), RevocationConfigurationProperty {
      /**
       * Configuration of the certificate revocation list (CRL), if any, maintained by your private
       * CA.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html#cfn-acmpca-certificateauthority-revocationconfiguration-crlconfiguration)
       */
      override fun crlConfiguration(): Any? = unwrap(this).getCrlConfiguration()

      /**
       * Configuration of Online Certificate Status Protocol (OCSP) support, if any, maintained by
       * your private CA.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html#cfn-acmpca-certificateauthority-revocationconfiguration-ocspconfiguration)
       */
      override fun ocspConfiguration(): Any? = unwrap(this).getOcspConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RevocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty):
          RevocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevocationConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty
    }
  }

  public interface SubjectProperty {
    /**
     * Fully qualified domain name (FQDN) associated with the certificate subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname)
     */
    public fun commonName(): String? = unwrap(this).getCommonName()

    /**
     * Two-digit code that specifies the country in which the certificate subject located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country)
     */
    public fun country(): String? = unwrap(this).getCountry()

    /**
     * Contains a sequence of one or more X.500 relative distinguished names (RDNs), each of which
     * consists of an object identifier (OID) and a value. For more information, see NIST’s definition
     * of [Object Identifier
     * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
     *
     *
     * Custom attributes cannot be used in combination with standard attributes.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-customattributes)
     */
    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    /**
     * Disambiguating information for the certificate subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier)
     */
    public fun distinguishedNameQualifier(): String? = unwrap(this).getDistinguishedNameQualifier()

    /**
     * Typically a qualifier appended to the name of an individual.
     *
     * Examples include Jr. for junior, Sr. for senior, and III for third.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier)
     */
    public fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

    /**
     * First name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname)
     */
    public fun givenName(): String? = unwrap(this).getGivenName()

    /**
     * Concatenation that typically contains the first letter of the GivenName, the first letter of
     * the middle name if one exists, and the first letter of the SurName.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials)
     */
    public fun initials(): String? = unwrap(this).getInitials()

    /**
     * The locality (such as a city or town) in which the certificate subject is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality)
     */
    public fun locality(): String? = unwrap(this).getLocality()

    /**
     * Legal name of the organization with which the certificate subject is affiliated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization)
     */
    public fun organization(): String? = unwrap(this).getOrganization()

    /**
     * A subdivision or unit of the organization (such as sales or finance) with which the
     * certificate subject is affiliated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit)
     */
    public fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

    /**
     * Typically a shortened version of a longer GivenName.
     *
     * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz,
     * or Eliza.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym)
     */
    public fun pseudonym(): String? = unwrap(this).getPseudonym()

    /**
     * The certificate serial number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber)
     */
    public fun serialNumber(): String? = unwrap(this).getSerialNumber()

    /**
     * State in which the subject of the certificate is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * Family name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname)
     */
    public fun surname(): String? = unwrap(this).getSurname()

    /**
     * A personal title such as Mr.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * A builder for [SubjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commonName Fully qualified domain name (FQDN) associated with the certificate
       * subject.
       */
      public fun commonName(commonName: String)

      /**
       * @param country Two-digit code that specifies the country in which the certificate subject
       * located.
       */
      public fun country(country: String)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(customAttributes: IResolvable)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(customAttributes: List<Any>)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(vararg customAttributes: Any)

      /**
       * @param distinguishedNameQualifier Disambiguating information for the certificate subject.
       */
      public fun distinguishedNameQualifier(distinguishedNameQualifier: String)

      /**
       * @param generationQualifier Typically a qualifier appended to the name of an individual.
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       */
      public fun generationQualifier(generationQualifier: String)

      /**
       * @param givenName First name.
       */
      public fun givenName(givenName: String)

      /**
       * @param initials Concatenation that typically contains the first letter of the GivenName,
       * the first letter of the middle name if one exists, and the first letter of the SurName.
       */
      public fun initials(initials: String)

      /**
       * @param locality The locality (such as a city or town) in which the certificate subject is
       * located.
       */
      public fun locality(locality: String)

      /**
       * @param organization Legal name of the organization with which the certificate subject is
       * affiliated.
       */
      public fun organization(organization: String)

      /**
       * @param organizationalUnit A subdivision or unit of the organization (such as sales or
       * finance) with which the certificate subject is affiliated.
       */
      public fun organizationalUnit(organizationalUnit: String)

      /**
       * @param pseudonym Typically a shortened version of a longer GivenName.
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       */
      public fun pseudonym(pseudonym: String)

      /**
       * @param serialNumber The certificate serial number.
       */
      public fun serialNumber(serialNumber: String)

      /**
       * @param state State in which the subject of the certificate is located.
       */
      public fun state(state: String)

      /**
       * @param surname Family name.
       */
      public fun surname(surname: String)

      /**
       * @param title A personal title such as Mr.
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty.builder()

      /**
       * @param commonName Fully qualified domain name (FQDN) associated with the certificate
       * subject.
       */
      override fun commonName(commonName: String) {
        cdkBuilder.commonName(commonName)
      }

      /**
       * @param country Two-digit code that specifies the country in which the certificate subject
       * located.
       */
      override fun country(country: String) {
        cdkBuilder.country(country)
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes)
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(vararg customAttributes: Any): Unit =
          customAttributes(customAttributes.toList())

      /**
       * @param distinguishedNameQualifier Disambiguating information for the certificate subject.
       */
      override fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
        cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
      }

      /**
       * @param generationQualifier Typically a qualifier appended to the name of an individual.
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       */
      override fun generationQualifier(generationQualifier: String) {
        cdkBuilder.generationQualifier(generationQualifier)
      }

      /**
       * @param givenName First name.
       */
      override fun givenName(givenName: String) {
        cdkBuilder.givenName(givenName)
      }

      /**
       * @param initials Concatenation that typically contains the first letter of the GivenName,
       * the first letter of the middle name if one exists, and the first letter of the SurName.
       */
      override fun initials(initials: String) {
        cdkBuilder.initials(initials)
      }

      /**
       * @param locality The locality (such as a city or town) in which the certificate subject is
       * located.
       */
      override fun locality(locality: String) {
        cdkBuilder.locality(locality)
      }

      /**
       * @param organization Legal name of the organization with which the certificate subject is
       * affiliated.
       */
      override fun organization(organization: String) {
        cdkBuilder.organization(organization)
      }

      /**
       * @param organizationalUnit A subdivision or unit of the organization (such as sales or
       * finance) with which the certificate subject is affiliated.
       */
      override fun organizationalUnit(organizationalUnit: String) {
        cdkBuilder.organizationalUnit(organizationalUnit)
      }

      /**
       * @param pseudonym Typically a shortened version of a longer GivenName.
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       */
      override fun pseudonym(pseudonym: String) {
        cdkBuilder.pseudonym(pseudonym)
      }

      /**
       * @param serialNumber The certificate serial number.
       */
      override fun serialNumber(serialNumber: String) {
        cdkBuilder.serialNumber(serialNumber)
      }

      /**
       * @param state State in which the subject of the certificate is located.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param surname Family name.
       */
      override fun surname(surname: String) {
        cdkBuilder.surname(surname)
      }

      /**
       * @param title A personal title such as Mr.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty,
    ) : CdkObject(cdkObject), SubjectProperty {
      /**
       * Fully qualified domain name (FQDN) associated with the certificate subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname)
       */
      override fun commonName(): String? = unwrap(this).getCommonName()

      /**
       * Two-digit code that specifies the country in which the certificate subject located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country)
       */
      override fun country(): String? = unwrap(this).getCountry()

      /**
       * Contains a sequence of one or more X.500 relative distinguished names (RDNs), each of which
       * consists of an object identifier (OID) and a value. For more information, see NIST’s
       * definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       *
       * Custom attributes cannot be used in combination with standard attributes.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-customattributes)
       */
      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      /**
       * Disambiguating information for the certificate subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier)
       */
      override fun distinguishedNameQualifier(): String? =
          unwrap(this).getDistinguishedNameQualifier()

      /**
       * Typically a qualifier appended to the name of an individual.
       *
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier)
       */
      override fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

      /**
       * First name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname)
       */
      override fun givenName(): String? = unwrap(this).getGivenName()

      /**
       * Concatenation that typically contains the first letter of the GivenName, the first letter
       * of the middle name if one exists, and the first letter of the SurName.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials)
       */
      override fun initials(): String? = unwrap(this).getInitials()

      /**
       * The locality (such as a city or town) in which the certificate subject is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality)
       */
      override fun locality(): String? = unwrap(this).getLocality()

      /**
       * Legal name of the organization with which the certificate subject is affiliated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization)
       */
      override fun organization(): String? = unwrap(this).getOrganization()

      /**
       * A subdivision or unit of the organization (such as sales or finance) with which the
       * certificate subject is affiliated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit)
       */
      override fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

      /**
       * Typically a shortened version of a longer GivenName.
       *
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym)
       */
      override fun pseudonym(): String? = unwrap(this).getPseudonym()

      /**
       * The certificate serial number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber)
       */
      override fun serialNumber(): String? = unwrap(this).getSerialNumber()

      /**
       * State in which the subject of the certificate is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * Family name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname)
       */
      override fun surname(): String? = unwrap(this).getSurname()

      /**
       * A personal title such as Mr.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title)
       */
      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty):
          SubjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty
    }
  }

  public interface AccessMethodProperty {
    /**
     * Specifies the `AccessMethod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html#cfn-acmpca-certificateauthority-accessmethod-accessmethodtype)
     */
    public fun accessMethodType(): String? = unwrap(this).getAccessMethodType()

    /**
     * An object identifier (OID) specifying the `AccessMethod` .
     *
     * The OID must satisfy the regular expression shown below. For more information, see NIST's
     * definition of [Object Identifier
     * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html#cfn-acmpca-certificateauthority-accessmethod-customobjectidentifier)
     */
    public fun customObjectIdentifier(): String? = unwrap(this).getCustomObjectIdentifier()

    /**
     * A builder for [AccessMethodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessMethodType Specifies the `AccessMethod` .
       */
      public fun accessMethodType(accessMethodType: String)

      /**
       * @param customObjectIdentifier An object identifier (OID) specifying the `AccessMethod` .
       * The OID must satisfy the regular expression shown below. For more information, see NIST's
       * definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       */
      public fun customObjectIdentifier(customObjectIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty.builder()

      /**
       * @param accessMethodType Specifies the `AccessMethod` .
       */
      override fun accessMethodType(accessMethodType: String) {
        cdkBuilder.accessMethodType(accessMethodType)
      }

      /**
       * @param customObjectIdentifier An object identifier (OID) specifying the `AccessMethod` .
       * The OID must satisfy the regular expression shown below. For more information, see NIST's
       * definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       */
      override fun customObjectIdentifier(customObjectIdentifier: String) {
        cdkBuilder.customObjectIdentifier(customObjectIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty,
    ) : CdkObject(cdkObject), AccessMethodProperty {
      /**
       * Specifies the `AccessMethod` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html#cfn-acmpca-certificateauthority-accessmethod-accessmethodtype)
       */
      override fun accessMethodType(): String? = unwrap(this).getAccessMethodType()

      /**
       * An object identifier (OID) specifying the `AccessMethod` .
       *
       * The OID must satisfy the regular expression shown below. For more information, see NIST's
       * definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html#cfn-acmpca-certificateauthority-accessmethod-customobjectidentifier)
       */
      override fun customObjectIdentifier(): String? = unwrap(this).getCustomObjectIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty):
          AccessMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessMethodProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty
    }
  }

  public interface CrlConfigurationProperty {
    /**
     * Configures the default behavior of the CRL Distribution Point extension for certificates
     * issued by your CA.
     *
     * If this field is not provided, then the CRL Distribution Point extension will be present and
     * contain the default CRL URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-crldistributionpointextensionconfiguration)
     */
    public fun crlDistributionPointExtensionConfiguration(): Any? =
        unwrap(this).getCrlDistributionPointExtensionConfiguration()

    /**
     * Name inserted into the certificate *CRL Distribution Points* extension that enables the use
     * of an alias for the CRL distribution point.
     *
     * Use this value if you don't want the name of your S3 bucket to be public.
     *
     *
     * The content of a Canonical Name (CNAME) record must conform to
     * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on the
     * use of special characters in URIs. Additionally, the value of the CNAME must not include a
     * protocol prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname)
     */
    public fun customCname(): String? = unwrap(this).getCustomCname()

    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     *
     * You can use this value to enable certificate revocation for a new CA when you call the
     * `CreateCertificateAuthority` operation or for an existing CA when you call the
     * `UpdateCertificateAuthority` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Validity period of the CRL in days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays)
     */
    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    /**
     * Name of the S3 bucket that contains the CRL.
     *
     * If you do not provide a value for the *CustomCname* argument, the name of your S3 bucket is
     * placed into the *CRL Distribution Points* extension of the issued certificate. You can change
     * the name of your bucket by calling the
     * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
     * operation. You must specify a [bucket
     * policy](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-policies)
     * that allows AWS Private CA to write the CRL to your bucket.
     *
     *
     * The `S3BucketName` parameter must conform to the [S3 bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3
     * bucket.
     *
     * If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you choose
     * BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and your PKI
     * clients may need an alternative method of access.
     *
     * If no value is specified, the default is PUBLIC_READ.
     *
     * *Note:* This default can cause CA creation to fail in some circumstances. If you have have
     * enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the
     * value of this parameter as `BUCKET_OWNER_FULL_CONTROL` , and not doing so results in an error.
     * If you have disabled BPA in S3, then you can specify either `BUCKET_OWNER_FULL_CONTROL` or
     * `PUBLIC_READ` as the value.
     *
     * For more information, see [Blocking public access to the S3
     * bucket](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-bpa) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3objectacl)
     */
    public fun s3ObjectAcl(): String? = unwrap(this).getS3ObjectAcl()

    /**
     * A builder for [CrlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: IResolvable)

      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty)

      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b3eddadee92703cdbb0776ac5a510f3d85f553de3e80da8cb9947358a4eea")
      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param customCname Name inserted into the certificate *CRL Distribution Points* extension
       * that enables the use of an alias for the CRL distribution point.
       * Use this value if you don't want the name of your S3 bucket to be public.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       */
      public fun customCname(customCname: String)

      /**
       * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
       * enabled.
       * You can use this value to enable certificate revocation for a new CA when you call the
       * `CreateCertificateAuthority` operation or for an existing CA when you call the
       * `UpdateCertificateAuthority` operation.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
       * enabled.
       * You can use this value to enable certificate revocation for a new CA when you call the
       * `CreateCertificateAuthority` operation or for an existing CA when you call the
       * `UpdateCertificateAuthority` operation.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param expirationInDays Validity period of the CRL in days.
       */
      public fun expirationInDays(expirationInDays: Number)

      /**
       * @param s3BucketName Name of the S3 bucket that contains the CRL.
       * If you do not provide a value for the *CustomCname* argument, the name of your S3 bucket is
       * placed into the *CRL Distribution Points* extension of the issued certificate. You can change
       * the name of your bucket by calling the
       * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
       * operation. You must specify a [bucket
       * policy](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-policies)
       * that allows AWS Private CA to write the CRL to your bucket.
       *
       *
       * The `S3BucketName` parameter must conform to the [S3 bucket naming
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3ObjectAcl Determines whether the CRL will be publicly readable or privately held
       * in the CRL Amazon S3 bucket.
       * If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you
       * choose BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and
       * your PKI clients may need an alternative method of access.
       *
       * If no value is specified, the default is PUBLIC_READ.
       *
       * *Note:* This default can cause CA creation to fail in some circumstances. If you have have
       * enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the
       * value of this parameter as `BUCKET_OWNER_FULL_CONTROL` , and not doing so results in an error.
       * If you have disabled BPA in S3, then you can specify either `BUCKET_OWNER_FULL_CONTROL` or
       * `PUBLIC_READ` as the value.
       *
       * For more information, see [Blocking public access to the S3
       * bucket](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-bpa) .
       */
      public fun s3ObjectAcl(s3ObjectAcl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty.builder()

      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: IResolvable) {
        cdkBuilder.crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty) {
        cdkBuilder.crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration.let(CrlDistributionPointExtensionConfigurationProperty::unwrap))
      }

      /**
       * @param crlDistributionPointExtensionConfiguration Configures the default behavior of the
       * CRL Distribution Point extension for certificates issued by your CA.
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b3eddadee92703cdbb0776ac5a510f3d85f553de3e80da8cb9947358a4eea")
      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty.Builder.() -> Unit):
          Unit =
          crlDistributionPointExtensionConfiguration(CrlDistributionPointExtensionConfigurationProperty(crlDistributionPointExtensionConfiguration))

      /**
       * @param customCname Name inserted into the certificate *CRL Distribution Points* extension
       * that enables the use of an alias for the CRL distribution point.
       * Use this value if you don't want the name of your S3 bucket to be public.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       */
      override fun customCname(customCname: String) {
        cdkBuilder.customCname(customCname)
      }

      /**
       * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
       * enabled.
       * You can use this value to enable certificate revocation for a new CA when you call the
       * `CreateCertificateAuthority` operation or for an existing CA when you call the
       * `UpdateCertificateAuthority` operation.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
       * enabled.
       * You can use this value to enable certificate revocation for a new CA when you call the
       * `CreateCertificateAuthority` operation or for an existing CA when you call the
       * `UpdateCertificateAuthority` operation.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param expirationInDays Validity period of the CRL in days.
       */
      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      /**
       * @param s3BucketName Name of the S3 bucket that contains the CRL.
       * If you do not provide a value for the *CustomCname* argument, the name of your S3 bucket is
       * placed into the *CRL Distribution Points* extension of the issued certificate. You can change
       * the name of your bucket by calling the
       * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
       * operation. You must specify a [bucket
       * policy](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-policies)
       * that allows AWS Private CA to write the CRL to your bucket.
       *
       *
       * The `S3BucketName` parameter must conform to the [S3 bucket naming
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3ObjectAcl Determines whether the CRL will be publicly readable or privately held
       * in the CRL Amazon S3 bucket.
       * If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you
       * choose BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and
       * your PKI clients may need an alternative method of access.
       *
       * If no value is specified, the default is PUBLIC_READ.
       *
       * *Note:* This default can cause CA creation to fail in some circumstances. If you have have
       * enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the
       * value of this parameter as `BUCKET_OWNER_FULL_CONTROL` , and not doing so results in an error.
       * If you have disabled BPA in S3, then you can specify either `BUCKET_OWNER_FULL_CONTROL` or
       * `PUBLIC_READ` as the value.
       *
       * For more information, see [Blocking public access to the S3
       * bucket](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-bpa) .
       */
      override fun s3ObjectAcl(s3ObjectAcl: String) {
        cdkBuilder.s3ObjectAcl(s3ObjectAcl)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty,
    ) : CdkObject(cdkObject), CrlConfigurationProperty {
      /**
       * Configures the default behavior of the CRL Distribution Point extension for certificates
       * issued by your CA.
       *
       * If this field is not provided, then the CRL Distribution Point extension will be present
       * and contain the default CRL URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-crldistributionpointextensionconfiguration)
       */
      override fun crlDistributionPointExtensionConfiguration(): Any? =
          unwrap(this).getCrlDistributionPointExtensionConfiguration()

      /**
       * Name inserted into the certificate *CRL Distribution Points* extension that enables the use
       * of an alias for the CRL distribution point.
       *
       * Use this value if you don't want the name of your S3 bucket to be public.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname)
       */
      override fun customCname(): String? = unwrap(this).getCustomCname()

      /**
       * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
       *
       * You can use this value to enable certificate revocation for a new CA when you call the
       * `CreateCertificateAuthority` operation or for an existing CA when you call the
       * `UpdateCertificateAuthority` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Validity period of the CRL in days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays)
       */
      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      /**
       * Name of the S3 bucket that contains the CRL.
       *
       * If you do not provide a value for the *CustomCname* argument, the name of your S3 bucket is
       * placed into the *CRL Distribution Points* extension of the issued certificate. You can change
       * the name of your bucket by calling the
       * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
       * operation. You must specify a [bucket
       * policy](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-policies)
       * that allows AWS Private CA to write the CRL to your bucket.
       *
       *
       * The `S3BucketName` parameter must conform to the [S3 bucket naming
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3
       * bucket.
       *
       * If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you
       * choose BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and
       * your PKI clients may need an alternative method of access.
       *
       * If no value is specified, the default is PUBLIC_READ.
       *
       * *Note:* This default can cause CA creation to fail in some circumstances. If you have have
       * enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the
       * value of this parameter as `BUCKET_OWNER_FULL_CONTROL` , and not doing so results in an error.
       * If you have disabled BPA in S3, then you can specify either `BUCKET_OWNER_FULL_CONTROL` or
       * `PUBLIC_READ` as the value.
       *
       * For more information, see [Blocking public access to the S3
       * bucket](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-bpa) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3objectacl)
       */
      override fun s3ObjectAcl(): String? = unwrap(this).getS3ObjectAcl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty):
          CrlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrlConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty
    }
  }

  public interface CrlDistributionPointExtensionConfigurationProperty {
    /**
     * Configures whether the CRL Distribution Point extension should be populated with the default
     * URL to the CRL.
     *
     * If set to `true` , then the CDP extension will not be present in any certificates issued by
     * that CA unless otherwise specified through CSR or API passthrough.
     *
     *
     * Only set this if you have another way to distribute the CRL Distribution Points for
     * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
     *
     * This configuration cannot be enabled with a custom CNAME set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crldistributionpointextensionconfiguration.html#cfn-acmpca-certificateauthority-crldistributionpointextensionconfiguration-omitextension)
     */
    public fun omitExtension(): Any

    /**
     * A builder for [CrlDistributionPointExtensionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param omitExtension Configures whether the CRL Distribution Point extension should be
       * populated with the default URL to the CRL. 
       * If set to `true` , then the CDP extension will not be present in any certificates issued by
       * that CA unless otherwise specified through CSR or API passthrough.
       *
       *
       * Only set this if you have another way to distribute the CRL Distribution Points for
       * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
       *
       * This configuration cannot be enabled with a custom CNAME set.
       */
      public fun omitExtension(omitExtension: Boolean)

      /**
       * @param omitExtension Configures whether the CRL Distribution Point extension should be
       * populated with the default URL to the CRL. 
       * If set to `true` , then the CDP extension will not be present in any certificates issued by
       * that CA unless otherwise specified through CSR or API passthrough.
       *
       *
       * Only set this if you have another way to distribute the CRL Distribution Points for
       * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
       *
       * This configuration cannot be enabled with a custom CNAME set.
       */
      public fun omitExtension(omitExtension: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.builder()

      /**
       * @param omitExtension Configures whether the CRL Distribution Point extension should be
       * populated with the default URL to the CRL. 
       * If set to `true` , then the CDP extension will not be present in any certificates issued by
       * that CA unless otherwise specified through CSR or API passthrough.
       *
       *
       * Only set this if you have another way to distribute the CRL Distribution Points for
       * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
       *
       * This configuration cannot be enabled with a custom CNAME set.
       */
      override fun omitExtension(omitExtension: Boolean) {
        cdkBuilder.omitExtension(omitExtension)
      }

      /**
       * @param omitExtension Configures whether the CRL Distribution Point extension should be
       * populated with the default URL to the CRL. 
       * If set to `true` , then the CDP extension will not be present in any certificates issued by
       * that CA unless otherwise specified through CSR or API passthrough.
       *
       *
       * Only set this if you have another way to distribute the CRL Distribution Points for
       * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
       *
       * This configuration cannot be enabled with a custom CNAME set.
       */
      override fun omitExtension(omitExtension: IResolvable) {
        cdkBuilder.omitExtension(omitExtension.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty,
    ) : CdkObject(cdkObject), CrlDistributionPointExtensionConfigurationProperty {
      /**
       * Configures whether the CRL Distribution Point extension should be populated with the
       * default URL to the CRL.
       *
       * If set to `true` , then the CDP extension will not be present in any certificates issued by
       * that CA unless otherwise specified through CSR or API passthrough.
       *
       *
       * Only set this if you have another way to distribute the CRL Distribution Points for
       * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
       *
       * This configuration cannot be enabled with a custom CNAME set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crldistributionpointextensionconfiguration.html#cfn-acmpca-certificateauthority-crldistributionpointextensionconfiguration-omitextension)
       */
      override fun omitExtension(): Any = unwrap(this).getOmitExtension()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrlDistributionPointExtensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty):
          CrlDistributionPointExtensionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrlDistributionPointExtensionConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty
    }
  }

  public interface OcspConfigurationProperty {
    /**
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate
     * revocation status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html#cfn-acmpca-certificateauthority-ocspconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * By default, AWS Private CA injects an Amazon domain into certificates being validated by the
     * Online Certificate Status Protocol (OCSP).
     *
     * A customer can alternatively use this object to define a CNAME specifying a customized OCSP
     * domain.
     *
     *
     * The content of a Canonical Name (CNAME) record must conform to
     * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on the
     * use of special characters in URIs. Additionally, the value of the CNAME must not include a
     * protocol prefix such as "http://" or "https://".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html#cfn-acmpca-certificateauthority-ocspconfiguration-ocspcustomcname)
     */
    public fun ocspCustomCname(): String? = unwrap(this).getOcspCustomCname()

    /**
     * A builder for [OcspConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
       * validating certificate revocation status.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
       * validating certificate revocation status.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param ocspCustomCname By default, AWS Private CA injects an Amazon domain into
       * certificates being validated by the Online Certificate Status Protocol (OCSP).
       * A customer can alternatively use this object to define a CNAME specifying a customized OCSP
       * domain.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       */
      public fun ocspCustomCname(ocspCustomCname: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty.builder()

      /**
       * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
       * validating certificate revocation status.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
       * validating certificate revocation status.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param ocspCustomCname By default, AWS Private CA injects an Amazon domain into
       * certificates being validated by the Online Certificate Status Protocol (OCSP).
       * A customer can alternatively use this object to define a CNAME specifying a customized OCSP
       * domain.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       */
      override fun ocspCustomCname(ocspCustomCname: String) {
        cdkBuilder.ocspCustomCname(ocspCustomCname)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty,
    ) : CdkObject(cdkObject), OcspConfigurationProperty {
      /**
       * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating
       * certificate revocation status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html#cfn-acmpca-certificateauthority-ocspconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * By default, AWS Private CA injects an Amazon domain into certificates being validated by
       * the Online Certificate Status Protocol (OCSP).
       *
       * A customer can alternatively use this object to define a CNAME specifying a customized OCSP
       * domain.
       *
       *
       * The content of a Canonical Name (CNAME) record must conform to
       * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on
       * the use of special characters in URIs. Additionally, the value of the CNAME must not include a
       * protocol prefix such as "http://" or "https://".
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html#cfn-acmpca-certificateauthority-ocspconfiguration-ocspcustomcname)
       */
      override fun ocspCustomCname(): String? = unwrap(this).getOcspCustomCname()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcspConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty):
          OcspConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcspConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty
    }
  }

  public interface GeneralNameProperty {
    /**
     * Contains information about the certificate subject.
     *
     * The certificate can be one issued by your private certificate authority (CA) or it can be
     * your private CA certificate. The Subject field in the certificate identifies the entity that
     * owns or controls the public key in the certificate. The entity can be a user, computer, device,
     * or service. The Subject must contain an X.500 distinguished name (DN). A DN is a sequence of
     * relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN
     * must be unique for each entity, but your private CA can issue more than one certificate with the
     * same DN to the same entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-directoryname)
     */
    public fun directoryName(): Any? = unwrap(this).getDirectoryName()

    /**
     * Represents `GeneralName` as a DNS name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-dnsname)
     */
    public fun dnsName(): String? = unwrap(this).getDnsName()

    /**
     * Represents `GeneralName` as an `EdiPartyName` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-edipartyname)
     */
    public fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

    /**
     * Represents `GeneralName` as an IPv4 or IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-ipaddress)
     */
    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    /**
     * Represents `GeneralName` using an `OtherName` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-othername)
     */
    public fun otherName(): Any? = unwrap(this).getOtherName()

    /**
     * Represents `GeneralName` as an object identifier (OID).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-registeredid)
     */
    public fun registeredId(): String? = unwrap(this).getRegisteredId()

    /**
     * Represents `GeneralName` as an [RFC
     * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-rfc822name)
     */
    public fun rfc822Name(): String? = unwrap(this).getRfc822Name()

    /**
     * Represents `GeneralName` as a URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-uniformresourceidentifier)
     */
    public fun uniformResourceIdentifier(): String? = unwrap(this).getUniformResourceIdentifier()

    /**
     * A builder for [GeneralNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      public fun directoryName(directoryName: IResolvable)

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      public fun directoryName(directoryName: SubjectProperty)

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61005aaa2bf810d7111074131f5352858d75a129bb0188bf7efc61268a97422f")
      public fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit)

      /**
       * @param dnsName Represents `GeneralName` as a DNS name.
       */
      public fun dnsName(dnsName: String)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      public fun ediPartyName(ediPartyName: IResolvable)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("606f0642ac76285ab8808b7d7ee57f3ef364d63570bb212e71923cf7da7835c7")
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit)

      /**
       * @param ipAddress Represents `GeneralName` as an IPv4 or IPv6 address.
       */
      public fun ipAddress(ipAddress: String)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      public fun otherName(otherName: IResolvable)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      public fun otherName(otherName: OtherNameProperty)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cf63f0806fe92adb04a674f7b59871bd20f023fd0d1f22ca3aaf221887d7206")
      public fun otherName(otherName: OtherNameProperty.Builder.() -> Unit)

      /**
       * @param registeredId Represents `GeneralName` as an object identifier (OID).
       */
      public fun registeredId(registeredId: String)

      /**
       * @param rfc822Name Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       */
      public fun rfc822Name(rfc822Name: String)

      /**
       * @param uniformResourceIdentifier Represents `GeneralName` as a URI.
       */
      public fun uniformResourceIdentifier(uniformResourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty.builder()

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      override fun directoryName(directoryName: IResolvable) {
        cdkBuilder.directoryName(directoryName.let(IResolvable::unwrap))
      }

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      override fun directoryName(directoryName: SubjectProperty) {
        cdkBuilder.directoryName(directoryName.let(SubjectProperty::unwrap))
      }

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61005aaa2bf810d7111074131f5352858d75a129bb0188bf7efc61268a97422f")
      override fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit): Unit =
          directoryName(SubjectProperty(directoryName))

      /**
       * @param dnsName Represents `GeneralName` as a DNS name.
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      override fun ediPartyName(ediPartyName: IResolvable) {
        cdkBuilder.ediPartyName(ediPartyName.let(IResolvable::unwrap))
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      override fun ediPartyName(ediPartyName: EdiPartyNameProperty) {
        cdkBuilder.ediPartyName(ediPartyName.let(EdiPartyNameProperty::unwrap))
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("606f0642ac76285ab8808b7d7ee57f3ef364d63570bb212e71923cf7da7835c7")
      override fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit): Unit =
          ediPartyName(EdiPartyNameProperty(ediPartyName))

      /**
       * @param ipAddress Represents `GeneralName` as an IPv4 or IPv6 address.
       */
      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      override fun otherName(otherName: IResolvable) {
        cdkBuilder.otherName(otherName.let(IResolvable::unwrap))
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      override fun otherName(otherName: OtherNameProperty) {
        cdkBuilder.otherName(otherName.let(OtherNameProperty::unwrap))
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cf63f0806fe92adb04a674f7b59871bd20f023fd0d1f22ca3aaf221887d7206")
      override fun otherName(otherName: OtherNameProperty.Builder.() -> Unit): Unit =
          otherName(OtherNameProperty(otherName))

      /**
       * @param registeredId Represents `GeneralName` as an object identifier (OID).
       */
      override fun registeredId(registeredId: String) {
        cdkBuilder.registeredId(registeredId)
      }

      /**
       * @param rfc822Name Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       */
      override fun rfc822Name(rfc822Name: String) {
        cdkBuilder.rfc822Name(rfc822Name)
      }

      /**
       * @param uniformResourceIdentifier Represents `GeneralName` as a URI.
       */
      override fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
        cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty,
    ) : CdkObject(cdkObject), GeneralNameProperty {
      /**
       * Contains information about the certificate subject.
       *
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-directoryname)
       */
      override fun directoryName(): Any? = unwrap(this).getDirectoryName()

      /**
       * Represents `GeneralName` as a DNS name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-dnsname)
       */
      override fun dnsName(): String? = unwrap(this).getDnsName()

      /**
       * Represents `GeneralName` as an `EdiPartyName` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-edipartyname)
       */
      override fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

      /**
       * Represents `GeneralName` as an IPv4 or IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-ipaddress)
       */
      override fun ipAddress(): String? = unwrap(this).getIpAddress()

      /**
       * Represents `GeneralName` using an `OtherName` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-othername)
       */
      override fun otherName(): Any? = unwrap(this).getOtherName()

      /**
       * Represents `GeneralName` as an object identifier (OID).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-registeredid)
       */
      override fun registeredId(): String? = unwrap(this).getRegisteredId()

      /**
       * Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-rfc822name)
       */
      override fun rfc822Name(): String? = unwrap(this).getRfc822Name()

      /**
       * Represents `GeneralName` as a URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html#cfn-acmpca-certificateauthority-generalname-uniformresourceidentifier)
       */
      override fun uniformResourceIdentifier(): String? =
          unwrap(this).getUniformResourceIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty):
          GeneralNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty
    }
  }

  public interface CustomAttributeProperty {
    /**
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished
     * name (RDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html#cfn-acmpca-certificateauthority-customattribute-objectidentifier)
     */
    public fun objectIdentifier(): String

    /**
     * Specifies the attribute value of relative distinguished name (RDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html#cfn-acmpca-certificateauthority-customattribute-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
       * relative distinguished name (RDN). 
       */
      public fun objectIdentifier(objectIdentifier: String)

      /**
       * @param value Specifies the attribute value of relative distinguished name (RDN). 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty.builder()

      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
       * relative distinguished name (RDN). 
       */
      override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      /**
       * @param value Specifies the attribute value of relative distinguished name (RDN). 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty,
    ) : CdkObject(cdkObject), CustomAttributeProperty {
      /**
       * Specifies the object identifier (OID) of the attribute type of the relative distinguished
       * name (RDN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html#cfn-acmpca-certificateauthority-customattribute-objectidentifier)
       */
      override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      /**
       * Specifies the attribute value of relative distinguished name (RDN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html#cfn-acmpca-certificateauthority-customattribute-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty):
          CustomAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAttributeProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty
    }
  }
}
