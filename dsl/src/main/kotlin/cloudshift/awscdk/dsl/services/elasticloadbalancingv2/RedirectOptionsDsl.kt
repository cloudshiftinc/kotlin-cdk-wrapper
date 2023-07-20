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
import software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class RedirectOptionsDsl {
    private val cdkBuilder: RedirectOptions.Builder = RedirectOptions.builder()

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun permanent(permanent: Boolean) {
        cdkBuilder.permanent(permanent)
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

    public fun build(): RedirectOptions = cdkBuilder.build()
}
