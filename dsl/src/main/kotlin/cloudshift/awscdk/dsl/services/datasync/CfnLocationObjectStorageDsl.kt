@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorage
import software.constructs.Construct

@CdkDslMarker
public class CfnLocationObjectStorageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationObjectStorage.Builder =
      CfnLocationObjectStorage.Builder.create(scope, id)

  private val _agentArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the access key (for example, a user name) if credentials are required to authenticate
   * with the object storage server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
   * @param accessKey Specifies the access key (for example, a user name) if credentials are
   * required to authenticate with the object storage server. 
   */
  public fun accessKey(accessKey: String) {
    cdkBuilder.accessKey(accessKey)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
   * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
   * securely connect with your location. 
   */
  public fun agentArns(vararg agentArns: String) {
    _agentArns.addAll(listOf(*agentArns))
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
   * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
   * securely connect with your location. 
   */
  public fun agentArns(agentArns: Collection<String>) {
    _agentArns.addAll(agentArns)
  }

  /**
   * Specifies the name of the object storage bucket involved in the transfer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
   * @param bucketName Specifies the name of the object storage bucket involved in the transfer. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * Specifies the secret key (for example, a password) if credentials are required to authenticate
   * with the object storage server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
   * @param secretKey Specifies the secret key (for example, a password) if credentials are required
   * to authenticate with the object storage server. 
   */
  public fun secretKey(secretKey: String) {
    cdkBuilder.secretKey(secretKey)
  }

  /**
   * Specifies a file with the certificates that are used to sign the object storage server's
   * certificate (for example, `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you
   * specify must include the following:.
   *
   * * The certificate of the signing certificate authority (CA)
   * * Any intermediate certificates
   * * base64 encoding
   * * A `.pem` extension
   *
   * The file can be up to 32768 bytes (before base64 encoding).
   *
   * To use this parameter, configure `ServerProtocol` to `HTTPS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-servercertificate)
   * @param serverCertificate Specifies a file with the certificates that are used to sign the
   * object storage server's certificate (for example,
   * `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you specify must include the
   * following:. 
   */
  public fun serverCertificate(serverCertificate: String) {
    cdkBuilder.serverCertificate(serverCertificate)
  }

  /**
   * Specifies the domain name or IP address of the object storage server.
   *
   * A DataSync agent uses this hostname to mount the object storage server in a network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverhostname)
   * @param serverHostname Specifies the domain name or IP address of the object storage server. 
   */
  public fun serverHostname(serverHostname: String) {
    cdkBuilder.serverHostname(serverHostname)
  }

  /**
   * Specifies the port that your object storage server accepts inbound network traffic on (for
   * example, port 443).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverport)
   * @param serverPort Specifies the port that your object storage server accepts inbound network
   * traffic on (for example, port 443). 
   */
  public fun serverPort(serverPort: Number) {
    cdkBuilder.serverPort(serverPort)
  }

  /**
   * Specifies the protocol that your object storage server uses to communicate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverprotocol)
   * @param serverProtocol Specifies the protocol that your object storage server uses to
   * communicate. 
   */
  public fun serverProtocol(serverProtocol: String) {
    cdkBuilder.serverProtocol(serverProtocol)
  }

  /**
   * Specifies the object prefix for your object storage server.
   *
   * If this is a source location, DataSync only copies objects with this prefix. If this is a
   * destination location, DataSync writes all objects with this prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-subdirectory)
   * @param subdirectory Specifies the object prefix for your object storage server. 
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * Tags can help you manage, filter, and search for your resources. We recommend creating a name
   * tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-tags)
   * @param tags Specifies the key-value pair that represents a tag that you want to add to the
   * resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * Tags can help you manage, filter, and search for your resources. We recommend creating a name
   * tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-tags)
   * @param tags Specifies the key-value pair that represents a tag that you want to add to the
   * resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationObjectStorage {
    if(_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
