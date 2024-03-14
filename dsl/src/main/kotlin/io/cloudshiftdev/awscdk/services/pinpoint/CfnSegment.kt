package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnSegment
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The unique identifier for the Amazon Pinpoint application that the segment is associated
     * with.
     */
    public open fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The unique identifier for the Amazon Pinpoint application that the segment is associated
     * with.
     */
    public open fun applicationId(`value`: String) {
        unwrap(this).setApplicationId(`value`)
    }

    /** The Amazon Resource Name (ARN) of the segment. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The unique identifier for the segment. */
    public open fun attrSegmentId(): String = unwrap(this).getAttrSegmentId()

    /** An array that defines the dimensions for the segment. */
    public open fun dimensions(): Any? = unwrap(this).getDimensions()

    /** An array that defines the dimensions for the segment. */
    public open fun dimensions(`value`: IResolvable) {
        unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
    }

    /** An array that defines the dimensions for the segment. */
    public open fun dimensions(`value`: SegmentDimensionsProperty) {
        unwrap(this).setDimensions(`value`.let(SegmentDimensionsProperty::unwrap))
    }

    /** An array that defines the dimensions for the segment. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a2044384b36baa8bbe33f009c6462602b6882314214a6c4fd4ccbb10898e2fe")
    public open fun dimensions(`value`: SegmentDimensionsProperty.Builder.() -> Unit): Unit =
        dimensions(SegmentDimensionsProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the segment. */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the segment. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * The segment group to use and the dimensions to apply to the group's base segments in order to
     * build the segment.
     */
    public open fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

    /**
     * The segment group to use and the dimensions to apply to the group's base segments in order to
     * build the segment.
     */
    public open fun segmentGroups(`value`: IResolvable) {
        unwrap(this).setSegmentGroups(`value`.let(IResolvable::unwrap))
    }

    /**
     * The segment group to use and the dimensions to apply to the group's base segments in order to
     * build the segment.
     */
    public open fun segmentGroups(`value`: SegmentGroupsProperty) {
        unwrap(this).setSegmentGroups(`value`.let(SegmentGroupsProperty::unwrap))
    }

    /**
     * The segment group to use and the dimensions to apply to the group's base segments in order to
     * build the segment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa834199bd9aefdd0a4e79f4b67d28df9ccf03b5b5e23247e2105dd222594fc7")
    public open fun segmentGroups(`value`: SegmentGroupsProperty.Builder.() -> Unit): Unit =
        segmentGroups(SegmentGroupsProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(`value`: Any) {
        unwrap(this).setTagsRaw(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnSegment]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The unique identifier for the Amazon Pinpoint application that the segment is associated
         * with.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that the
         *   segment is associated with.
         */
        public fun applicationId(applicationId: String)

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        public fun dimensions(dimensions: IResolvable)

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        public fun dimensions(dimensions: SegmentDimensionsProperty)

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("dd231d0070f91e7a6132a26cb52126283d7f2eb07aaf9f5926fdad4e20799623")
        public fun dimensions(dimensions: SegmentDimensionsProperty.Builder.() -> Unit)

        /**
         * The name of the segment.
         *
         * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
         *
         * @param name The name of the segment.
         */
        public fun name(name: String)

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        public fun segmentGroups(segmentGroups: IResolvable)

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        public fun segmentGroups(segmentGroups: SegmentGroupsProperty)

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a2fc3a1035c47b59302a0ca42c5b71efb23a05c4c0cb18c0f4f87f402dab8c26")
        public fun segmentGroups(segmentGroups: SegmentGroupsProperty.Builder.() -> Unit)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSegment.Builder =
            software.amazon.awscdk.services.pinpoint.CfnSegment.Builder.create(scope, id)

        /**
         * The unique identifier for the Amazon Pinpoint application that the segment is associated
         * with.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that the
         *   segment is associated with.
         */
        override fun applicationId(applicationId: String) {
            cdkBuilder.applicationId(applicationId)
        }

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        override fun dimensions(dimensions: IResolvable) {
            cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
        }

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        override fun dimensions(dimensions: SegmentDimensionsProperty) {
            cdkBuilder.dimensions(dimensions.let(SegmentDimensionsProperty::unwrap))
        }

        /**
         * An array that defines the dimensions for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
         *
         * @param dimensions An array that defines the dimensions for the segment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("dd231d0070f91e7a6132a26cb52126283d7f2eb07aaf9f5926fdad4e20799623")
        override fun dimensions(dimensions: SegmentDimensionsProperty.Builder.() -> Unit): Unit =
            dimensions(SegmentDimensionsProperty(dimensions))

        /**
         * The name of the segment.
         *
         * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
         *
         * @param name The name of the segment.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        override fun segmentGroups(segmentGroups: IResolvable) {
            cdkBuilder.segmentGroups(segmentGroups.let(IResolvable::unwrap))
        }

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        override fun segmentGroups(segmentGroups: SegmentGroupsProperty) {
            cdkBuilder.segmentGroups(segmentGroups.let(SegmentGroupsProperty::unwrap))
        }

        /**
         * The segment group to use and the dimensions to apply to the group's base segments in
         * order to build the segment.
         *
         * A segment group can consist of zero or more base segments. Your request can include only
         * one segment group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
         *
         * @param segmentGroups The segment group to use and the dimensions to apply to the group's
         *   base segments in order to build the segment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a2fc3a1035c47b59302a0ca42c5b71efb23a05c4c0cb18c0f4f87f402dab8c26")
        override fun segmentGroups(segmentGroups: SegmentGroupsProperty.Builder.() -> Unit): Unit =
            segmentGroups(SegmentGroupsProperty(segmentGroups))

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: Any) {
            cdkBuilder.tags(tags)
        }

        public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSegment {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSegment(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment
        ): CfnSegment = CfnSegment(cdkObject)

        internal fun unwrap(
            wrapped: CfnSegment
        ): software.amazon.awscdk.services.pinpoint.CfnSegment = wrapped.cdkObject
    }

    public interface GroupsProperty {
        /**
         * An array that defines the dimensions to include or exclude from the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-dimensions)
         */
        public fun dimensions(): Any? = unwrap(this).getDimensions()

        /**
         * The base segment to build the segment on.
         *
         * A base segment, also called a *source segment* , defines the initial population of
         * endpoints for a segment. When you add dimensions to the segment, Amazon Pinpoint filters
         * the base segment by using the dimensions that you specify.
         *
         * You can specify more than one dimensional segment or only one imported segment. If you
         * specify an imported segment, the segment size estimate that displays on the Amazon
         * Pinpoint console indicates the size of the imported segment without any filters applied
         * to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-sourcesegments)
         */
        public fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

        /**
         * Specifies how to handle multiple base segments for the segment.
         *
         * For example, if you specify three base segments for the segment, whether the resulting
         * segment is based on all, any, or none of the base segments.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-sourcetype)
         */
        public fun sourceType(): String? = unwrap(this).getSourceType()

        /**
         * Specifies how to handle multiple dimensions for the segment.
         *
         * For example, if you specify three dimensions for the segment, whether the resulting
         * segment includes endpoints that match all, any, or none of the dimensions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-type)
         */
        public fun type(): String? = unwrap(this).getType()

        /** A builder for [GroupsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            public fun dimensions(dimensions: IResolvable)

            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            public fun dimensions(dimensions: List<Any>)

            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            public fun dimensions(vararg dimensions: Any)

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            public fun sourceSegments(sourceSegments: IResolvable)

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            public fun sourceSegments(sourceSegments: List<Any>)

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            public fun sourceSegments(vararg sourceSegments: Any)

            /**
             * @param sourceType Specifies how to handle multiple base segments for the segment. For
             *   example, if you specify three base segments for the segment, whether the resulting
             *   segment is based on all, any, or none of the base segments.
             */
            public fun sourceType(sourceType: String)

            /**
             * @param type Specifies how to handle multiple dimensions for the segment. For example,
             *   if you specify three dimensions for the segment, whether the resulting segment
             *   includes endpoints that match all, any, or none of the dimensions.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty.builder()

            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            override fun dimensions(dimensions: IResolvable) {
                cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
            }

            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            override fun dimensions(dimensions: List<Any>) {
                cdkBuilder.dimensions(dimensions)
            }

            /**
             * @param dimensions An array that defines the dimensions to include or exclude from the
             *   segment.
             */
            override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            override fun sourceSegments(sourceSegments: IResolvable) {
                cdkBuilder.sourceSegments(sourceSegments.let(IResolvable::unwrap))
            }

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            override fun sourceSegments(sourceSegments: List<Any>) {
                cdkBuilder.sourceSegments(sourceSegments)
            }

            /**
             * @param sourceSegments The base segment to build the segment on. A base segment, also
             *   called a *source segment* , defines the initial population of endpoints for a
             *   segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
             *   segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             */
            override fun sourceSegments(vararg sourceSegments: Any): Unit =
                sourceSegments(sourceSegments.toList())

            /**
             * @param sourceType Specifies how to handle multiple base segments for the segment. For
             *   example, if you specify three base segments for the segment, whether the resulting
             *   segment is based on all, any, or none of the base segments.
             */
            override fun sourceType(sourceType: String) {
                cdkBuilder.sourceType(sourceType)
            }

            /**
             * @param type Specifies how to handle multiple dimensions for the segment. For example,
             *   if you specify three dimensions for the segment, whether the resulting segment
             *   includes endpoints that match all, any, or none of the dimensions.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty,
        ) : GroupsProperty {
            /**
             * An array that defines the dimensions to include or exclude from the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-dimensions)
             */
            override fun dimensions(): Any? = unwrap(this).getDimensions()

            /**
             * The base segment to build the segment on.
             *
             * A base segment, also called a *source segment* , defines the initial population of
             * endpoints for a segment. When you add dimensions to the segment, Amazon Pinpoint
             * filters the base segment by using the dimensions that you specify.
             *
             * You can specify more than one dimensional segment or only one imported segment. If
             * you specify an imported segment, the segment size estimate that displays on the
             * Amazon Pinpoint console indicates the size of the imported segment without any
             * filters applied to it.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-sourcesegments)
             */
            override fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

            /**
             * Specifies how to handle multiple base segments for the segment.
             *
             * For example, if you specify three base segments for the segment, whether the
             * resulting segment is based on all, any, or none of the base segments.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-sourcetype)
             */
            override fun sourceType(): String? = unwrap(this).getSourceType()

            /**
             * Specifies how to handle multiple dimensions for the segment.
             *
             * For example, if you specify three dimensions for the segment, whether the resulting
             * segment includes endpoints that match all, any, or none of the dimensions.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html#cfn-pinpoint-segment-groups-type)
             */
            override fun type(): String? = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GroupsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty
            ): GroupsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GroupsProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AttributeDimensionProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html#cfn-pinpoint-segment-attributedimension-attributetype)
         */
        public fun attributeType(): String? = unwrap(this).getAttributeType()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html#cfn-pinpoint-segment-attributedimension-values)
         */
        public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

        /** A builder for [AttributeDimensionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param attributeType the value to be set. */
            public fun attributeType(attributeType: String)

            /** @param values the value to be set. */
            public fun values(values: List<String>)

            /** @param values the value to be set. */
            public fun values(vararg values: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty
                    .builder()

            /** @param attributeType the value to be set. */
            override fun attributeType(attributeType: String) {
                cdkBuilder.attributeType(attributeType)
            }

            /** @param values the value to be set. */
            override fun values(values: List<String>) {
                cdkBuilder.values(values)
            }

            /** @param values the value to be set. */
            override fun values(vararg values: String): Unit = values(values.toList())

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty,
        ) : AttributeDimensionProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html#cfn-pinpoint-segment-attributedimension-attributetype)
             */
            override fun attributeType(): String? = unwrap(this).getAttributeType()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html#cfn-pinpoint-segment-attributedimension-values)
             */
            override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDimensionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty
            ): AttributeDimensionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AttributeDimensionProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SegmentDimensionsProperty {
        /**
         * One or more custom attributes to use as criteria for the segment.
         *
         * For more information see
         * [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes)
         */
        public fun attributes(): Any? = unwrap(this).getAttributes()

        /**
         * The behavior-based criteria, such as how recently users have used your app, for the
         * segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-behavior)
         */
        public fun behavior(): Any? = unwrap(this).getBehavior()

        /**
         * The demographic-based criteria, such as device platform, for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-demographic)
         */
        public fun demographic(): Any? = unwrap(this).getDemographic()

        /**
         * The location-based criteria, such as region or GPS coordinates, for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-location)
         */
        public fun location(): Any? = unwrap(this).getLocation()

        /**
         * One or more custom metrics to use as criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics)
         */
        public fun metrics(): Any? = unwrap(this).getMetrics()

        /**
         * One or more custom user attributes to use as criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes)
         */
        public fun userAttributes(): Any? = unwrap(this).getUserAttributes()

        /** A builder for [SegmentDimensionsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param attributes One or more custom attributes to use as criteria for the segment.
             *   For more information see
             *   [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
             */
            public fun attributes(attributes: Any)

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            public fun behavior(behavior: IResolvable)

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            public fun behavior(behavior: BehaviorProperty)

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ae95bd65406a2e5e09a7c29b613743d86d3e37dc044d0d9cc2febffcd005ad68")
            public fun behavior(behavior: BehaviorProperty.Builder.() -> Unit)

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            public fun demographic(demographic: IResolvable)

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            public fun demographic(demographic: DemographicProperty)

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("69b2bab0965b363672304e7d1297fcf2f35c9a92e95ff9c1b3994510c9684037")
            public fun demographic(demographic: DemographicProperty.Builder.() -> Unit)

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            public fun location(location: IResolvable)

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            public fun location(location: LocationProperty)

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f0b209f7947f4e1b6e5a9f30d13e1cce22c3583e79da6055dfc8cc4b3ec3aedc")
            public fun location(location: LocationProperty.Builder.() -> Unit)

            /** @param metrics One or more custom metrics to use as criteria for the segment. */
            public fun metrics(metrics: Any)

            /**
             * @param userAttributes One or more custom user attributes to use as criteria for the
             *   segment.
             */
            public fun userAttributes(userAttributes: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty
                    .builder()

            /**
             * @param attributes One or more custom attributes to use as criteria for the segment.
             *   For more information see
             *   [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
             */
            override fun attributes(attributes: Any) {
                cdkBuilder.attributes(attributes)
            }

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            override fun behavior(behavior: IResolvable) {
                cdkBuilder.behavior(behavior.let(IResolvable::unwrap))
            }

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            override fun behavior(behavior: BehaviorProperty) {
                cdkBuilder.behavior(behavior.let(BehaviorProperty::unwrap))
            }

            /**
             * @param behavior The behavior-based criteria, such as how recently users have used
             *   your app, for the segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ae95bd65406a2e5e09a7c29b613743d86d3e37dc044d0d9cc2febffcd005ad68")
            override fun behavior(behavior: BehaviorProperty.Builder.() -> Unit): Unit =
                behavior(BehaviorProperty(behavior))

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            override fun demographic(demographic: IResolvable) {
                cdkBuilder.demographic(demographic.let(IResolvable::unwrap))
            }

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            override fun demographic(demographic: DemographicProperty) {
                cdkBuilder.demographic(demographic.let(DemographicProperty::unwrap))
            }

            /**
             * @param demographic The demographic-based criteria, such as device platform, for the
             *   segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("69b2bab0965b363672304e7d1297fcf2f35c9a92e95ff9c1b3994510c9684037")
            override fun demographic(demographic: DemographicProperty.Builder.() -> Unit): Unit =
                demographic(DemographicProperty(demographic))

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            override fun location(location: IResolvable) {
                cdkBuilder.location(location.let(IResolvable::unwrap))
            }

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            override fun location(location: LocationProperty) {
                cdkBuilder.location(location.let(LocationProperty::unwrap))
            }

            /**
             * @param location The location-based criteria, such as region or GPS coordinates, for
             *   the segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f0b209f7947f4e1b6e5a9f30d13e1cce22c3583e79da6055dfc8cc4b3ec3aedc")
            override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
                location(LocationProperty(location))

            /** @param metrics One or more custom metrics to use as criteria for the segment. */
            override fun metrics(metrics: Any) {
                cdkBuilder.metrics(metrics)
            }

            /**
             * @param userAttributes One or more custom user attributes to use as criteria for the
             *   segment.
             */
            override fun userAttributes(userAttributes: Any) {
                cdkBuilder.userAttributes(userAttributes)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty,
        ) : SegmentDimensionsProperty {
            /**
             * One or more custom attributes to use as criteria for the segment.
             *
             * For more information see
             * [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes)
             */
            override fun attributes(): Any? = unwrap(this).getAttributes()

            /**
             * The behavior-based criteria, such as how recently users have used your app, for the
             * segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-behavior)
             */
            override fun behavior(): Any? = unwrap(this).getBehavior()

            /**
             * The demographic-based criteria, such as device platform, for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-demographic)
             */
            override fun demographic(): Any? = unwrap(this).getDemographic()

            /**
             * The location-based criteria, such as region or GPS coordinates, for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-location)
             */
            override fun location(): Any? = unwrap(this).getLocation()

            /**
             * One or more custom metrics to use as criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics)
             */
            override fun metrics(): Any? = unwrap(this).getMetrics()

            /**
             * One or more custom user attributes to use as criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes)
             */
            override fun userAttributes(): Any? = unwrap(this).getUserAttributes()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SegmentDimensionsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty
            ): SegmentDimensionsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SegmentDimensionsProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SegmentGroupsProperty {
        /**
         * Specifies the set of segment criteria to evaluate when handling segment groups for the
         * segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups)
         */
        public fun groups(): Any? = unwrap(this).getGroups()

        /**
         * Specifies how to handle multiple segment groups for the segment.
         *
         * For example, if the segment includes three segment groups, whether the resulting segment
         * includes endpoints that match all, any, or none of the segment groups.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include)
         */
        public fun include(): String? = unwrap(this).getInclude()

        /** A builder for [SegmentGroupsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            public fun groups(groups: IResolvable)

            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            public fun groups(groups: List<Any>)

            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            public fun groups(vararg groups: Any)

            /**
             * @param include Specifies how to handle multiple segment groups for the segment. For
             *   example, if the segment includes three segment groups, whether the resulting
             *   segment includes endpoints that match all, any, or none of the segment groups.
             */
            public fun include(include: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty.builder()

            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            override fun groups(groups: IResolvable) {
                cdkBuilder.groups(groups.let(IResolvable::unwrap))
            }

            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            override fun groups(groups: List<Any>) {
                cdkBuilder.groups(groups)
            }

            /**
             * @param groups Specifies the set of segment criteria to evaluate when handling segment
             *   groups for the segment.
             */
            override fun groups(vararg groups: Any): Unit = groups(groups.toList())

            /**
             * @param include Specifies how to handle multiple segment groups for the segment. For
             *   example, if the segment includes three segment groups, whether the resulting
             *   segment includes endpoints that match all, any, or none of the segment groups.
             */
            override fun include(include: String) {
                cdkBuilder.include(include)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty,
        ) : SegmentGroupsProperty {
            /**
             * Specifies the set of segment criteria to evaluate when handling segment groups for
             * the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups)
             */
            override fun groups(): Any? = unwrap(this).getGroups()

            /**
             * Specifies how to handle multiple segment groups for the segment.
             *
             * For example, if the segment includes three segment groups, whether the resulting
             * segment includes endpoints that match all, any, or none of the segment groups.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include)
             */
            override fun include(): String? = unwrap(this).getInclude()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SegmentGroupsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty
            ): SegmentGroupsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SegmentGroupsProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LocationProperty {
        /**
         * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html#cfn-pinpoint-segment-location-country)
         */
        public fun country(): Any? = unwrap(this).getCountry()

        /**
         * The GPS point dimension for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html#cfn-pinpoint-segment-location-gpspoint)
         */
        public fun gpsPoint(): Any? = unwrap(this).getGpsPoint()

        /** A builder for [LocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            public fun country(country: IResolvable)

            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            public fun country(country: SetDimensionProperty)

            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("16f2c23a3efd8caa63761821f79f5e5ac9855184b3fa61f098d320d5d80b9ff9")
            public fun country(country: SetDimensionProperty.Builder.() -> Unit)

            /** @param gpsPoint The GPS point dimension for the segment. */
            public fun gpsPoint(gpsPoint: IResolvable)

            /** @param gpsPoint The GPS point dimension for the segment. */
            public fun gpsPoint(gpsPoint: GPSPointProperty)

            /** @param gpsPoint The GPS point dimension for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("823d386aae3d6722b4591e67f72c640b6d7c7077d4e566b2e7aeba751ec04aea")
            public fun gpsPoint(gpsPoint: GPSPointProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty.builder()

            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            override fun country(country: IResolvable) {
                cdkBuilder.country(country.let(IResolvable::unwrap))
            }

            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            override fun country(country: SetDimensionProperty) {
                cdkBuilder.country(country.let(SetDimensionProperty::unwrap))
            }

            /**
             * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the
             *   segment.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("16f2c23a3efd8caa63761821f79f5e5ac9855184b3fa61f098d320d5d80b9ff9")
            override fun country(country: SetDimensionProperty.Builder.() -> Unit): Unit =
                country(SetDimensionProperty(country))

            /** @param gpsPoint The GPS point dimension for the segment. */
            override fun gpsPoint(gpsPoint: IResolvable) {
                cdkBuilder.gpsPoint(gpsPoint.let(IResolvable::unwrap))
            }

            /** @param gpsPoint The GPS point dimension for the segment. */
            override fun gpsPoint(gpsPoint: GPSPointProperty) {
                cdkBuilder.gpsPoint(gpsPoint.let(GPSPointProperty::unwrap))
            }

            /** @param gpsPoint The GPS point dimension for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("823d386aae3d6722b4591e67f72c640b6d7c7077d4e566b2e7aeba751ec04aea")
            override fun gpsPoint(gpsPoint: GPSPointProperty.Builder.() -> Unit): Unit =
                gpsPoint(GPSPointProperty(gpsPoint))

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty,
        ) : LocationProperty {
            /**
             * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html#cfn-pinpoint-segment-location-country)
             */
            override fun country(): Any? = unwrap(this).getCountry()

            /**
             * The GPS point dimension for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html#cfn-pinpoint-segment-location-gpspoint)
             */
            override fun gpsPoint(): Any? = unwrap(this).getGpsPoint()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty
            ): LocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LocationProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GPSPointProperty {
        /**
         * The GPS coordinates to measure distance from.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-gpspoint.html#cfn-pinpoint-segment-gpspoint-coordinates)
         */
        public fun coordinates(): Any

        /**
         * The range, in kilometers, from the GPS coordinates.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-gpspoint.html#cfn-pinpoint-segment-gpspoint-rangeinkilometers)
         */
        public fun rangeInKilometers(): Number

        /** A builder for [GPSPointProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param coordinates The GPS coordinates to measure distance from. */
            public fun coordinates(coordinates: IResolvable)

            /** @param coordinates The GPS coordinates to measure distance from. */
            public fun coordinates(coordinates: CoordinatesProperty)

            /** @param coordinates The GPS coordinates to measure distance from. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c7d7d71717832380717e0035b56e17867d611051035eed7ca06df7d996d74b22")
            public fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit)

            /** @param rangeInKilometers The range, in kilometers, from the GPS coordinates. */
            public fun rangeInKilometers(rangeInKilometers: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.builder()

            /** @param coordinates The GPS coordinates to measure distance from. */
            override fun coordinates(coordinates: IResolvable) {
                cdkBuilder.coordinates(coordinates.let(IResolvable::unwrap))
            }

            /** @param coordinates The GPS coordinates to measure distance from. */
            override fun coordinates(coordinates: CoordinatesProperty) {
                cdkBuilder.coordinates(coordinates.let(CoordinatesProperty::unwrap))
            }

            /** @param coordinates The GPS coordinates to measure distance from. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c7d7d71717832380717e0035b56e17867d611051035eed7ca06df7d996d74b22")
            override fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit): Unit =
                coordinates(CoordinatesProperty(coordinates))

            /** @param rangeInKilometers The range, in kilometers, from the GPS coordinates. */
            override fun rangeInKilometers(rangeInKilometers: Number) {
                cdkBuilder.rangeInKilometers(rangeInKilometers)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty,
        ) : GPSPointProperty {
            /**
             * The GPS coordinates to measure distance from.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-gpspoint.html#cfn-pinpoint-segment-gpspoint-coordinates)
             */
            override fun coordinates(): Any = unwrap(this).getCoordinates()

            /**
             * The range, in kilometers, from the GPS coordinates.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-gpspoint.html#cfn-pinpoint-segment-gpspoint-rangeinkilometers)
             */
            override fun rangeInKilometers(): Number = unwrap(this).getRangeInKilometers()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GPSPointProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty
            ): GPSPointProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GPSPointProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SourceSegmentsProperty {
        /**
         * The unique identifier for the source segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html#cfn-pinpoint-segment-sourcesegments-id)
         */
        public fun id(): String

        /**
         * The version number of the source segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html#cfn-pinpoint-segment-sourcesegments-version)
         */
        public fun version(): Number? = unwrap(this).getVersion()

        /** A builder for [SourceSegmentsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param id The unique identifier for the source segment. */
            public fun id(id: String)

            /** @param version The version number of the source segment. */
            public fun version(version: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.builder()

            /** @param id The unique identifier for the source segment. */
            override fun id(id: String) {
                cdkBuilder.id(id)
            }

            /** @param version The version number of the source segment. */
            override fun version(version: Number) {
                cdkBuilder.version(version)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty,
        ) : SourceSegmentsProperty {
            /**
             * The unique identifier for the source segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html#cfn-pinpoint-segment-sourcesegments-id)
             */
            override fun id(): String = unwrap(this).getId()

            /**
             * The version number of the source segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html#cfn-pinpoint-segment-sourcesegments-version)
             */
            override fun version(): Number? = unwrap(this).getVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SourceSegmentsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty
            ): SourceSegmentsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SourceSegmentsProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DemographicProperty {
        /**
         * The app version criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-appversion)
         */
        public fun appVersion(): Any? = unwrap(this).getAppVersion()

        /**
         * The channel criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-channel)
         */
        public fun channel(): Any? = unwrap(this).getChannel()

        /**
         * The device type criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-devicetype)
         */
        public fun deviceType(): Any? = unwrap(this).getDeviceType()

        /**
         * The device make criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-make)
         */
        public fun make(): Any? = unwrap(this).getMake()

        /**
         * The device model criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-model)
         */
        public fun model(): Any? = unwrap(this).getModel()

        /**
         * The device platform criteria for the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-platform)
         */
        public fun platform(): Any? = unwrap(this).getPlatform()

        /** A builder for [DemographicProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param appVersion The app version criteria for the segment. */
            public fun appVersion(appVersion: IResolvable)

            /** @param appVersion The app version criteria for the segment. */
            public fun appVersion(appVersion: SetDimensionProperty)

            /** @param appVersion The app version criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3cdbe321b533a2244e7cfb7b2dc41a4d1ec18b37de4450c57ee36b2362d74407")
            public fun appVersion(appVersion: SetDimensionProperty.Builder.() -> Unit)

            /** @param channel The channel criteria for the segment. */
            public fun channel(channel: IResolvable)

            /** @param channel The channel criteria for the segment. */
            public fun channel(channel: SetDimensionProperty)

            /** @param channel The channel criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d4ae95fd8f8f0a81e2699d160383ebd1b5666aed92847710237c8885ecfbc6f0")
            public fun channel(channel: SetDimensionProperty.Builder.() -> Unit)

            /** @param deviceType The device type criteria for the segment. */
            public fun deviceType(deviceType: IResolvable)

            /** @param deviceType The device type criteria for the segment. */
            public fun deviceType(deviceType: SetDimensionProperty)

            /** @param deviceType The device type criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0becdead57f17835365d8b71d99bee111ee48fa40fb463f780d03fce80f351e1")
            public fun deviceType(deviceType: SetDimensionProperty.Builder.() -> Unit)

            /** @param make The device make criteria for the segment. */
            public fun make(make: IResolvable)

            /** @param make The device make criteria for the segment. */
            public fun make(make: SetDimensionProperty)

            /** @param make The device make criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("56e8b3ed5f07e23f3a5bfe14b907430eb6400e88a6fae67171fb39d214231cb4")
            public fun make(make: SetDimensionProperty.Builder.() -> Unit)

            /** @param model The device model criteria for the segment. */
            public fun model(model: IResolvable)

            /** @param model The device model criteria for the segment. */
            public fun model(model: SetDimensionProperty)

            /** @param model The device model criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("44c0acbfc9cc551ae612d254946305d0a93a9983fec0b33c4370a0a2b00df946")
            public fun model(model: SetDimensionProperty.Builder.() -> Unit)

            /** @param platform The device platform criteria for the segment. */
            public fun platform(platform: IResolvable)

            /** @param platform The device platform criteria for the segment. */
            public fun platform(platform: SetDimensionProperty)

            /** @param platform The device platform criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("759701803e587f7cc2fdf4f7f1bf1723587e07c00f62e28b6af77b867f681988")
            public fun platform(platform: SetDimensionProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty.builder()

            /** @param appVersion The app version criteria for the segment. */
            override fun appVersion(appVersion: IResolvable) {
                cdkBuilder.appVersion(appVersion.let(IResolvable::unwrap))
            }

            /** @param appVersion The app version criteria for the segment. */
            override fun appVersion(appVersion: SetDimensionProperty) {
                cdkBuilder.appVersion(appVersion.let(SetDimensionProperty::unwrap))
            }

            /** @param appVersion The app version criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3cdbe321b533a2244e7cfb7b2dc41a4d1ec18b37de4450c57ee36b2362d74407")
            override fun appVersion(appVersion: SetDimensionProperty.Builder.() -> Unit): Unit =
                appVersion(SetDimensionProperty(appVersion))

            /** @param channel The channel criteria for the segment. */
            override fun channel(channel: IResolvable) {
                cdkBuilder.channel(channel.let(IResolvable::unwrap))
            }

            /** @param channel The channel criteria for the segment. */
            override fun channel(channel: SetDimensionProperty) {
                cdkBuilder.channel(channel.let(SetDimensionProperty::unwrap))
            }

            /** @param channel The channel criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d4ae95fd8f8f0a81e2699d160383ebd1b5666aed92847710237c8885ecfbc6f0")
            override fun channel(channel: SetDimensionProperty.Builder.() -> Unit): Unit =
                channel(SetDimensionProperty(channel))

            /** @param deviceType The device type criteria for the segment. */
            override fun deviceType(deviceType: IResolvable) {
                cdkBuilder.deviceType(deviceType.let(IResolvable::unwrap))
            }

            /** @param deviceType The device type criteria for the segment. */
            override fun deviceType(deviceType: SetDimensionProperty) {
                cdkBuilder.deviceType(deviceType.let(SetDimensionProperty::unwrap))
            }

            /** @param deviceType The device type criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0becdead57f17835365d8b71d99bee111ee48fa40fb463f780d03fce80f351e1")
            override fun deviceType(deviceType: SetDimensionProperty.Builder.() -> Unit): Unit =
                deviceType(SetDimensionProperty(deviceType))

            /** @param make The device make criteria for the segment. */
            override fun make(make: IResolvable) {
                cdkBuilder.make(make.let(IResolvable::unwrap))
            }

            /** @param make The device make criteria for the segment. */
            override fun make(make: SetDimensionProperty) {
                cdkBuilder.make(make.let(SetDimensionProperty::unwrap))
            }

            /** @param make The device make criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("56e8b3ed5f07e23f3a5bfe14b907430eb6400e88a6fae67171fb39d214231cb4")
            override fun make(make: SetDimensionProperty.Builder.() -> Unit): Unit =
                make(SetDimensionProperty(make))

            /** @param model The device model criteria for the segment. */
            override fun model(model: IResolvable) {
                cdkBuilder.model(model.let(IResolvable::unwrap))
            }

            /** @param model The device model criteria for the segment. */
            override fun model(model: SetDimensionProperty) {
                cdkBuilder.model(model.let(SetDimensionProperty::unwrap))
            }

            /** @param model The device model criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("44c0acbfc9cc551ae612d254946305d0a93a9983fec0b33c4370a0a2b00df946")
            override fun model(model: SetDimensionProperty.Builder.() -> Unit): Unit =
                model(SetDimensionProperty(model))

            /** @param platform The device platform criteria for the segment. */
            override fun platform(platform: IResolvable) {
                cdkBuilder.platform(platform.let(IResolvable::unwrap))
            }

            /** @param platform The device platform criteria for the segment. */
            override fun platform(platform: SetDimensionProperty) {
                cdkBuilder.platform(platform.let(SetDimensionProperty::unwrap))
            }

            /** @param platform The device platform criteria for the segment. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("759701803e587f7cc2fdf4f7f1bf1723587e07c00f62e28b6af77b867f681988")
            override fun platform(platform: SetDimensionProperty.Builder.() -> Unit): Unit =
                platform(SetDimensionProperty(platform))

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty,
        ) : DemographicProperty {
            /**
             * The app version criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-appversion)
             */
            override fun appVersion(): Any? = unwrap(this).getAppVersion()

            /**
             * The channel criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-channel)
             */
            override fun channel(): Any? = unwrap(this).getChannel()

            /**
             * The device type criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-devicetype)
             */
            override fun deviceType(): Any? = unwrap(this).getDeviceType()

            /**
             * The device make criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-make)
             */
            override fun make(): Any? = unwrap(this).getMake()

            /**
             * The device model criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-model)
             */
            override fun model(): Any? = unwrap(this).getModel()

            /**
             * The device platform criteria for the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html#cfn-pinpoint-segment-demographic-platform)
             */
            override fun platform(): Any? = unwrap(this).getPlatform()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DemographicProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty
            ): DemographicProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DemographicProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BehaviorProperty {
        /**
         * Specifies how recently segment members were active.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-behavior.html#cfn-pinpoint-segment-behavior-recency)
         */
        public fun recency(): Any? = unwrap(this).getRecency()

        /** A builder for [BehaviorProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param recency Specifies how recently segment members were active. */
            public fun recency(recency: IResolvable)

            /** @param recency Specifies how recently segment members were active. */
            public fun recency(recency: RecencyProperty)

            /** @param recency Specifies how recently segment members were active. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9a02e7a3b0b05f0794aedf261afe400f20852aa041843a293b845a54c5c749d4")
            public fun recency(recency: RecencyProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty.builder()

            /** @param recency Specifies how recently segment members were active. */
            override fun recency(recency: IResolvable) {
                cdkBuilder.recency(recency.let(IResolvable::unwrap))
            }

            /** @param recency Specifies how recently segment members were active. */
            override fun recency(recency: RecencyProperty) {
                cdkBuilder.recency(recency.let(RecencyProperty::unwrap))
            }

            /** @param recency Specifies how recently segment members were active. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9a02e7a3b0b05f0794aedf261afe400f20852aa041843a293b845a54c5c749d4")
            override fun recency(recency: RecencyProperty.Builder.() -> Unit): Unit =
                recency(RecencyProperty(recency))

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty,
        ) : BehaviorProperty {
            /**
             * Specifies how recently segment members were active.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-behavior.html#cfn-pinpoint-segment-behavior-recency)
             */
            override fun recency(): Any? = unwrap(this).getRecency()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty
            ): BehaviorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BehaviorProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SetDimensionProperty {
        /**
         * The type of segment dimension to use.
         *
         * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
         * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the
         * segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html#cfn-pinpoint-segment-setdimension-dimensiontype)
         */
        public fun dimensionType(): String? = unwrap(this).getDimensionType()

        /**
         * The criteria values to use for the segment dimension.
         *
         * Depending on the value of the `DimensionType` property, endpoints are included or
         * excluded from the segment if their values match the criteria values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html#cfn-pinpoint-segment-setdimension-values)
         */
        public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

        /** A builder for [SetDimensionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensionType The type of segment dimension to use. Valid values are:
             *   `INCLUSIVE` , endpoints that match the criteria are included in the segment; and,
             *   `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
             */
            public fun dimensionType(dimensionType: String)

            /**
             * @param values The criteria values to use for the segment dimension. Depending on the
             *   value of the `DimensionType` property, endpoints are included or excluded from the
             *   segment if their values match the criteria values.
             */
            public fun values(values: List<String>)

            /**
             * @param values The criteria values to use for the segment dimension. Depending on the
             *   value of the `DimensionType` property, endpoints are included or excluded from the
             *   segment if their values match the criteria values.
             */
            public fun values(vararg values: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty.builder()

            /**
             * @param dimensionType The type of segment dimension to use. Valid values are:
             *   `INCLUSIVE` , endpoints that match the criteria are included in the segment; and,
             *   `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
             */
            override fun dimensionType(dimensionType: String) {
                cdkBuilder.dimensionType(dimensionType)
            }

            /**
             * @param values The criteria values to use for the segment dimension. Depending on the
             *   value of the `DimensionType` property, endpoints are included or excluded from the
             *   segment if their values match the criteria values.
             */
            override fun values(values: List<String>) {
                cdkBuilder.values(values)
            }

            /**
             * @param values The criteria values to use for the segment dimension. Depending on the
             *   value of the `DimensionType` property, endpoints are included or excluded from the
             *   segment if their values match the criteria values.
             */
            override fun values(vararg values: String): Unit = values(values.toList())

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty,
        ) : SetDimensionProperty {
            /**
             * The type of segment dimension to use.
             *
             * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the
             * segment; and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the
             * segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html#cfn-pinpoint-segment-setdimension-dimensiontype)
             */
            override fun dimensionType(): String? = unwrap(this).getDimensionType()

            /**
             * The criteria values to use for the segment dimension.
             *
             * Depending on the value of the `DimensionType` property, endpoints are included or
             * excluded from the segment if their values match the criteria values.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html#cfn-pinpoint-segment-setdimension-values)
             */
            override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SetDimensionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty
            ): SetDimensionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SetDimensionProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CoordinatesProperty {
        /**
         * The latitude coordinate of the location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html#cfn-pinpoint-segment-coordinates-latitude)
         */
        public fun latitude(): Number

        /**
         * The longitude coordinate of the location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html#cfn-pinpoint-segment-coordinates-longitude)
         */
        public fun longitude(): Number

        /** A builder for [CoordinatesProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param latitude The latitude coordinate of the location. */
            public fun latitude(latitude: Number)

            /** @param longitude The longitude coordinate of the location. */
            public fun longitude(longitude: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.builder()

            /** @param latitude The latitude coordinate of the location. */
            override fun latitude(latitude: Number) {
                cdkBuilder.latitude(latitude)
            }

            /** @param longitude The longitude coordinate of the location. */
            override fun longitude(longitude: Number) {
                cdkBuilder.longitude(longitude)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty,
        ) : CoordinatesProperty {
            /**
             * The latitude coordinate of the location.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html#cfn-pinpoint-segment-coordinates-latitude)
             */
            override fun latitude(): Number = unwrap(this).getLatitude()

            /**
             * The longitude coordinate of the location.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html#cfn-pinpoint-segment-coordinates-longitude)
             */
            override fun longitude(): Number = unwrap(this).getLongitude()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CoordinatesProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty
            ): CoordinatesProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CoordinatesProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RecencyProperty {
        /**
         * The duration to use when determining which users have been active or inactive with your
         * app.
         *
         * Possible values: `HR_24` | `DAY_7` | `DAY_14` | `DAY_30` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-recency.html#cfn-pinpoint-segment-recency-duration)
         */
        public fun duration(): String

        /**
         * The type of recency dimension to use for the segment.
         *
         * Valid values are: `ACTIVE` and `INACTIVE` . If the value is `ACTIVE` , the segment
         * includes users who have used your app within the specified duration are included in the
         * segment. If the value is `INACTIVE` , the segment includes users who haven't used your
         * app within the specified duration are included in the segment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-recency.html#cfn-pinpoint-segment-recency-recencytype)
         */
        public fun recencyType(): String

        /** A builder for [RecencyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param duration The duration to use when determining which users have been active or
             *   inactive with your app. Possible values: `HR_24` | `DAY_7` | `DAY_14` | `DAY_30` .
             */
            public fun duration(duration: String)

            /**
             * @param recencyType The type of recency dimension to use for the segment. Valid values
             *   are: `ACTIVE` and `INACTIVE` . If the value is `ACTIVE` , the segment includes
             *   users who have used your app within the specified duration are included in the
             *   segment. If the value is `INACTIVE` , the segment includes users who haven't used
             *   your app within the specified duration are included in the segment.
             */
            public fun recencyType(recencyType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.Builder =
                software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.builder()

            /**
             * @param duration The duration to use when determining which users have been active or
             *   inactive with your app. Possible values: `HR_24` | `DAY_7` | `DAY_14` | `DAY_30` .
             */
            override fun duration(duration: String) {
                cdkBuilder.duration(duration)
            }

            /**
             * @param recencyType The type of recency dimension to use for the segment. Valid values
             *   are: `ACTIVE` and `INACTIVE` . If the value is `ACTIVE` , the segment includes
             *   users who have used your app within the specified duration are included in the
             *   segment. If the value is `INACTIVE` , the segment includes users who haven't used
             *   your app within the specified duration are included in the segment.
             */
            override fun recencyType(recencyType: String) {
                cdkBuilder.recencyType(recencyType)
            }

            public fun build():
                software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty,
        ) : RecencyProperty {
            /**
             * The duration to use when determining which users have been active or inactive with
             * your app.
             *
             * Possible values: `HR_24` | `DAY_7` | `DAY_14` | `DAY_30` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-recency.html#cfn-pinpoint-segment-recency-duration)
             */
            override fun duration(): String = unwrap(this).getDuration()

            /**
             * The type of recency dimension to use for the segment.
             *
             * Valid values are: `ACTIVE` and `INACTIVE` . If the value is `ACTIVE` , the segment
             * includes users who have used your app within the specified duration are included in
             * the segment. If the value is `INACTIVE` , the segment includes users who haven't used
             * your app within the specified duration are included in the segment.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-recency.html#cfn-pinpoint-segment-recency-recencytype)
             */
            override fun recencyType(): String = unwrap(this).getRecencyType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RecencyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty
            ): RecencyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RecencyProperty
            ): software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
