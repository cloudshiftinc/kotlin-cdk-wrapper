@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Amazon CloudFront is a global content delivery network (CDN) service that securely delivers data,
 * videos, applications, and APIs to your viewers with low latency and high transfer speeds.
 *
 * CloudFront fronts user provided content and caches it at edge locations across the world.
 *
 * Here's how you can use this construct:
 *
 * ```
 * Bucket sourceBucket = new Bucket(this, "Bucket");
 * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
 * "MyDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .build();
 * ```
 *
 * This will create a CloudFront distribution that uses your S3Bucket as it's origin.
 *
 * You can customize the distribution using additional properties from the
 * CloudFrontWebDistributionProps interface.
 *
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * ViewerCertificate viewerCertificate = ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("MYALIAS"))
 * .build());
 * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(viewerCertificate)
 * .build();
 * ```
 */
public open class CloudFrontWebDistribution internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution,
) : Resource(cdkObject), IDistribution {
  /**
   * The domain name created by CloudFront for this distribution.
   *
   * If you are using aliases for your distribution, this is the domainName your DNS records should
   * point to.
   * (In Route53, you could create an ALIAS record to this value, for example.)
   */
  public override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

  /**
   * The distribution ID for this distribution.
   */
  public override fun distributionId(): String = unwrap(this).getDistributionId()

  /**
   * Adds an IAM policy statement associated with this distribution to an IAM principal's policy.
   *
   * @param identity The principal. 
   * @param actions The set of actions to allow (i.e. "cloudfront:ListInvalidations"). 
   */
  public override fun grant(identity: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), *actions).let(Grant::wrap)

  /**
   * Grant to create invalidations for this bucket to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public override fun grantCreateInvalidation(identity: IGrantable): Grant =
      unwrap(this).grantCreateInvalidation(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The logging bucket for this CloudFront distribution.
   *
   * If logging is not enabled for this distribution - this property will be undefined.
   */
  public open fun loggingBucket(): IBucket? = unwrap(this).getLoggingBucket()?.let(IBucket::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CloudFrontWebDistribution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment for this distribution in the CloudFront console.
     *
     * Default: - No comment is added to distribution.
     *
     * @param comment A comment for this distribution in the CloudFront console. 
     */
    public fun comment(comment: String)

    /**
     * The default object to serve.
     *
     * Default: - "index.html" is served.
     *
     * @param defaultRootObject The default object to serve. 
     */
    public fun defaultRootObject(defaultRootObject: String)

    /**
     * If your distribution should have IPv6 enabled.
     *
     * Default: true
     *
     * @param enableIpV6 If your distribution should have IPv6 enabled. 
     */
    public fun enableIpV6(enableIpV6: Boolean)

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound). 
     */
    public
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>)

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound). 
     */
    public fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty)

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: No geo restriction
     *
     * @param geoRestriction Controls the countries in which your content is distributed. 
     */
    public fun geoRestriction(geoRestriction: GeoRestriction)

    /**
     * The max supported HTTP Versions.
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion The max supported HTTP Versions. 
     */
    public fun httpVersion(httpVersion: HttpVersion)

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging. 
     */
    public fun loggingConfig(loggingConfig: LoggingConfiguration)

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118297c79f59a3d02eff71388488a07ba458cc57ae2cfb797a344b74e12cca7f")
    public fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit)

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution. 
     */
    public fun originConfigs(originConfigs: List<SourceConfiguration>)

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution. 
     */
    public fun originConfigs(vararg originConfigs: SourceConfiguration)

    /**
     * The price class for the distribution (this impacts how many locations CloudFront uses for
     * your distribution, and billing).
     *
     * Default: PriceClass.PRICE_CLASS_100 the cheapest option for CloudFront is picked by default.
     *
     * @param priceClass The price class for the distribution (this impacts how many locations
     * CloudFront uses for your distribution, and billing). 
     */
    public fun priceClass(priceClass: PriceClass)

    /**
     * Specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether
     * you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate
     * Manager (ACM) or a third-party certificate authority.
     *
     * Default: ViewerCertificate.fromCloudFrontDefaultCertificate()
     *
     * [Documentation](https://aws.amazon.com/premiumsupport/knowledge-center/custom-ssl-certificate-cloudfront/)
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     * your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're
     * using AWS Certificate Manager (ACM) or a third-party certificate authority. 
     */
    public fun viewerCertificate(viewerCertificate: ViewerCertificate)

    /**
     * The default viewer policy for incoming clients.
     *
     * Default: RedirectToHTTPs
     *
     * @param viewerProtocolPolicy The default viewer policy for incoming clients. 
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution. 
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.Builder.create(scope,
        id)

    /**
     * A comment for this distribution in the CloudFront console.
     *
     * Default: - No comment is added to distribution.
     *
     * @param comment A comment for this distribution in the CloudFront console. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The default object to serve.
     *
     * Default: - "index.html" is served.
     *
     * @param defaultRootObject The default object to serve. 
     */
    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * If your distribution should have IPv6 enabled.
     *
     * Default: true
     *
     * @param enableIpV6 If your distribution should have IPv6 enabled. 
     */
    override fun enableIpV6(enableIpV6: Boolean) {
      cdkBuilder.enableIpV6(enableIpV6)
    }

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound). 
     */
    override
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>) {
      cdkBuilder.errorConfigurations(errorConfigurations.map(CfnDistribution.CustomErrorResponseProperty::unwrap))
    }

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound). 
     */
    override fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty): Unit =
        errorConfigurations(errorConfigurations.toList())

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: No geo restriction
     *
     * @param geoRestriction Controls the countries in which your content is distributed. 
     */
    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    /**
     * The max supported HTTP Versions.
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion The max supported HTTP Versions. 
     */
    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging. 
     */
    override fun loggingConfig(loggingConfig: LoggingConfiguration) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfiguration::unwrap))
    }

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118297c79f59a3d02eff71388488a07ba458cc57ae2cfb797a344b74e12cca7f")
    override fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfiguration(loggingConfig))

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution. 
     */
    override fun originConfigs(originConfigs: List<SourceConfiguration>) {
      cdkBuilder.originConfigs(originConfigs.map(SourceConfiguration::unwrap))
    }

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution. 
     */
    override fun originConfigs(vararg originConfigs: SourceConfiguration): Unit =
        originConfigs(originConfigs.toList())

    /**
     * The price class for the distribution (this impacts how many locations CloudFront uses for
     * your distribution, and billing).
     *
     * Default: PriceClass.PRICE_CLASS_100 the cheapest option for CloudFront is picked by default.
     *
     * @param priceClass The price class for the distribution (this impacts how many locations
     * CloudFront uses for your distribution, and billing). 
     */
    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    /**
     * Specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether
     * you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate
     * Manager (ACM) or a third-party certificate authority.
     *
     * Default: ViewerCertificate.fromCloudFrontDefaultCertificate()
     *
     * [Documentation](https://aws.amazon.com/premiumsupport/knowledge-center/custom-ssl-certificate-cloudfront/)
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     * your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're
     * using AWS Certificate Manager (ACM) or a third-party certificate authority. 
     */
    override fun viewerCertificate(viewerCertificate: ViewerCertificate) {
      cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificate::unwrap))
    }

    /**
     * The default viewer policy for incoming clients.
     *
     * Default: RedirectToHTTPs
     *
     * @param viewerProtocolPolicy The default viewer policy for incoming clients. 
     */
    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution. 
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: CloudFrontWebDistributionAttributes,
    ): IDistribution =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.fromDistributionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(CloudFrontWebDistributionAttributes::unwrap)).let(IDistribution::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a9b75be6523c2010178c9d6779ba47e3ed66833189966b4162046ea7b0dfc4")
    public fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: CloudFrontWebDistributionAttributes.Builder.() -> Unit,
    ): IDistribution = fromDistributionAttributes(scope, id,
        CloudFrontWebDistributionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFrontWebDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFrontWebDistribution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution):
        CloudFrontWebDistribution = CloudFrontWebDistribution(cdkObject)

    internal fun unwrap(wrapped: CloudFrontWebDistribution):
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution = wrapped.cdkObject
  }
}
