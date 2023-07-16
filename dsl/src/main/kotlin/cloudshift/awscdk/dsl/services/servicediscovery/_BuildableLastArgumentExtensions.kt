@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnInstance
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.IInstance
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.Service

public inline fun CfnHttpNamespace.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInstance.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPrivateDnsNamespace.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPrivateDnsNamespace.setProperties(block: CfnPrivateDnsNamespacePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPrivateDnsNamespacePropertiesPropertyDsl()
  builder.apply(block)
  return setProperties(builder.build())
}

public inline fun CfnPublicDnsNamespace.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPublicDnsNamespace.setProperties(block: CfnPublicDnsNamespacePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPublicDnsNamespacePropertiesPropertyDsl()
  builder.apply(block)
  return setProperties(builder.build())
}

public inline fun CfnService.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnService.setDnsConfig(block: CfnServiceDnsConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnServiceDnsConfigPropertyDsl()
  builder.apply(block)
  return setDnsConfig(builder.build())
}

public inline
    fun CfnService.setHealthCheckConfig(block: CfnServiceHealthCheckConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnServiceHealthCheckConfigPropertyDsl()
  builder.apply(block)
  return setHealthCheckConfig(builder.build())
}

public inline
    fun CfnService.setHealthCheckCustomConfig(block: CfnServiceHealthCheckCustomConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceHealthCheckCustomConfigPropertyDsl()
  builder.apply(block)
  return setHealthCheckCustomConfig(builder.build())
}

public inline fun HttpNamespace.createService(arg0: String, block: BaseServicePropsDsl.() -> Unit =
    {}): Service {
  val builder = BaseServicePropsDsl()
  builder.apply(block)
  return createService(arg0,builder.build())
}

public inline fun PrivateDnsNamespace.createService(arg0: String,
    block: DnsServicePropsDsl.() -> Unit = {}): Service {
  val builder = DnsServicePropsDsl()
  builder.apply(block)
  return createService(arg0,builder.build())
}

public inline fun PublicDnsNamespace.createService(arg0: String,
    block: DnsServicePropsDsl.() -> Unit = {}): Service {
  val builder = DnsServicePropsDsl()
  builder.apply(block)
  return createService(arg0,builder.build())
}

public inline fun Service.registerCnameInstance(arg0: String,
    block: CnameInstanceBasePropsDsl.() -> Unit = {}): IInstance {
  val builder = CnameInstanceBasePropsDsl()
  builder.apply(block)
  return registerCnameInstance(arg0,builder.build())
}

public inline fun Service.registerIpInstance(arg0: String, block: IpInstanceBasePropsDsl.() -> Unit
    = {}): IInstance {
  val builder = IpInstanceBasePropsDsl()
  builder.apply(block)
  return registerIpInstance(arg0,builder.build())
}

public inline fun Service.registerNonIpInstance(arg0: String,
    block: NonIpInstanceBasePropsDsl.() -> Unit = {}): IInstance {
  val builder = NonIpInstanceBasePropsDsl()
  builder.apply(block)
  return registerNonIpInstance(arg0,builder.build())
}
