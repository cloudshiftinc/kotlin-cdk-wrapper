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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps

/**
 * Properties for defining a `CfnStorageVirtualMachine`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * CfnStorageVirtualMachineProps cfnStorageVirtualMachineProps =
 * CfnStorageVirtualMachineProps.builder()
 * .fileSystemId("fileSystemId")
 * .name("name")
 * // the properties below are optional
 * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
 * .netBiosName("netBiosName")
 * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
 * .dnsIps(List.of("dnsIps"))
 * .domainName("domainName")
 * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .password("password")
 * .userName("userName")
 * .build())
 * .build())
 * .rootVolumeSecurityStyle("rootVolumeSecurityStyle")
 * .svmAdminPassword("svmAdminPassword")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html)
 */
@CdkDslMarker
public class CfnStorageVirtualMachinePropsDsl {
    private val cdkBuilder: CfnStorageVirtualMachineProps.Builder =
        CfnStorageVirtualMachineProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     *   which the SVM is joined, if applicable.
     */
    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     *   which the SVM is joined, if applicable.
     */
    public fun activeDirectoryConfiguration(
        activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
    ) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    /** @param fileSystemId Specifies the FSx for ONTAP file system on which to create the SVM. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /** @param name The name of the SVM. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param rootVolumeSecurityStyle The security style of the root volume of the SVM. Specify one
     *   of the following values:.
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     *   clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Windows administrator, the majority of users are
     *   SMB clients, and an application accessing the data uses a Windows user as the service
     *   account.
     * * `MIXED` if the file system is managed by both UNIX and Windows administrators and users
     *   consist of both NFS and SMB clients.
     */
    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
        cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    /**
     * @param svmAdminPassword Specifies the password to use when logging on to the SVM using a
     *   secure shell (SSH) connection to the SVM's management endpoint. Doing so enables you to
     *   manage the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a password,
     *   you can still use the file system's `fsxadmin` user to manage the SVM. For more
     *   information, see
     *   [Managing SVMs using the NetApp ONTAP CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
     *   in the *FSx for ONTAP User Guide* .
     */
    public fun svmAdminPassword(svmAdminPassword: String) {
        cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageVirtualMachineProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
