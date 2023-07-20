@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotsitewise

import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import kotlin.Unit

public inline fun CfnGateway.setGatewayPlatform(block: CfnGatewayGatewayPlatformPropertyDsl.() -> Unit = {}) {
    val builder = CfnGatewayGatewayPlatformPropertyDsl()
    builder.apply(block)
    return setGatewayPlatform(builder.build())
}

public inline fun CfnAccessPolicy.setAccessPolicyIdentity(
    block: CfnAccessPolicyAccessPolicyIdentityPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAccessPolicyAccessPolicyIdentityPropertyDsl()
    builder.apply(block)
    return setAccessPolicyIdentity(builder.build())
}

public inline fun CfnAccessPolicy.setAccessPolicyResource(
    block: CfnAccessPolicyAccessPolicyResourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAccessPolicyAccessPolicyResourcePropertyDsl()
    builder.apply(block)
    return setAccessPolicyResource(builder.build())
}
