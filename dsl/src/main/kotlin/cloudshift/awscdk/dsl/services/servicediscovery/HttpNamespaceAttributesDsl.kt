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
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes
import kotlin.String

@CdkDslMarker
public class HttpNamespaceAttributesDsl {
    private val cdkBuilder: HttpNamespaceAttributes.Builder = HttpNamespaceAttributes.builder()

    public fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
    }

    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
    }

    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    public fun build(): HttpNamespaceAttributes = cdkBuilder.build()
}
