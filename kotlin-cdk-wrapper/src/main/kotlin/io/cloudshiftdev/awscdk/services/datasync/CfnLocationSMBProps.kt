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
public interface CfnLocationSMBProps {
  /**
   * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
   *
   * You specify an agent by using its Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * The authentication mode used to determine identity of user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-authenticationtype)
   */
  public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  /**
   * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
   *
   * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
   * domains in your environment, configuring this parameter makes sure that DataSync connects to the
   * right SMB file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
   */
  public fun dnsIpAddresses(): List<String> = unwrap(this).getDnsIpAddresses() ?: emptyList()

  /**
   * Specifies the Windows domain name that your SMB file server belongs to.
   *
   * This parameter applies only if `AuthenticationType` is set to `NTLM` .
   *
   * If you have multiple domains in your environment, configuring this parameter makes sure that
   * DataSync connects to the right file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The Base64 string representation of the Keytab file.
   *
   * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
   * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
   * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
   * file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskeytab)
   */
  public fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  /**
   * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
   * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
   * Kerberos realm configuration. To avoid task execution errors, make sure that the service principal
   * name (SPN) in the krb5.conf file matches exactly what you specify for KerberosPrincipal and in
   * your keytab file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskrb5conf)
   */
  public fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  /**
   * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that has
   * permission to access the files, folders, and file metadata in your SMB file server.
   *
   * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look like
   * cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you provide for
   * this parameter doesn't match exactly what's in your keytab or krb5.conf files.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberosprincipal)
   */
  public fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  /**
   * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
   */
  public fun mountOptions(): Any? = unwrap(this).getMountOptions()

