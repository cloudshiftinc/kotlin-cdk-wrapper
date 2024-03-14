package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface CfnParametersCodeProps {
    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     */
    public fun bucketNameParam(): CfnParameter? =
        unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     */
    public fun objectKeyParam(): CfnParameter? =
        unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)

    /** A builder for [CfnParametersCodeProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param bucketNameParam The CloudFormation parameter that represents the name of the S3
         *   Bucket where the Lambda code will be located in. Must be of type 'String'.
         */
        public fun bucketNameParam(bucketNameParam: CfnParameter)

        /**
         * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
         *   Bucket where the Lambda code will be located at. Must be of type 'String'.
         */
        public fun objectKeyParam(objectKeyParam: CfnParameter)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.lambda.CfnParametersCodeProps.Builder =
            software.amazon.awscdk.services.lambda.CfnParametersCodeProps.builder()

        /**
         * @param bucketNameParam The CloudFormation parameter that represents the name of the S3
         *   Bucket where the Lambda code will be located in. Must be of type 'String'.
         */
        override fun bucketNameParam(bucketNameParam: CfnParameter) {
            cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter::unwrap))
        }

        /**
         * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
         *   Bucket where the Lambda code will be located at. Must be of type 'String'.
         */
        override fun objectKeyParam(objectKeyParam: CfnParameter) {
            cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCodeProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps,
    ) : CfnParametersCodeProps {
        /**
         * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda
         * code will be located in.
         *
         * Must be of type 'String'.
         *
         * Default: a new parameter will be created
         */
        override fun bucketNameParam(): CfnParameter? =
            unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

        /**
         * The CloudFormation parameter that represents the path inside the S3 Bucket where the
         * Lambda code will be located at.
         *
         * Must be of type 'String'.
         *
         * Default: a new parameter will be created
         */
        override fun objectKeyParam(): CfnParameter? =
            unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCodeProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps
        ): CfnParametersCodeProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CfnParametersCodeProps
        ): software.amazon.awscdk.services.lambda.CfnParametersCodeProps =
            (wrapped as Wrapper).cdkObject
    }
}
