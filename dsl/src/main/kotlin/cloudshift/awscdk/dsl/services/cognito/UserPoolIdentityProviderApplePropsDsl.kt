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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps

/**
 * Properties to initialize UserPoolAppleIdentityProvider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderAppleProps userPoolIdentityProviderAppleProps =
 * UserPoolIdentityProviderAppleProps.builder()
 * .clientId("clientId")
 * .keyId("keyId")
 * .privateKey("privateKey")
 * .teamId("teamId")
 * .userPool(userPool)
 * // the properties below are optional
 * .attributeMapping(AttributeMapping.builder()
 * .address(providerAttribute)
 * .birthdate(providerAttribute)
 * .custom(Map.of(
 * "customKey", providerAttribute))
 * .email(providerAttribute)
 * .familyName(providerAttribute)
 * .fullname(providerAttribute)
 * .gender(providerAttribute)
 * .givenName(providerAttribute)
 * .lastUpdateTime(providerAttribute)
 * .locale(providerAttribute)
 * .middleName(providerAttribute)
 * .nickname(providerAttribute)
 * .phoneNumber(providerAttribute)
 * .preferredUsername(providerAttribute)
 * .profilePage(providerAttribute)
 * .profilePicture(providerAttribute)
 * .timezone(providerAttribute)
 * .website(providerAttribute)
 * .build())
 * .scopes(List.of("scopes"))
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolIdentityProviderApplePropsDsl {
    private val cdkBuilder: UserPoolIdentityProviderAppleProps.Builder =
        UserPoolIdentityProviderAppleProps.builder()

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

    /** @param clientId The client id recognized by Apple APIs. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param keyId The keyId (of the same key, which content has to be later supplied as
     *   `privateKey`) for Apple APIs to authenticate the client.
     */
    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    /** @param privateKey The privateKey content for Apple APIs to authenticate the client. */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     *   profile.
     */
    public fun scopes(vararg scopes: String) {
        _scopes.addAll(listOf(*scopes))
    }

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     *   profile.
     */
    public fun scopes(scopes: Collection<String>) {
        _scopes.addAll(scopes)
    }

    /** @param teamId The teamId for Apple APIs to authenticate the client. */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    /** @param userPool The user pool to which this construct provides identities. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderAppleProps {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
