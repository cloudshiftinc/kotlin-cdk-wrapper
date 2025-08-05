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
 * The `AWS::DataSync::LocationSMB` resource specifies a Server Message Block (SMB) location that
 * AWS DataSync can use as a transfer source or destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationSMB cfnLocationSMB = CfnLocationSMB.Builder.create(this, "MyCfnLocationSMB")
 * .agentArns(List.of("agentArns"))
 * // the properties below are optional
 * .authenticationType("authenticationType")
 * .dnsIpAddresses(List.of("dnsIpAddresses"))
 * .domain("domain")
 * .kerberosKeytab("kerberosKeytab")
 * .kerberosKrb5Conf("kerberosKrb5Conf")
 * .kerberosPrincipal("kerberosPrincipal")
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
 * .user("user")
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
   * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the specified SMB location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified SMB location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * The authentication mode used to determine identity of user.
   */
  public open fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  /**
   * The authentication mode used to determine identity of user.
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
   */
  public open fun dnsIpAddresses(): List<String> = unwrap(this).getDnsIpAddresses() ?: emptyList()

  /**
   * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
   */
  public open fun dnsIpAddresses(`value`: List<String>) {
    unwrap(this).setDnsIpAddresses(`value`)
  }

  /**
   * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
   */
  public open fun dnsIpAddresses(vararg `value`: String): Unit = dnsIpAddresses(`value`.toList())

  /**
   * Specifies the Windows domain name that your SMB file server belongs to.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the Windows domain name that your SMB file server belongs to.
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
   * The Base64 string representation of the Keytab file.
   */
  public open fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  /**
   * The Base64 string representation of the Keytab file.
   */
  public open fun kerberosKeytab(`value`: String) {
    unwrap(this).setKerberosKeytab(`value`)
  }

  /**
   * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
   * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
   * Kerberos realm configuration. To avoid task execution errors, make sure that the service principal
   * name (SPN) in the krb5.conf file matches exactly what you specify for KerberosPrincipal and in
   * your keytab file.
   */
  public open fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  /**
   * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
   * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
   * Kerberos realm configuration. To avoid task execution errors, make sure that the service principal
   * name (SPN) in the krb5.conf file matches exactly what you specify for KerberosPrincipal and in
   * your keytab file.
   */
  public open fun kerberosKrb5Conf(`value`: String) {
    unwrap(this).setKerberosKrb5Conf(`value`)
  }

  /**
   * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that has
   * permission to access the files, folders, and file metadata in your SMB file server.
   */
  public open fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  /**
   * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that has
   * permission to access the files, folders, and file metadata in your SMB file server.
   */
  public open fun kerberosPrincipal(`value`: String) {
    unwrap(this).setKerberosPrincipal(`value`)
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
   * Specifies the password of the user who can mount your SMB file server and has permission to
   * access the files and folders involved in your transfer.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * Specifies the password of the user who can mount your SMB file server and has permission to
   * access the files and folders involved in your transfer.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
   * DataSync agent connects to.
   */
  public open fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
   * DataSync agent connects to.
   */
  public open fun serverHostname(`value`: String) {
    unwrap(this).setServerHostname(`value`)
  }

  /**
   * Specifies the name of the share exported by your SMB file server where DataSync will read or
   * write data.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies the name of the share exported by your SMB file server where DataSync will read or
   * write data.
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
   * Specifies the user that can mount and access the files, folders, and file metadata in your SMB
   * file server.
   */
  public open fun user(): String? = unwrap(this).getUser()

  /**
   * Specifies the user that can mount and access the files, folders, and file metadata in your SMB
   * file server.
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
     * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
     *
     * You specify an agent by using its Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
     *
     * You specify an agent by using its Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-authenticationtype)
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
     *
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to. 
     */
    public fun dnsIpAddresses(dnsIpAddresses: List<String>)

    /**
     * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
     *
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to. 
     */
    public fun dnsIpAddresses(vararg dnsIpAddresses: String)

    /**
     * Specifies the Windows domain name that your SMB file server belongs to.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * If you have multiple domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     * @param domain Specifies the Windows domain name that your SMB file server belongs to. 
     */
    public fun domain(domain: String)

    /**
     * The Base64 string representation of the Keytab file.
     *
     * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
     * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
     * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
     * file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskeytab)
     * @param kerberosKeytab The Base64 string representation of the Keytab file. 
     */
    public fun kerberosKeytab(kerberosKeytab: String)

    /**
     * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
     * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
     * Kerberos realm configuration. To avoid task execution errors, make sure that the service
     * principal name (SPN) in the krb5.conf file matches exactly what you specify for
     * KerberosPrincipal and in your keytab file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskrb5conf)
     * @param kerberosKrb5Conf The string representation of the Krb5Conf file, or the presigned URL
     * to access the Krb5.conf file within an S3 bucket. Specifies a Kerberos configuration file
     * (krb5.conf) that defines your Kerberos realm configuration. To avoid task execution errors, make
     * sure that the service principal name (SPN) in the krb5.conf file matches exactly what you
     * specify for KerberosPrincipal and in your keytab file. 
     */
    public fun kerberosKrb5Conf(kerberosKrb5Conf: String)

    /**
     * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that
     * has permission to access the files, folders, and file metadata in your SMB file server.
     *
     * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look
     * like cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you
     * provide for this parameter doesn't match exactly what's in your keytab or krb5.conf files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberosprincipal)
     * @param kerberosPrincipal Specifies a service principal name (SPN), which is an identity in
     * your Kerberos realm that has permission to access the files, folders, and file metadata in your
     * SMB file server. 
     */
    public fun kerberosPrincipal(kerberosPrincipal: String)

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
     * Specifies the password of the user who can mount your SMB file server and has permission to
     * access the files and folders involved in your transfer.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     * @param password Specifies the password of the user who can mount your SMB file server and has
     * permission to access the files and folders involved in your transfer. 
     */
    public fun password(password: String)

    /**
     * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
     * DataSync agent connects to.
     *
     *
     * If you're using Kerberos authentication, you must specify a domain name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file
     * server that your DataSync agent connects to. 
     */
    public fun serverHostname(serverHostname: String)

    /**
     * Specifies the name of the share exported by your SMB file server where DataSync will read or
     * write data.
     *
     * You can include a subdirectory in the share path (for example, `/path/to/subdirectory` ).
     * Make sure that other SMB clients in your network can also mount this path.
     *
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access
     * all of its data. For more information, see [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-subdirectory)
     * @param subdirectory Specifies the name of the share exported by your SMB file server where
     * DataSync will read or write data. 
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
     * Specifies the user that can mount and access the files, folders, and file metadata in your
     * SMB file server.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * For information about choosing a user with the right level of access for your transfer, see
     * [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     * @param user Specifies the user that can mount and access the files, folders, and file
     * metadata in your SMB file server. 
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
     * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
     *
     * You specify an agent by using its Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
     *
     * You specify an agent by using its Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-authenticationtype)
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
     *
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to. 
     */
    override fun dnsIpAddresses(dnsIpAddresses: List<String>) {
      cdkBuilder.dnsIpAddresses(dnsIpAddresses)
    }

    /**
     * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
     *
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to. 
     */
    override fun dnsIpAddresses(vararg dnsIpAddresses: String): Unit =
        dnsIpAddresses(dnsIpAddresses.toList())

    /**
     * Specifies the Windows domain name that your SMB file server belongs to.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * If you have multiple domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     * @param domain Specifies the Windows domain name that your SMB file server belongs to. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The Base64 string representation of the Keytab file.
     *
     * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
     * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
     * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
     * file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskeytab)
     * @param kerberosKeytab The Base64 string representation of the Keytab file. 
     */
    override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    /**
     * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
     * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
     * Kerberos realm configuration. To avoid task execution errors, make sure that the service
     * principal name (SPN) in the krb5.conf file matches exactly what you specify for
     * KerberosPrincipal and in your keytab file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskrb5conf)
     * @param kerberosKrb5Conf The string representation of the Krb5Conf file, or the presigned URL
     * to access the Krb5.conf file within an S3 bucket. Specifies a Kerberos configuration file
     * (krb5.conf) that defines your Kerberos realm configuration. To avoid task execution errors, make
     * sure that the service principal name (SPN) in the krb5.conf file matches exactly what you
     * specify for KerberosPrincipal and in your keytab file. 
     */
    override fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
      cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    /**
     * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that
     * has permission to access the files, folders, and file metadata in your SMB file server.
     *
     * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look
     * like cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you
     * provide for this parameter doesn't match exactly what's in your keytab or krb5.conf files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberosprincipal)
     * @param kerberosPrincipal Specifies a service principal name (SPN), which is an identity in
     * your Kerberos realm that has permission to access the files, folders, and file metadata in your
     * SMB file server. 
     */
    override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
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
     * Specifies the password of the user who can mount your SMB file server and has permission to
     * access the files and folders involved in your transfer.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     * @param password Specifies the password of the user who can mount your SMB file server and has
     * permission to access the files and folders involved in your transfer. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
     * DataSync agent connects to.
     *
     *
     * If you're using Kerberos authentication, you must specify a domain name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file
     * server that your DataSync agent connects to. 
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * Specifies the name of the share exported by your SMB file server where DataSync will read or
     * write data.
     *
     * You can include a subdirectory in the share path (for example, `/path/to/subdirectory` ).
     * Make sure that other SMB clients in your network can also mount this path.
     *
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access
     * all of its data. For more information, see [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-subdirectory)
     * @param subdirectory Specifies the name of the share exported by your SMB file server where
     * DataSync will read or write data. 
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
     * Specifies the user that can mount and access the files, folders, and file metadata in your
     * SMB file server.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * For information about choosing a user with the right level of access for your transfer, see
     * [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
     * @param user Specifies the user that can mount and access the files, folders, and file
     * metadata in your SMB file server. 
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
