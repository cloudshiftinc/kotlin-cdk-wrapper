@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::LocationObjectStorage` resource specifies an endpoint for a self-managed
 * object storage bucket.
 *
 * For more information about self-managed object storage locations, see [Creating a Location for
 * Object Storage](https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationObjectStorage cfnLocationObjectStorage = CfnLocationObjectStorage.Builder.create(this,
 * "MyCfnLocationObjectStorage")
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
public open class CfnLocationObjectStorage(
  cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationObjectStorageProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnLocationObjectStorage(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLocationObjectStorageProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationObjectStorageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLocationObjectStorageProps(props)
  )

  /**
   * Specifies the access key (for example, a user name) if credentials are required to authenticate
   * with the object storage server.
   */
  public open fun accessKey(): String? = unwrap(this).getAccessKey()

  /**
   * Specifies the access key (for example, a user name) if credentials are required to authenticate
   * with the object storage server.
   */
  public open fun accessKey(`value`: String) {
    unwrap(this).setAccessKey(`value`)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
   * with your location.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the specified object storage location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified object storage location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Specifies the name of the object storage bucket involved in the transfer.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * Specifies the name of the object storage bucket involved in the transfer.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
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
   * Specifies the secret key (for example, a password) if credentials are required to authenticate
   * with the object storage server.
   */
  public open fun secretKey(): String? = unwrap(this).getSecretKey()

  /**
   * Specifies the secret key (for example, a password) if credentials are required to authenticate
   * with the object storage server.
   */
  public open fun secretKey(`value`: String) {
    unwrap(this).setSecretKey(`value`)
  }

  /**
   * Specifies a file with the certificates that are used to sign the object storage server's
   * certificate (for example, `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you
   * specify must include the following:.
   */
  public open fun serverCertificate(): String? = unwrap(this).getServerCertificate()

  /**
   * Specifies a file with the certificates that are used to sign the object storage server's
   * certificate (for example, `file:///home/user/.ssh/storage_sys_certificate.pem` ). The file you
   * specify must include the following:.
   */
  public open fun serverCertificate(`value`: String) {
    unwrap(this).setServerCertificate(`value`)
  }

  /**
   * Specifies the domain name or IP address of the object storage server.
   */
  public open fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the domain name or IP address of the object storage server.
   */
  public open fun serverHostname(`value`: String) {
    unwrap(this).setServerHostname(`value`)
  }

  /**
   * Specifies the port that your object storage server accepts inbound network traffic on (for
   * example, port 443).
   */
  public open fun serverPort(): Number? = unwrap(this).getServerPort()

  /**
   * Specifies the port that your object storage server accepts inbound network traffic on (for
   * example, port 443).
   */
  public open fun serverPort(`value`: Number) {
    unwrap(this).setServerPort(`value`)
  }

  /**
   * Specifies the protocol that your object storage server uses to communicate.
   */
  public open fun serverProtocol(): String? = unwrap(this).getServerProtocol()

  /**
   * Specifies the protocol that your object storage server uses to communicate.
   */
  public open fun serverProtocol(`value`: String) {
    unwrap(this).setServerProtocol(`value`)
  }

  /**
   * Specifies the object prefix for your object storage server.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies the object prefix for your object storage server.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationObjectStorage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the access key (for example, a user name) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
     * @param accessKey Specifies the access key (for example, a user name) if credentials are
     * required to authenticate with the object storage server. 
     */
    public fun accessKey(accessKey: String)

    /**
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
     * with your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
     * with your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * Specifies the name of the object storage bucket involved in the transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer. 
     */
    public fun bucketName(bucketName: String)

    /**
     * Specifies the secret key (for example, a password) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server. 
     */
    public fun secretKey(secretKey: String)

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
    public fun serverCertificate(serverCertificate: String)

    /**
     * Specifies the domain name or IP address of the object storage server.
     *
     * A DataSync agent uses this hostname to mount the object storage server in a network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverhostname)
     * @param serverHostname Specifies the domain name or IP address of the object storage server. 
     */
    public fun serverHostname(serverHostname: String)

    /**
     * Specifies the port that your object storage server accepts inbound network traffic on (for
     * example, port 443).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverport)
     * @param serverPort Specifies the port that your object storage server accepts inbound network
     * traffic on (for example, port 443). 
     */
    public fun serverPort(serverPort: Number)

    /**
     * Specifies the protocol that your object storage server uses to communicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverprotocol)
     * @param serverProtocol Specifies the protocol that your object storage server uses to
     * communicate. 
     */
    public fun serverProtocol(serverProtocol: String)

    /**
     * Specifies the object prefix for your object storage server.
     *
     * If this is a source location, DataSync only copies objects with this prefix. If this is a
     * destination location, DataSync writes all objects with this prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-subdirectory)
     * @param subdirectory Specifies the object prefix for your object storage server. 
     */
    public fun subdirectory(subdirectory: String)

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
    public fun tags(tags: List<CfnTag>)

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
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.Builder.create(scope, id)

    /**
     * Specifies the access key (for example, a user name) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
     * @param accessKey Specifies the access key (for example, a user name) if credentials are
     * required to authenticate with the object storage server. 
     */
    override fun accessKey(accessKey: String) {
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
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect
     * with your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
     * @param agentArns Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can
     * securely connect with your location. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * Specifies the name of the object storage bucket involved in the transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * Specifies the secret key (for example, a password) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server. 
     */
    override fun secretKey(secretKey: String) {
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
    override fun serverCertificate(serverCertificate: String) {
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
    override fun serverHostname(serverHostname: String) {
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
    override fun serverPort(serverPort: Number) {
      cdkBuilder.serverPort(serverPort)
    }

    /**
     * Specifies the protocol that your object storage server uses to communicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-serverprotocol)
     * @param serverProtocol Specifies the protocol that your object storage server uses to
     * communicate. 
     */
    override fun serverProtocol(serverProtocol: String) {
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
    override fun subdirectory(subdirectory: String) {
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationObjectStorage =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationObjectStorage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationObjectStorage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorage):
        CfnLocationObjectStorage = CfnLocationObjectStorage(cdkObject)

    internal fun unwrap(wrapped: CfnLocationObjectStorage):
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage = wrapped.cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage
  }
}
