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
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

/**
 * The struct returned from `IOrigin.bind`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * IOrigin origin;
 * OriginBindConfig originBindConfig = OriginBindConfig.builder()
 * .failoverConfig(OriginFailoverConfig.builder()
 * .failoverOrigin(origin)
 * // the properties below are optional
 * .statusCodes(List.of(123))
 * .build())
 * .originProperty(OriginProperty.builder()
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
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginBindConfigDsl {
    private val cdkBuilder: OriginBindConfig.Builder = OriginBindConfig.builder()

    /** @param failoverConfig The failover configuration for this Origin. */
    public fun failoverConfig(failoverConfig: OriginFailoverConfigDsl.() -> Unit = {}) {
        val builder = OriginFailoverConfigDsl()
        builder.apply(failoverConfig)
        cdkBuilder.failoverConfig(builder.build())
    }

    /** @param failoverConfig The failover configuration for this Origin. */
    public fun failoverConfig(failoverConfig: OriginFailoverConfig) {
        cdkBuilder.failoverConfig(failoverConfig)
    }

    /** @param originProperty The CloudFormation OriginProperty configuration for this Origin. */
    public fun originProperty(originProperty: CfnDistributionOriginPropertyDsl.() -> Unit = {}) {
        val builder = CfnDistributionOriginPropertyDsl()
        builder.apply(originProperty)
        cdkBuilder.originProperty(builder.build())
    }

    /** @param originProperty The CloudFormation OriginProperty configuration for this Origin. */
    public fun originProperty(originProperty: CfnDistribution.OriginProperty) {
        cdkBuilder.originProperty(originProperty)
    }

    public fun build(): OriginBindConfig = cdkBuilder.build()
}
