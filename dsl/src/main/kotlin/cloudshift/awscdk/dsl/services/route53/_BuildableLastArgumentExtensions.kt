@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZone

public inline fun CfnCidrCollection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDNSSEC.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHealthCheck.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnHealthCheck.setHealthCheckConfig(block: CfnHealthCheckHealthCheckConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnHealthCheckHealthCheckConfigPropertyDsl()
  builder.apply(block)
  return setHealthCheckConfig(builder.build())
}

public inline fun CfnHostedZone.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

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

public inline fun CfnKeySigningKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRecordSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnRecordSetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun PublicHostedZone.addDelegation(arg0: IPublicHostedZone,
    block: ZoneDelegationOptionsDsl.() -> Unit = {}) {
  val builder = ZoneDelegationOptionsDsl()
  builder.apply(block)
  return addDelegation(arg0,builder.build())
}
