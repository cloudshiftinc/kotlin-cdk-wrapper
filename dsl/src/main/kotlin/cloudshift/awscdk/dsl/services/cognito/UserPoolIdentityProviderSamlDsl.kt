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
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata
import software.constructs.Construct

/**
 * Represents a identity provider that integrates with SAML.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderSamlMetadata userPoolIdentityProviderSamlMetadata;
 * UserPoolIdentityProviderSaml userPoolIdentityProviderSaml =
 * UserPoolIdentityProviderSaml.Builder.create(this, "MyUserPoolIdentityProviderSaml")
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
public class UserPoolIdentityProviderSamlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UserPoolIdentityProviderSaml.Builder =
        UserPoolIdentityProviderSaml.Builder.create(scope, id)

    private val _identifiers: MutableList<String> = mutableListOf()

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
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers.
     */
    public fun identifiers(vararg identifiers: String) {
        _identifiers.addAll(listOf(*identifiers))
    }

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers.
     */
    public fun identifiers(identifiers: Collection<String>) {
        _identifiers.addAll(identifiers)
    }

    /**
     * Whether to enable the "Sign-out flow" feature.
     *
     * Default: - false
     *
     * @param idpSignout Whether to enable the "Sign-out flow" feature.
     */
    public fun idpSignout(idpSignout: Boolean) {
        cdkBuilder.idpSignout(idpSignout)
    }

    /**
     * The SAML metadata.
     *
     * @param metadata The SAML metadata.
     */
    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
        cdkBuilder.metadata(metadata)
    }

    /**
     * The name of the provider.
     *
     * Must be between 3 and 32 characters.
     *
     * Default: - the unique ID of the construct
     *
     * @param name The name of the provider.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities.
     */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderSaml {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        return cdkBuilder.build()
    }
}
