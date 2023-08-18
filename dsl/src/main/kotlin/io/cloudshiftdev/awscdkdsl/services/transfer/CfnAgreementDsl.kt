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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.constructs.Construct

/**
 * Creates an agreement.
 *
 * An agreement is a bilateral trading partner agreement, or partnership, between an AWS Transfer
 * Family server and an AS2 process. The agreement defines the file and message transfer
 * relationship between the server and the AS2 process. To define an agreement, Transfer Family
 * combines a server, local profile, partner profile, certificate, and other attributes.
 *
 * The partner is identified with the `PartnerProfileId` , and the AS2 process is identified with
 * the `LocalProfileId` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CfnAgreement cfnAgreement = CfnAgreement.Builder.create(this, "MyCfnAgreement")
 * .accessRole("accessRole")
 * .baseDirectory("baseDirectory")
 * .localProfileId("localProfileId")
 * .partnerProfileId("partnerProfileId")
 * .serverId("serverId")
 * // the properties below are optional
 * .description("description")
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
@CdkDslMarker
public class CfnAgreementDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAgreement.Builder = CfnAgreement.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

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
     * `--send-file-paths /bucket/dir/file.txt` , parent directory is `/bucket/dir/` ) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the
     * partner, and write a final JSON file containing relevant metadata of the transmission. So,
     * the `AccessRole` needs to provide read and write access to the parent directory of the file
     * location used in the `StartFileTransfer` request. Additionally, you need to provide read and
     * write access to the parent directory of the files that you intend to send with
     * `StartFileTransfer` .
     *
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * `secretsmanager:GetSecretValue` permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the AWS managed key in Secrets Manager, then the role also
     * needs the `kms:Decrypt` permission for that key.
     *
     * *For SFTP connectors*
     *
     * Make sure that the access role provides read and write access to the parent directory of the
     * file location that's used in the `StartFileTransfer` request. Additionally, make sure that
     * the role provides `secretsmanager:GetSecretValue` permission to AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-accessrole)
     *
     * @param accessRole Connectors are used to send files using either the AS2 or SFTP protocol.
     */
    public fun accessRole(accessRole: String) {
        cdkBuilder.accessRole(accessRole)
    }

    /**
     * The landing directory (folder) for files that are transferred by using the AS2 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-basedirectory)
     *
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     *   the AS2 protocol.
     */
    public fun baseDirectory(baseDirectory: String) {
        cdkBuilder.baseDirectory(baseDirectory)
    }

    /**
     * The name or short description that's used to identify the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-description)
     *
     * @param description The name or short description that's used to identify the agreement.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A unique identifier for the AS2 local profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-localprofileid)
     *
     * @param localProfileId A unique identifier for the AS2 local profile.
     */
    public fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
    }

    /**
     * A unique identifier for the partner profile used in the agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-partnerprofileid)
     *
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement.
     */
    public fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
    }

    /**
     * A system-assigned unique identifier for a server instance.
     *
     * This identifier indicates the specific server that the agreement uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-serverid)
     *
     * @param serverId A system-assigned unique identifier for a server instance.
     */
    public fun serverId(serverId: String) {
        cdkBuilder.serverId(serverId)
    }

    /**
     * The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-status)
     *
     * @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that can be used to group and search for agreements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html#cfn-transfer-agreement-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for agreements.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAgreement {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
