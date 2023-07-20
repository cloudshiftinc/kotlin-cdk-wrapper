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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import kotlin.Number

@CdkDslMarker
public class CfnPrivateDnsNamespaceSOAPropertyDsl {
    private val cdkBuilder: CfnPrivateDnsNamespace.SOAProperty.Builder =
        CfnPrivateDnsNamespace.SOAProperty.builder()

    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnPrivateDnsNamespace.SOAProperty = cdkBuilder.build()
}
