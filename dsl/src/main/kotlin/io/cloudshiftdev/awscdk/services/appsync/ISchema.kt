package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISchema {
    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @param api the api to bind the schema to.
     * @param options configuration for bind behavior.
     * @return ISchemaConfig with apiId and schema definition string
     */
    public fun bind(api: IGraphqlApi): ISchemaConfig

    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @param api the api to bind the schema to.
     * @param options configuration for bind behavior.
     * @return ISchemaConfig with apiId and schema definition string
     */
    public fun bind(api: IGraphqlApi, options: SchemaBindOptions): ISchemaConfig

    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @param api the api to bind the schema to.
     * @param options configuration for bind behavior.
     * @return ISchemaConfig with apiId and schema definition string
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
    public fun bind(api: IGraphqlApi, options: SchemaBindOptions.Builder.() -> Unit): ISchemaConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.ISchema,
    ) : ISchema {
        /**
         * Binds a schema string to a GraphQlApi.
         *
         * @param api the api to bind the schema to.
         * @param options configuration for bind behavior.
         * @return ISchemaConfig with apiId and schema definition string
         */
        override fun bind(api: IGraphqlApi): ISchemaConfig =
            unwrap(this).bind(api.let(IGraphqlApi::unwrap)).let(ISchemaConfig::wrap)

        /**
         * Binds a schema string to a GraphQlApi.
         *
         * @param api the api to bind the schema to.
         * @param options configuration for bind behavior.
         * @return ISchemaConfig with apiId and schema definition string
         */
        override fun bind(api: IGraphqlApi, options: SchemaBindOptions): ISchemaConfig =
            unwrap(this)
                .bind(api.let(IGraphqlApi::unwrap), options.let(SchemaBindOptions::unwrap))
                .let(ISchemaConfig::wrap)

        /**
         * Binds a schema string to a GraphQlApi.
         *
         * @param api the api to bind the schema to.
         * @param options configuration for bind behavior.
         * @return ISchemaConfig with apiId and schema definition string
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
        override fun bind(
            api: IGraphqlApi,
            options: SchemaBindOptions.Builder.() -> Unit
        ): ISchemaConfig = bind(api, SchemaBindOptions(options))
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchema): ISchema =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: ISchema): software.amazon.awscdk.services.appsync.ISchema =
            (wrapped as Wrapper).cdkObject
    }
}
