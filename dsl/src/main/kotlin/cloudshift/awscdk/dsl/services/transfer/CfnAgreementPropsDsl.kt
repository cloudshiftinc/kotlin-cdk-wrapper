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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnAgreementProps

/**
 * Properties for defining a `CfnAgreement`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CfnAgreementProps cfnAgreementProps = CfnAgreementProps.builder()
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
public class CfnAgreementPropsDsl {
    private val cdkBuilder: CfnAgreementProps.Builder = CfnAgreementProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accessRole With AS2, you can send files by calling `StartFileTransfer` and specifying
     *   the file paths in the request parameter, `SendFilePaths` . We use the file’s parent
     *   directory (for example, for `--send-file-paths /bucket/dir/file.txt` , parent directory is
     *   `/bucket/dir/` ) to temporarily store a processed AS2 message file, store the MDN when we
     *   receive them from the partner, and write a final JSON file containing relevant metadata of
     *   the transmission. So, the `AccessRole` needs to provide read and write access to the parent
     *   directory of the file location used in the `StartFileTransfer` request. Additionally, you
     *   need to provide read and write access to the parent directory of the files that you intend
     *   to send with `StartFileTransfer` .
     *
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * `secretsmanager:GetSecretValue` permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the AWS managed key in Secrets Manager, then the role also
     * needs the `kms:Decrypt` permission for that key.
     */
    public fun accessRole(accessRole: String) {
        cdkBuilder.accessRole(accessRole)
    }

    /**
     * @param baseDirectory The landing directory (folder) for files that are transferred by using
     *   the AS2 protocol.
     */
    public fun baseDirectory(baseDirectory: String) {
        cdkBuilder.baseDirectory(baseDirectory)
    }

    /** @param description The name or short description that's used to identify the agreement. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param localProfileId A unique identifier for the AS2 local profile. */
    public fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
    }

    /**
     * @param partnerProfileId A unique identifier for the partner profile used in the agreement.
     */
    public fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
    }

    /**
     * @param serverId A system-assigned unique identifier for a server instance. This identifier
     *   indicates the specific server that the agreement uses.
     */
    public fun serverId(serverId: String) {
        cdkBuilder.serverId(serverId)
    }

    /** @param status The current status of the agreement, either `ACTIVE` or `INACTIVE` . */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags Key-value pairs that can be used to group and search for agreements. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Key-value pairs that can be used to group and search for agreements. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAgreementProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
