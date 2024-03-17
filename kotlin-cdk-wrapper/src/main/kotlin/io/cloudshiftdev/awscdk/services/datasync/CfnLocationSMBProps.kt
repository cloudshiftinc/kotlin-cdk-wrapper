@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationSMB`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationSMBProps cfnLocationSMBProps = CfnLocationSMBProps.builder()
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
public interface CfnLocationSMBProps {
  /**
   * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * Specifies the name of the Active Directory domain that your SMB file server belongs to.
   *
   * If you have multiple Active Directory domains in your environment, configuring this parameter
   * makes sure that DataSync connects to the right file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
   */
  public fun mountOptions(): Any? = unwrap(this).getMountOptions()

  /**
   * The password of the user who can mount the share and has the permissions to access files and
   * folders in the SMB share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
   * DataSync agent will mount.
   *
   *
   * You can't specify an IP version 6 (IPv6) address.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
   */
  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * The subdirectory in the SMB file system that is used to read data from the SMB source location
   * or write data to the SMB destination.
   *
   * The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
   * path. The path should be such that it can be mounted by other SMB clients in your network.
   *
   *
   * `Subdirectory` must be specified with forward slashes. For example, `/path/to/folder` .
   *
   *
   * To transfer all the data in the folder you specified, DataSync must have permissions to mount
   * the SMB share, as well as to access all the data in that share. To ensure this, either make sure
   * that the user name and password specified belongs to the user who can mount the share, and who has
   * the appropriate permissions for all of the files and directories that you want DataSync to access,
   * or use credentials of a member of the Backup Operators group to mount the share. Doing either one
   * enables the agent to access the data. For the agent to access directories, you must additionally
   * enable all execute access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user who can mount the share and has the permissions to access files and folders in the SMB
   * share.
   *
   * For information about choosing a user name that ensures sufficient permissions to files,
   * folders, and metadata, see
   * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
   */
  public fun user(): String

  /**
   * A builder for [CfnLocationSMBProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param domain Specifies the name of the Active Directory domain that your SMB file server
     * belongs to.
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file server.
     */
    public fun domain(domain: String)

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    public fun mountOptions(mountOptions: IResolvable)

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty)

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d02ea361984d38f99523348a1b0e8d6ff0e0801e47f14eb72005ef7c84d1c4")
    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty.Builder.() -> Unit)

    /**
     * @param password The password of the user who can mount the share and has the permissions to
     * access files and folders in the SMB share.
     */
    public fun password(password: String)

    /**
     * @param serverHostname Specifies the Domain Name Service (DNS) name or IP address of the SMB
     * file server that your DataSync agent will mount.
     *
     * You can't specify an IP version 6 (IPv6) address.
     */
    public fun serverHostname(serverHostname: String)

    /**
     * @param subdirectory The subdirectory in the SMB file system that is used to read data from
     * the SMB source location or write data to the SMB destination.
     * The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     *
     *
     * `Subdirectory` must be specified with forward slashes. For example, `/path/to/folder` .
     *
     *
     * To transfer all the data in the folder you specified, DataSync must have permissions to mount
     * the SMB share, as well as to access all the data in that share. To ensure this, either make sure
     * that the user name and password specified belongs to the user who can mount the share, and who
     * has the appropriate permissions for all of the files and directories that you want DataSync to
     * access, or use credentials of a member of the Backup Operators group to mount the share. Doing
     * either one enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param user The user who can mount the share and has the permissions to access files and
     * folders in the SMB share. 
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     */
    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationSMBProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationSMBProps.builder()

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param domain Specifies the name of the Active Directory domain that your SMB file server
     * belongs to.
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file server.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    override fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(CfnLocationSMB.MountOptionsProperty::unwrap))
    }

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d02ea361984d38f99523348a1b0e8d6ff0e0801e47f14eb72005ef7c84d1c4")
    override fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty.Builder.() -> Unit):
        Unit = mountOptions(CfnLocationSMB.MountOptionsProperty(mountOptions))

    /**
     * @param password The password of the user who can mount the share and has the permissions to
     * access files and folders in the SMB share.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param serverHostname Specifies the Domain Name Service (DNS) name or IP address of the SMB
     * file server that your DataSync agent will mount.
     *
     * You can't specify an IP version 6 (IPv6) address.
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param subdirectory The subdirectory in the SMB file system that is used to read data from
     * the SMB source location or write data to the SMB destination.
     * The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     *
     *
     * `Subdirectory` must be specified with forward slashes. For example, `/path/to/folder` .
     *
     *
     * To transfer all the data in the folder you specified, DataSync must have permissions to mount
     * the SMB share, as well as to access all the data in that share. To ensure this, either make sure
     * that the user name and password specified belongs to the user who can mount the share, and who
     * has the appropriate permissions for all of the files and directories that you want DataSync to
     * access, or use credentials of a member of the Backup Operators group to mount the share. Doing
     * either one enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param user The user who can mount the share and has the permissions to access files and
     * folders in the SMB share. 
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationSMBProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMBProps,
  ) : CdkObject(cdkObject), CfnLocationSMBProps {
    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     */
    override fun mountOptions(): Any? = unwrap(this).getMountOptions()

    /**
     * The password of the user who can mount the share and has the permissions to access files and
     * folders in the SMB share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
     * DataSync agent will mount.
     *
     *
     * You can't specify an IP version 6 (IPv6) address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     */
    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    /**
     * The subdirectory in the SMB file system that is used to read data from the SMB source
     * location or write data to the SMB destination.
     *
     * The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     *
     *
     * `Subdirectory` must be specified with forward slashes. For example, `/path/to/folder` .
     *
     *
     * To transfer all the data in the folder you specified, DataSync must have permissions to mount
     * the SMB share, as well as to access all the data in that share. To ensure this, either make sure
     * that the user name and password specified belongs to the user who can mount the share, and who
     * has the appropriate permissions for all of the files and directories that you want DataSync to
     * access, or use credentials of a member of the Backup Operators group to mount the share. Doing
     * either one enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user who can mount the share and has the permissions to access files and folders in the
     * SMB share.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     */
    override fun user(): String = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationSMBProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMBProps):
        CfnLocationSMBProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationSMBProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationSMBProps):
        software.amazon.awscdk.services.datasync.CfnLocationSMBProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationSMBProps
  }
}
