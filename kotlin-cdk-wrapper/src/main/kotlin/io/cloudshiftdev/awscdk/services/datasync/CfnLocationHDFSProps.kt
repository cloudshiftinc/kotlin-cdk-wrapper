@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationHDFS`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationHDFSProps cfnLocationHDFSProps = CfnLocationHDFSProps.builder()
 * .agentArns(List.of("agentArns"))
 * .authenticationType("authenticationType")
 * .nameNodes(List.of(NameNodeProperty.builder()
 * .hostname("hostname")
 * .port(123)
 * .build()))
 * // the properties below are optional
 * .blockSize(123)
 * .kerberosKeytab("kerberosKeytab")
 * .kerberosKrb5Conf("kerberosKrb5Conf")
 * .kerberosPrincipal("kerberosPrincipal")
 * .kmsKeyProviderUri("kmsKeyProviderUri")
 * .qopConfiguration(QopConfigurationProperty.builder()
 * .dataTransferProtection("dataTransferProtection")
 * .rpcProtection("rpcProtection")
 * .build())
 * .replicationFactor(123)
 * .simpleUser("simpleUser")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html)
 */
public interface CfnLocationHDFSProps {
  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * The authentication mode used to determine identity of user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-authenticationtype)
   */
  public fun authenticationType(): String

  /**
   * The size of data blocks to write into the HDFS cluster.
   *
   * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-blocksize)
   */
  public fun blockSize(): Number? = unwrap(this).getBlockSize()

  /**
   * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
   * and the encrypted keys.
   *
   * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value is
   * required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskeytab)
   */
  public fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  /**
   * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
   * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
   * file. If `KERBEROS` is specified for `AuthType` , this value is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskrb5conf)
   */
  public fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  /**
   * The Kerberos principal with access to the files and folders on the HDFS cluster.
   *
   *
   * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberosprincipal)
   */
  public fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  /**
   * The URI of the HDFS cluster's Key Management Server (KMS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kmskeyprovideruri)
   */
  public fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

  /**
   * The NameNode that manages the HDFS namespace.
   *
   * The NameNode performs operations such as opening, closing, and renaming files and directories.
   * The NameNode contains the information to map blocks of data to the DataNodes. You can use only one
   * NameNode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
   */
  public fun nameNodes(): Any

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   *
   * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default to
   * `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter assumes
   * the same value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-qopconfiguration)
   */
  public fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

  /**
   * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
   *
   * By default, data is replicated to three DataNodes.
   *
   * Default: - 3
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-replicationfactor)
   */
  public fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

  /**
   * The user name used to identify the client on the host operating system.
   *
   *
   * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-simpleuser)
   */
  public fun simpleUser(): String? = unwrap(this).getSimpleUser()

  /**
   * A subdirectory in the HDFS cluster.
   *
   * This subdirectory is used to read data from or write data to the HDFS cluster. If the
   * subdirectory isn't specified, it will default to `/` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   *
   * The value can be an empty string. We recommend using tags to name your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationHDFSProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param blockSize The size of data blocks to write into the HDFS cluster.
     * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes
     * (MiB).
     */
    public fun blockSize(blockSize: Number)

    /**
     * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
     * defined Kerberos principal and the encrypted keys.
     * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value
     * is required.
     */
    public fun kerberosKeytab(kerberosKeytab: String)

    /**
     * @param kerberosKrb5Conf The `krb5.conf` file that contains the Kerberos configuration
     * information. You can load the `krb5.conf` by providing a string of the file's contents or an
     * Amazon S3 presigned URL of the file. If `KERBEROS` is specified for `AuthType` , this value is
     * required.
     */
    public fun kerberosKrb5Conf(kerberosKrb5Conf: String)

    /**
     * @param kerberosPrincipal The Kerberos principal with access to the files and folders on the
     * HDFS cluster.
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     */
    public fun kerberosPrincipal(kerberosPrincipal: String)

    /**
     * @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS).
     */
    public fun kmsKeyProviderUri(kmsKeyProviderUri: String)

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    public fun nameNodes(nameNodes: IResolvable)

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    public fun nameNodes(nameNodes: List<Any>)

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    public fun nameNodes(vararg nameNodes: Any)

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    public fun qopConfiguration(qopConfiguration: IResolvable)

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    public fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty)

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a6bc5c179a7ad22e25b89070542c790b4b1a3559413fa519fb6ce70c684201")
    public
        fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty.Builder.() -> Unit)

    /**
     * @param replicationFactor The number of DataNodes to replicate the data to when writing to the
     * HDFS cluster.
     * By default, data is replicated to three DataNodes.
     */
    public fun replicationFactor(replicationFactor: Number)

    /**
     * @param simpleUser The user name used to identify the client on the host operating system.
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     */
    public fun simpleUser(simpleUser: String)

    /**
     * @param subdirectory A subdirectory in the HDFS cluster.
     * This subdirectory is used to read data from or write data to the HDFS cluster. If the
     * subdirectory isn't specified, it will default to `/` .
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     * The value can be an empty string. We recommend using tags to name your resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     * The value can be an empty string. We recommend using tags to name your resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationHDFSProps.builder()

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param blockSize The size of data blocks to write into the HDFS cluster.
     * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes
     * (MiB).
     */
    override fun blockSize(blockSize: Number) {
      cdkBuilder.blockSize(blockSize)
    }

    /**
     * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
     * defined Kerberos principal and the encrypted keys.
     * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value
     * is required.
     */
    override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    /**
     * @param kerberosKrb5Conf The `krb5.conf` file that contains the Kerberos configuration
     * information. You can load the `krb5.conf` by providing a string of the file's contents or an
     * Amazon S3 presigned URL of the file. If `KERBEROS` is specified for `AuthType` , this value is
     * required.
     */
    override fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
      cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    /**
     * @param kerberosPrincipal The Kerberos principal with access to the files and folders on the
     * HDFS cluster.
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     */
    override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    /**
     * @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS).
     */
    override fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
      cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    override fun nameNodes(nameNodes: IResolvable) {
      cdkBuilder.nameNodes(nameNodes.let(IResolvable::unwrap))
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    override fun nameNodes(nameNodes: List<Any>) {
      cdkBuilder.nameNodes(nameNodes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     */
    override fun nameNodes(vararg nameNodes: Any): Unit = nameNodes(nameNodes.toList())

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    override fun qopConfiguration(qopConfiguration: IResolvable) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    override fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(CfnLocationHDFS.QopConfigurationProperty::unwrap))
    }

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster.
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a6bc5c179a7ad22e25b89070542c790b4b1a3559413fa519fb6ce70c684201")
    override
        fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty.Builder.() -> Unit):
        Unit = qopConfiguration(CfnLocationHDFS.QopConfigurationProperty(qopConfiguration))

    /**
     * @param replicationFactor The number of DataNodes to replicate the data to when writing to the
     * HDFS cluster.
     * By default, data is replicated to three DataNodes.
     */
    override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    /**
     * @param simpleUser The user name used to identify the client on the host operating system.
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     */
    override fun simpleUser(simpleUser: String) {
      cdkBuilder.simpleUser(simpleUser)
    }

    /**
     * @param subdirectory A subdirectory in the HDFS cluster.
     * This subdirectory is used to read data from or write data to the HDFS cluster. If the
     * subdirectory isn't specified, it will default to `/` .
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     * The value can be an empty string. We recommend using tags to name your resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     * The value can be an empty string. We recommend using tags to name your resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps,
  ) : CdkObject(cdkObject), CfnLocationHDFSProps {
    /**
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-authenticationtype)
     */
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    /**
     * The size of data blocks to write into the HDFS cluster.
     *
     * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes
     * (MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-blocksize)
     */
    override fun blockSize(): Number? = unwrap(this).getBlockSize()

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
     * and the encrypted keys.
     *
     * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskeytab)
     */
    override fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

    /**
     * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
     * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
     * file. If `KERBEROS` is specified for `AuthType` , this value is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskrb5conf)
     */
    override fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     *
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberosprincipal)
     */
    override fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kmskeyprovideruri)
     */
    override fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     */
    override fun nameNodes(): Any = unwrap(this).getNameNodes()

    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
     * data transfer protection settings configured on the Hadoop Distributed File System (HDFS)
     * cluster.
     *
     * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default
     * to `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter
     * assumes the same value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-qopconfiguration)
     */
    override fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     *
     * By default, data is replicated to three DataNodes.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-replicationfactor)
     */
    override fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

    /**
     * The user name used to identify the client on the host operating system.
     *
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-simpleuser)
     */
    override fun simpleUser(): String? = unwrap(this).getSimpleUser()

    /**
     * A subdirectory in the HDFS cluster.
     *
     * This subdirectory is used to read data from or write data to the HDFS cluster. If the
     * subdirectory isn't specified, it will default to `/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * The key-value pair that represents the tag that you want to add to the location.
     *
     * The value can be an empty string. We recommend using tags to name your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationHDFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps):
        CfnLocationHDFSProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationHDFSProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationHDFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationHDFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationHDFSProps
  }
}
