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
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.amazon.awscdk.services.lambda.Runtime
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LayerVersionPropsDsl {
    private val cdkBuilder: LayerVersionProps.Builder = LayerVersionProps.builder()

    private val _compatibleArchitectures: MutableList<Architecture> = mutableListOf()

    private val _compatibleRuntimes: MutableList<Runtime> = mutableListOf()

    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture) {
        _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
    }

    public fun compatibleArchitectures(compatibleArchitectures: Collection<Architecture>) {
        _compatibleArchitectures.addAll(compatibleArchitectures)
    }

    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    public fun compatibleRuntimes(compatibleRuntimes: Collection<Runtime>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

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

    public fun build(): LayerVersionProps {
        if (_compatibleArchitectures.isNotEmpty()) {
            cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
        }
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