  /**
   * Specifies the password of the user who can mount your SMB file server and has permission to
   * access the files and folders involved in your transfer.
   *
   * This parameter applies only if `AuthenticationType` is set to `NTLM` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
   * DataSync agent connects to.
   *
   *
   * If you're using Kerberos authentication, you must specify a domain name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
   */
  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the name of the share exported by your SMB file server where DataSync will read or
   * write data.
   *
   * You can include a subdirectory in the share path (for example, `/path/to/subdirectory` ). Make
   * sure that other SMB clients in your network can also mount this path.
   *
   * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access
   * all of its data. For more information, see [Providing DataSync access to SMB file
   * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
   * .
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
   * Specifies the user that can mount and access the files, folders, and file metadata in your SMB
   * file server.
   *
   * This parameter applies only if `AuthenticationType` is set to `NTLM` .
   *
   * For information about choosing a user with the right level of access for your transfer, see
   * [Providing DataSync access to SMB file
   * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-user)
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * A builder for [CfnLocationSMBProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     * You specify an agent by using its Amazon Resource Name (ARN).
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     * You specify an agent by using its Amazon Resource Name (ARN).
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param authenticationType The authentication mode used to determine identity of user.
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to.
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     */
    public fun dnsIpAddresses(dnsIpAddresses: List<String>)

    /**
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to.
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     */
    public fun dnsIpAddresses(vararg dnsIpAddresses: String)

    /**
     * @param domain Specifies the Windows domain name that your SMB file server belongs to.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * If you have multiple domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     */
    public fun domain(domain: String)

    /**
     * @param kerberosKeytab The Base64 string representation of the Keytab file.
     * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
     * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
     * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
     * file.
     */
    public fun kerberosKeytab(kerberosKeytab: String)

    /**
     * @param kerberosKrb5Conf The string representation of the Krb5Conf file, or the presigned URL
     * to access the Krb5.conf file within an S3 bucket. Specifies a Kerberos configuration file
     * (krb5.conf) that defines your Kerberos realm configuration. To avoid task execution errors, make
     * sure that the service principal name (SPN) in the krb5.conf file matches exactly what you
     * specify for KerberosPrincipal and in your keytab file.
     */
    public fun kerberosKrb5Conf(kerberosKrb5Conf: String)

    /**
     * @param kerberosPrincipal Specifies a service principal name (SPN), which is an identity in
     * your Kerberos realm that has permission to access the files, folders, and file metadata in your
     * SMB file server.
     * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look
     * like cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you
     * provide for this parameter doesn't match exactly what's in your keytab or krb5.conf files.
     */
    public fun kerberosPrincipal(kerberosPrincipal: String)

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
     * @param password Specifies the password of the user who can mount your SMB file server and has
     * permission to access the files and folders involved in your transfer.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     */
    public fun password(password: String)

    /**
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file
     * server that your DataSync agent connects to.
     *
     * If you're using Kerberos authentication, you must specify a domain name.
     */
    public fun serverHostname(serverHostname: String)

    /**
     * @param subdirectory Specifies the name of the share exported by your SMB file server where
     * DataSync will read or write data.
     * You can include a subdirectory in the share path (for example, `/path/to/subdirectory` ).
     * Make sure that other SMB clients in your network can also mount this path.
     *
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access
     * all of its data. For more information, see [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
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
     * @param user Specifies the user that can mount and access the files, folders, and file
     * metadata in your SMB file server.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * For information about choosing a user with the right level of access for your transfer, see
     * [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     */
    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationSMBProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationSMBProps.builder()

    /**
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     * You specify an agent by using its Amazon Resource Name (ARN).
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns Specifies the DataSync agent (or agents) that can connect to your SMB file
     * server. 
     * You specify an agent by using its Amazon Resource Name (ARN).
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param authenticationType The authentication mode used to determine identity of user.
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to.
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     */
    override fun dnsIpAddresses(dnsIpAddresses: List<String>) {
      cdkBuilder.dnsIpAddresses(dnsIpAddresses)
    }

    /**
     * @param dnsIpAddresses Specifies the IPv4 addresses for the DNS servers that your SMB file
     * server belongs to.
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     */
    override fun dnsIpAddresses(vararg dnsIpAddresses: String): Unit =
        dnsIpAddresses(dnsIpAddresses.toList())

    /**
     * @param domain Specifies the Windows domain name that your SMB file server belongs to.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * If you have multiple domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param kerberosKeytab The Base64 string representation of the Keytab file.
     * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
     * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
     * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
     * file.
     */
    override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    /**
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
     * @param kerberosPrincipal Specifies a service principal name (SPN), which is an identity in
     * your Kerberos realm that has permission to access the files, folders, and file metadata in your
     * SMB file server.
     * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look
     * like cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you
     * provide for this parameter doesn't match exactly what's in your keytab or krb5.conf files.
     */
    override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mountOptions Specifies the version of the SMB protocol that DataSync uses to access
     * your SMB file server.
     */
    override fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(CfnLocationSMB.MountOptionsProperty.Companion::unwrap))
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
     * @param password Specifies the password of the user who can mount your SMB file server and has
     * permission to access the files and folders involved in your transfer.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file
     * server that your DataSync agent connects to.
     *
     * If you're using Kerberos authentication, you must specify a domain name.
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param subdirectory Specifies the name of the share exported by your SMB file server where
     * DataSync will read or write data.
     * You can include a subdirectory in the share path (for example, `/path/to/subdirectory` ).
     * Make sure that other SMB clients in your network can also mount this path.
     *
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access
     * all of its data. For more information, see [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param user Specifies the user that can mount and access the files, folders, and file
     * metadata in your SMB file server.
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * For information about choosing a user with the right level of access for your transfer, see
     * [Providing DataSync access to SMB file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions)
     * .
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationSMBProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMBProps,
  ) : CdkObject(cdkObject),
      CfnLocationSMBProps {
    /**
     * Specifies the DataSync agent (or agents) that can connect to your SMB file server.
     *
     * You specify an agent by using its Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-authenticationtype)
     */
    override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    /**
     * Specifies the IPv4 addresses for the DNS servers that your SMB file server belongs to.
     *
     * This parameter applies only if AuthenticationType is set to KERBEROS. If you have multiple
     * domains in your environment, configuring this parameter makes sure that DataSync connects to the
     * right SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-dnsipaddresses)
     */
    override fun dnsIpAddresses(): List<String> = unwrap(this).getDnsIpAddresses() ?: emptyList()

    /**
     * Specifies the Windows domain name that your SMB file server belongs to.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * If you have multiple domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The Base64 string representation of the Keytab file.
     *
     * Specifies your Kerberos key table (keytab) file, which includes mappings between your service
     * principal name (SPN) and encryption keys. To avoid task execution errors, make sure that the SPN
     * in the keytab file matches exactly what you specify for KerberosPrincipal and in your krb5.conf
     * file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskeytab)
     */
    override fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

    /**
     * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf
     * file within an S3 bucket. Specifies a Kerberos configuration file (krb5.conf) that defines your
     * Kerberos realm configuration. To avoid task execution errors, make sure that the service
     * principal name (SPN) in the krb5.conf file matches exactly what you specify for
     * KerberosPrincipal and in your keytab file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberoskrb5conf)
     */
    override fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

    /**
     * Specifies a service principal name (SPN), which is an identity in your Kerberos realm that
     * has permission to access the files, folders, and file metadata in your SMB file server.
     *
     * SPNs are case sensitive and must include a prepended cifs/. For example, an SPN might look
     * like cifs/kerberosuser&#64;EXAMPLE.COM. Your task execution will fail if the SPN that you
     * provide for this parameter doesn't match exactly what's in your keytab or krb5.conf files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-kerberosprincipal)
     */
    override fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-mountoptions)
     */
    override fun mountOptions(): Any? = unwrap(this).getMountOptions()

    /**
     * Specifies the password of the user who can mount your SMB file server and has permission to
     * access the files and folders involved in your transfer.
     *
     * This parameter applies only if `AuthenticationType` is set to `NTLM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * Specifies the domain name or IP address (IPv4 or IPv6) of the SMB file server that your
     * DataSync agent connects to.
     *
     *
     * If you're using Kerberos authentication, you must specify a domain name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html#cfn-datasync-locationsmb-serverhostname)
     */
    override fun serverHostname(): String? = unwrap(this).getServerHostname()

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
     */
    override fun user(): String? = unwrap(this).getUser()
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
