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
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.Runtime
import software.constructs.Construct

/**
 * Defines a new Lambda Layer version.
 *
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
public class LayerVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LayerVersion.Builder = LayerVersion.Builder.create(scope, id)

    private val _compatibleArchitectures: MutableList<Architecture> = mutableListOf()

    private val _compatibleRuntimes: MutableList<Runtime> = mutableListOf()

    /**
     * The content of this Layer.
     *
     * Using `Code.fromInline` is not supported.
     *
     * @param code The content of this Layer.
     */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture) {
        _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
    }

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer.
     */
    public fun compatibleArchitectures(compatibleArchitectures: Collection<Architecture>) {
        _compatibleArchitectures.addAll(compatibleArchitectures)
    }

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer.
     */
    public fun compatibleRuntimes(compatibleRuntimes: Collection<Runtime>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    /**
     * The description the this Lambda Layer.
     *
     * Default: - No description.
     *
     * @param description The description the this Lambda Layer.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the layer.
     *
     * Default: - A name will be generated.
     *
     * @param layerVersionName The name of the layer.
     */
    public fun layerVersionName(layerVersionName: String) {
        cdkBuilder.layerVersionName(layerVersionName)
    }

    /**
     * The SPDX licence identifier or URL to the license file for this layer.
     *
     * Default: - No license information will be recorded.
     *
     * @param license The SPDX licence identifier or URL to the license file for this layer.
     */
    public fun license(license: String) {
        cdkBuilder.license(license)
    }

    /**
     * Whether to retain this version of the layer when a new version is added or when the stack is
     * deleted.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     *   or when the stack is deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): LayerVersion {
        if (_compatibleArchitectures.isNotEmpty())
            cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
