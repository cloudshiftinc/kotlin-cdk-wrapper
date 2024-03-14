package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface KeepOriginalAttrs {
    /**
     * Whether the email address of the user should remain the original value until the new email
     * address is verified.
     *
     * Default: - false
     */
    public fun email(): Boolean? = unwrap(this).getEmail()

    /**
     * Whether the phone number of the user should remain the original value until the new phone
     * number is verified.
     *
     * Default: - false
     */
    public fun phone(): Boolean? = unwrap(this).getPhone()

    /** A builder for [KeepOriginalAttrs] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param email Whether the email address of the user should remain the original value until
         *   the new email address is verified.
         */
        public fun email(email: Boolean)

        /**
         * @param phone Whether the phone number of the user should remain the original value until
         *   the new phone number is verified.
         */
        public fun phone(phone: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cognito.KeepOriginalAttrs.Builder =
            software.amazon.awscdk.services.cognito.KeepOriginalAttrs.builder()

        /**
         * @param email Whether the email address of the user should remain the original value until
         *   the new email address is verified.
         */
        override fun email(email: Boolean) {
            cdkBuilder.email(email)
        }

        /**
         * @param phone Whether the phone number of the user should remain the original value until
         *   the new phone number is verified.
         */
        override fun phone(phone: Boolean) {
            cdkBuilder.phone(phone)
        }

        public fun build(): software.amazon.awscdk.services.cognito.KeepOriginalAttrs =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs,
    ) : KeepOriginalAttrs {
        /**
         * Whether the email address of the user should remain the original value until the new
         * email address is verified.
         *
         * Default: - false
         */
        override fun email(): Boolean? = unwrap(this).getEmail()

        /**
         * Whether the phone number of the user should remain the original value until the new phone
         * number is verified.
         *
         * Default: - false
         */
        override fun phone(): Boolean? = unwrap(this).getPhone()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): KeepOriginalAttrs {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs
        ): KeepOriginalAttrs = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: KeepOriginalAttrs
        ): software.amazon.awscdk.services.cognito.KeepOriginalAttrs =
            (wrapped as Wrapper).cdkObject
    }
}
