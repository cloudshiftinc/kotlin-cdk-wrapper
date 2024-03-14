package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpointAccess internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAddress(): String = unwrap(this).getAttrAddress()

  public open fun attrEndpointCreateTime(): String = unwrap(this).getAttrEndpointCreateTime()

  public open fun attrEndpointStatus(): String = unwrap(this).getAttrEndpointStatus()

  public open fun attrPort(): Number = unwrap(this).getAttrPort()

  public open fun attrVpcEndpoint(): IResolvable =
      unwrap(this).getAttrVpcEndpoint().let(IResolvable::wrap)

  public open fun attrVpcEndpointNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrVpcEndpointNetworkInterfaces().let(IResolvable::wrap)

  public open fun attrVpcEndpointVpcEndpointId(): String =
      unwrap(this).getAttrVpcEndpointVpcEndpointId()

  public open fun attrVpcEndpointVpcId(): String = unwrap(this).getAttrVpcEndpointVpcId()

  public open fun attrVpcSecurityGroups(): IResolvable =
      unwrap(this).getAttrVpcSecurityGroups().let(IResolvable::wrap)

  public open fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  public open fun endpointName(): String = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceOwner(): String? = unwrap(this).getResourceOwner()

  public open fun resourceOwner(`value`: String) {
    unwrap(this).setResourceOwner(`value`)
  }

  public open fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  public interface Builder {
    public fun clusterIdentifier(clusterIdentifier: String)

    public fun endpointName(endpointName: String)

    public fun resourceOwner(resourceOwner: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEndpointAccess.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAccess.Builder.create(scope, id)

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun resourceOwner(resourceOwner: String) {
      cdkBuilder.resourceOwner(resourceOwner)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAccess =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess):
        CfnEndpointAccess = CfnEndpointAccess(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAccess):
        software.amazon.awscdk.services.redshift.CfnEndpointAccess = wrapped.cdkObject
  }

  public interface VpcSecurityGroupProperty {
    public fun status(): String? = unwrap(this).getStatus()

    public fun vpcSecurityGroupId(): String? = unwrap(this).getVpcSecurityGroupId()

    public interface Builder {
      public fun status(status: String)

      public fun vpcSecurityGroupId(vpcSecurityGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun vpcSecurityGroupId(vpcSecurityGroupId: String) {
        cdkBuilder.vpcSecurityGroupId(vpcSecurityGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty,
    ) : VpcSecurityGroupProperty {
      override fun status(): String? = unwrap(this).getStatus()

      override fun vpcSecurityGroupId(): String? = unwrap(this).getVpcSecurityGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcSecurityGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty):
          VpcSecurityGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcSecurityGroupProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcEndpointProperty {
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    public interface Builder {
      public fun networkInterfaces(networkInterfaces: IResolvable)

      public fun networkInterfaces(networkInterfaces: List<Any>)

      public fun networkInterfaces(vararg networkInterfaces: Any)

      public fun vpcEndpointId(vpcEndpointId: String)

      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty.Builder =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty.builder()

      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty,
    ) : VpcEndpointProperty {
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty):
          VpcEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcEndpointProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun networkInterfaceId(networkInterfaceId: String)

      public fun privateIpAddress(privateIpAddress: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty,
    ) : NetworkInterfaceProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.redshift.CfnEndpointAccess.NetworkInterfaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
