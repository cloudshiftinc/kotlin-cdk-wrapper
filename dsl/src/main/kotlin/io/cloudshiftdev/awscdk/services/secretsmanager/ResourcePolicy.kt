package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ResourcePolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicy,
) : Resource(cdkObject) {
    /** The IAM policy document for this policy. */
    public open fun document(): PolicyDocument =
        unwrap(this).getDocument().let(PolicyDocument::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.ResourcePolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The secret to attach a resource-based permissions policy.
         *
         * @param secret The secret to attach a resource-based permissions policy.
         */
        public fun secret(secret: ISecret)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.secretsmanager.ResourcePolicy.Builder =
            software.amazon.awscdk.services.secretsmanager.ResourcePolicy.Builder.create(scope, id)

        /**
         * The secret to attach a resource-based permissions policy.
         *
         * @param secret The secret to attach a resource-based permissions policy.
         */
        override fun secret(secret: ISecret) {
            cdkBuilder.secret(secret.let(ISecret::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.secretsmanager.ResourcePolicy =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ResourcePolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ResourcePolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicy
        ): ResourcePolicy = ResourcePolicy(cdkObject)

        internal fun unwrap(
            wrapped: ResourcePolicy
        ): software.amazon.awscdk.services.secretsmanager.ResourcePolicy = wrapped.cdkObject
    }
}
