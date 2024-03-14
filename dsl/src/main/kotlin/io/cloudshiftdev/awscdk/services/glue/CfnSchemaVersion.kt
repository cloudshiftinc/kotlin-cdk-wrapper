package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchemaVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion,
) : CfnResource(cdkObject), IInspectable {
    /** Represents the version ID associated with the schema version. */
    public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The schema that includes the schema version. */
    public open fun schema(): Any = unwrap(this).getSchema()

    /** The schema that includes the schema version. */
    public open fun schema(`value`: IResolvable) {
        unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
    }

    /** The schema that includes the schema version. */
    public open fun schema(`value`: SchemaProperty) {
        unwrap(this).setSchema(`value`.let(SchemaProperty::unwrap))
    }

    /** The schema that includes the schema version. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cb0a20ed64313dcb959d87d54de72323b3f7aa26343157f9ce966fff70df4f1")
    public open fun schema(`value`: SchemaProperty.Builder.() -> Unit): Unit =
        schema(SchemaProperty(`value`))

    /** The schema definition for the schema version. */
    public open fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

    /** The schema definition for the schema version. */
    public open fun schemaDefinition(`value`: String) {
        unwrap(this).setSchemaDefinition(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnSchemaVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        public fun schema(schema: IResolvable)

        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        public fun schema(schema: SchemaProperty)

        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d485f89f5bda293c194cdfaf6fafbb513920af62464e4baeddce765acc7b571a")
        public fun schema(schema: SchemaProperty.Builder.() -> Unit)

        /**
         * The schema definition for the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schemadefinition)
         *
         * @param schemaDefinition The schema definition for the schema version.
         */
        public fun schemaDefinition(schemaDefinition: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder =
            software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder.create(scope, id)

        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        override fun schema(schema: IResolvable) {
            cdkBuilder.schema(schema.let(IResolvable::unwrap))
        }

        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        override fun schema(schema: SchemaProperty) {
            cdkBuilder.schema(schema.let(SchemaProperty::unwrap))
        }

        /**
         * The schema that includes the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
         *
         * @param schema The schema that includes the schema version.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d485f89f5bda293c194cdfaf6fafbb513920af62464e4baeddce765acc7b571a")
        override fun schema(schema: SchemaProperty.Builder.() -> Unit): Unit =
            schema(SchemaProperty(schema))

        /**
         * The schema definition for the schema version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schemadefinition)
         *
         * @param schemaDefinition The schema definition for the schema version.
         */
        override fun schemaDefinition(schemaDefinition: String) {
            cdkBuilder.schemaDefinition(schemaDefinition)
        }

        public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSchemaVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSchemaVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion
        ): CfnSchemaVersion = CfnSchemaVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnSchemaVersion
        ): software.amazon.awscdk.services.glue.CfnSchemaVersion = wrapped.cdkObject
    }

    public interface SchemaProperty {
        /**
         * The name of the registry where the schema is stored.
         *
         * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-registryname)
         */
        public fun registryName(): String? = unwrap(this).getRegistryName()

        /**
         * The Amazon Resource Name (ARN) of the schema.
         *
         * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-schemaarn)
         */
        public fun schemaArn(): String? = unwrap(this).getSchemaArn()

        /**
         * The name of the schema.
         *
         * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-schemaname)
         */
        public fun schemaName(): String? = unwrap(this).getSchemaName()

        /** A builder for [SchemaProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param registryName The name of the registry where the schema is stored. Either
             *   `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
             */
            public fun registryName(registryName: String)

            /**
             * @param schemaArn The Amazon Resource Name (ARN) of the schema. Either `SchemaArn` ,
             *   or `SchemaName` and `RegistryName` has to be provided.
             */
            public fun schemaArn(schemaArn: String)

            /**
             * @param schemaName The name of the schema. Either `SchemaArn` , or `SchemaName` and
             *   `RegistryName` has to be provided.
             */
            public fun schemaName(schemaName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty.Builder =
                software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty.builder()

            /**
             * @param registryName The name of the registry where the schema is stored. Either
             *   `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
             */
            override fun registryName(registryName: String) {
                cdkBuilder.registryName(registryName)
            }

            /**
             * @param schemaArn The Amazon Resource Name (ARN) of the schema. Either `SchemaArn` ,
             *   or `SchemaName` and `RegistryName` has to be provided.
             */
            override fun schemaArn(schemaArn: String) {
                cdkBuilder.schemaArn(schemaArn)
            }

            /**
             * @param schemaName The name of the schema. Either `SchemaArn` , or `SchemaName` and
             *   `RegistryName` has to be provided.
             */
            override fun schemaName(schemaName: String) {
                cdkBuilder.schemaName(schemaName)
            }

            public fun build():
                software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty,
        ) : SchemaProperty {
            /**
             * The name of the registry where the schema is stored.
             *
             * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-registryname)
             */
            override fun registryName(): String? = unwrap(this).getRegistryName()

            /**
             * The Amazon Resource Name (ARN) of the schema.
             *
             * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-schemaarn)
             */
            override fun schemaArn(): String? = unwrap(this).getSchemaArn()

            /**
             * The name of the schema.
             *
             * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html#cfn-glue-schemaversion-schema-schemaname)
             */
            override fun schemaName(): String? = unwrap(this).getSchemaName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty
            ): SchemaProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SchemaProperty
            ): software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
