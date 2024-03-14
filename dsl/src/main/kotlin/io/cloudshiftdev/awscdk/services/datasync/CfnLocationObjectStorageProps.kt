package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocationObjectStorageProps {
  /**
   * Specifies the access key (for example, a user name) if credentials are required to authenticate
   * with the object storage server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
   */
  public fun accessKey(): String? = unwrap(this).getAccessKey()

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * Specifies the name of the object storage bucket involved in the transfer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * Specifies the secret key (for example, a password) if credentials are required to authenticate
   * with the object storage server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
   */
  public fun secretKey(): String? = unwrap(this).getSecretKey()

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
   */
  public fun serverCertificate(): String? = unwrap(this).getServerCertificate()

  /**
   * Specifies the domain name or IP address of the object storage server.
   *
   * A DataSync agent uses this hostname to mount the object storage server in a network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverhostname)
   */
  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the port that your object storage server accepts inbound network traffic on (for
   * example, port 443).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverport)
   */
  public fun serverPort(): Number? = unwrap(this).getServerPort()

  /**
   * Specifies the protocol that your object storage server uses to communicate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverprotocol)
   */
  public fun serverProtocol(): String? = unwrap(this).getServerProtocol()

  /**
   * Specifies the object prefix for your object storage server.
   *
   * If this is a source location, DataSync only copies objects with this prefix. If this is a
   * destination location, DataSync writes all objects with this prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * Tags can help you manage, filter, and search for your resources. We recommend creating a name
   * tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationObjectStorageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessKey Specifies the access key (for example, a user name) if credentials are
     * required to authenticate with the object storage server.
     */
    public fun accessKey(accessKey: String)

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server.
     */
    public fun secretKey(secretKey: String)

    /**
     * @param serverCertificate Specifies a file with the certificates that are used to sign the
     * object storage server's certificate (for example,
     * `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you specify must include the
     * following:.
     * * The certificate of the signing certificate authority (CA)
     * * Any intermediate certificates
     * * base64 encoding
     * * A `.pem` extension
     *
     * The file can be up to 32768 bytes (before base64 encoding).
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     */
    public fun serverCertificate(serverCertificate: String)

    /**
     * @param serverHostname Specifies the domain name or IP address of the object storage server.
     * A DataSync agent uses this hostname to mount the object storage server in a network.
     */
    public fun serverHostname(serverHostname: String)

    /**
     * @param serverPort Specifies the port that your object storage server accepts inbound network
     * traffic on (for example, port 443).
     */
    public fun serverPort(serverPort: Number)

    /**
     * @param serverProtocol Specifies the protocol that your object storage server uses to
     * communicate.
     */
    public fun serverProtocol(serverProtocol: String)

    /**
     * @param subdirectory Specifies the object prefix for your object storage server.
     * If this is a source location, DataSync only copies objects with this prefix. If this is a
     * destination location, DataSync writes all objects with this prefix.
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * Tags can help you manage, filter, and search for your resources. We recommend creating a name
     * tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * Tags can help you manage, filter, and search for your resources. We recommend creating a name
     * tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps.builder()

    /**
     * @param accessKey Specifies the access key (for example, a user name) if credentials are
     * required to authenticate with the object storage server.
     */
    override fun accessKey(accessKey: String) {
      cdkBuilder.accessKey(accessKey)
    }

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server.
     */
    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    /**
     * @param serverCertificate Specifies a file with the certificates that are used to sign the
     * object storage server's certificate (for example,
     * `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you specify must include the
     * following:.
     * * The certificate of the signing certificate authority (CA)
     * * Any intermediate certificates
     * * base64 encoding
     * * A `.pem` extension
     *
     * The file can be up to 32768 bytes (before base64 encoding).
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     */
    override fun serverCertificate(serverCertificate: String) {
      cdkBuilder.serverCertificate(serverCertificate)
    }

    /**
     * @param serverHostname Specifies the domain name or IP address of the object storage server.
     * A DataSync agent uses this hostname to mount the object storage server in a network.
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param serverPort Specifies the port that your object storage server accepts inbound network
     * traffic on (for example, port 443).
     */
    override fun serverPort(serverPort: Number) {
      cdkBuilder.serverPort(serverPort)
    }

    /**
     * @param serverProtocol Specifies the protocol that your object storage server uses to
     * communicate.
     */
    override fun serverProtocol(serverProtocol: String) {
      cdkBuilder.serverProtocol(serverProtocol)
    }

    /**
     * @param subdirectory Specifies the object prefix for your object storage server.
     * If this is a source location, DataSync only copies objects with this prefix. If this is a
     * destination location, DataSync writes all objects with this prefix.
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * Tags can help you manage, filter, and search for your resources. We recommend creating a name
     * tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * Tags can help you manage, filter, and search for your resources. We recommend creating a name
     * tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps,
  ) : CdkObject(cdkObject), CfnLocationObjectStorageProps {
    /**
     * Specifies the access key (for example, a user name) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
     */
    override fun accessKey(): String? = unwrap(this).getAccessKey()

    /**
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
     * with your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * Specifies the name of the object storage bucket involved in the transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * Specifies the secret key (for example, a password) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
     */
    override fun secretKey(): String? = unwrap(this).getSecretKey()

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
     */
    override fun serverCertificate(): String? = unwrap(this).getServerCertificate()

    /**
     * Specifies the domain name or IP address of the object storage server.
     *
     * A DataSync agent uses this hostname to mount the object storage server in a network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverhostname)
     */
    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    /**
     * Specifies the port that your object storage server accepts inbound network traffic on (for
     * example, port 443).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverport)
     */
    override fun serverPort(): Number? = unwrap(this).getServerPort()

    /**
     * Specifies the protocol that your object storage server uses to communicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverprotocol)
     */
    override fun serverProtocol(): String? = unwrap(this).getServerProtocol()

    /**
     * Specifies the object prefix for your object storage server.
     *
     * If this is a source location, DataSync only copies objects with this prefix. If this is a
     * destination location, DataSync writes all objects with this prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies the key-value pair that represents a tag that you want to add to the resource.
     *
     * Tags can help you manage, filter, and search for your resources. We recommend creating a name
     * tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationObjectStorageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps):
        CfnLocationObjectStorageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationObjectStorageProps):
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps
  }
}
