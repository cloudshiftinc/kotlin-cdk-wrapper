package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SelectedSubnets {
  public fun availabilityZones(): List<String>

  public fun hasPublic(): Boolean

  public fun internetConnectivityEstablished(): IDependable

  public fun isPendingLookup(): Boolean? = unwrap(this).getIsPendingLookup()

  public fun subnetIds(): List<String>

  public fun subnets(): List<ISubnet>

  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>) {
    }

    public fun hasPublic(hasPublic: Boolean) {
    }

    public fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable) {
    }

    public fun isPendingLookup(isPendingLookup: Boolean) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun subnets(subnets: List<ISubnet>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SelectedSubnets.Builder =
        software.amazon.awscdk.services.ec2.SelectedSubnets.builder()

    public override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    public override fun hasPublic(hasPublic: Boolean) {
      cdkBuilder.hasPublic(hasPublic)
    }

    public override
        fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable) {
      cdkBuilder.internetConnectivityEstablished(internetConnectivityEstablished.let(IDependable::unwrap))
    }

    public override fun isPendingLookup(isPendingLookup: Boolean) {
      cdkBuilder.isPendingLookup(isPendingLookup)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun subnets(subnets: List<ISubnet>) {
      cdkBuilder.subnets(subnets.map(ISubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SelectedSubnets = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SelectedSubnets,
  ) : SelectedSubnets {
    public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    public override fun hasPublic(): Boolean = unwrap(this).getHasPublic()

    public override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    public override fun isPendingLookup(): Boolean? = unwrap(this).getIsPendingLookup()

    public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public override fun subnets(): List<ISubnet> = unwrap(this).getSubnets().map(ISubnet::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SelectedSubnets {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SelectedSubnets):
        SelectedSubnets = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SelectedSubnets):
        software.amazon.awscdk.services.ec2.SelectedSubnets = (wrapped as Wrapper).cdkObject
  }
}
