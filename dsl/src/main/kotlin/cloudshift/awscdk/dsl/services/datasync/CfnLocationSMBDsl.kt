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
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationSMB` resource specifies a Server Message Block (SMB) location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationSMB cfnLocationSMB = CfnLocationSMB.Builder.create(this, "MyCfnLocationSMB")
 * .agentArns(List.of("agentArns"))
 * .user("user")
 * // the properties below are optional
 * .domain("domain")
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .password("password")
 * .serverHostname("serverHostname")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html)
 */
@CdkDslMarker
public class CfnLocationSMBDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationSMB.Builder = CfnLocationSMB.Builder.create(scope, id)

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     *
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     *   (SMB) location.
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     *
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     *   (SMB) location.
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    /**
     * Specifies the Windows domain name that your SMB file server belongs to.
     *
     * For more information, see
     * [required permissions](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * for SMB locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     *
     * @param domain Specifies the Windows domain name that your SMB file server belongs to.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     *
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     *   your SMB file server.
     */
    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     *
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     *   your SMB file server.
     */
    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * The password of the user who can mount the share and has the permissions to access files and
     * folders in the SMB share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     *
     * @param password The password of the user who can mount the share and has the permissions to
     *   access files and folders in the SMB share.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
     * DataSync agent will mount.
     *
     * You can't specify an IP version 6 (IPv6) address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     *
     * @param serverHostname Specifies the Domain Name Service (DNS) name or IP address of the SMB
     *   file server that your DataSync agent will mount.
     */
    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * The subdirectory in the SMB file system that is used to read data from the SMB source
     * location or write data to the SMB destination.
     *
     * The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     *
     * `Subdirectory` must be specified with forward slashes. For example, `/path/to/folder` .
     *
     * To transfer all the data in the folder you specified, DataSync must have permissions to mount
     * the SMB share, as well as to access all the data in that share. To ensure this, either make
     * sure that the user name and password specified belongs to the user who can mount the share,
     * and who has the appropriate permissions for all of the files and directories that you want
     * DataSync to access, or use credentials of a member of the Backup Operators group to mount the
     * share. Doing either one enables the agent to access the data. For the agent to access
     * directories, you must additionally enable all execute access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-subdirectory)
     *
     * @param subdirectory The subdirectory in the SMB file system that is used to read data from
     *   the SMB source location or write data to the SMB destination.
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The user who can mount the share and has the permissions to access files and folders in the
     * SMB share.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     *
     * @param user The user who can mount the share and has the permissions to access files and
     *   folders in the SMB share.
     */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnLocationSMB {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
