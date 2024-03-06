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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.constructs.Construct

/**
 * Represents an identity provider that integrates with Login with Amazon.
 *
 * Example:
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * UserPoolIdentityProviderAmazon provider = UserPoolIdentityProviderAmazon.Builder.create(this,
 * "Amazon")
 * .userPool(pool)
 * .clientId("amzn-client-id")
 * .clientSecret("amzn-client-secret")
 * .build();
 * UserPoolClient client = pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON))
 * .build());
 * client.node.addDependency(provider);
 * ```
 */
@CdkDslMarker
public class UserPoolIdentityProviderAmazonDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UserPoolIdentityProviderAmazon.Builder =
        UserPoolIdentityProviderAmazon.Builder.create(scope, id)

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
     * The client id recognized by Login with Amazon APIs.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     *
     * @param clientId The client id recognized by Login with Amazon APIs.
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * The client secret to be accompanied with clientId for Login with Amazon APIs to authenticate
     * the client.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     *
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     *   APIs to authenticate the client.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     *
     * @param scopes The types of user profile data to obtain for the Amazon profile.
     */
    public fun scopes(vararg scopes: String) {
        _scopes.addAll(listOf(*scopes))
    }

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     *
     * @param scopes The types of user profile data to obtain for the Amazon profile.
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

    public fun build(): UserPoolIdentityProviderAmazon {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
