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
import software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * BaseNamespaceProps baseNamespaceProps = BaseNamespaceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseNamespacePropsDsl {
    private val cdkBuilder: BaseNamespaceProps.Builder = BaseNamespaceProps.builder()

    /** @param description A description of the Namespace. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the Namespace. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): BaseNamespaceProps = cdkBuilder.build()
}
