package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface WorkmailActionConfig {
    /** The Amazon Resource Name (ARN) of the Amazon WorkMail organization. */
    public fun organizationArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is
     * called.
     *
     * Default: - No notification is sent to SNS.
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /** A builder for [WorkmailActionConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail
         *   organization.
         */
        public fun organizationArn(organizationArn: String)

        /**
         * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
         *   WorkMail action is called.
         */
        public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ses.WorkmailActionConfig.Builder =
            software.amazon.awscdk.services.ses.WorkmailActionConfig.builder()

        /**
         * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail
         *   organization.
         */
        override fun organizationArn(organizationArn: String) {
            cdkBuilder.organizationArn(organizationArn)
        }

        /**
         * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
         *   WorkMail action is called.
         */
        override fun topicArn(topicArn: String) {
            cdkBuilder.topicArn(topicArn)
        }

        public fun build(): software.amazon.awscdk.services.ses.WorkmailActionConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig,
    ) : WorkmailActionConfig {
        /** The Amazon Resource Name (ARN) of the Amazon WorkMail organization. */
        override fun organizationArn(): String = unwrap(this).getOrganizationArn()

        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action
         * is called.
         *
         * Default: - No notification is sent to SNS.
         */
        override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): WorkmailActionConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig
        ): WorkmailActionConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: WorkmailActionConfig
        ): software.amazon.awscdk.services.ses.WorkmailActionConfig = (wrapped as Wrapper).cdkObject
    }
}
