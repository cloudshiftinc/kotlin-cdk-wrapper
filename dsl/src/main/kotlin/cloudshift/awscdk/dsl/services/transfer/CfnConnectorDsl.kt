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
import software.amazon.awscdk.services.transfer.CfnConnector
import software.constructs.Construct

/**
 * Creates the connector, which captures the parameters for an outbound connection for the AS2 or
 * SFTP protocol.
 *
 * The connector is required for sending files to an externally hosted AS2 or SFTP server. For more
 * details about AS2 connectors, see
 * [Create AS2 connectors](https://docs.aws.amazon.com/transfer/latest/userguide/create-b2b-server.html#configure-as2-connector)
 * .
 *
 * You must specify exactly one configuration object: either for AS2 ( `As2Config` ) or SFTP (
 * `SftpConfig` ).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * Object as2Config;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
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
public class CfnConnectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnector.Builder = CfnConnector.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * With AS2, you can send files by calling `StartFileTransfer` and specifying the file paths in
     * the request parameter, `SendFilePaths` .
     *
     * We use the file’s parent directory (for example, for `--send-file-paths /bucket/dir/file.txt`
     * , parent directory is `/bucket/dir/` ) to temporarily store a processed AS2 message file,
     * store the MDN when we receive them from the partner, and write a final JSON file containing
     * relevant metadata of the transmission. So, the `AccessRole` needs to provide read and write
     * access to the parent directory of the file location used in the `StartFileTransfer` request.
     * Additionally, you need to provide read and write access to the parent directory of the files
     * that you intend to send with `StartFileTransfer` .
     *
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * `secretsmanager:GetSecretValue` permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the AWS managed key in Secrets Manager, then the role also
     * needs the `kms:Decrypt` permission for that key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-accessrole)
     *
     * @param accessRole With AS2, you can send files by calling `StartFileTransfer` and specifying
     *   the file paths in the request parameter, `SendFilePaths` .
     */
    public fun accessRole(accessRole: String) {
        cdkBuilder.accessRole(accessRole)
    }

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
     *
     * @param as2Config A structure that contains the parameters for an AS2 connector object.
     */
    public fun as2Config(as2Config: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(as2Config)
        cdkBuilder.as2Config(builder.map)
    }

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-as2config)
     *
     * @param as2Config A structure that contains the parameters for an AS2 connector object.
     */
    public fun as2Config(as2Config: Any) {
        cdkBuilder.as2Config(as2Config)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a connector to turn on CloudWatch logging for Amazon S3 events.
     *
     * When set, you can view connector activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-loggingrole)
     *
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     *   (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events.
     */
    public fun loggingRole(loggingRole: String) {
        cdkBuilder.loggingRole(loggingRole)
    }

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that can be used to group and search for connectors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for connectors.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The URL of the partner's AS2 or SFTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html#cfn-transfer-connector-url)
     *
     * @param url The URL of the partner's AS2 or SFTP endpoint.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnConnector {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
