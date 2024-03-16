@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnUserPoolIdentityProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
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
public interface CfnUserPoolIdentityProviderProps {
  /**
   * A mapping of IdP attributes to standard and custom user pool attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
   */
  public fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

  /**
   * A list of IdP identifiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
   */
  public fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

  /**
   * The IdP details. The following list describes the provider detail keys for each IdP type.
   *
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
   * `oidc_issuer` URL.
   * * authorize_url
   * * token_url
   * * attributes_url
   * * jwks_uri
   * * Amazon Cognito sets the value of the following keys automatically. They are read-only.
   * * attributes_url_add_attributes
   * * For SAML providers:
   * * MetadataFile or MetadataURL
   * * IDPSignout *optional*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails)
   */
  public fun providerDetails(): Any? = unwrap(this).getProviderDetails()

  /**
   * The IdP name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
   */
  public fun providerName(): String

  /**
   * The IdP type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
   */
  public fun providerType(): String

  /**
   * The user pool ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolIdentityProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes.
     */
    public fun attributeMapping(attributeMapping: Any)

    /**
     * @param idpIdentifiers A list of IdP identifiers.
     */
    public fun idpIdentifiers(idpIdentifiers: List<String>)

    /**
     * @param idpIdentifiers A list of IdP identifiers.
     */
    public fun idpIdentifiers(vararg idpIdentifiers: String)

    /**
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     * for each IdP type.
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
     * `oidc_issuer` URL.
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
    public fun providerDetails(providerDetails: Any)

    /**
     * @param providerName The IdP name. 
     */
    public fun providerName(providerName: String)

    /**
     * @param providerType The IdP type. 
     */
    public fun providerType(providerType: String)

    /**
     * @param userPoolId The user pool ID. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.builder()

    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes.
     */
    override fun attributeMapping(attributeMapping: Any) {
      cdkBuilder.attributeMapping(attributeMapping)
    }

    /**
     * @param idpIdentifiers A list of IdP identifiers.
     */
    override fun idpIdentifiers(idpIdentifiers: List<String>) {
      cdkBuilder.idpIdentifiers(idpIdentifiers)
    }

    /**
     * @param idpIdentifiers A list of IdP identifiers.
     */
    override fun idpIdentifiers(vararg idpIdentifiers: String): Unit =
        idpIdentifiers(idpIdentifiers.toList())

    /**
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     * for each IdP type.
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
     * `oidc_issuer` URL.
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
    override fun providerDetails(providerDetails: Any) {
      cdkBuilder.providerDetails(providerDetails)
    }

    /**
     * @param providerName The IdP name. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * @param providerType The IdP type. 
     */
    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    /**
     * @param userPoolId The user pool ID. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps,
  ) : CdkObject(cdkObject), CfnUserPoolIdentityProviderProps {
    /**
     * A mapping of IdP attributes to standard and custom user pool attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
     */
    override fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     */
    override fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

    /**
     * The IdP details. The following list describes the provider detail keys for each IdP type.
     *
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
     * `oidc_issuer` URL.
     * * authorize_url
     * * token_url
     * * attributes_url
     * * jwks_uri
     * * Amazon Cognito sets the value of the following keys automatically. They are read-only.
     * * attributes_url_add_attributes
     * * For SAML providers:
     * * MetadataFile or MetadataURL
     * * IDPSignout *optional*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails)
     */
    override fun providerDetails(): Any? = unwrap(this).getProviderDetails()

    /**
     * The IdP name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
     */
    override fun providerName(): String = unwrap(this).getProviderName()

    /**
     * The IdP type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
     */
    override fun providerType(): String = unwrap(this).getProviderType()

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolIdentityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps):
        CfnUserPoolIdentityProviderProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnUserPoolIdentityProviderProps

    internal fun unwrap(wrapped: CfnUserPoolIdentityProviderProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
  }
}
