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

import kotlin.Unit
import software.amazon.awscdk.services.neptunegraph.CfnGraph

/** Specifies the number of dimensions for vector embeddings that will be loaded into the graph. */
public inline fun CfnGraph.setVectorSearchConfiguration(
    block: CfnGraphVectorSearchConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGraphVectorSearchConfigurationPropertyDsl()
    builder.apply(block)
    return setVectorSearchConfiguration(builder.build())
}
