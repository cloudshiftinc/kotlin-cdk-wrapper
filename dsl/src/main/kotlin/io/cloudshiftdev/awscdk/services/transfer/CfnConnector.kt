package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnConnector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Connectors are used to send files using either the AS2 or SFTP protocol.
   */
  public open fun accessRole(): String = unwrap(this).getAccessRole()

  /**
   * Connectors are used to send files using either the AS2 or SFTP protocol.
   */
  public open fun accessRole(`value`: String) {
    unwrap(this).setAccessRole(`value`)
  }

  /**
   * A structure that contains the parameters for an AS2 connector object.
   */
  public open fun as2Config(): Any? = unwrap(this).getAs2Config()

  /**
   * A structure that contains the parameters for an AS2 connector object.
   */
  public open fun as2Config(`value`: Any) {
    unwrap(this).setAs2Config(`value`)
  }

  /**
   * Specifies the unique Amazon Resource Name (ARN) for the connector.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The service-assigned ID of the connector that is created.
   */
  public open fun attrConnectorId(): String = unwrap(this).getAttrConnectorId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a connector to turn on CloudWatch logging for Amazon S3 events.
   */
  public open fun loggingRole(): String? = unwrap(this).getLoggingRole()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a connector to turn on CloudWatch logging for Amazon S3 events.
   */
  public open fun loggingRole(`value`: String) {
    unwrap(this).setLoggingRole(`value`)
  }

  /**
   * A structure that contains the parameters for an SFTP connector object.
   */
  public open fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

  /**
   * A structure that contains the parameters for an SFTP connector object.
   */
  public open fun sftpConfig(`value`: IResolvable) {
    unwrap(this).setSftpConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that contains the parameters for an SFTP connector object.
   */
  public open fun sftpConfig(`value`: SftpConfigProperty) {
    unwrap(this).setSftpConfig(`value`.let(SftpConfigProperty::unwrap))
  }

  /**
   * A structure that contains the parameters for an SFTP connector object.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("48dc8b5e1f62638ad400fbf6ab78f860243bbb09101238b3ce4e57d7a0381c84")
  public open fun sftpConfig(`value`: SftpConfigProperty.Builder.() -> Unit): Unit =
      sftpConfig(SftpConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for connectors.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for connectors.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for connectors.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The URL of the partner's AS2 or SFTP endpoint.
   */
  public open fun url(): String = unwrap(this).getUrl()

  /**
   * The URL of the partner's AS2 or SFTP endpoint.
   */
  public open fun url(`value`: String) {
    unwrap(this).setUrl(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnConnector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Connectors are used to send files using either the AS2 or SFTP protocol.
     *
     * For the access role, provide the Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management role to use.
     *
     * *For AS2 connectors*
     *
     * With AS2, you can send files by calling `StartFileTransfer` and specifying the file paths in
     * the request parameter, `SendFilePaths` . We use the file’s parent directory (for example, for
     * `--send-file-paths /bucket/dir/file.txt` , parent directory is `/bucket/dir/` ) to temporarily
     * store a processed AS2 message file, store the MDN when we receive them from the partner, and
     * write a final JSON file containing relevant metadata of the transmission. So, the `AccessRole`
     * needs to provide read and write access to the parent directory of the file location used in the
     * `StartFileTransfer` request. Additionally, you need to provide read and write access to the
     * parent directory of the files that you intend to send with `StartFileTransfer` .
     *
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * `secretsmanager:GetSecretValue` permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the AWS managed key in Secrets Manager, then the role also needs
     * the `kms:Decrypt` permission for that key.
     *
     * *For SFTP connectors*
     *
     * Make sure that the access role provides read and write access to the parent directory of the
     * file location that's used in the `StartFileTransfer` request. Additionally, make sure that the
     * role provides `secretsmanager:GetSecretValue` permission to AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-accessrole)
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
     */
    public fun accessRole(accessRole: String)

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
     * @param as2Config A structure that contains the parameters for an AS2 connector object. 
     */
    public fun as2Config(as2Config: Any)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a connector to turn on CloudWatch logging for Amazon S3 events.
     *
     * When set, you can view connector activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-loggingrole)
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events. 
     */
    public fun loggingRole(loggingRole: String)

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    public fun sftpConfig(sftpConfig: IResolvable)

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    public fun sftpConfig(sftpConfig: SftpConfigProperty)

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("551491faf5309b95d20254db285f3de1430e0c6d356bcef2291e1b6349cbf9d5")
    public fun sftpConfig(sftpConfig: SftpConfigProperty.Builder.() -> Unit)

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     * @param tags Key-value pairs that can be used to group and search for connectors. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     * @param tags Key-value pairs that can be used to group and search for connectors. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The URL of the partner's AS2 or SFTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-url)
     * @param url The URL of the partner's AS2 or SFTP endpoint. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnConnector.Builder =
        software.amazon.awscdk.services.transfer.CfnConnector.Builder.create(scope, id)

    /**
     * Connectors are used to send files using either the AS2 or SFTP protocol.
     *
     * For the access role, provide the Amazon Resource Name (ARN) of the AWS Identity and Access
     * Management role to use.
     *
     * *For AS2 connectors*
     *
     * With AS2, you can send files by calling `StartFileTransfer` and specifying the file paths in
     * the request parameter, `SendFilePaths` . We use the file’s parent directory (for example, for
     * `--send-file-paths /bucket/dir/file.txt` , parent directory is `/bucket/dir/` ) to temporarily
     * store a processed AS2 message file, store the MDN when we receive them from the partner, and
     * write a final JSON file containing relevant metadata of the transmission. So, the `AccessRole`
     * needs to provide read and write access to the parent directory of the file location used in the
     * `StartFileTransfer` request. Additionally, you need to provide read and write access to the
     * parent directory of the files that you intend to send with `StartFileTransfer` .
     *
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * `secretsmanager:GetSecretValue` permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the AWS managed key in Secrets Manager, then the role also needs
     * the `kms:Decrypt` permission for that key.
     *
     * *For SFTP connectors*
     *
     * Make sure that the access role provides read and write access to the parent directory of the
     * file location that's used in the `StartFileTransfer` request. Additionally, make sure that the
     * role provides `secretsmanager:GetSecretValue` permission to AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-accessrole)
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
     */
    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
     * @param as2Config A structure that contains the parameters for an AS2 connector object. 
     */
    override fun as2Config(as2Config: Any) {
      cdkBuilder.as2Config(as2Config)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a connector to turn on CloudWatch logging for Amazon S3 events.
     *
     * When set, you can view connector activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-loggingrole)
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events. 
     */
    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    override fun sftpConfig(sftpConfig: IResolvable) {
      cdkBuilder.sftpConfig(sftpConfig.let(IResolvable::unwrap))
    }

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    override fun sftpConfig(sftpConfig: SftpConfigProperty) {
      cdkBuilder.sftpConfig(sftpConfig.let(SftpConfigProperty::unwrap))
    }

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("551491faf5309b95d20254db285f3de1430e0c6d356bcef2291e1b6349cbf9d5")
    override fun sftpConfig(sftpConfig: SftpConfigProperty.Builder.() -> Unit): Unit =
        sftpConfig(SftpConfigProperty(sftpConfig))

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     * @param tags Key-value pairs that can be used to group and search for connectors. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     * @param tags Key-value pairs that can be used to group and search for connectors. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The URL of the partner's AS2 or SFTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-url)
     * @param url The URL of the partner's AS2 or SFTP endpoint. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnConnector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.transfer.CfnConnector = wrapped.cdkObject
  }

  public interface SftpConfigProperty {
    /**
     * The public portion of the host key, or keys, that are used to identify the external server to
     * which you are connecting.
     *
     * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary key.
     *
     * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
     * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify only
     * the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;` portion of
     * the key.
     *
     * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
     *
     * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
     * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
     * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
     * generated.
     *
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is
     * `ftp.host.com` .
     *
     * `ssh-keyscan ftp.host.com`
     *
     * This prints the public host key to standard output.
     *
     * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
     *
     * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
     * command or into the *Trusted host keys* field in the console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html#cfn-transfer-connector-sftpconfig-trustedhostkeys)
     */
    public fun trustedHostKeys(): List<String> = unwrap(this).getTrustedHostKeys() ?: emptyList()

    /**
     * The identifier for the secret (in AWS Secrets Manager) that contains the SFTP user's private
     * key, password, or both.
     *
     * The identifier must be the Amazon Resource Name (ARN) of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html#cfn-transfer-connector-sftpconfig-usersecretid)
     */
    public fun userSecretId(): String? = unwrap(this).getUserSecretId()

    /**
     * A builder for [SftpConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param trustedHostKeys The public portion of the host key, or keys, that are used to
       * identify the external server to which you are connecting.
       * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary
       * key.
       *
       * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
       * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify
       * only the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;`
       * portion of the key.
       *
       * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
       *
       * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
       * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
       * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
       * generated.
       *
       * Run this command to retrieve the SFTP server host key, where your SFTP server name is
       * `ftp.host.com` .
       *
       * `ssh-keyscan ftp.host.com`
       *
       * This prints the public host key to standard output.
       *
       * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
       *
       * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
       * command or into the *Trusted host keys* field in the console.
       */
      public fun trustedHostKeys(trustedHostKeys: List<String>)

      /**
       * @param trustedHostKeys The public portion of the host key, or keys, that are used to
       * identify the external server to which you are connecting.
       * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary
       * key.
       *
       * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
       * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify
       * only the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;`
       * portion of the key.
       *
       * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
       *
       * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
       * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
       * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
       * generated.
       *
       * Run this command to retrieve the SFTP server host key, where your SFTP server name is
       * `ftp.host.com` .
       *
       * `ssh-keyscan ftp.host.com`
       *
       * This prints the public host key to standard output.
       *
       * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
       *
       * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
       * command or into the *Trusted host keys* field in the console.
       */
      public fun trustedHostKeys(vararg trustedHostKeys: String)

      /**
       * @param userSecretId The identifier for the secret (in AWS Secrets Manager) that contains
       * the SFTP user's private key, password, or both.
       * The identifier must be the Amazon Resource Name (ARN) of the secret.
       */
      public fun userSecretId(userSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty.builder()

      /**
       * @param trustedHostKeys The public portion of the host key, or keys, that are used to
       * identify the external server to which you are connecting.
       * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary
       * key.
       *
       * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
       * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify
       * only the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;`
       * portion of the key.
       *
       * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
       *
       * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
       * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
       * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
       * generated.
       *
       * Run this command to retrieve the SFTP server host key, where your SFTP server name is
       * `ftp.host.com` .
       *
       * `ssh-keyscan ftp.host.com`
       *
       * This prints the public host key to standard output.
       *
       * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
       *
       * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
       * command or into the *Trusted host keys* field in the console.
       */
      override fun trustedHostKeys(trustedHostKeys: List<String>) {
        cdkBuilder.trustedHostKeys(trustedHostKeys)
      }

      /**
       * @param trustedHostKeys The public portion of the host key, or keys, that are used to
       * identify the external server to which you are connecting.
       * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary
       * key.
       *
       * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
       * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify
       * only the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;`
       * portion of the key.
       *
       * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
       *
       * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
       * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
       * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
       * generated.
       *
       * Run this command to retrieve the SFTP server host key, where your SFTP server name is
       * `ftp.host.com` .
       *
       * `ssh-keyscan ftp.host.com`
       *
       * This prints the public host key to standard output.
       *
       * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
       *
       * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
       * command or into the *Trusted host keys* field in the console.
       */
      override fun trustedHostKeys(vararg trustedHostKeys: String): Unit =
          trustedHostKeys(trustedHostKeys.toList())

      /**
       * @param userSecretId The identifier for the secret (in AWS Secrets Manager) that contains
       * the SFTP user's private key, password, or both.
       * The identifier must be the Amazon Resource Name (ARN) of the secret.
       */
      override fun userSecretId(userSecretId: String) {
        cdkBuilder.userSecretId(userSecretId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty,
    ) : CdkObject(cdkObject), SftpConfigProperty {
      /**
       * The public portion of the host key, or keys, that are used to identify the external server
       * to which you are connecting.
       *
       * You can use the `ssh-keyscan` command against the SFTP server to retrieve the necessary
       * key.
       *
       * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
       * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element. Specify
       * only the `&lt;key type&gt;` and `&lt;body base64&gt;` : do not enter the `&lt;comment&gt;`
       * portion of the key.
       *
       * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
       *
       * * For RSA keys, the `&lt;key type&gt;` string is `ssh-rsa` .
       * * For ECDSA keys, the `&lt;key type&gt;` string is either `ecdsa-sha2-nistp256` ,
       * `ecdsa-sha2-nistp384` , or `ecdsa-sha2-nistp521` , depending on the size of the key you
       * generated.
       *
       * Run this command to retrieve the SFTP server host key, where your SFTP server name is
       * `ftp.host.com` .
       *
       * `ssh-keyscan ftp.host.com`
       *
       * This prints the public host key to standard output.
       *
       * `ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key`
       *
       * Copy and paste this string into the `TrustedHostKeys` field for the `create-connector`
       * command or into the *Trusted host keys* field in the console.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html#cfn-transfer-connector-sftpconfig-trustedhostkeys)
       */
      override fun trustedHostKeys(): List<String> = unwrap(this).getTrustedHostKeys() ?:
          emptyList()

      /**
       * The identifier for the secret (in AWS Secrets Manager) that contains the SFTP user's
       * private key, password, or both.
       *
       * The identifier must be the Amazon Resource Name (ARN) of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html#cfn-transfer-connector-sftpconfig-usersecretid)
       */
      override fun userSecretId(): String? = unwrap(this).getUserSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SftpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty):
          SftpConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SftpConfigProperty):
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty
    }
  }

  public interface As2ConfigProperty {
    /**
     * Provides Basic authentication support to the AS2 Connectors API.
     *
     * To use Basic authentication, you must provide the name or Amazon Resource Name (ARN) of a
     * secret in AWS Secrets Manager .
     *
     * The default value for this parameter is `null` , which indicates that Basic authentication is
     * not enabled for the connector.
     *
     * If the connector should use Basic authentication, the secret needs to be in the following
     * format:
     *
     * `{ "Username": "user-name", "Password": "user-password" }`
     *
     * Replace `user-name` and `user-password` with the credentials for the actual user that is
     * being authenticated.
     *
     * Note the following:
     *
     * * You are storing these credentials in Secrets Manager, *not passing them directly* into this
     * API.
     * * If you are using the API, SDKs, or CloudFormation to configure your connector, then you
     * must create the secret before you can enable Basic authentication. However, if you are using the
     * AWS management console, you can have the system create the secret for you.
     *
     * If you have previously enabled Basic authentication for a connector, you can disable it by
     * using the `UpdateConnector` API call. For example, if you are using the CLI, you can run the
     * following command to remove Basic authentication:
     *
     * `update-connector --connector-id my-connector-id --as2-config 'BasicAuthSecretId=""'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-basicauthsecretid)
     */
    public fun basicAuthSecretId(): String? = unwrap(this).getBasicAuthSecretId()

    /**
     * Specifies whether the AS2 file is compressed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-compression)
     */
    public fun compression(): String? = unwrap(this).getCompression()

    /**
     * The algorithm that is used to encrypt the file.
     *
     *
     * You can only specify `NONE` if the URL for your connector uses HTTPS. This ensures that no
     * traffic is sent in clear text.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-encryptionalgorithm)
     */
    public fun encryptionAlgorithm(): String? = unwrap(this).getEncryptionAlgorithm()

    /**
     * A unique identifier for the AS2 local profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-localprofileid)
     */
    public fun localProfileId(): String? = unwrap(this).getLocalProfileId()

    /**
     * Used for outbound requests (from an AWS Transfer Family server to a partner AS2 server) to
     * determine whether the partner response for transfers is synchronous or asynchronous.
     *
     * Specify either of the following values:
     *
     * * `SYNC` : The system expects a synchronous MDN response, confirming that the file was
     * transferred successfully (or not).
     * * `NONE` : Specifies that no MDN response is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-mdnresponse)
     */
    public fun mdnResponse(): String? = unwrap(this).getMdnResponse()

    /**
     * The signing algorithm for the MDN response.
     *
     *
     * If set to DEFAULT (or not set at all), the value for `SigningAlgorithm` is used.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-mdnsigningalgorithm)
     */
    public fun mdnSigningAlgorithm(): String? = unwrap(this).getMdnSigningAlgorithm()

    /**
     * Used as the `Subject` HTTP header attribute in AS2 messages that are being sent with the
     * connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-messagesubject)
     */
    public fun messageSubject(): String? = unwrap(this).getMessageSubject()

    /**
     * A unique identifier for the partner profile for the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-partnerprofileid)
     */
    public fun partnerProfileId(): String? = unwrap(this).getPartnerProfileId()

    /**
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-signingalgorithm)
     */
    public fun signingAlgorithm(): String? = unwrap(this).getSigningAlgorithm()

    /**
     * A builder for [As2ConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuthSecretId Provides Basic authentication support to the AS2 Connectors API.
       * To use Basic authentication, you must provide the name or Amazon Resource Name (ARN) of a
       * secret in AWS Secrets Manager .
       *
       * The default value for this parameter is `null` , which indicates that Basic authentication
       * is not enabled for the connector.
       *
       * If the connector should use Basic authentication, the secret needs to be in the following
       * format:
       *
       * `{ "Username": "user-name", "Password": "user-password" }`
       *
       * Replace `user-name` and `user-password` with the credentials for the actual user that is
       * being authenticated.
       *
       * Note the following:
       *
       * * You are storing these credentials in Secrets Manager, *not passing them directly* into
       * this API.
       * * If you are using the API, SDKs, or CloudFormation to configure your connector, then you
       * must create the secret before you can enable Basic authentication. However, if you are using
       * the AWS management console, you can have the system create the secret for you.
       *
       * If you have previously enabled Basic authentication for a connector, you can disable it by
       * using the `UpdateConnector` API call. For example, if you are using the CLI, you can run the
       * following command to remove Basic authentication:
       *
       * `update-connector --connector-id my-connector-id --as2-config 'BasicAuthSecretId=""'`
       */
      public fun basicAuthSecretId(basicAuthSecretId: String)

      /**
       * @param compression Specifies whether the AS2 file is compressed.
       */
      public fun compression(compression: String)

      /**
       * @param encryptionAlgorithm The algorithm that is used to encrypt the file.
       *
       * You can only specify `NONE` if the URL for your connector uses HTTPS. This ensures that no
       * traffic is sent in clear text.
       */
      public fun encryptionAlgorithm(encryptionAlgorithm: String)

      /**
       * @param localProfileId A unique identifier for the AS2 local profile.
       */
      public fun localProfileId(localProfileId: String)

      /**
       * @param mdnResponse Used for outbound requests (from an AWS Transfer Family server to a
       * partner AS2 server) to determine whether the partner response for transfers is synchronous or
       * asynchronous.
       * Specify either of the following values:
       *
       * * `SYNC` : The system expects a synchronous MDN response, confirming that the file was
       * transferred successfully (or not).
       * * `NONE` : Specifies that no MDN response is required.
       */
      public fun mdnResponse(mdnResponse: String)

      /**
       * @param mdnSigningAlgorithm The signing algorithm for the MDN response.
       *
       * If set to DEFAULT (or not set at all), the value for `SigningAlgorithm` is used.
       */
      public fun mdnSigningAlgorithm(mdnSigningAlgorithm: String)

      /**
       * @param messageSubject Used as the `Subject` HTTP header attribute in AS2 messages that are
       * being sent with the connector.
       */
      public fun messageSubject(messageSubject: String)

      /**
       * @param partnerProfileId A unique identifier for the partner profile for the connector.
       */
      public fun partnerProfileId(partnerProfileId: String)

      /**
       * @param signingAlgorithm The algorithm that is used to sign the AS2 messages sent with the
       * connector.
       */
      public fun signingAlgorithm(signingAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty.builder()

      /**
       * @param basicAuthSecretId Provides Basic authentication support to the AS2 Connectors API.
       * To use Basic authentication, you must provide the name or Amazon Resource Name (ARN) of a
       * secret in AWS Secrets Manager .
       *
       * The default value for this parameter is `null` , which indicates that Basic authentication
       * is not enabled for the connector.
       *
       * If the connector should use Basic authentication, the secret needs to be in the following
       * format:
       *
       * `{ "Username": "user-name", "Password": "user-password" }`
       *
       * Replace `user-name` and `user-password` with the credentials for the actual user that is
       * being authenticated.
       *
       * Note the following:
       *
       * * You are storing these credentials in Secrets Manager, *not passing them directly* into
       * this API.
       * * If you are using the API, SDKs, or CloudFormation to configure your connector, then you
       * must create the secret before you can enable Basic authentication. However, if you are using
       * the AWS management console, you can have the system create the secret for you.
       *
       * If you have previously enabled Basic authentication for a connector, you can disable it by
       * using the `UpdateConnector` API call. For example, if you are using the CLI, you can run the
       * following command to remove Basic authentication:
       *
       * `update-connector --connector-id my-connector-id --as2-config 'BasicAuthSecretId=""'`
       */
      override fun basicAuthSecretId(basicAuthSecretId: String) {
        cdkBuilder.basicAuthSecretId(basicAuthSecretId)
      }

      /**
       * @param compression Specifies whether the AS2 file is compressed.
       */
      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      /**
       * @param encryptionAlgorithm The algorithm that is used to encrypt the file.
       *
       * You can only specify `NONE` if the URL for your connector uses HTTPS. This ensures that no
       * traffic is sent in clear text.
       */
      override fun encryptionAlgorithm(encryptionAlgorithm: String) {
        cdkBuilder.encryptionAlgorithm(encryptionAlgorithm)
      }

      /**
       * @param localProfileId A unique identifier for the AS2 local profile.
       */
      override fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
      }

      /**
       * @param mdnResponse Used for outbound requests (from an AWS Transfer Family server to a
       * partner AS2 server) to determine whether the partner response for transfers is synchronous or
       * asynchronous.
       * Specify either of the following values:
       *
       * * `SYNC` : The system expects a synchronous MDN response, confirming that the file was
       * transferred successfully (or not).
       * * `NONE` : Specifies that no MDN response is required.
       */
      override fun mdnResponse(mdnResponse: String) {
        cdkBuilder.mdnResponse(mdnResponse)
      }

      /**
       * @param mdnSigningAlgorithm The signing algorithm for the MDN response.
       *
       * If set to DEFAULT (or not set at all), the value for `SigningAlgorithm` is used.
       */
      override fun mdnSigningAlgorithm(mdnSigningAlgorithm: String) {
        cdkBuilder.mdnSigningAlgorithm(mdnSigningAlgorithm)
      }

      /**
       * @param messageSubject Used as the `Subject` HTTP header attribute in AS2 messages that are
       * being sent with the connector.
       */
      override fun messageSubject(messageSubject: String) {
        cdkBuilder.messageSubject(messageSubject)
      }

      /**
       * @param partnerProfileId A unique identifier for the partner profile for the connector.
       */
      override fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
      }

      /**
       * @param signingAlgorithm The algorithm that is used to sign the AS2 messages sent with the
       * connector.
       */
      override fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty,
    ) : CdkObject(cdkObject), As2ConfigProperty {
      /**
       * Provides Basic authentication support to the AS2 Connectors API.
       *
       * To use Basic authentication, you must provide the name or Amazon Resource Name (ARN) of a
       * secret in AWS Secrets Manager .
       *
       * The default value for this parameter is `null` , which indicates that Basic authentication
       * is not enabled for the connector.
       *
       * If the connector should use Basic authentication, the secret needs to be in the following
       * format:
       *
       * `{ "Username": "user-name", "Password": "user-password" }`
       *
       * Replace `user-name` and `user-password` with the credentials for the actual user that is
       * being authenticated.
       *
       * Note the following:
       *
       * * You are storing these credentials in Secrets Manager, *not passing them directly* into
       * this API.
       * * If you are using the API, SDKs, or CloudFormation to configure your connector, then you
       * must create the secret before you can enable Basic authentication. However, if you are using
       * the AWS management console, you can have the system create the secret for you.
       *
       * If you have previously enabled Basic authentication for a connector, you can disable it by
       * using the `UpdateConnector` API call. For example, if you are using the CLI, you can run the
       * following command to remove Basic authentication:
       *
       * `update-connector --connector-id my-connector-id --as2-config 'BasicAuthSecretId=""'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-basicauthsecretid)
       */
      override fun basicAuthSecretId(): String? = unwrap(this).getBasicAuthSecretId()

      /**
       * Specifies whether the AS2 file is compressed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-compression)
       */
      override fun compression(): String? = unwrap(this).getCompression()

      /**
       * The algorithm that is used to encrypt the file.
       *
       *
       * You can only specify `NONE` if the URL for your connector uses HTTPS. This ensures that no
       * traffic is sent in clear text.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-encryptionalgorithm)
       */
      override fun encryptionAlgorithm(): String? = unwrap(this).getEncryptionAlgorithm()

      /**
       * A unique identifier for the AS2 local profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-localprofileid)
       */
      override fun localProfileId(): String? = unwrap(this).getLocalProfileId()

      /**
       * Used for outbound requests (from an AWS Transfer Family server to a partner AS2 server) to
       * determine whether the partner response for transfers is synchronous or asynchronous.
       *
       * Specify either of the following values:
       *
       * * `SYNC` : The system expects a synchronous MDN response, confirming that the file was
       * transferred successfully (or not).
       * * `NONE` : Specifies that no MDN response is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-mdnresponse)
       */
      override fun mdnResponse(): String? = unwrap(this).getMdnResponse()

      /**
       * The signing algorithm for the MDN response.
       *
       *
       * If set to DEFAULT (or not set at all), the value for `SigningAlgorithm` is used.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-mdnsigningalgorithm)
       */
      override fun mdnSigningAlgorithm(): String? = unwrap(this).getMdnSigningAlgorithm()

      /**
       * Used as the `Subject` HTTP header attribute in AS2 messages that are being sent with the
       * connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-messagesubject)
       */
      override fun messageSubject(): String? = unwrap(this).getMessageSubject()

      /**
       * A unique identifier for the partner profile for the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-partnerprofileid)
       */
      override fun partnerProfileId(): String? = unwrap(this).getPartnerProfileId()

      /**
       * The algorithm that is used to sign the AS2 messages sent with the connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html#cfn-transfer-connector-as2config-signingalgorithm)
       */
      override fun signingAlgorithm(): String? = unwrap(this).getSigningAlgorithm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): As2ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty):
          As2ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: As2ConfigProperty):
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty
    }
  }
}
