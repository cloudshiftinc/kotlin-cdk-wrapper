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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iam.ServicePrincipal
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class ServicePrincipalDsl(
    service: String,
) {
    private val cdkBuilder: ServicePrincipal.Builder = ServicePrincipal.Builder.create(service)

    public fun conditions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.conditions(builder.map)
    }

    public fun conditions(conditions: Map<String, Any>) {
        cdkBuilder.conditions(conditions)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): ServicePrincipal = cdkBuilder.build()
}
