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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SubnetFilter
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.SubnetType

/**
 * Customize subnets that are selected for placement of ENIs.
 *
 * Constructs that allow customization of VPC placement use parameters of this type to provide
 * placement settings.
 *
 * By default, the instances are placed in the private subnets.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
 * .version(AuroraMysqlEngineVersion.VER_3_03_0)
 * .build()))
 * .instances(2)
 * .instanceProps(InstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .vpc(vpc)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetSelectionDsl {
    private val cdkBuilder: SubnetSelection.Builder = SubnetSelection.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _subnetFilters: MutableList<SubnetFilter> = mutableListOf()

    private val _subnets: MutableList<ISubnet> = mutableListOf()

    /** @param availabilityZones Select subnets only in the given AZs. */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /** @param availabilityZones Select subnets only in the given AZs. */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /** @param onePerAz If true, return at most one subnet per AZ. */
    public fun onePerAz(onePerAz: Boolean) {
        cdkBuilder.onePerAz(onePerAz)
    }

    /** @param subnetFilters List of provided subnet filters. */
    public fun subnetFilters(vararg subnetFilters: SubnetFilter) {
        _subnetFilters.addAll(listOf(*subnetFilters))
    }

    /** @param subnetFilters List of provided subnet filters. */
    public fun subnetFilters(subnetFilters: Collection<SubnetFilter>) {
        _subnetFilters.addAll(subnetFilters)
    }

    /**
     * @param subnetGroupName Select the subnet group with the given name. Select the subnet group
     *   with the given name. This only needs to be used if you have multiple subnet groups of the
     *   same type and you need to distinguish between them. Otherwise, prefer `subnetType`.
     *
     * This field does not select individual subnets, it selects all subnets that share the given
     * subnet group name. This is the name supplied in `subnetConfiguration`.
     *
     * At most one of `subnetType` and `subnetGroupName` can be supplied.
     */
    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param subnetType Select all subnets of the given type. At most one of `subnetType` and
     *   `subnetGroupName` can be supplied.
     */
    public fun subnetType(subnetType: SubnetType) {
        cdkBuilder.subnetType(subnetType)
    }

    /**
     * @param subnets Explicitly select individual subnets. Use this if you don't want to
     *   automatically use all subnets in a group, but have a need to control selection down to
     *   individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    public fun subnets(vararg subnets: ISubnet) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * @param subnets Explicitly select individual subnets. Use this if you don't want to
     *   automatically use all subnets in a group, but have a need to control selection down to
     *   individual subnets.
     *
     * Cannot be specified together with `subnetType` or `subnetGroupName`.
     */
    public fun subnets(subnets: Collection<ISubnet>) {
        _subnets.addAll(subnets)
    }

    public fun build(): SubnetSelection {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_subnetFilters.isNotEmpty()) cdkBuilder.subnetFilters(_subnetFilters)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
