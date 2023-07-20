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
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.LayerVersionOptions
import kotlin.String

@CdkDslMarker
public class LayerVersionOptionsDsl {
    private val cdkBuilder: LayerVersionOptions.Builder = LayerVersionOptions.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun layerVersionName(layerVersionName: String) {
        cdkBuilder.layerVersionName(layerVersionName)
    }

    public fun license(license: String) {
        cdkBuilder.license(license)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): LayerVersionOptions = cdkBuilder.build()
}
