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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import kotlin.String

@CdkDslMarker
public class CfnListenerRedirectConfigPropertyDsl {
    private val cdkBuilder: CfnListener.RedirectConfigProperty.Builder =
        CfnListener.RedirectConfigProperty.builder()

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun query(query: String) {
        cdkBuilder.query(query)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnListener.RedirectConfigProperty = cdkBuilder.build()
}
