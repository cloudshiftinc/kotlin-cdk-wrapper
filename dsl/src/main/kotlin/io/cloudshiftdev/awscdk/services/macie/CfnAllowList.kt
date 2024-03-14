package io.cloudshiftdev.awscdk.services.macie

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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAllowList
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.macie.CfnAllowList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the allow list. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The unique identifier for the allow list. */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The current status of the allow list, which indicates whether Amazon Macie can access and use
     * the list's criteria.
     *
     * If the list's criteria specify a regular expression ( `Regex` ), this value is typically `OK`
     * . Macie can compile the expression. If the list's criteria specify an Amazon S3 object (
     * `S3WordsList` ), possible values are:
     * * `OK` - Macie can retrieve and parse the contents of the object.
     * * `S3_OBJECT_ACCESS_DENIED` - Macie isn't allowed to access the object or the object is
     *   encrypted with a customer managed AWS KMS key that Macie isn't allowed to use. Check the
     *   bucket policy and other permissions settings for the bucket and the object. If the object
     *   is encrypted, also ensure that it's encrypted with a key that Macie is allowed to use.
     * * `S3_OBJECT_EMPTY` - Macie can retrieve the object but the object doesn't contain any
     *   content. Ensure that the object contains the correct entries. Also ensure that the list's
     *   criteria specify the correct bucket and object names.
     * * `S3_OBJECT_NOT_FOUND` - The object doesn't exist in Amazon S3 . Ensure that the list's
     *   criteria specify the correct bucket and object names.
     * * `S3_OBJECT_OVERSIZE` - Macie can retrieve the object. However, the object contains too many
     *   entries or its storage size exceeds the quota for an allow list. Try breaking the list into
     *   multiple files and ensure that each file doesn't exceed any quotas. Then configure list
     *   settings in Macie for each file.
     * * `S3_THROTTLED` - Amazon S3 throttled the request to retrieve the object. Wait a few minutes
     *   and then try again.
     * * `S3_USER_ACCESS_DENIED` - Amazon S3 denied the request to retrieve the object. If the
     *   specified object exists, you're not allowed to access it or it's encrypted with an AWS KMS
     *   key that you're not allowed to use. Work with your AWS administrator to ensure that the
     *   list's criteria specify the correct bucket and object names, and you have read access to
     *   the bucket and the object. If the object is encrypted, also ensure that it's encrypted with
     *   a key that you're allowed to use.
     * * `UNKNOWN_ERROR` - A transient or internal error occurred when Macie attempted to retrieve
     *   or parse the object. Wait a few minutes and then try again. A list can also have this
     *   status if it's encrypted with a key that Amazon S3 and Macie can't access or use.
     *
     * For more information, see
     * [Allow list options and requirements](https://docs.aws.amazon.com/macie/latest/user/allow-lists-options.html)
     * in the *Amazon Macie User Guide* .
     */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /** The criteria that specify the text or text pattern to ignore. */
    public open fun criteria(): Any = unwrap(this).getCriteria()

    /** The criteria that specify the text or text pattern to ignore. */
    public open fun criteria(`value`: IResolvable) {
        unwrap(this).setCriteria(`value`.let(IResolvable::unwrap))
    }

    /** The criteria that specify the text or text pattern to ignore. */
    public open fun criteria(`value`: CriteriaProperty) {
        unwrap(this).setCriteria(`value`.let(CriteriaProperty::unwrap))
    }

    /** The criteria that specify the text or text pattern to ignore. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d65c91cff84a7f121af7c0244807d8544f4186dabe5a9623fd417d5eab2b2c22")
    public open fun criteria(`value`: CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CriteriaProperty(`value`))

    /** A custom description of the allow list. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A custom description of the allow list. */
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

    /** A custom name for the allow list. */
    public open fun name(): String = unwrap(this).getName()

    /** A custom name for the allow list. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to the allow list. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to the allow list. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to the allow list. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.macie.CfnAllowList]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        public fun criteria(criteria: IResolvable)

        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        public fun criteria(criteria: CriteriaProperty)

        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("81a1354b1254e1098cedc1a694d217bd9777405cc6505b1e846e87c2ce43e950")
        public fun criteria(criteria: CriteriaProperty.Builder.() -> Unit)

        /**
         * A custom description of the allow list.
         *
         * The description can contain 1-512 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-description)
         *
         * @param description A custom description of the allow list.
         */
        public fun description(description: String)

        /**
         * A custom name for the allow list.
         *
         * The name can contain 1-128 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-name)
         *
         * @param name A custom name for the allow list.
         */
        public fun name(name: String)

        /**
         * An array of key-value pairs to apply to the allow list.
         *
         * For more information, see
         * [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
         *
         * @param tags An array of key-value pairs to apply to the allow list.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to the allow list.
         *
         * For more information, see
         * [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
         *
         * @param tags An array of key-value pairs to apply to the allow list.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.macie.CfnAllowList.Builder =
            software.amazon.awscdk.services.macie.CfnAllowList.Builder.create(scope, id)

        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        override fun criteria(criteria: IResolvable) {
            cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
        }

        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        override fun criteria(criteria: CriteriaProperty) {
            cdkBuilder.criteria(criteria.let(CriteriaProperty::unwrap))
        }

        /**
         * The criteria that specify the text or text pattern to ignore.
         *
         * The criteria can be the location and name of an Amazon S3 object that lists specific text
         * to ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text
         * pattern to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
         *
         * @param criteria The criteria that specify the text or text pattern to ignore.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("81a1354b1254e1098cedc1a694d217bd9777405cc6505b1e846e87c2ce43e950")
        override fun criteria(criteria: CriteriaProperty.Builder.() -> Unit): Unit =
            criteria(CriteriaProperty(criteria))

        /**
         * A custom description of the allow list.
         *
         * The description can contain 1-512 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-description)
         *
         * @param description A custom description of the allow list.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A custom name for the allow list.
         *
         * The name can contain 1-128 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-name)
         *
         * @param name A custom name for the allow list.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * An array of key-value pairs to apply to the allow list.
         *
         * For more information, see
         * [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
         *
         * @param tags An array of key-value pairs to apply to the allow list.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to the allow list.
         *
         * For more information, see
         * [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
         *
         * @param tags An array of key-value pairs to apply to the allow list.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.macie.CfnAllowList = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAllowList {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAllowList(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.macie.CfnAllowList
        ): CfnAllowList = CfnAllowList(cdkObject)

        internal fun unwrap(
            wrapped: CfnAllowList
        ): software.amazon.awscdk.services.macie.CfnAllowList = wrapped.cdkObject
    }

    public interface S3WordsListProperty {
        /**
         * The full name of the S3 bucket that contains the object.
         *
         * This value correlates to the `Name` field of a bucket's properties in Amazon S3 .
         *
         * This value is case sensitive. In addition, don't use wildcard characters or specify
         * partial values for the name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html#cfn-macie-allowlist-s3wordslist-bucketname)
         */
        public fun bucketName(): String

        /**
         * The full name of the S3 object.
         *
         * This value correlates to the `Key` field of an object's properties in Amazon S3 . If the
         * name includes a path, include the complete path. For example,
         * `AllowLists/Macie/MyList.txt` .
         *
         * This value is case sensitive. In addition, don't use wildcard characters or specify
         * partial values for the name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html#cfn-macie-allowlist-s3wordslist-objectkey)
         */
        public fun objectKey(): String

        /** A builder for [S3WordsListProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bucketName The full name of the S3 bucket that contains the object. This value
             *   correlates to the `Name` field of a bucket's properties in Amazon S3 .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             */
            public fun bucketName(bucketName: String)

            /**
             * @param objectKey The full name of the S3 object. This value correlates to the `Key`
             *   field of an object's properties in Amazon S3 . If the name includes a path, include
             *   the complete path. For example, `AllowLists/Macie/MyList.txt` .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             */
            public fun objectKey(objectKey: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty.Builder =
                software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty.builder()

            /**
             * @param bucketName The full name of the S3 bucket that contains the object. This value
             *   correlates to the `Name` field of a bucket's properties in Amazon S3 .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             */
            override fun bucketName(bucketName: String) {
                cdkBuilder.bucketName(bucketName)
            }

            /**
             * @param objectKey The full name of the S3 object. This value correlates to the `Key`
             *   field of an object's properties in Amazon S3 . If the name includes a path, include
             *   the complete path. For example, `AllowLists/Macie/MyList.txt` .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             */
            override fun objectKey(objectKey: String) {
                cdkBuilder.objectKey(objectKey)
            }

            public fun build():
                software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty,
        ) : S3WordsListProperty {
            /**
             * The full name of the S3 bucket that contains the object.
             *
             * This value correlates to the `Name` field of a bucket's properties in Amazon S3 .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html#cfn-macie-allowlist-s3wordslist-bucketname)
             */
            override fun bucketName(): String = unwrap(this).getBucketName()

            /**
             * The full name of the S3 object.
             *
             * This value correlates to the `Key` field of an object's properties in Amazon S3 . If
             * the name includes a path, include the complete path. For example,
             * `AllowLists/Macie/MyList.txt` .
             *
             * This value is case sensitive. In addition, don't use wildcard characters or specify
             * partial values for the name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html#cfn-macie-allowlist-s3wordslist-objectkey)
             */
            override fun objectKey(): String = unwrap(this).getObjectKey()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): S3WordsListProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty
            ): S3WordsListProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3WordsListProperty
            ): software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CriteriaProperty {
        /**
         * The regular expression ( *regex* ) that defines the text pattern to ignore.
         *
         * The expression can contain 1-512 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html#cfn-macie-allowlist-criteria-regex)
         */
        public fun regex(): String? = unwrap(this).getRegex()

        /**
         * The location and name of an Amazon S3 object that lists specific text to ignore.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html#cfn-macie-allowlist-criteria-s3wordslist)
         */
        public fun s3WordsList(): Any? = unwrap(this).getS3WordsList()

        /** A builder for [CriteriaProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param regex The regular expression ( *regex* ) that defines the text pattern to
             *   ignore. The expression can contain 1-512 characters.
             */
            public fun regex(regex: String)

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            public fun s3WordsList(s3WordsList: IResolvable)

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            public fun s3WordsList(s3WordsList: S3WordsListProperty)

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("827e7817016e7a855e7b5ac67984754f084dd8d4ef5e93d841164f34cbfe219a")
            public fun s3WordsList(s3WordsList: S3WordsListProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty.Builder =
                software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty.builder()

            /**
             * @param regex The regular expression ( *regex* ) that defines the text pattern to
             *   ignore. The expression can contain 1-512 characters.
             */
            override fun regex(regex: String) {
                cdkBuilder.regex(regex)
            }

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            override fun s3WordsList(s3WordsList: IResolvable) {
                cdkBuilder.s3WordsList(s3WordsList.let(IResolvable::unwrap))
            }

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            override fun s3WordsList(s3WordsList: S3WordsListProperty) {
                cdkBuilder.s3WordsList(s3WordsList.let(S3WordsListProperty::unwrap))
            }

            /**
             * @param s3WordsList The location and name of an Amazon S3 object that lists specific
             *   text to ignore.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("827e7817016e7a855e7b5ac67984754f084dd8d4ef5e93d841164f34cbfe219a")
            override fun s3WordsList(s3WordsList: S3WordsListProperty.Builder.() -> Unit): Unit =
                s3WordsList(S3WordsListProperty(s3WordsList))

            public fun build():
                software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty,
        ) : CriteriaProperty {
            /**
             * The regular expression ( *regex* ) that defines the text pattern to ignore.
             *
             * The expression can contain 1-512 characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html#cfn-macie-allowlist-criteria-regex)
             */
            override fun regex(): String? = unwrap(this).getRegex()

            /**
             * The location and name of an Amazon S3 object that lists specific text to ignore.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html#cfn-macie-allowlist-criteria-s3wordslist)
             */
            override fun s3WordsList(): Any? = unwrap(this).getS3WordsList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CriteriaProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty
            ): CriteriaProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CriteriaProperty
            ): software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
