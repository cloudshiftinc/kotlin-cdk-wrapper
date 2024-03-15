@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpointGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrEndpointGroupArn(): String = unwrap(this).getAttrEndpointGroupArn()

  public open fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

  public open fun endpointConfigurations(`value`: IResolvable) {
    unwrap(this).setEndpointConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setEndpointConfigurations(__idx_ac66f0)
  }

  public open fun endpointConfigurations(vararg __idx_ac66f0: Any): Unit =
      endpointConfigurations(__idx_ac66f0.toList())

  public open fun endpointGroupRegion(): String = unwrap(this).getEndpointGroupRegion()

  public open fun endpointGroupRegion(`value`: String) {
    unwrap(this).setEndpointGroupRegion(`value`)
  }

  public open fun healthCheckIntervalSeconds(): Number? =
      unwrap(this).getHealthCheckIntervalSeconds()

  public open fun healthCheckIntervalSeconds(`value`: Number) {
    unwrap(this).setHealthCheckIntervalSeconds(`value`)
  }

  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  public open fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

  public open fun healthCheckPort(`value`: Number) {
    unwrap(this).setHealthCheckPort(`value`)
  }

  public open fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  public open fun healthCheckProtocol(`value`: String) {
    unwrap(this).setHealthCheckProtocol(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun listenerArn(): String = unwrap(this).getListenerArn()

  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  public open fun portOverrides(): Any? = unwrap(this).getPortOverrides()

  public open fun portOverrides(`value`: IResolvable) {
    unwrap(this).setPortOverrides(`value`.let(IResolvable::unwrap))
  }

  public open fun portOverrides(__idx_ac66f0: List<Any>) {
    unwrap(this).setPortOverrides(__idx_ac66f0)
  }

  public open fun portOverrides(vararg __idx_ac66f0: Any): Unit =
      portOverrides(__idx_ac66f0.toList())

  public open fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

  public open fun thresholdCount(`value`: Number) {
    unwrap(this).setThresholdCount(`value`)
  }

  public open fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()

  public open fun trafficDialPercentage(`value`: Number) {
    unwrap(this).setTrafficDialPercentage(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup):
        CfnEndpointGroup = CfnEndpointGroup(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointGroup):
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup = wrapped.cdkObject
  }

  public interface PortOverrideProperty {
    public fun endpointPort(): Number

    public fun listenerPort(): Number

    @CdkDslMarker
    public interface Builder {
      public fun endpointPort(endpointPort: Number)

      public fun listenerPort(listenerPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty.Builder
          =
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty.builder()

      override fun endpointPort(endpointPort: Number) {
        cdkBuilder.endpointPort(endpointPort)
      }

      override fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty,
    ) : CdkObject(cdkObject), PortOverrideProperty {
      override fun endpointPort(): Number = unwrap(this).getEndpointPort()

      override fun listenerPort(): Number = unwrap(this).getListenerPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty):
          PortOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortOverrideProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty
    }
  }

  public interface EndpointConfigurationProperty {
    public fun attachmentArn(): String? = unwrap(this).getAttachmentArn()

    public fun clientIpPreservationEnabled(): Any? = unwrap(this).getClientIpPreservationEnabled()

    public fun endpointId(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun attachmentArn(attachmentArn: String)

      public fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean)

      public fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable)

      public fun endpointId(endpointId: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.builder()

      override fun attachmentArn(attachmentArn: String) {
        cdkBuilder.attachmentArn(attachmentArn)
      }

      override fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
      }

      override fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled.let(IResolvable::unwrap))
      }

      override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      override fun attachmentArn(): String? = unwrap(this).getAttachmentArn()

      override fun clientIpPreservationEnabled(): Any? =
          unwrap(this).getClientIpPreservationEnabled()

      override fun endpointId(): String = unwrap(this).getEndpointId()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty):
          EndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
    }
  }
}