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
import software.amazon.awscdk.services.eks.ServiceAccountOptions
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class ServiceAccountOptionsDsl {
    private val cdkBuilder: ServiceAccountOptions.Builder = ServiceAccountOptions.builder()

    public fun annotations(annotations: Map<String, String>) {
        cdkBuilder.annotations(annotations)
    }

    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): ServiceAccountOptions = cdkBuilder.build()
}
