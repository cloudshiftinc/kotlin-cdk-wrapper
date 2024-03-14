package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

public interface OutputDataConfig {
    /**
     * Optional KMS encryption key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     *
     * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account
     */
    public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /** Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. */
    public fun s3OutputLocation(): S3Location

    /** A builder for [OutputDataConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param encryptionKey Optional KMS encryption key that Amazon SageMaker uses to encrypt
         *   the model artifacts at rest using Amazon S3 server-side encryption.
         */
        public fun encryptionKey(encryptionKey: IKey)

        /**
         * @param s3OutputLocation Identifies the S3 path where you want Amazon SageMaker to store
         *   the model artifacts.
         */
        public fun s3OutputLocation(s3OutputLocation: S3Location)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.builder()

        /**
         * @param encryptionKey Optional KMS encryption key that Amazon SageMaker uses to encrypt
         *   the model artifacts at rest using Amazon S3 server-side encryption.
         */
        override fun encryptionKey(encryptionKey: IKey) {
            cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
        }

        /**
         * @param s3OutputLocation Identifies the S3 path where you want Amazon SageMaker to store
         *   the model artifacts.
         */
        override fun s3OutputLocation(s3OutputLocation: S3Location) {
            cdkBuilder.s3OutputLocation(s3OutputLocation.let(S3Location::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig,
    ) : OutputDataConfig {
        /**
         * Optional KMS encryption key that Amazon SageMaker uses to encrypt the model artifacts at
         * rest using Amazon S3 server-side encryption.
         *
         * Default: - Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
         * account
         */
        override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

        /** Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. */
        override fun s3OutputLocation(): S3Location =
            unwrap(this).getS3OutputLocation().let(S3Location::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): OutputDataConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
        ): OutputDataConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: OutputDataConfig
        ): software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig =
            (wrapped as Wrapper).cdkObject
    }
}
