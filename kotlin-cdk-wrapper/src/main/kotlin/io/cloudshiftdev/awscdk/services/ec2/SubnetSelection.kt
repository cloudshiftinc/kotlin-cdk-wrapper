@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Customize subnets that are selected for placement of ENIs.
 *
 * Constructs that allow customization of VPC placement use parameters of this
 * type to provide placement settings.
 *
 * By default, the instances are placed in the private subnets.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .removalPolicy(RemovalPolicy.SNAPSHOT)
 * .instanceRemovalPolicy(RemovalPolicy.RETAIN)
 * .build();
 * ```
 */
public interface SubnetSelection {
  /**
   * Select subnets only in the given AZs.
   *
   * Default: no filtering on AZs is done
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * If true, return at most one subnet per AZ.
   *
   * Default: false
   */
  public fun onePerAz(): Boolean? = unwrap(this).getOnePerAz()

  /**
   * List of provided subnet filters.
   *
   * Default: - none
   */
  public fun subnetFilters(): List<SubnetFilter> =
      unwrap(this).getSubnetFilters()?.map(SubnetFilter::wrap) ?: emptyList()

  /**
   * Select the subnet group with the given name.
   *
   * Select the subnet group with the given name. This only needs
   * to be used if you have multiple subnet groups of the same type
   * and you need to distinguish between them. Otherwise, prefer
   * `subnetType`.
   *
   * This field does not select individual subnets, it selects all subnets that
   * share the given subnet group name. This is the name supplied in
   * `subnetConfiguration`.
   *
   * At most one of `subnetType` and `subnetGroupName` can be supplied.
   *
   * Default: - Selection by type instead of by name
   */
  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * Select all subnets of the given type.
   *
   * At most one of `subnetType` and `subnetGroupName` can be supplied.
   *
   * Default: SubnetType.PRIVATE_WITH_EGRESS (or ISOLATED or PUBLIC if there are no
   * PRIVATE_WITH_EGRESS subnets)
   */
  public fun subnetType(): SubnetType? = unwrap(this).getSubnetType()?.let(SubnetType::wrap)

  /**
   * Explicitly select individual subnets.
   *
   * Use this if you don't want to automatically use all subnets in
   * a group, but have a need to control selection down to
   * individual subnets.
   *
   * Cannot be specified together with `subnetType` or `subnetGroupName`.
   *
   * Default: - Use all subnets in a selected group (all private subnets by default)
   */
  public fun subnets(): List<ISubnet> = unwrap(this).getSubnets()?.map(ISubnet::wrap) ?: emptyList()

  /**
   * A builder for [SubnetSelection]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones Select subnets only in the given AZs.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones Select subnets only in the given AZs.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param onePerAz If true, return at most one subnet per AZ.
     */
    public fun onePerAz(onePerAz: Boolean)

    /**
     * @param subnetFilters List of provided subnet filters.
     */
    public fun subnetFilters(subnetFilters: List<SubnetFilter>)

    /**
     * @param subnetFilters List of provided subnet filters.
     */
    public fun subnetFilters(vararg subnetFilters: SubnetFilter)

    /**
     * @param subnetGroupName Select the subnet group with the given name.
     * Select the subnet group with the given name. This only needs
     * to be used if you have multiple subnet groups of the same type
     * and you need to distinguish between them. Otherwise, prefer
     * `subnetType`.
     *
     * This field does not select individual subnets, it selects all subnets that
     * share the given subnet group name. This is the name supplied in
     * `subnetConfiguration`.
     *
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param subnetType Select all subnets of the given type.
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     */
    public fun subnetType(subnetType: SubnetType)

    /**
     * @param subnets Explicitly select individual subnets.
     * Use this if you don't want to automatically use all subnets in
     * a group, but have a need to control selection down to
     * individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    public fun subnets(subnets: List<ISubnet>)

    /**
     * @param subnets Explicitly select individual subnets.
     * Use this if you don't want to automatically use all subnets in
     * a group, but have a need to control selection down to
     * individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    public fun subnets(vararg subnets: ISubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetSelection.Builder =
        software.amazon.awscdk.services.ec2.SubnetSelection.builder()

    /**
     * @param availabilityZones Select subnets only in the given AZs.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones Select subnets only in the given AZs.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param onePerAz If true, return at most one subnet per AZ.
     */
    override fun onePerAz(onePerAz: Boolean) {
      cdkBuilder.onePerAz(onePerAz)
    }

    /**
     * @param subnetFilters List of provided subnet filters.
     */
    override fun subnetFilters(subnetFilters: List<SubnetFilter>) {
      cdkBuilder.subnetFilters(subnetFilters.map(SubnetFilter::unwrap))
    }

    /**
     * @param subnetFilters List of provided subnet filters.
     */
    override fun subnetFilters(vararg subnetFilters: SubnetFilter): Unit =
        subnetFilters(subnetFilters.toList())

    /**
     * @param subnetGroupName Select the subnet group with the given name.
     * Select the subnet group with the given name. This only needs
     * to be used if you have multiple subnet groups of the same type
     * and you need to distinguish between them. Otherwise, prefer
     * `subnetType`.
     *
     * This field does not select individual subnets, it selects all subnets that
     * share the given subnet group name. This is the name supplied in
     * `subnetConfiguration`.
     *
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param subnetType Select all subnets of the given type.
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     */
    override fun subnetType(subnetType: SubnetType) {
      cdkBuilder.subnetType(subnetType.let(SubnetType::unwrap))
    }

    /**
     * @param subnets Explicitly select individual subnets.
     * Use this if you don't want to automatically use all subnets in
     * a group, but have a need to control selection down to
     * individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    override fun subnets(subnets: List<ISubnet>) {
      cdkBuilder.subnets(subnets.map(ISubnet::unwrap))
    }

    /**
     * @param subnets Explicitly select individual subnets.
     * Use this if you don't want to automatically use all subnets in
     * a group, but have a need to control selection down to
     * individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    override fun subnets(vararg subnets: ISubnet): Unit = subnets(subnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.SubnetSelection = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.SubnetSelection,
  ) : CdkObject(cdkObject), SubnetSelection {
    /**
     * Select subnets only in the given AZs.
     *
     * Default: no filtering on AZs is done
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * If true, return at most one subnet per AZ.
     *
     * Default: false
     */
    override fun onePerAz(): Boolean? = unwrap(this).getOnePerAz()

    /**
     * List of provided subnet filters.
     *
     * Default: - none
     */
    override fun subnetFilters(): List<SubnetFilter> =
        unwrap(this).getSubnetFilters()?.map(SubnetFilter::wrap) ?: emptyList()

    /**
     * Select the subnet group with the given name.
     *
     * Select the subnet group with the given name. This only needs
     * to be used if you have multiple subnet groups of the same type
     * and you need to distinguish between them. Otherwise, prefer
     * `subnetType`.
     *
     * This field does not select individual subnets, it selects all subnets that
     * share the given subnet group name. This is the name supplied in
     * `subnetConfiguration`.
     *
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     *
     * Default: - Selection by type instead of by name
     */
    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    /**
     * Select all subnets of the given type.
     *
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     *
     * Default: SubnetType.PRIVATE_WITH_EGRESS (or ISOLATED or PUBLIC if there are no
     * PRIVATE_WITH_EGRESS subnets)
     */
    override fun subnetType(): SubnetType? = unwrap(this).getSubnetType()?.let(SubnetType::wrap)

    /**
     * Explicitly select individual subnets.
     *
     * Use this if you don't want to automatically use all subnets in
     * a group, but have a need to control selection down to
     * individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     *
     * Default: - Use all subnets in a selected group (all private subnets by default)
     */
    override fun subnets(): List<ISubnet> = unwrap(this).getSubnets()?.map(ISubnet::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetSelection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetSelection):
        SubnetSelection = CdkObjectWrappers.wrap(cdkObject) as? SubnetSelection ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetSelection):
        software.amazon.awscdk.services.ec2.SubnetSelection = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SubnetSelection
  }
}
