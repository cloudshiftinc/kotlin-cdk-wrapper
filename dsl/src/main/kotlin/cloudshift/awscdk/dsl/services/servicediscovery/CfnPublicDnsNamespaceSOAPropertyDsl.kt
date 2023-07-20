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
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import kotlin.Number

@CdkDslMarker
public class CfnPublicDnsNamespaceSOAPropertyDsl {
    private val cdkBuilder: CfnPublicDnsNamespace.SOAProperty.Builder =
        CfnPublicDnsNamespace.SOAProperty.builder()

    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnPublicDnsNamespace.SOAProperty = cdkBuilder.build()
}
