package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfiguredTable
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     */
    public open fun allowedColumns(): List<String> = unwrap(this).getAllowedColumns()

    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     */
    public open fun allowedColumns(`value`: List<String>) {
        unwrap(this).setAllowedColumns(`value`)
    }

    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     */
    public open fun allowedColumns(vararg `value`: String): Unit = allowedColumns(`value`.toList())

    /** The analysis method for the configured table. */
    public open fun analysisMethod(): String = unwrap(this).getAnalysisMethod()

    /** The analysis method for the configured table. */
    public open fun analysisMethod(`value`: String) {
        unwrap(this).setAnalysisMethod(`value`)
    }

    /** The entire created analysis rule. */
    public open fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

    /** The entire created analysis rule. */
    public open fun analysisRules(`value`: IResolvable) {
        unwrap(this).setAnalysisRules(`value`.let(IResolvable::unwrap))
    }

    /** The entire created analysis rule. */
    public open fun analysisRules(__idx_ac66f0: List<Any>) {
        unwrap(this).setAnalysisRules(__idx_ac66f0)
    }

    /** The entire created analysis rule. */
    public open fun analysisRules(vararg __idx_ac66f0: Any): Unit =
        analysisRules(__idx_ac66f0.toList())

    /**
     * Returns the Amazon Resource Name (ARN) of the specified configured table.
     *
     * Example:
     * `arn:aws:cleanrooms:us-east-1:111122223333:configuredtable/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Returns the unique identifier of the specified configured table.
     *
     * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
     */
    public open fun attrConfiguredTableIdentifier(): String =
        unwrap(this).getAttrConfiguredTableIdentifier()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** A description for the configured table. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description for the configured table. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A name for the configured table. */
    public open fun name(): String = unwrap(this).getName()

    /** A name for the configured table. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** The AWS Glue table that this configured table represents. */
    public open fun tableReference(): Any = unwrap(this).getTableReference()

    /** The AWS Glue table that this configured table represents. */
    public open fun tableReference(`value`: IResolvable) {
        unwrap(this).setTableReference(`value`.let(IResolvable::unwrap))
    }

    /** The AWS Glue table that this configured table represents. */
    public open fun tableReference(`value`: TableReferenceProperty) {
        unwrap(this).setTableReference(`value`.let(TableReferenceProperty::unwrap))
    }

    /** The AWS Glue table that this configured table represents. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4839bbb0b7a8e4db4d671fed6496347f1c920b201fde8594778c604acc4f4606")
    public open fun tableReference(`value`: TableReferenceProperty.Builder.() -> Unit): Unit =
        tableReference(TableReferenceProperty(`value`))

    /** An optional label that you can assign to a resource when you create it. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** An optional label that you can assign to a resource when you create it. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** An optional label that you can assign to a resource when you create it. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnConfiguredTable]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The columns within the underlying AWS Glue table that can be utilized within
         * collaborations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
         *
         * @param allowedColumns The columns within the underlying AWS Glue table that can be
         *   utilized within collaborations.
         */
        public fun allowedColumns(allowedColumns: List<String>)

        /**
         * The columns within the underlying AWS Glue table that can be utilized within
         * collaborations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
         *
         * @param allowedColumns The columns within the underlying AWS Glue table that can be
         *   utilized within collaborations.
         */
        public fun allowedColumns(vararg allowedColumns: String)

        /**
         * The analysis method for the configured table.
         *
         * The only valid value is currently `DIRECT_QUERY`.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysismethod)
         *
         * @param analysisMethod The analysis method for the configured table.
         */
        public fun analysisMethod(analysisMethod: String)

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        public fun analysisRules(analysisRules: IResolvable)

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        public fun analysisRules(analysisRules: List<Any>)

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        public fun analysisRules(vararg analysisRules: Any)

        /**
         * A description for the configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-description)
         *
         * @param description A description for the configured table.
         */
        public fun description(description: String)

        /**
         * A name for the configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-name)
         *
         * @param name A name for the configured table.
         */
        public fun name(name: String)

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        public fun tableReference(tableReference: IResolvable)

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        public fun tableReference(tableReference: TableReferenceProperty)

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ecc93edf43a16f86dba9d1e61f5caca0faf208cf696a67f7a196a38ef52bb4ff")
        public fun tableReference(tableReference: TableReferenceProperty.Builder.() -> Unit)

        /**
         * An optional label that you can assign to a resource when you create it.
         *
         * Each tag consists of a key and an optional value, both of which you define. When you use
         * tagging, you can also use tag-based access control in IAM policies to control access to
         * this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
         *
         * @param tags An optional label that you can assign to a resource when you create it.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An optional label that you can assign to a resource when you create it.
         *
         * Each tag consists of a key and an optional value, both of which you define. When you use
         * tagging, you can also use tag-based access control in IAM policies to control access to
         * this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
         *
         * @param tags An optional label that you can assign to a resource when you create it.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.Builder =
            software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.Builder.create(scope, id)

        /**
         * The columns within the underlying AWS Glue table that can be utilized within
         * collaborations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
         *
         * @param allowedColumns The columns within the underlying AWS Glue table that can be
         *   utilized within collaborations.
         */
        override fun allowedColumns(allowedColumns: List<String>) {
            cdkBuilder.allowedColumns(allowedColumns)
        }

        /**
         * The columns within the underlying AWS Glue table that can be utilized within
         * collaborations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
         *
         * @param allowedColumns The columns within the underlying AWS Glue table that can be
         *   utilized within collaborations.
         */
        override fun allowedColumns(vararg allowedColumns: String): Unit =
            allowedColumns(allowedColumns.toList())

        /**
         * The analysis method for the configured table.
         *
         * The only valid value is currently `DIRECT_QUERY`.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysismethod)
         *
         * @param analysisMethod The analysis method for the configured table.
         */
        override fun analysisMethod(analysisMethod: String) {
            cdkBuilder.analysisMethod(analysisMethod)
        }

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        override fun analysisRules(analysisRules: IResolvable) {
            cdkBuilder.analysisRules(analysisRules.let(IResolvable::unwrap))
        }

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        override fun analysisRules(analysisRules: List<Any>) {
            cdkBuilder.analysisRules(analysisRules)
        }

        /**
         * The entire created analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
         *
         * @param analysisRules The entire created analysis rule.
         */
        override fun analysisRules(vararg analysisRules: Any): Unit =
            analysisRules(analysisRules.toList())

        /**
         * A description for the configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-description)
         *
         * @param description A description for the configured table.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A name for the configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-name)
         *
         * @param name A name for the configured table.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        override fun tableReference(tableReference: IResolvable) {
            cdkBuilder.tableReference(tableReference.let(IResolvable::unwrap))
        }

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        override fun tableReference(tableReference: TableReferenceProperty) {
            cdkBuilder.tableReference(tableReference.let(TableReferenceProperty::unwrap))
        }

        /**
         * The AWS Glue table that this configured table represents.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
         *
         * @param tableReference The AWS Glue table that this configured table represents.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ecc93edf43a16f86dba9d1e61f5caca0faf208cf696a67f7a196a38ef52bb4ff")
        override fun tableReference(
            tableReference: TableReferenceProperty.Builder.() -> Unit
        ): Unit = tableReference(TableReferenceProperty(tableReference))

        /**
         * An optional label that you can assign to a resource when you create it.
         *
         * Each tag consists of a key and an optional value, both of which you define. When you use
         * tagging, you can also use tag-based access control in IAM policies to control access to
         * this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
         *
         * @param tags An optional label that you can assign to a resource when you create it.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An optional label that you can assign to a resource when you create it.
         *
         * Each tag consists of a key and an optional value, both of which you define. When you use
         * tagging, you can also use tag-based access control in IAM policies to control access to
         * this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
         *
         * @param tags An optional label that you can assign to a resource when you create it.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnConfiguredTable {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnConfiguredTable(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
        ): CfnConfiguredTable = CfnConfiguredTable(cdkObject)

        internal fun unwrap(
            wrapped: CfnConfiguredTable
        ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable = wrapped.cdkObject
    }

    public interface TableReferenceProperty {
        /**
         * If present, a reference to the AWS Glue table referred to by this table reference.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-tablereference.html#cfn-cleanrooms-configuredtable-tablereference-glue)
         */
        public fun glue(): Any

        /** A builder for [TableReferenceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            public fun glue(glue: IResolvable)

            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            public fun glue(glue: GlueTableReferenceProperty)

            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("db4f6a5ba6d28531ae58587a3a8dd814bc5df20896049b36a90d989f5dfa0f07")
            public fun glue(glue: GlueTableReferenceProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty
                    .builder()

            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            override fun glue(glue: IResolvable) {
                cdkBuilder.glue(glue.let(IResolvable::unwrap))
            }

            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            override fun glue(glue: GlueTableReferenceProperty) {
                cdkBuilder.glue(glue.let(GlueTableReferenceProperty::unwrap))
            }

            /**
             * @param glue If present, a reference to the AWS Glue table referred to by this table
             *   reference.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("db4f6a5ba6d28531ae58587a3a8dd814bc5df20896049b36a90d989f5dfa0f07")
            override fun glue(glue: GlueTableReferenceProperty.Builder.() -> Unit): Unit =
                glue(GlueTableReferenceProperty(glue))

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty,
        ) : TableReferenceProperty {
            /**
             * If present, a reference to the AWS Glue table referred to by this table reference.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-tablereference.html#cfn-cleanrooms-configuredtable-tablereference-glue)
             */
            override fun glue(): Any = unwrap(this).getGlue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TableReferenceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty
            ): TableReferenceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TableReferenceProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AggregationConstraintProperty {
        /**
         * Column in aggregation constraint for which there must be a minimum number of distinct
         * values in an output row for it to be in the query output.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-columnname)
         */
        public fun columnName(): String

        /**
         * The minimum number of distinct values that an output row must be an aggregation of.
         *
         * Minimum threshold of distinct values for a specified column that must exist in an output
         * row for it to be in the query output.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-minimum)
         */
        public fun minimum(): Number

        /**
         * The type of aggregation the constraint allows.
         *
         * The only valid value is currently `COUNT_DISTINCT`.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-type)
         */
        public fun type(): String

        /** A builder for [AggregationConstraintProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param columnName Column in aggregation constraint for which there must be a minimum
             *   number of distinct values in an output row for it to be in the query output.
             */
            public fun columnName(columnName: String)

            /**
             * @param minimum The minimum number of distinct values that an output row must be an
             *   aggregation of. Minimum threshold of distinct values for a specified column that
             *   must exist in an output row for it to be in the query output.
             */
            public fun minimum(minimum: Number)

            /**
             * @param type The type of aggregation the constraint allows. The only valid value is
             *   currently `COUNT_DISTINCT`.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .AggregationConstraintProperty
                    .builder()

            /**
             * @param columnName Column in aggregation constraint for which there must be a minimum
             *   number of distinct values in an output row for it to be in the query output.
             */
            override fun columnName(columnName: String) {
                cdkBuilder.columnName(columnName)
            }

            /**
             * @param minimum The minimum number of distinct values that an output row must be an
             *   aggregation of. Minimum threshold of distinct values for a specified column that
             *   must exist in an output row for it to be in the query output.
             */
            override fun minimum(minimum: Number) {
                cdkBuilder.minimum(minimum)
            }

            /**
             * @param type The type of aggregation the constraint allows. The only valid value is
             *   currently `COUNT_DISTINCT`.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty,
        ) : AggregationConstraintProperty {
            /**
             * Column in aggregation constraint for which there must be a minimum number of distinct
             * values in an output row for it to be in the query output.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-columnname)
             */
            override fun columnName(): String = unwrap(this).getColumnName()

            /**
             * The minimum number of distinct values that an output row must be an aggregation of.
             *
             * Minimum threshold of distinct values for a specified column that must exist in an
             * output row for it to be in the query output.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-minimum)
             */
            override fun minimum(): Number = unwrap(this).getMinimum()

            /**
             * The type of aggregation the constraint allows.
             *
             * The only valid value is currently `COUNT_DISTINCT`.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html#cfn-cleanrooms-configuredtable-aggregationconstraint-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AggregationConstraintProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty
            ): AggregationConstraintProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AggregationConstraintProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AnalysisRuleAggregationProperty {
        /**
         * The columns that query runners are allowed to use in aggregation queries.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-aggregatecolumns)
         */
        public fun aggregateColumns(): Any

        /**
         * Which logical operators (if any) are to be used in an INNER JOIN match condition.
         *
         * Default is `AND` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-allowedjoinoperators)
         */
        public fun allowedJoinOperators(): List<String> =
            unwrap(this).getAllowedJoinOperators() ?: emptyList()

        /**
         * The columns that query runners are allowed to select, group by, or filter by.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-dimensioncolumns)
         */
        public fun dimensionColumns(): List<String>

        /**
         * Columns in configured table that can be used in join statements and/or as aggregate
         * columns.
         *
         * They can never be outputted directly.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-joincolumns)
         */
        public fun joinColumns(): List<String>

        /**
         * Control that requires member who runs query to do a join with their configured table
         * and/or other configured table in query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-joinrequired)
         */
        public fun joinRequired(): String? = unwrap(this).getJoinRequired()

        /**
         * Columns that must meet a specific threshold value (after an aggregation function is
         * applied to it) for each output row to be returned.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-outputconstraints)
         */
        public fun outputConstraints(): Any

        /**
         * Set of scalar functions that are allowed to be used on dimension columns and the output
         * of aggregation of metrics.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-scalarfunctions)
         */
        public fun scalarFunctions(): List<String>

        /** A builder for [AnalysisRuleAggregationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            public fun aggregateColumns(aggregateColumns: IResolvable)

            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            public fun aggregateColumns(aggregateColumns: List<Any>)

            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            public fun aggregateColumns(vararg aggregateColumns: Any)

            /**
             * @param allowedJoinOperators Which logical operators (if any) are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            public fun allowedJoinOperators(allowedJoinOperators: List<String>)

            /**
             * @param allowedJoinOperators Which logical operators (if any) are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            public fun allowedJoinOperators(vararg allowedJoinOperators: String)

            /**
             * @param dimensionColumns The columns that query runners are allowed to select, group
             *   by, or filter by.
             */
            public fun dimensionColumns(dimensionColumns: List<String>)

            /**
             * @param dimensionColumns The columns that query runners are allowed to select, group
             *   by, or filter by.
             */
            public fun dimensionColumns(vararg dimensionColumns: String)

            /**
             * @param joinColumns Columns in configured table that can be used in join statements
             *   and/or as aggregate columns. They can never be outputted directly.
             */
            public fun joinColumns(joinColumns: List<String>)

            /**
             * @param joinColumns Columns in configured table that can be used in join statements
             *   and/or as aggregate columns. They can never be outputted directly.
             */
            public fun joinColumns(vararg joinColumns: String)

            /**
             * @param joinRequired Control that requires member who runs query to do a join with
             *   their configured table and/or other configured table in query.
             */
            public fun joinRequired(joinRequired: String)

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            public fun outputConstraints(outputConstraints: IResolvable)

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            public fun outputConstraints(outputConstraints: List<Any>)

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            public fun outputConstraints(vararg outputConstraints: Any)

            /**
             * @param scalarFunctions Set of scalar functions that are allowed to be used on
             *   dimension columns and the output of aggregation of metrics.
             */
            public fun scalarFunctions(scalarFunctions: List<String>)

            /**
             * @param scalarFunctions Set of scalar functions that are allowed to be used on
             *   dimension columns and the output of aggregation of metrics.
             */
            public fun scalarFunctions(vararg scalarFunctions: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .AnalysisRuleAggregationProperty
                    .builder()

            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            override fun aggregateColumns(aggregateColumns: IResolvable) {
                cdkBuilder.aggregateColumns(aggregateColumns.let(IResolvable::unwrap))
            }

            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            override fun aggregateColumns(aggregateColumns: List<Any>) {
                cdkBuilder.aggregateColumns(aggregateColumns)
            }

            /**
             * @param aggregateColumns The columns that query runners are allowed to use in
             *   aggregation queries.
             */
            override fun aggregateColumns(vararg aggregateColumns: Any): Unit =
                aggregateColumns(aggregateColumns.toList())

            /**
             * @param allowedJoinOperators Which logical operators (if any) are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            override fun allowedJoinOperators(allowedJoinOperators: List<String>) {
                cdkBuilder.allowedJoinOperators(allowedJoinOperators)
            }

            /**
             * @param allowedJoinOperators Which logical operators (if any) are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            override fun allowedJoinOperators(vararg allowedJoinOperators: String): Unit =
                allowedJoinOperators(allowedJoinOperators.toList())

            /**
             * @param dimensionColumns The columns that query runners are allowed to select, group
             *   by, or filter by.
             */
            override fun dimensionColumns(dimensionColumns: List<String>) {
                cdkBuilder.dimensionColumns(dimensionColumns)
            }

            /**
             * @param dimensionColumns The columns that query runners are allowed to select, group
             *   by, or filter by.
             */
            override fun dimensionColumns(vararg dimensionColumns: String): Unit =
                dimensionColumns(dimensionColumns.toList())

            /**
             * @param joinColumns Columns in configured table that can be used in join statements
             *   and/or as aggregate columns. They can never be outputted directly.
             */
            override fun joinColumns(joinColumns: List<String>) {
                cdkBuilder.joinColumns(joinColumns)
            }

            /**
             * @param joinColumns Columns in configured table that can be used in join statements
             *   and/or as aggregate columns. They can never be outputted directly.
             */
            override fun joinColumns(vararg joinColumns: String): Unit =
                joinColumns(joinColumns.toList())

            /**
             * @param joinRequired Control that requires member who runs query to do a join with
             *   their configured table and/or other configured table in query.
             */
            override fun joinRequired(joinRequired: String) {
                cdkBuilder.joinRequired(joinRequired)
            }

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            override fun outputConstraints(outputConstraints: IResolvable) {
                cdkBuilder.outputConstraints(outputConstraints.let(IResolvable::unwrap))
            }

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            override fun outputConstraints(outputConstraints: List<Any>) {
                cdkBuilder.outputConstraints(outputConstraints)
            }

            /**
             * @param outputConstraints Columns that must meet a specific threshold value (after an
             *   aggregation function is applied to it) for each output row to be returned.
             */
            override fun outputConstraints(vararg outputConstraints: Any): Unit =
                outputConstraints(outputConstraints.toList())

            /**
             * @param scalarFunctions Set of scalar functions that are allowed to be used on
             *   dimension columns and the output of aggregation of metrics.
             */
            override fun scalarFunctions(scalarFunctions: List<String>) {
                cdkBuilder.scalarFunctions(scalarFunctions)
            }

            /**
             * @param scalarFunctions Set of scalar functions that are allowed to be used on
             *   dimension columns and the output of aggregation of metrics.
             */
            override fun scalarFunctions(vararg scalarFunctions: String): Unit =
                scalarFunctions(scalarFunctions.toList())

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty,
        ) : AnalysisRuleAggregationProperty {
            /**
             * The columns that query runners are allowed to use in aggregation queries.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-aggregatecolumns)
             */
            override fun aggregateColumns(): Any = unwrap(this).getAggregateColumns()

            /**
             * Which logical operators (if any) are to be used in an INNER JOIN match condition.
             *
             * Default is `AND` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-allowedjoinoperators)
             */
            override fun allowedJoinOperators(): List<String> =
                unwrap(this).getAllowedJoinOperators() ?: emptyList()

            /**
             * The columns that query runners are allowed to select, group by, or filter by.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-dimensioncolumns)
             */
            override fun dimensionColumns(): List<String> = unwrap(this).getDimensionColumns()

            /**
             * Columns in configured table that can be used in join statements and/or as aggregate
             * columns.
             *
             * They can never be outputted directly.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-joincolumns)
             */
            override fun joinColumns(): List<String> = unwrap(this).getJoinColumns()

            /**
             * Control that requires member who runs query to do a join with their configured table
             * and/or other configured table in query.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-joinrequired)
             */
            override fun joinRequired(): String? = unwrap(this).getJoinRequired()

            /**
             * Columns that must meet a specific threshold value (after an aggregation function is
             * applied to it) for each output row to be returned.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-outputconstraints)
             */
            override fun outputConstraints(): Any = unwrap(this).getOutputConstraints()

            /**
             * Set of scalar functions that are allowed to be used on dimension columns and the
             * output of aggregation of metrics.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html#cfn-cleanrooms-configuredtable-analysisruleaggregation-scalarfunctions)
             */
            override fun scalarFunctions(): List<String> = unwrap(this).getScalarFunctions()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AnalysisRuleAggregationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty
            ): AnalysisRuleAggregationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AnalysisRuleAggregationProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AnalysisRuleCustomProperty {
        /**
         * The ARN of the analysis templates that are allowed by the custom analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html#cfn-cleanrooms-configuredtable-analysisrulecustom-allowedanalyses)
         */
        public fun allowedAnalyses(): List<String>

        /**
         * The IDs of the AWS accounts that are allowed to query by the custom analysis rule.
         *
         * Required when `allowedAnalyses` is `ANY_QUERY` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html#cfn-cleanrooms-configuredtable-analysisrulecustom-allowedanalysisproviders)
         */
        public fun allowedAnalysisProviders(): List<String> =
            unwrap(this).getAllowedAnalysisProviders() ?: emptyList()

        /** A builder for [AnalysisRuleCustomProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param allowedAnalyses The ARN of the analysis templates that are allowed by the
             *   custom analysis rule.
             */
            public fun allowedAnalyses(allowedAnalyses: List<String>)

            /**
             * @param allowedAnalyses The ARN of the analysis templates that are allowed by the
             *   custom analysis rule.
             */
            public fun allowedAnalyses(vararg allowedAnalyses: String)

            /**
             * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query
             *   by the custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
             */
            public fun allowedAnalysisProviders(allowedAnalysisProviders: List<String>)

            /**
             * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query
             *   by the custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
             */
            public fun allowedAnalysisProviders(vararg allowedAnalysisProviders: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .AnalysisRuleCustomProperty
                    .builder()

            /**
             * @param allowedAnalyses The ARN of the analysis templates that are allowed by the
             *   custom analysis rule.
             */
            override fun allowedAnalyses(allowedAnalyses: List<String>) {
                cdkBuilder.allowedAnalyses(allowedAnalyses)
            }

            /**
             * @param allowedAnalyses The ARN of the analysis templates that are allowed by the
             *   custom analysis rule.
             */
            override fun allowedAnalyses(vararg allowedAnalyses: String): Unit =
                allowedAnalyses(allowedAnalyses.toList())

            /**
             * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query
             *   by the custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
             */
            override fun allowedAnalysisProviders(allowedAnalysisProviders: List<String>) {
                cdkBuilder.allowedAnalysisProviders(allowedAnalysisProviders)
            }

            /**
             * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query
             *   by the custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
             */
            override fun allowedAnalysisProviders(vararg allowedAnalysisProviders: String): Unit =
                allowedAnalysisProviders(allowedAnalysisProviders.toList())

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty,
        ) : AnalysisRuleCustomProperty {
            /**
             * The ARN of the analysis templates that are allowed by the custom analysis rule.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html#cfn-cleanrooms-configuredtable-analysisrulecustom-allowedanalyses)
             */
            override fun allowedAnalyses(): List<String> = unwrap(this).getAllowedAnalyses()

            /**
             * The IDs of the AWS accounts that are allowed to query by the custom analysis rule.
             *
             * Required when `allowedAnalyses` is `ANY_QUERY` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html#cfn-cleanrooms-configuredtable-analysisrulecustom-allowedanalysisproviders)
             */
            override fun allowedAnalysisProviders(): List<String> =
                unwrap(this).getAllowedAnalysisProviders() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleCustomProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty
            ): AnalysisRuleCustomProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AnalysisRuleCustomProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AggregateColumnProperty {
        /**
         * Column names in configured table of aggregate columns.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html#cfn-cleanrooms-configuredtable-aggregatecolumn-columnnames)
         */
        public fun columnNames(): List<String>

        /**
         * Aggregation function that can be applied to aggregate column in query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html#cfn-cleanrooms-configuredtable-aggregatecolumn-function)
         */
        public fun function(): String

        /** A builder for [AggregateColumnProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param columnNames Column names in configured table of aggregate columns. */
            public fun columnNames(columnNames: List<String>)

            /** @param columnNames Column names in configured table of aggregate columns. */
            public fun columnNames(vararg columnNames: String)

            /**
             * @param function Aggregation function that can be applied to aggregate column in
             *   query.
             */
            public fun function(function: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .AggregateColumnProperty
                    .builder()

            /** @param columnNames Column names in configured table of aggregate columns. */
            override fun columnNames(columnNames: List<String>) {
                cdkBuilder.columnNames(columnNames)
            }

            /** @param columnNames Column names in configured table of aggregate columns. */
            override fun columnNames(vararg columnNames: String): Unit =
                columnNames(columnNames.toList())

            /**
             * @param function Aggregation function that can be applied to aggregate column in
             *   query.
             */
            override fun function(function: String) {
                cdkBuilder.function(function)
            }

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty,
        ) : AggregateColumnProperty {
            /**
             * Column names in configured table of aggregate columns.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html#cfn-cleanrooms-configuredtable-aggregatecolumn-columnnames)
             */
            override fun columnNames(): List<String> = unwrap(this).getColumnNames()

            /**
             * Aggregation function that can be applied to aggregate column in query.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html#cfn-cleanrooms-configuredtable-aggregatecolumn-function)
             */
            override fun function(): String = unwrap(this).getFunction()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AggregateColumnProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty
            ): AggregateColumnProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AggregateColumnProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ConfiguredTableAnalysisRulePolicyProperty {
        /**
         * Controls on the query specifications that can be run on a configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicy.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicy-v1)
         */
        public fun v1(): Any

        /** A builder for [ConfiguredTableAnalysisRulePolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            public fun v1(v1: IResolvable)

            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            public fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property)

            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5e94b83562724b240a08adee0ffd72a564528ea2c203a921ff233196cdddd8d6")
            public fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .ConfiguredTableAnalysisRulePolicyProperty
                    .builder()

            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            override fun v1(v1: IResolvable) {
                cdkBuilder.v1(v1.let(IResolvable::unwrap))
            }

            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            override fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property) {
                cdkBuilder.v1(v1.let(ConfiguredTableAnalysisRulePolicyV1Property::unwrap))
            }

            /**
             * @param v1 Controls on the query specifications that can be run on a configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5e94b83562724b240a08adee0ffd72a564528ea2c203a921ff233196cdddd8d6")
            override fun v1(
                v1: ConfiguredTableAnalysisRulePolicyV1Property.Builder.() -> Unit
            ): Unit = v1(ConfiguredTableAnalysisRulePolicyV1Property(v1))

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty,
        ) : ConfiguredTableAnalysisRulePolicyProperty {
            /**
             * Controls on the query specifications that can be run on a configured table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicy.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicy-v1)
             */
            override fun v1(): Any = unwrap(this).getV1()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ConfiguredTableAnalysisRulePolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty
            ): ConfiguredTableAnalysisRulePolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConfiguredTableAnalysisRulePolicyProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GlueTableReferenceProperty {
        /**
         * The name of the database the AWS Glue table belongs to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html#cfn-cleanrooms-configuredtable-gluetablereference-databasename)
         */
        public fun databaseName(): String

        /**
         * The name of the AWS Glue table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html#cfn-cleanrooms-configuredtable-gluetablereference-tablename)
         */
        public fun tableName(): String

        /** A builder for [GlueTableReferenceProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param databaseName The name of the database the AWS Glue table belongs to. */
            public fun databaseName(databaseName: String)

            /** @param tableName The name of the AWS Glue table. */
            public fun tableName(tableName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .GlueTableReferenceProperty
                    .builder()

            /** @param databaseName The name of the database the AWS Glue table belongs to. */
            override fun databaseName(databaseName: String) {
                cdkBuilder.databaseName(databaseName)
            }

            /** @param tableName The name of the AWS Glue table. */
            override fun tableName(tableName: String) {
                cdkBuilder.tableName(tableName)
            }

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty,
        ) : GlueTableReferenceProperty {
            /**
             * The name of the database the AWS Glue table belongs to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html#cfn-cleanrooms-configuredtable-gluetablereference-databasename)
             */
            override fun databaseName(): String = unwrap(this).getDatabaseName()

            /**
             * The name of the AWS Glue table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html#cfn-cleanrooms-configuredtable-gluetablereference-tablename)
             */
            override fun tableName(): String = unwrap(this).getTableName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GlueTableReferenceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty
            ): GlueTableReferenceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GlueTableReferenceProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AnalysisRuleListProperty {
        /**
         * The logical operators (if any) that are to be used in an INNER JOIN match condition.
         *
         * Default is `AND` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-allowedjoinoperators)
         */
        public fun allowedJoinOperators(): List<String> =
            unwrap(this).getAllowedJoinOperators() ?: emptyList()

        /**
         * Columns that can be used to join a configured table with the table of the member who can
         * query and other members' configured tables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-joincolumns)
         */
        public fun joinColumns(): List<String>

        /**
         * Columns that can be listed in the output.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-listcolumns)
         */
        public fun listColumns(): List<String>

        /** A builder for [AnalysisRuleListProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param allowedJoinOperators The logical operators (if any) that are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            public fun allowedJoinOperators(allowedJoinOperators: List<String>)

            /**
             * @param allowedJoinOperators The logical operators (if any) that are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            public fun allowedJoinOperators(vararg allowedJoinOperators: String)

            /**
             * @param joinColumns Columns that can be used to join a configured table with the table
             *   of the member who can query and other members' configured tables.
             */
            public fun joinColumns(joinColumns: List<String>)

            /**
             * @param joinColumns Columns that can be used to join a configured table with the table
             *   of the member who can query and other members' configured tables.
             */
            public fun joinColumns(vararg joinColumns: String)

            /** @param listColumns Columns that can be listed in the output. */
            public fun listColumns(listColumns: List<String>)

            /** @param listColumns Columns that can be listed in the output. */
            public fun listColumns(vararg listColumns: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .AnalysisRuleListProperty
                    .builder()

            /**
             * @param allowedJoinOperators The logical operators (if any) that are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            override fun allowedJoinOperators(allowedJoinOperators: List<String>) {
                cdkBuilder.allowedJoinOperators(allowedJoinOperators)
            }

            /**
             * @param allowedJoinOperators The logical operators (if any) that are to be used in an
             *   INNER JOIN match condition. Default is `AND` .
             */
            override fun allowedJoinOperators(vararg allowedJoinOperators: String): Unit =
                allowedJoinOperators(allowedJoinOperators.toList())

            /**
             * @param joinColumns Columns that can be used to join a configured table with the table
             *   of the member who can query and other members' configured tables.
             */
            override fun joinColumns(joinColumns: List<String>) {
                cdkBuilder.joinColumns(joinColumns)
            }

            /**
             * @param joinColumns Columns that can be used to join a configured table with the table
             *   of the member who can query and other members' configured tables.
             */
            override fun joinColumns(vararg joinColumns: String): Unit =
                joinColumns(joinColumns.toList())

            /** @param listColumns Columns that can be listed in the output. */
            override fun listColumns(listColumns: List<String>) {
                cdkBuilder.listColumns(listColumns)
            }

            /** @param listColumns Columns that can be listed in the output. */
            override fun listColumns(vararg listColumns: String): Unit =
                listColumns(listColumns.toList())

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty,
        ) : AnalysisRuleListProperty {
            /**
             * The logical operators (if any) that are to be used in an INNER JOIN match condition.
             *
             * Default is `AND` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-allowedjoinoperators)
             */
            override fun allowedJoinOperators(): List<String> =
                unwrap(this).getAllowedJoinOperators() ?: emptyList()

            /**
             * Columns that can be used to join a configured table with the table of the member who
             * can query and other members' configured tables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-joincolumns)
             */
            override fun joinColumns(): List<String> = unwrap(this).getJoinColumns()

            /**
             * Columns that can be listed in the output.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html#cfn-cleanrooms-configuredtable-analysisrulelist-listcolumns)
             */
            override fun listColumns(): List<String> = unwrap(this).getListColumns()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleListProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty
            ): AnalysisRuleListProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AnalysisRuleListProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AnalysisRuleProperty {
        /**
         * A policy that describes the associated data usage limitations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrule.html#cfn-cleanrooms-configuredtable-analysisrule-policy)
         */
        public fun policy(): Any

        /**
         * The type of analysis rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrule.html#cfn-cleanrooms-configuredtable-analysisrule-type)
         */
        public fun type(): String

        /** A builder for [AnalysisRuleProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param policy A policy that describes the associated data usage limitations. */
            public fun policy(policy: IResolvable)

            /** @param policy A policy that describes the associated data usage limitations. */
            public fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty)

            /** @param policy A policy that describes the associated data usage limitations. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4e21ec50cfa5d777cdb4939ff81a5ad2e67ac32d06971c6437a8690e1a5ca72c")
            public fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty.Builder.() -> Unit)

            /** @param type The type of analysis rule. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty
                    .builder()

            /** @param policy A policy that describes the associated data usage limitations. */
            override fun policy(policy: IResolvable) {
                cdkBuilder.policy(policy.let(IResolvable::unwrap))
            }

            /** @param policy A policy that describes the associated data usage limitations. */
            override fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty) {
                cdkBuilder.policy(policy.let(ConfiguredTableAnalysisRulePolicyProperty::unwrap))
            }

            /** @param policy A policy that describes the associated data usage limitations. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4e21ec50cfa5d777cdb4939ff81a5ad2e67ac32d06971c6437a8690e1a5ca72c")
            override fun policy(
                policy: ConfiguredTableAnalysisRulePolicyProperty.Builder.() -> Unit
            ): Unit = policy(ConfiguredTableAnalysisRulePolicyProperty(policy))

            /** @param type The type of analysis rule. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty,
        ) : AnalysisRuleProperty {
            /**
             * A policy that describes the associated data usage limitations.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrule.html#cfn-cleanrooms-configuredtable-analysisrule-policy)
             */
            override fun policy(): Any = unwrap(this).getPolicy()

            /**
             * The type of analysis rule.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrule.html#cfn-cleanrooms-configuredtable-analysisrule-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty
            ): AnalysisRuleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AnalysisRuleProperty
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ConfiguredTableAnalysisRulePolicyV1Property {
        /**
         * Analysis rule type that enables only aggregation queries on a configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-aggregation)
         */
        public fun aggregation(): Any? = unwrap(this).getAggregation()

        /**
         * Analysis rule type that enables custom SQL queries on a configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-custom)
         */
        public fun custom(): Any? = unwrap(this).getCustom()

        /**
         * Analysis rule type that enables only list queries on a configured table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-list)
         */
        public fun list(): Any? = unwrap(this).getList()

        /** A builder for [ConfiguredTableAnalysisRulePolicyV1Property] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            public fun aggregation(aggregation: IResolvable)

            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            public fun aggregation(aggregation: AnalysisRuleAggregationProperty)

            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("71df3457cfbad5482336d956bec1132cb725114f18aa1d54295766d90ebaf374")
            public fun aggregation(aggregation: AnalysisRuleAggregationProperty.Builder.() -> Unit)

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            public fun custom(custom: IResolvable)

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            public fun custom(custom: AnalysisRuleCustomProperty)

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("77a08e90fa87700b479f28119cb3c92f924c18b384ef191db8b53323e50405c2")
            public fun custom(custom: AnalysisRuleCustomProperty.Builder.() -> Unit)

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            public fun list(list: IResolvable)

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            public fun list(list: AnalysisRuleListProperty)

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("207750a3f78c8b1bf272a370e868e6b9098a56878a4eaddee147ed2a72ac0a63")
            public fun list(list: AnalysisRuleListProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property.Builder =
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
                    .ConfiguredTableAnalysisRulePolicyV1Property
                    .builder()

            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            override fun aggregation(aggregation: IResolvable) {
                cdkBuilder.aggregation(aggregation.let(IResolvable::unwrap))
            }

            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            override fun aggregation(aggregation: AnalysisRuleAggregationProperty) {
                cdkBuilder.aggregation(aggregation.let(AnalysisRuleAggregationProperty::unwrap))
            }

            /**
             * @param aggregation Analysis rule type that enables only aggregation queries on a
             *   configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("71df3457cfbad5482336d956bec1132cb725114f18aa1d54295766d90ebaf374")
            override fun aggregation(
                aggregation: AnalysisRuleAggregationProperty.Builder.() -> Unit
            ): Unit = aggregation(AnalysisRuleAggregationProperty(aggregation))

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            override fun custom(custom: IResolvable) {
                cdkBuilder.custom(custom.let(IResolvable::unwrap))
            }

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            override fun custom(custom: AnalysisRuleCustomProperty) {
                cdkBuilder.custom(custom.let(AnalysisRuleCustomProperty::unwrap))
            }

            /**
             * @param custom Analysis rule type that enables custom SQL queries on a configured
             *   table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("77a08e90fa87700b479f28119cb3c92f924c18b384ef191db8b53323e50405c2")
            override fun custom(custom: AnalysisRuleCustomProperty.Builder.() -> Unit): Unit =
                custom(AnalysisRuleCustomProperty(custom))

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            override fun list(list: IResolvable) {
                cdkBuilder.list(list.let(IResolvable::unwrap))
            }

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            override fun list(list: AnalysisRuleListProperty) {
                cdkBuilder.list(list.let(AnalysisRuleListProperty::unwrap))
            }

            /**
             * @param list Analysis rule type that enables only list queries on a configured table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("207750a3f78c8b1bf272a370e868e6b9098a56878a4eaddee147ed2a72ac0a63")
            override fun list(list: AnalysisRuleListProperty.Builder.() -> Unit): Unit =
                list(AnalysisRuleListProperty(list))

            public fun build():
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property,
        ) : ConfiguredTableAnalysisRulePolicyV1Property {
            /**
             * Analysis rule type that enables only aggregation queries on a configured table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-aggregation)
             */
            override fun aggregation(): Any? = unwrap(this).getAggregation()

            /**
             * Analysis rule type that enables custom SQL queries on a configured table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-custom)
             */
            override fun custom(): Any? = unwrap(this).getCustom()

            /**
             * Analysis rule type that enables only list queries on a configured table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1-list)
             */
            override fun list(): Any? = unwrap(this).getList()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ConfiguredTableAnalysisRulePolicyV1Property {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property
            ): ConfiguredTableAnalysisRulePolicyV1Property = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConfiguredTableAnalysisRulePolicyV1Property
            ): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property =
                (wrapped as Wrapper).cdkObject
        }
    }
}
