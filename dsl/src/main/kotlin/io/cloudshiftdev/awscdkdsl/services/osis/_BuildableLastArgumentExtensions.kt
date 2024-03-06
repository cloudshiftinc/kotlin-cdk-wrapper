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

package io.cloudshiftdev.awscdkdsl.services.osis

import kotlin.Unit
import software.amazon.awscdk.services.osis.CfnPipeline

/** Options that specify the configuration of a persistent buffer. */
public inline fun CfnPipeline.setBufferOptions(
    block: CfnPipelineBufferOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipelineBufferOptionsPropertyDsl()
    builder.apply(block)
    return setBufferOptions(builder.build())
}

/** Options to control how OpenSearch encrypts buffer data. */
public inline fun CfnPipeline.setEncryptionAtRestOptions(
    block: CfnPipelineEncryptionAtRestOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipelineEncryptionAtRestOptionsPropertyDsl()
    builder.apply(block)
    return setEncryptionAtRestOptions(builder.build())
}

/** Key-value pairs that represent log publishing settings. */
public inline fun CfnPipeline.setLogPublishingOptions(
    block: CfnPipelineLogPublishingOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipelineLogPublishingOptionsPropertyDsl()
    builder.apply(block)
    return setLogPublishingOptions(builder.build())
}

/**
 * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
 */
public inline fun CfnPipeline.setVpcOptions(
    block: CfnPipelineVpcOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipelineVpcOptionsPropertyDsl()
    builder.apply(block)
    return setVpcOptions(builder.build())
}
