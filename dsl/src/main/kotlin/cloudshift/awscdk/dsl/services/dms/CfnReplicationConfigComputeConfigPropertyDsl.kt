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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnReplicationConfig

/**
 * Configuration parameters for provisioning a AWS DMS Serverless replication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * ComputeConfigProperty computeConfigProperty = ComputeConfigProperty.builder()
 * .maxCapacityUnits(123)
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .dnsNameServers("dnsNameServers")
 * .kmsKeyId("kmsKeyId")
 * .minCapacityUnits(123)
 * .multiAz(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .replicationSubnetGroupId("replicationSubnetGroupId")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html)
 */
@CdkDslMarker
public class CfnReplicationConfigComputeConfigPropertyDsl {
    private val cdkBuilder: CfnReplicationConfig.ComputeConfigProperty.Builder =
        CfnReplicationConfig.ComputeConfigProperty.builder()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /** @param availabilityZone the value to be set. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param dnsNameServers the value to be set. */
    public fun dnsNameServers(dnsNameServers: String) {
        cdkBuilder.dnsNameServers(dnsNameServers)
    }

    /** @param kmsKeyId the value to be set. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param maxCapacityUnits the value to be set. */
    public fun maxCapacityUnits(maxCapacityUnits: Number) {
        cdkBuilder.maxCapacityUnits(maxCapacityUnits)
    }

    /** @param minCapacityUnits the value to be set. */
    public fun minCapacityUnits(minCapacityUnits: Number) {
        cdkBuilder.minCapacityUnits(minCapacityUnits)
    }

    /** @param multiAz the value to be set. */
    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    /** @param multiAz the value to be set. */
    public fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz)
    }

    /** @param preferredMaintenanceWindow the value to be set. */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /** @param replicationSubnetGroupId the value to be set. */
    public fun replicationSubnetGroupId(replicationSubnetGroupId: String) {
        cdkBuilder.replicationSubnetGroupId(replicationSubnetGroupId)
    }

    /** @param vpcSecurityGroupIds the value to be set. */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /** @param vpcSecurityGroupIds the value to be set. */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnReplicationConfig.ComputeConfigProperty {
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
