package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TopicPolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.sns.TopicPolicy,
) : Resource(cdkObject) {
    /** The IAM policy document for this policy. */
    public open fun document(): PolicyDocument =
        unwrap(this).getDocument().let(PolicyDocument::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.sns.TopicPolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Adds a statement to enforce encryption of data in transit when publishing to the topic.
         *
         * For more information, see
         * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
         *
         * Default: false
         *
         * @param enforceSsl Adds a statement to enforce encryption of data in transit when
         *   publishing to the topic.
         */
        public fun enforceSsl(enforceSsl: Boolean)

        /**
         * IAM policy document to apply to topic(s).
         *
         * Default: empty policy document
         *
         * @param policyDocument IAM policy document to apply to topic(s).
         */
        public fun policyDocument(policyDocument: PolicyDocument)

        /**
         * IAM policy document to apply to topic(s).
         *
         * Default: empty policy document
         *
         * @param policyDocument IAM policy document to apply to topic(s).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a9a7c2744698ca24c0ae4ca22505105510f722b2d38f07d907481af1470bf2d2")
        public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

        /**
         * The set of topics this policy applies to.
         *
         * @param topics The set of topics this policy applies to.
         */
        public fun topics(topics: List<ITopic>)

        /**
         * The set of topics this policy applies to.
         *
         * @param topics The set of topics this policy applies to.
         */
        public fun topics(vararg topics: ITopic)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.sns.TopicPolicy.Builder =
            software.amazon.awscdk.services.sns.TopicPolicy.Builder.create(scope, id)

        /**
         * Adds a statement to enforce encryption of data in transit when publishing to the topic.
         *
         * For more information, see
         * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
         *
         * Default: false
         *
         * @param enforceSsl Adds a statement to enforce encryption of data in transit when
         *   publishing to the topic.
         */
        override fun enforceSsl(enforceSsl: Boolean) {
            cdkBuilder.enforceSsl(enforceSsl)
        }

        /**
         * IAM policy document to apply to topic(s).
         *
         * Default: empty policy document
         *
         * @param policyDocument IAM policy document to apply to topic(s).
         */
        override fun policyDocument(policyDocument: PolicyDocument) {
            cdkBuilder.policyDocument(policyDocument.let(PolicyDocument::unwrap))
        }

        /**
         * IAM policy document to apply to topic(s).
         *
         * Default: empty policy document
         *
         * @param policyDocument IAM policy document to apply to topic(s).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a9a7c2744698ca24c0ae4ca22505105510f722b2d38f07d907481af1470bf2d2")
        override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
            policyDocument(PolicyDocument(policyDocument))

        /**
         * The set of topics this policy applies to.
         *
         * @param topics The set of topics this policy applies to.
         */
        override fun topics(topics: List<ITopic>) {
            cdkBuilder.topics(topics.map(ITopic::unwrap))
        }

        /**
         * The set of topics this policy applies to.
         *
         * @param topics The set of topics this policy applies to.
         */
        override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

        public fun build(): software.amazon.awscdk.services.sns.TopicPolicy = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): TopicPolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return TopicPolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicPolicy): TopicPolicy =
            TopicPolicy(cdkObject)

        internal fun unwrap(wrapped: TopicPolicy): software.amazon.awscdk.services.sns.TopicPolicy =
            wrapped.cdkObject
    }
}
