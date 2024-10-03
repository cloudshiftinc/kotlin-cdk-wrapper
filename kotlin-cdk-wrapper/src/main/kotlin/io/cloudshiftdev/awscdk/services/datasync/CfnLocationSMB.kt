@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::LocationSMB` resource specifies a Server Message Block (SMB) location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
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
public open class CfnLocationSMB(
  cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationSMBProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnLocationSMB(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLocationSMBProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationSMBProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLocationSMBProps(props)
  )

  /**
   * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the specified SMB file system.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified SMB location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Specifies the name of the Active Directory domain that your SMB file server belongs to.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the name of the Active Directory domain that your SMB file server belongs to.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   */
  public open fun mountOptions(): Any? = unwrap(this).getMountOptions()

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   */
  public open fun mountOptions(`value`: IResolvable) {
    unwrap(this).setMountOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   */
  public open fun mountOptions(`value`: MountOptionsProperty) {
    unwrap(this).setMountOptions(`value`.let(MountOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca7f91908099c1d5940cc748ba4707d29f11745e27afd1697a2b4e306575d864")
  public open fun mountOptions(`value`: MountOptionsProperty.Builder.() -> Unit): Unit =
      mountOptions(MountOptionsProperty(`value`))

  /**
   * The password of the user who can mount the share and has the permissions to access files and
   * folders in the SMB share.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The password of the user who can mount the share and has the permissions to access files and
   * folders in the SMB share.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
   * DataSync agent will mount.
   */
  public open fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
   * DataSync agent will mount.
   */
  public open fun serverHostname(`value`: String) {
    unwrap(this).setServerHostname(`value`)
  }

  /**
   * The subdirectory in the SMB file system that is used to read data from the SMB source location
   * or write data to the SMB destination.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * The subdirectory in the SMB file system that is used to read data from the SMB source location
   * or write data to the SMB destination.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The user who can mount the share and has the permissions to access files and folders in the SMB
   * share.
   */
  public open fun user(): String = unwrap(this).getUser()

  /**
   * The user who can mount the share and has the permissions to access files and folders in the SMB
   * share.
   */
  public open fun user(`value`: String) {
    unwrap(this).setUser(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationSMB].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     * @param domain Specifies the name of the Active Directory domain that your SMB file server
     * belongs to. 
     */
    public fun domain(domain: String)

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    public fun mountOptions(mountOptions: IResolvable)

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    public fun mountOptions(mountOptions: MountOptionsProperty)

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51930ce9ee3cf3fe5eb351c76bcc50e4ab9e856db9e41ba2273cffed3ca556d5")
    public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)

    /**
     * The password of the user who can mount the share and has the permissions to access files and
     * folders in the SMB share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     * @param password The password of the user who can mount the share and has the permissions to
     * access files and folders in the SMB share. 
     */
    public fun password(password: String)

    /**
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
     * DataSync agent will mount.
     *
     *
     * You can't specify an IP version 6 (IPv6) address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     * @param serverHostname Specifies the Domain Name Service (DNS) name or IP address of the SMB
     * file server that your DataSync agent will mount. 
     */
    public fun serverHostname(serverHostname: String)

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
     * @param subdirectory The subdirectory in the SMB file system that is used to read data from
     * the SMB source location or write data to the SMB destination. 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user who can mount the share and has the permissions to access files and folders in the
     * SMB share.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     * @param user The user who can mount the share and has the permissions to access files and
     * folders in the SMB share. 
     */
    public fun user(user: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder.create(scope, id)

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Server Message Block (SMB) location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of agents to use for a Server Message Block
     * (SMB) location. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     *
     * If you have multiple Active Directory domains in your environment, configuring this parameter
     * makes sure that DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     * @param domain Specifies the name of the Active Directory domain that your SMB file server
     * belongs to. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    override fun mountOptions(mountOptions: MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51930ce9ee3cf3fe5eb351c76bcc50e4ab9e856db9e41ba2273cffed3ca556d5")
    override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
        mountOptions(MountOptionsProperty(mountOptions))

    /**
     * The password of the user who can mount the share and has the permissions to access files and
     * folders in the SMB share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     * @param password The password of the user who can mount the share and has the permissions to
     * access files and folders in the SMB share. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your
     * DataSync agent will mount.
     *
     *
     * You can't specify an IP version 6 (IPv6) address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     * @param serverHostname Specifies the Domain Name Service (DNS) name or IP address of the SMB
     * file server that your DataSync agent will mount. 
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

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
     * @param subdirectory The subdirectory in the SMB file system that is used to read data from
     * the SMB source location or write data to the SMB destination. 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user who can mount the share and has the permissions to access files and folders in the
     * SMB share.
     *
     * For information about choosing a user name that ensures sufficient permissions to files,
     * folders, and metadata, see
     * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     * @param user The user who can mount the share and has the permissions to access files and
     * folders in the SMB share. 
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationSMB = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationSMB.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationSMB {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationSMB(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB):
        CfnLocationSMB = CfnLocationSMB(cdkObject)

    internal fun unwrap(wrapped: CfnLocationSMB):
        software.amazon.awscdk.services.datasync.CfnLocationSMB = wrapped.cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationSMB
  }

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * MountOptionsProperty mountOptionsProperty = MountOptionsProperty.builder()
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationsmb-mountoptions.html)
   */
  public interface MountOptionsProperty {
    /**
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with
     * your SMB file server.
     *
     * You also can configure DataSync to use a specific SMB version, but we recommend doing this
     * only if DataSync has trouble negotiating with the SMB file server automatically.
     *
     * These are the following options for configuring the SMB version:
     *
     * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
     * SMB that they mutually support between 2.1 and 3.1.1.
     *
     * This is the recommended option. If you instead choose a specific version that your file
     * server doesn't support, you may get an `Operation Not Supported` error.
     *
     * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
     * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
     * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
     * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
     *
     *
     * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
     * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationsmb-mountoptions.html#cfn-datasync-locationsmb-mountoptions-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [MountOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param version By default, DataSync automatically chooses an SMB protocol version based on
       * negotiation with your SMB file server.
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.builder()

      /**
       * @param version By default, DataSync automatically chooses an SMB protocol version based on
       * negotiation with your SMB file server.
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty,
    ) : CdkObject(cdkObject),
        MountOptionsProperty {
      /**
       * By default, DataSync automatically chooses an SMB protocol version based on negotiation
       * with your SMB file server.
       *
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationsmb-mountoptions.html#cfn-datasync-locationsmb-mountoptions-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty):
          MountOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? MountOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty
    }
  }
}
