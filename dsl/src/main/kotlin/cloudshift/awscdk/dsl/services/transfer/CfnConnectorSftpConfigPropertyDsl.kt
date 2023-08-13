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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnConnector

/**
 * Configuration for an SFTP connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * SftpConfigProperty sftpConfigProperty = SftpConfigProperty.builder()
 * .trustedHostKeys(List.of("trustedHostKeys"))
 * .userSecretId("userSecretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html)
 */
@CdkDslMarker
public class CfnConnectorSftpConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.SftpConfigProperty.Builder =
        CfnConnector.SftpConfigProperty.builder()

    private val _trustedHostKeys: MutableList<String> = mutableListOf()

    /**
     * @param trustedHostKeys List of public host keys, for the external server to which you are
     *   connecting.
     */
    public fun trustedHostKeys(vararg trustedHostKeys: String) {
        _trustedHostKeys.addAll(listOf(*trustedHostKeys))
    }

    /**
     * @param trustedHostKeys List of public host keys, for the external server to which you are
     *   connecting.
     */
    public fun trustedHostKeys(trustedHostKeys: Collection<String>) {
        _trustedHostKeys.addAll(trustedHostKeys)
    }

    /**
     * @param userSecretId ARN or name of the secret in AWS Secrets Manager which contains the SFTP
     *   user's private keys or passwords.
     */
    public fun userSecretId(userSecretId: String) {
        cdkBuilder.userSecretId(userSecretId)
    }

    public fun build(): CfnConnector.SftpConfigProperty {
        if (_trustedHostKeys.isNotEmpty()) cdkBuilder.trustedHostKeys(_trustedHostKeys)
        return cdkBuilder.build()
    }
}
