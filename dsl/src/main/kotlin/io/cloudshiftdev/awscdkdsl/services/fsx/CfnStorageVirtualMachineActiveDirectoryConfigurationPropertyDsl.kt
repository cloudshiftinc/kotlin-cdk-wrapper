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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine

/**
 * Describes the self-managed Microsoft Active Directory to which you want to join the SVM.
 *
 * Joining an Active Directory provides user authentication and access control for SMB clients,
 * including Microsoft Windows and macOS clients accessing the file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * ActiveDirectoryConfigurationProperty activeDirectoryConfigurationProperty =
 * ActiveDirectoryConfigurationProperty.builder()
 * .netBiosName("netBiosName")
 * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
 * .dnsIps(List.of("dnsIps"))
 * .domainName("domainName")
 * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .password("password")
 * .userName("userName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html)
 */
@CdkDslMarker
public class CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl {
    private val cdkBuilder: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder =
        CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.builder()

    /**
     * @param netBiosName The NetBIOS name of the Active Directory computer object that will be
     *   created for your SVM.
     */
    public fun netBiosName(netBiosName: String) {
        cdkBuilder.netBiosName(netBiosName)
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to join
     *   the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
     *   Microsoft Active Directory directory.
     */
    public fun selfManagedActiveDirectoryConfiguration(
        selfManagedActiveDirectoryConfiguration: IResolvable
    ) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to join
     *   the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
     *   Microsoft Active Directory directory.
     */
    public fun selfManagedActiveDirectoryConfiguration(
        selfManagedActiveDirectoryConfiguration:
            CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
    ) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
    }

    public fun build(): CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty =
        cdkBuilder.build()
}
