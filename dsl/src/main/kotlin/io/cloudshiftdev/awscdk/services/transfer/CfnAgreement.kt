package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAgreement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement,
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
   * The unique identifier for the AS2 agreement, returned after the API call succeeds.
   */
  public open fun attrAgreementId(): String = unwrap(this).getAttrAgreementId()

  /**
   * Specifies the unique Amazon Resource Name (ARN) for the agreement.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The landing directory (folder) for files that are transferred by using the AS2 protocol.
   */
  public open fun baseDirectory(): String = unwrap(this).getBaseDirectory()

  /**
   * The landing directory (folder) for files that are transferred by using the AS2 protocol.
   */
  public open fun baseDirectory(`value`: String) {
    unwrap(this).setBaseDirectory(`value`)
  }

  /**
   * The name or short description that's used to identify the agreement.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or short description that's used to identify the agreement.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A unique identifier for the AS2 local profile.
   */
  public open fun localProfileId(): String = unwrap(this).getLocalProfileId()

  /**
   * A unique identifier for the AS2 local profile.
   */
  public open fun localProfileId(`value`: String) {
    unwrap(this).setLocalProfileId(`value`)
  }

  /**
   * A unique identifier for the partner profile used in the agreement.
   */
  public open fun partnerProfileId(): String = unwrap(this).getPartnerProfileId()

  /**
   * A unique identifier for the partner profile used in the agreement.
   */
  public open fun partnerProfileId(`value`: String) {
    unwrap(this).setPartnerProfileId(`value`)
  }

  /**
   * A system-assigned unique identifier for a server instance.
   */
  public open fun serverId(): String = unwrap(this).getServerId()

  /**
   * A system-assigned unique identifier for a server instance.
   */
  public open fun serverId(`value`: String) {
    unwrap(this).setServerId(`value`)
  }

  /**
   * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for agreements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for agreements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for agreements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnAgreement].
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-accessrole)
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
     */
    public fun accessRole(accessRole: String)

    /**
     * The landing directory (folder) for files that are transferred by using the AS2 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-basedirectory)
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     * the AS2 protocol. 
     */
    public fun baseDirectory(baseDirectory: String)

    /**
     * The name or short description that's used to identify the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
     * @param description The name or short description that's used to identify the agreement. 
     */
    public fun description(description: String)

    /**
     * A unique identifier for the AS2 local profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-localprofileid)
     * @param localProfileId A unique identifier for the AS2 local profile. 
     */
    public fun localProfileId(localProfileId: String)

    /**
     * A unique identifier for the partner profile used in the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-partnerprofileid)
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement. 
     */
    public fun partnerProfileId(partnerProfileId: String)

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This identifier indicates the specific server that the agreement uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-serverid)
     * @param serverId A system-assigned unique identifier for a server instance. 
     */
    public fun serverId(serverId: String)

    /**
     * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-status)
     * @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` . 
     */
    public fun status(status: String)

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     * @param tags Key-value pairs that can be used to group and search for agreements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     * @param tags Key-value pairs that can be used to group and search for agreements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnAgreement.Builder =
        software.amazon.awscdk.services.transfer.CfnAgreement.Builder.create(scope, id)

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
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol. 
     */
    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    /**
     * The landing directory (folder) for files that are transferred by using the AS2 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-basedirectory)
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     * the AS2 protocol. 
     */
    override fun baseDirectory(baseDirectory: String) {
      cdkBuilder.baseDirectory(baseDirectory)
    }

    /**
     * The name or short description that's used to identify the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
     * @param description The name or short description that's used to identify the agreement. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A unique identifier for the AS2 local profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-localprofileid)
     * @param localProfileId A unique identifier for the AS2 local profile. 
     */
    override fun localProfileId(localProfileId: String) {
      cdkBuilder.localProfileId(localProfileId)
    }

    /**
     * A unique identifier for the partner profile used in the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-partnerprofileid)
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement. 
     */
    override fun partnerProfileId(partnerProfileId: String) {
      cdkBuilder.partnerProfileId(partnerProfileId)
    }

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This identifier indicates the specific server that the agreement uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-serverid)
     * @param serverId A system-assigned unique identifier for a server instance. 
     */
    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    /**
     * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-status)
     * @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` . 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     * @param tags Key-value pairs that can be used to group and search for agreements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     * @param tags Key-value pairs that can be used to group and search for agreements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnAgreement = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgreement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgreement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement):
        CfnAgreement = CfnAgreement(cdkObject)

    internal fun unwrap(wrapped: CfnAgreement):
        software.amazon.awscdk.services.transfer.CfnAgreement = wrapped.cdkObject
  }
}
