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
import software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps
import kotlin.String

@CdkDslMarker
public class BaseNamespacePropsDsl {
    private val cdkBuilder: BaseNamespaceProps.Builder = BaseNamespaceProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): BaseNamespaceProps = cdkBuilder.build()
}
