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

package io.cloudshiftdev.awscdkdsl.services.pipes

import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

/** The parameters required to set up enrichment on your pipe. */
public inline fun CfnPipe.setEnrichmentParameters(
    block: CfnPipePipeEnrichmentParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipePipeEnrichmentParametersPropertyDsl()
    builder.apply(block)
    return setEnrichmentParameters(builder.build())
}

/** The parameters required to set up a source for your pipe. */
public inline fun CfnPipe.setSourceParameters(
    block: CfnPipePipeSourceParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipePipeSourceParametersPropertyDsl()
    builder.apply(block)
    return setSourceParameters(builder.build())
}

/** The parameters required to set up a target for your pipe. */
public inline fun CfnPipe.setTargetParameters(
    block: CfnPipePipeTargetParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipePipeTargetParametersPropertyDsl()
    builder.apply(block)
    return setTargetParameters(builder.build())
}
