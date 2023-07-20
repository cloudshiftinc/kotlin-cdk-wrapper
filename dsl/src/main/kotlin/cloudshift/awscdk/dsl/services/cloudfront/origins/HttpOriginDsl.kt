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

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
import software.amazon.awscdk.services.cloudfront.OriginSslPolicy
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class HttpOriginDsl(
    domainName: String,
) {
    private val cdkBuilder: HttpOrigin.Builder = HttpOrigin.Builder.create(domainName)

    private val _originSslProtocols: MutableList<OriginSslPolicy> = mutableListOf()

    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    public fun customHeaders(customHeaders: Map<String, String>) {
        cdkBuilder.customHeaders(customHeaders)
    }

    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    public fun keepaliveTimeout(keepaliveTimeout: Duration) {
        cdkBuilder.keepaliveTimeout(keepaliveTimeout)
    }

    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    public fun originShieldEnabled(originShieldEnabled: Boolean) {
        cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy) {
        _originSslProtocols.addAll(listOf(*originSslProtocols))
    }

    public fun originSslProtocols(originSslProtocols: Collection<OriginSslPolicy>) {
        _originSslProtocols.addAll(originSslProtocols)
    }

    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
        cdkBuilder.protocolPolicy(protocolPolicy)
    }

    public fun readTimeout(readTimeout: Duration) {
        cdkBuilder.readTimeout(readTimeout)
    }

    public fun build(): HttpOrigin {
        if (_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
        return cdkBuilder.build()
    }
}
