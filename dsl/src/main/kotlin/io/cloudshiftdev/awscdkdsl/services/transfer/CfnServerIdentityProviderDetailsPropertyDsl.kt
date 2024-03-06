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
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
 * `API_GATEWAY` .
 *
 * Accepts an array containing all of the information required to use a directory in
 * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
 * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * IdentityProviderDetailsProperty identityProviderDetailsProperty =
 * IdentityProviderDetailsProperty.builder()
 * .directoryId("directoryId")
 * .function("function")
 * .invocationRole("invocationRole")
 * .sftpAuthenticationMethods("sftpAuthenticationMethods")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html)
 */
@CdkDslMarker
public class CfnServerIdentityProviderDetailsPropertyDsl {
    private val cdkBuilder: CfnServer.IdentityProviderDetailsProperty.Builder =
        CfnServer.IdentityProviderDetailsProperty.builder()

    /**
     * @param directoryId The identifier of the AWS Directory Service directory that you want to use
     *   as your identity provider.
     */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /** @param function The ARN for a Lambda function to use for the Identity provider. */
    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    /**
     * @param invocationRole This parameter is only applicable if your `IdentityProviderType` is
     *   `API_GATEWAY` . Provides the type of `InvocationRole` used to authenticate the user
     *   account.
     */
    public fun invocationRole(invocationRole: String) {
        cdkBuilder.invocationRole(invocationRole)
    }

    /**
     * @param sftpAuthenticationMethods For SFTP-enabled servers, and for custom identity providers
     *   *only* , you can specify whether to authenticate using a password, SSH key pair, or both.
     * * `PASSWORD` - users must provide their password to connect.
     * * `PUBLIC_KEY` - users must provide their private key to connect.
     * * `PUBLIC_KEY_OR_PASSWORD` - users can authenticate with either their password or their key.
     *   This is the default value.
     * * `PUBLIC_KEY_AND_PASSWORD` - users must provide both their private key and their password to
     *   connect. The server checks the key first, and then if the key is valid, the system prompts
     *   for a password. If the private key provided does not match the public key that is stored,
     *   authentication fails.
     */
    public fun sftpAuthenticationMethods(sftpAuthenticationMethods: String) {
        cdkBuilder.sftpAuthenticationMethods(sftpAuthenticationMethods)
    }

    /** @param url Provides the location of the service endpoint used to authenticate users. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnServer.IdentityProviderDetailsProperty = cdkBuilder.build()
}
