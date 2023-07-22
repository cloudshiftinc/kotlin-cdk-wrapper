@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
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

public object certificatemanager {
  /**
   * A certificate managed by AWS Certificate Manager.
   *
   * Example:
   *
   * ```
   * UserPool pool = new UserPool(this, "Pool");
   * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
   * .cognitoDomain(CognitoDomainOptions.builder()
   * .domainPrefix("my-awesome-app")
   * .build())
   * .build());
   * String certificateArn =
   * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
   * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
   * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
   * .customDomain(CustomDomainOptions.builder()
   * .domainName("user.myapp.com")
   * .certificate(domainCert)
   * .build())
   * .build());
   * ```
   */
  public inline fun certificate(
    scope: Construct,
    id: String,
    block: CertificateDsl.() -> Unit = {},
  ): Certificate {
    val builder = CertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for your certificate.
   *
   * Example:
   *
   * ```
   * HostedZone exampleCom = HostedZone.Builder.create(this, "ExampleCom")
   * .zoneName("example.com")
   * .build();
   * HostedZone exampleNet = HostedZone.Builder.create(this, "ExampleNet")
   * .zoneName("example.net")
   * .build();
   * Certificate cert = Certificate.Builder.create(this, "Certificate")
   * .domainName("test.example.com")
   * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net"))
   * .validation(CertificateValidation.fromDnsMultiZone(Map.of(
   * "test.example.com", exampleCom,
   * "cool.example.com", exampleCom,
   * "test.example.net", exampleNet)))
   * .build();
   * ```
   */
  public inline fun certificateProps(block: CertificatePropsDsl.() -> Unit = {}): CertificateProps {
    val builder = CertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for certificate validation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * import software.amazon.awscdk.services.route53.*;
   * HostedZone hostedZone;
   * CertificationValidationProps certificationValidationProps =
   * CertificationValidationProps.builder()
   * .hostedZone(hostedZone)
   * .hostedZones(Map.of(
   * "hostedZonesKey", hostedZone))
   * .method(ValidationMethod.EMAIL)
   * .validationDomains(Map.of(
   * "validationDomainsKey", "validationDomains"))
   * .build();
   * ```
   */
  public inline fun certificationValidationProps(block: CertificationValidationPropsDsl.() -> Unit =
      {}): CertificationValidationProps {
    val builder = CertificationValidationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CertificateManager::Account` resource defines the expiry event configuration that
   * determines the number of days prior to expiry when ACM starts generating EventBridge events.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
   * .expiryEventsConfiguration(ExpiryEventsConfigurationProperty.builder()
   * .daysBeforeExpiry(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html)
   */
  public inline fun cfnAccount(
    scope: Construct,
    id: String,
    block: CfnAccountDsl.() -> Unit = {},
  ): CfnAccount {
    val builder = CfnAccountDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Object containing expiration events options associated with an AWS account .
   *
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * ExpiryEventsConfigurationProperty expiryEventsConfigurationProperty =
   * ExpiryEventsConfigurationProperty.builder()
   * .daysBeforeExpiry(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-account-expiryeventsconfiguration.html)
   */
  public inline
      fun cfnAccountExpiryEventsConfigurationProperty(block: CfnAccountExpiryEventsConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccount.ExpiryEventsConfigurationProperty {
    val builder = CfnAccountExpiryEventsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAccount`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * CfnAccountProps cfnAccountProps = CfnAccountProps.builder()
   * .expiryEventsConfiguration(ExpiryEventsConfigurationProperty.builder()
   * .daysBeforeExpiry(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html)
   */
  public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
    val builder = CfnAccountPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CertificateManager::Certificate` resource requests an AWS Certificate Manager ( ACM )
   * certificate that you can use to enable secure connections.
   *
   * For example, you can deploy an ACM certificate to an Elastic Load Balancer to enable HTTPS
   * support. For more information, see
   * [RequestCertificate](https://docs.aws.amazon.com/acm/latest/APIReference/API_RequestCertificate.html)
   * in the AWS Certificate Manager API Reference.
   *
   *
   * When you use the `AWS::CertificateManager::Certificate` resource in a CloudFormation stack,
   * domain validation is handled automatically if all three of the following are true: The certificate
   * domain is hosted in Amazon Route 53, the domain resides in your AWS account , and you are using
   * DNS validation.
   *
   * However, if the certificate uses email validation, or if the domain is not hosted in Route 53,
   * then the stack will remain in the `CREATE_IN_PROGRESS` state. Further stack operations are delayed
   * until you validate the certificate request, either by acting upon the instructions in the
   * validation email, or by adding a CNAME record to your DNS configuration. For more information, see
   * [Option 1: DNS Validation](https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html)
   * and [Option 2: Email
   * Validation](https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html) .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
   * .domainName("domainName")
   * // the properties below are optional
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .certificateTransparencyLoggingPreference("certificateTransparencyLoggingPreference")
   * .domainValidationOptions(List.of(DomainValidationOptionProperty.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .hostedZoneId("hostedZoneId")
   * .validationDomain("validationDomain")
   * .build()))
   * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .validationMethod("validationMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
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
   * `DomainValidationOption` is a property of the
   * [AWS::CertificateManager::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
   * resource that specifies the AWS Certificate Manager ( ACM ) certificate domain to validate.
   * Depending on the chosen validation method, ACM checks the domain's DNS record for a validation
   * CNAME, or it attempts to send a validation email message to the domain owner.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * DomainValidationOptionProperty domainValidationOptionProperty =
   * DomainValidationOptionProperty.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .hostedZoneId("hostedZoneId")
   * .validationDomain("validationDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html)
   */
  public inline
      fun cfnCertificateDomainValidationOptionProperty(block: CfnCertificateDomainValidationOptionPropertyDsl.() -> Unit
      = {}): CfnCertificate.DomainValidationOptionProperty {
    val builder = CfnCertificateDomainValidationOptionPropertyDsl()
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
   * import software.amazon.awscdk.services.certificatemanager.*;
   * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .certificateTransparencyLoggingPreference("certificateTransparencyLoggingPreference")
   * .domainValidationOptions(List.of(DomainValidationOptionProperty.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .hostedZoneId("hostedZoneId")
   * .validationDomain("validationDomain")
   * .build()))
   * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .validationMethod("validationMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
   */
  public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}):
      CfnCertificateProps {
    val builder = CfnCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * (deprecated) A certificate managed by AWS Certificate Manager.
   *
   * Will be automatically
   * validated using DNS validation against the specified Route 53 hosted zone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.route53.*;
   * CertificateValidation certificateValidation;
   * HostedZone hostedZone;
   * Role role;
   * DnsValidatedCertificate dnsValidatedCertificate = DnsValidatedCertificate.Builder.create(this,
   * "MyDnsValidatedCertificate")
   * .domainName("domainName")
   * .hostedZone(hostedZone)
   * // the properties below are optional
   * .certificateName("certificateName")
   * .cleanupRoute53Records(false)
   * .customResourceRole(role)
   * .region("region")
   * .route53Endpoint("route53Endpoint")
   * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
   * .transparencyLoggingEnabled(false)
   * .validation(certificateValidation)
   * .build();
   * ```
   *
   * @deprecated use [Certificate ] instead
   */
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

  /**
   * Properties to create a DNS validated certificate managed by AWS Certificate Manager.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.certificatemanager.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.route53.*;
   * CertificateValidation certificateValidation;
   * HostedZone hostedZone;
   * Role role;
   * DnsValidatedCertificateProps dnsValidatedCertificateProps =
   * DnsValidatedCertificateProps.builder()
   * .domainName("domainName")
   * .hostedZone(hostedZone)
   * // the properties below are optional
   * .certificateName("certificateName")
   * .cleanupRoute53Records(false)
   * .customResourceRole(role)
   * .region("region")
   * .route53Endpoint("route53Endpoint")
   * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
   * .transparencyLoggingEnabled(false)
   * .validation(certificateValidation)
   * .build();
   * ```
   */
  public inline fun dnsValidatedCertificateProps(block: DnsValidatedCertificatePropsDsl.() -> Unit =
      {}): DnsValidatedCertificateProps {
    val builder = DnsValidatedCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A private certificate managed by AWS Certificate Manager.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.acmpca.*;
   * PrivateCertificate.Builder.create(this, "PrivateCertificate")
   * .domainName("test.example.com")
   * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net")) // optional
   * .certificateAuthority(CertificateAuthority.fromCertificateAuthorityArn(this, "CA",
   * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/023077d8-2bfa-4eb0-8f22-05c96deade77"))
   * .build();
   * ```
   */
  public inline fun privateCertificate(
    scope: Construct,
    id: String,
    block: PrivateCertificateDsl.() -> Unit = {},
  ): PrivateCertificate {
    val builder = PrivateCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for your private certificate.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.acmpca.*;
   * PrivateCertificate.Builder.create(this, "PrivateCertificate")
   * .domainName("test.example.com")
   * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net")) // optional
   * .certificateAuthority(CertificateAuthority.fromCertificateAuthorityArn(this, "CA",
   * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/023077d8-2bfa-4eb0-8f22-05c96deade77"))
   * .build();
   * ```
   */
  public inline fun privateCertificateProps(block: PrivateCertificatePropsDsl.() -> Unit = {}):
      PrivateCertificateProps {
    val builder = PrivateCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
