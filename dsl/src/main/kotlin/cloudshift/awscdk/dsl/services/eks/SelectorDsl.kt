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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.Selector
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class SelectorDsl {
    private val cdkBuilder: Selector.Builder = Selector.builder()

    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): Selector = cdkBuilder.build()
}
