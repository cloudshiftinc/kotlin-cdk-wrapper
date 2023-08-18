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
import software.amazon.awscdk.services.transfer.CfnConnector

/**
 * A structure that contains the parameters for an AS2 connector object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * As2ConfigProperty as2ConfigProperty = As2ConfigProperty.builder()
 * .basicAuthSecretId("basicAuthSecretId")
 * .compression("compression")
 * .encryptionAlgorithm("encryptionAlgorithm")
 * .localProfileId("localProfileId")
 * .mdnResponse("mdnResponse")
 * .mdnSigningAlgorithm("mdnSigningAlgorithm")
 * .messageSubject("messageSubject")
 * .partnerProfileId("partnerProfileId")
 * .signingAlgorithm("signingAlgorithm")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html)
 */
@CdkDslMarker
public class CfnConnectorAs2ConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.As2ConfigProperty.Builder =
        CfnConnector.As2ConfigProperty.builder()

    /**
     * @param basicAuthSecretId Provides Basic authentication support to the AS2 Connectors API. To
     *   use Basic authentication, you must provide the name or Amazon Resource Name (ARN) of a
     *   secret in AWS Secrets Manager .
     *
     * The default value for this parameter is `null` , which indicates that Basic authentication is
     * not enabled for the connector.
     *
     * If the connector should use Basic authentication, the secret needs to be in the following
     * format:
     *
     * `{ "Username": "user-name", "Password": "user-password" }`
     *
     * Replace `user-name` and `user-password` with the credentials for the actual user that is
     * being authenticated.
     *
     * Note the following:
     * * You are storing these credentials in Secrets Manager, *not passing them directly* into this
     *   API.
     * * If you are using the API, SDKs, or CloudFormation to configure your connector, then you
     *   must create the secret before you can enable Basic authentication. However, if you are
     *   using the AWS management console, you can have the system create the secret for you.
     *
     * If you have previously enabled Basic authentication for a connector, you can disable it by
     * using the `UpdateConnector` API call. For example, if you are using the CLI, you can run the
     * following command to remove Basic authentication:
     *
     * `update-connector --connector-id my-connector-id --as2-config 'BasicAuthSecretId=""'`
     */
    public fun basicAuthSecretId(basicAuthSecretId: String) {
        cdkBuilder.basicAuthSecretId(basicAuthSecretId)
    }

    /** @param compression Specifies whether the AS2 file is compressed. */
    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    /**
     * @param encryptionAlgorithm The algorithm that is used to encrypt the file.
     *
     * You can only specify `NONE` if the URL for your connector uses HTTPS. This ensures that no
     * traffic is sent in clear text.
     */
    public fun encryptionAlgorithm(encryptionAlgorithm: String) {
        cdkBuilder.encryptionAlgorithm(encryptionAlgorithm)
    }

    /** @param localProfileId A unique identifier for the AS2 local profile. */
    public fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
    }

    /**
     * @param mdnResponse Used for outbound requests (from an AWS Transfer Family server to a
     *   partner AS2 server) to determine whether the partner response for transfers is synchronous
     *   or asynchronous. Specify either of the following values:
     * * `SYNC` : The system expects a synchronous MDN response, confirming that the file was
     *   transferred successfully (or not).
     * * `NONE` : Specifies that no MDN response is required.
     */
    public fun mdnResponse(mdnResponse: String) {
        cdkBuilder.mdnResponse(mdnResponse)
    }

    /**
     * @param mdnSigningAlgorithm The signing algorithm for the MDN response.
     *
     * If set to DEFAULT (or not set at all), the value for `SigningAlgorithm` is used.
     */
    public fun mdnSigningAlgorithm(mdnSigningAlgorithm: String) {
        cdkBuilder.mdnSigningAlgorithm(mdnSigningAlgorithm)
    }

    /**
     * @param messageSubject Used as the `Subject` HTTP header attribute in AS2 messages that are
     *   being sent with the connector.
     */
    public fun messageSubject(messageSubject: String) {
        cdkBuilder.messageSubject(messageSubject)
    }

    /** @param partnerProfileId A unique identifier for the partner profile for the connector. */
    public fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
    }

    /**
     * @param signingAlgorithm The algorithm that is used to sign the AS2 messages sent with the
     *   connector.
     */
    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    public fun build(): CfnConnector.As2ConfigProperty = cdkBuilder.build()
}
