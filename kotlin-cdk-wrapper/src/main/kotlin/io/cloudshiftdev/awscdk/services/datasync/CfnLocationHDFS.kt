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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::LocationHDFS` resource specifies an endpoint for a Hadoop Distributed File
 * System (HDFS).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationHDFS cfnLocationHDFS = CfnLocationHDFS.Builder.create(this, "MyCfnLocationHDFS")
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
public open class CfnLocationHDFS internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the HDFS cluster location to describe.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the HDFS cluster location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * The authentication mode used to determine identity of user.
   */
  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  /**
   * The authentication mode used to determine identity of user.
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * The size of data blocks to write into the HDFS cluster.
   */
  public open fun blockSize(): Number? = unwrap(this).getBlockSize()

  /**
   * The size of data blocks to write into the HDFS cluster.
   */
  public open fun blockSize(`value`: Number) {
    unwrap(this).setBlockSize(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
   * and the encrypted keys.
   */
  public open fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  /**
   * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
   * and the encrypted keys.
   */
  public open fun kerberosKeytab(`value`: String) {
    unwrap(this).setKerberosKeytab(`value`)
  }

  /**
   * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
   * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
   * file. If `KERBEROS` is specified for `AuthType` , this value is required.
   */
  public open fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  /**
   * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
   * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
   * file. If `KERBEROS` is specified for `AuthType` , this value is required.
   */
  public open fun kerberosKrb5Conf(`value`: String) {
    unwrap(this).setKerberosKrb5Conf(`value`)
  }

  /**
   * The Kerberos principal with access to the files and folders on the HDFS cluster.
   */
  public open fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  /**
   * The Kerberos principal with access to the files and folders on the HDFS cluster.
   */
  public open fun kerberosPrincipal(`value`: String) {
    unwrap(this).setKerberosPrincipal(`value`)
  }

  /**
   * The URI of the HDFS cluster's Key Management Server (KMS).
   */
  public open fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

  /**
   * The URI of the HDFS cluster's Key Management Server (KMS).
   */
  public open fun kmsKeyProviderUri(`value`: String) {
    unwrap(this).setKmsKeyProviderUri(`value`)
  }

  /**
   * The NameNode that manages the HDFS namespace.
   */
  public open fun nameNodes(): Any = unwrap(this).getNameNodes()

  /**
   * The NameNode that manages the HDFS namespace.
   */
  public open fun nameNodes(`value`: IResolvable) {
    unwrap(this).setNameNodes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The NameNode that manages the HDFS namespace.
   */
  public open fun nameNodes(`value`: List<Any>) {
    unwrap(this).setNameNodes(`value`)
  }

  /**
   * The NameNode that manages the HDFS namespace.
   */
  public open fun nameNodes(vararg `value`: Any): Unit = nameNodes(`value`.toList())

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   */
  public open fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   */
  public open fun qopConfiguration(`value`: IResolvable) {
    unwrap(this).setQopConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   */
  public open fun qopConfiguration(`value`: QopConfigurationProperty) {
    unwrap(this).setQopConfiguration(`value`.let(QopConfigurationProperty::unwrap))
  }

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c4af28be0b35921c15869c96bbf02dace6134aee33a0d5e21246a0d368ddbf2")
  public open fun qopConfiguration(`value`: QopConfigurationProperty.Builder.() -> Unit): Unit =
      qopConfiguration(QopConfigurationProperty(`value`))

  /**
   * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
   */
  public open fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

  /**
   * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
   */
  public open fun replicationFactor(`value`: Number) {
    unwrap(this).setReplicationFactor(`value`)
  }

  /**
   * The user name used to identify the client on the host operating system.
   */
  public open fun simpleUser(): String? = unwrap(this).getSimpleUser()

  /**
   * The user name used to identify the client on the host operating system.
   */
  public open fun simpleUser(`value`: String) {
    unwrap(this).setSimpleUser(`value`)
  }

  /**
   * A subdirectory in the HDFS cluster.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * A subdirectory in the HDFS cluster.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationHDFS].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-authenticationtype)
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * The size of data blocks to write into the HDFS cluster.
     *
     * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes
     * (MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-blocksize)
     * @param blockSize The size of data blocks to write into the HDFS cluster. 
     */
    public fun blockSize(blockSize: Number)

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
     * and the encrypted keys.
     *
     * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskeytab)
     * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
     * defined Kerberos principal and the encrypted keys. 
     */
    public fun kerberosKeytab(kerberosKeytab: String)

    /**
     * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
     * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
     * file. If `KERBEROS` is specified for `AuthType` , this value is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskrb5conf)
     * @param kerberosKrb5Conf The `krb5.conf` file that contains the Kerberos configuration
     * information. You can load the `krb5.conf` by providing a string of the file's contents or an
     * Amazon S3 presigned URL of the file. If `KERBEROS` is specified for `AuthType` , this value is
     * required. 
     */
    public fun kerberosKrb5Conf(kerberosKrb5Conf: String)

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     *
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberosprincipal)
     * @param kerberosPrincipal The Kerberos principal with access to the files and folders on the
     * HDFS cluster. 
     */
    public fun kerberosPrincipal(kerberosPrincipal: String)

    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kmskeyprovideruri)
     * @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS). 
     */
    public fun kmsKeyProviderUri(kmsKeyProviderUri: String)

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    public fun nameNodes(nameNodes: IResolvable)

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    public fun nameNodes(nameNodes: List<Any>)

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    public fun nameNodes(vararg nameNodes: Any)

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    public fun qopConfiguration(qopConfiguration: IResolvable)

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    public fun qopConfiguration(qopConfiguration: QopConfigurationProperty)

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee2c26ee4fdb27c4be1388e24b497fbc88bb6e95670effebd757ecad371deee")
    public fun qopConfiguration(qopConfiguration: QopConfigurationProperty.Builder.() -> Unit)

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     *
     * By default, data is replicated to three DataNodes.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-replicationfactor)
     * @param replicationFactor The number of DataNodes to replicate the data to when writing to the
     * HDFS cluster. 
     */
    public fun replicationFactor(replicationFactor: Number)

    /**
     * The user name used to identify the client on the host operating system.
     *
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-simpleuser)
     * @param simpleUser The user name used to identify the client on the host operating system. 
     */
    public fun simpleUser(simpleUser: String)

    /**
     * A subdirectory in the HDFS cluster.
     *
     * This subdirectory is used to read data from or write data to the HDFS cluster. If the
     * subdirectory isn't specified, it will default to `/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-subdirectory)
     * @param subdirectory A subdirectory in the HDFS cluster. 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * The key-value pair that represents the tag that you want to add to the location.
     *
     * The value can be an empty string. We recommend using tags to name your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
     * @param tags The key-value pair that represents the tag that you want to add to the location. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key-value pair that represents the tag that you want to add to the location.
     *
     * The value can be an empty string. We recommend using tags to name your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
     * @param tags The key-value pair that represents the tag that you want to add to the location. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationHDFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationHDFS.Builder.create(scope, id)

    /**
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     * the HDFS cluster. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * The authentication mode used to determine identity of user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-authenticationtype)
     * @param authenticationType The authentication mode used to determine identity of user. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * The size of data blocks to write into the HDFS cluster.
     *
     * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes
     * (MiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-blocksize)
     * @param blockSize The size of data blocks to write into the HDFS cluster. 
     */
    override fun blockSize(blockSize: Number) {
      cdkBuilder.blockSize(blockSize)
    }

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
     * and the encrypted keys.
     *
     * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskeytab)
     * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
     * defined Kerberos principal and the encrypted keys. 
     */
    override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    /**
     * The `krb5.conf` file that contains the Kerberos configuration information. You can load the
     * `krb5.conf` by providing a string of the file's contents or an Amazon S3 presigned URL of the
     * file. If `KERBEROS` is specified for `AuthType` , this value is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskrb5conf)
     * @param kerberosKrb5Conf The `krb5.conf` file that contains the Kerberos configuration
     * information. You can load the `krb5.conf` by providing a string of the file's contents or an
     * Amazon S3 presigned URL of the file. If `KERBEROS` is specified for `AuthType` , this value is
     * required. 
     */
    override fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
      cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     *
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberosprincipal)
     * @param kerberosPrincipal The Kerberos principal with access to the files and folders on the
     * HDFS cluster. 
     */
    override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kmskeyprovideruri)
     * @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS). 
     */
    override fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
      cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
    }

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    override fun nameNodes(nameNodes: IResolvable) {
      cdkBuilder.nameNodes(nameNodes.let(IResolvable::unwrap))
    }

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    override fun nameNodes(nameNodes: List<Any>) {
      cdkBuilder.nameNodes(nameNodes)
    }

    /**
     * The NameNode that manages the HDFS namespace.
     *
     * The NameNode performs operations such as opening, closing, and renaming files and
     * directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
     * @param nameNodes The NameNode that manages the HDFS namespace. 
     */
    override fun nameNodes(vararg nameNodes: Any): Unit = nameNodes(nameNodes.toList())

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    override fun qopConfiguration(qopConfiguration: IResolvable) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(IResolvable::unwrap))
    }

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    override fun qopConfiguration(qopConfiguration: QopConfigurationProperty) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(QopConfigurationProperty::unwrap))
    }

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
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
     * File System (HDFS) cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee2c26ee4fdb27c4be1388e24b497fbc88bb6e95670effebd757ecad371deee")
    override fun qopConfiguration(qopConfiguration: QopConfigurationProperty.Builder.() -> Unit):
        Unit = qopConfiguration(QopConfigurationProperty(qopConfiguration))

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     *
     * By default, data is replicated to three DataNodes.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-replicationfactor)
     * @param replicationFactor The number of DataNodes to replicate the data to when writing to the
     * HDFS cluster. 
     */
    override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    /**
     * The user name used to identify the client on the host operating system.
     *
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-simpleuser)
     * @param simpleUser The user name used to identify the client on the host operating system. 
     */
    override fun simpleUser(simpleUser: String) {
      cdkBuilder.simpleUser(simpleUser)
    }

    /**
     * A subdirectory in the HDFS cluster.
     *
     * This subdirectory is used to read data from or write data to the HDFS cluster. If the
     * subdirectory isn't specified, it will default to `/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-subdirectory)
     * @param subdirectory A subdirectory in the HDFS cluster. 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * The key-value pair that represents the tag that you want to add to the location.
     *
     * The value can be an empty string. We recommend using tags to name your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
     * @param tags The key-value pair that represents the tag that you want to add to the location. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key-value pair that represents the tag that you want to add to the location.
     *
     * The value can be an empty string. We recommend using tags to name your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
     * @param tags The key-value pair that represents the tag that you want to add to the location. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFS =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationHDFS.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationHDFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationHDFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS):
        CfnLocationHDFS = CfnLocationHDFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationHDFS):
        software.amazon.awscdk.services.datasync.CfnLocationHDFS = wrapped.cdkObject
  }

  /**
   * The NameNode of the Hadoop Distributed File System (HDFS).
   *
   * The NameNode manages the file system's namespace and performs operations such as opening,
   * closing, and renaming files and directories. The NameNode also contains the information to map
   * blocks of data to the DataNodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * NameNodeProperty nameNodeProperty = NameNodeProperty.builder()
   * .hostname("hostname")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html)
   */
  public interface NameNodeProperty {
    /**
     * The hostname of the NameNode in the HDFS cluster.
     *
     * This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent
     * that's installed on-premises uses this hostname to communicate with the NameNode in the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html#cfn-datasync-locationhdfs-namenode-hostname)
     */
    public fun hostname(): String

    /**
     * The port that the NameNode uses to listen to client requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html#cfn-datasync-locationhdfs-namenode-port)
     */
    public fun port(): Number

    /**
     * A builder for [NameNodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname The hostname of the NameNode in the HDFS cluster. 
       * This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent
       * that's installed on-premises uses this hostname to communicate with the NameNode in the
       * network.
       */
      public fun hostname(hostname: String)

      /**
       * @param port The port that the NameNode uses to listen to client requests. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty.builder()

      /**
       * @param hostname The hostname of the NameNode in the HDFS cluster. 
       * This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent
       * that's installed on-premises uses this hostname to communicate with the NameNode in the
       * network.
       */
      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      /**
       * @param port The port that the NameNode uses to listen to client requests. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty,
    ) : CdkObject(cdkObject), NameNodeProperty {
      /**
       * The hostname of the NameNode in the HDFS cluster.
       *
       * This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent
       * that's installed on-premises uses this hostname to communicate with the NameNode in the
       * network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html#cfn-datasync-locationhdfs-namenode-hostname)
       */
      override fun hostname(): String = unwrap(this).getHostname()

      /**
       * The port that the NameNode uses to listen to client requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html#cfn-datasync-locationhdfs-namenode-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NameNodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty):
          NameNodeProperty = CdkObjectWrappers.wrap(cdkObject) as? NameNodeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NameNodeProperty):
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty
    }
  }

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer privacy settings configured on the Hadoop Distributed File System (HDFS) cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * QopConfigurationProperty qopConfigurationProperty = QopConfigurationProperty.builder()
   * .dataTransferProtection("dataTransferProtection")
   * .rpcProtection("rpcProtection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html)
   */
  public interface QopConfigurationProperty {
    /**
     * The data transfer protection setting configured on the HDFS cluster.
     *
     * This setting corresponds to your `dfs.data.transfer.protection` setting in the
     * `hdfs-site.xml` file on your Hadoop cluster.
     *
     * Default: - "PRIVACY"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html#cfn-datasync-locationhdfs-qopconfiguration-datatransferprotection)
     */
    public fun dataTransferProtection(): String? = unwrap(this).getDataTransferProtection()

    /**
     * The Remote Procedure Call (RPC) protection setting configured on the HDFS cluster.
     *
     * This setting corresponds to your `hadoop.rpc.protection` setting in your `core-site.xml` file
     * on your Hadoop cluster.
     *
     * Default: - "PRIVACY"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html#cfn-datasync-locationhdfs-qopconfiguration-rpcprotection)
     */
    public fun rpcProtection(): String? = unwrap(this).getRpcProtection()

    /**
     * A builder for [QopConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTransferProtection The data transfer protection setting configured on the HDFS
       * cluster.
       * This setting corresponds to your `dfs.data.transfer.protection` setting in the
       * `hdfs-site.xml` file on your Hadoop cluster.
       */
      public fun dataTransferProtection(dataTransferProtection: String)

      /**
       * @param rpcProtection The Remote Procedure Call (RPC) protection setting configured on the
       * HDFS cluster.
       * This setting corresponds to your `hadoop.rpc.protection` setting in your `core-site.xml`
       * file on your Hadoop cluster.
       */
      public fun rpcProtection(rpcProtection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty.builder()

      /**
       * @param dataTransferProtection The data transfer protection setting configured on the HDFS
       * cluster.
       * This setting corresponds to your `dfs.data.transfer.protection` setting in the
       * `hdfs-site.xml` file on your Hadoop cluster.
       */
      override fun dataTransferProtection(dataTransferProtection: String) {
        cdkBuilder.dataTransferProtection(dataTransferProtection)
      }

      /**
       * @param rpcProtection The Remote Procedure Call (RPC) protection setting configured on the
       * HDFS cluster.
       * This setting corresponds to your `hadoop.rpc.protection` setting in your `core-site.xml`
       * file on your Hadoop cluster.
       */
      override fun rpcProtection(rpcProtection: String) {
        cdkBuilder.rpcProtection(rpcProtection)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty,
    ) : CdkObject(cdkObject), QopConfigurationProperty {
      /**
       * The data transfer protection setting configured on the HDFS cluster.
       *
       * This setting corresponds to your `dfs.data.transfer.protection` setting in the
       * `hdfs-site.xml` file on your Hadoop cluster.
       *
       * Default: - "PRIVACY"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html#cfn-datasync-locationhdfs-qopconfiguration-datatransferprotection)
       */
      override fun dataTransferProtection(): String? = unwrap(this).getDataTransferProtection()

      /**
       * The Remote Procedure Call (RPC) protection setting configured on the HDFS cluster.
       *
       * This setting corresponds to your `hadoop.rpc.protection` setting in your `core-site.xml`
       * file on your Hadoop cluster.
       *
       * Default: - "PRIVACY"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html#cfn-datasync-locationhdfs-qopconfiguration-rpcprotection)
       */
      override fun rpcProtection(): String? = unwrap(this).getRpcProtection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QopConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty):
          QopConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? QopConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QopConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty
    }
  }
}
