@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
import software.amazon.awscdk.services.acmpca.CfnCertificateProps
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.amazon.awscdk.services.acmpca.CfnPermissionProps
import software.constructs.Construct

public object acmpca {
  /**
   * The `AWS::ACMPCA::Certificate` resource is used to issue a certificate using your private
   * certificate authority.
   *
   * For more information, see the
   * [IssueCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_IssueCertificate.html)
   * action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .certificateSigningRequest("certificateSigningRequest")
   * .signingAlgorithm("signingAlgorithm")
   * .validity(ValidityProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .apiPassthrough(ApiPassthroughProperty.builder()
   * .extensions(ExtensionsProperty.builder()
   * .certificatePolicies(List.of(PolicyInformationProperty.builder()
   * .certPolicyId("certPolicyId")
   * // the properties below are optional
   * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build()))
   * .build()))
   * .customExtensions(List.of(CustomExtensionProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * // the properties below are optional
   * .critical(false)
   * .build()))
   * .extendedKeyUsage(List.of(ExtendedKeyUsageProperty.builder()
   * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
   * .extendedKeyUsageType("extendedKeyUsageType")
   * .build()))
   * .keyUsage(KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build())
   * .subjectAlternativeNames(List.of(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build()))
   * .build())
   * .subject(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .build())
   * .templateArn("templateArn")
   * .validityNotBefore(ValidityProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html)
   */
  public inline fun cfnCertificate(
    scope: Construct,
    id: String,
    block: CfnCertificateDsl.() -> Unit = {},
  ): CfnCertificate {
    val builder = CfnCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains X.509 certificate information to be placed in an issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   *
   * If conflicting or duplicate certificate information is supplied from other sources, AWS Private
   * CA applies [order of operation
   * rules](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html#template-order-of-operations)
   * to determine what information is used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * ApiPassthroughProperty apiPassthroughProperty = ApiPassthroughProperty.builder()
   * .extensions(ExtensionsProperty.builder()
   * .certificatePolicies(List.of(PolicyInformationProperty.builder()
   * .certPolicyId("certPolicyId")
   * // the properties below are optional
   * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build()))
   * .build()))
   * .customExtensions(List.of(CustomExtensionProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * // the properties below are optional
   * .critical(false)
   * .build()))
   * .extendedKeyUsage(List.of(ExtendedKeyUsageProperty.builder()
   * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
   * .extendedKeyUsageType("extendedKeyUsageType")
   * .build()))
   * .keyUsage(KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build())
   * .subjectAlternativeNames(List.of(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build()))
   * .build())
   * .subject(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html)
   */
  public inline
      fun cfnCertificateApiPassthroughProperty(block: CfnCertificateApiPassthroughPropertyDsl.() -> Unit
      = {}): CfnCertificate.ApiPassthroughProperty {
    val builder = CfnCertificateApiPassthroughPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the `AWS::ACMPCA::CertificateAuthority` resource to create a private CA.
   *
   * Once the CA exists, you can use the `AWS::ACMPCA::Certificate` resource to issue a new CA
   * certificate. Alternatively, you can issue a CA certificate using an on-premises CA, and then use
   * the `AWS::ACMPCA::CertificateAuthorityActivation` resource to import the new CA certificate and
   * activate the CA.
   *
   *
   * Before removing a `AWS::ACMPCA::CertificateAuthority` resource from the CloudFormation stack,
   * disable the affected CA. Otherwise, the action will fail. You can disable the CA by removing its
   * associated `AWS::ACMPCA::CertificateAuthorityActivation` resource from CloudFormation.
   *
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
  public inline fun cfnCertificateAuthority(
    scope: Construct,
    id: String,
    block: CfnCertificateAuthorityDsl.() -> Unit = {},
  ): CfnCertificateAuthority {
    val builder = CfnCertificateAuthorityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides access information used by the `authorityInfoAccess` and `subjectInfoAccess`
   * extensions described in [RFC
   * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * AccessDescriptionProperty accessDescriptionProperty = AccessDescriptionProperty.builder()
   * .accessLocation(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build())
   * .accessMethod(AccessMethodProperty.builder()
   * .accessMethodType("accessMethodType")
   * .customObjectIdentifier("customObjectIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessdescription.html)
   */
  public inline
      fun cfnCertificateAuthorityAccessDescriptionProperty(block: CfnCertificateAuthorityAccessDescriptionPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.AccessDescriptionProperty {
    val builder = CfnCertificateAuthorityAccessDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes the type and format of extension access.
   *
   * Only one of `CustomObjectIdentifier` or `AccessMethodType` may be provided. Providing both
   * results in `InvalidArgsException` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * AccessMethodProperty accessMethodProperty = AccessMethodProperty.builder()
   * .accessMethodType("accessMethodType")
   * .customObjectIdentifier("customObjectIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html)
   */
  public inline
      fun cfnCertificateAuthorityAccessMethodProperty(block: CfnCertificateAuthorityAccessMethodPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.AccessMethodProperty {
    val builder = CfnCertificateAuthorityAccessMethodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::ACMPCA::CertificateAuthorityActivation` resource creates and installs a CA
   * certificate on a CA.
   *
   * If no status is specified, the `AWS::ACMPCA::CertificateAuthorityActivation` resource status
   * defaults to ACTIVE. Once the CA has a CA certificate installed, you can use the resource to toggle
   * the CA status field between `ACTIVE` and `DISABLED` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnCertificateAuthorityActivation cfnCertificateAuthorityActivation =
   * CfnCertificateAuthorityActivation.Builder.create(this, "MyCfnCertificateAuthorityActivation")
   * .certificate("certificate")
   * .certificateAuthorityArn("certificateAuthorityArn")
   * // the properties below are optional
   * .certificateChain("certificateChain")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html)
   */
  public inline fun cfnCertificateAuthorityActivation(
    scope: Construct,
    id: String,
    block: CfnCertificateAuthorityActivationDsl.() -> Unit = {},
  ): CfnCertificateAuthorityActivation {
    val builder = CfnCertificateAuthorityActivationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCertificateAuthorityActivation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnCertificateAuthorityActivationProps cfnCertificateAuthorityActivationProps =
   * CfnCertificateAuthorityActivationProps.builder()
   * .certificate("certificate")
   * .certificateAuthorityArn("certificateAuthorityArn")
   * // the properties below are optional
   * .certificateChain("certificateChain")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html)
   */
  public inline
      fun cfnCertificateAuthorityActivationProps(block: CfnCertificateAuthorityActivationPropsDsl.() -> Unit
      = {}): CfnCertificateAuthorityActivationProps {
    val builder = CfnCertificateAuthorityActivationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains configuration information for a certificate revocation list (CRL).
   *
   * Your private certificate authority (CA) creates base CRLs. Delta CRLs are not supported. You
   * can enable CRLs for your new or an existing private CA by setting the *Enabled* parameter to
   * `true` . Your private CA writes CRLs to an S3 bucket that you specify in the *S3BucketName*
   * parameter. You can hide the name of your bucket by specifying a value for the *CustomCname*
   * parameter. Your private CA copies the CNAME or the S3 bucket name to the *CRL Distribution Points*
   * extension of each certificate it issues. Your S3 bucket policy must give write permission to AWS
   * Private CA.
   *
   * AWS Private CA assets that are stored in Amazon S3 can be protected with encryption. For more
   * information, see [Encrypting Your
   * CRLs](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#crl-encryption) .
   *
   * Your private CA uses the value in the *ExpirationInDays* parameter to calculate the
   * *nextUpdate* field in the CRL. The CRL is refreshed prior to a certificate's expiration date or
   * when a certificate is revoked. When a certificate is revoked, it appears in the CRL until the
   * certificate expires, and then in one additional CRL after expiration, and it always appears in the
   * audit report.
   *
   * A CRL is typically updated approximately 30 minutes after a certificate is revoked. If for any
   * reason a CRL update fails, AWS Private CA makes further attempts every 15 minutes.
   *
   * CRLs contain the following fields:
   *
   * * *Version* : The current version number defined in RFC 5280 is V2. The integer value is 0x1.
   * * *Signature Algorithm* : The name of the algorithm used to sign the CRL.
   * * *Issuer* : The X.500 distinguished name of your private CA that issued the CRL.
   * * *Last Update* : The issue date and time of this CRL.
   * * *Next Update* : The day and time by which the next CRL will be issued.
   * * *Revoked Certificates* : List of revoked certificates. Each list item contains the following
   * information.
   * * *Serial Number* : The serial number, in hexadecimal format, of the revoked certificate.
   * * *Revocation Date* : Date and time the certificate was revoked.
   * * *CRL Entry Extensions* : Optional extensions for the CRL entry.
   * * *X509v3 CRL Reason Code* : Reason the certificate was revoked.
   * * *CRL Extensions* : Optional extensions for the CRL.
   * * *X509v3 Authority Key Identifier* : Identifies the public key associated with the private key
   * used to sign the certificate.
   * * *X509v3 CRL Number:* : Decimal sequence number for the CRL.
   * * *Signature Algorithm* : Algorithm used by your private CA to sign the CRL.
   * * *Signature Value* : Signature computed over the CRL.
   *
   * Certificate revocation lists created by AWS Private CA are DER-encoded. You can use the
   * following OpenSSL command to list a CRL.
   *
   * `openssl crl -inform DER -text -in *crl_path* -noout`
   *
   * For more information, see [Planning a certificate revocation list
   * (CRL)](https://docs.aws.amazon.com/privateca/latest/userguide/crl-planning.html) in the *AWS
   * Private Certificate Authority User Guide*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CrlConfigurationProperty crlConfigurationProperty = CrlConfigurationProperty.builder()
   * .customCname("customCname")
   * .enabled(false)
   * .expirationInDays(123)
   * .s3BucketName("s3BucketName")
   * .s3ObjectAcl("s3ObjectAcl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html)
   */
  public inline
      fun cfnCertificateAuthorityCrlConfigurationProperty(block: CfnCertificateAuthorityCrlConfigurationPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.CrlConfigurationProperty {
    val builder = CfnCertificateAuthorityCrlConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes the certificate extensions to be added to the certificate signing request (CSR).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CsrExtensionsProperty csrExtensionsProperty = CsrExtensionsProperty.builder()
   * .keyUsage(KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build())
   * .subjectInformationAccess(List.of(AccessDescriptionProperty.builder()
   * .accessLocation(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build())
   * .accessMethod(AccessMethodProperty.builder()
   * .accessMethodType("accessMethodType")
   * .customObjectIdentifier("customObjectIdentifier")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-csrextensions.html)
   */
  public inline
      fun cfnCertificateAuthorityCsrExtensionsProperty(block: CfnCertificateAuthorityCsrExtensionsPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.CsrExtensionsProperty {
    val builder = CfnCertificateAuthorityCsrExtensionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines the X.500 relative distinguished name (RDN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CustomAttributeProperty customAttributeProperty = CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-customattribute.html)
   */
  public inline
      fun cfnCertificateAuthorityCustomAttributeProperty(block: CfnCertificateAuthorityCustomAttributePropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.CustomAttributeProperty {
    val builder = CfnCertificateAuthorityCustomAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes an Electronic Data Interchange (EDI) entity as described in as defined in [Subject
   * Alternative Name](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) in
   * RFC 5280.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * EdiPartyNameProperty ediPartyNameProperty = EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html)
   */
  public inline
      fun cfnCertificateAuthorityEdiPartyNameProperty(block: CfnCertificateAuthorityEdiPartyNamePropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.EdiPartyNameProperty {
    val builder = CfnCertificateAuthorityEdiPartyNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes an ASN.1 X.400 `GeneralName` as defined in [RFC
   * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) . Only one of the
   * following naming options should be provided. Providing more than one option results in an
   * `InvalidArgsException` error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * GeneralNameProperty generalNameProperty = GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-generalname.html)
   */
  public inline
      fun cfnCertificateAuthorityGeneralNameProperty(block: CfnCertificateAuthorityGeneralNamePropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.GeneralNameProperty {
    val builder = CfnCertificateAuthorityGeneralNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines one or more purposes for which the key contained in the certificate can be used.
   *
   * Default value for each option is false.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * KeyUsageProperty keyUsageProperty = KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-keyusage.html)
   */
  public inline
      fun cfnCertificateAuthorityKeyUsageProperty(block: CfnCertificateAuthorityKeyUsagePropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.KeyUsageProperty {
    val builder = CfnCertificateAuthorityKeyUsagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information to enable and configure Online Certificate Status Protocol (OCSP) for
   * validating certificate revocation status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * OcspConfigurationProperty ocspConfigurationProperty = OcspConfigurationProperty.builder()
   * .enabled(false)
   * .ocspCustomCname("ocspCustomCname")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html)
   */
  public inline
      fun cfnCertificateAuthorityOcspConfigurationProperty(block: CfnCertificateAuthorityOcspConfigurationPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.OcspConfigurationProperty {
    val builder = CfnCertificateAuthorityOcspConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a custom ASN.1 X.400 `GeneralName` using an object identifier (OID) and value. The OID
   * must satisfy the regular expression shown below. For more information, see NIST's definition of
   * [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * OtherNameProperty otherNameProperty = OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-othername.html)
   */
  public inline
      fun cfnCertificateAuthorityOtherNameProperty(block: CfnCertificateAuthorityOtherNamePropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.OtherNameProperty {
    val builder = CfnCertificateAuthorityOtherNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

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
  public inline fun cfnCertificateAuthorityProps(block: CfnCertificateAuthorityPropsDsl.() -> Unit =
      {}): CfnCertificateAuthorityProps {
    val builder = CfnCertificateAuthorityPropsDsl()
    builder.apply(block)
    return builder.build()
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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * RevocationConfigurationProperty revocationConfigurationProperty =
   * RevocationConfigurationProperty.builder()
   * .crlConfiguration(CrlConfigurationProperty.builder()
   * .customCname("customCname")
   * .enabled(false)
   * .expirationInDays(123)
   * .s3BucketName("s3BucketName")
   * .s3ObjectAcl("s3ObjectAcl")
   * .build())
   * .ocspConfiguration(OcspConfigurationProperty.builder()
   * .enabled(false)
   * .ocspCustomCname("ocspCustomCname")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html)
   */
  public inline
      fun cfnCertificateAuthorityRevocationConfigurationProperty(block: CfnCertificateAuthorityRevocationConfigurationPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.RevocationConfigurationProperty {
    val builder = CfnCertificateAuthorityRevocationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * ASN1 subject for the certificate authority.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * SubjectProperty subjectProperty = SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html)
   */
  public inline
      fun cfnCertificateAuthoritySubjectProperty(block: CfnCertificateAuthoritySubjectPropertyDsl.() -> Unit
      = {}): CfnCertificateAuthority.SubjectProperty {
    val builder = CfnCertificateAuthoritySubjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines the X.500 relative distinguished name (RDN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CustomAttributeProperty customAttributeProperty = CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customattribute.html)
   */
  public inline
      fun cfnCertificateCustomAttributeProperty(block: CfnCertificateCustomAttributePropertyDsl.() -> Unit
      = {}): CfnCertificate.CustomAttributeProperty {
    val builder = CfnCertificateCustomAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the X.509 extension information for a certificate.
   *
   * Extensions present in `CustomExtensions` follow the `ApiPassthrough` [template
   * rules](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html#template-order-of-operations)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CustomExtensionProperty customExtensionProperty = CustomExtensionProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * // the properties below are optional
   * .critical(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html)
   */
  public inline
      fun cfnCertificateCustomExtensionProperty(block: CfnCertificateCustomExtensionPropertyDsl.() -> Unit
      = {}): CfnCertificate.CustomExtensionProperty {
    val builder = CfnCertificateCustomExtensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes an Electronic Data Interchange (EDI) entity as described in as defined in [Subject
   * Alternative Name](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) in
   * RFC 5280.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * EdiPartyNameProperty ediPartyNameProperty = EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-edipartyname.html)
   */
  public inline
      fun cfnCertificateEdiPartyNameProperty(block: CfnCertificateEdiPartyNamePropertyDsl.() -> Unit
      = {}): CfnCertificate.EdiPartyNameProperty {
    val builder = CfnCertificateEdiPartyNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies additional purposes for which the certified public key may be used other than basic
   * purposes indicated in the `KeyUsage` extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * ExtendedKeyUsageProperty extendedKeyUsageProperty = ExtendedKeyUsageProperty.builder()
   * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
   * .extendedKeyUsageType("extendedKeyUsageType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html)
   */
  public inline
      fun cfnCertificateExtendedKeyUsageProperty(block: CfnCertificateExtendedKeyUsagePropertyDsl.() -> Unit
      = {}): CfnCertificate.ExtendedKeyUsageProperty {
    val builder = CfnCertificateExtendedKeyUsagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains X.509 extension information for a certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * ExtensionsProperty extensionsProperty = ExtensionsProperty.builder()
   * .certificatePolicies(List.of(PolicyInformationProperty.builder()
   * .certPolicyId("certPolicyId")
   * // the properties below are optional
   * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build()))
   * .build()))
   * .customExtensions(List.of(CustomExtensionProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * // the properties below are optional
   * .critical(false)
   * .build()))
   * .extendedKeyUsage(List.of(ExtendedKeyUsageProperty.builder()
   * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
   * .extendedKeyUsageType("extendedKeyUsageType")
   * .build()))
   * .keyUsage(KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build())
   * .subjectAlternativeNames(List.of(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html)
   */
  public inline
      fun cfnCertificateExtensionsProperty(block: CfnCertificateExtensionsPropertyDsl.() -> Unit =
      {}): CfnCertificate.ExtensionsProperty {
    val builder = CfnCertificateExtensionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes an ASN.1 X.400 `GeneralName` as defined in [RFC
   * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) . Only one of the
   * following naming options should be provided. Providing more than one option results in an
   * `InvalidArgsException` error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * GeneralNameProperty generalNameProperty = GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html)
   */
  public inline
      fun cfnCertificateGeneralNameProperty(block: CfnCertificateGeneralNamePropertyDsl.() -> Unit =
      {}): CfnCertificate.GeneralNameProperty {
    val builder = CfnCertificateGeneralNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines one or more purposes for which the key contained in the certificate can be used.
   *
   * Default value for each option is false.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * KeyUsageProperty keyUsageProperty = KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html)
   */
  public inline
      fun cfnCertificateKeyUsageProperty(block: CfnCertificateKeyUsagePropertyDsl.() -> Unit = {}):
      CfnCertificate.KeyUsageProperty {
    val builder = CfnCertificateKeyUsagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a custom ASN.1 X.400 `GeneralName` using an object identifier (OID) and value. The OID
   * must satisfy the regular expression shown below. For more information, see NIST's definition of
   * [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * OtherNameProperty otherNameProperty = OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html)
   */
  public inline
      fun cfnCertificateOtherNameProperty(block: CfnCertificateOtherNamePropertyDsl.() -> Unit =
      {}): CfnCertificate.OtherNameProperty {
    val builder = CfnCertificateOtherNamePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines the X.509 `CertificatePolicies` extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * PolicyInformationProperty policyInformationProperty = PolicyInformationProperty.builder()
   * .certPolicyId("certPolicyId")
   * // the properties below are optional
   * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyinformation.html)
   */
  public inline
      fun cfnCertificatePolicyInformationProperty(block: CfnCertificatePolicyInformationPropertyDsl.() -> Unit
      = {}): CfnCertificate.PolicyInformationProperty {
    val builder = CfnCertificatePolicyInformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Modifies the `CertPolicyId` of a `PolicyInformation` object with a qualifier.
   *
   * AWS Private CA supports the certification practice statement (CPS) qualifier.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * PolicyQualifierInfoProperty policyQualifierInfoProperty = PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html)
   */
  public inline
      fun cfnCertificatePolicyQualifierInfoProperty(block: CfnCertificatePolicyQualifierInfoPropertyDsl.() -> Unit
      = {}): CfnCertificate.PolicyQualifierInfoProperty {
    val builder = CfnCertificatePolicyQualifierInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCertificate`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .certificateSigningRequest("certificateSigningRequest")
   * .signingAlgorithm("signingAlgorithm")
   * .validity(ValidityProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .apiPassthrough(ApiPassthroughProperty.builder()
   * .extensions(ExtensionsProperty.builder()
   * .certificatePolicies(List.of(PolicyInformationProperty.builder()
   * .certPolicyId("certPolicyId")
   * // the properties below are optional
   * .policyQualifiers(List.of(PolicyQualifierInfoProperty.builder()
   * .policyQualifierId("policyQualifierId")
   * .qualifier(QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build())
   * .build()))
   * .build()))
   * .customExtensions(List.of(CustomExtensionProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * // the properties below are optional
   * .critical(false)
   * .build()))
   * .extendedKeyUsage(List.of(ExtendedKeyUsageProperty.builder()
   * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
   * .extendedKeyUsageType("extendedKeyUsageType")
   * .build()))
   * .keyUsage(KeyUsageProperty.builder()
   * .crlSign(false)
   * .dataEncipherment(false)
   * .decipherOnly(false)
   * .digitalSignature(false)
   * .encipherOnly(false)
   * .keyAgreement(false)
   * .keyCertSign(false)
   * .keyEncipherment(false)
   * .nonRepudiation(false)
   * .build())
   * .subjectAlternativeNames(List.of(GeneralNameProperty.builder()
   * .directoryName(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .dnsName("dnsName")
   * .ediPartyName(EdiPartyNameProperty.builder()
   * .nameAssigner("nameAssigner")
   * .partyName("partyName")
   * .build())
   * .ipAddress("ipAddress")
   * .otherName(OtherNameProperty.builder()
   * .typeId("typeId")
   * .value("value")
   * .build())
   * .registeredId("registeredId")
   * .rfc822Name("rfc822Name")
   * .uniformResourceIdentifier("uniformResourceIdentifier")
   * .build()))
   * .build())
   * .subject(SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build())
   * .build())
   * .templateArn("templateArn")
   * .validityNotBefore(ValidityProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html)
   */
  public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}):
      CfnCertificateProps {
    val builder = CfnCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a `PolicyInformation` qualifier.
   *
   * AWS Private CA supports the [certification practice statement (CPS)
   * qualifier](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.4)
   * defined in RFC 5280.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * QualifierProperty qualifierProperty = QualifierProperty.builder()
   * .cpsUri("cpsUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-qualifier.html)
   */
  public inline
      fun cfnCertificateQualifierProperty(block: CfnCertificateQualifierPropertyDsl.() -> Unit =
      {}): CfnCertificate.QualifierProperty {
    val builder = CfnCertificateQualifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the certificate subject.
   *
   * The `Subject` field in the certificate identifies the entity that owns or controls the public
   * key in the certificate. The entity can be a user, computer, device, or service. The `Subject` must
   * contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names
   * (RDNs). The RDNs are separated by commas in the certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * SubjectProperty subjectProperty = SubjectProperty.builder()
   * .commonName("commonName")
   * .country("country")
   * .customAttributes(List.of(CustomAttributeProperty.builder()
   * .objectIdentifier("objectIdentifier")
   * .value("value")
   * .build()))
   * .distinguishedNameQualifier("distinguishedNameQualifier")
   * .generationQualifier("generationQualifier")
   * .givenName("givenName")
   * .initials("initials")
   * .locality("locality")
   * .organization("organization")
   * .organizationalUnit("organizationalUnit")
   * .pseudonym("pseudonym")
   * .serialNumber("serialNumber")
   * .state("state")
   * .surname("surname")
   * .title("title")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html)
   */
  public inline fun cfnCertificateSubjectProperty(block: CfnCertificateSubjectPropertyDsl.() -> Unit
      = {}): CfnCertificate.SubjectProperty {
    val builder = CfnCertificateSubjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Length of time for which the certificate issued by your private certificate authority (CA), or
   * by the private CA itself, is valid in days, months, or years.
   *
   * You can issue a certificate by calling the `IssueCertificate` operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * ValidityProperty validityProperty = ValidityProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html)
   */
  public inline
      fun cfnCertificateValidityProperty(block: CfnCertificateValidityPropertyDsl.() -> Unit = {}):
      CfnCertificate.ValidityProperty {
    val builder = CfnCertificateValidityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Grants permissions to the AWS Certificate Manager ( ACM ) service principal (
   * `acm.amazonaws.com` ) to perform
   * [IssueCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_IssueCertificate.html)
   * ,
   * [GetCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_GetCertificate.html)
   * , and
   * [ListPermissions](https://docs.aws.amazon.com/privateca/latest/APIReference/API_ListPermissions.html)
   * actions on a CA. These actions are needed for the ACM principal to renew private PKI certificates
   * requested through ACM and residing in the same AWS account as the CA.
   *
   * **About permissions** - If the private CA and the certificates it issues reside in the same
   * account, you can use `AWS::ACMPCA::Permission` to grant permissions for ACM to carry out automatic
   * certificate renewals.
   *
   * * For automatic certificate renewal to succeed, the ACM service principal needs permissions to
   * create, retrieve, and list permissions.
   * * If the private CA and the ACM certificates reside in different accounts, then permissions
   * cannot be used to enable automatic renewals. Instead, the ACM certificate owner must set up a
   * resource-based policy to enable cross-account issuance and renewals. For more information, see
   * [Using a Resource Based Policy with AWS Private
   * CA](https://docs.aws.amazon.com/privateca/latest/userguide/pca-rbp.html) .
   *
   *
   * To update an `AWS::ACMPCA::Permission` resource, you must first delete the existing permission
   * resource from the CloudFormation stack and then create a new permission resource with updated
   * properties.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
   * .actions(List.of("actions"))
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .principal("principal")
   * // the properties below are optional
   * .sourceAccount("sourceAccount")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html)
   */
  public inline fun cfnPermission(
    scope: Construct,
    id: String,
    block: CfnPermissionDsl.() -> Unit = {},
  ): CfnPermission {
    val builder = CfnPermissionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPermission`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.acmpca.*;
   * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
   * .actions(List.of("actions"))
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .principal("principal")
   * // the properties below are optional
   * .sourceAccount("sourceAccount")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html)
   */
  public inline fun cfnPermissionProps(block: CfnPermissionPropsDsl.() -> Unit = {}):
      CfnPermissionProps {
    val builder = CfnPermissionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
