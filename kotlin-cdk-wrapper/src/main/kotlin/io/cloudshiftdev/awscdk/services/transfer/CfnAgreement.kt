@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an agreement.
 *
 * An agreement is a bilateral trading partner agreement, or partnership, between an AWS Transfer
 * Family server and an AS2 process. The agreement defines the file and message transfer relationship
 * between the server and the AS2 process. To define an agreement, Transfer Family combines a server,
 * local profile, partner profile, certificate, and other attributes.
 *
 * The partner is identified with the `PartnerProfileId` , and the AS2 process is identified with
 * the `LocalProfileId` .
 *
 *
 * Specify *either* `BaseDirectory` or `CustomDirectories` , but not both. Specifying both causes
 * the command to fail.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnAgreement cfnAgreement = CfnAgreement.Builder.create(this, "MyCfnAgreement")
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
public open class CfnAgreement(
  cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgreementProps,
  ) :
      this(software.amazon.awscdk.services.transfer.CfnAgreement(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAgreementProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgreementProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAgreementProps(props)
  )

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
  public open fun baseDirectory(): String? = unwrap(this).getBaseDirectory()

  /**
   * The landing directory (folder) for files that are transferred by using the AS2 protocol.
   */
  public open fun baseDirectory(`value`: String) {
    unwrap(this).setBaseDirectory(`value`)
  }

  /**
   * A `CustomDirectoriesType` structure.
   */
  public open fun customDirectories(): Any? = unwrap(this).getCustomDirectories()

  /**
   * A `CustomDirectoriesType` structure.
   */
  public open fun customDirectories(`value`: IResolvable) {
    unwrap(this).setCustomDirectories(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A `CustomDirectoriesType` structure.
   */
  public open fun customDirectories(`value`: CustomDirectoriesProperty) {
    unwrap(this).setCustomDirectories(`value`.let(CustomDirectoriesProperty.Companion::unwrap))
  }

  /**
   * A `CustomDirectoriesType` structure.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a98aa87996996d42d01374f78953f45fae3a0ade799ac26e15915ee682f50f6e")
  public open fun customDirectories(`value`: CustomDirectoriesProperty.Builder.() -> Unit): Unit =
      customDirectories(CustomDirectoriesProperty(`value`))

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
   * Determines whether or not unsigned messages from your trading partners will be accepted.
   */
  public open fun enforceMessageSigning(): String? = unwrap(this).getEnforceMessageSigning()

  /**
   * Determines whether or not unsigned messages from your trading partners will be accepted.
   */
  public open fun enforceMessageSigning(`value`: String) {
    unwrap(this).setEnforceMessageSigning(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * Determines whether or not Transfer Family appends a unique string of characters to the end of
   * the AS2 message payload filename when saving it.
   */
  public open fun preserveFilename(): String? = unwrap(this).getPreserveFilename()

  /**
   * Determines whether or not Transfer Family appends a unique string of characters to the end of
   * the AS2 message payload filename when saving it.
   */
  public open fun preserveFilename(`value`: String) {
    unwrap(this).setPreserveFilename(`value`)
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    public fun customDirectories(customDirectories: IResolvable)

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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    public fun customDirectories(customDirectories: CustomDirectoriesProperty)

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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9728fbb2e1fe6aaa5ce49648d102e9ebc0d2edf955349e823f54d3b733791161")
    public fun customDirectories(customDirectories: CustomDirectoriesProperty.Builder.() -> Unit)

    /**
     * The name or short description that's used to identify the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
     * @param description The name or short description that's used to identify the agreement. 
     */
    public fun description(description: String)

    /**
     * Determines whether or not unsigned messages from your trading partners will be accepted.
     *
     * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
     * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
     * partner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-enforcemessagesigning)
     * @param enforceMessageSigning Determines whether or not unsigned messages from your trading
     * partners will be accepted. 
     */
    public fun enforceMessageSigning(enforceMessageSigning: String)

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
     * @param preserveFilename Determines whether or not Transfer Family appends a unique string of
     * characters to the end of the AS2 message payload filename when saving it. 
     */
    public fun preserveFilename(preserveFilename: String)

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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    override fun customDirectories(customDirectories: IResolvable) {
      cdkBuilder.customDirectories(customDirectories.let(IResolvable.Companion::unwrap))
    }

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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    override fun customDirectories(customDirectories: CustomDirectoriesProperty) {
      cdkBuilder.customDirectories(customDirectories.let(CustomDirectoriesProperty.Companion::unwrap))
    }

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
     * @param customDirectories A `CustomDirectoriesType` structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9728fbb2e1fe6aaa5ce49648d102e9ebc0d2edf955349e823f54d3b733791161")
    override fun customDirectories(customDirectories: CustomDirectoriesProperty.Builder.() -> Unit):
        Unit = customDirectories(CustomDirectoriesProperty(customDirectories))

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
     * Determines whether or not unsigned messages from your trading partners will be accepted.
     *
     * * `ENABLED` : Transfer Family rejects unsigned messages from your trading partner.
     * * `DISABLED` (default value): Transfer Family accepts unsigned messages from your trading
     * partner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-enforcemessagesigning)
     * @param enforceMessageSigning Determines whether or not unsigned messages from your trading
     * partners will be accepted. 
     */
    override fun enforceMessageSigning(enforceMessageSigning: String) {
      cdkBuilder.enforceMessageSigning(enforceMessageSigning)
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
     * @param preserveFilename Determines whether or not Transfer Family appends a unique string of
     * characters to the end of the AS2 message payload filename when saving it. 
     */
    override fun preserveFilename(preserveFilename: String) {
      cdkBuilder.preserveFilename(preserveFilename)
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnAgreement.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.transfer.CfnAgreement = wrapped.cdkObject as
        software.amazon.awscdk.services.transfer.CfnAgreement
  }

  /**
   * Specifies a separate directory for each type of file to store for an AS2 message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * CustomDirectoriesProperty customDirectoriesProperty = CustomDirectoriesProperty.builder()
   * .failedFilesDirectory("failedFilesDirectory")
   * .mdnFilesDirectory("mdnFilesDirectory")
   * .payloadFilesDirectory("payloadFilesDirectory")
   * .statusFilesDirectory("statusFilesDirectory")
   * .temporaryFilesDirectory("temporaryFilesDirectory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html)
   */
  public interface CustomDirectoriesProperty {
    /**
     * Specifies a location to store the failed files for an AS2 message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-failedfilesdirectory)
     */
    public fun failedFilesDirectory(): String

    /**
     * Specifies a location to store the MDN file for an AS2 message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-mdnfilesdirectory)
     */
    public fun mdnFilesDirectory(): String

    /**
     * Specifies a location to store the payload file for an AS2 message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-payloadfilesdirectory)
     */
    public fun payloadFilesDirectory(): String

    /**
     * Specifies a location to store the status file for an AS2 message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-statusfilesdirectory)
     */
    public fun statusFilesDirectory(): String

    /**
     * Specifies a location to store the temporary processing file for an AS2 message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-temporaryfilesdirectory)
     */
    public fun temporaryFilesDirectory(): String

    /**
     * A builder for [CustomDirectoriesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failedFilesDirectory Specifies a location to store the failed files for an AS2
       * message. 
       */
      public fun failedFilesDirectory(failedFilesDirectory: String)

      /**
       * @param mdnFilesDirectory Specifies a location to store the MDN file for an AS2 message. 
       */
      public fun mdnFilesDirectory(mdnFilesDirectory: String)

      /**
       * @param payloadFilesDirectory Specifies a location to store the payload file for an AS2
       * message. 
       */
      public fun payloadFilesDirectory(payloadFilesDirectory: String)

      /**
       * @param statusFilesDirectory Specifies a location to store the status file for an AS2
       * message. 
       */
      public fun statusFilesDirectory(statusFilesDirectory: String)

      /**
       * @param temporaryFilesDirectory Specifies a location to store the temporary processing file
       * for an AS2 message. 
       */
      public fun temporaryFilesDirectory(temporaryFilesDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty.builder()

      /**
       * @param failedFilesDirectory Specifies a location to store the failed files for an AS2
       * message. 
       */
      override fun failedFilesDirectory(failedFilesDirectory: String) {
        cdkBuilder.failedFilesDirectory(failedFilesDirectory)
      }

      /**
       * @param mdnFilesDirectory Specifies a location to store the MDN file for an AS2 message. 
       */
      override fun mdnFilesDirectory(mdnFilesDirectory: String) {
        cdkBuilder.mdnFilesDirectory(mdnFilesDirectory)
      }

      /**
       * @param payloadFilesDirectory Specifies a location to store the payload file for an AS2
       * message. 
       */
      override fun payloadFilesDirectory(payloadFilesDirectory: String) {
        cdkBuilder.payloadFilesDirectory(payloadFilesDirectory)
      }

      /**
       * @param statusFilesDirectory Specifies a location to store the status file for an AS2
       * message. 
       */
      override fun statusFilesDirectory(statusFilesDirectory: String) {
        cdkBuilder.statusFilesDirectory(statusFilesDirectory)
      }

      /**
       * @param temporaryFilesDirectory Specifies a location to store the temporary processing file
       * for an AS2 message. 
       */
      override fun temporaryFilesDirectory(temporaryFilesDirectory: String) {
        cdkBuilder.temporaryFilesDirectory(temporaryFilesDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty,
    ) : CdkObject(cdkObject),
        CustomDirectoriesProperty {
      /**
       * Specifies a location to store the failed files for an AS2 message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-failedfilesdirectory)
       */
      override fun failedFilesDirectory(): String = unwrap(this).getFailedFilesDirectory()

      /**
       * Specifies a location to store the MDN file for an AS2 message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-mdnfilesdirectory)
       */
      override fun mdnFilesDirectory(): String = unwrap(this).getMdnFilesDirectory()

      /**
       * Specifies a location to store the payload file for an AS2 message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-payloadfilesdirectory)
       */
      override fun payloadFilesDirectory(): String = unwrap(this).getPayloadFilesDirectory()

      /**
       * Specifies a location to store the status file for an AS2 message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-statusfilesdirectory)
       */
      override fun statusFilesDirectory(): String = unwrap(this).getStatusFilesDirectory()

      /**
       * Specifies a location to store the temporary processing file for an AS2 message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-agreement-customdirectories.html#cfn-transfer-agreement-customdirectories-temporaryfilesdirectory)
       */
      override fun temporaryFilesDirectory(): String = unwrap(this).getTemporaryFilesDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomDirectoriesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty):
          CustomDirectoriesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomDirectoriesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDirectoriesProperty):
          software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnAgreement.CustomDirectoriesProperty
    }
  }
}
