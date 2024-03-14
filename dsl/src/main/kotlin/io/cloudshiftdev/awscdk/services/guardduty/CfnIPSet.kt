package io.cloudshiftdev.awscdk.services.guardduty

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPSet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** Indicates whether or not GuardDuty uses the `IPSet` . */
    public open fun activate(): Any? = unwrap(this).getActivate()

    /** Indicates whether or not GuardDuty uses the `IPSet` . */
    public open fun activate(`value`: Boolean) {
        unwrap(this).setActivate(`value`)
    }

    /** Indicates whether or not GuardDuty uses the `IPSet` . */
    public open fun activate(`value`: IResolvable) {
        unwrap(this).setActivate(`value`.let(IResolvable::unwrap))
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
     */
    public open fun detectorId(): String? = unwrap(this).getDetectorId()

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
     */
    public open fun detectorId(`value`: String) {
        unwrap(this).setDetectorId(`value`)
    }

    /** The format of the file that contains the IPSet. */
    public open fun format(): String = unwrap(this).getFormat()

    /** The format of the file that contains the IPSet. */
    public open fun format(`value`: String) {
        unwrap(this).setFormat(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The URI of the file that contains the IPSet. */
    public open fun location(): String = unwrap(this).getLocation()

    /** The URI of the file that contains the IPSet. */
    public open fun location(`value`: String) {
        unwrap(this).setLocation(`value`)
    }

    /** The user-friendly name to identify the IPSet. */
    public open fun name(): String? = unwrap(this).getName()

    /** The user-friendly name to identify the IPSet. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags to be added to a new IP set resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to be added to a new IP set resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags to be added to a new IP set resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnIPSet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Indicates whether or not GuardDuty uses the `IPSet` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
         */
        public fun activate(activate: Boolean)

        /**
         * Indicates whether or not GuardDuty uses the `IPSet` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
         */
        public fun activate(activate: IResolvable)

        /**
         * The unique ID of the detector of the GuardDuty account that you want to create an IPSet
         * for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
         *
         * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
         *   create an IPSet for.
         */
        public fun detectorId(detectorId: String)

        /**
         * The format of the file that contains the IPSet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
         *
         * @param format The format of the file that contains the IPSet.
         */
        public fun format(format: String)

        /**
         * The URI of the file that contains the IPSet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
         *
         * @param location The URI of the file that contains the IPSet.
         */
        public fun location(location: String)

        /**
         * The user-friendly name to identify the IPSet.
         *
         * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
         *
         * @param name The user-friendly name to identify the IPSet.
         */
        public fun name(name: String)

        /**
         * The tags to be added to a new IP set resource.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
         *
         * @param tags The tags to be added to a new IP set resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to be added to a new IP set resource.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
         *
         * @param tags The tags to be added to a new IP set resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnIPSet.Builder =
            software.amazon.awscdk.services.guardduty.CfnIPSet.Builder.create(scope, id)

        /**
         * Indicates whether or not GuardDuty uses the `IPSet` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
         */
        override fun activate(activate: Boolean) {
            cdkBuilder.activate(activate)
        }

        /**
         * Indicates whether or not GuardDuty uses the `IPSet` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
         */
        override fun activate(activate: IResolvable) {
            cdkBuilder.activate(activate.let(IResolvable::unwrap))
        }

        /**
         * The unique ID of the detector of the GuardDuty account that you want to create an IPSet
         * for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
         *
         * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
         *   create an IPSet for.
         */
        override fun detectorId(detectorId: String) {
            cdkBuilder.detectorId(detectorId)
        }

        /**
         * The format of the file that contains the IPSet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
         *
         * @param format The format of the file that contains the IPSet.
         */
        override fun format(format: String) {
            cdkBuilder.format(format)
        }

        /**
         * The URI of the file that contains the IPSet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
         *
         * @param location The URI of the file that contains the IPSet.
         */
        override fun location(location: String) {
            cdkBuilder.location(location)
        }

        /**
         * The user-friendly name to identify the IPSet.
         *
         * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
         *
         * @param name The user-friendly name to identify the IPSet.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The tags to be added to a new IP set resource.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
         *
         * @param tags The tags to be added to a new IP set resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to be added to a new IP set resource.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
         *
         * @param tags The tags to be added to a new IP set resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.guardduty.CfnIPSet = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIPSet {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIPSet(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSet): CfnIPSet =
            CfnIPSet(cdkObject)

        internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.guardduty.CfnIPSet =
            wrapped.cdkObject
    }
}
