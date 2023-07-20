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
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes
import kotlin.String

@CdkDslMarker
public class PublicDnsNamespaceAttributesDsl {
    private val cdkBuilder: PublicDnsNamespaceAttributes.Builder =
        PublicDnsNamespaceAttributes.builder()

    public fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
    }

    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
    }

    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    public fun build(): PublicDnsNamespaceAttributes = cdkBuilder.build()
}
