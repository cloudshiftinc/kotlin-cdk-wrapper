package io.cloudshiftdev.awscdk.services.ec2

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAM
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The ARN of the IPAM. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The ID of the default resource discovery association. */
    public open fun attrDefaultResourceDiscoveryAssociationId(): String =
        unwrap(this).getAttrDefaultResourceDiscoveryAssociationId()

    /** The ID of the default resource discovery. */
    public open fun attrDefaultResourceDiscoveryId(): String =
        unwrap(this).getAttrDefaultResourceDiscoveryId()

    /** The ID of the IPAM. */
    public open fun attrIpamId(): String = unwrap(this).getAttrIpamId()

    /** The ID of the default private scope. */
    public open fun attrPrivateDefaultScopeId(): String =
        unwrap(this).getAttrPrivateDefaultScopeId()

    /** The ID of the default public scope. */
    public open fun attrPublicDefaultScopeId(): String = unwrap(this).getAttrPublicDefaultScopeId()

    /** The number of resource discovery associations. */
    public open fun attrResourceDiscoveryAssociationCount(): Number =
        unwrap(this).getAttrResourceDiscoveryAssociationCount()

    /** The number of scopes. */
    public open fun attrScopeCount(): Number = unwrap(this).getAttrScopeCount()

    /** The description for the IPAM. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The description for the IPAM. */
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

    /** The operating Regions for an IPAM. */
    public open fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

    /** The operating Regions for an IPAM. */
    public open fun operatingRegions(`value`: IResolvable) {
        unwrap(this).setOperatingRegions(`value`.let(IResolvable::unwrap))
    }

    /** The operating Regions for an IPAM. */
    public open fun operatingRegions(__idx_ac66f0: List<Any>) {
        unwrap(this).setOperatingRegions(__idx_ac66f0)
    }

    /** The operating Regions for an IPAM. */
    public open fun operatingRegions(vararg __idx_ac66f0: Any): Unit =
        operatingRegions(__idx_ac66f0.toList())

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The key/value combination of a tag assigned to the resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The key/value combination of a tag assigned to the resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The key/value combination of a tag assigned to the resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** IPAM is offered in a Free Tier and an Advanced Tier. */
    public open fun tier(): String? = unwrap(this).getTier()

    /** IPAM is offered in a Free Tier and an Advanced Tier. */
    public open fun tier(`value`: String) {
        unwrap(this).setTier(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAM]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The description for the IPAM.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
         *
         * @param description The description for the IPAM.
         */
        public fun description(description: String)

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        public fun operatingRegions(operatingRegions: IResolvable)

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        public fun operatingRegions(operatingRegions: List<Any>)

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        public fun operatingRegions(vararg operatingRegions: Any)

        /**
         * The key/value combination of a tag assigned to the resource.
         *
         * Use the tag key in the filter name and the tag value as the filter value. For example, to
         * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
         * `tag:Owner` for the filter name and `TeamA` for the filter value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
         *
         * @param tags The key/value combination of a tag assigned to the resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The key/value combination of a tag assigned to the resource.
         *
         * Use the tag key in the filter name and the tag value as the filter value. For example, to
         * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
         * `tag:Owner` for the filter name and `TeamA` for the filter value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
         *
         * @param tags The key/value combination of a tag assigned to the resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * IPAM is offered in a Free Tier and an Advanced Tier.
         *
         * For more information about the features available in each tier and the costs associated
         * with the tiers, see the
         * [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
         *
         * @param tier IPAM is offered in a Free Tier and an Advanced Tier.
         */
        public fun tier(tier: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAM.Builder =
            software.amazon.awscdk.services.ec2.CfnIPAM.Builder.create(scope, id)

        /**
         * The description for the IPAM.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
         *
         * @param description The description for the IPAM.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        override fun operatingRegions(operatingRegions: IResolvable) {
            cdkBuilder.operatingRegions(operatingRegions.let(IResolvable::unwrap))
        }

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        override fun operatingRegions(operatingRegions: List<Any>) {
            cdkBuilder.operatingRegions(operatingRegions)
        }

        /**
         * The operating Regions for an IPAM.
         *
         * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs.
         * IPAM only discovers and monitors resources in the AWS Regions you select as operating
         * Regions.
         *
         * For more information about operating Regions, see
         * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
         *
         * @param operatingRegions The operating Regions for an IPAM.
         */
        override fun operatingRegions(vararg operatingRegions: Any): Unit =
            operatingRegions(operatingRegions.toList())

        /**
         * The key/value combination of a tag assigned to the resource.
         *
         * Use the tag key in the filter name and the tag value as the filter value. For example, to
         * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
         * `tag:Owner` for the filter name and `TeamA` for the filter value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
         *
         * @param tags The key/value combination of a tag assigned to the resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The key/value combination of a tag assigned to the resource.
         *
         * Use the tag key in the filter name and the tag value as the filter value. For example, to
         * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
         * `tag:Owner` for the filter name and `TeamA` for the filter value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
         *
         * @param tags The key/value combination of a tag assigned to the resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * IPAM is offered in a Free Tier and an Advanced Tier.
         *
         * For more information about the features available in each tier and the costs associated
         * with the tiers, see the
         * [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
         *
         * @param tier IPAM is offered in a Free Tier and an Advanced Tier.
         */
        override fun tier(tier: String) {
            cdkBuilder.tier(tier)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnIPAM = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIPAM {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIPAM(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM): CfnIPAM =
            CfnIPAM(cdkObject)

        internal fun unwrap(wrapped: CfnIPAM): software.amazon.awscdk.services.ec2.CfnIPAM =
            wrapped.cdkObject
    }

    public interface IpamOperatingRegionProperty {
        /**
         * The name of the operating Region.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html#cfn-ec2-ipam-ipamoperatingregion-regionname)
         */
        public fun regionName(): String

        /** A builder for [IpamOperatingRegionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param regionName The name of the operating Region. */
            public fun regionName(regionName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty.Builder =
                software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty.builder()

            /** @param regionName The name of the operating Region. */
            override fun regionName(regionName: String) {
                cdkBuilder.regionName(regionName)
            }

            public fun build():
                software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty,
        ) : IpamOperatingRegionProperty {
            /**
             * The name of the operating Region.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html#cfn-ec2-ipam-ipamoperatingregion-regionname)
             */
            override fun regionName(): String = unwrap(this).getRegionName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): IpamOperatingRegionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty
            ): IpamOperatingRegionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: IpamOperatingRegionProperty
            ): software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
