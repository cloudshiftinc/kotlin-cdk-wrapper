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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

@CdkDslMarker
public class CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl {
    private val cdkBuilder: CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.Builder =
        CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.builder()

    public fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa)
    }

    public fun soa(soa: CfnPublicDnsNamespace.SOAProperty) {
        cdkBuilder.soa(soa)
    }

    public fun build(): CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty = cdkBuilder.build()
}
