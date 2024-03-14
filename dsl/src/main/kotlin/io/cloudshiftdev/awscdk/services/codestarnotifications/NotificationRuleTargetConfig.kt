package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface NotificationRuleTargetConfig {
    /** The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client. */
    public fun targetAddress(): String

    /**
     * The target type.
     *
     * Can be an Amazon SNS topic or AWS Chatbot client.
     */
    public fun targetType(): String

    /** A builder for [NotificationRuleTargetConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS
         *   Chatbot client.
         */
        public fun targetAddress(targetAddress: String)

        /** @param targetType The target type. Can be an Amazon SNS topic or AWS Chatbot client. */
        public fun targetType(targetType: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.Builder =
            software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
                .builder()

        /**
         * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS
         *   Chatbot client.
         */
        override fun targetAddress(targetAddress: String) {
            cdkBuilder.targetAddress(targetAddress)
        }

        /** @param targetType The target type. Can be an Amazon SNS topic or AWS Chatbot client. */
        override fun targetType(targetType: String) {
            cdkBuilder.targetType(targetType)
        }

        public fun build():
            software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig,
    ) : NotificationRuleTargetConfig {
        /** The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client. */
        override fun targetAddress(): String = unwrap(this).getTargetAddress()

        /**
         * The target type.
         *
         * Can be an Amazon SNS topic or AWS Chatbot client.
         */
        override fun targetType(): String = unwrap(this).getTargetType()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleTargetConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
        ): NotificationRuleTargetConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: NotificationRuleTargetConfig
        ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
            (wrapped as Wrapper).cdkObject
    }
}
