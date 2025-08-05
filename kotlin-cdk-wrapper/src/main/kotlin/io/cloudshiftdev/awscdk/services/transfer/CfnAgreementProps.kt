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
 * Properties for defining a `CfnAgreement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnAgreementProps cfnAgreementProps = CfnAgreementProps.builder()
 * .accessRole("accessRole")
 * .localProfileId("localProfileId")
 * .partnerProfileId("partnerProfileId")
 * .serverId("serverId")
 * // the properties below are optional
 * .baseDirectory("baseDirectory")
 * .customDirectories(CustomDirectoriesProperty.builder()
 * .failedFilesDirectory("failedFilesDirectory")
 * .mdnFilesDirectory("mdnFilesDirectory")
 * .payloadFilesDirectory("payloadFilesDirectory")
 * .statusFilesDirectory("statusFilesDirectory")
 * .temporaryFilesDirectory("temporaryFilesDirectory")
 * .build())
 * .description("description")
 * .enforceMessageSigning("enforceMessageSigning")
 * .preserveFilename("preserveFilename")
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html)
 */
public interface CfnAgreementProps {
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-accessrole)
   */
  public fun accessRole(): String

  /**
   * The landing directory (folder) for files that are transferred by using the AS2 protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-basedirectory)
   */
  public fun baseDirectory(): String? = unwrap(this).getBaseDirectory()

  /**
   * A `CustomDirectoriesType` structure.
   *
   * This structure specifies custom directories for storing various AS2 message files. You can
   * specify directories for the following types of files.
   *
   * * Failed files
   * * MDN files
   * * Payload files
   * * Status files
   * * Temporary files
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-customdirectories)
   */
  public fun customDirectories(): Any? = unwrap(this).getCustomDirectories()

  /**
   * The name or short description that's used to identify the agreement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Determines whether or not unsigned messages from your trading partners will be accepted.
   *
   * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
   * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
   * partner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-enforcemessagesigning)
   */
  public fun enforceMessageSigning(): String? = unwrap(this).getEnforceMessageSigning()

  /**
   * A unique identifier for the AS2 local profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-localprofileid)
   */
  public fun localProfileId(): String

  /**
   * A unique identifier for the partner profile used in the agreement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-partnerprofileid)
   */
  public fun partnerProfileId(): String

  /**
   * Determines whether or not Transfer Family appends a unique string of characters to the end of
   * the AS2 message payload filename when saving it.
   *
   * * `ENABLED` : the filename provided by your trading parter is preserved when the file is saved.
   * * `DISABLED` (default value): when Transfer Family saves the file, the filename is adjusted, as
   * described in [File names and
   * locations](https://docs.aws.amazon.com/transfer/latest/userguide/send-as2-messages.html#file-names-as2)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-preservefilename)
   */
  public fun preserveFilename(): String? = unwrap(this).getPreserveFilename()

  /**
   * A system-assigned unique identifier for a server instance.
   *
   * This identifier indicates the specific server that the agreement uses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-serverid)
   */
  public fun serverId(): String

  /**
   * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Key-value pairs that can be used to group and search for agreements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAgreementProps]
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
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     * the AS2 protocol.
     */
    public fun baseDirectory(baseDirectory: String)

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    public fun customDirectories(customDirectories: IResolvable)

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    public fun customDirectories(customDirectories: CfnAgreement.CustomDirectoriesProperty)

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("713ea5bea3d968f79f186c2157bfde7678d6376d6ea235a721e960ff7a06e347")
    public
        fun customDirectories(customDirectories: CfnAgreement.CustomDirectoriesProperty.Builder.() -> Unit)

    /**
     * @param description The name or short description that's used to identify the agreement.
     */
    public fun description(description: String)

    /**
     * @param enforceMessageSigning Determines whether or not unsigned messages from your trading
     * partners will be accepted.
     * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
     * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
     * partner.
     */
    public fun enforceMessageSigning(enforceMessageSigning: String)

    /**
     * @param localProfileId A unique identifier for the AS2 local profile. 
     */
    public fun localProfileId(localProfileId: String)

    /**
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement. 
     */
    public fun partnerProfileId(partnerProfileId: String)

    /**
     * @param preserveFilename Determines whether or not Transfer Family appends a unique string of
     * characters to the end of the AS2 message payload filename when saving it.
     * * `ENABLED` : the filename provided by your trading parter is preserved when the file is
     * saved.
     * * `DISABLED` (default value): when Transfer Family saves the file, the filename is adjusted,
     * as described in [File names and
     * locations](https://docs.aws.amazon.com/transfer/latest/userguide/send-as2-messages.html#file-names-as2)
     * .
     */
    public fun preserveFilename(preserveFilename: String)

    /**
     * @param serverId A system-assigned unique identifier for a server instance. 
     * This identifier indicates the specific server that the agreement uses.
     */
    public fun serverId(serverId: String)

    /**
     * @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     */
    public fun status(status: String)

    /**
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnAgreementProps.Builder =
        software.amazon.awscdk.services.transfer.CfnAgreementProps.builder()

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
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     * the AS2 protocol.
     */
    override fun baseDirectory(baseDirectory: String) {
      cdkBuilder.baseDirectory(baseDirectory)
    }

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    override fun customDirectories(customDirectories: IResolvable) {
      cdkBuilder.customDirectories(customDirectories.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    override fun customDirectories(customDirectories: CfnAgreement.CustomDirectoriesProperty) {
      cdkBuilder.customDirectories(customDirectories.let(CfnAgreement.CustomDirectoriesProperty.Companion::unwrap))
    }

    /**
     * @param customDirectories A `CustomDirectoriesType` structure.
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("713ea5bea3d968f79f186c2157bfde7678d6376d6ea235a721e960ff7a06e347")
    override
        fun customDirectories(customDirectories: CfnAgreement.CustomDirectoriesProperty.Builder.() -> Unit):
        Unit = customDirectories(CfnAgreement.CustomDirectoriesProperty(customDirectories))

    /**
     * @param description The name or short description that's used to identify the agreement.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enforceMessageSigning Determines whether or not unsigned messages from your trading
     * partners will be accepted.
     * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
     * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
     * partner.
     */
    override fun enforceMessageSigning(enforceMessageSigning: String) {
      cdkBuilder.enforceMessageSigning(enforceMessageSigning)
    }

    /**
     * @param localProfileId A unique identifier for the AS2 local profile. 
     */
    override fun localProfileId(localProfileId: String) {
      cdkBuilder.localProfileId(localProfileId)
    }

    /**
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement. 
     */
    override fun partnerProfileId(partnerProfileId: String) {
      cdkBuilder.partnerProfileId(partnerProfileId)
    }

    /**
     * @param preserveFilename Determines whether or not Transfer Family appends a unique string of
     * characters to the end of the AS2 message payload filename when saving it.
     * * `ENABLED` : the filename provided by your trading parter is preserved when the file is
     * saved.
     * * `DISABLED` (default value): when Transfer Family saves the file, the filename is adjusted,
     * as described in [File names and
     * locations](https://docs.aws.amazon.com/transfer/latest/userguide/send-as2-messages.html#file-names-as2)
     * .
     */
    override fun preserveFilename(preserveFilename: String) {
      cdkBuilder.preserveFilename(preserveFilename)
    }

    /**
     * @param serverId A system-assigned unique identifier for a server instance. 
     * This identifier indicates the specific server that the agreement uses.
     */
    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    /**
     * @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnAgreementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnAgreementProps,
  ) : CdkObject(cdkObject),
      CfnAgreementProps {
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-accessrole)
     */
    override fun accessRole(): String = unwrap(this).getAccessRole()

    /**
     * The landing directory (folder) for files that are transferred by using the AS2 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-basedirectory)
     */
    override fun baseDirectory(): String? = unwrap(this).getBaseDirectory()

    /**
     * A `CustomDirectoriesType` structure.
     *
     * This structure specifies custom directories for storing various AS2 message files. You can
     * specify directories for the following types of files.
     *
     * * Failed files
     * * MDN files
     * * Payload files
     * * Status files
     * * Temporary files
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-customdirectories)
     */
    override fun customDirectories(): Any? = unwrap(this).getCustomDirectories()

    /**
     * The name or short description that's used to identify the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Determines whether or not unsigned messages from your trading partners will be accepted.
     *
     * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
     * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
     * partner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-enforcemessagesigning)
     */
    override fun enforceMessageSigning(): String? = unwrap(this).getEnforceMessageSigning()

    /**
     * A unique identifier for the AS2 local profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-localprofileid)
     */
    override fun localProfileId(): String = unwrap(this).getLocalProfileId()

    /**
     * A unique identifier for the partner profile used in the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-partnerprofileid)
     */
    override fun partnerProfileId(): String = unwrap(this).getPartnerProfileId()

    /**
     * Determines whether or not Transfer Family appends a unique string of characters to the end of
     * the AS2 message payload filename when saving it.
     *
     * * `ENABLED` : the filename provided by your trading parter is preserved when the file is
     * saved.
     * * `DISABLED` (default value): when Transfer Family saves the file, the filename is adjusted,
     * as described in [File names and
     * locations](https://docs.aws.amazon.com/transfer/latest/userguide/send-as2-messages.html#file-names-as2)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-preservefilename)
     */
    override fun preserveFilename(): String? = unwrap(this).getPreserveFilename()

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This identifier indicates the specific server that the agreement uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-serverid)
     */
    override fun serverId(): String = unwrap(this).getServerId()

    /**
     * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgreementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreementProps):
        CfnAgreementProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAgreementProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgreementProps):
        software.amazon.awscdk.services.transfer.CfnAgreementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnAgreementProps
  }
}
