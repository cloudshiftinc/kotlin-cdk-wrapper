@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZone

public inline
    fun CfnHostedZone.setHostedZoneConfig(block: CfnHostedZoneHostedZoneConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnHostedZoneHostedZoneConfigPropertyDsl()
  builder.apply(block)
  return setHostedZoneConfig(builder.build())
}

public inline
    fun CfnHostedZone.setQueryLoggingConfig(block: CfnHostedZoneQueryLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnHostedZoneQueryLoggingConfigPropertyDsl()
  builder.apply(block)
  return setQueryLoggingConfig(builder.build())
}

public inline
    fun CfnHealthCheck.setHealthCheckConfig(block: CfnHealthCheckHealthCheckConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnHealthCheckHealthCheckConfigPropertyDsl()
  builder.apply(block)
  return setHealthCheckConfig(builder.build())
}

public inline fun PublicHostedZone.addDelegation(`delegate`: IPublicHostedZone,
    block: ZoneDelegationOptionsDsl.() -> Unit = {}) {
  val builder = ZoneDelegationOptionsDsl()
  builder.apply(block)
  return addDelegation(delegate, builder.build())
}

public inline fun CfnRecordSet.setAliasTarget(block: CfnRecordSetAliasTargetPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRecordSetAliasTargetPropertyDsl()
  builder.apply(block)
  return setAliasTarget(builder.build())
}

public inline
    fun CfnRecordSet.setCidrRoutingConfig(block: CfnRecordSetCidrRoutingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRecordSetCidrRoutingConfigPropertyDsl()
  builder.apply(block)
  return setCidrRoutingConfig(builder.build())
}

public inline fun CfnRecordSet.setGeoLocation(block: CfnRecordSetGeoLocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRecordSetGeoLocationPropertyDsl()
  builder.apply(block)
  return setGeoLocation(builder.build())
}
