package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface UserAttributes {
    /**
     * The ARN of the user.
     *
     * Format: arn:<partition>:iam::<account-id>:user/<user-name-with-path>
     */
    public fun userArn(): String

    /** A builder for [UserAttributes] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param userArn The ARN of the user. Format:
         *   arn:<partition>:iam::<account-id>:user/<user-name-with-path>
         */
        public fun userArn(userArn: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.iam.UserAttributes.Builder =
            software.amazon.awscdk.services.iam.UserAttributes.builder()

        /**
         * @param userArn The ARN of the user. Format:
         *   arn:<partition>:iam::<account-id>:user/<user-name-with-path>
         */
        override fun userArn(userArn: String) {
            cdkBuilder.userArn(userArn)
        }

        public fun build(): software.amazon.awscdk.services.iam.UserAttributes = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.iam.UserAttributes,
    ) : UserAttributes {
        /**
         * The ARN of the user.
         *
         * Format: arn:<partition>:iam::<account-id>:user/<user-name-with-path>
         */
        override fun userArn(): String = unwrap(this).getUserArn()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): UserAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iam.UserAttributes
        ): UserAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: UserAttributes
        ): software.amazon.awscdk.services.iam.UserAttributes = (wrapped as Wrapper).cdkObject
    }
}
