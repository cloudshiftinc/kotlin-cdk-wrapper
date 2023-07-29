@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.rds.SubnetGroup
import software.constructs.Construct

/**
 * Class for creating a RDS DB subnet group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
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
@CdkDslMarker
public class SubnetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SubnetGroup.Builder = SubnetGroup.Builder.create(scope, id)

    /**
     * Description of the subnet group.
     *
     * @param description Description of the subnet group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The removal policy to apply when the subnet group are removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply when the subnet group are removed from the
     *   stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * The name of the subnet group.
     *
     * Default: - a name is generated
     *
     * @param subnetGroupName The name of the subnet group.
     */
    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * The VPC to place the subnet group in.
     *
     * @param vpc The VPC to place the subnet group in.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): SubnetGroup = cdkBuilder.build()
}
