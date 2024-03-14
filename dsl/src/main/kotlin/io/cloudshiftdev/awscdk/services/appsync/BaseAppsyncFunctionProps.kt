package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface BaseAppsyncFunctionProps {
    /**
     * The function code.
     *
     * Default: - no code is used
     */
    public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    /**
     * the description for this AppSync Function.
     *
     * Default: - no description
     */
    public fun description(): String? = unwrap(this).getDescription()

    /** the name of the AppSync Function. */
    public fun name(): String

    /**
     * the request mapping template for the AppSync Function.
     *
     * Default: - no request mapping template
     */
    public fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * the response mapping template for the AppSync Function.
     *
     * Default: - no response mapping template
     */
    public fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     */
    public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

    /** A builder for [BaseAppsyncFunctionProps] */
    @CdkDslMarker
    public interface Builder {
        /** @param code The function code. */
        public fun code(code: Code)

        /** @param description the description for this AppSync Function. */
        public fun description(description: String)

        /** @param name the name of the AppSync Function. */
        public fun name(name: String)

        /** @param requestMappingTemplate the request mapping template for the AppSync Function. */
        public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

        /**
         * @param responseMappingTemplate the response mapping template for the AppSync Function.
         */
        public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

        /** @param runtime The functions runtime. */
        public fun runtime(runtime: FunctionRuntime)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps.Builder =
            software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps.builder()

        /** @param code The function code. */
        override fun code(code: Code) {
            cdkBuilder.code(code.let(Code::unwrap))
        }

        /** @param description the description for this AppSync Function. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /** @param name the name of the AppSync Function. */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /** @param requestMappingTemplate the request mapping template for the AppSync Function. */
        override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
            cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
        }

        /**
         * @param responseMappingTemplate the response mapping template for the AppSync Function.
         */
        override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
            cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
        }

        /** @param runtime The functions runtime. */
        override fun runtime(runtime: FunctionRuntime) {
            cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps,
    ) : BaseAppsyncFunctionProps {
        /**
         * The function code.
         *
         * Default: - no code is used
         */
        override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

        /**
         * the description for this AppSync Function.
         *
         * Default: - no description
         */
        override fun description(): String? = unwrap(this).getDescription()

        /** the name of the AppSync Function. */
        override fun name(): String = unwrap(this).getName()

        /**
         * the request mapping template for the AppSync Function.
         *
         * Default: - no request mapping template
         */
        override fun requestMappingTemplate(): MappingTemplate? =
            unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

        /**
         * the response mapping template for the AppSync Function.
         *
         * Default: - no response mapping template
         */
        override fun responseMappingTemplate(): MappingTemplate? =
            unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

        /**
         * The functions runtime.
         *
         * Default: - no function runtime, VTL mapping templates used
         */
        override fun runtime(): FunctionRuntime? =
            unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BaseAppsyncFunctionProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps
        ): BaseAppsyncFunctionProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BaseAppsyncFunctionProps
        ): software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps =
            (wrapped as Wrapper).cdkObject
    }
}
