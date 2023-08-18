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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The Microsoft Windows configuration for the file system that's being created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * WindowsConfigurationProperty windowsConfigurationProperty =
 * WindowsConfigurationProperty.builder()
 * .throughputCapacity(123)
 * // the properties below are optional
 * .activeDirectoryId("activeDirectoryId")
 * .aliases(List.of("aliases"))
 * .auditLogConfiguration(AuditLogConfigurationProperty.builder()
 * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
 * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
 * // the properties below are optional
 * .auditLogDestination("auditLogDestination")
 * .build())
 * .automaticBackupRetentionDays(123)
 * .copyTagsToBackups(false)
 * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
 * .deploymentType("deploymentType")
 * .preferredSubnetId("preferredSubnetId")
 * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
 * .dnsIps(List.of("dnsIps"))
 * .domainName("domainName")
 * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .password("password")
 * .userName("userName")
 * .build())
 * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemWindowsConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.WindowsConfigurationProperty.Builder =
        CfnFileSystem.WindowsConfigurationProperty.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    /**
     * @param activeDirectoryId The ID for an existing AWS Managed Microsoft Active Directory (AD)
     *   instance that the file system should join when it's created. Required if you are joining
     *   the file system to an existing AWS Managed Microsoft AD.
     */
    public fun activeDirectoryId(activeDirectoryId: String) {
        cdkBuilder.activeDirectoryId(activeDirectoryId)
    }

    /**
     * @param aliases An array of one or more DNS alias names that you want to associate with the
     *   Amazon FSx file system. Aliases allow you to use existing DNS names to access the data in
     *   your Amazon FSx file system. You can associate up to 50 aliases with a file system at any
     *   time.
     *
     * For more information, see
     * [Working with DNS Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html)
     * and
     * [Walkthrough 5: Using DNS aliases to access your file system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
     * , including additional steps you must take to be able to access your file system using a DNS
     * alias.
     *
     * An alias name has to meet the following requirements:
     * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
     *   `accounting.example.com` .
     * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
     * * Cannot start or end with a hyphen.
     * * Can start with a numeric.
     *
     * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
     * regardless of how you specify them: as uppercase letters, lowercase letters, or the
     * corresponding letters in escape codes.
     */
    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    /**
     * @param aliases An array of one or more DNS alias names that you want to associate with the
     *   Amazon FSx file system. Aliases allow you to use existing DNS names to access the data in
     *   your Amazon FSx file system. You can associate up to 50 aliases with a file system at any
     *   time.
     *
     * For more information, see
     * [Working with DNS Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html)
     * and
     * [Walkthrough 5: Using DNS aliases to access your file system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
     * , including additional steps you must take to be able to access your file system using a DNS
     * alias.
     *
     * An alias name has to meet the following requirements:
     * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
     *   `accounting.example.com` .
     * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
     * * Cannot start or end with a hyphen.
     * * Can start with a numeric.
     *
     * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
     * regardless of how you specify them: as uppercase letters, lowercase letters, or the
     * corresponding letters in escape codes.
     */
    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    /**
     * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
     *   to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
     *   Windows File Server file system.
     */
    public fun auditLogConfiguration(auditLogConfiguration: IResolvable) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration)
    }

    /**
     * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
     *   to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
     *   Windows File Server file system.
     */
    public fun auditLogConfiguration(
        auditLogConfiguration: CfnFileSystem.AuditLogConfigurationProperty
    ) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration)
    }

    /**
     * @param automaticBackupRetentionDays The number of days to retain automatic backups. Setting
     *   this property to `0` disables automatic backups. You can retain automatic backups for a
     *   maximum of 90 days. The default is `30` .
     */
    public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
    }

    /**
     * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should be
     *   copied to backups. This value defaults to false. If it's set to true, all tags for the file
     *   system are copied to all automatic and user-initiated backups where the user doesn't
     *   specify tags. If this value is true, and you specify one or more tags, only the specified
     *   tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *   backup, no tags are copied from the file system, regardless of this value.
     */
    public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
    }

    /**
     * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should be
     *   copied to backups. This value defaults to false. If it's set to true, all tags for the file
     *   system are copied to all automatic and user-initiated backups where the user doesn't
     *   specify tags. If this value is true, and you specify one or more tags, only the specified
     *   tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *   backup, no tags are copied from the file system, regardless of this value.
     */
    public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
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
     * @param deploymentType Specifies the file system deployment type, valid values are the
     *   following:.
     * * `MULTI_AZ_1` - Deploys a high availability file system that is configured for Multi-AZ
     *   redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy
     *   a Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also
     *   supports HDD storage type
     * * `SINGLE_AZ_1` - (Default) Choose to deploy a file system that is configured for single AZ
     *   redundancy.
     * * `SINGLE_AZ_2` - The latest generation Single AZ file system. Specifies a file system that
     *   is configured for single AZ redundancy and supports HDD storage type.
     *
     * For more information, see
     * [Availability and Durability: Single-AZ and Multi-AZ File Systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html)
     * .
     */
    public fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
    }

    /**
     * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` . This
     *   specifies the subnet in which you want the preferred file server to be located. For in- AWS
     *   applications, we recommend that you launch your clients in the same availability zone as
     *   your preferred file server to reduce cross-availability zone data transfer costs and
     *   minimize latency.
     */
    public fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to join
     *   a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine (SVM)
     *   to a self-managed (including on-premises) Microsoft Active Directory (AD) directory. For
     *   more information, see
     *   [Using Amazon FSx for Windows with your self-managed Microsoft Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html)
     *   or
     *   [Managing FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
     *   .
     */
    public fun selfManagedActiveDirectoryConfiguration(
        selfManagedActiveDirectoryConfiguration: IResolvable
    ) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to join
     *   a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine (SVM)
     *   to a self-managed (including on-premises) Microsoft Active Directory (AD) directory. For
     *   more information, see
     *   [Using Amazon FSx for Windows with your self-managed Microsoft Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html)
     *   or
     *   [Managing FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
     *   .
     */
    public fun selfManagedActiveDirectoryConfiguration(
        selfManagedActiveDirectoryConfiguration:
            CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
    ) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
    }

    /**
     * @param throughputCapacity Sets the throughput capacity of an Amazon FSx file system, measured
     *   in megabytes per second (MB/s), in 2 to the *n* th increments, between 2^3 (8) and 2^11
     *   (2048).
     *
     * To increase storage capacity, a file system must have a minimum throughput capacity of 16
     * MB/s.
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

    public fun build(): CfnFileSystem.WindowsConfigurationProperty {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
