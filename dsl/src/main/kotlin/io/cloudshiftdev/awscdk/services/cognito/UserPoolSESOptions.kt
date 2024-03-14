package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface UserPoolSESOptions {
    /**
     * The name of a configuration set in Amazon SES that should be applied to emails sent via
     * Cognito.
     *
     * Default: - no configuration set
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
     */
    public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    /**
     * The verified Amazon SES email address that Cognito should use to send emails.
     *
     * The email address used must be a verified email address in Amazon SES and must be configured
     * to allow Cognito to send emails.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html)
     */
    public fun fromEmail(): String

    /**
     * An optional name that should be used as the sender's name along with the email.
     *
     * Default: - no name
     */
    public fun fromName(): String? = unwrap(this).getFromName()

    /**
     * The destination to which the receiver of the email should reply to.
     *
     * Default: - same as the fromEmail
     */
    public fun replyTo(): String? = unwrap(this).getReplyTo()

    /**
     * Required if the UserPool region is different than the SES region.
     *
     * If sending emails with a Amazon SES verified email address, and the region that SES is
     * configured is different than the region in which the UserPool is deployed, you must specify
     * that region here.
     *
     * Default: - The same region as the Cognito UserPool
     */
    public fun sesRegion(): String? = unwrap(this).getSesRegion()

    /**
     * SES Verified custom domain to be used to verify the identity.
     *
     * Default: - no domain
     */
    public fun sesVerifiedDomain(): String? = unwrap(this).getSesVerifiedDomain()

    /** A builder for [UserPoolSESOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param configurationSetName The name of a configuration set in Amazon SES that should be
         *   applied to emails sent via Cognito.
         */
        public fun configurationSetName(configurationSetName: String)

        /**
         * @param fromEmail The verified Amazon SES email address that Cognito should use to send
         *   emails. The email address used must be a verified email address in Amazon SES and must
         *   be configured to allow Cognito to send emails.
         */
        public fun fromEmail(fromEmail: String)

        /**
         * @param fromName An optional name that should be used as the sender's name along with the
         *   email.
         */
        public fun fromName(fromName: String)

        /** @param replyTo The destination to which the receiver of the email should reply to. */
        public fun replyTo(replyTo: String)

        /**
         * @param sesRegion Required if the UserPool region is different than the SES region. If
         *   sending emails with a Amazon SES verified email address, and the region that SES is
         *   configured is different than the region in which the UserPool is deployed, you must
         *   specify that region here.
         */
        public fun sesRegion(sesRegion: String)

        /**
         * @param sesVerifiedDomain SES Verified custom domain to be used to verify the identity.
         */
        public fun sesVerifiedDomain(sesVerifiedDomain: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolSESOptions.Builder =
            software.amazon.awscdk.services.cognito.UserPoolSESOptions.builder()

        /**
         * @param configurationSetName The name of a configuration set in Amazon SES that should be
         *   applied to emails sent via Cognito.
         */
        override fun configurationSetName(configurationSetName: String) {
            cdkBuilder.configurationSetName(configurationSetName)
        }

        /**
         * @param fromEmail The verified Amazon SES email address that Cognito should use to send
         *   emails. The email address used must be a verified email address in Amazon SES and must
         *   be configured to allow Cognito to send emails.
         */
        override fun fromEmail(fromEmail: String) {
            cdkBuilder.fromEmail(fromEmail)
        }

        /**
         * @param fromName An optional name that should be used as the sender's name along with the
         *   email.
         */
        override fun fromName(fromName: String) {
            cdkBuilder.fromName(fromName)
        }

        /** @param replyTo The destination to which the receiver of the email should reply to. */
        override fun replyTo(replyTo: String) {
            cdkBuilder.replyTo(replyTo)
        }

        /**
         * @param sesRegion Required if the UserPool region is different than the SES region. If
         *   sending emails with a Amazon SES verified email address, and the region that SES is
         *   configured is different than the region in which the UserPool is deployed, you must
         *   specify that region here.
         */
        override fun sesRegion(sesRegion: String) {
            cdkBuilder.sesRegion(sesRegion)
        }

        /**
         * @param sesVerifiedDomain SES Verified custom domain to be used to verify the identity.
         */
        override fun sesVerifiedDomain(sesVerifiedDomain: String) {
            cdkBuilder.sesVerifiedDomain(sesVerifiedDomain)
        }

        public fun build(): software.amazon.awscdk.services.cognito.UserPoolSESOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolSESOptions,
    ) : UserPoolSESOptions {
        /**
         * The name of a configuration set in Amazon SES that should be applied to emails sent via
         * Cognito.
         *
         * Default: - no configuration set
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
         */
        override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

        /**
         * The verified Amazon SES email address that Cognito should use to send emails.
         *
         * The email address used must be a verified email address in Amazon SES and must be
         * configured to allow Cognito to send emails.
         *
         * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html)
         */
        override fun fromEmail(): String = unwrap(this).getFromEmail()

        /**
         * An optional name that should be used as the sender's name along with the email.
         *
         * Default: - no name
         */
        override fun fromName(): String? = unwrap(this).getFromName()

        /**
         * The destination to which the receiver of the email should reply to.
         *
         * Default: - same as the fromEmail
         */
        override fun replyTo(): String? = unwrap(this).getReplyTo()

        /**
         * Required if the UserPool region is different than the SES region.
         *
         * If sending emails with a Amazon SES verified email address, and the region that SES is
         * configured is different than the region in which the UserPool is deployed, you must
         * specify that region here.
         *
         * Default: - The same region as the Cognito UserPool
         */
        override fun sesRegion(): String? = unwrap(this).getSesRegion()

        /**
         * SES Verified custom domain to be used to verify the identity.
         *
         * Default: - no domain
         */
        override fun sesVerifiedDomain(): String? = unwrap(this).getSesVerifiedDomain()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolSESOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.UserPoolSESOptions
        ): UserPoolSESOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: UserPoolSESOptions
        ): software.amazon.awscdk.services.cognito.UserPoolSESOptions =
            (wrapped as Wrapper).cdkObject
    }
}
