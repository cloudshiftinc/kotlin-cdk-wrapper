package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomerGateway
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The ID of the customer gateway. */
    public open fun attrCustomerGatewayId(): String = unwrap(this).getAttrCustomerGatewayId()

    /** For devices that support BGP, the customer gateway's BGP ASN. */
    public open fun bgpAsn(): Number = unwrap(this).getBgpAsn()

    /** For devices that support BGP, the customer gateway's BGP ASN. */
    public open fun bgpAsn(`value`: Number) {
        unwrap(this).setBgpAsn(`value`)
    }

    /** The name of customer gateway device. */
    public open fun deviceName(): String? = unwrap(this).getDeviceName()

    /** The name of customer gateway device. */
    public open fun deviceName(`value`: String) {
        unwrap(this).setDeviceName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** IPv4 address for the customer gateway device's outside interface. */
    public open fun ipAddress(): String = unwrap(this).getIpAddress()

    /** IPv4 address for the customer gateway device's outside interface. */
    public open fun ipAddress(`value`: String) {
        unwrap(this).setIpAddress(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** One or more tags for the customer gateway. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** One or more tags for the customer gateway. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** One or more tags for the customer gateway. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The type of VPN connection that this customer gateway supports ( `ipsec.1` ). */
    public open fun type(): String = unwrap(this).getType()

    /** The type of VPN connection that this customer gateway supports ( `ipsec.1` ). */
    public open fun type(`value`: String) {
        unwrap(this).setType(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnCustomerGateway]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * For devices that support BGP, the customer gateway's BGP ASN.
         *
         * Default: 65000
         *
         * Default: - 65000
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
         *
         * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN.
         */
        public fun bgpAsn(bgpAsn: Number)

        /**
         * The name of customer gateway device.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
         *
         * @param deviceName The name of customer gateway device.
         */
        public fun deviceName(deviceName: String)

        /**
         * IPv4 address for the customer gateway device's outside interface.
         *
         * The address must be static.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
         *
         * @param ipAddress IPv4 address for the customer gateway device's outside interface.
         */
        public fun ipAddress(ipAddress: String)

        /**
         * One or more tags for the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
         *
         * @param tags One or more tags for the customer gateway.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * One or more tags for the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
         *
         * @param tags One or more tags for the customer gateway.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
         *
         * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
         */
        public fun type(type: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder =
            software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder.create(scope, id)

        /**
         * For devices that support BGP, the customer gateway's BGP ASN.
         *
         * Default: 65000
         *
         * Default: - 65000
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
         *
         * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN.
         */
        override fun bgpAsn(bgpAsn: Number) {
            cdkBuilder.bgpAsn(bgpAsn)
        }

        /**
         * The name of customer gateway device.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
         *
         * @param deviceName The name of customer gateway device.
         */
        override fun deviceName(deviceName: String) {
            cdkBuilder.deviceName(deviceName)
        }

        /**
         * IPv4 address for the customer gateway device's outside interface.
         *
         * The address must be static.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
         *
         * @param ipAddress IPv4 address for the customer gateway device's outside interface.
         */
        override fun ipAddress(ipAddress: String) {
            cdkBuilder.ipAddress(ipAddress)
        }

        /**
         * One or more tags for the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
         *
         * @param tags One or more tags for the customer gateway.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * One or more tags for the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
         *
         * @param tags One or more tags for the customer gateway.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
         *
         * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
         */
        override fun type(type: String) {
            cdkBuilder.type(type)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnCustomerGateway =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCustomerGateway {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCustomerGateway(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGateway
        ): CfnCustomerGateway = CfnCustomerGateway(cdkObject)

        internal fun unwrap(
            wrapped: CfnCustomerGateway
        ): software.amazon.awscdk.services.ec2.CfnCustomerGateway = wrapped.cdkObject
    }
}
