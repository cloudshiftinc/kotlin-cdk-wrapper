package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BitBucketSourceCredentials
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials,
) : Resource(cdkObject) {
    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.BitBucketSourceCredentials].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * Your BitBucket application password.
         *
         * @param password Your BitBucket application password.
         */
        public fun password(password: SecretValue)

        /**
         * Your BitBucket username.
         *
         * @param username Your BitBucket username.
         */
        public fun username(username: SecretValue)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder =
            software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder.create(
                scope,
                id
            )

        /**
         * Your BitBucket application password.
         *
         * @param password Your BitBucket application password.
         */
        override fun password(password: SecretValue) {
            cdkBuilder.password(password.let(SecretValue::unwrap))
        }

        /**
         * Your BitBucket username.
         *
         * @param username Your BitBucket username.
         */
        override fun username(username: SecretValue) {
            cdkBuilder.username(username.let(SecretValue::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): BitBucketSourceCredentials {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return BitBucketSourceCredentials(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
        ): BitBucketSourceCredentials = BitBucketSourceCredentials(cdkObject)

        internal fun unwrap(
            wrapped: BitBucketSourceCredentials
        ): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials = wrapped.cdkObject
    }
}
