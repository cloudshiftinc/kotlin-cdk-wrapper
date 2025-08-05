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
 * Properties for defining a `CfnLocationObjectStorage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationObjectStorageProps cfnLocationObjectStorageProps =
 * CfnLocationObjectStorageProps.builder()
 * .accessKey("accessKey")
 * .agentArns(List.of("agentArns"))
 * .bucketName("bucketName")
 * .cmkSecretConfig(CmkSecretConfigProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .secretArn("secretArn")
 * .build())
 * .customSecretConfig(CustomSecretConfigProperty.builder()
 * .secretAccessRoleArn("secretAccessRoleArn")
 * .secretArn("secretArn")
 * .build())
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
public interface CfnLocationObjectStorageProps {
  /**
   * Specifies the access key (for example, a user name) if credentials are required to authenticate
   * with the object storage server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
   */
  public fun accessKey(): String? = unwrap(this).getAccessKey()

  /**
   * (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can connect
   * with your object storage system.
   *
   * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value for
   * this parameter.
   *
   *
   * Make sure you configure this parameter correctly when you first create your storage location.
   * You cannot add or remove agents from a storage location after you create it.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
   */
  public fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

  /**
   * Specifies the name of the object storage bucket involved in the transfer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * Specifies configuration information for a DataSync-managed secret, which includes the
   * `SecretKey` that DataSync uses to access a specific object storage location, with a
   * customer-managed AWS KMS key .
   *
   * When you include this paramater as part of a `CreateLocationObjectStorage` request, you provide
   * only the KMS key ARN. DataSync uses this KMS key together with the value you specify for the
   * `SecretKey` parameter to create a DataSync-managed secret to store the location access
   * credentials.
   *
   * Make sure the DataSync has permission to access the KMS key that you specify.
   *
   *
   * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
   * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
   * both parameters for the same request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-cmksecretconfig)
   */
  public fun cmkSecretConfig(): Any? = unwrap(this).getCmkSecretConfig()

  /**
   * Specifies configuration information for a customer-managed Secrets Manager secret where the
   * secret key for a specific object storage location is stored in plain text.
   *
   * This configuration includes the secret ARN, and the ARN for an IAM role that provides access to
   * the secret.
   *
   *
   * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
   * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
   * both parameters for the same request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-customsecretconfig)
   */
  public fun customSecretConfig(): Any? = unwrap(this).getCustomSecretConfig()

  /**
   * Specifies the secret key (for example, a password) if credentials are required to authenticate
   * with the object storage server.
   *
   *
   * If you provide a secret using `SecretKey` , but do not provide secret configuration details
   * using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the token using your AWS
   * account's Secrets Manager secret.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
   */
  public fun secretKey(): String? = unwrap(this).getSecretKey()

  /**
   * Specifies a certificate chain for DataSync to authenticate with your object storage system if
   * the system uses a private or self-signed certificate authority (CA).
   *
   * You must specify a single `.pem` file with a full certificate chain (for example,
   * `file:///home/user/.ssh/object_storage_certificates.pem` ).
   *
   * The certificate chain might include:
   *
   * * The object storage system's certificate
   * * All intermediate certificates (if there are any)
   * * The root certificate of the signing CA
   *
   * You can concatenate your certificates into a `.pem` file (which can be up to 32768 bytes before
   * base64 encoding). The following example `cat` command creates an `object_storage_certificates.pem`
   * file that includes three certificates:
   *
   * `cat object_server_certificate.pem intermediate_certificate.pem ca_root_certificate.pem &gt;
   * object_storage_certificates.pem`
   *
   * To use this parameter, configure `ServerProtocol` to `HTTPS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-servercertificate)
   */
  public fun serverCertificate(): String? = unwrap(this).getServerCertificate()

  /**
   * Specifies the domain name or IP address (IPv4 or IPv6) of the object storage server that your
   * DataSync agent connects to.
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
   * If not specified, the default value is `HTTPS` .
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
     * @param agentArns (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents
     * that can connect with your object storage system.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents
     * that can connect with your object storage system.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    public fun cmkSecretConfig(cmkSecretConfig: IResolvable)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    public fun cmkSecretConfig(cmkSecretConfig: CfnLocationObjectStorage.CmkSecretConfigProperty)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dba3e2987d376adc2137e306007986a33d7f1dfd5f8ebb243807b1f88320d78")
    public
        fun cmkSecretConfig(cmkSecretConfig: CfnLocationObjectStorage.CmkSecretConfigProperty.Builder.() -> Unit)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    public fun customSecretConfig(customSecretConfig: IResolvable)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    public
        fun customSecretConfig(customSecretConfig: CfnLocationObjectStorage.CustomSecretConfigProperty)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb17ae3c7ee31d421f05348a52b86e8a64c36d81729cfdd760b06c57efbd871a")
    public
        fun customSecretConfig(customSecretConfig: CfnLocationObjectStorage.CustomSecretConfigProperty.Builder.() -> Unit)

    /**
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server.
     *
     * If you provide a secret using `SecretKey` , but do not provide secret configuration details
     * using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the token using your AWS
     * account's Secrets Manager secret.
     */
    public fun secretKey(secretKey: String)

    /**
     * @param serverCertificate Specifies a certificate chain for DataSync to authenticate with your
     * object storage system if the system uses a private or self-signed certificate authority (CA).
     * You must specify a single `.pem` file with a full certificate chain (for example,
     * `file:///home/user/.ssh/object_storage_certificates.pem` ).
     *
     * The certificate chain might include:
     *
     * * The object storage system's certificate
     * * All intermediate certificates (if there are any)
     * * The root certificate of the signing CA
     *
     * You can concatenate your certificates into a `.pem` file (which can be up to 32768 bytes
     * before base64 encoding). The following example `cat` command creates an
     * `object_storage_certificates.pem` file that includes three certificates:
     *
     * `cat object_server_certificate.pem intermediate_certificate.pem ca_root_certificate.pem &gt;
     * object_storage_certificates.pem`
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     */
    public fun serverCertificate(serverCertificate: String)

    /**
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the object
     * storage server that your DataSync agent connects to.
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
     * If not specified, the default value is `HTTPS` .
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
     * @param agentArns (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents
     * that can connect with your object storage system.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents
     * that can connect with your object storage system.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param bucketName Specifies the name of the object storage bucket involved in the transfer.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    override fun cmkSecretConfig(cmkSecretConfig: IResolvable) {
      cdkBuilder.cmkSecretConfig(cmkSecretConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    override
        fun cmkSecretConfig(cmkSecretConfig: CfnLocationObjectStorage.CmkSecretConfigProperty) {
      cdkBuilder.cmkSecretConfig(cmkSecretConfig.let(CfnLocationObjectStorage.CmkSecretConfigProperty.Companion::unwrap))
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * which includes the `SecretKey` that DataSync uses to access a specific object storage location,
     * with a customer-managed AWS KMS key .
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dba3e2987d376adc2137e306007986a33d7f1dfd5f8ebb243807b1f88320d78")
    override
        fun cmkSecretConfig(cmkSecretConfig: CfnLocationObjectStorage.CmkSecretConfigProperty.Builder.() -> Unit):
        Unit = cmkSecretConfig(CfnLocationObjectStorage.CmkSecretConfigProperty(cmkSecretConfig))

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    override fun customSecretConfig(customSecretConfig: IResolvable) {
      cdkBuilder.customSecretConfig(customSecretConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    override
        fun customSecretConfig(customSecretConfig: CfnLocationObjectStorage.CustomSecretConfigProperty) {
      cdkBuilder.customSecretConfig(customSecretConfig.let(CfnLocationObjectStorage.CustomSecretConfigProperty.Companion::unwrap))
    }

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where the secret key for a specific object storage location is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb17ae3c7ee31d421f05348a52b86e8a64c36d81729cfdd760b06c57efbd871a")
    override
        fun customSecretConfig(customSecretConfig: CfnLocationObjectStorage.CustomSecretConfigProperty.Builder.() -> Unit):
        Unit =
        customSecretConfig(CfnLocationObjectStorage.CustomSecretConfigProperty(customSecretConfig))

    /**
     * @param secretKey Specifies the secret key (for example, a password) if credentials are
     * required to authenticate with the object storage server.
     *
     * If you provide a secret using `SecretKey` , but do not provide secret configuration details
     * using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the token using your AWS
     * account's Secrets Manager secret.
     */
    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    /**
     * @param serverCertificate Specifies a certificate chain for DataSync to authenticate with your
     * object storage system if the system uses a private or self-signed certificate authority (CA).
     * You must specify a single `.pem` file with a full certificate chain (for example,
     * `file:///home/user/.ssh/object_storage_certificates.pem` ).
     *
     * The certificate chain might include:
     *
     * * The object storage system's certificate
     * * All intermediate certificates (if there are any)
     * * The root certificate of the signing CA
     *
     * You can concatenate your certificates into a `.pem` file (which can be up to 32768 bytes
     * before base64 encoding). The following example `cat` command creates an
     * `object_storage_certificates.pem` file that includes three certificates:
     *
     * `cat object_server_certificate.pem intermediate_certificate.pem ca_root_certificate.pem &gt;
     * object_storage_certificates.pem`
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     */
    override fun serverCertificate(serverCertificate: String) {
      cdkBuilder.serverCertificate(serverCertificate)
    }

    /**
     * @param serverHostname Specifies the domain name or IP address (IPv4 or IPv6) of the object
     * storage server that your DataSync agent connects to.
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
     * If not specified, the default value is `HTTPS` .
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps,
  ) : CdkObject(cdkObject),
      CfnLocationObjectStorageProps {
    /**
     * Specifies the access key (for example, a user name) if credentials are required to
     * authenticate with the object storage server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-accesskey)
     */
    override fun accessKey(): String? = unwrap(this).getAccessKey()

    /**
     * (Optional) Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can connect
     * with your object storage system.
     *
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

    /**
     * Specifies the name of the object storage bucket involved in the transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * Specifies configuration information for a DataSync-managed secret, which includes the
     * `SecretKey` that DataSync uses to access a specific object storage location, with a
     * customer-managed AWS KMS key .
     *
     * When you include this paramater as part of a `CreateLocationObjectStorage` request, you
     * provide only the KMS key ARN. DataSync uses this KMS key together with the value you specify for
     * the `SecretKey` parameter to create a DataSync-managed secret to store the location access
     * credentials.
     *
     * Make sure the DataSync has permission to access the KMS key that you specify.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-cmksecretconfig)
     */
    override fun cmkSecretConfig(): Any? = unwrap(this).getCmkSecretConfig()

    /**
     * Specifies configuration information for a customer-managed Secrets Manager secret where the
     * secret key for a specific object storage location is stored in plain text.
     *
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` (with `SecretKey` ) or `CustomSecretConfig` (without
     * `SecretKey` ) to provide credentials for a `CreateLocationObjectStorage` request. Do not provide
     * both parameters for the same request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-customsecretconfig)
     */
    override fun customSecretConfig(): Any? = unwrap(this).getCustomSecretConfig()

    /**
     * Specifies the secret key (for example, a password) if credentials are required to
     * authenticate with the object storage server.
     *
     *
     * If you provide a secret using `SecretKey` , but do not provide secret configuration details
     * using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the token using your AWS
     * account's Secrets Manager secret.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-secretkey)
     */
    override fun secretKey(): String? = unwrap(this).getSecretKey()

    /**
     * Specifies a certificate chain for DataSync to authenticate with your object storage system if
     * the system uses a private or self-signed certificate authority (CA).
     *
     * You must specify a single `.pem` file with a full certificate chain (for example,
     * `file:///home/user/.ssh/object_storage_certificates.pem` ).
     *
     * The certificate chain might include:
     *
     * * The object storage system's certificate
     * * All intermediate certificates (if there are any)
     * * The root certificate of the signing CA
     *
     * You can concatenate your certificates into a `.pem` file (which can be up to 32768 bytes
     * before base64 encoding). The following example `cat` command creates an
     * `object_storage_certificates.pem` file that includes three certificates:
     *
     * `cat object_server_certificate.pem intermediate_certificate.pem ca_root_certificate.pem &gt;
     * object_storage_certificates.pem`
     *
     * To use this parameter, configure `ServerProtocol` to `HTTPS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html#cfn-datasync-locationobjectstorage-servercertificate)
     */
    override fun serverCertificate(): String? = unwrap(this).getServerCertificate()

    /**
     * Specifies the domain name or IP address (IPv4 or IPv6) of the object storage server that your
     * DataSync agent connects to.
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
     * If not specified, the default value is `HTTPS` .
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
        CfnLocationObjectStorageProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLocationObjectStorageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationObjectStorageProps):
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps
  }
}
