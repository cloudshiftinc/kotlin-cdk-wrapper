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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.LayerVersionAttributes
import software.amazon.awscdk.services.lambda.Runtime
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LayerVersionAttributesDsl {
    private val cdkBuilder: LayerVersionAttributes.Builder = LayerVersionAttributes.builder()

    private val _compatibleRuntimes: MutableList<Runtime> = mutableListOf()

    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    public fun compatibleRuntimes(compatibleRuntimes: Collection<Runtime>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    public fun layerVersionArn(layerVersionArn: String) {
        cdkBuilder.layerVersionArn(layerVersionArn)
    }

    public fun build(): LayerVersionAttributes {
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
