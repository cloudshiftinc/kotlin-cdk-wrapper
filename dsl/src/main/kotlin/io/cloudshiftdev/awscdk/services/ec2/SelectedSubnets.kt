package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SelectedSubnets {
  /**
   * The respective AZs of each subnet.
   */
  public fun availabilityZones(): List<String>

  /**
   * Whether any of the given subnets are from the VPC's public subnets.
   */
  public fun hasPublic(): Boolean

  /**
   * Dependency representing internet connectivity for these subnets.
   */
  public fun internetConnectivityEstablished(): IDependable

  /**
   * The subnet selection is not actually real yet.
   *
   * If this value is true, don't validate anything about the subnets. The count
   * or identities are not known yet, and the validation will most likely fail
   * which will prevent a successful lookup.
   *
   * Default: false
   */
  public fun isPendingLookup(): Boolean? = unwrap(this).getIsPendingLookup()

  /**
   * The subnet IDs.
   */
  public fun subnetIds(): List<String>

  /**
   * Selected subnet objects.
   */
  public fun subnets(): List<ISubnet>

  /**
   * A builder for [SelectedSubnets]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones The respective AZs of each subnet. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones The respective AZs of each subnet. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param hasPublic Whether any of the given subnets are from the VPC's public subnets. 
     */
    public fun hasPublic(hasPublic: Boolean)

    /**
     * @param internetConnectivityEstablished Dependency representing internet connectivity for
     * these subnets. 
     */
    public fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable)

    /**
     * @param isPendingLookup The subnet selection is not actually real yet.
     * If this value is true, don't validate anything about the subnets. The count
     * or identities are not known yet, and the validation will most likely fail
     * which will prevent a successful lookup.
     */
    public fun isPendingLookup(isPendingLookup: Boolean)

    /**
     * @param subnetIds The subnet IDs. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The subnet IDs. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param subnets Selected subnet objects. 
     */
    public fun subnets(subnets: List<ISubnet>)

    /**
     * @param subnets Selected subnet objects. 
     */
    public fun subnets(vararg subnets: ISubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SelectedSubnets.Builder =
        software.amazon.awscdk.services.ec2.SelectedSubnets.builder()

    /**
     * @param availabilityZones The respective AZs of each subnet. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones The respective AZs of each subnet. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param hasPublic Whether any of the given subnets are from the VPC's public subnets. 
     */
    override fun hasPublic(hasPublic: Boolean) {
      cdkBuilder.hasPublic(hasPublic)
    }

    /**
     * @param internetConnectivityEstablished Dependency representing internet connectivity for
     * these subnets. 
     */
    override fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable) {
      cdkBuilder.internetConnectivityEstablished(internetConnectivityEstablished.let(IDependable::unwrap))
    }

    /**
     * @param isPendingLookup The subnet selection is not actually real yet.
     * If this value is true, don't validate anything about the subnets. The count
     * or identities are not known yet, and the validation will most likely fail
     * which will prevent a successful lookup.
     */
    override fun isPendingLookup(isPendingLookup: Boolean) {
      cdkBuilder.isPendingLookup(isPendingLookup)
    }

    /**
     * @param subnetIds The subnet IDs. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The subnet IDs. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param subnets Selected subnet objects. 
     */
    override fun subnets(subnets: List<ISubnet>) {
      cdkBuilder.subnets(subnets.map(ISubnet::unwrap))
    }

    /**
     * @param subnets Selected subnet objects. 
     */
    override fun subnets(vararg subnets: ISubnet): Unit = subnets(subnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.SelectedSubnets = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SelectedSubnets,
  ) : SelectedSubnets {
    /**
     * The respective AZs of each subnet.
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    /**
     * Whether any of the given subnets are from the VPC's public subnets.
     */
    override fun hasPublic(): Boolean = unwrap(this).getHasPublic()

    /**
     * Dependency representing internet connectivity for these subnets.
     */
    override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    /**
     * The subnet selection is not actually real yet.
     *
     * If this value is true, don't validate anything about the subnets. The count
     * or identities are not known yet, and the validation will most likely fail
     * which will prevent a successful lookup.
     *
     * Default: false
     */
    override fun isPendingLookup(): Boolean? = unwrap(this).getIsPendingLookup()

    /**
     * The subnet IDs.
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * Selected subnet objects.
     */
    override fun subnets(): List<ISubnet> = unwrap(this).getSubnets().map(ISubnet::wrap)
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
