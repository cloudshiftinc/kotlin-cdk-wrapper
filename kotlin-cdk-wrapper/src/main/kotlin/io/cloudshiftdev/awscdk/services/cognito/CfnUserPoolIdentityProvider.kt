@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolIdentityProvider` resource creates an identity provider for a user
 * pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object attributeMapping;
 * Object providerDetails;
 * CfnUserPoolIdentityProvider cfnUserPoolIdentityProvider =
 * CfnUserPoolIdentityProvider.Builder.create(this, "MyCfnUserPoolIdentityProvider")
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
public open class CfnUserPoolIdentityProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolIdentityProviderProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnUserPoolIdentityProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolIdentityProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolIdentityProviderProps(props)
  )

  /**
   * The resource ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A mapping of IdP attributes to standard and custom user pool attributes.
   */
  public open fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

  /**
   * A mapping of IdP attributes to standard and custom user pool attributes.
   */
  public open fun attributeMapping(`value`: Any) {
    unwrap(this).setAttributeMapping(`value`)
  }

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(`value`: List<String>) {
    unwrap(this).setIdpIdentifiers(`value`)
  }

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(vararg `value`: String): Unit = idpIdentifiers(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IdP details.
   *
   * The following list describes the provider detail keys for each IdP type.
   */
  public open fun providerDetails(): Any? = unwrap(this).getProviderDetails()

  /**
   * The IdP details.
   *
   * The following list describes the provider detail keys for each IdP type.
   */
  public open fun providerDetails(`value`: Any) {
    unwrap(this).setProviderDetails(`value`)
  }

  /**
   * The IdP name.
   */
  public open fun providerName(): String = unwrap(this).getProviderName()

  /**
   * The IdP name.
   */
  public open fun providerName(`value`: String) {
    unwrap(this).setProviderName(`value`)
  }

  /**
   * The IdP type.
   */
  public open fun providerType(): String = unwrap(this).getProviderType()

  /**
   * The IdP type.
   */
  public open fun providerType(`value`: String) {
    unwrap(this).setProviderType(`value`)
  }

  /**
   * The user pool ID.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolIdentityProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A mapping of IdP attributes to standard and custom user pool attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes. 
     */
    public fun attributeMapping(attributeMapping: Any)

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    public fun idpIdentifiers(idpIdentifiers: List<String>)

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    public fun idpIdentifiers(vararg idpIdentifiers: String)

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
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     * for each IdP type. 
     */
    public fun providerDetails(providerDetails: Any)

    /**
     * The IdP name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
     * @param providerName The IdP name. 
     */
    public fun providerName(providerName: String)

    /**
     * The IdP type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
     * @param providerType The IdP type. 
     */
    public fun providerType(providerType: String)

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
     * @param userPoolId The user pool ID. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder.create(scope,
        id)

    /**
     * A mapping of IdP attributes to standard and custom user pool attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes. 
     */
    override fun attributeMapping(attributeMapping: Any) {
      cdkBuilder.attributeMapping(attributeMapping)
    }

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    override fun idpIdentifiers(idpIdentifiers: List<String>) {
      cdkBuilder.idpIdentifiers(idpIdentifiers)
    }

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    override fun idpIdentifiers(vararg idpIdentifiers: String): Unit =
        idpIdentifiers(idpIdentifiers.toList())

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
     * @param providerDetails The IdP details. The following list describes the provider detail keys
     * for each IdP type. 
     */
    override fun providerDetails(providerDetails: Any) {
      cdkBuilder.providerDetails(providerDetails)
    }

    /**
     * The IdP name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
     * @param providerName The IdP name. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * The IdP type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
     * @param providerType The IdP type. 
     */
    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
     * @param userPoolId The user pool ID. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolIdentityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolIdentityProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider):
        CfnUserPoolIdentityProvider = CfnUserPoolIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider = wrapped.cdkObject
  }
}
