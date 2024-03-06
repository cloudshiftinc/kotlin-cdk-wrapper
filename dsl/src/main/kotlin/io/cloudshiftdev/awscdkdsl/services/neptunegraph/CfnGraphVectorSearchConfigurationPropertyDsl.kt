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

package io.cloudshiftdev.awscdkdsl.services.neptunegraph

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.neptunegraph.CfnGraph

/**
 * The vector-search configuration for the graph, which specifies the vector dimension to use in the
 * vector index, if any.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptunegraph.*;
 * VectorSearchConfigurationProperty vectorSearchConfigurationProperty =
 * VectorSearchConfigurationProperty.builder()
 * .vectorSearchDimension(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptunegraph-graph-vectorsearchconfiguration.html)
 */
@CdkDslMarker
public class CfnGraphVectorSearchConfigurationPropertyDsl {
    private val cdkBuilder: CfnGraph.VectorSearchConfigurationProperty.Builder =
        CfnGraph.VectorSearchConfigurationProperty.builder()

    /** @param vectorSearchDimension The number of dimensions. */
    public fun vectorSearchDimension(vectorSearchDimension: Number) {
        cdkBuilder.vectorSearchDimension(vectorSearchDimension)
    }

    public fun build(): CfnGraph.VectorSearchConfigurationProperty = cdkBuilder.build()
}
