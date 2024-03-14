package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface StageAttributes {
    /** The RestApi that the stage belongs to. */
    public fun restApi(): IRestApi

    /** The name of the stage. */
    public fun stageName(): String

    /** A builder for [StageAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param restApi The RestApi that the stage belongs to. */
        public fun restApi(restApi: IRestApi)

        /** @param stageName The name of the stage. */
        public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.StageAttributes.Builder =
            software.amazon.awscdk.services.apigateway.StageAttributes.builder()

        /** @param restApi The RestApi that the stage belongs to. */
        override fun restApi(restApi: IRestApi) {
            cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
        }

        /** @param stageName The name of the stage. */
        override fun stageName(stageName: String) {
            cdkBuilder.stageName(stageName)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.StageAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.StageAttributes,
    ) : StageAttributes {
        /** The RestApi that the stage belongs to. */
        override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

        /** The name of the stage. */
        override fun stageName(): String = unwrap(this).getStageName()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): StageAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.StageAttributes
        ): StageAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: StageAttributes
        ): software.amazon.awscdk.services.apigateway.StageAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
