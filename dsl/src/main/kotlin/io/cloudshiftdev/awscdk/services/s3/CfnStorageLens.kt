package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStorageLens
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * This property contains the details of the ARN of the S3 Storage Lens configuration.
     *
     * This property is read-only.
     */
    public open fun attrStorageLensConfigurationStorageLensArn(): String =
        unwrap(this).getAttrStorageLensConfigurationStorageLensArn()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** This resource contains the details Amazon S3 Storage Lens configuration. */
    public open fun storageLensConfiguration(): Any = unwrap(this).getStorageLensConfiguration()

    /** This resource contains the details Amazon S3 Storage Lens configuration. */
    public open fun storageLensConfiguration(`value`: IResolvable) {
        unwrap(this).setStorageLensConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** This resource contains the details Amazon S3 Storage Lens configuration. */
    public open fun storageLensConfiguration(`value`: StorageLensConfigurationProperty) {
        unwrap(this)
            .setStorageLensConfiguration(`value`.let(StorageLensConfigurationProperty::unwrap))
    }

    /** This resource contains the details Amazon S3 Storage Lens configuration. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af36521c63e87fc8f57727080acc348121bfed0249356bfe17b3ee745c672ce0")
    public open fun storageLensConfiguration(
        `value`: StorageLensConfigurationProperty.Builder.() -> Unit
    ): Unit = storageLensConfiguration(StorageLensConfigurationProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A set of tags (key–value pairs) to associate with the Storage Lens configuration. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A set of tags (key–value pairs) to associate with the Storage Lens configuration. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A set of tags (key–value pairs) to associate with the Storage Lens configuration. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnStorageLens]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        public fun storageLensConfiguration(storageLensConfiguration: IResolvable)

        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        public fun storageLensConfiguration(
            storageLensConfiguration: StorageLensConfigurationProperty
        )

        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("960366e56cfb52b7b29fd2fe98258961a06b76e64d2fd998fb4c2e2682a0338e")
        public fun storageLensConfiguration(
            storageLensConfiguration: StorageLensConfigurationProperty.Builder.() -> Unit
        )

        /**
         * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
         *
         * @param tags A set of tags (key–value pairs) to associate with the Storage Lens
         *   configuration.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
         *
         * @param tags A set of tags (key–value pairs) to associate with the Storage Lens
         *   configuration.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLens.Builder =
            software.amazon.awscdk.services.s3.CfnStorageLens.Builder.create(scope, id)

        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        override fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
            cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(IResolvable::unwrap))
        }

        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        override fun storageLensConfiguration(
            storageLensConfiguration: StorageLensConfigurationProperty
        ) {
            cdkBuilder.storageLensConfiguration(
                storageLensConfiguration.let(StorageLensConfigurationProperty::unwrap)
            )
        }

        /**
         * This resource contains the details Amazon S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
         *
         * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
         *   configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("960366e56cfb52b7b29fd2fe98258961a06b76e64d2fd998fb4c2e2682a0338e")
        override fun storageLensConfiguration(
            storageLensConfiguration: StorageLensConfigurationProperty.Builder.() -> Unit
        ): Unit =
            storageLensConfiguration(StorageLensConfigurationProperty(storageLensConfiguration))

        /**
         * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
         *
         * @param tags A set of tags (key–value pairs) to associate with the Storage Lens
         *   configuration.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
         *
         * @param tags A set of tags (key–value pairs) to associate with the Storage Lens
         *   configuration.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStorageLens {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStorageLens(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens
        ): CfnStorageLens = CfnStorageLens(cdkObject)

        internal fun unwrap(
            wrapped: CfnStorageLens
        ): software.amazon.awscdk.services.s3.CfnStorageLens = wrapped.cdkObject
    }

    public interface SelectionCriteriaProperty {
        /**
         * This property contains the details of the S3 Storage Lens delimiter being used.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-delimiter)
         */
        public fun delimiter(): String? = unwrap(this).getDelimiter()

        /**
         * This property contains the details of the max depth that S3 Storage Lens will collect
         * metrics up to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-maxdepth)
         */
        public fun maxDepth(): Number? = unwrap(this).getMaxDepth()

        /**
         * This property contains the details of the minimum storage bytes percentage threshold that
         * S3 Storage Lens will collect metrics up to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-minstoragebytespercentage)
         */
        public fun minStorageBytesPercentage(): Number? =
            unwrap(this).getMinStorageBytesPercentage()

        /** A builder for [SelectionCriteriaProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param delimiter This property contains the details of the S3 Storage Lens delimiter
             *   being used.
             */
            public fun delimiter(delimiter: String)

            /**
             * @param maxDepth This property contains the details of the max depth that S3 Storage
             *   Lens will collect metrics up to.
             */
            public fun maxDepth(maxDepth: Number)

            /**
             * @param minStorageBytesPercentage This property contains the details of the minimum
             *   storage bytes percentage threshold that S3 Storage Lens will collect metrics up to.
             */
            public fun minStorageBytesPercentage(minStorageBytesPercentage: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty
                    .builder()

            /**
             * @param delimiter This property contains the details of the S3 Storage Lens delimiter
             *   being used.
             */
            override fun delimiter(delimiter: String) {
                cdkBuilder.delimiter(delimiter)
            }

            /**
             * @param maxDepth This property contains the details of the max depth that S3 Storage
             *   Lens will collect metrics up to.
             */
            override fun maxDepth(maxDepth: Number) {
                cdkBuilder.maxDepth(maxDepth)
            }

            /**
             * @param minStorageBytesPercentage This property contains the details of the minimum
             *   storage bytes percentage threshold that S3 Storage Lens will collect metrics up to.
             */
            override fun minStorageBytesPercentage(minStorageBytesPercentage: Number) {
                cdkBuilder.minStorageBytesPercentage(minStorageBytesPercentage)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty,
        ) : SelectionCriteriaProperty {
            /**
             * This property contains the details of the S3 Storage Lens delimiter being used.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-delimiter)
             */
            override fun delimiter(): String? = unwrap(this).getDelimiter()

            /**
             * This property contains the details of the max depth that S3 Storage Lens will collect
             * metrics up to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-maxdepth)
             */
            override fun maxDepth(): Number? = unwrap(this).getMaxDepth()

            /**
             * This property contains the details of the minimum storage bytes percentage threshold
             * that S3 Storage Lens will collect metrics up to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html#cfn-s3-storagelens-selectioncriteria-minstoragebytespercentage)
             */
            override fun minStorageBytesPercentage(): Number? =
                unwrap(this).getMinStorageBytesPercentage()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SelectionCriteriaProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty
            ): SelectionCriteriaProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SelectionCriteriaProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BucketLevelProperty {
        /**
         * A property for bucket-level activity metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-activitymetrics)
         */
        public fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

        /**
         * A property for bucket-level advanced cost optimization metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-advancedcostoptimizationmetrics)
         */
        public fun advancedCostOptimizationMetrics(): Any? =
            unwrap(this).getAdvancedCostOptimizationMetrics()

        /**
         * A property for bucket-level advanced data protection metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-advanceddataprotectionmetrics)
         */
        public fun advancedDataProtectionMetrics(): Any? =
            unwrap(this).getAdvancedDataProtectionMetrics()

        /**
         * A property for bucket-level detailed status code metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-detailedstatuscodesmetrics)
         */
        public fun detailedStatusCodesMetrics(): Any? = unwrap(this).getDetailedStatusCodesMetrics()

        /**
         * A property for bucket-level prefix-level storage metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-prefixlevel)
         */
        public fun prefixLevel(): Any? = unwrap(this).getPrefixLevel()

        /** A builder for [BucketLevelProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            public fun activityMetrics(activityMetrics: IResolvable)

            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            public fun activityMetrics(activityMetrics: ActivityMetricsProperty)

            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fe47765aadaaea41205a15bf3a06dbc19951c9ad9203f4a144e6f6c7d80b9f14")
            public fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit)

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable)

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            public fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty
            )

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d80440846b1119c591429c7efdb10b1bc3cc2f6054f9781a4895937003bbf37c")
            public fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics:
                    AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable)

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            public fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty
            )

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("20e86db47d0fc896c602d9a348093d28716c0dd641fa66a8f6caa23fcc964f21")
            public fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics:
                    AdvancedDataProtectionMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable)

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            public fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty
            )

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6f53994ad2c2a46cb8ab31926fca9652e25fce1b2fb07336c4ac0b5193e28ea2")
            public fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            public fun prefixLevel(prefixLevel: IResolvable)

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            public fun prefixLevel(prefixLevel: PrefixLevelProperty)

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("98aa57ca324ca3366fb37329b78060f5a9aaf872aa86b82233a116215da6f19c")
            public fun prefixLevel(prefixLevel: PrefixLevelProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty.builder()

            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            override fun activityMetrics(activityMetrics: IResolvable) {
                cdkBuilder.activityMetrics(activityMetrics.let(IResolvable::unwrap))
            }

            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            override fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
                cdkBuilder.activityMetrics(activityMetrics.let(ActivityMetricsProperty::unwrap))
            }

            /**
             * @param activityMetrics A property for bucket-level activity metrics for S3 Storage
             *   Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fe47765aadaaea41205a15bf3a06dbc19951c9ad9203f4a144e6f6c7d80b9f14")
            override fun activityMetrics(
                activityMetrics: ActivityMetricsProperty.Builder.() -> Unit
            ): Unit = activityMetrics(ActivityMetricsProperty(activityMetrics))

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: IResolvable
            ) {
                cdkBuilder.advancedCostOptimizationMetrics(
                    advancedCostOptimizationMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty
            ) {
                cdkBuilder.advancedCostOptimizationMetrics(
                    advancedCostOptimizationMetrics.let(
                        AdvancedCostOptimizationMetricsProperty::unwrap
                    )
                )
            }

            /**
             * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost
             *   optimization metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d80440846b1119c591429c7efdb10b1bc3cc2f6054f9781a4895937003bbf37c")
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics:
                    AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit
            ): Unit =
                advancedCostOptimizationMetrics(
                    AdvancedCostOptimizationMetricsProperty(advancedCostOptimizationMetrics)
                )

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            override fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
                cdkBuilder.advancedDataProtectionMetrics(
                    advancedDataProtectionMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            override fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty
            ) {
                cdkBuilder.advancedDataProtectionMetrics(
                    advancedDataProtectionMetrics.let(AdvancedDataProtectionMetricsProperty::unwrap)
                )
            }

            /**
             * @param advancedDataProtectionMetrics A property for bucket-level advanced data
             *   protection metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("20e86db47d0fc896c602d9a348093d28716c0dd641fa66a8f6caa23fcc964f21")
            override fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics:
                    AdvancedDataProtectionMetricsProperty.Builder.() -> Unit
            ): Unit =
                advancedDataProtectionMetrics(
                    AdvancedDataProtectionMetricsProperty(advancedDataProtectionMetrics)
                )

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            override fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
                cdkBuilder.detailedStatusCodesMetrics(
                    detailedStatusCodesMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            override fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty
            ) {
                cdkBuilder.detailedStatusCodesMetrics(
                    detailedStatusCodesMetrics.let(DetailedStatusCodesMetricsProperty::unwrap)
                )
            }

            /**
             * @param detailedStatusCodesMetrics A property for bucket-level detailed status code
             *   metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6f53994ad2c2a46cb8ab31926fca9652e25fce1b2fb07336c4ac0b5193e28ea2")
            override fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit
            ): Unit =
                detailedStatusCodesMetrics(
                    DetailedStatusCodesMetricsProperty(detailedStatusCodesMetrics)
                )

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            override fun prefixLevel(prefixLevel: IResolvable) {
                cdkBuilder.prefixLevel(prefixLevel.let(IResolvable::unwrap))
            }

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            override fun prefixLevel(prefixLevel: PrefixLevelProperty) {
                cdkBuilder.prefixLevel(prefixLevel.let(PrefixLevelProperty::unwrap))
            }

            /**
             * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3
             *   Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("98aa57ca324ca3366fb37329b78060f5a9aaf872aa86b82233a116215da6f19c")
            override fun prefixLevel(prefixLevel: PrefixLevelProperty.Builder.() -> Unit): Unit =
                prefixLevel(PrefixLevelProperty(prefixLevel))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty,
        ) : BucketLevelProperty {
            /**
             * A property for bucket-level activity metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-activitymetrics)
             */
            override fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

            /**
             * A property for bucket-level advanced cost optimization metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-advancedcostoptimizationmetrics)
             */
            override fun advancedCostOptimizationMetrics(): Any? =
                unwrap(this).getAdvancedCostOptimizationMetrics()

            /**
             * A property for bucket-level advanced data protection metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-advanceddataprotectionmetrics)
             */
            override fun advancedDataProtectionMetrics(): Any? =
                unwrap(this).getAdvancedDataProtectionMetrics()

            /**
             * A property for bucket-level detailed status code metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-detailedstatuscodesmetrics)
             */
            override fun detailedStatusCodesMetrics(): Any? =
                unwrap(this).getDetailedStatusCodesMetrics()

            /**
             * A property for bucket-level prefix-level storage metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html#cfn-s3-storagelens-bucketlevel-prefixlevel)
             */
            override fun prefixLevel(): Any? = unwrap(this).getPrefixLevel()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): BucketLevelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty
            ): BucketLevelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BucketLevelProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StorageLensGroupLevelProperty {
        /**
         * This property indicates which Storage Lens group ARNs to include or exclude in the
         * Storage Lens group aggregation.
         *
         * If this value is left null, then all Storage Lens groups are selected.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgrouplevel.html#cfn-s3-storagelens-storagelensgrouplevel-storagelensgroupselectioncriteria)
         */
        public fun storageLensGroupSelectionCriteria(): Any? =
            unwrap(this).getStorageLensGroupSelectionCriteria()

        /** A builder for [StorageLensGroupLevelProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            public fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria: IResolvable
            )

            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            public fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty
            )

            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3e83137ab128c7708bbd78104bb20f96d86b6b0a15ebd055f7b3c5eb356ca77b")
            public fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria:
                    StorageLensGroupSelectionCriteriaProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty
                    .builder()

            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            override fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria: IResolvable
            ) {
                cdkBuilder.storageLensGroupSelectionCriteria(
                    storageLensGroupSelectionCriteria.let(IResolvable::unwrap)
                )
            }

            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            override fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty
            ) {
                cdkBuilder.storageLensGroupSelectionCriteria(
                    storageLensGroupSelectionCriteria.let(
                        StorageLensGroupSelectionCriteriaProperty::unwrap
                    )
                )
            }

            /**
             * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens
             *   group ARNs to include or exclude in the Storage Lens group aggregation. If this
             *   value is left null, then all Storage Lens groups are selected.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3e83137ab128c7708bbd78104bb20f96d86b6b0a15ebd055f7b3c5eb356ca77b")
            override fun storageLensGroupSelectionCriteria(
                storageLensGroupSelectionCriteria:
                    StorageLensGroupSelectionCriteriaProperty.Builder.() -> Unit
            ): Unit =
                storageLensGroupSelectionCriteria(
                    StorageLensGroupSelectionCriteriaProperty(storageLensGroupSelectionCriteria)
                )

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty,
        ) : StorageLensGroupLevelProperty {
            /**
             * This property indicates which Storage Lens group ARNs to include or exclude in the
             * Storage Lens group aggregation.
             *
             * If this value is left null, then all Storage Lens groups are selected.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgrouplevel.html#cfn-s3-storagelens-storagelensgrouplevel-storagelensgroupselectioncriteria)
             */
            override fun storageLensGroupSelectionCriteria(): Any? =
                unwrap(this).getStorageLensGroupSelectionCriteria()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): StorageLensGroupLevelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty
            ): StorageLensGroupLevelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StorageLensGroupLevelProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AdvancedCostOptimizationMetricsProperty {
        /**
         * Indicates whether advanced cost optimization metrics are enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advancedcostoptimizationmetrics.html#cfn-s3-storagelens-advancedcostoptimizationmetrics-isenabled)
         */
        public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

        /** A builder for [AdvancedCostOptimizationMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
             */
            public fun isEnabled(isEnabled: Boolean)

            /**
             * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
             */
            public fun isEnabled(isEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens
                    .AdvancedCostOptimizationMetricsProperty
                    .builder()

            /**
             * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
             */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /**
             * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
             */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty,
        ) : AdvancedCostOptimizationMetricsProperty {
            /**
             * Indicates whether advanced cost optimization metrics are enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advancedcostoptimizationmetrics.html#cfn-s3-storagelens-advancedcostoptimizationmetrics-isenabled)
             */
            override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AdvancedCostOptimizationMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty
            ): AdvancedCostOptimizationMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AdvancedCostOptimizationMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SSEKMSProperty {
        /**
         * Specifies the Amazon Resource Name (ARN) of the customer managed AWS KMS key to use for
         * encrypting the S3 Storage Lens metrics export file.
         *
         * Amazon S3 only supports symmetric encryption keys. For more information, see
         * [Special-purpose keys](https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-ssekms.html#cfn-s3-storagelens-ssekms-keyid)
         */
        public fun keyId(): String

        /** A builder for [SSEKMSProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param keyId Specifies the Amazon Resource Name (ARN) of the customer managed AWS KMS
             *   key to use for encrypting the S3 Storage Lens metrics export file. Amazon S3 only
             *   supports symmetric encryption keys. For more information, see
             *   [Special-purpose keys](https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html)
             *   in the *AWS Key Management Service Developer Guide* .
             */
            public fun keyId(keyId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty.builder()

            /**
             * @param keyId Specifies the Amazon Resource Name (ARN) of the customer managed AWS KMS
             *   key to use for encrypting the S3 Storage Lens metrics export file. Amazon S3 only
             *   supports symmetric encryption keys. For more information, see
             *   [Special-purpose keys](https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html)
             *   in the *AWS Key Management Service Developer Guide* .
             */
            override fun keyId(keyId: String) {
                cdkBuilder.keyId(keyId)
            }

            public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty,
        ) : SSEKMSProperty {
            /**
             * Specifies the Amazon Resource Name (ARN) of the customer managed AWS KMS key to use
             * for encrypting the S3 Storage Lens metrics export file.
             *
             * Amazon S3 only supports symmetric encryption keys. For more information, see
             * [Special-purpose keys](https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html)
             * in the *AWS Key Management Service Developer Guide* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-ssekms.html#cfn-s3-storagelens-ssekms-keyid)
             */
            override fun keyId(): String = unwrap(this).getKeyId()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SSEKMSProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty
            ): SSEKMSProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SSEKMSProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AdvancedDataProtectionMetricsProperty {
        /**
         * Indicates whether advanced data protection metrics are enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advanceddataprotectionmetrics.html#cfn-s3-storagelens-advanceddataprotectionmetrics-isenabled)
         */
        public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

        /** A builder for [AdvancedDataProtectionMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param isEnabled Indicates whether advanced data protection metrics are enabled. */
            public fun isEnabled(isEnabled: Boolean)

            /** @param isEnabled Indicates whether advanced data protection metrics are enabled. */
            public fun isEnabled(isEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens
                    .AdvancedDataProtectionMetricsProperty
                    .builder()

            /** @param isEnabled Indicates whether advanced data protection metrics are enabled. */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /** @param isEnabled Indicates whether advanced data protection metrics are enabled. */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty,
        ) : AdvancedDataProtectionMetricsProperty {
            /**
             * Indicates whether advanced data protection metrics are enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advanceddataprotectionmetrics.html#cfn-s3-storagelens-advanceddataprotectionmetrics-isenabled)
             */
            override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AdvancedDataProtectionMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty
            ): AdvancedDataProtectionMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AdvancedDataProtectionMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PrefixLevelStorageMetricsProperty {
        /**
         * This property identifies whether the details of the prefix-level storage metrics for S3
         * Storage Lens are enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html#cfn-s3-storagelens-prefixlevelstoragemetrics-isenabled)
         */
        public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

        /**
         * This property identifies whether the details of the prefix-level storage metrics for S3
         * Storage Lens are enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html#cfn-s3-storagelens-prefixlevelstoragemetrics-selectioncriteria)
         */
        public fun selectionCriteria(): Any? = unwrap(this).getSelectionCriteria()

        /** A builder for [PrefixLevelStorageMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param isEnabled This property identifies whether the details of the prefix-level
             *   storage metrics for S3 Storage Lens are enabled.
             */
            public fun isEnabled(isEnabled: Boolean)

            /**
             * @param isEnabled This property identifies whether the details of the prefix-level
             *   storage metrics for S3 Storage Lens are enabled.
             */
            public fun isEnabled(isEnabled: IResolvable)

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            public fun selectionCriteria(selectionCriteria: IResolvable)

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            public fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty)

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("30c8d88fa709aba8706e56b8e607183d0292254c2baef744b2fd6f14e96d6d8b")
            public fun selectionCriteria(
                selectionCriteria: SelectionCriteriaProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty
                    .builder()

            /**
             * @param isEnabled This property identifies whether the details of the prefix-level
             *   storage metrics for S3 Storage Lens are enabled.
             */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /**
             * @param isEnabled This property identifies whether the details of the prefix-level
             *   storage metrics for S3 Storage Lens are enabled.
             */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            override fun selectionCriteria(selectionCriteria: IResolvable) {
                cdkBuilder.selectionCriteria(selectionCriteria.let(IResolvable::unwrap))
            }

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            override fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty) {
                cdkBuilder.selectionCriteria(
                    selectionCriteria.let(SelectionCriteriaProperty::unwrap)
                )
            }

            /**
             * @param selectionCriteria This property identifies whether the details of the
             *   prefix-level storage metrics for S3 Storage Lens are enabled.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("30c8d88fa709aba8706e56b8e607183d0292254c2baef744b2fd6f14e96d6d8b")
            override fun selectionCriteria(
                selectionCriteria: SelectionCriteriaProperty.Builder.() -> Unit
            ): Unit = selectionCriteria(SelectionCriteriaProperty(selectionCriteria))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty,
        ) : PrefixLevelStorageMetricsProperty {
            /**
             * This property identifies whether the details of the prefix-level storage metrics for
             * S3 Storage Lens are enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html#cfn-s3-storagelens-prefixlevelstoragemetrics-isenabled)
             */
            override fun isEnabled(): Any? = unwrap(this).getIsEnabled()

            /**
             * This property identifies whether the details of the prefix-level storage metrics for
             * S3 Storage Lens are enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html#cfn-s3-storagelens-prefixlevelstoragemetrics-selectioncriteria)
             */
            override fun selectionCriteria(): Any? = unwrap(this).getSelectionCriteria()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): PrefixLevelStorageMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty
            ): PrefixLevelStorageMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PrefixLevelStorageMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PrefixLevelProperty {
        /**
         * A property for the prefix-level storage metrics for Amazon S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevel.html#cfn-s3-storagelens-prefixlevel-storagemetrics)
         */
        public fun storageMetrics(): Any

        /** A builder for [PrefixLevelProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            public fun storageMetrics(storageMetrics: IResolvable)

            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            public fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty)

            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b53e4593b4de08a727bbfc35d8c653d951035cfff8de33c89ba9366c5fcdbe2d")
            public fun storageMetrics(
                storageMetrics: PrefixLevelStorageMetricsProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.builder()

            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            override fun storageMetrics(storageMetrics: IResolvable) {
                cdkBuilder.storageMetrics(storageMetrics.let(IResolvable::unwrap))
            }

            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            override fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty) {
                cdkBuilder.storageMetrics(
                    storageMetrics.let(PrefixLevelStorageMetricsProperty::unwrap)
                )
            }

            /**
             * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3
             *   Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b53e4593b4de08a727bbfc35d8c653d951035cfff8de33c89ba9366c5fcdbe2d")
            override fun storageMetrics(
                storageMetrics: PrefixLevelStorageMetricsProperty.Builder.() -> Unit
            ): Unit = storageMetrics(PrefixLevelStorageMetricsProperty(storageMetrics))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty,
        ) : PrefixLevelProperty {
            /**
             * A property for the prefix-level storage metrics for Amazon S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevel.html#cfn-s3-storagelens-prefixlevel-storagemetrics)
             */
            override fun storageMetrics(): Any = unwrap(this).getStorageMetrics()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PrefixLevelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty
            ): PrefixLevelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PrefixLevelProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ActivityMetricsProperty {
        /**
         * A property that indicates whether the activity metrics is enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-activitymetrics.html#cfn-s3-storagelens-activitymetrics-isenabled)
         */
        public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

        /** A builder for [ActivityMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param isEnabled A property that indicates whether the activity metrics is enabled.
             */
            public fun isEnabled(isEnabled: Boolean)

            /**
             * @param isEnabled A property that indicates whether the activity metrics is enabled.
             */
            public fun isEnabled(isEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty.builder()

            /**
             * @param isEnabled A property that indicates whether the activity metrics is enabled.
             */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /**
             * @param isEnabled A property that indicates whether the activity metrics is enabled.
             */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty,
        ) : ActivityMetricsProperty {
            /**
             * A property that indicates whether the activity metrics is enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-activitymetrics.html#cfn-s3-storagelens-activitymetrics-isenabled)
             */
            override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ActivityMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty
            ): ActivityMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ActivityMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StorageLensGroupSelectionCriteriaProperty {
        /**
         * This property indicates which Storage Lens group ARNs to exclude from the Storage Lens
         * group aggregation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html#cfn-s3-storagelens-storagelensgroupselectioncriteria-exclude)
         */
        public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

        /**
         * This property indicates which Storage Lens group ARNs to include in the Storage Lens
         * group aggregation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html#cfn-s3-storagelens-storagelensgroupselectioncriteria-include)
         */
        public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

        /** A builder for [StorageLensGroupSelectionCriteriaProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param exclude This property indicates which Storage Lens group ARNs to exclude from
             *   the Storage Lens group aggregation.
             */
            public fun exclude(exclude: List<String>)

            /**
             * @param exclude This property indicates which Storage Lens group ARNs to exclude from
             *   the Storage Lens group aggregation.
             */
            public fun exclude(vararg exclude: String)

            /**
             * @param include This property indicates which Storage Lens group ARNs to include in
             *   the Storage Lens group aggregation.
             */
            public fun include(include: List<String>)

            /**
             * @param include This property indicates which Storage Lens group ARNs to include in
             *   the Storage Lens group aggregation.
             */
            public fun include(vararg include: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens
                    .StorageLensGroupSelectionCriteriaProperty
                    .builder()

            /**
             * @param exclude This property indicates which Storage Lens group ARNs to exclude from
             *   the Storage Lens group aggregation.
             */
            override fun exclude(exclude: List<String>) {
                cdkBuilder.exclude(exclude)
            }

            /**
             * @param exclude This property indicates which Storage Lens group ARNs to exclude from
             *   the Storage Lens group aggregation.
             */
            override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

            /**
             * @param include This property indicates which Storage Lens group ARNs to include in
             *   the Storage Lens group aggregation.
             */
            override fun include(include: List<String>) {
                cdkBuilder.include(include)
            }

            /**
             * @param include This property indicates which Storage Lens group ARNs to include in
             *   the Storage Lens group aggregation.
             */
            override fun include(vararg include: String): Unit = include(include.toList())

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty,
        ) : StorageLensGroupSelectionCriteriaProperty {
            /**
             * This property indicates which Storage Lens group ARNs to exclude from the Storage
             * Lens group aggregation.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html#cfn-s3-storagelens-storagelensgroupselectioncriteria-exclude)
             */
            override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

            /**
             * This property indicates which Storage Lens group ARNs to include in the Storage Lens
             * group aggregation.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html#cfn-s3-storagelens-storagelensgroupselectioncriteria-include)
             */
            override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): StorageLensGroupSelectionCriteriaProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty
            ): StorageLensGroupSelectionCriteriaProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StorageLensGroupSelectionCriteriaProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BucketsAndRegionsProperty {
        /**
         * This property contains the details of the buckets for the Amazon S3 Storage Lens
         * configuration.
         *
         * This should be the bucket Amazon Resource Name(ARN). For valid values, see
         * [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
         * in the *Amazon S3 API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html#cfn-s3-storagelens-bucketsandregions-buckets)
         */
        public fun buckets(): List<String> = unwrap(this).getBuckets() ?: emptyList()

        /**
         * This property contains the details of the Regions for the S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html#cfn-s3-storagelens-bucketsandregions-regions)
         */
        public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

        /** A builder for [BucketsAndRegionsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param buckets This property contains the details of the buckets for the Amazon S3
             *   Storage Lens configuration. This should be the bucket Amazon Resource Name(ARN).
             *   For valid values, see
             *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
             *   in the *Amazon S3 API Reference* .
             */
            public fun buckets(buckets: List<String>)

            /**
             * @param buckets This property contains the details of the buckets for the Amazon S3
             *   Storage Lens configuration. This should be the bucket Amazon Resource Name(ARN).
             *   For valid values, see
             *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
             *   in the *Amazon S3 API Reference* .
             */
            public fun buckets(vararg buckets: String)

            /**
             * @param regions This property contains the details of the Regions for the S3 Storage
             *   Lens configuration.
             */
            public fun regions(regions: List<String>)

            /**
             * @param regions This property contains the details of the Regions for the S3 Storage
             *   Lens configuration.
             */
            public fun regions(vararg regions: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty
                    .builder()

            /**
             * @param buckets This property contains the details of the buckets for the Amazon S3
             *   Storage Lens configuration. This should be the bucket Amazon Resource Name(ARN).
             *   For valid values, see
             *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
             *   in the *Amazon S3 API Reference* .
             */
            override fun buckets(buckets: List<String>) {
                cdkBuilder.buckets(buckets)
            }

            /**
             * @param buckets This property contains the details of the buckets for the Amazon S3
             *   Storage Lens configuration. This should be the bucket Amazon Resource Name(ARN).
             *   For valid values, see
             *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
             *   in the *Amazon S3 API Reference* .
             */
            override fun buckets(vararg buckets: String): Unit = buckets(buckets.toList())

            /**
             * @param regions This property contains the details of the Regions for the S3 Storage
             *   Lens configuration.
             */
            override fun regions(regions: List<String>) {
                cdkBuilder.regions(regions)
            }

            /**
             * @param regions This property contains the details of the Regions for the S3 Storage
             *   Lens configuration.
             */
            override fun regions(vararg regions: String): Unit = regions(regions.toList())

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty,
        ) : BucketsAndRegionsProperty {
            /**
             * This property contains the details of the buckets for the Amazon S3 Storage Lens
             * configuration.
             *
             * This should be the bucket Amazon Resource Name(ARN). For valid values, see
             * [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
             * in the *Amazon S3 API Reference* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html#cfn-s3-storagelens-bucketsandregions-buckets)
             */
            override fun buckets(): List<String> = unwrap(this).getBuckets() ?: emptyList()

            /**
             * This property contains the details of the Regions for the S3 Storage Lens
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html#cfn-s3-storagelens-bucketsandregions-regions)
             */
            override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): BucketsAndRegionsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty
            ): BucketsAndRegionsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BucketsAndRegionsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AccountLevelProperty {
        /**
         * This property contains the details of account-level activity metrics for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-activitymetrics)
         */
        public fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

        /**
         * This property contains the details of account-level advanced cost optimization metrics
         * for S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-advancedcostoptimizationmetrics)
         */
        public fun advancedCostOptimizationMetrics(): Any? =
            unwrap(this).getAdvancedCostOptimizationMetrics()

        /**
         * This property contains the details of account-level advanced data protection metrics for
         * S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-advanceddataprotectionmetrics)
         */
        public fun advancedDataProtectionMetrics(): Any? =
            unwrap(this).getAdvancedDataProtectionMetrics()

        /**
         * This property contains the details of the account-level bucket-level configurations for
         * Amazon S3 Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-bucketlevel)
         */
        public fun bucketLevel(): Any

        /**
         * This property contains the details of account-level detailed status code metrics for S3
         * Storage Lens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-detailedstatuscodesmetrics)
         */
        public fun detailedStatusCodesMetrics(): Any? = unwrap(this).getDetailedStatusCodesMetrics()

        /**
         * This property determines the scope of Storage Lens group data that is displayed in the
         * Storage Lens dashboard.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-storagelensgrouplevel)
         */
        public fun storageLensGroupLevel(): Any? = unwrap(this).getStorageLensGroupLevel()

        /** A builder for [AccountLevelProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            public fun activityMetrics(activityMetrics: IResolvable)

            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            public fun activityMetrics(activityMetrics: ActivityMetricsProperty)

            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c753da8c1499bab4608b76b75409143dfb6df167e20cbb4df62b339f757b81dd")
            public fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit)

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable)

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            public fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty
            )

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("11082772bf9ec4343aa28ca772aead33719712918f194cf48855269228a3fa93")
            public fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics:
                    AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable)

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            public fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty
            )

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d6aa4a354f094e4899274f79dcd5f32ac802065a881b6196fa91b6984d5ca5ee")
            public fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics:
                    AdvancedDataProtectionMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            public fun bucketLevel(bucketLevel: IResolvable)

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            public fun bucketLevel(bucketLevel: BucketLevelProperty)

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("637ed525a35ec747caf0fa5ed4fa1c294d734be664c6fc7489df2ae4313fabe9")
            public fun bucketLevel(bucketLevel: BucketLevelProperty.Builder.() -> Unit)

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable)

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            public fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty
            )

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e1c9653a59e592134bf33dd01f74f580784fe169b9732ecf7e6222b1be5cc932")
            public fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            public fun storageLensGroupLevel(storageLensGroupLevel: IResolvable)

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            public fun storageLensGroupLevel(storageLensGroupLevel: StorageLensGroupLevelProperty)

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ab5bf1092f8ab38d9f93eb9a9428395c16003309590c45b6be670e290f91fcf3")
            public fun storageLensGroupLevel(
                storageLensGroupLevel: StorageLensGroupLevelProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.builder()

            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            override fun activityMetrics(activityMetrics: IResolvable) {
                cdkBuilder.activityMetrics(activityMetrics.let(IResolvable::unwrap))
            }

            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            override fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
                cdkBuilder.activityMetrics(activityMetrics.let(ActivityMetricsProperty::unwrap))
            }

            /**
             * @param activityMetrics This property contains the details of account-level activity
             *   metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c753da8c1499bab4608b76b75409143dfb6df167e20cbb4df62b339f757b81dd")
            override fun activityMetrics(
                activityMetrics: ActivityMetricsProperty.Builder.() -> Unit
            ): Unit = activityMetrics(ActivityMetricsProperty(activityMetrics))

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: IResolvable
            ) {
                cdkBuilder.advancedCostOptimizationMetrics(
                    advancedCostOptimizationMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty
            ) {
                cdkBuilder.advancedCostOptimizationMetrics(
                    advancedCostOptimizationMetrics.let(
                        AdvancedCostOptimizationMetricsProperty::unwrap
                    )
                )
            }

            /**
             * @param advancedCostOptimizationMetrics This property contains the details of
             *   account-level advanced cost optimization metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("11082772bf9ec4343aa28ca772aead33719712918f194cf48855269228a3fa93")
            override fun advancedCostOptimizationMetrics(
                advancedCostOptimizationMetrics:
                    AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit
            ): Unit =
                advancedCostOptimizationMetrics(
                    AdvancedCostOptimizationMetricsProperty(advancedCostOptimizationMetrics)
                )

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            override fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
                cdkBuilder.advancedDataProtectionMetrics(
                    advancedDataProtectionMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            override fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty
            ) {
                cdkBuilder.advancedDataProtectionMetrics(
                    advancedDataProtectionMetrics.let(AdvancedDataProtectionMetricsProperty::unwrap)
                )
            }

            /**
             * @param advancedDataProtectionMetrics This property contains the details of
             *   account-level advanced data protection metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d6aa4a354f094e4899274f79dcd5f32ac802065a881b6196fa91b6984d5ca5ee")
            override fun advancedDataProtectionMetrics(
                advancedDataProtectionMetrics:
                    AdvancedDataProtectionMetricsProperty.Builder.() -> Unit
            ): Unit =
                advancedDataProtectionMetrics(
                    AdvancedDataProtectionMetricsProperty(advancedDataProtectionMetrics)
                )

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            override fun bucketLevel(bucketLevel: IResolvable) {
                cdkBuilder.bucketLevel(bucketLevel.let(IResolvable::unwrap))
            }

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            override fun bucketLevel(bucketLevel: BucketLevelProperty) {
                cdkBuilder.bucketLevel(bucketLevel.let(BucketLevelProperty::unwrap))
            }

            /**
             * @param bucketLevel This property contains the details of the account-level
             *   bucket-level configurations for Amazon S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("637ed525a35ec747caf0fa5ed4fa1c294d734be664c6fc7489df2ae4313fabe9")
            override fun bucketLevel(bucketLevel: BucketLevelProperty.Builder.() -> Unit): Unit =
                bucketLevel(BucketLevelProperty(bucketLevel))

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            override fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
                cdkBuilder.detailedStatusCodesMetrics(
                    detailedStatusCodesMetrics.let(IResolvable::unwrap)
                )
            }

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            override fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty
            ) {
                cdkBuilder.detailedStatusCodesMetrics(
                    detailedStatusCodesMetrics.let(DetailedStatusCodesMetricsProperty::unwrap)
                )
            }

            /**
             * @param detailedStatusCodesMetrics This property contains the details of account-level
             *   detailed status code metrics for S3 Storage Lens.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e1c9653a59e592134bf33dd01f74f580784fe169b9732ecf7e6222b1be5cc932")
            override fun detailedStatusCodesMetrics(
                detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit
            ): Unit =
                detailedStatusCodesMetrics(
                    DetailedStatusCodesMetricsProperty(detailedStatusCodesMetrics)
                )

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            override fun storageLensGroupLevel(storageLensGroupLevel: IResolvable) {
                cdkBuilder.storageLensGroupLevel(storageLensGroupLevel.let(IResolvable::unwrap))
            }

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            override fun storageLensGroupLevel(
                storageLensGroupLevel: StorageLensGroupLevelProperty
            ) {
                cdkBuilder.storageLensGroupLevel(
                    storageLensGroupLevel.let(StorageLensGroupLevelProperty::unwrap)
                )
            }

            /**
             * @param storageLensGroupLevel This property determines the scope of Storage Lens group
             *   data that is displayed in the Storage Lens dashboard.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ab5bf1092f8ab38d9f93eb9a9428395c16003309590c45b6be670e290f91fcf3")
            override fun storageLensGroupLevel(
                storageLensGroupLevel: StorageLensGroupLevelProperty.Builder.() -> Unit
            ): Unit = storageLensGroupLevel(StorageLensGroupLevelProperty(storageLensGroupLevel))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty,
        ) : AccountLevelProperty {
            /**
             * This property contains the details of account-level activity metrics for S3 Storage
             * Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-activitymetrics)
             */
            override fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

            /**
             * This property contains the details of account-level advanced cost optimization
             * metrics for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-advancedcostoptimizationmetrics)
             */
            override fun advancedCostOptimizationMetrics(): Any? =
                unwrap(this).getAdvancedCostOptimizationMetrics()

            /**
             * This property contains the details of account-level advanced data protection metrics
             * for S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-advanceddataprotectionmetrics)
             */
            override fun advancedDataProtectionMetrics(): Any? =
                unwrap(this).getAdvancedDataProtectionMetrics()

            /**
             * This property contains the details of the account-level bucket-level configurations
             * for Amazon S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-bucketlevel)
             */
            override fun bucketLevel(): Any = unwrap(this).getBucketLevel()

            /**
             * This property contains the details of account-level detailed status code metrics for
             * S3 Storage Lens.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-detailedstatuscodesmetrics)
             */
            override fun detailedStatusCodesMetrics(): Any? =
                unwrap(this).getDetailedStatusCodesMetrics()

            /**
             * This property determines the scope of Storage Lens group data that is displayed in
             * the Storage Lens dashboard.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html#cfn-s3-storagelens-accountlevel-storagelensgrouplevel)
             */
            override fun storageLensGroupLevel(): Any? = unwrap(this).getStorageLensGroupLevel()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AccountLevelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty
            ): AccountLevelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AccountLevelProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CloudWatchMetricsProperty {
        /**
         * This property identifies whether the CloudWatch publishing option for S3 Storage Lens is
         * enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-cloudwatchmetrics.html#cfn-s3-storagelens-cloudwatchmetrics-isenabled)
         */
        public fun isEnabled(): Any

        /** A builder for [CloudWatchMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param isEnabled This property identifies whether the CloudWatch publishing option
             *   for S3 Storage Lens is enabled.
             */
            public fun isEnabled(isEnabled: Boolean)

            /**
             * @param isEnabled This property identifies whether the CloudWatch publishing option
             *   for S3 Storage Lens is enabled.
             */
            public fun isEnabled(isEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty
                    .builder()

            /**
             * @param isEnabled This property identifies whether the CloudWatch publishing option
             *   for S3 Storage Lens is enabled.
             */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /**
             * @param isEnabled This property identifies whether the CloudWatch publishing option
             *   for S3 Storage Lens is enabled.
             */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty,
        ) : CloudWatchMetricsProperty {
            /**
             * This property identifies whether the CloudWatch publishing option for S3 Storage Lens
             * is enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-cloudwatchmetrics.html#cfn-s3-storagelens-cloudwatchmetrics-isenabled)
             */
            override fun isEnabled(): Any = unwrap(this).getIsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty
            ): CloudWatchMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CloudWatchMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface S3BucketDestinationProperty {
        /**
         * This property contains the details of the AWS account ID of the S3 Storage Lens export
         * bucket destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-accountid)
         */
        public fun accountId(): String

        /**
         * This property contains the details of the ARN of the bucket destination of the S3 Storage
         * Lens export.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-arn)
         */
        public fun arn(): String

        /**
         * This property contains the details of the encryption of the bucket destination of the
         * Amazon S3 Storage Lens metrics export.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-encryption)
         */
        public fun encryption(): Any? = unwrap(this).getEncryption()

        /**
         * This property contains the details of the format of the S3 Storage Lens export bucket
         * destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-format)
         */
        public fun format(): String

        /**
         * This property contains the details of the output schema version of the S3 Storage Lens
         * export bucket destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-outputschemaversion)
         */
        public fun outputSchemaVersion(): String

        /**
         * This property contains the details of the prefix of the bucket destination of the S3
         * Storage Lens export .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-prefix)
         */
        public fun prefix(): String? = unwrap(this).getPrefix()

        /** A builder for [S3BucketDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param accountId This property contains the details of the AWS account ID of the S3
             *   Storage Lens export bucket destination.
             */
            public fun accountId(accountId: String)

            /**
             * @param arn This property contains the details of the ARN of the bucket destination of
             *   the S3 Storage Lens export.
             */
            public fun arn(arn: String)

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            public fun encryption(encryption: IResolvable)

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            public fun encryption(encryption: EncryptionProperty)

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0945f4ea100f7f0afba60c5c581bee34da6fe72613e9874a8e38a558900a11e9")
            public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit)

            /**
             * @param format This property contains the details of the format of the S3 Storage Lens
             *   export bucket destination.
             */
            public fun format(format: String)

            /**
             * @param outputSchemaVersion This property contains the details of the output schema
             *   version of the S3 Storage Lens export bucket destination.
             */
            public fun outputSchemaVersion(outputSchemaVersion: String)

            /**
             * @param prefix This property contains the details of the prefix of the bucket
             *   destination of the S3 Storage Lens export .
             */
            public fun prefix(prefix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty
                    .builder()

            /**
             * @param accountId This property contains the details of the AWS account ID of the S3
             *   Storage Lens export bucket destination.
             */
            override fun accountId(accountId: String) {
                cdkBuilder.accountId(accountId)
            }

            /**
             * @param arn This property contains the details of the ARN of the bucket destination of
             *   the S3 Storage Lens export.
             */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            override fun encryption(encryption: IResolvable) {
                cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
            }

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            override fun encryption(encryption: EncryptionProperty) {
                cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
            }

            /**
             * @param encryption This property contains the details of the encryption of the bucket
             *   destination of the Amazon S3 Storage Lens metrics export.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0945f4ea100f7f0afba60c5c581bee34da6fe72613e9874a8e38a558900a11e9")
            override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
                encryption(EncryptionProperty(encryption))

            /**
             * @param format This property contains the details of the format of the S3 Storage Lens
             *   export bucket destination.
             */
            override fun format(format: String) {
                cdkBuilder.format(format)
            }

            /**
             * @param outputSchemaVersion This property contains the details of the output schema
             *   version of the S3 Storage Lens export bucket destination.
             */
            override fun outputSchemaVersion(outputSchemaVersion: String) {
                cdkBuilder.outputSchemaVersion(outputSchemaVersion)
            }

            /**
             * @param prefix This property contains the details of the prefix of the bucket
             *   destination of the S3 Storage Lens export .
             */
            override fun prefix(prefix: String) {
                cdkBuilder.prefix(prefix)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty,
        ) : S3BucketDestinationProperty {
            /**
             * This property contains the details of the AWS account ID of the S3 Storage Lens
             * export bucket destination.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-accountid)
             */
            override fun accountId(): String = unwrap(this).getAccountId()

            /**
             * This property contains the details of the ARN of the bucket destination of the S3
             * Storage Lens export.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-arn)
             */
            override fun arn(): String = unwrap(this).getArn()

            /**
             * This property contains the details of the encryption of the bucket destination of the
             * Amazon S3 Storage Lens metrics export.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-encryption)
             */
            override fun encryption(): Any? = unwrap(this).getEncryption()

            /**
             * This property contains the details of the format of the S3 Storage Lens export bucket
             * destination.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-format)
             */
            override fun format(): String = unwrap(this).getFormat()

            /**
             * This property contains the details of the output schema version of the S3 Storage
             * Lens export bucket destination.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-outputschemaversion)
             */
            override fun outputSchemaVersion(): String = unwrap(this).getOutputSchemaVersion()

            /**
             * This property contains the details of the prefix of the bucket destination of the S3
             * Storage Lens export .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html#cfn-s3-storagelens-s3bucketdestination-prefix)
             */
            override fun prefix(): String? = unwrap(this).getPrefix()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): S3BucketDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty
            ): S3BucketDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3BucketDestinationProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StorageLensConfigurationProperty {
        /**
         * This property contains the details of the account-level metrics for Amazon S3 Storage
         * Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-accountlevel)
         */
        public fun accountLevel(): Any

        /**
         * This property contains the details of the AWS Organization for the S3 Storage Lens
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-awsorg)
         */
        public fun awsOrg(): Any? = unwrap(this).getAwsOrg()

        /**
         * This property contains the details of this S3 Storage Lens configuration's metrics
         * export.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-dataexport)
         */
        public fun dataExport(): Any? = unwrap(this).getDataExport()

        /**
         * This property contains the details of the bucket and or Regions excluded for Amazon S3
         * Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-exclude)
         */
        public fun exclude(): Any? = unwrap(this).getExclude()

        /**
         * This property contains the details of the ID of the S3 Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-id)
         */
        public fun id(): String

        /**
         * This property contains the details of the bucket and or Regions included for Amazon S3
         * Storage Lens configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-include)
         */
        public fun include(): Any? = unwrap(this).getInclude()

        /**
         * This property contains the details of whether the Amazon S3 Storage Lens configuration is
         * enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-isenabled)
         */
        public fun isEnabled(): Any

        /**
         * This property contains the details of the ARN of the S3 Storage Lens configuration.
         *
         * This property is read-only.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-storagelensarn)
         */
        public fun storageLensArn(): String? = unwrap(this).getStorageLensArn()

        /** A builder for [StorageLensConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            public fun accountLevel(accountLevel: IResolvable)

            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            public fun accountLevel(accountLevel: AccountLevelProperty)

            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0807eb92fcdddb493fce3abc97addc932e6816cef49abc0b1a9f00458917c4e8")
            public fun accountLevel(accountLevel: AccountLevelProperty.Builder.() -> Unit)

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            public fun awsOrg(awsOrg: IResolvable)

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            public fun awsOrg(awsOrg: AwsOrgProperty)

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e1eaa0ff74f96182ad188b3f6540403d17699e5f24ec47e0c6ba10605f7b7ea0")
            public fun awsOrg(awsOrg: AwsOrgProperty.Builder.() -> Unit)

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            public fun dataExport(dataExport: IResolvable)

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            public fun dataExport(dataExport: DataExportProperty)

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("06f80e4a5158e2a7840c0143dc26a9dbd649377a8dc4641dc86ba34d2148a103")
            public fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit)

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            public fun exclude(exclude: IResolvable)

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            public fun exclude(exclude: BucketsAndRegionsProperty)

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c8b157f5db4d745521ff3c4e29e1d96b53466eed813ef198f58795ad945b8f6")
            public fun exclude(exclude: BucketsAndRegionsProperty.Builder.() -> Unit)

            /**
             * @param id This property contains the details of the ID of the S3 Storage Lens
             *   configuration.
             */
            public fun id(id: String)

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            public fun include(include: IResolvable)

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            public fun include(include: BucketsAndRegionsProperty)

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("db071429d2dfb561bf71302098586cbdfcc6b0e12bcac5ed7a809c4a46ccb122")
            public fun include(include: BucketsAndRegionsProperty.Builder.() -> Unit)

            /**
             * @param isEnabled This property contains the details of whether the Amazon S3 Storage
             *   Lens configuration is enabled.
             */
            public fun isEnabled(isEnabled: Boolean)

            /**
             * @param isEnabled This property contains the details of whether the Amazon S3 Storage
             *   Lens configuration is enabled.
             */
            public fun isEnabled(isEnabled: IResolvable)

            /**
             * @param storageLensArn This property contains the details of the ARN of the S3 Storage
             *   Lens configuration. This property is read-only.
             */
            public fun storageLensArn(storageLensArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty
                    .builder()

            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            override fun accountLevel(accountLevel: IResolvable) {
                cdkBuilder.accountLevel(accountLevel.let(IResolvable::unwrap))
            }

            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            override fun accountLevel(accountLevel: AccountLevelProperty) {
                cdkBuilder.accountLevel(accountLevel.let(AccountLevelProperty::unwrap))
            }

            /**
             * @param accountLevel This property contains the details of the account-level metrics
             *   for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0807eb92fcdddb493fce3abc97addc932e6816cef49abc0b1a9f00458917c4e8")
            override fun accountLevel(accountLevel: AccountLevelProperty.Builder.() -> Unit): Unit =
                accountLevel(AccountLevelProperty(accountLevel))

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            override fun awsOrg(awsOrg: IResolvable) {
                cdkBuilder.awsOrg(awsOrg.let(IResolvable::unwrap))
            }

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            override fun awsOrg(awsOrg: AwsOrgProperty) {
                cdkBuilder.awsOrg(awsOrg.let(AwsOrgProperty::unwrap))
            }

            /**
             * @param awsOrg This property contains the details of the AWS Organization for the S3
             *   Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e1eaa0ff74f96182ad188b3f6540403d17699e5f24ec47e0c6ba10605f7b7ea0")
            override fun awsOrg(awsOrg: AwsOrgProperty.Builder.() -> Unit): Unit =
                awsOrg(AwsOrgProperty(awsOrg))

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            override fun dataExport(dataExport: IResolvable) {
                cdkBuilder.dataExport(dataExport.let(IResolvable::unwrap))
            }

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            override fun dataExport(dataExport: DataExportProperty) {
                cdkBuilder.dataExport(dataExport.let(DataExportProperty::unwrap))
            }

            /**
             * @param dataExport This property contains the details of this S3 Storage Lens
             *   configuration's metrics export.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("06f80e4a5158e2a7840c0143dc26a9dbd649377a8dc4641dc86ba34d2148a103")
            override fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit): Unit =
                dataExport(DataExportProperty(dataExport))

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            override fun exclude(exclude: IResolvable) {
                cdkBuilder.exclude(exclude.let(IResolvable::unwrap))
            }

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            override fun exclude(exclude: BucketsAndRegionsProperty) {
                cdkBuilder.exclude(exclude.let(BucketsAndRegionsProperty::unwrap))
            }

            /**
             * @param exclude This property contains the details of the bucket and or Regions
             *   excluded for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c8b157f5db4d745521ff3c4e29e1d96b53466eed813ef198f58795ad945b8f6")
            override fun exclude(exclude: BucketsAndRegionsProperty.Builder.() -> Unit): Unit =
                exclude(BucketsAndRegionsProperty(exclude))

            /**
             * @param id This property contains the details of the ID of the S3 Storage Lens
             *   configuration.
             */
            override fun id(id: String) {
                cdkBuilder.id(id)
            }

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            override fun include(include: IResolvable) {
                cdkBuilder.include(include.let(IResolvable::unwrap))
            }

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            override fun include(include: BucketsAndRegionsProperty) {
                cdkBuilder.include(include.let(BucketsAndRegionsProperty::unwrap))
            }

            /**
             * @param include This property contains the details of the bucket and or Regions
             *   included for Amazon S3 Storage Lens configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("db071429d2dfb561bf71302098586cbdfcc6b0e12bcac5ed7a809c4a46ccb122")
            override fun include(include: BucketsAndRegionsProperty.Builder.() -> Unit): Unit =
                include(BucketsAndRegionsProperty(include))

            /**
             * @param isEnabled This property contains the details of whether the Amazon S3 Storage
             *   Lens configuration is enabled.
             */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /**
             * @param isEnabled This property contains the details of whether the Amazon S3 Storage
             *   Lens configuration is enabled.
             */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            /**
             * @param storageLensArn This property contains the details of the ARN of the S3 Storage
             *   Lens configuration. This property is read-only.
             */
            override fun storageLensArn(storageLensArn: String) {
                cdkBuilder.storageLensArn(storageLensArn)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty,
        ) : StorageLensConfigurationProperty {
            /**
             * This property contains the details of the account-level metrics for Amazon S3 Storage
             * Lens configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-accountlevel)
             */
            override fun accountLevel(): Any = unwrap(this).getAccountLevel()

            /**
             * This property contains the details of the AWS Organization for the S3 Storage Lens
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-awsorg)
             */
            override fun awsOrg(): Any? = unwrap(this).getAwsOrg()

            /**
             * This property contains the details of this S3 Storage Lens configuration's metrics
             * export.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-dataexport)
             */
            override fun dataExport(): Any? = unwrap(this).getDataExport()

            /**
             * This property contains the details of the bucket and or Regions excluded for Amazon
             * S3 Storage Lens configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-exclude)
             */
            override fun exclude(): Any? = unwrap(this).getExclude()

            /**
             * This property contains the details of the ID of the S3 Storage Lens configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-id)
             */
            override fun id(): String = unwrap(this).getId()

            /**
             * This property contains the details of the bucket and or Regions included for Amazon
             * S3 Storage Lens configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-include)
             */
            override fun include(): Any? = unwrap(this).getInclude()

            /**
             * This property contains the details of whether the Amazon S3 Storage Lens
             * configuration is enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-isenabled)
             */
            override fun isEnabled(): Any = unwrap(this).getIsEnabled()

            /**
             * This property contains the details of the ARN of the S3 Storage Lens configuration.
             *
             * This property is read-only.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html#cfn-s3-storagelens-storagelensconfiguration-storagelensarn)
             */
            override fun storageLensArn(): String? = unwrap(this).getStorageLensArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): StorageLensConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty
            ): StorageLensConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StorageLensConfigurationProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EncryptionProperty {
        /**
         * Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the S3 Storage
         * Lens metrics export file.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html#cfn-s3-storagelens-encryption-ssekms)
         */
        public fun ssekms(): Any? = unwrap(this).getSsekms()

        /**
         * Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage Lens
         * metrics export file.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html#cfn-s3-storagelens-encryption-sses3)
         */
        public fun sses3(): Any? = unwrap(this).getSses3()

        /** A builder for [EncryptionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            public fun ssekms(ssekms: IResolvable)

            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            public fun ssekms(ssekms: SSEKMSProperty)

            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1f7b40a828125a6eee81f9b1e9d2bb02613804337fb7754b55771795ea8a863")
            public fun ssekms(ssekms: SSEKMSProperty.Builder.() -> Unit)

            /**
             * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3
             *   Storage Lens metrics export file.
             */
            public fun sses3(sses3: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty.builder()

            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            override fun ssekms(ssekms: IResolvable) {
                cdkBuilder.ssekms(ssekms.let(IResolvable::unwrap))
            }

            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            override fun ssekms(ssekms: SSEKMSProperty) {
                cdkBuilder.ssekms(ssekms.let(SSEKMSProperty::unwrap))
            }

            /**
             * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to
             *   encrypt the S3 Storage Lens metrics export file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1f7b40a828125a6eee81f9b1e9d2bb02613804337fb7754b55771795ea8a863")
            override fun ssekms(ssekms: SSEKMSProperty.Builder.() -> Unit): Unit =
                ssekms(SSEKMSProperty(ssekms))

            /**
             * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3
             *   Storage Lens metrics export file.
             */
            override fun sses3(sses3: Any) {
                cdkBuilder.sses3(sses3)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty,
        ) : EncryptionProperty {
            /**
             * Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the S3
             * Storage Lens metrics export file.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html#cfn-s3-storagelens-encryption-ssekms)
             */
            override fun ssekms(): Any? = unwrap(this).getSsekms()

            /**
             * Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage Lens
             * metrics export file.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html#cfn-s3-storagelens-encryption-sses3)
             */
            override fun sses3(): Any? = unwrap(this).getSses3()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty
            ): EncryptionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EncryptionProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AwsOrgProperty {
        /**
         * This resource contains the ARN of the AWS Organization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-awsorg.html#cfn-s3-storagelens-awsorg-arn)
         */
        public fun arn(): String

        /** A builder for [AwsOrgProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn This resource contains the ARN of the AWS Organization. */
            public fun arn(arn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty.builder()

            /** @param arn This resource contains the ARN of the AWS Organization. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty,
        ) : AwsOrgProperty {
            /**
             * This resource contains the ARN of the AWS Organization.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-awsorg.html#cfn-s3-storagelens-awsorg-arn)
             */
            override fun arn(): String = unwrap(this).getArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AwsOrgProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty
            ): AwsOrgProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AwsOrgProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DetailedStatusCodesMetricsProperty {
        /**
         * Indicates whether detailed status code metrics are enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-detailedstatuscodesmetrics.html#cfn-s3-storagelens-detailedstatuscodesmetrics-isenabled)
         */
        public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

        /** A builder for [DetailedStatusCodesMetricsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
            public fun isEnabled(isEnabled: Boolean)

            /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
            public fun isEnabled(isEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty
                    .builder()

            /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
            override fun isEnabled(isEnabled: Boolean) {
                cdkBuilder.isEnabled(isEnabled)
            }

            /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
            override fun isEnabled(isEnabled: IResolvable) {
                cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty,
        ) : DetailedStatusCodesMetricsProperty {
            /**
             * Indicates whether detailed status code metrics are enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-detailedstatuscodesmetrics.html#cfn-s3-storagelens-detailedstatuscodesmetrics-isenabled)
             */
            override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DetailedStatusCodesMetricsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty
            ): DetailedStatusCodesMetricsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DetailedStatusCodesMetricsProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DataExportProperty {
        /**
         * This property enables the Amazon CloudWatch publishing option for S3 Storage Lens
         * metrics.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-dataexport.html#cfn-s3-storagelens-dataexport-cloudwatchmetrics)
         */
        public fun cloudWatchMetrics(): Any? = unwrap(this).getCloudWatchMetrics()

        /**
         * This property contains the details of the bucket where the S3 Storage Lens metrics export
         * will be placed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-dataexport.html#cfn-s3-storagelens-dataexport-s3bucketdestination)
         */
        public fun s3BucketDestination(): Any? = unwrap(this).getS3BucketDestination()

        /** A builder for [DataExportProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            public fun cloudWatchMetrics(cloudWatchMetrics: IResolvable)

            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            public fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty)

            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("467a369691b5fe770301e5dbd21eec4ef8b36d60331c37c6bf16ddf66f927ec6")
            public fun cloudWatchMetrics(
                cloudWatchMetrics: CloudWatchMetricsProperty.Builder.() -> Unit
            )

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            public fun s3BucketDestination(s3BucketDestination: IResolvable)

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            public fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty)

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b9f029381afe0b426630e6f1402634bca1d91ecb86c94084967768609ec5aa9a")
            public fun s3BucketDestination(
                s3BucketDestination: S3BucketDestinationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty.builder()

            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            override fun cloudWatchMetrics(cloudWatchMetrics: IResolvable) {
                cdkBuilder.cloudWatchMetrics(cloudWatchMetrics.let(IResolvable::unwrap))
            }

            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            override fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty) {
                cdkBuilder.cloudWatchMetrics(
                    cloudWatchMetrics.let(CloudWatchMetricsProperty::unwrap)
                )
            }

            /**
             * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing
             *   option for S3 Storage Lens metrics.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("467a369691b5fe770301e5dbd21eec4ef8b36d60331c37c6bf16ddf66f927ec6")
            override fun cloudWatchMetrics(
                cloudWatchMetrics: CloudWatchMetricsProperty.Builder.() -> Unit
            ): Unit = cloudWatchMetrics(CloudWatchMetricsProperty(cloudWatchMetrics))

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            override fun s3BucketDestination(s3BucketDestination: IResolvable) {
                cdkBuilder.s3BucketDestination(s3BucketDestination.let(IResolvable::unwrap))
            }

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            override fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty) {
                cdkBuilder.s3BucketDestination(
                    s3BucketDestination.let(S3BucketDestinationProperty::unwrap)
                )
            }

            /**
             * @param s3BucketDestination This property contains the details of the bucket where the
             *   S3 Storage Lens metrics export will be placed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b9f029381afe0b426630e6f1402634bca1d91ecb86c94084967768609ec5aa9a")
            override fun s3BucketDestination(
                s3BucketDestination: S3BucketDestinationProperty.Builder.() -> Unit
            ): Unit = s3BucketDestination(S3BucketDestinationProperty(s3BucketDestination))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty,
        ) : DataExportProperty {
            /**
             * This property enables the Amazon CloudWatch publishing option for S3 Storage Lens
             * metrics.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-dataexport.html#cfn-s3-storagelens-dataexport-cloudwatchmetrics)
             */
            override fun cloudWatchMetrics(): Any? = unwrap(this).getCloudWatchMetrics()

            /**
             * This property contains the details of the bucket where the S3 Storage Lens metrics
             * export will be placed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-dataexport.html#cfn-s3-storagelens-dataexport-s3bucketdestination)
             */
            override fun s3BucketDestination(): Any? = unwrap(this).getS3BucketDestination()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DataExportProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty
            ): DataExportProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DataExportProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
