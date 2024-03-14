package io.cloudshiftdev.awscdk.services.s3

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

public open class CfnStorageLensGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** The ARN for the Amazon S3 Storage Lens Group. */
    public open fun attrStorageLensGroupArn(): String = unwrap(this).getAttrStorageLensGroupArn()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** This property contains the criteria for the Storage Lens group data that is displayed. */
    public open fun filter(): Any = unwrap(this).getFilter()

    /** This property contains the criteria for the Storage Lens group data that is displayed. */
    public open fun filter(`value`: IResolvable) {
        unwrap(this).setFilter(`value`.let(IResolvable::unwrap))
    }

    /** This property contains the criteria for the Storage Lens group data that is displayed. */
    public open fun filter(`value`: FilterProperty) {
        unwrap(this).setFilter(`value`.let(FilterProperty::unwrap))
    }

    /** This property contains the criteria for the Storage Lens group data that is displayed. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93aa2ef9341a0c2b54d4fe07b6cbcddfcdfdd84804088936fc0230d58d9e0bbe")
    public open fun filter(`value`: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** This property contains the Storage Lens group name. */
    public open fun name(): String = unwrap(this).getName()

    /** This property contains the Storage Lens group name. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnStorageLensGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        public fun filter(filter: IResolvable)

        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        public fun filter(filter: FilterProperty)

        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
        public fun filter(filter: FilterProperty.Builder.() -> Unit)

        /**
         * This property contains the Storage Lens group name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
         *
         * @param name This property contains the Storage Lens group name.
         */
        public fun name(name: String)

        /**
         * This property contains the AWS resource tags that you're adding to your Storage Lens
         * group.
         *
         * This parameter is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
         *
         * @param tags This property contains the AWS resource tags that you're adding to your
         *   Storage Lens group.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * This property contains the AWS resource tags that you're adding to your Storage Lens
         * group.
         *
         * This parameter is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
         *
         * @param tags This property contains the AWS resource tags that you're adding to your
         *   Storage Lens group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder =
            software.amazon.awscdk.services.s3.CfnStorageLensGroup.Builder.create(scope, id)

        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        override fun filter(filter: IResolvable) {
            cdkBuilder.filter(filter.let(IResolvable::unwrap))
        }

        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        override fun filter(filter: FilterProperty) {
            cdkBuilder.filter(filter.let(FilterProperty::unwrap))
        }

        /**
         * This property contains the criteria for the Storage Lens group data that is displayed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
         *
         * @param filter This property contains the criteria for the Storage Lens group data that is
         *   displayed.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5c34696e4ff5fce73c11267bb9ecec49746863e32f72ce78d842b72a32fc8d70")
        override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
            filter(FilterProperty(filter))

        /**
         * This property contains the Storage Lens group name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
         *
         * @param name This property contains the Storage Lens group name.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * This property contains the AWS resource tags that you're adding to your Storage Lens
         * group.
         *
         * This parameter is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
         *
         * @param tags This property contains the AWS resource tags that you're adding to your
         *   Storage Lens group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * This property contains the AWS resource tags that you're adding to your Storage Lens
         * group.
         *
         * This parameter is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
         *
         * @param tags This property contains the AWS resource tags that you're adding to your
         *   Storage Lens group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStorageLensGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStorageLensGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup
        ): CfnStorageLensGroup = CfnStorageLensGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnStorageLensGroup
        ): software.amazon.awscdk.services.s3.CfnStorageLensGroup = wrapped.cdkObject
    }

    public interface AndProperty {
        /**
         * This property contains a list of prefixes.
         *
         * At least one prefix must be specified. Up to 10 prefixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanyprefix)
         */
        public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

        /**
         * This property contains a list of suffixes.
         *
         * At least one suffix must be specified. Up to 10 suffixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanysuffix)
         */
        public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

        /**
         * This property contains the list of object tags.
         *
         * At least one object tag must be specified. Up to 10 object tags are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanytag)
         */
        public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

        /**
         * This property contains `DaysGreaterThan` and `DaysLessThan` properties to define the
         * object age range (minimum and maximum number of days).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectage)
         */
        public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

        /**
         * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size
         * range (minimum and maximum number of Bytes).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectsize)
         */
        public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

        /** A builder for [AndProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(matchAnyPrefix: List<String>)

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(vararg matchAnyPrefix: String)

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(matchAnySuffix: List<String>)

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(vararg matchAnySuffix: String)

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: IResolvable)

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: List<Any>)

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(vararg matchAnyTag: Any)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            public fun matchObjectAge(matchObjectAge: IResolvable)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: IResolvable)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty.builder()

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
                cdkBuilder.matchAnyPrefix(matchAnyPrefix)
            }

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
                matchAnyPrefix(matchAnyPrefix.toList())

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(matchAnySuffix: List<String>) {
                cdkBuilder.matchAnySuffix(matchAnySuffix)
            }

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
                matchAnySuffix(matchAnySuffix.toList())

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: IResolvable) {
                cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
            }

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: List<Any>) {
                cdkBuilder.matchAnyTag(matchAnyTag)
            }

            /**
             * @param matchAnyTag This property contains the list of object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(vararg matchAnyTag: Any): Unit =
                matchAnyTag(matchAnyTag.toList())

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            override fun matchObjectAge(matchObjectAge: IResolvable) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
            }

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan`
             *   properties to define the object age range (minimum and maximum number of days).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("21a4fa559dd0f84f70eb21b6acabd82bd3fab9b7a2d33266d9d1c2f0808e3bdf")
            override fun matchObjectAge(
                matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit
            ): Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: IResolvable) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
            }

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("398b5e25549a7d2a421e6d3dce560942f00e9340306175234463ccbfc9696d0e")
            override fun matchObjectSize(
                matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit
            ): Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

            public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty,
        ) : AndProperty {
            /**
             * This property contains a list of prefixes.
             *
             * At least one prefix must be specified. Up to 10 prefixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanyprefix)
             */
            override fun matchAnyPrefix(): List<String> =
                unwrap(this).getMatchAnyPrefix() ?: emptyList()

            /**
             * This property contains a list of suffixes.
             *
             * At least one suffix must be specified. Up to 10 suffixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanysuffix)
             */
            override fun matchAnySuffix(): List<String> =
                unwrap(this).getMatchAnySuffix() ?: emptyList()

            /**
             * This property contains the list of object tags.
             *
             * At least one object tag must be specified. Up to 10 object tags are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchanytag)
             */
            override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

            /**
             * This property contains `DaysGreaterThan` and `DaysLessThan` properties to define the
             * object age range (minimum and maximum number of days).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectage)
             */
            override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

            /**
             * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object
             * size range (minimum and maximum number of Bytes).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html#cfn-s3-storagelensgroup-and-matchobjectsize)
             */
            override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AndProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty
            ): AndProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AndProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLensGroup.AndProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MatchObjectSizeProperty {
        /**
         * This property specifies the minimum object size in bytes.
         *
         * The value must be a positive number, greater than 0 and less than 5 TB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-bytesgreaterthan)
         */
        public fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

        /**
         * This property specifies the maximum object size in bytes.
         *
         * The value must be a positive number, greater than the minimum object size and less than 5
         * TB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-byteslessthan)
         */
        public fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()

        /** A builder for [MatchObjectSizeProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bytesGreaterThan This property specifies the minimum object size in bytes. The
             *   value must be a positive number, greater than 0 and less than 5 TB.
             */
            public fun bytesGreaterThan(bytesGreaterThan: Number)

            /**
             * @param bytesLessThan This property specifies the maximum object size in bytes. The
             *   value must be a positive number, greater than the minimum object size and less than
             *   5 TB.
             */
            public fun bytesLessThan(bytesLessThan: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty
                    .builder()

            /**
             * @param bytesGreaterThan This property specifies the minimum object size in bytes. The
             *   value must be a positive number, greater than 0 and less than 5 TB.
             */
            override fun bytesGreaterThan(bytesGreaterThan: Number) {
                cdkBuilder.bytesGreaterThan(bytesGreaterThan)
            }

            /**
             * @param bytesLessThan This property specifies the maximum object size in bytes. The
             *   value must be a positive number, greater than the minimum object size and less than
             *   5 TB.
             */
            override fun bytesLessThan(bytesLessThan: Number) {
                cdkBuilder.bytesLessThan(bytesLessThan)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty,
        ) : MatchObjectSizeProperty {
            /**
             * This property specifies the minimum object size in bytes.
             *
             * The value must be a positive number, greater than 0 and less than 5 TB.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-bytesgreaterthan)
             */
            override fun bytesGreaterThan(): Number? = unwrap(this).getBytesGreaterThan()

            /**
             * This property specifies the maximum object size in bytes.
             *
             * The value must be a positive number, greater than the minimum object size and less
             * than 5 TB.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html#cfn-s3-storagelensgroup-matchobjectsize-byteslessthan)
             */
            override fun bytesLessThan(): Number? = unwrap(this).getBytesLessThan()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectSizeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty
            ): MatchObjectSizeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MatchObjectSizeProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectSizeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FilterProperty {
        /**
         * This property contains the `And` logical operator, which allows multiple filter
         * conditions to be joined for more complex comparisons of Storage Lens group data.
         *
         * Objects must match all of the listed filter conditions that are joined by the `And`
         * logical operator. Only one of each filter condition is allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-and)
         */
        public fun and(): Any? = unwrap(this).getAnd()

        /**
         * This property contains a list of prefixes.
         *
         * At least one prefix must be specified. Up to 10 prefixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanyprefix)
         */
        public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

        /**
         * This property contains a list of suffixes.
         *
         * At least one suffix must be specified. Up to 10 suffixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanysuffix)
         */
        public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

        /**
         * This property contains the list of S3 object tags.
         *
         * At least one object tag must be specified. Up to 10 object tags are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanytag)
         */
        public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

        /**
         * This property contains `DaysGreaterThan` and `DaysLessThan` to define the object age
         * range (minimum and maximum number of days).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectage)
         */
        public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

        /**
         * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object size
         * range (minimum and maximum number of Bytes).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectsize)
         */
        public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

        /**
         * This property contains the `Or` logical operator, which allows multiple filter conditions
         * to be joined.
         *
         * Objects can match any of the listed filter conditions, which are joined by the `Or`
         * logical operator. Only one of each filter condition is allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-or)
         */
        public fun or(): Any? = unwrap(this).getOr()

        /** A builder for [FilterProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            public fun and(and: IResolvable)

            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            public fun and(and: AndProperty)

            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
            public fun and(and: AndProperty.Builder.() -> Unit)

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(matchAnyPrefix: List<String>)

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(vararg matchAnyPrefix: String)

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(matchAnySuffix: List<String>)

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(vararg matchAnySuffix: String)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: IResolvable)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: List<Any>)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(vararg matchAnyTag: Any)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            public fun matchObjectAge(matchObjectAge: IResolvable)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: IResolvable)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            public fun or(or: IResolvable)

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            public fun or(or: OrProperty)

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
            public fun or(or: OrProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty.builder()

            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            override fun and(and: IResolvable) {
                cdkBuilder.and(and.let(IResolvable::unwrap))
            }

            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            override fun and(and: AndProperty) {
                cdkBuilder.and(and.let(AndProperty::unwrap))
            }

            /**
             * @param and This property contains the `And` logical operator, which allows multiple
             *   filter conditions to be joined for more complex comparisons of Storage Lens group
             *   data. Objects must match all of the listed filter conditions that are joined by the
             *   `And` logical operator. Only one of each filter condition is allowed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8259494a2cacbf55c2d9eecc3c1db3f0c42e4d2fad18f33631bfe3dce54bd1de")
            override fun and(and: AndProperty.Builder.() -> Unit): Unit = and(AndProperty(and))

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
                cdkBuilder.matchAnyPrefix(matchAnyPrefix)
            }

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
                matchAnyPrefix(matchAnyPrefix.toList())

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(matchAnySuffix: List<String>) {
                cdkBuilder.matchAnySuffix(matchAnySuffix)
            }

            /**
             * @param matchAnySuffix This property contains a list of suffixes. At least one suffix
             *   must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
                matchAnySuffix(matchAnySuffix.toList())

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: IResolvable) {
                cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
            }

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: List<Any>) {
                cdkBuilder.matchAnyTag(matchAnyTag)
            }

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(vararg matchAnyTag: Any): Unit =
                matchAnyTag(matchAnyTag.toList())

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            override fun matchObjectAge(matchObjectAge: IResolvable) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
            }

            /**
             * @param matchObjectAge This property contains `DaysGreaterThan` and `DaysLessThan` to
             *   define the object age range (minimum and maximum number of days).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2a55b3de097cb341cba35867de233fbd2f4652512602b74359191714147a4418")
            override fun matchObjectAge(
                matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit
            ): Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: IResolvable) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
            }

            /**
             * @param matchObjectSize This property contains `BytesGreaterThan` and `BytesLessThan`
             *   to define the object size range (minimum and maximum number of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f4a34bb12ec372dd70248acf7014788636043e222d8596e1031f7067a18536f8")
            override fun matchObjectSize(
                matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit
            ): Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            override fun or(or: IResolvable) {
                cdkBuilder.or(or.let(IResolvable::unwrap))
            }

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            override fun or(or: OrProperty) {
                cdkBuilder.or(or.let(OrProperty::unwrap))
            }

            /**
             * @param or This property contains the `Or` logical operator, which allows multiple
             *   filter conditions to be joined. Objects can match any of the listed filter
             *   conditions, which are joined by the `Or` logical operator. Only one of each filter
             *   condition is allowed.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1ad32cfb06fa186bf0f70c948c9816acdd24e160a9e1e71efe9ed1928a2096c")
            override fun or(or: OrProperty.Builder.() -> Unit): Unit = or(OrProperty(or))

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty,
        ) : FilterProperty {
            /**
             * This property contains the `And` logical operator, which allows multiple filter
             * conditions to be joined for more complex comparisons of Storage Lens group data.
             *
             * Objects must match all of the listed filter conditions that are joined by the `And`
             * logical operator. Only one of each filter condition is allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-and)
             */
            override fun and(): Any? = unwrap(this).getAnd()

            /**
             * This property contains a list of prefixes.
             *
             * At least one prefix must be specified. Up to 10 prefixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanyprefix)
             */
            override fun matchAnyPrefix(): List<String> =
                unwrap(this).getMatchAnyPrefix() ?: emptyList()

            /**
             * This property contains a list of suffixes.
             *
             * At least one suffix must be specified. Up to 10 suffixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanysuffix)
             */
            override fun matchAnySuffix(): List<String> =
                unwrap(this).getMatchAnySuffix() ?: emptyList()

            /**
             * This property contains the list of S3 object tags.
             *
             * At least one object tag must be specified. Up to 10 object tags are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchanytag)
             */
            override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

            /**
             * This property contains `DaysGreaterThan` and `DaysLessThan` to define the object age
             * range (minimum and maximum number of days).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectage)
             */
            override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

            /**
             * This property contains `BytesGreaterThan` and `BytesLessThan` to define the object
             * size range (minimum and maximum number of Bytes).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-matchobjectsize)
             */
            override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

            /**
             * This property contains the `Or` logical operator, which allows multiple filter
             * conditions to be joined.
             *
             * Objects can match any of the listed filter conditions, which are joined by the `Or`
             * logical operator. Only one of each filter condition is allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html#cfn-s3-storagelensgroup-filter-or)
             */
            override fun or(): Any? = unwrap(this).getOr()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty
            ): FilterProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FilterProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLensGroup.FilterProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface OrProperty {
        /**
         * This property contains a list of prefixes.
         *
         * At least one prefix must be specified. Up to 10 prefixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanyprefix)
         */
        public fun matchAnyPrefix(): List<String> = unwrap(this).getMatchAnyPrefix() ?: emptyList()

        /**
         * This property contains the list of suffixes.
         *
         * At least one suffix must be specified. Up to 10 suffixes are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanysuffix)
         */
        public fun matchAnySuffix(): List<String> = unwrap(this).getMatchAnySuffix() ?: emptyList()

        /**
         * This property contains the list of S3 object tags.
         *
         * At least one object tag must be specified. Up to 10 object tags are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanytag)
         */
        public fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

        /**
         * This property filters objects that match the specified object age range.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectage)
         */
        public fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

        /**
         * This property contains the `BytesGreaterThan` and `BytesLessThan` values to define the
         * object size range (minimum and maximum number of Bytes).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectsize)
         */
        public fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()

        /** A builder for [OrProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(matchAnyPrefix: List<String>)

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            public fun matchAnyPrefix(vararg matchAnyPrefix: String)

            /**
             * @param matchAnySuffix This property contains the list of suffixes. At least one
             *   suffix must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(matchAnySuffix: List<String>)

            /**
             * @param matchAnySuffix This property contains the list of suffixes. At least one
             *   suffix must be specified. Up to 10 suffixes are allowed.
             */
            public fun matchAnySuffix(vararg matchAnySuffix: String)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: IResolvable)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(matchAnyTag: List<Any>)

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            public fun matchAnyTag(vararg matchAnyTag: Any)

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            public fun matchObjectAge(matchObjectAge: IResolvable)

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty)

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
            public fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit)

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: IResolvable)

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty)

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
            public fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty.builder()

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(matchAnyPrefix: List<String>) {
                cdkBuilder.matchAnyPrefix(matchAnyPrefix)
            }

            /**
             * @param matchAnyPrefix This property contains a list of prefixes. At least one prefix
             *   must be specified. Up to 10 prefixes are allowed.
             */
            override fun matchAnyPrefix(vararg matchAnyPrefix: String): Unit =
                matchAnyPrefix(matchAnyPrefix.toList())

            /**
             * @param matchAnySuffix This property contains the list of suffixes. At least one
             *   suffix must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(matchAnySuffix: List<String>) {
                cdkBuilder.matchAnySuffix(matchAnySuffix)
            }

            /**
             * @param matchAnySuffix This property contains the list of suffixes. At least one
             *   suffix must be specified. Up to 10 suffixes are allowed.
             */
            override fun matchAnySuffix(vararg matchAnySuffix: String): Unit =
                matchAnySuffix(matchAnySuffix.toList())

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: IResolvable) {
                cdkBuilder.matchAnyTag(matchAnyTag.let(IResolvable::unwrap))
            }

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(matchAnyTag: List<Any>) {
                cdkBuilder.matchAnyTag(matchAnyTag)
            }

            /**
             * @param matchAnyTag This property contains the list of S3 object tags. At least one
             *   object tag must be specified. Up to 10 object tags are allowed.
             */
            override fun matchAnyTag(vararg matchAnyTag: Any): Unit =
                matchAnyTag(matchAnyTag.toList())

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            override fun matchObjectAge(matchObjectAge: IResolvable) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            override fun matchObjectAge(matchObjectAge: MatchObjectAgeProperty) {
                cdkBuilder.matchObjectAge(matchObjectAge.let(MatchObjectAgeProperty::unwrap))
            }

            /**
             * @param matchObjectAge This property filters objects that match the specified object
             *   age range.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7a611e8c260bba330a653a4a57fb9660ce8017b0b680152393b1f320391b3abc")
            override fun matchObjectAge(
                matchObjectAge: MatchObjectAgeProperty.Builder.() -> Unit
            ): Unit = matchObjectAge(MatchObjectAgeProperty(matchObjectAge))

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: IResolvable) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(IResolvable::unwrap))
            }

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            override fun matchObjectSize(matchObjectSize: MatchObjectSizeProperty) {
                cdkBuilder.matchObjectSize(matchObjectSize.let(MatchObjectSizeProperty::unwrap))
            }

            /**
             * @param matchObjectSize This property contains the `BytesGreaterThan` and
             *   `BytesLessThan` values to define the object size range (minimum and maximum number
             *   of Bytes).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5437a1317fee22aeaf320aef20059fe2cee631083400d66afe90ee31b4b5e895")
            override fun matchObjectSize(
                matchObjectSize: MatchObjectSizeProperty.Builder.() -> Unit
            ): Unit = matchObjectSize(MatchObjectSizeProperty(matchObjectSize))

            public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty,
        ) : OrProperty {
            /**
             * This property contains a list of prefixes.
             *
             * At least one prefix must be specified. Up to 10 prefixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanyprefix)
             */
            override fun matchAnyPrefix(): List<String> =
                unwrap(this).getMatchAnyPrefix() ?: emptyList()

            /**
             * This property contains the list of suffixes.
             *
             * At least one suffix must be specified. Up to 10 suffixes are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanysuffix)
             */
            override fun matchAnySuffix(): List<String> =
                unwrap(this).getMatchAnySuffix() ?: emptyList()

            /**
             * This property contains the list of S3 object tags.
             *
             * At least one object tag must be specified. Up to 10 object tags are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchanytag)
             */
            override fun matchAnyTag(): Any? = unwrap(this).getMatchAnyTag()

            /**
             * This property filters objects that match the specified object age range.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectage)
             */
            override fun matchObjectAge(): Any? = unwrap(this).getMatchObjectAge()

            /**
             * This property contains the `BytesGreaterThan` and `BytesLessThan` values to define
             * the object size range (minimum and maximum number of Bytes).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html#cfn-s3-storagelensgroup-or-matchobjectsize)
             */
            override fun matchObjectSize(): Any? = unwrap(this).getMatchObjectSize()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): OrProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty
            ): OrProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: OrProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLensGroup.OrProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MatchObjectAgeProperty {
        /**
         * This property indicates the minimum object age in days.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-daysgreaterthan)
         */
        public fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

        /**
         * This property indicates the maximum object age in days.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-dayslessthan)
         */
        public fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()

        /** A builder for [MatchObjectAgeProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param daysGreaterThan This property indicates the minimum object age in days. */
            public fun daysGreaterThan(daysGreaterThan: Number)

            /** @param daysLessThan This property indicates the maximum object age in days. */
            public fun daysLessThan(daysLessThan: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty.Builder =
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty
                    .builder()

            /** @param daysGreaterThan This property indicates the minimum object age in days. */
            override fun daysGreaterThan(daysGreaterThan: Number) {
                cdkBuilder.daysGreaterThan(daysGreaterThan)
            }

            /** @param daysLessThan This property indicates the maximum object age in days. */
            override fun daysLessThan(daysLessThan: Number) {
                cdkBuilder.daysLessThan(daysLessThan)
            }

            public fun build():
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty,
        ) : MatchObjectAgeProperty {
            /**
             * This property indicates the minimum object age in days.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-daysgreaterthan)
             */
            override fun daysGreaterThan(): Number? = unwrap(this).getDaysGreaterThan()

            /**
             * This property indicates the maximum object age in days.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html#cfn-s3-storagelensgroup-matchobjectage-dayslessthan)
             */
            override fun daysLessThan(): Number? = unwrap(this).getDaysLessThan()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MatchObjectAgeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty
            ): MatchObjectAgeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MatchObjectAgeProperty
            ): software.amazon.awscdk.services.s3.CfnStorageLensGroup.MatchObjectAgeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
