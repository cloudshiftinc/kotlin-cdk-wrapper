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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationFSxONTAP` resource creates an endpoint for an Amazon FSx for NetApp
 * ONTAP file system.
 *
 * AWS DataSync can access this endpoint as a source or destination location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationFSxONTAP cfnLocationFSxONTAP = CfnLocationFSxONTAP.Builder.create(this,
 * "MyCfnLocationFSxONTAP")
 * .securityGroupArns(List.of("securityGroupArns"))
 * .storageVirtualMachineArn("storageVirtualMachineArn")
 * // the properties below are optional
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(NfsMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .smb(SMBProperty.builder()
 * .mountOptions(SmbMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .password("password")
 * .user("user")
 * // the properties below are optional
 * .domain("domain")
 * .build())
 * .build())
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html)
 */
@CdkDslMarker
public class CfnLocationFSxONTAPDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationFSxONTAP.Builder =
        CfnLocationFSxONTAP.Builder.create(scope, id)

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     *
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     *   FSx file system.
     */
    public fun protocol(protocol: IResolvable) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     *
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     *   FSx file system.
     */
    public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     *
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     *   that DataSync can use to access your FSx for ONTAP file system.
     */
    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     *
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     *   that DataSync can use to access your FSx for ONTAP file system.
     */
    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    /**
     * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
     * copy data to or from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-storagevirtualmachinearn)
     *
     * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in
     *   your file system where you want to copy data to or from.
     */
    public fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
        cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
    }

    /**
     * Specifies a path to the file share in the SVM where you'll copy your data.
     *
     * You can specify a junction path (also known as a mount point), qtree path (for NFS file
     * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
     * `/vol1/tree1` , or `/share1` .
     *
     * Don't specify a junction path in the SVM's root volume. For more information, see
     * [Managing FSx for ONTAP storage virtual machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
     * in the *Amazon FSx for NetApp ONTAP User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-subdirectory)
     *
     * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your
     *   data.
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationFSxONTAP {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
