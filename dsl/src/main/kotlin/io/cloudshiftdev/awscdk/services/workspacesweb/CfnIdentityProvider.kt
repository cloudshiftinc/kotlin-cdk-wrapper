package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentityProvider
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider,
) : CfnResource(cdkObject), IInspectable {
    /** The ARN of the identity provider. */
    public open fun attrIdentityProviderArn(): String = unwrap(this).getAttrIdentityProviderArn()

    /**
     * The identity provider details.
     *
     * The following list describes the provider detail keys for each identity provider type.
     */
    public open fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

    /**
     * The identity provider details.
     *
     * The following list describes the provider detail keys for each identity provider type.
     */
    public open fun identityProviderDetails(`value`: IResolvable) {
        unwrap(this).setIdentityProviderDetails(`value`.let(IResolvable::unwrap))
    }

    /**
     * The identity provider details.
     *
     * The following list describes the provider detail keys for each identity provider type.
     */
    public open fun identityProviderDetails(`value`: Map<String, String>) {
        unwrap(this).setIdentityProviderDetails(`value`)
    }

    /** The identity provider name. */
    public open fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

    /** The identity provider name. */
    public open fun identityProviderName(`value`: String) {
        unwrap(this).setIdentityProviderName(`value`)
    }

    /** The identity provider type. */
    public open fun identityProviderType(): String = unwrap(this).getIdentityProviderType()

    /** The identity provider type. */
    public open fun identityProviderType(`value`: String) {
        unwrap(this).setIdentityProviderType(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ARN of the identity provider. */
    public open fun portalArn(): String? = unwrap(this).getPortalArn()

    /** The ARN of the identity provider. */
    public open fun portalArn(`value`: String) {
        unwrap(this).setPortalArn(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnIdentityProvider].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The identity provider details. The following list describes the provider detail keys for
         * each identity provider type.
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
         *
         * @param identityProviderDetails The identity provider details. The following list
         *   describes the provider detail keys for each identity provider type.
         */
        public fun identityProviderDetails(identityProviderDetails: IResolvable)

        /**
         * The identity provider details. The following list describes the provider detail keys for
         * each identity provider type.
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
         *
         * @param identityProviderDetails The identity provider details. The following list
         *   describes the provider detail keys for each identity provider type.
         */
        public fun identityProviderDetails(identityProviderDetails: Map<String, String>)

        /**
         * The identity provider name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidername)
         *
         * @param identityProviderName The identity provider name.
         */
        public fun identityProviderName(identityProviderName: String)

        /**
         * The identity provider type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidertype)
         *
         * @param identityProviderType The identity provider type.
         */
        public fun identityProviderType(identityProviderType: String)

        /**
         * The ARN of the identity provider.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-portalarn)
         *
         * @param portalArn The ARN of the identity provider.
         */
        public fun portalArn(portalArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider.Builder =
            software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider.Builder.create(
                scope,
                id
            )

        /**
         * The identity provider details. The following list describes the provider detail keys for
         * each identity provider type.
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
         *
         * @param identityProviderDetails The identity provider details. The following list
         *   describes the provider detail keys for each identity provider type.
         */
        override fun identityProviderDetails(identityProviderDetails: IResolvable) {
            cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
        }

        /**
         * The identity provider details. The following list describes the provider detail keys for
         * each identity provider type.
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
         *
         * @param identityProviderDetails The identity provider details. The following list
         *   describes the provider detail keys for each identity provider type.
         */
        override fun identityProviderDetails(identityProviderDetails: Map<String, String>) {
            cdkBuilder.identityProviderDetails(identityProviderDetails)
        }

        /**
         * The identity provider name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidername)
         *
         * @param identityProviderName The identity provider name.
         */
        override fun identityProviderName(identityProviderName: String) {
            cdkBuilder.identityProviderName(identityProviderName)
        }

        /**
         * The identity provider type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidertype)
         *
         * @param identityProviderType The identity provider type.
         */
        override fun identityProviderType(identityProviderType: String) {
            cdkBuilder.identityProviderType(identityProviderType)
        }

        /**
         * The ARN of the identity provider.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-portalarn)
         *
         * @param portalArn The ARN of the identity provider.
         */
        override fun portalArn(portalArn: String) {
            cdkBuilder.portalArn(portalArn)
        }

        public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIdentityProvider {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIdentityProvider(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider
        ): CfnIdentityProvider = CfnIdentityProvider(cdkObject)

        internal fun unwrap(
            wrapped: CfnIdentityProvider
        ): software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider = wrapped.cdkObject
    }
}
