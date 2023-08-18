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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFSProps

/**
 * Properties for defining a `CfnLocationHDFS`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
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
@CdkDslMarker
public class CfnLocationHDFSPropsDsl {
    private val cdkBuilder: CfnLocationHDFSProps.Builder = CfnLocationHDFSProps.builder()

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _nameNodes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     *   the HDFS cluster.
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents that are used to connect to
     *   the HDFS cluster.
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    /** @param authenticationType The authentication mode used to determine identity of user. */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param blockSize The size of data blocks to write into the HDFS cluster. The block size must
     *   be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     */
    public fun blockSize(blockSize: Number) {
        cdkBuilder.blockSize(blockSize)
    }

    /**
     * @param kerberosKeytab The Kerberos key table (keytab) that contains mappings between the
     *   defined Kerberos principal and the encrypted keys. Provide the base64-encoded file text. If
     *   `KERBEROS` is specified for `AuthType` , this value is required.
     */
    public fun kerberosKeytab(kerberosKeytab: String) {
        cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    /**
     * @param kerberosKrb5Conf The `krb5.conf` file that contains the Kerberos configuration
     *   information. You can load the `krb5.conf` by providing a string of the file's contents or
     *   an Amazon S3 presigned URL of the file. If `KERBEROS` is specified for `AuthType` , this
     *   value is required.
     */
    public fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
        cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    /**
     * @param kerberosPrincipal The Kerberos principal with access to the files and folders on the
     *   HDFS cluster.
     *
     * If `KERBEROS` is specified for `AuthenticationType` , this parameter is required.
     */
    public fun kerberosPrincipal(kerberosPrincipal: String) {
        cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    /** @param kmsKeyProviderUri The URI of the HDFS cluster's Key Management Server (KMS). */
    public fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
        cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. The NameNode performs
     *   operations such as opening, closing, and renaming files and directories. The NameNode
     *   contains the information to map blocks of data to the DataNodes. You can use only one
     *   NameNode.
     */
    public fun nameNodes(vararg nameNodes: Any) {
        _nameNodes.addAll(listOf(*nameNodes))
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. The NameNode performs
     *   operations such as opening, closing, and renaming files and directories. The NameNode
     *   contains the information to map blocks of data to the DataNodes. You can use only one
     *   NameNode.
     */
    public fun nameNodes(nameNodes: Collection<Any>) {
        _nameNodes.addAll(nameNodes)
    }

    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. The NameNode performs
     *   operations such as opening, closing, and renaming files and directories. The NameNode
     *   contains the information to map blocks of data to the DataNodes. You can use only one
     *   NameNode.
     */
    public fun nameNodes(nameNodes: IResolvable) {
        cdkBuilder.nameNodes(nameNodes)
    }

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     *   Procedure Call (RPC) and data transfer protection settings configured on the Hadoop
     *   Distributed File System (HDFS) cluster. If `QopConfiguration` isn't specified,
     *   `RpcProtection` and `DataTransferProtection` default to `PRIVACY` . If you set
     *   `RpcProtection` or `DataTransferProtection` , the other parameter assumes the same value.
     */
    public fun qopConfiguration(qopConfiguration: IResolvable) {
        cdkBuilder.qopConfiguration(qopConfiguration)
    }

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote
     *   Procedure Call (RPC) and data transfer protection settings configured on the Hadoop
     *   Distributed File System (HDFS) cluster. If `QopConfiguration` isn't specified,
     *   `RpcProtection` and `DataTransferProtection` default to `PRIVACY` . If you set
     *   `RpcProtection` or `DataTransferProtection` , the other parameter assumes the same value.
     */
    public fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty) {
        cdkBuilder.qopConfiguration(qopConfiguration)
    }

    /**
     * @param replicationFactor The number of DataNodes to replicate the data to when writing to the
     *   HDFS cluster. By default, data is replicated to three DataNodes.
     */
    public fun replicationFactor(replicationFactor: Number) {
        cdkBuilder.replicationFactor(replicationFactor)
    }

    /**
     * @param simpleUser The user name used to identify the client on the host operating system.
     *
     * If `SIMPLE` is specified for `AuthenticationType` , this parameter is required.
     */
    public fun simpleUser(simpleUser: String) {
        cdkBuilder.simpleUser(simpleUser)
    }

    /**
     * @param subdirectory A subdirectory in the HDFS cluster. This subdirectory is used to read
     *   data from or write data to the HDFS cluster. If the subdirectory isn't specified, it will
     *   default to `/` .
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     *   The value can be an empty string. We recommend using tags to name your resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The key-value pair that represents the tag that you want to add to the location.
     *   The value can be an empty string. We recommend using tags to name your resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationHDFSProps {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_nameNodes.isNotEmpty()) cdkBuilder.nameNodes(_nameNodes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
