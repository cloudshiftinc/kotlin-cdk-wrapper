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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps

/**
 * Properties for defining a `CfnUserPoolIdentityProvider`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * Object attributeMapping;
 * Object providerDetails;
 * CfnUserPoolIdentityProviderProps cfnUserPoolIdentityProviderProps =
 * CfnUserPoolIdentityProviderProps.builder()
 * .providerName("providerName")
 * .providerType("providerType")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .attributeMapping(attributeMapping)
 * .idpIdentifiers(List.of("idpIdentifiers"))
 * .providerDetails(providerDetails)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html)
 */
@CdkDslMarker
public class CfnUserPoolIdentityProviderPropsDsl {
    private val cdkBuilder: CfnUserPoolIdentityProviderProps.Builder =
        CfnUserPoolIdentityProviderProps.builder()

    private val _idpIdentifiers: MutableList<String> = mutableListOf()

    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     *   attributes.
     */
    public fun attributeMapping(attributeMapping: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributeMapping)
        cdkBuilder.attributeMapping(builder.map)
    }

    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     *   attributes.
     */
    public fun attributeMapping(attributeMapping: Any) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    /** @param idpIdentifiers A list of IdP identifiers. */
    public fun idpIdentifiers(vararg idpIdentifiers: String) {
        _idpIdentifiers.addAll(listOf(*idpIdentifiers))
    }

    /** @param idpIdentifiers A list of IdP identifiers. */
    public fun idpIdentifiers(idpIdentifiers: Collection<String>) {
        _idpIdentifiers.addAll(idpIdentifiers)
    }

    /**
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     *   for each IdP type.
     * * For Google and Login with Amazon:
     * * client_id
     * * client_secret
     * * authorize_scopes
     * * For Facebook:
     * * client_id
     * * client_secret
     * * authorize_scopes
     * * api_version
     * * For Sign in with Apple:
     * * client_id
     * * team_id
     * * key_id
     * * private_key
     * * authorize_scopes
     * * For OpenID Connect (OIDC) providers:
     * * client_id
     * * client_secret
     * * attributes_request_method
     * * oidc_issuer
     * * authorize_scopes
     * * The following keys are only present if Amazon Cognito didn't discover them at the
     *   `oidc_issuer` URL.
     * * authorize_url
     * * token_url
     * * attributes_url
     * * jwks_uri
     * * Amazon Cognito sets the value of the following keys automatically. They are read-only.
     * * attributes_url_add_attributes
     * * For SAML providers:
     * * MetadataFile or MetadataURL
     * * IDPSignout *optional*
     */
    public fun providerDetails(providerDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(providerDetails)
        cdkBuilder.providerDetails(builder.map)
    }

    /**
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     *   for each IdP type.
     * * For Google and Login with Amazon:
     * * client_id
     * * client_secret
     * * authorize_scopes
     * * For Facebook:
     * * client_id
     * * client_secret
     * * authorize_scopes
     * * api_version
     * * For Sign in with Apple:
     * * client_id
     * * team_id
     * * key_id
     * * private_key
     * * authorize_scopes
     * * For OpenID Connect (OIDC) providers:
     * * client_id
     * * client_secret
     * * attributes_request_method
     * * oidc_issuer
     * * authorize_scopes
     * * The following keys are only present if Amazon Cognito didn't discover them at the
     *   `oidc_issuer` URL.
     * * authorize_url
     * * token_url
     * * attributes_url
     * * jwks_uri
     * * Amazon Cognito sets the value of the following keys automatically. They are read-only.
     * * attributes_url_add_attributes
     * * For SAML providers:
     * * MetadataFile or MetadataURL
     * * IDPSignout *optional*
     */
    public fun providerDetails(providerDetails: Any) {
        cdkBuilder.providerDetails(providerDetails)
    }

    /** @param providerName The IdP name. */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /** @param providerType The IdP type. */
    public fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
    }

    /** @param userPoolId The user pool ID. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolIdentityProviderProps {
        if (_idpIdentifiers.isNotEmpty()) cdkBuilder.idpIdentifiers(_idpIdentifiers)
        return cdkBuilder.build()
    }
}
