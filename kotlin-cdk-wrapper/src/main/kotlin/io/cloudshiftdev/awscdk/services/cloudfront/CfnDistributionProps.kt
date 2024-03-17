@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDistribution`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnDistributionProps cfnDistributionProps = CfnDistributionProps.builder()
 * .distributionConfig(DistributionConfigProperty.builder()
 * .defaultCacheBehavior(DefaultCacheBehaviorProperty.builder()
 * .targetOriginId("targetOriginId")
 * .viewerProtocolPolicy("viewerProtocolPolicy")
 * // the properties below are optional
 * .allowedMethods(List.of("allowedMethods"))
 * .cachedMethods(List.of("cachedMethods"))
 * .cachePolicyId("cachePolicyId")
 * .compress(false)
 * .defaultTtl(123)
 * .fieldLevelEncryptionId("fieldLevelEncryptionId")
 * .forwardedValues(ForwardedValuesProperty.builder()
 * .queryString(false)
 * // the properties below are optional
 * .cookies(CookiesProperty.builder()
 * .forward("forward")
 * // the properties below are optional
 * .whitelistedNames(List.of("whitelistedNames"))
 * .build())
 * .headers(List.of("headers"))
 * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
 * .build())
 * .functionAssociations(List.of(FunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .functionArn("functionArn")
 * .build()))
 * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .includeBody(false)
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build()))
 * .maxTtl(123)
 * .minTtl(123)
 * .originRequestPolicyId("originRequestPolicyId")
 * .realtimeLogConfigArn("realtimeLogConfigArn")
 * .responseHeadersPolicyId("responseHeadersPolicyId")
 * .smoothStreaming(false)
 * .trustedKeyGroups(List.of("trustedKeyGroups"))
 * .trustedSigners(List.of("trustedSigners"))
 * .build())
 * .enabled(false)
 * // the properties below are optional
 * .aliases(List.of("aliases"))
 * .cacheBehaviors(List.of(CacheBehaviorProperty.builder()
 * .pathPattern("pathPattern")
 * .targetOriginId("targetOriginId")
 * .viewerProtocolPolicy("viewerProtocolPolicy")
 * // the properties below are optional
 * .allowedMethods(List.of("allowedMethods"))
 * .cachedMethods(List.of("cachedMethods"))
 * .cachePolicyId("cachePolicyId")
 * .compress(false)
 * .defaultTtl(123)
 * .fieldLevelEncryptionId("fieldLevelEncryptionId")
 * .forwardedValues(ForwardedValuesProperty.builder()
 * .queryString(false)
 * // the properties below are optional
 * .cookies(CookiesProperty.builder()
 * .forward("forward")
 * // the properties below are optional
 * .whitelistedNames(List.of("whitelistedNames"))
 * .build())
 * .headers(List.of("headers"))
 * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
 * .build())
 * .functionAssociations(List.of(FunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .functionArn("functionArn")
 * .build()))
 * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .includeBody(false)
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build()))
 * .maxTtl(123)
 * .minTtl(123)
 * .originRequestPolicyId("originRequestPolicyId")
 * .realtimeLogConfigArn("realtimeLogConfigArn")
 * .responseHeadersPolicyId("responseHeadersPolicyId")
 * .smoothStreaming(false)
 * .trustedKeyGroups(List.of("trustedKeyGroups"))
 * .trustedSigners(List.of("trustedSigners"))
 * .build()))
 * .cnamEs(List.of("cnamEs"))
 * .comment("comment")
 * .continuousDeploymentPolicyId("continuousDeploymentPolicyId")
 * .customErrorResponses(List.of(CustomErrorResponseProperty.builder()
 * .errorCode(123)
 * // the properties below are optional
 * .errorCachingMinTtl(123)
 * .responseCode(123)
 * .responsePagePath("responsePagePath")
 * .build()))
 * .customOrigin(LegacyCustomOriginProperty.builder()
 * .dnsName("dnsName")
 * .originProtocolPolicy("originProtocolPolicy")
 * .originSslProtocols(List.of("originSslProtocols"))
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .build())
 * .defaultRootObject("defaultRootObject")
 * .httpVersion("httpVersion")
 * .ipv6Enabled(false)
 * .logging(LoggingProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .includeCookies(false)
 * .prefix("prefix")
 * .build())
 * .originGroups(OriginGroupsProperty.builder()
 * .quantity(123)
 * // the properties below are optional
 * .items(List.of(OriginGroupProperty.builder()
 * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
 * .statusCodes(StatusCodesProperty.builder()
 * .items(List.of(123))
 * .quantity(123)
 * .build())
 * .build())
 * .id("id")
 * .members(OriginGroupMembersProperty.builder()
 * .items(List.of(OriginGroupMemberProperty.builder()
 * .originId("originId")
 * .build()))
 * .quantity(123)
 * .build())
 * .build()))
 * .build())
 * .origins(List.of(OriginProperty.builder()
 * .domainName("domainName")
 * .id("id")
 * // the properties below are optional
 * .connectionAttempts(123)
 * .connectionTimeout(123)
 * .customOriginConfig(CustomOriginConfigProperty.builder()
 * .originProtocolPolicy("originProtocolPolicy")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originKeepaliveTimeout(123)
 * .originReadTimeout(123)
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build())
 * .originAccessControlId("originAccessControlId")
 * .originCustomHeaders(List.of(OriginCustomHeaderProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build()))
 * .originPath("originPath")
 * .originShield(OriginShieldProperty.builder()
 * .enabled(false)
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .s3OriginConfig(S3OriginConfigProperty.builder()
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .build()))
 * .priceClass("priceClass")
 * .restrictions(RestrictionsProperty.builder()
 * .geoRestriction(GeoRestrictionProperty.builder()
 * .restrictionType("restrictionType")
 * // the properties below are optional
 * .locations(List.of("locations"))
 * .build())
 * .build())
 * .s3Origin(LegacyS3OriginProperty.builder()
 * .dnsName("dnsName")
 * // the properties below are optional
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .staging(false)
 * .viewerCertificate(ViewerCertificateProperty.builder()
 * .acmCertificateArn("acmCertificateArn")
 * .cloudFrontDefaultCertificate(false)
 * .iamCertificateId("iamCertificateId")
 * .minimumProtocolVersion("minimumProtocolVersion")
 * .sslSupportMethod("sslSupportMethod")
 * .build())
 * .webAclId("webAclId")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
public interface CfnDistributionProps {
  /**
   * The distribution's configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
   */
  public fun distributionConfig(): Any

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: IResolvable)

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty)

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    public
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnDistributionProps.builder()

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    override fun distributionConfig(distributionConfig: IResolvable) {
      cdkBuilder.distributionConfig(distributionConfig.let(IResolvable::unwrap))
    }

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
      cdkBuilder.distributionConfig(distributionConfig.let(CfnDistribution.DistributionConfigProperty::unwrap))
    }

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit):
        Unit = distributionConfig(CfnDistribution.DistributionConfigProperty(distributionConfig))

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionProps,
  ) : CdkObject(cdkObject), CfnDistributionProps {
    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     */
    override fun distributionConfig(): Any = unwrap(this).getDistributionConfig()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionProps):
        CfnDistributionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDistributionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionProps):
        software.amazon.awscdk.services.cloudfront.CfnDistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnDistributionProps
  }
}
