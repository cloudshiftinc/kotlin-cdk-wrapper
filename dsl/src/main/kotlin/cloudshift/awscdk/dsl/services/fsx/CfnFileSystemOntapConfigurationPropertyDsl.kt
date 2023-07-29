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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The configuration for this Amazon FSx for NetApp ONTAP file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * OntapConfigurationProperty ontapConfigurationProperty = OntapConfigurationProperty.builder()
 * .deploymentType("deploymentType")
 * // the properties below are optional
 * .automaticBackupRetentionDays(123)
 * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
 * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
 * .iops(123)
 * .mode("mode")
 * .build())
 * .endpointIpAddressRange("endpointIpAddressRange")
 * .fsxAdminPassword("fsxAdminPassword")
 * .preferredSubnetId("preferredSubnetId")
 * .routeTableIds(List.of("routeTableIds"))
 * .throughputCapacity(123)
 * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemOntapConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.OntapConfigurationProperty.Builder =
        CfnFileSystem.OntapConfigurationProperty.builder()

    private val _routeTableIds: MutableList<String> = mutableListOf()

    /**
     * @param automaticBackupRetentionDays The number of days to retain automatic backups. Setting
     *   this property to `0` disables automatic backups. You can retain automatic backups for a
     *   maximum of 90 days. The default is `30` .
     */
    public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
    }

    /**
     * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` . `HH` is
     *   the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the hour. For
     *   example, `05:00` specifies 5 AM daily.
     */
    public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
    }

    /**
     * @param deploymentType Specifies the FSx for ONTAP file system deployment type to use in
     *   creating the file system.
     * * `MULTI_AZ_1` - (Default) A high availability file system configured for Multi-AZ redundancy
     *   to tolerate temporary Availability Zone (AZ) unavailability.
     * * `SINGLE_AZ_1` - A file system configured for Single-AZ redundancy.
     *
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to
     * [Choosing a file system deployment type](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html)
     * .
     */
    public fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
    }

    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
     */
    public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
    }

    /**
     * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
     */
    public fun diskIopsConfiguration(
        diskIopsConfiguration: CfnFileSystem.DiskIopsConfigurationProperty
    ) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
    }

    /**
     * @param endpointIpAddressRange (Multi-AZ only) Specifies the IP address range in which the
     *   endpoints to access your file system will be created. By default in the Amazon FSx API,
     *   Amazon FSx selects an unused IP address range for you from the 198.19.* range. By default
     *   in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s
     *   primary CIDR range to use as the endpoint IP address range for the file system. You can
     *   have overlapping endpoint IP addresses for file systems deployed in the same VPC/route
     *   tables, as long as they don't overlap with any subnet.
     */
    public fun endpointIpAddressRange(endpointIpAddressRange: String) {
        cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
    }

    /**
     * @param fsxAdminPassword The ONTAP administrative password for the `fsxadmin` user with which
     *   you administer your file system using the NetApp ONTAP CLI and REST API.
     */
    public fun fsxAdminPassword(fsxAdminPassword: String) {
        cdkBuilder.fsxAdminPassword(fsxAdminPassword)
    }

    /**
     * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` . This
     *   specifies the subnet in which you want the preferred file server to be located.
     */
    public fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
    }

    /**
     * @param routeTableIds (Multi-AZ only) Specifies the virtual private cloud (VPC) route tables
     *   in which your file system's endpoints will be created. You should specify all VPC route
     *   tables associated with the subnets in which your clients are located. By default, Amazon
     *   FSx selects your VPC's default route table.
     */
    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    /**
     * @param routeTableIds (Multi-AZ only) Specifies the virtual private cloud (VPC) route tables
     *   in which your file system's endpoints will be created. You should specify all VPC route
     *   tables associated with the subnets in which your clients are located. By default, Amazon
     *   FSx selects your VPC's default route table.
     */
    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    /**
     * @param throughputCapacity Sets the throughput capacity for the file system that you're
     *   creating. Valid values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     */
    public fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
    }

    /**
     * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` . `D` is
     *   the day of the week, for which 1 represents Monday and 7 represents Sunday. For further
     *   details, see
     *   [the ISO-8601 spec as described on Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date)
     *   .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     */
    public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
    }

    public fun build(): CfnFileSystem.OntapConfigurationProperty {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        return cdkBuilder.build()
    }
}
