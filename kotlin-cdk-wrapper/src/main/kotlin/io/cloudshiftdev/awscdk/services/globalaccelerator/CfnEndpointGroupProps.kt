@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEndpointGroupProps {
  public fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

  public fun endpointGroupRegion(): String

  public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

  public fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  public fun listenerArn(): String

  public fun portOverrides(): Any? = unwrap(this).getPortOverrides()

  public fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

  public fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()

  @CdkDslMarker
  public interface Builder {
    public fun endpointConfigurations(endpointConfigurations: IResolvable)

    public fun endpointConfigurations(endpointConfigurations: List<Any>)

    public fun endpointConfigurations(vararg endpointConfigurations: Any)

    public fun endpointGroupRegion(endpointGroupRegion: String)

    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    public fun healthCheckPath(healthCheckPath: String)

    public fun healthCheckPort(healthCheckPort: Number)

    public fun healthCheckProtocol(healthCheckProtocol: String)

    public fun listenerArn(listenerArn: String)

    public fun portOverrides(portOverrides: IResolvable)

    public fun portOverrides(portOverrides: List<Any>)

    public fun portOverrides(vararg portOverrides: Any)

    public fun thresholdCount(thresholdCount: Number)

    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps.builder()

    override fun endpointConfigurations(endpointConfigurations: IResolvable) {
      cdkBuilder.endpointConfigurations(endpointConfigurations.let(IResolvable::unwrap))
    }

    override fun endpointConfigurations(endpointConfigurations: List<Any>) {
      cdkBuilder.endpointConfigurations(endpointConfigurations)
    }

    override fun endpointConfigurations(vararg endpointConfigurations: Any): Unit =
        endpointConfigurations(endpointConfigurations.toList())

    override fun endpointGroupRegion(endpointGroupRegion: String) {
      cdkBuilder.endpointGroupRegion(endpointGroupRegion)
    }

    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun portOverrides(portOverrides: IResolvable) {
      cdkBuilder.portOverrides(portOverrides.let(IResolvable::unwrap))
    }

    override fun portOverrides(portOverrides: List<Any>) {
      cdkBuilder.portOverrides(portOverrides)
    }

    override fun portOverrides(vararg portOverrides: Any): Unit =
        portOverrides(portOverrides.toList())

    override fun thresholdCount(thresholdCount: Number) {
      cdkBuilder.thresholdCount(thresholdCount)
    }

    override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps,
  ) : CdkObject(cdkObject), CfnEndpointGroupProps {
    override fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

    override fun endpointGroupRegion(): String = unwrap(this).getEndpointGroupRegion()

    override fun healthCheckIntervalSeconds(): Number? =
        unwrap(this).getHealthCheckIntervalSeconds()

    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    override fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

    override fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

    override fun listenerArn(): String = unwrap(this).getListenerArn()

    override fun portOverrides(): Any? = unwrap(this).getPortOverrides()

    override fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

    override fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps):
        CfnEndpointGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointGroupProps):
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
  }
}
