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

package io.cloudshiftdev.awscdkdsl.services.finspace

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.finspace.CfnEnvironment

/**
 * Configuration information when authentication mode is FEDERATED.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.finspace.*;
 * FederationParametersProperty federationParametersProperty =
 * FederationParametersProperty.builder()
 * .applicationCallBackUrl("applicationCallBackUrl")
 * .attributeMap(List.of(AttributeMapItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .federationProviderName("federationProviderName")
 * .federationUrn("federationUrn")
 * .samlMetadataDocument("samlMetadataDocument")
 * .samlMetadataUrl("samlMetadataUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html)
 */
@CdkDslMarker
public class CfnEnvironmentFederationParametersPropertyDsl {
    private val cdkBuilder: CfnEnvironment.FederationParametersProperty.Builder =
        CfnEnvironment.FederationParametersProperty.builder()

    private val _attributeMap: MutableList<Any> = mutableListOf()

    /**
     * @param applicationCallBackUrl The redirect or sign-in URL that should be entered into the
     *   SAML 2.0 compliant identity provider configuration (IdP).
     */
    public fun applicationCallBackUrl(applicationCallBackUrl: String) {
        cdkBuilder.applicationCallBackUrl(applicationCallBackUrl)
    }

    /**
     * @param attributeMap SAML attribute name and value. The name must always be `Email` and the
     *   value should be set to the attribute definition in which user email is set. For example,
     *   name would be `Email` and value
     *   `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your
     *   SAML 2.0 compliant identity provider (IdP) documentation for details.
     */
    public fun attributeMap(vararg attributeMap: Any) {
        _attributeMap.addAll(listOf(*attributeMap))
    }

    /**
     * @param attributeMap SAML attribute name and value. The name must always be `Email` and the
     *   value should be set to the attribute definition in which user email is set. For example,
     *   name would be `Email` and value
     *   `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your
     *   SAML 2.0 compliant identity provider (IdP) documentation for details.
     */
    public fun attributeMap(attributeMap: Collection<Any>) {
        _attributeMap.addAll(attributeMap)
    }

    /**
     * @param attributeMap SAML attribute name and value. The name must always be `Email` and the
     *   value should be set to the attribute definition in which user email is set. For example,
     *   name would be `Email` and value
     *   `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your
     *   SAML 2.0 compliant identity provider (IdP) documentation for details.
     */
    public fun attributeMap(attributeMap: IResolvable) {
        cdkBuilder.attributeMap(attributeMap)
    }

    /** @param federationProviderName Name of the identity provider (IdP). */
    public fun federationProviderName(federationProviderName: String) {
        cdkBuilder.federationProviderName(federationProviderName)
    }

    /**
     * @param federationUrn The Uniform Resource Name (URN). Also referred as Service Provider URN
     *   or Audience URI or Service Provider Entity ID.
     */
    public fun federationUrn(federationUrn: String) {
        cdkBuilder.federationUrn(federationUrn)
    }

    /** @param samlMetadataDocument SAML 2.0 Metadata document from identity provider (IdP). */
    public fun samlMetadataDocument(samlMetadataDocument: String) {
        cdkBuilder.samlMetadataDocument(samlMetadataDocument)
    }

    /**
     * @param samlMetadataUrl Provide the metadata URL from your SAML 2.0 compliant identity
     *   provider (IdP).
     */
    public fun samlMetadataUrl(samlMetadataUrl: String) {
        cdkBuilder.samlMetadataUrl(samlMetadataUrl)
    }

    public fun build(): CfnEnvironment.FederationParametersProperty {
        if (_attributeMap.isNotEmpty()) cdkBuilder.attributeMap(_attributeMap)
        return cdkBuilder.build()
    }
}
