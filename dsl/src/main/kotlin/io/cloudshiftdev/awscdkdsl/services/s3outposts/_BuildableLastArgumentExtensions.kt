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

package io.cloudshiftdev.awscdkdsl.services.s3outposts

import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnBucket
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

/** The virtual private cloud (VPC) configuration for this access point, if one exists. */
public inline fun CfnAccessPoint.setVpcConfiguration(
    block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointVpcConfigurationPropertyDsl()
    builder.apply(block)
    return setVpcConfiguration(builder.build())
}

/**
 * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
 * lifecycle configuration.
 */
public inline fun CfnBucket.setLifecycleConfiguration(
    block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketLifecycleConfigurationPropertyDsl()
    builder.apply(block)
    return setLifecycleConfiguration(builder.build())
}

/**  */
public inline fun CfnEndpoint.setFailedReason(
    block: CfnEndpointFailedReasonPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointFailedReasonPropertyDsl()
    builder.apply(block)
    return setFailedReason(builder.build())
}
