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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnConnectorProps

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * Object as2Config;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .accessRole("accessRole")
 * .as2Config(as2Config)
 * .url("url")
 * // the properties below are optional
 * .loggingRole("loggingRole")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html)
 */
@CdkDslMarker
public class CfnConnectorPropsDsl {
    private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

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

    /** @param as2Config A structure that contains the parameters for an AS2 connector object. */
    public fun as2Config(as2Config: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(as2Config)
        cdkBuilder.as2Config(builder.map)
    }

    /** @param as2Config A structure that contains the parameters for an AS2 connector object. */
    public fun as2Config(as2Config: Any) {
        cdkBuilder.as2Config(as2Config)
    }

    /**
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     *   (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events. When
     *   set, you can view connector activity in your CloudWatch logs.
     */
    public fun loggingRole(loggingRole: String) {
        cdkBuilder.loggingRole(loggingRole)
    }

    /** @param tags Key-value pairs that can be used to group and search for connectors. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Key-value pairs that can be used to group and search for connectors. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param url The URL of the partner's AS2 or SFTP endpoint. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnConnectorProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
