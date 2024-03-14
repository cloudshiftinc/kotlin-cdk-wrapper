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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPC
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPC,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The primary IPv4 CIDR block for the VPC.
     *
     * For example, 10.0.0.0/16.
     */
    public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

    /**
     * The association IDs of the IPv4 CIDR blocks for the VPC.
     *
     * For example, [ vpc-cidr-assoc-0280ab6b ].
     */
    public open fun attrCidrBlockAssociations(): List<String> =
        unwrap(this).getAttrCidrBlockAssociations()

    /**
     * The ID of the default network ACL for the VPC.
     *
     * For example, acl-814dafe3.
     */
    public open fun attrDefaultNetworkAcl(): String = unwrap(this).getAttrDefaultNetworkAcl()

    /**
     * The ID of the default security group for the VPC.
     *
     * For example, sg-b178e0d3.
     */
    public open fun attrDefaultSecurityGroup(): String = unwrap(this).getAttrDefaultSecurityGroup()

    /**
     * The IPv6 CIDR blocks for the VPC.
     *
     * For example, [ 2001:db8:1234:1a00::/56 ].
     */
    public open fun attrIpv6CidrBlocks(): List<String> = unwrap(this).getAttrIpv6CidrBlocks()

    /** The ID of the VPC. */
    public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

    /** The IPv4 network range for the VPC, in CIDR notation. */
    public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /** The IPv4 network range for the VPC, in CIDR notation. */
    public open fun cidrBlock(`value`: String) {
        unwrap(this).setCidrBlock(`value`)
    }

    /** Indicates whether the instances launched in the VPC get DNS hostnames. */
    public open fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

    /** Indicates whether the instances launched in the VPC get DNS hostnames. */
    public open fun enableDnsHostnames(`value`: Boolean) {
        unwrap(this).setEnableDnsHostnames(`value`)
    }

    /** Indicates whether the instances launched in the VPC get DNS hostnames. */
    public open fun enableDnsHostnames(`value`: IResolvable) {
        unwrap(this).setEnableDnsHostnames(`value`.let(IResolvable::unwrap))
    }

    /** Indicates whether the DNS resolution is supported for the VPC. */
    public open fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

    /** Indicates whether the DNS resolution is supported for the VPC. */
    public open fun enableDnsSupport(`value`: Boolean) {
        unwrap(this).setEnableDnsSupport(`value`)
    }

    /** Indicates whether the DNS resolution is supported for the VPC. */
    public open fun enableDnsSupport(`value`: IResolvable) {
        unwrap(this).setEnableDnsSupport(`value`.let(IResolvable::unwrap))
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The allowed tenancy of instances launched into the VPC. */
    public open fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

    /** The allowed tenancy of instances launched into the VPC. */
    public open fun instanceTenancy(`value`: String) {
        unwrap(this).setInstanceTenancy(`value`)
    }

    /** The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR. */
    public open fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    /** The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR. */
    public open fun ipv4IpamPoolId(`value`: String) {
        unwrap(this).setIpv4IpamPoolId(`value`)
    }

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC IP
     * Address Manager (IPAM) pool.
     */
    public open fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC IP
     * Address Manager (IPAM) pool.
     */
    public open fun ipv4NetmaskLength(`value`: Number) {
        unwrap(this).setIpv4NetmaskLength(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags for the VPC. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags for the VPC. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags for the VPC. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPC]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The IPv4 network range for the VPC, in CIDR notation.
         *
         * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form;
         * for example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
         *
         * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-cidrblock)
         *
         * @param cidrBlock The IPv4 network range for the VPC, in CIDR notation.
         */
        public fun cidrBlock(cidrBlock: String)

        /**
         * Indicates whether the instances launched in the VPC get DNS hostnames.
         *
         * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
         * default for nondefault VPCs. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * You can only enable DNS hostnames if you've enabled DNS support.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
         *
         * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
         *   hostnames.
         */
        public fun enableDnsHostnames(enableDnsHostnames: Boolean)

        /**
         * Indicates whether the instances launched in the VPC get DNS hostnames.
         *
         * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
         * default for nondefault VPCs. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * You can only enable DNS hostnames if you've enabled DNS support.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
         *
         * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
         *   hostnames.
         */
        public fun enableDnsHostnames(enableDnsHostnames: IResolvable)

        /**
         * Indicates whether the DNS resolution is supported for the VPC.
         *
         * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address,
         * or the reserved IP address at the base of the VPC network range "plus two" succeed. If
         * disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames
         * to IP addresses is not enabled. Enabled by default. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
         *
         * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
         */
        public fun enableDnsSupport(enableDnsSupport: Boolean)

        /**
         * Indicates whether the DNS resolution is supported for the VPC.
         *
         * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address,
         * or the reserved IP address at the base of the VPC network range "plus two" succeed. If
         * disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames
         * to IP addresses is not enabled. Enabled by default. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
         *
         * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
         */
        public fun enableDnsSupport(enableDnsSupport: IResolvable)

        /**
         * The allowed tenancy of instances launched into the VPC.
         * * `default` : An instance launched into the VPC runs on shared hardware by default,
         *   unless you explicitly specify a different tenancy during instance launch.
         * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default,
         *   unless you explicitly specify a tenancy of `host` during instance launch. You cannot
         *   specify a tenancy of `default` during instance launch.
         *
         * Updating `InstanceTenancy` requires no replacement only if you are updating its value
         * from `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated`
         * requires replacement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-instancetenancy)
         *
         * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
         */
        public fun instanceTenancy(instanceTenancy: String)

        /**
         * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR.
         *
         * For more information, see
         * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4ipampoolid)
         *
         * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this
         *   VPC's CIDR.
         */
        public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

        /**
         * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC
         * IP Address Manager (IPAM) pool.
         *
         * For more information about IPAM, see
         * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4netmasklength)
         *
         * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this
         *   VPC from an Amazon VPC IP Address Manager (IPAM) pool.
         */
        public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

        /**
         * The tags for the VPC.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
         *
         * @param tags The tags for the VPC.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags for the VPC.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
         *
         * @param tags The tags for the VPC.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPC.Builder =
            software.amazon.awscdk.services.ec2.CfnVPC.Builder.create(scope, id)

        /**
         * The IPv4 network range for the VPC, in CIDR notation.
         *
         * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form;
         * for example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
         *
         * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-cidrblock)
         *
         * @param cidrBlock The IPv4 network range for the VPC, in CIDR notation.
         */
        override fun cidrBlock(cidrBlock: String) {
            cdkBuilder.cidrBlock(cidrBlock)
        }

        /**
         * Indicates whether the instances launched in the VPC get DNS hostnames.
         *
         * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
         * default for nondefault VPCs. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * You can only enable DNS hostnames if you've enabled DNS support.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
         *
         * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
         *   hostnames.
         */
        override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
            cdkBuilder.enableDnsHostnames(enableDnsHostnames)
        }

        /**
         * Indicates whether the instances launched in the VPC get DNS hostnames.
         *
         * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
         * default for nondefault VPCs. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * You can only enable DNS hostnames if you've enabled DNS support.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
         *
         * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
         *   hostnames.
         */
        override fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
            cdkBuilder.enableDnsHostnames(enableDnsHostnames.let(IResolvable::unwrap))
        }

        /**
         * Indicates whether the DNS resolution is supported for the VPC.
         *
         * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address,
         * or the reserved IP address at the base of the VPC network range "plus two" succeed. If
         * disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames
         * to IP addresses is not enabled. Enabled by default. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
         *
         * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
         */
        override fun enableDnsSupport(enableDnsSupport: Boolean) {
            cdkBuilder.enableDnsSupport(enableDnsSupport)
        }

        /**
         * Indicates whether the DNS resolution is supported for the VPC.
         *
         * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address,
         * or the reserved IP address at the base of the VPC network range "plus two" succeed. If
         * disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames
         * to IP addresses is not enabled. Enabled by default. For more information, see
         * [DNS attributes in your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
         *
         * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
         */
        override fun enableDnsSupport(enableDnsSupport: IResolvable) {
            cdkBuilder.enableDnsSupport(enableDnsSupport.let(IResolvable::unwrap))
        }

        /**
         * The allowed tenancy of instances launched into the VPC.
         * * `default` : An instance launched into the VPC runs on shared hardware by default,
         *   unless you explicitly specify a different tenancy during instance launch.
         * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default,
         *   unless you explicitly specify a tenancy of `host` during instance launch. You cannot
         *   specify a tenancy of `default` during instance launch.
         *
         * Updating `InstanceTenancy` requires no replacement only if you are updating its value
         * from `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated`
         * requires replacement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-instancetenancy)
         *
         * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
         */
        override fun instanceTenancy(instanceTenancy: String) {
            cdkBuilder.instanceTenancy(instanceTenancy)
        }

        /**
         * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR.
         *
         * For more information, see
         * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4ipampoolid)
         *
         * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this
         *   VPC's CIDR.
         */
        override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
            cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
        }

        /**
         * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC
         * IP Address Manager (IPAM) pool.
         *
         * For more information about IPAM, see
         * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
         * *Amazon VPC IPAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4netmasklength)
         *
         * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this
         *   VPC from an Amazon VPC IP Address Manager (IPAM) pool.
         */
        override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
            cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
        }

        /**
         * The tags for the VPC.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
         *
         * @param tags The tags for the VPC.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags for the VPC.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
         *
         * @param tags The tags for the VPC.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.ec2.CfnVPC = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnVPC {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnVPC(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPC): CfnVPC =
            CfnVPC(cdkObject)

        internal fun unwrap(wrapped: CfnVPC): software.amazon.awscdk.services.ec2.CfnVPC =
            wrapped.cdkObject
    }
}
