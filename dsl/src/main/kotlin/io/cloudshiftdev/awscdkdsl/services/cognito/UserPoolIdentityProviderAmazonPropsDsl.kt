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
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps

/**
 * Properties to initialize UserPoolAmazonIdentityProvider.
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
public class UserPoolIdentityProviderAmazonPropsDsl {
    private val cdkBuilder: UserPoolIdentityProviderAmazonProps.Builder =
        UserPoolIdentityProviderAmazonProps.builder()

    private val _scopes: MutableList<String> = mutableListOf()

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     *   attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMappingDsl.() -> Unit = {}) {
        val builder = AttributeMappingDsl()
        builder.apply(attributeMapping)
        cdkBuilder.attributeMapping(builder.build())
    }

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     *   attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMapping) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    /** @param clientId The client id recognized by Login with Amazon APIs. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     *   APIs to authenticate the client.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /** @param scopes The types of user profile data to obtain for the Amazon profile. */
    public fun scopes(vararg scopes: String) {
        _scopes.addAll(listOf(*scopes))
    }

    /** @param scopes The types of user profile data to obtain for the Amazon profile. */
    public fun scopes(scopes: Collection<String>) {
        _scopes.addAll(scopes)
    }

    /** @param userPool The user pool to which this construct provides identities. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderAmazonProps {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
