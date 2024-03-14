package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGeofenceCollection
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollection,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /**
     * The Amazon Resource Name (ARN) for the geofence collection resource.
     *
     * Used when you need to specify a resource across all AWS .
     * * Format example:
     *   `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection`
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Synonym for `Arn` .
     *
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to
     * specify a resource across all AWS .
     * * Format example:
     *   `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection`
     */
    public open fun attrCollectionArn(): String = unwrap(this).getAttrCollectionArn()

    /**
     * The timestamp for when the geofence collection resource was created in
     * [ISO 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * format: `YYYY-MM-DDThh:mm:ss.sssZ` .
     */
    public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

    /**
     * The timestamp for when the geofence collection resource was last updated in
     * [ISO 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     * format: `YYYY-MM-DDThh:mm:ss.sssZ` .
     */
    public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** A custom name for the geofence collection. */
    public open fun collectionName(): String = unwrap(this).getCollectionName()

    /** A custom name for the geofence collection. */
    public open fun collectionName(`value`: String) {
        unwrap(this).setCollectionName(`value`)
    }

    /** An optional description for the geofence collection. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** An optional description for the geofence collection. */
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

    /**
     * A key identifier for an
     * [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
     * . Enter a key ID, key ARN, alias name, or alias ARN.
     */
    public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A key identifier for an
     * [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
     * . Enter a key ID, key ARN, alias name, or alias ARN.
     */
    public open fun kmsKeyId(`value`: String) {
        unwrap(this).setKmsKeyId(`value`)
    }

    /** @deprecated this property has been deprecated */
    @Deprecated(message = "deprecated in CDK")
    public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /** @deprecated this property has been deprecated */
    @Deprecated(message = "deprecated in CDK")
    public open fun pricingPlan(`value`: String) {
        unwrap(this).setPricingPlan(`value`)
    }

    /** @deprecated this property has been deprecated */
    @Deprecated(message = "deprecated in CDK")
    public open fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

    /** @deprecated this property has been deprecated */
    @Deprecated(message = "deprecated in CDK")
    public open fun pricingPlanDataSource(`value`: String) {
        unwrap(this).setPricingPlanDataSource(`value`)
    }

    /** Applies one or more tags to the geofence collection. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** Applies one or more tags to the geofence collection. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** Applies one or more tags to the geofence collection. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnGeofenceCollection]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A custom name for the geofence collection.
         *
         * Requirements:
         * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
         *   underscores (_).
         * * Must be a unique geofence collection name.
         * * No spaces allowed. For example, `ExampleGeofenceCollection` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-collectionname)
         *
         * @param collectionName A custom name for the geofence collection.
         */
        public fun collectionName(collectionName: String)

        /**
         * An optional description for the geofence collection.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
         *
         * @param description An optional description for the geofence collection.
         */
        public fun description(description: String)

        /**
         * A key identifier for an
         * [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
         * . Enter a key ID, key ARN, alias name, or alias ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
         *
         * @param kmsKeyId A key identifier for an
         *   [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
         *   . Enter a key ID, key ARN, alias name, or alias ARN.
         */
        public fun kmsKeyId(kmsKeyId: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
         *
         * @param pricingPlan
         * @deprecated this property has been deprecated
         */
        @Deprecated(message = "deprecated in CDK") public fun pricingPlan(pricingPlan: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
         *
         * @param pricingPlanDataSource
         * @deprecated this property has been deprecated
         */
        @Deprecated(message = "deprecated in CDK")
        public fun pricingPlanDataSource(pricingPlanDataSource: String)

        /**
         * Applies one or more tags to the geofence collection.
         *
         * A tag is a key-value pair helps manage, identify, search, and filter your resources by
         * labelling them.
         *
         * Format: `"key" : "value"`
         *
         * Restrictions:
         * * Maximum 50 tags per resource
         * * Each resource tag must be unique with a maximum of one value.
         * * Maximum key length: 128 Unicode characters in UTF-8
         * * Maximum value length: 256 Unicode characters in UTF-8
         * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = .
         *   _ : /
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
         *
         * @param tags Applies one or more tags to the geofence collection.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Applies one or more tags to the geofence collection.
         *
         * A tag is a key-value pair helps manage, identify, search, and filter your resources by
         * labelling them.
         *
         * Format: `"key" : "value"`
         *
         * Restrictions:
         * * Maximum 50 tags per resource
         * * Each resource tag must be unique with a maximum of one value.
         * * Maximum key length: 128 Unicode characters in UTF-8
         * * Maximum value length: 256 Unicode characters in UTF-8
         * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = .
         *   _ : /
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
         *
         * @param tags Applies one or more tags to the geofence collection.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder =
            software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder.create(scope, id)

        /**
         * A custom name for the geofence collection.
         *
         * Requirements:
         * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
         *   underscores (_).
         * * Must be a unique geofence collection name.
         * * No spaces allowed. For example, `ExampleGeofenceCollection` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-collectionname)
         *
         * @param collectionName A custom name for the geofence collection.
         */
        override fun collectionName(collectionName: String) {
            cdkBuilder.collectionName(collectionName)
        }

        /**
         * An optional description for the geofence collection.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
         *
         * @param description An optional description for the geofence collection.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A key identifier for an
         * [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
         * . Enter a key ID, key ARN, alias name, or alias ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
         *
         * @param kmsKeyId A key identifier for an
         *   [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
         *   . Enter a key ID, key ARN, alias name, or alias ARN.
         */
        override fun kmsKeyId(kmsKeyId: String) {
            cdkBuilder.kmsKeyId(kmsKeyId)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
         *
         * @param pricingPlan
         * @deprecated this property has been deprecated
         */
        @Deprecated(message = "deprecated in CDK")
        override fun pricingPlan(pricingPlan: String) {
            cdkBuilder.pricingPlan(pricingPlan)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
         *
         * @param pricingPlanDataSource
         * @deprecated this property has been deprecated
         */
        @Deprecated(message = "deprecated in CDK")
        override fun pricingPlanDataSource(pricingPlanDataSource: String) {
            cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
        }

        /**
         * Applies one or more tags to the geofence collection.
         *
         * A tag is a key-value pair helps manage, identify, search, and filter your resources by
         * labelling them.
         *
         * Format: `"key" : "value"`
         *
         * Restrictions:
         * * Maximum 50 tags per resource
         * * Each resource tag must be unique with a maximum of one value.
         * * Maximum key length: 128 Unicode characters in UTF-8
         * * Maximum value length: 256 Unicode characters in UTF-8
         * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = .
         *   _ : /
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
         *
         * @param tags Applies one or more tags to the geofence collection.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Applies one or more tags to the geofence collection.
         *
         * A tag is a key-value pair helps manage, identify, search, and filter your resources by
         * labelling them.
         *
         * Format: `"key" : "value"`
         *
         * Restrictions:
         * * Maximum 50 tags per resource
         * * Each resource tag must be unique with a maximum of one value.
         * * Maximum key length: 128 Unicode characters in UTF-8
         * * Maximum value length: 256 Unicode characters in UTF-8
         * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = .
         *   _ : /
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
         *
         * @param tags Applies one or more tags to the geofence collection.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.location.CfnGeofenceCollection =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnGeofenceCollection {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnGeofenceCollection(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollection
        ): CfnGeofenceCollection = CfnGeofenceCollection(cdkObject)

        internal fun unwrap(
            wrapped: CfnGeofenceCollection
        ): software.amazon.awscdk.services.location.CfnGeofenceCollection = wrapped.cdkObject
    }
}
