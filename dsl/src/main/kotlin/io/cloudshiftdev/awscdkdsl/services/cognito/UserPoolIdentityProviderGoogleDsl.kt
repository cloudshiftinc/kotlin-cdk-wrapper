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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
import software.constructs.Construct

/**
 * Represents a identity provider that integrates with 'Google'.
 *
 * Example:
 * ```
 * UserPool userpool = new UserPool(this, "Pool");
 * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
 * SecretAttributes.builder()
 * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
 * .build()).getSecretValue();
 * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
 * "Google")
 * .clientId("amzn-client-id")
 * .clientSecretValue(secret)
 * .userPool(userpool)
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolIdentityProviderGoogleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UserPoolIdentityProviderGoogle.Builder =
        UserPoolIdentityProviderGoogle.Builder.create(scope, id)

    private val _scopes: MutableList<String> = mutableListOf()

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     *   attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMappingDsl.() -> Unit = {}) {
        val builder = AttributeMappingDsl()
        builder.apply(attributeMapping)
        cdkBuilder.attributeMapping(builder.build())
    }

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     *   attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMapping) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    /**
     * The client id recognized by Google APIs.
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in#specify_your_apps_client_id)
     *
     * @param clientId The client id recognized by Google APIs.
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * (deprecated) The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     *
     * @param clientSecret The client secret to be accompanied with clientId for Google APIs to
     *   authenticate the client.
     * @deprecated use clientSecretValue instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * The client secret to be accompanied with clientId for Google APIs to authenticate the client
     * as SecretValue.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     *
     * @param clientSecretValue The client secret to be accompanied with clientId for Google APIs to
     *   authenticate the client as SecretValue.
     */
    public fun clientSecretValue(clientSecretValue: SecretValue) {
        cdkBuilder.clientSecretValue(clientSecretValue)
    }

    /**
     * The list of google permissions to obtain for getting access to the google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     *
     * @param scopes The list of google permissions to obtain for getting access to the google
     *   profile.
     */
    public fun scopes(vararg scopes: String) {
        _scopes.addAll(listOf(*scopes))
    }

    /**
     * The list of google permissions to obtain for getting access to the google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     *
     * @param scopes The list of google permissions to obtain for getting access to the google
     *   profile.
     */
    public fun scopes(scopes: Collection<String>) {
        _scopes.addAll(scopes)
    }

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities.
     */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderGoogle {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
