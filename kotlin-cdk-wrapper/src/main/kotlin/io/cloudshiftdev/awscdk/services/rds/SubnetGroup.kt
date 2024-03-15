@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Class for creating a RDS DB subnet group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * SubnetGroup subnetGroup = SubnetGroup.Builder.create(this, "MySubnetGroup")
 * .description("description")
 * .vpc(vpc)
 * // the properties below are optional
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .subnetGroupName("subnetGroupName")
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
public open class SubnetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.SubnetGroup,
) : Resource(cdkObject), ISubnetGroup {
  /**
   * The name of the subnet group.
   */
  public override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.SubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Description of the subnet group.
     *
     * @param description Description of the subnet group. 
     */
    public fun description(description: String)

    /**
     * The removal policy to apply when the subnet group are removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply when the subnet group are removed from the
     * stack or replaced during an update. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The name of the subnet group.
     *
     * Default: - a name is generated
     *
     * @param subnetGroupName The name of the subnet group. 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * The VPC to place the subnet group in.
     *
     * @param vpc The VPC to place the subnet group in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc43ba71fcd5d7da42950c84c82c8e9a17faeac7b43457e594c395c8ef038fd9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.SubnetGroup.Builder =
        software.amazon.awscdk.services.rds.SubnetGroup.Builder.create(scope, id)

    /**
     * Description of the subnet group.
     *
     * @param description Description of the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The removal policy to apply when the subnet group are removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply when the subnet group are removed from the
     * stack or replaced during an update. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The name of the subnet group.
     *
     * Default: - a name is generated
     *
     * @param subnetGroupName The name of the subnet group. 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * The VPC to place the subnet group in.
     *
     * @param vpc The VPC to place the subnet group in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc43ba71fcd5d7da42950c84c82c8e9a17faeac7b43457e594c395c8ef038fd9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.SubnetGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromSubnetGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      subnetGroupName: String,
    ): ISubnetGroup =
        software.amazon.awscdk.services.rds.SubnetGroup.fromSubnetGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, subnetGroupName).let(ISubnetGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SubnetGroup): SubnetGroup =
        SubnetGroup(cdkObject)

    internal fun unwrap(wrapped: SubnetGroup): software.amazon.awscdk.services.rds.SubnetGroup =
        wrapped.cdkObject
  }
}
