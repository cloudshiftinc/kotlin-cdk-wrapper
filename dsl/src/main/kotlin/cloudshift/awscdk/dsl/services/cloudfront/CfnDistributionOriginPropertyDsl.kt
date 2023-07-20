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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionOriginPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginProperty.Builder =
        CfnDistribution.OriginProperty.builder()

    private val _originCustomHeaders: MutableList<Any> = mutableListOf()

    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    public fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    public fun customOriginConfig(customOriginConfig: IResolvable) {
        cdkBuilder.customOriginConfig(customOriginConfig)
    }

    public fun customOriginConfig(customOriginConfig: CfnDistribution.CustomOriginConfigProperty) {
        cdkBuilder.customOriginConfig(customOriginConfig)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun originAccessControlId(originAccessControlId: String) {
        cdkBuilder.originAccessControlId(originAccessControlId)
    }

    public fun originCustomHeaders(vararg originCustomHeaders: Any) {
        _originCustomHeaders.addAll(listOf(*originCustomHeaders))
    }

    public fun originCustomHeaders(originCustomHeaders: Collection<Any>) {
        _originCustomHeaders.addAll(originCustomHeaders)
    }

    public fun originCustomHeaders(originCustomHeaders: IResolvable) {
        cdkBuilder.originCustomHeaders(originCustomHeaders)
    }

    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    public fun originShield(originShield: IResolvable) {
        cdkBuilder.originShield(originShield)
    }

    public fun originShield(originShield: CfnDistribution.OriginShieldProperty) {
        cdkBuilder.originShield(originShield)
    }

    public fun s3OriginConfig(s3OriginConfig: IResolvable) {
        cdkBuilder.s3OriginConfig(s3OriginConfig)
    }

    public fun s3OriginConfig(s3OriginConfig: CfnDistribution.S3OriginConfigProperty) {
        cdkBuilder.s3OriginConfig(s3OriginConfig)
    }

    public fun build(): CfnDistribution.OriginProperty {
        if (_originCustomHeaders.isNotEmpty()) cdkBuilder.originCustomHeaders(_originCustomHeaders)
        return cdkBuilder.build()
    }
}
