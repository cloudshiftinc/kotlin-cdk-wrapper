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
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import kotlin.String

@CdkDslMarker
public class PublicDnsNamespacePropsDsl {
    private val cdkBuilder: PublicDnsNamespaceProps.Builder = PublicDnsNamespaceProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): PublicDnsNamespaceProps = cdkBuilder.build()
}
