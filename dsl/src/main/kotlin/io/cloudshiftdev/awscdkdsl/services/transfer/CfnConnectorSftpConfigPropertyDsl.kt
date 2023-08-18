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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnConnector

/**
 * A structure that contains the parameters for an SFTP connector object.
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
     * @param trustedHostKeys The public portion of the host key, or keys, that are used to
     *   authenticate the user to the external server to which you are connecting. You can use the
     *   `ssh-keyscan` command against the SFTP server to retrieve the necessary key.
     *
     * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
     * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element.
     *
     * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
     * * For RSA keys, the key type is `ssh-rsa` .
     * * For ECDSA keys, the key type is either `ecdsa-sha2-nistp256` , `ecdsa-sha2-nistp384` , or
     *   `ecdsa-sha2-nistp521` , depending on the size of the key you generated.
     */
    public fun trustedHostKeys(vararg trustedHostKeys: String) {
        _trustedHostKeys.addAll(listOf(*trustedHostKeys))
    }

    /**
     * @param trustedHostKeys The public portion of the host key, or keys, that are used to
     *   authenticate the user to the external server to which you are connecting. You can use the
     *   `ssh-keyscan` command against the SFTP server to retrieve the necessary key.
     *
     * The three standard SSH public key format elements are `&lt;key type&gt;` , `&lt;body
     * base64&gt;` , and an optional `&lt;comment&gt;` , with spaces between each element.
     *
     * For the trusted host key, AWS Transfer Family accepts RSA and ECDSA keys.
     * * For RSA keys, the key type is `ssh-rsa` .
     * * For ECDSA keys, the key type is either `ecdsa-sha2-nistp256` , `ecdsa-sha2-nistp384` , or
     *   `ecdsa-sha2-nistp521` , depending on the size of the key you generated.
     */
    public fun trustedHostKeys(trustedHostKeys: Collection<String>) {
        _trustedHostKeys.addAll(trustedHostKeys)
    }

    /**
     * @param userSecretId The identifier for the secret (in AWS Secrets Manager) that contains the
     *   SFTP user's private key, password, or both. The identifier can be either the Amazon
     *   Resource Name (ARN) or the name of the secret.
     */
    public fun userSecretId(userSecretId: String) {
        cdkBuilder.userSecretId(userSecretId)
    }

    public fun build(): CfnConnector.SftpConfigProperty {
        if (_trustedHostKeys.isNotEmpty()) cdkBuilder.trustedHostKeys(_trustedHostKeys)
        return cdkBuilder.build()
    }
}
