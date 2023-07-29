@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps

/**
 * Properties for defining a `CfnDistribution`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
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
@CdkDslMarker
public class CfnDistributionPropsDsl {
    private val cdkBuilder: CfnDistributionProps.Builder = CfnDistributionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param distributionConfig The distribution's configuration. */
    public fun distributionConfig(distributionConfig: IResolvable) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    /** @param distributionConfig The distribution's configuration. */
    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    /** @param tags A complex type that contains zero or more `Tag` elements. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A complex type that contains zero or more `Tag` elements. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDistributionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
