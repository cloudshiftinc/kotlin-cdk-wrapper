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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.amazon.awscdk.services.lambda.Runtime

/**
 * Example:
 * ```
 * LayerVersion.Builder.create(this, "MyLayer")
 * .removalPolicy(RemovalPolicy.RETAIN)
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .compatibleArchitectures(List.of(Architecture.X86_64, Architecture.ARM_64))
 * .build();
 * ```
 */
@CdkDslMarker
public class LayerVersionPropsDsl {
    private val cdkBuilder: LayerVersionProps.Builder = LayerVersionProps.builder()

    private val _compatibleArchitectures: MutableList<Architecture> = mutableListOf()

    private val _compatibleRuntimes: MutableList<Runtime> = mutableListOf()

    /** @param code The content of this Layer. Using `Code.fromInline` is not supported. */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /** @param compatibleArchitectures The system architectures compatible with this layer. */
    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture) {
        _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
    }

    /** @param compatibleArchitectures The system architectures compatible with this layer. */
    public fun compatibleArchitectures(compatibleArchitectures: Collection<Architecture>) {
        _compatibleArchitectures.addAll(compatibleArchitectures)
    }

    /** @param compatibleRuntimes The runtimes compatible with this Layer. */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    /** @param compatibleRuntimes The runtimes compatible with this Layer. */
    public fun compatibleRuntimes(compatibleRuntimes: Collection<Runtime>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    /** @param description The description the this Lambda Layer. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param layerVersionName The name of the layer. */
    public fun layerVersionName(layerVersionName: String) {
        cdkBuilder.layerVersionName(layerVersionName)
    }

    /** @param license The SPDX licence identifier or URL to the license file for this layer. */
    public fun license(license: String) {
        cdkBuilder.license(license)
    }

    /**
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     *   or when the stack is deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): LayerVersionProps {
        if (_compatibleArchitectures.isNotEmpty())
            cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
