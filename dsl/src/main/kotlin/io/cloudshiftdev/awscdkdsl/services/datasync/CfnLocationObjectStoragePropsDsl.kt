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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps

/**
 * Properties for defining a `CfnLocationObjectStorage`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationObjectStorageProps cfnLocationObjectStorageProps =
 * CfnLocationObjectStorageProps.builder()
 * .agentArns(List.of("agentArns"))
 * // the properties below are optional
 * .accessKey("accessKey")
 * .bucketName("bucketName")
 * .secretKey("secretKey")
 * .serverCertificate("serverCertificate")
 * .serverHostname("serverHostname")
 * .serverPort(123)
 * .serverProtocol("serverProtocol")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html)
 */
@CdkDslMarker
public class CfnLocationObjectStoragePropsDsl {
    private val cdkBuilder: CfnLocationObjectStorageProps.Builder =
        CfnLocationObjectStorageProps.builder()

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accessKey Specifies the access key (for example, a user name) if credentials are
     *   required to authenticate with the object storage server.
     */
    public fun accessKey(accessKey: String) {
        cdkBuilder.accessKey(accessKey)
    }

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     *   securely connect with your location.
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     *   securely connect with your location.
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    /**
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     *   required to authenticate with the object storage server.
     */
    public fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
    }

    /**
     * @param serverCertificate Specifies a file with the certificates that are used to sign the
     *   object storage server's certificate (for example,
     *   `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you specify must include
     *   the following:.
     * * The certificate of the signing certificate authority (CA)
     * * Any intermediate certificates
     * * base64 encoding
     * * A `.pem` extension
     *
     * The file can be up to 32768 bytes (before base64 encoding).
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     */
    public fun serverCertificate(serverCertificate: String) {
        cdkBuilder.serverCertificate(serverCertificate)
    }

    /**
     * @param serverHostname Specifies the domain name or IP address of the object storage server. A
     *   DataSync agent uses this hostname to mount the object storage server in a network.
     */
    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param serverPort Specifies the port that your object storage server accepts inbound network
     *   traffic on (for example, port 443).
     */
    public fun serverPort(serverPort: Number) {
        cdkBuilder.serverPort(serverPort)
    }

    /**
     * @param serverProtocol Specifies the protocol that your object storage server uses to
     *   communicate.
     */
    public fun serverProtocol(serverProtocol: String) {
        cdkBuilder.serverProtocol(serverProtocol)
    }

    /**
     * @param subdirectory Specifies the object prefix for your object storage server. If this is a
     *   source location, DataSync only copies objects with this prefix. If this is a destination
     *   location, DataSync writes all objects with this prefix.
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     *   resource. Tags can help you manage, filter, and search for your resources. We recommend
     *   creating a name tag for your location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     *   resource. Tags can help you manage, filter, and search for your resources. We recommend
     *   creating a name tag for your location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationObjectStorageProps {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
