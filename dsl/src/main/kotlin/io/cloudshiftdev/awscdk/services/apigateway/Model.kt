package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Model
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.Model,
) : Resource(cdkObject), IModel {
    /** Returns the model name, such as 'myModel'. */
    public override fun modelId(): String = unwrap(this).getModelId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Model]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The content type for the model.
         *
         * You can also force a content type in the request or response model mapping.
         *
         * Default: 'application/json'
         *
         * @param contentType The content type for the model.
         */
        public fun contentType(contentType: String)

        /**
         * A description that identifies this model.
         *
         * Default: None
         *
         * @param description A description that identifies this model.
         */
        public fun description(description: String)

        /**
         * A name for the model.
         *
         * Important If you specify a name, you cannot perform updates that require replacement of
         * this resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * Default: <auto> If you don't specify a name, AWS CloudFormation generates a unique
         * physical ID and uses that ID for the model name. For more information, see Name Type.
         *
         * @param modelName A name for the model.
         */
        public fun modelName(modelName: String)

        /**
         * The rest API that this model is part of.
         *
         * The reason we need the RestApi object itself and not just the ID is because the model is
         * being tracked by the top-level RestApi object for the purpose of calculating it's hash to
         * determine the ID of the deployment. This allows us to automatically update the deployment
         * when the model of the REST API changes.
         *
         * @param restApi The rest API that this model is part of.
         */
        public fun restApi(restApi: IRestApi)

        /**
         * The schema to use to transform data to one or more output formats.
         *
         * Specify null ({}) if you don't want to specify a schema.
         *
         * @param schema The schema to use to transform data to one or more output formats.
         */
        public fun schema(schema: JsonSchema)

        /**
         * The schema to use to transform data to one or more output formats.
         *
         * Specify null ({}) if you don't want to specify a schema.
         *
         * @param schema The schema to use to transform data to one or more output formats.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4a813e8e585258da5c286b3d66d54447e843da13b8ca9c989720a67be94d08df")
        public fun schema(schema: JsonSchema.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.Model.Builder =
            software.amazon.awscdk.services.apigateway.Model.Builder.create(scope, id)

        /**
         * The content type for the model.
         *
         * You can also force a content type in the request or response model mapping.
         *
         * Default: 'application/json'
         *
         * @param contentType The content type for the model.
         */
        override fun contentType(contentType: String) {
            cdkBuilder.contentType(contentType)
        }

        /**
         * A description that identifies this model.
         *
         * Default: None
         *
         * @param description A description that identifies this model.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A name for the model.
         *
         * Important If you specify a name, you cannot perform updates that require replacement of
         * this resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * Default: <auto> If you don't specify a name, AWS CloudFormation generates a unique
         * physical ID and uses that ID for the model name. For more information, see Name Type.
         *
         * @param modelName A name for the model.
         */
        override fun modelName(modelName: String) {
            cdkBuilder.modelName(modelName)
        }

        /**
         * The rest API that this model is part of.
         *
         * The reason we need the RestApi object itself and not just the ID is because the model is
         * being tracked by the top-level RestApi object for the purpose of calculating it's hash to
         * determine the ID of the deployment. This allows us to automatically update the deployment
         * when the model of the REST API changes.
         *
         * @param restApi The rest API that this model is part of.
         */
        override fun restApi(restApi: IRestApi) {
            cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
        }

        /**
         * The schema to use to transform data to one or more output formats.
         *
         * Specify null ({}) if you don't want to specify a schema.
         *
         * @param schema The schema to use to transform data to one or more output formats.
         */
        override fun schema(schema: JsonSchema) {
            cdkBuilder.schema(schema.let(JsonSchema::unwrap))
        }

        /**
         * The schema to use to transform data to one or more output formats.
         *
         * Specify null ({}) if you don't want to specify a schema.
         *
         * @param schema The schema to use to transform data to one or more output formats.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4a813e8e585258da5c286b3d66d54447e843da13b8ca9c989720a67be94d08df")
        override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit =
            schema(JsonSchema(schema))

        public fun build(): software.amazon.awscdk.services.apigateway.Model = cdkBuilder.build()
    }

    public companion object {
        public fun fromModelName(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            modelName: String,
        ): IModel =
            software.amazon.awscdk.services.apigateway.Model.fromModelName(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    modelName
                )
                .let(IModel::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Model {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Model(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Model): Model =
            Model(cdkObject)

        internal fun unwrap(wrapped: Model): software.amazon.awscdk.services.apigateway.Model =
            wrapped.cdkObject
    }
}
