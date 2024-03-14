package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SubnetConfiguration {
  public fun cidrMask(): Number? = unwrap(this).getCidrMask()

  public fun ipv6AssignAddressOnCreation(): Boolean? = unwrap(this).getIpv6AssignAddressOnCreation()

  public fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

  public fun name(): String

  public fun reserved(): Boolean? = unwrap(this).getReserved()

  public fun subnetType(): SubnetType

  public interface Builder {
    public fun cidrMask(cidrMask: Number) {
    }

    public fun ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation: Boolean) {
    }

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
    }

    public fun name(name: String) {
    }

    public fun reserved(reserved: Boolean) {
    }

    public fun subnetType(subnetType: SubnetType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetConfiguration.Builder =
        software.amazon.awscdk.services.ec2.SubnetConfiguration.builder()

    public override fun cidrMask(cidrMask: Number) {
      cdkBuilder.cidrMask(cidrMask)
    }

    public override fun ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation: Boolean) {
      cdkBuilder.ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation)
    }

    public override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun reserved(reserved: Boolean) {
      cdkBuilder.reserved(reserved)
    }

    public override fun subnetType(subnetType: SubnetType) {
      cdkBuilder.subnetType(subnetType.let(SubnetType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetConfiguration = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SubnetConfiguration,
  ) : SubnetConfiguration {
    public override fun cidrMask(): Number? = unwrap(this).getCidrMask()

    public override fun ipv6AssignAddressOnCreation(): Boolean? =
        unwrap(this).getIpv6AssignAddressOnCreation()

    public override fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

    public override fun name(): String = unwrap(this).getName()

    public override fun reserved(): Boolean? = unwrap(this).getReserved()

    public override fun subnetType(): SubnetType =
        unwrap(this).getSubnetType().let(SubnetType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetConfiguration):
        SubnetConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetConfiguration):
        software.amazon.awscdk.services.ec2.SubnetConfiguration = (wrapped as Wrapper).cdkObject
  }
}
