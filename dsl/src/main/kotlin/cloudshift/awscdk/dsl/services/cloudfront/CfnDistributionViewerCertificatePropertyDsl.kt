@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex type that determines the distribution's SSL/TLS configuration for communicating with
 * viewers.
 *
 * If the distribution doesn't use `Aliases` (also known as alternate domain names or CNAMEs)—that
 * is, if the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net` —set
 * `CloudFrontDefaultCertificate` to `true` and leave all other fields empty.
 *
 * If the distribution uses `Aliases` (alternate domain names or CNAMEs), use the fields in this
 * type to specify the following settings:
 *
 * * Which viewers the distribution accepts HTTPS connections from: only viewers that support
 * [server name indication
 * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication)
 * (recommended), or all viewers including those that don't support SNI.
 * * To accept HTTPS connections from only viewers that support SNI, set `SSLSupportMethod` to
 * `sni-only` . This is recommended. Most browsers and clients support SNI. (In CloudFormation, the
 * field name is `SslSupportMethod` . Note the different capitalization.)
 * * To accept HTTPS connections from all viewers, including those that don't support SNI, set
 * `SSLSupportMethod` to `vip` . This is not recommended, and results in additional monthly charges
 * from CloudFront. (In CloudFormation, the field name is `SslSupportMethod` . Note the different
 * capitalization.)
 * * The minimum SSL/TLS protocol version that the distribution can use to communicate with viewers.
 * To specify a minimum version, choose a value for `MinimumProtocolVersion` . For more information,
 * see [Security
 * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
 * in the *Amazon CloudFront Developer Guide* .
 * * The location of the SSL/TLS certificate, [AWS Certificate Manager
 * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) (recommended) or [AWS
 * Identity and Access Management
 * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) . You
 * specify the location by setting a value in one of the following fields (not both):
 * * `ACMCertificateArn` (In CloudFormation, this field name is `AcmCertificateArn` . Note the
 * different capitalization.)
 * * `IAMCertificateId` (In CloudFormation, this field name is `IamCertificateId` . Note the
 * different capitalization.)
 *
 * All distributions support HTTPS connections from viewers. To require viewers to use HTTPS only,
 * or to redirect them from HTTP to HTTPS, use `ViewerProtocolPolicy` in the `CacheBehavior` or
 * `DefaultCacheBehavior` . To specify how CloudFront should use SSL/TLS to communicate with your
 * custom origin, use `CustomOriginConfig` .
 *
 * For more information, see [Using HTTPS with
 * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html) and
 * [Using Alternate Domain Names and
 * HTTPS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ViewerCertificateProperty viewerCertificateProperty = ViewerCertificateProperty.builder()
 * .acmCertificateArn("acmCertificateArn")
 * .cloudFrontDefaultCertificate(false)
 * .iamCertificateId("iamCertificateId")
 * .minimumProtocolVersion("minimumProtocolVersion")
 * .sslSupportMethod("sslSupportMethod")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html)
 */
@CdkDslMarker
public class CfnDistributionViewerCertificatePropertyDsl {
  private val cdkBuilder: CfnDistribution.ViewerCertificateProperty.Builder =
      CfnDistribution.ViewerCertificateProperty.builder()

  /**
   * @param acmCertificateArn In CloudFormation, this field name is `AcmCertificateArn` . Note the
   * different capitalization.
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
   * certificate is stored in [AWS Certificate Manager
   * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) , provide the Amazon
   * Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates in the US
   * East (N. Virginia) Region ( `us-east-1` ).
   *
   * If you specify an ACM certificate ARN, you must also specify values for
   * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
   * `SslSupportMethod` . Note the different capitalization.)
   */
  public fun acmCertificateArn(acmCertificateArn: String) {
    cdkBuilder.acmCertificateArn(acmCertificateArn)
  }

  /**
   * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name such as
   * `d111111abcdef8.cloudfront.net` , set this field to `true` .
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs), set this field to
   * `false` and specify values for the following fields:
   *
   * * `ACMCertificateArn` or `IAMCertificateId` (specify a value for one, not both)
   *
   * In CloudFormation, these field names are `AcmCertificateArn` and `IamCertificateId` . Note the
   * different capitalization.
   *
   * * `MinimumProtocolVersion`
   * * `SSLSupportMethod` (In CloudFormation, this field name is `SslSupportMethod` . Note the
   * different capitalization.)
   */
  public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean) {
    cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
  }

  /**
   * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name such as
   * `d111111abcdef8.cloudfront.net` , set this field to `true` .
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs), set this field to
   * `false` and specify values for the following fields:
   *
   * * `ACMCertificateArn` or `IAMCertificateId` (specify a value for one, not both)
   *
   * In CloudFormation, these field names are `AcmCertificateArn` and `IamCertificateId` . Note the
   * different capitalization.
   *
   * * `MinimumProtocolVersion`
   * * `SSLSupportMethod` (In CloudFormation, this field name is `SslSupportMethod` . Note the
   * different capitalization.)
   */
  public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable) {
    cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
  }

  /**
   * @param iamCertificateId In CloudFormation, this field name is `IamCertificateId` . Note the
   * different capitalization.
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
   * certificate is stored in [AWS Identity and Access Management
   * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) ,
   * provide the ID of the IAM certificate.
   *
   * If you specify an IAM certificate ID, you must also specify values for `MinimumProtocolVersion`
   * and `SSLSupportMethod` . (In CloudFormation, the field name is `SslSupportMethod` . Note the
   * different capitalization.)
   */
  public fun iamCertificateId(iamCertificateId: String) {
    cdkBuilder.iamCertificateId(iamCertificateId)
  }

  /**
   * @param minimumProtocolVersion If the distribution uses `Aliases` (alternate domain names or
   * CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections with
   * viewers.
   * The security policy determines two settings:
   *
   * * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
   * * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
   *
   * For more information, see [Security
   * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
   * and [Supported Protocols and Ciphers Between Viewers and
   * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers)
   * in the *Amazon CloudFront Developer Guide* .
   *
   *
   * On the CloudFront console, this setting is called *Security Policy* .
   *
   *
   * When you're using SNI only (you set `SSLSupportMethod` to `sni-only` ), you must specify
   * `TLSv1` or higher. (In CloudFormation, the field name is `SslSupportMethod` . Note the different
   * capitalization.)
   *
   * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
   * (you set `CloudFrontDefaultCertificate` to `true` ), CloudFront automatically sets the security
   * policy to `TLSv1` regardless of the value that you set here.
   */
  public fun minimumProtocolVersion(minimumProtocolVersion: String) {
    cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
  }

  /**
   * @param sslSupportMethod In CloudFormation, this field name is `SslSupportMethod` . Note the
   * different capitalization.
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify which viewers
   * the distribution accepts HTTPS connections from.
   *
   * * `sni-only` – The distribution accepts HTTPS connections from only viewers that support
   * [server name indication
   * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication) . This is
   * recommended. Most browsers and clients support SNI.
   * * `vip` – The distribution accepts HTTPS connections from all viewers including those that
   * don't support SNI. This is not recommended, and results in additional monthly charges from
   * CloudFront.
   * * `static-ip` - Do not specify this value unless your distribution has been enabled for this
   * feature by the CloudFront team. If you have a use case that requires static IP addresses for a
   * distribution, contact CloudFront through the [AWS Support
   * Center](https://docs.aws.amazon.com/support/home) .
   *
   * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net` ,
   * don't set a value for this field.
   */
  public fun sslSupportMethod(sslSupportMethod: String) {
    cdkBuilder.sslSupportMethod(sslSupportMethod)
  }

  public fun build(): CfnDistribution.ViewerCertificateProperty = cdkBuilder.build()
}
