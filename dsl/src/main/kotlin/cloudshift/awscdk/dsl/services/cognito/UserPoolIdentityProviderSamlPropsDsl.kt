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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps

/**
 * Properties to initialize UserPoolIdentityProviderSaml.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderSamlMetadata userPoolIdentityProviderSamlMetadata;
 * UserPoolIdentityProviderSamlProps userPoolIdentityProviderSamlProps =
 * UserPoolIdentityProviderSamlProps.builder()
 * .metadata(userPoolIdentityProviderSamlMetadata)
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
 * .identifiers(List.of("identifiers"))
 * .idpSignout(false)
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolIdentityProviderSamlPropsDsl {
    private val cdkBuilder: UserPoolIdentityProviderSamlProps.Builder =
        UserPoolIdentityProviderSamlProps.builder()

    private val _identifiers: MutableList<String> = mutableListOf()

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

    /**
     * @param identifiers Identifiers. Identifiers can be used to redirect users to the correct IdP
     *   in multitenant apps.
     */
    public fun identifiers(vararg identifiers: String) {
        _identifiers.addAll(listOf(*identifiers))
    }

    /**
     * @param identifiers Identifiers. Identifiers can be used to redirect users to the correct IdP
     *   in multitenant apps.
     */
    public fun identifiers(identifiers: Collection<String>) {
        _identifiers.addAll(identifiers)
    }

    /** @param idpSignout Whether to enable the "Sign-out flow" feature. */
    public fun idpSignout(idpSignout: Boolean) {
        cdkBuilder.idpSignout(idpSignout)
    }

    /** @param metadata The SAML metadata. */
    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
        cdkBuilder.metadata(metadata)
    }

    /** @param name The name of the provider. Must be between 3 and 32 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param userPool The user pool to which this construct provides identities. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderSamlProps {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        return cdkBuilder.build()
    }
}
