@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIdentityProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnIdentityProviderProps cfnIdentityProviderProps = CfnIdentityProviderProps.builder()
 * .identityProviderDetails(Map.of(
 * "identityProviderDetailsKey", "identityProviderDetails"))
 * .identityProviderName("identityProviderName")
 * .identityProviderType("identityProviderType")
 * // the properties below are optional
 * .portalArn("portalArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html)
 */
public interface CfnIdentityProviderProps {
  /**
   * The identity provider details. The following list describes the provider detail keys for each
   * identity provider type.
   *
   * * For Google and Login with Amazon:
   * * `client_id`
   * * `client_secret`
   * * `authorize_scopes`
   * * For Facebook:
   * * `client_id`
   * * `client_secret`
   * * `authorize_scopes`
   * * `api_version`
   * * For Sign in with Apple:
   * * `client_id`
   * * `team_id`
   * * `key_id`
   * * `private_key`
   * * `authorize_scopes`
   * * For OIDC providers:
   * * `client_id`
   * * `client_secret`
   * * `attributes_request_method`
   * * `oidc_issuer`
   * * `authorize_scopes`
   * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
   * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
   * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
   * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
   * * For SAML providers:
   * * `MetadataFile` OR `MetadataURL`
   * * `IDPSignout` (boolean) *optional*
   * * `IDPInit` (boolean) *optional*
   * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
   * * `EncryptedResponses` (boolean) *optional*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityproviderdetails)
   */
  public fun identityProviderDetails(): Any

  /**
   * The identity provider name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidername)
   */
  public fun identityProviderName(): String

  /**
   * The identity provider type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidertype)
   */
  public fun identityProviderType(): String

  /**
   * The ARN of the identity provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-portalarn)
   */
  public fun portalArn(): String? = unwrap(this).getPortalArn()

  /**
   * A builder for [CfnIdentityProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityProviderDetails The identity provider details. The following list describes
     * the provider detail keys for each identity provider type. 
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    /**
     * @param identityProviderDetails The identity provider details. The following list describes
     * the provider detail keys for each identity provider type. 
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     */
    public fun identityProviderDetails(identityProviderDetails: Map<String, String>)

    /**
     * @param identityProviderName The identity provider name. 
     */
    public fun identityProviderName(identityProviderName: String)

    /**
     * @param identityProviderType The identity provider type. 
     */
    public fun identityProviderType(identityProviderType: String)

    /**
     * @param portalArn The ARN of the identity provider.
     */
    public fun portalArn(portalArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps.builder()

    /**
     * @param identityProviderDetails The identity provider details. The following list describes
     * the provider detail keys for each identity provider type. 
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     */
    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
    }

    /**
     * @param identityProviderDetails The identity provider details. The following list describes
     * the provider detail keys for each identity provider type. 
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     */
    override fun identityProviderDetails(identityProviderDetails: Map<String, String>) {
      cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    /**
     * @param identityProviderName The identity provider name. 
     */
    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    /**
     * @param identityProviderType The identity provider type. 
     */
    override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    /**
     * @param portalArn The ARN of the identity provider.
     */
    override fun portalArn(portalArn: String) {
      cdkBuilder.portalArn(portalArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps,
  ) : CdkObject(cdkObject), CfnIdentityProviderProps {
    /**
     * The identity provider details. The following list describes the provider detail keys for each
     * identity provider type.
     *
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityproviderdetails)
     */
    override fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

    /**
     * The identity provider name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidername)
     */
    override fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

    /**
     * The identity provider type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidertype)
     */
    override fun identityProviderType(): String = unwrap(this).getIdentityProviderType()

    /**
     * The ARN of the identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-portalarn)
     */
    override fun portalArn(): String? = unwrap(this).getPortalArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps):
        CfnIdentityProviderProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdentityProviderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProviderProps):
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps
  }
}
