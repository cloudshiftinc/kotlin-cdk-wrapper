@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.constructs.Construct

@CdkDslMarker
public class CfnLocationHDFSDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationHDFS.Builder = CfnLocationHDFS.Builder.create(scope, id)

  private val _agentArns: MutableList<String> = mutableListOf()

  private val _nameNodes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
   * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to the
   * HDFS cluster. 
   */
  public fun agentArns(vararg agentArns: String) {
    _agentArns.addAll(listOf(*agentArns))
  }

  /**
   * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-agentarns)
   * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to the
   * HDFS cluster. 
   */
  public fun agentArns(agentArns: Collection<String>) {
    _agentArns.addAll(agentArns)
  }

  /**
   * The authentication mode used to determine identity of user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-authenticationtype)
   * @param authenticationType The authentication mode used to determine identity of user. 
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * The size of data blocks to write into the HDFS cluster.
   *
   * The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-blocksize)
   * @param blockSize The size of data blocks to write into the HDFS cluster. 
   */
  public fun blockSize(blockSize: Number) {
    cdkBuilder.blockSize(blockSize)
  }

  /**
   * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal
   * and the encrypted keys.
   *
   * Provide the base64-encoded file text. If `KERBEROS` is specified for `AuthType` , this value is
   * required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kerberoskeytab)
   * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
   * defined Kerberos principal and the encrypted keys. 
   */
  public fun kerberosKeytab(kerberosKeytab: String) {
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
  public fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
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
  public fun kerberosPrincipal(kerberosPrincipal: String) {
    cdkBuilder.kerberosPrincipal(kerberosPrincipal)
  }

  /**
   * The URI of the HDFS cluster's Key Management Server (KMS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-kmskeyprovideruri)
   * @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS). 
   */
  public fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
    cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
  }

  /**
   * The NameNode that manages the HDFS namespace.
   *
   * The NameNode performs operations such as opening, closing, and renaming files and directories.
   * The NameNode contains the information to map blocks of data to the DataNodes. You can use only one
   * NameNode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
   * @param nameNodes The NameNode that manages the HDFS namespace. 
   */
  public fun nameNodes(vararg nameNodes: Any) {
    _nameNodes.addAll(listOf(*nameNodes))
  }

  /**
   * The NameNode that manages the HDFS namespace.
   *
   * The NameNode performs operations such as opening, closing, and renaming files and directories.
   * The NameNode contains the information to map blocks of data to the DataNodes. You can use only one
   * NameNode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
   * @param nameNodes The NameNode that manages the HDFS namespace. 
   */
  public fun nameNodes(nameNodes: Collection<Any>) {
    _nameNodes.addAll(nameNodes)
  }

  /**
   * The NameNode that manages the HDFS namespace.
   *
   * The NameNode performs operations such as opening, closing, and renaming files and directories.
   * The NameNode contains the information to map blocks of data to the DataNodes. You can use only one
   * NameNode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-namenodes)
   * @param nameNodes The NameNode that manages the HDFS namespace. 
   */
  public fun nameNodes(nameNodes: IResolvable) {
    cdkBuilder.nameNodes(nameNodes)
  }

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   *
   * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default to
   * `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter assumes
   * the same value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-qopconfiguration)
   * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
   * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
   * File System (HDFS) cluster. 
   */
  public fun qopConfiguration(qopConfiguration: IResolvable) {
    cdkBuilder.qopConfiguration(qopConfiguration)
  }

  /**
   * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
   * data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
   *
   * If `QopConfiguration` isn't specified, `RpcProtection` and `DataTransferProtection` default to
   * `PRIVACY` . If you set `RpcProtection` or `DataTransferProtection` , the other parameter assumes
   * the same value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-qopconfiguration)
   * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
   * Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed
   * File System (HDFS) cluster. 
   */
  public fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty) {
    cdkBuilder.qopConfiguration(qopConfiguration)
  }

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
  public fun replicationFactor(replicationFactor: Number) {
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
  public fun simpleUser(simpleUser: String) {
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
  public fun subdirectory(subdirectory: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   *
   * The value can be an empty string. We recommend using tags to name your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html#cfn-datasync-locationhdfs-tags)
   * @param tags The key-value pair that represents the tag that you want to add to the location. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationHDFS {
    if(_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
    if(_nameNodes.isNotEmpty()) cdkBuilder.nameNodes(_nameNodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
