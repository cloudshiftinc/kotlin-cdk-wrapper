package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface UserInvitationConfig {
    /**
     * The template to the email body that is sent to the user when an administrator signs them up
     * to the user pool.
     *
     * Default: 'Your username is {username} and temporary password is {####}.'
     */
    public fun emailBody(): String? = unwrap(this).getEmailBody()

    /**
     * The template to the email subject that is sent to the user when an administrator signs them
     * up to the user pool.
     *
     * Default: 'Your temporary password'
     */
    public fun emailSubject(): String? = unwrap(this).getEmailSubject()

    /**
     * The template to the SMS message that is sent to the user when an administrator signs them up
     * to the user pool.
     *
     * Default: 'Your username is {username} and temporary password is {####}'
     */
    public fun smsMessage(): String? = unwrap(this).getSmsMessage()

    /** A builder for [UserInvitationConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param emailBody The template to the email body that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        public fun emailBody(emailBody: String)

        /**
         * @param emailSubject The template to the email subject that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        public fun emailSubject(emailSubject: String)

        /**
         * @param smsMessage The template to the SMS message that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        public fun smsMessage(smsMessage: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cognito.UserInvitationConfig.Builder =
            software.amazon.awscdk.services.cognito.UserInvitationConfig.builder()

        /**
         * @param emailBody The template to the email body that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        override fun emailBody(emailBody: String) {
            cdkBuilder.emailBody(emailBody)
        }

        /**
         * @param emailSubject The template to the email subject that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        override fun emailSubject(emailSubject: String) {
            cdkBuilder.emailSubject(emailSubject)
        }

        /**
         * @param smsMessage The template to the SMS message that is sent to the user when an
         *   administrator signs them up to the user pool.
         */
        override fun smsMessage(smsMessage: String) {
            cdkBuilder.smsMessage(smsMessage)
        }

        public fun build(): software.amazon.awscdk.services.cognito.UserInvitationConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig,
    ) : UserInvitationConfig {
        /**
         * The template to the email body that is sent to the user when an administrator signs them
         * up to the user pool.
         *
         * Default: 'Your username is {username} and temporary password is {####}.'
         */
        override fun emailBody(): String? = unwrap(this).getEmailBody()

        /**
         * The template to the email subject that is sent to the user when an administrator signs
         * them up to the user pool.
         *
         * Default: 'Your temporary password'
         */
        override fun emailSubject(): String? = unwrap(this).getEmailSubject()

        /**
         * The template to the SMS message that is sent to the user when an administrator signs them
         * up to the user pool.
         *
         * Default: 'Your username is {username} and temporary password is {####}'
         */
        override fun smsMessage(): String? = unwrap(this).getSmsMessage()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): UserInvitationConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig
        ): UserInvitationConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: UserInvitationConfig
        ): software.amazon.awscdk.services.cognito.UserInvitationConfig =
            (wrapped as Wrapper).cdkObject
    }
}
