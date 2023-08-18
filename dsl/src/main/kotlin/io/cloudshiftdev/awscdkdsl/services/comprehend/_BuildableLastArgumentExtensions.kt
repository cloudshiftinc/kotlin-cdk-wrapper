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

package io.cloudshiftdev.awscdkdsl.services.comprehend

import kotlin.Unit
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnFlywheel

/** Specifies the format and location of the input data for the job. */
public inline fun CfnDocumentClassifier.setInputDataConfig(
    block: CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl()
    builder.apply(block)
    return setInputDataConfig(builder.build())
}

/** Provides output results configuration parameters for custom classifier jobs. */
public inline fun CfnDocumentClassifier.setOutputDataConfig(
    block: CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl()
    builder.apply(block)
    return setOutputDataConfig(builder.build())
}

/**
 * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
 * are using for your custom classifier.
 */
public inline fun CfnDocumentClassifier.setVpcConfig(
    block: CfnDocumentClassifierVpcConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDocumentClassifierVpcConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}

/** Data security configuration. */
public inline fun CfnFlywheel.setDataSecurityConfig(
    block: CfnFlywheelDataSecurityConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlywheelDataSecurityConfigPropertyDsl()
    builder.apply(block)
    return setDataSecurityConfig(builder.build())
}

/** Configuration about the model associated with a flywheel. */
public inline fun CfnFlywheel.setTaskConfig(
    block: CfnFlywheelTaskConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlywheelTaskConfigPropertyDsl()
    builder.apply(block)
    return setTaskConfig(builder.build())
}
