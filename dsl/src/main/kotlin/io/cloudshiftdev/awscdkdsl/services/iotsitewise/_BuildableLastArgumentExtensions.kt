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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnGateway

/** The identity for this access policy. */
public inline fun CfnAccessPolicy.setAccessPolicyIdentity(
    block: CfnAccessPolicyAccessPolicyIdentityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPolicyAccessPolicyIdentityPropertyDsl()
    builder.apply(block)
    return setAccessPolicyIdentity(builder.build())
}

/** The AWS IoT SiteWise Monitor resource for this access policy. */
public inline fun CfnAccessPolicy.setAccessPolicyResource(
    block: CfnAccessPolicyAccessPolicyResourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPolicyAccessPolicyResourcePropertyDsl()
    builder.apply(block)
    return setAccessPolicyResource(builder.build())
}

/** The gateway's platform. */
public inline fun CfnGateway.setGatewayPlatform(
    block: CfnGatewayGatewayPlatformPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGatewayGatewayPlatformPropertyDsl()
    builder.apply(block)
    return setGatewayPlatform(builder.build())
}
