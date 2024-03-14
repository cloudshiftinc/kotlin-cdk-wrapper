package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class SecretRotationApplication
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication,
) {
    /**
     * Returns the application ARN for the current partition.
     *
     * Can be used in combination with a `CfnMapping` to automatically select the correct ARN based
     * on the current partition.
     *
     * @param partition
     */
    public open fun applicationArnForPartition(partition: String): String =
        unwrap(this).applicationArnForPartition(partition)

    /** Whether the rotation application uses the mutli user scheme. */
    public open fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

    /**
     * The semantic version of the app for the current partition.
     *
     * Can be used in combination with a `CfnMapping` to automatically select the correct version
     * based on the current partition.
     *
     * @param partition
     */
    public open fun semanticVersionForPartition(partition: String): String =
        unwrap(this).semanticVersionForPartition(partition)

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * Whether the rotation application uses the mutli user scheme.
         *
         * Default: false
         *
         * @param isMultiUser Whether the rotation application uses the mutli user scheme.
         */
        public fun isMultiUser(isMultiUser: Boolean)
    }

    private class BuilderImpl(
        applicationId: String,
        semanticVersion: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder =
            software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder.create(
                applicationId,
                semanticVersion
            )

        /**
         * Whether the rotation application uses the mutli user scheme.
         *
         * Default: false
         *
         * @param isMultiUser Whether the rotation application uses the mutli user scheme.
         */
        override fun isMultiUser(isMultiUser: Boolean) {
            cdkBuilder.isMultiUser(isMultiUser)
        }

        public fun build():
            software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            applicationId: String,
            semanticVersion: String,
            block: Builder.() -> Unit = {},
        ): SecretRotationApplication {
            val builderImpl = BuilderImpl(applicationId, semanticVersion)
            return SecretRotationApplication(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
        ): SecretRotationApplication = SecretRotationApplication(cdkObject)

        internal fun unwrap(
            wrapped: SecretRotationApplication
        ): software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
            wrapped.cdkObject
    }
}
