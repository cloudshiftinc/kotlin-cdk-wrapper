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

package io.cloudshiftdev.awscdkdsl.services.route53

import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZone

/** A complex type that contains detailed information about one health check. */
public inline fun CfnHealthCheck.setHealthCheckConfig(
    block: CfnHealthCheckHealthCheckConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHealthCheckHealthCheckConfigPropertyDsl()
    builder.apply(block)
    return setHealthCheckConfig(builder.build())
}

/** A complex type that contains an optional comment. */
public inline fun CfnHostedZone.setHostedZoneConfig(
    block: CfnHostedZoneHostedZoneConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHostedZoneHostedZoneConfigPropertyDsl()
    builder.apply(block)
    return setHostedZoneConfig(builder.build())
}

/** Creates a configuration for DNS query logging. */
public inline fun CfnHostedZone.setQueryLoggingConfig(
    block: CfnHostedZoneQueryLoggingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHostedZoneQueryLoggingConfigPropertyDsl()
    builder.apply(block)
    return setQueryLoggingConfig(builder.build())
}

/**
 * *Alias resource record sets only:* Information about the AWS resource, such as a CloudFront
 * distribution or an Amazon S3 bucket, that you want to route traffic to.
 */
public inline fun CfnRecordSet.setAliasTarget(
    block: CfnRecordSetAliasTargetPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordSetAliasTargetPropertyDsl()
    builder.apply(block)
    return setAliasTarget(builder.build())
}

/**
 * The object that is specified in resource record set object when you are linking a resource record
 * set to a CIDR location.
 */
public inline fun CfnRecordSet.setCidrRoutingConfig(
    block: CfnRecordSetCidrRoutingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordSetCidrRoutingConfigPropertyDsl()
    builder.apply(block)
    return setCidrRoutingConfig(builder.build())
}

/**
 * *Geolocation resource record sets only:* A complex type that lets you control how Amazon Route 53
 * responds to DNS queries based on the geographic origin of the query.
 */
public inline fun CfnRecordSet.setGeoLocation(
    block: CfnRecordSetGeoLocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordSetGeoLocationPropertyDsl()
    builder.apply(block)
    return setGeoLocation(builder.build())
}

/**
 * *GeoproximityLocation resource record sets only:* A complex type that lets you control how
 * Route 53 responds to DNS queries based on the geographic origin of the query and your resources.
 */
public inline fun CfnRecordSet.setGeoProximityLocation(
    block: CfnRecordSetGeoProximityLocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordSetGeoProximityLocationPropertyDsl()
    builder.apply(block)
    return setGeoProximityLocation(builder.build())
}

/**
 * Adds a delegation from this zone to a designated zone.
 *
 * @param delegate the zone being delegated to.
 * @param opts options for creating the DNS record, if any.
 */
public inline fun PublicHostedZone.addDelegation(
    `delegate`: IPublicHostedZone,
    block: ZoneDelegationOptionsDsl.() -> Unit = {}
) {
    val builder = ZoneDelegationOptionsDsl()
    builder.apply(block)
    return addDelegation(delegate, builder.build())
}
