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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionCustomOriginConfigPropertyDsl {
    private val cdkBuilder: CfnDistribution.CustomOriginConfigProperty.Builder =
        CfnDistribution.CustomOriginConfigProperty.builder()

    private val _originSslProtocols: MutableList<String> = mutableListOf()

    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    public fun originKeepaliveTimeout(originKeepaliveTimeout: Number) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
    }

    public fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
    }

    public fun originReadTimeout(originReadTimeout: Number) {
        cdkBuilder.originReadTimeout(originReadTimeout)
    }

    public fun originSslProtocols(vararg originSslProtocols: String) {
        _originSslProtocols.addAll(listOf(*originSslProtocols))
    }

    public fun originSslProtocols(originSslProtocols: Collection<String>) {
        _originSslProtocols.addAll(originSslProtocols)
    }

    public fun build(): CfnDistribution.CustomOriginConfigProperty {
        if (_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
        return cdkBuilder.build()
    }
}
