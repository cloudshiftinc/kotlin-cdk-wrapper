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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig
import software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
import software.amazon.awscdk.services.cloudfront.OriginSslPolicy
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CustomOriginConfigDsl {
    private val cdkBuilder: CustomOriginConfig.Builder = CustomOriginConfig.builder()

    private val _allowedOriginSslVersions: MutableList<OriginSslPolicy> = mutableListOf()

    public fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy) {
        _allowedOriginSslVersions.addAll(listOf(*allowedOriginSslVersions))
    }

    public fun allowedOriginSslVersions(allowedOriginSslVersions: Collection<OriginSslPolicy>) {
        _allowedOriginSslVersions.addAll(allowedOriginSslVersions)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    public fun originHeaders(originHeaders: Map<String, String>) {
        cdkBuilder.originHeaders(originHeaders)
    }

    public fun originKeepaliveTimeout(originKeepaliveTimeout: Duration) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
    }

    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    public fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
    }

    public fun originReadTimeout(originReadTimeout: Duration) {
        cdkBuilder.originReadTimeout(originReadTimeout)
    }

    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): CustomOriginConfig {
        if (_allowedOriginSslVersions.isNotEmpty()) {
            cdkBuilder.allowedOriginSslVersions(_allowedOriginSslVersions)
        }
        return cdkBuilder.build()
    }
}
