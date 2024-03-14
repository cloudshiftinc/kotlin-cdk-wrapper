package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface AdvancedSecurityOptions {
    /**
     * (deprecated) ARN for the master user.
     *
     * Only specify this or masterUserName, but not both.
     *
     * Default: - fine-grained access control is disabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    /**
     * (deprecated) Username for the master user.
     *
     * Only specify this or masterUserArn, but not both.
     *
     * Default: - fine-grained access control is disabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * (deprecated) Password for the master user.
     *
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or use
     * `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
     *
     * Default: - A Secrets Manager generated password
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserPassword(): SecretValue? =
        unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

    /** A builder for [AdvancedSecurityOptions] */
    @CdkDslMarker
    @Deprecated(message = "deprecated in CDK")
    public interface Builder {
        /**
         * @param masterUserArn ARN for the master user. Only specify this or masterUserName, but
         *   not both.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK") public fun masterUserArn(masterUserArn: String)

        /**
         * @param masterUserName Username for the master user. Only specify this or masterUserArn,
         *   but not both.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK") public fun masterUserName(masterUserName: String)

        /**
         * @param masterUserPassword Password for the master user. You can use
         *   `SecretValue.unsafePlainText` to specify a password in plain text or use
         *   `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        public fun masterUserPassword(masterUserPassword: SecretValue)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions.Builder =
            software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions.builder()

        /**
         * @param masterUserArn ARN for the master user. Only specify this or masterUserName, but
         *   not both.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserArn(masterUserArn: String) {
            cdkBuilder.masterUserArn(masterUserArn)
        }

        /**
         * @param masterUserName Username for the master user. Only specify this or masterUserArn,
         *   but not both.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserName(masterUserName: String) {
            cdkBuilder.masterUserName(masterUserName)
        }

        /**
         * @param masterUserPassword Password for the master user. You can use
         *   `SecretValue.unsafePlainText` to specify a password in plain text or use
         *   `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserPassword(masterUserPassword: SecretValue) {
            cdkBuilder.masterUserPassword(masterUserPassword.let(SecretValue::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions,
    ) : AdvancedSecurityOptions {
        /**
         * (deprecated) ARN for the master user.
         *
         * Only specify this or masterUserName, but not both.
         *
         * Default: - fine-grained access control is disabled
         *
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

        /**
         * (deprecated) Username for the master user.
         *
         * Only specify this or masterUserArn, but not both.
         *
         * Default: - fine-grained access control is disabled
         *
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserName(): String? = unwrap(this).getMasterUserName()

        /**
         * (deprecated) Password for the master user.
         *
         * You can use `SecretValue.unsafePlainText` to specify a password in plain text or use
         * `secretsmanager.Secret.fromSecretAttributes` to reference a secret in Secrets Manager.
         *
         * Default: - A Secrets Manager generated password
         *
         * @deprecated use opensearchservice module instead
         */
        @Deprecated(message = "deprecated in CDK")
        override fun masterUserPassword(): SecretValue? =
            unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedSecurityOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions
        ): AdvancedSecurityOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AdvancedSecurityOptions
        ): software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions =
            (wrapped as Wrapper).cdkObject
    }
}
