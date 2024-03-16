@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * Object as2Config;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .accessRole("accessRole")
 * .url("url")
 * // the properties below are optional
 * .as2Config(as2Config)
 * .loggingRole("loggingRole")
 * .sftpConfig(SftpConfigProperty.builder()
 * .trustedHostKeys(List.of("trustedHostKeys"))
 * .userSecretId("userSecretId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html)
 */
public interface CfnConnectorProps {
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
   * store a processed AS2 message file, store the MDN when we receive them from the partner, and write
   * a final JSON file containing relevant metadata of the transmission. So, the `AccessRole` needs to
   * provide read and write access to the parent directory of the file location used in the
   * `StartFileTransfer` request. Additionally, you need to provide read and write access to the parent
   * directory of the files that you intend to send with `StartFileTransfer` .
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
   */
  public fun accessRole(): String

  /**
   * A structure that contains the parameters for an AS2 connector object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
   */
  public fun as2Config(): Any? = unwrap(this).getAs2Config()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a connector to turn on CloudWatch logging for Amazon S3 events.
   *
   * When set, you can view connector activity in your CloudWatch logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-loggingrole)
   */
  public fun loggingRole(): String? = unwrap(this).getLoggingRole()

  /**
   * A structure that contains the parameters for an SFTP connector object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
   */
  public fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

  /**
   * Key-value pairs that can be used to group and search for connectors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The URL of the partner's AS2 or SFTP endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-url)
   */
  public fun url(): String

  /**
   * A builder for [CfnConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
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
     */
    public fun accessRole(accessRole: String)

    /**
     * @param as2Config A structure that contains the parameters for an AS2 connector object.
     */
    public fun as2Config(as2Config: Any)

    /**
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events.
     * When set, you can view connector activity in your CloudWatch logs.
     */
    public fun loggingRole(loggingRole: String)

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    public fun sftpConfig(sftpConfig: IResolvable)

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    public fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty)

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7cefba7bac9e4e59575a37d5d88a936b7d6516616538da8411c1ce0bb2cfcb")
    public fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param url The URL of the partner's AS2 or SFTP endpoint. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.transfer.CfnConnectorProps.builder()

    /**
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
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
     */
    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    /**
     * @param as2Config A structure that contains the parameters for an AS2 connector object.
     */
    override fun as2Config(as2Config: Any) {
      cdkBuilder.as2Config(as2Config)
    }

    /**
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events.
     * When set, you can view connector activity in your CloudWatch logs.
     */
    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    override fun sftpConfig(sftpConfig: IResolvable) {
      cdkBuilder.sftpConfig(sftpConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    override fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty) {
      cdkBuilder.sftpConfig(sftpConfig.let(CfnConnector.SftpConfigProperty::unwrap))
    }

    /**
     * @param sftpConfig A structure that contains the parameters for an SFTP connector object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7cefba7bac9e4e59575a37d5d88a936b7d6516616538da8411c1ce0bb2cfcb")
    override fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty.Builder.() -> Unit): Unit =
        sftpConfig(CfnConnector.SftpConfigProperty(sftpConfig))

    /**
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param url The URL of the partner's AS2 or SFTP endpoint. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
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
     */
    override fun accessRole(): String = unwrap(this).getAccessRole()

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
     */
    override fun as2Config(): Any? = unwrap(this).getAs2Config()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a connector to turn on CloudWatch logging for Amazon S3 events.
     *
     * When set, you can view connector activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-loggingrole)
     */
    override fun loggingRole(): String? = unwrap(this).getLoggingRole()

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-sftpconfig)
     */
    override fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The URL of the partner's AS2 or SFTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-url)
     */
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnectorProps):
        CfnConnectorProps = CdkObjectWrappers.wrap(cdkObject) as CfnConnectorProps

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.transfer.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnConnectorProps
  }
}
