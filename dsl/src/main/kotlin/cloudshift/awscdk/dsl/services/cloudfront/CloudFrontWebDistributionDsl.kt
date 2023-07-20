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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.GeoRestriction
import software.amazon.awscdk.services.cloudfront.HttpVersion
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.cloudfront.PriceClass
import software.amazon.awscdk.services.cloudfront.SourceConfiguration
import software.amazon.awscdk.services.cloudfront.ViewerCertificate
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CloudFrontWebDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CloudFrontWebDistribution.Builder =
        CloudFrontWebDistribution.Builder.create(scope, id)

    private val _errorConfigurations: MutableList<CfnDistribution.CustomErrorResponseProperty> =
        mutableListOf()

    private val _originConfigs: MutableList<SourceConfiguration> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
    }

    public fun enableIpV6(enableIpV6: Boolean) {
        cdkBuilder.enableIpV6(enableIpV6)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun errorConfigurations(errorConfigurations: CfnDistributionCustomErrorResponsePropertyDsl.() -> Unit) {
        _errorConfigurations.add(CfnDistributionCustomErrorResponsePropertyDsl().apply(errorConfigurations).build())
    }

    public fun errorConfigurations(errorConfigurations: Collection<CfnDistribution.CustomErrorResponseProperty>) {
        _errorConfigurations.addAll(errorConfigurations)
    }

    public fun geoRestriction(geoRestriction: GeoRestriction) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    public fun httpVersion(httpVersion: HttpVersion) {
        cdkBuilder.httpVersion(httpVersion)
    }

    public fun loggingConfig(block: LoggingConfigurationDsl.() -> Unit = {}) {
        val builder = LoggingConfigurationDsl()
        builder.apply(block)
        cdkBuilder.loggingConfig(builder.build())
    }

    public fun loggingConfig(loggingConfig: LoggingConfiguration) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    public fun originConfigs(originConfigs: SourceConfigurationDsl.() -> Unit) {
        _originConfigs.add(SourceConfigurationDsl().apply(originConfigs).build())
    }

    public fun originConfigs(originConfigs: Collection<SourceConfiguration>) {
        _originConfigs.addAll(originConfigs)
    }

    public fun priceClass(priceClass: PriceClass) {
        cdkBuilder.priceClass(priceClass)
    }

    public fun viewerCertificate(viewerCertificate: ViewerCertificate) {
        cdkBuilder.viewerCertificate(viewerCertificate)
    }

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): CloudFrontWebDistribution {
        if (_errorConfigurations.isNotEmpty()) cdkBuilder.errorConfigurations(_errorConfigurations)
        if (_originConfigs.isNotEmpty()) cdkBuilder.originConfigs(_originConfigs)
        return cdkBuilder.build()
    }
}
