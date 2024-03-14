package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderFacebook
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook,
) : Resource(cdkObject), IUserPoolIdentityProvider {
    /** The primary identifier of this identity provider. */
    public override fun providerName(): String = unwrap(this).getProviderName()

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderFacebook].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Facebook API version to use.
         *
         * Default: - to the oldest version supported by Facebook
         *
         * @param apiVersion The Facebook API version to use.
         */
        public fun apiVersion(apiVersion: String)

        /**
         * Mapping attributes from the identity provider to standard and custom attributes of the
         * user pool.
         *
         * Default: - no attribute mapping
         *
         * @param attributeMapping Mapping attributes from the identity provider to standard and
         *   custom attributes of the user pool.
         */
        public fun attributeMapping(attributeMapping: AttributeMapping)

        /**
         * Mapping attributes from the identity provider to standard and custom attributes of the
         * user pool.
         *
         * Default: - no attribute mapping
         *
         * @param attributeMapping Mapping attributes from the identity provider to standard and
         *   custom attributes of the user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66e55b7353157a9afdcd364ce341a60e452b3f85ed3419f60defad4c4fb3042a")
        public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

        /**
         * The client id recognized by Facebook APIs.
         *
         * @param clientId The client id recognized by Facebook APIs.
         */
        public fun clientId(clientId: String)

        /**
         * The client secret to be accompanied with clientId for Facebook to authenticate the
         * client.
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/security#appsecret)
         *
         * @param clientSecret The client secret to be accompanied with clientId for Facebook to
         *   authenticate the client.
         */
        public fun clientSecret(clientSecret: String)

        /**
         * The list of Facebook permissions to obtain for getting access to the Facebook profile.
         *
         * Default: [ public_profile ]
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
         *
         * @param scopes The list of Facebook permissions to obtain for getting access to the
         *   Facebook profile.
         */
        public fun scopes(scopes: List<String>)

        /**
         * The list of Facebook permissions to obtain for getting access to the Facebook profile.
         *
         * Default: [ public_profile ]
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
         *
         * @param scopes The list of Facebook permissions to obtain for getting access to the
         *   Facebook profile.
         */
        public fun scopes(vararg scopes: String)

        /**
         * The user pool to which this construct provides identities.
         *
         * @param userPool The user pool to which this construct provides identities.
         */
        public fun userPool(userPool: IUserPool)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook.Builder =
            software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook.Builder.create(
                scope,
                id
            )

        /**
         * The Facebook API version to use.
         *
         * Default: - to the oldest version supported by Facebook
         *
         * @param apiVersion The Facebook API version to use.
         */
        override fun apiVersion(apiVersion: String) {
            cdkBuilder.apiVersion(apiVersion)
        }

        /**
         * Mapping attributes from the identity provider to standard and custom attributes of the
         * user pool.
         *
         * Default: - no attribute mapping
         *
         * @param attributeMapping Mapping attributes from the identity provider to standard and
         *   custom attributes of the user pool.
         */
        override fun attributeMapping(attributeMapping: AttributeMapping) {
            cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
        }

        /**
         * Mapping attributes from the identity provider to standard and custom attributes of the
         * user pool.
         *
         * Default: - no attribute mapping
         *
         * @param attributeMapping Mapping attributes from the identity provider to standard and
         *   custom attributes of the user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66e55b7353157a9afdcd364ce341a60e452b3f85ed3419f60defad4c4fb3042a")
        override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
            attributeMapping(AttributeMapping(attributeMapping))

        /**
         * The client id recognized by Facebook APIs.
         *
         * @param clientId The client id recognized by Facebook APIs.
         */
        override fun clientId(clientId: String) {
            cdkBuilder.clientId(clientId)
        }

        /**
         * The client secret to be accompanied with clientId for Facebook to authenticate the
         * client.
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/security#appsecret)
         *
         * @param clientSecret The client secret to be accompanied with clientId for Facebook to
         *   authenticate the client.
         */
        override fun clientSecret(clientSecret: String) {
            cdkBuilder.clientSecret(clientSecret)
        }

        /**
         * The list of Facebook permissions to obtain for getting access to the Facebook profile.
         *
         * Default: [ public_profile ]
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
         *
         * @param scopes The list of Facebook permissions to obtain for getting access to the
         *   Facebook profile.
         */
        override fun scopes(scopes: List<String>) {
            cdkBuilder.scopes(scopes)
        }

        /**
         * The list of Facebook permissions to obtain for getting access to the Facebook profile.
         *
         * Default: [ public_profile ]
         *
         * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
         *
         * @param scopes The list of Facebook permissions to obtain for getting access to the
         *   Facebook profile.
         */
        override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

        /**
         * The user pool to which this construct provides identities.
         *
         * @param userPool The user pool to which this construct provides identities.
         */
        override fun userPool(userPool: IUserPool) {
            cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): UserPoolIdentityProviderFacebook {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return UserPoolIdentityProviderFacebook(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
        ): UserPoolIdentityProviderFacebook = UserPoolIdentityProviderFacebook(cdkObject)

        internal fun unwrap(
            wrapped: UserPoolIdentityProviderFacebook
        ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook =
            wrapped.cdkObject
    }
}
