@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * PublicDnsNamespaceAttributes publicDnsNamespaceAttributes =
 * PublicDnsNamespaceAttributes.builder()
 * .namespaceArn("namespaceArn")
 * .namespaceId("namespaceId")
 * .namespaceName("namespaceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class PublicDnsNamespaceAttributesDsl {
    private val cdkBuilder: PublicDnsNamespaceAttributes.Builder =
        PublicDnsNamespaceAttributes.builder()

    /** @param namespaceArn Namespace ARN for the Namespace. */
    public fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
    }

    /** @param namespaceId Namespace Id for the Namespace. */
    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
    }

    /** @param namespaceName A name for the Namespace. */
    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    public fun build(): PublicDnsNamespaceAttributes = cdkBuilder.build()
}
