@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A group of subnets returned by the VPC provider.
 *
 * The included subnets do NOT have to be symmetric!
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * VpcSubnetGroup vpcSubnetGroup = VpcSubnetGroup.builder()
 * .name("name")
 * .subnets(List.of(VpcSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .cidr("cidr")
 * .build()))
 * .type(VpcSubnetGroupType.PUBLIC)
 * .build();
 * ```
 */
public interface VpcSubnetGroup {
  /**
   * The name of the subnet group, determined by looking at the tags of of the subnets that belong
   * to it.
   */
  public fun name(): String

  /**
   * The subnets that are part of this group.
   *
   * There is no condition that the subnets have to be symmetric
   * in the group.
   */
  public fun subnets(): List<VpcSubnet>

  /**
   * The type of the subnet group.
   */
  public fun type(): VpcSubnetGroupType

  /**
   * A builder for [VpcSubnetGroup]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the subnet group, determined by looking at the tags of of the subnets
     * that belong to it. 
     */
    public fun name(name: String)

    /**
     * @param subnets The subnets that are part of this group. 
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    public fun subnets(subnets: List<VpcSubnet>)

    /**
     * @param subnets The subnets that are part of this group. 
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    public fun subnets(vararg subnets: VpcSubnet)

    /**
     * @param type The type of the subnet group. 
     */
    public fun type(type: VpcSubnetGroupType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcSubnetGroup.Builder =
        software.amazon.awscdk.cxapi.VpcSubnetGroup.builder()

    /**
     * @param name The name of the subnet group, determined by looking at the tags of of the subnets
     * that belong to it. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param subnets The subnets that are part of this group. 
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    override fun subnets(subnets: List<VpcSubnet>) {
      cdkBuilder.subnets(subnets.map(VpcSubnet::unwrap))
    }

    /**
     * @param subnets The subnets that are part of this group. 
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    override fun subnets(vararg subnets: VpcSubnet): Unit = subnets(subnets.toList())

    /**
     * @param type The type of the subnet group. 
     */
    override fun type(type: VpcSubnetGroupType) {
      cdkBuilder.type(type.let(VpcSubnetGroupType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcSubnetGroup = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroup,
  ) : CdkObject(cdkObject), VpcSubnetGroup {
    /**
     * The name of the subnet group, determined by looking at the tags of of the subnets that belong
     * to it.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The subnets that are part of this group.
     *
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    override fun subnets(): List<VpcSubnet> = unwrap(this).getSubnets().map(VpcSubnet::wrap)

    /**
     * The type of the subnet group.
     */
    override fun type(): VpcSubnetGroupType = unwrap(this).getType().let(VpcSubnetGroupType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcSubnetGroup {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroup): VpcSubnetGroup =
        CdkObjectWrappers.wrap(cdkObject) as VpcSubnetGroup

    internal fun unwrap(wrapped: VpcSubnetGroup): software.amazon.awscdk.cxapi.VpcSubnetGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cxapi.VpcSubnetGroup
  }
}
