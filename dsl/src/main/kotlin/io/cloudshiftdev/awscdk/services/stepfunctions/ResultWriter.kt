package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class ResultWriter
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter,
) {
    /** S3 Bucket in which to save Map Run results. */
    public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     */
    public open fun prefix(): String? = unwrap(this).getPrefix()

    /** Compile policy statements to provide relevent permissions to the state machine. */
    public open fun providePolicyStatements(): List<PolicyStatement> =
        unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

    /** Render ResultWriter in ASL JSON format. */
    public open fun render(): Any = unwrap(this).render()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.ResultWriter]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * S3 Bucket in which to save Map Run results.
         *
         * @param bucket S3 Bucket in which to save Map Run results.
         */
        public fun bucket(bucket: IBucket)

        /**
         * S3 prefix in which to save Map Run results.
         *
         * Default: - No prefix
         *
         * @param prefix S3 prefix in which to save Map Run results.
         */
        public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder =
            software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder.create()

        /**
         * S3 Bucket in which to save Map Run results.
         *
         * @param bucket S3 Bucket in which to save Map Run results.
         */
        override fun bucket(bucket: IBucket) {
            cdkBuilder.bucket(bucket.let(IBucket::unwrap))
        }

        /**
         * S3 prefix in which to save Map Run results.
         *
         * Default: - No prefix
         *
         * @param prefix S3 prefix in which to save Map Run results.
         */
        override fun prefix(prefix: String) {
            cdkBuilder.prefix(prefix)
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriter =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriter {
            val builderImpl = BuilderImpl()
            return ResultWriter(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter
        ): ResultWriter = ResultWriter(cdkObject)

        internal fun unwrap(
            wrapped: ResultWriter
        ): software.amazon.awscdk.services.stepfunctions.ResultWriter = wrapped.cdkObject
    }
}
