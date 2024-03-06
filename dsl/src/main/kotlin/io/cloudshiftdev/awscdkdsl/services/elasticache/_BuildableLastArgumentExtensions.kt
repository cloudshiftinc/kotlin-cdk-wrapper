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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnServerlessCache

/** The cache usage limit for the serverless cache. */
public inline fun CfnServerlessCache.setCacheUsageLimits(
    block: CfnServerlessCacheCacheUsageLimitsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerlessCacheCacheUsageLimitsPropertyDsl()
    builder.apply(block)
    return setCacheUsageLimits(builder.build())
}

/** Represents the information required for client programs to connect to a cache node. */
public inline fun CfnServerlessCache.setEndpoint(
    block: CfnServerlessCacheEndpointPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerlessCacheEndpointPropertyDsl()
    builder.apply(block)
    return setEndpoint(builder.build())
}

/** Represents the information required for client programs to connect to a cache node. */
public inline fun CfnServerlessCache.setReaderEndpoint(
    block: CfnServerlessCacheEndpointPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerlessCacheEndpointPropertyDsl()
    builder.apply(block)
    return setReaderEndpoint(builder.build())
}
