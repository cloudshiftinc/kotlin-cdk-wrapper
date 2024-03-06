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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/** An object which defines the `idMappingType` and the `providerProperties` . */
public inline fun CfnIdMappingWorkflow.setIdMappingTechniques(
    block: CfnIdMappingWorkflowIdMappingTechniquesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIdMappingWorkflowIdMappingTechniquesPropertyDsl()
    builder.apply(block)
    return setIdMappingTechniques(builder.build())
}

/** An object which defines the `resolutionType` and the `ruleBasedProperties` . */
public inline fun CfnMatchingWorkflow.setResolutionTechniques(
    block: CfnMatchingWorkflowResolutionTechniquesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMatchingWorkflowResolutionTechniquesPropertyDsl()
    builder.apply(block)
    return setResolutionTechniques(builder.build())
}
