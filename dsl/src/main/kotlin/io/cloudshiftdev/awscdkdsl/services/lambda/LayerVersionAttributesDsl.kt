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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.LayerVersionAttributes
import software.amazon.awscdk.services.lambda.Runtime

/**
 * Properties necessary to import a LayerVersion.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * Runtime runtime;
 * LayerVersionAttributes layerVersionAttributes = LayerVersionAttributes.builder()
 * .layerVersionArn("layerVersionArn")
 * // the properties below are optional
 * .compatibleRuntimes(List.of(runtime))
 * .build();
 * ```
 */
@CdkDslMarker
public class LayerVersionAttributesDsl {
    private val cdkBuilder: LayerVersionAttributes.Builder = LayerVersionAttributes.builder()

    private val _compatibleRuntimes: MutableList<Runtime> = mutableListOf()

    /** @param compatibleRuntimes The list of compatible runtimes with this Layer. */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    /** @param compatibleRuntimes The list of compatible runtimes with this Layer. */
    public fun compatibleRuntimes(compatibleRuntimes: Collection<Runtime>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    /** @param layerVersionArn The ARN of the LayerVersion. */
    public fun layerVersionArn(layerVersionArn: String) {
        cdkBuilder.layerVersionArn(layerVersionArn)
    }

    public fun build(): LayerVersionAttributes {
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
