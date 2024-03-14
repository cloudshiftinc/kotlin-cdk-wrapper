package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPSet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.waf.CfnIPSet,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     */
    public open fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     */
    public open fun ipSetDescriptors(`value`: IResolvable) {
        unwrap(this).setIpSetDescriptors(`value`.let(IResolvable::unwrap))
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     */
    public open fun ipSetDescriptors(__idx_ac66f0: List<Any>) {
        unwrap(this).setIpSetDescriptors(__idx_ac66f0)
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     */
    public open fun ipSetDescriptors(vararg __idx_ac66f0: Any): Unit =
        ipSetDescriptors(__idx_ac66f0.toList())

    /** The name of the `IPSet` . */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the `IPSet` . */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.waf.CfnIPSet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

        /**
         * The name of the `IPSet` .
         *
         * You can't change the name of an `IPSet` after you create it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
         *
         * @param name The name of the `IPSet` .
         */
        public fun name(name: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.waf.CfnIPSet.Builder =
            software.amazon.awscdk.services.waf.CfnIPSet.Builder.create(scope, id)

        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
            cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
        }

        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
            cdkBuilder.ipSetDescriptors(ipSetDescriptors)
        }

        /**
         * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that
         * web requests originate from.
         *
         * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did
         * not use an HTTP proxy or a load balancer to send the request, this is the value of the
         * c-ip field in the CloudFront access logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range
         *   (in CIDR notation) that web requests originate from.
         */
        override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
            ipSetDescriptors(ipSetDescriptors.toList())

        /**
         * The name of the `IPSet` .
         *
         * You can't change the name of an `IPSet` after you create it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
         *
         * @param name The name of the `IPSet` .
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        public fun build(): software.amazon.awscdk.services.waf.CfnIPSet = cdkBuilder.build()
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

        internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnIPSet): CfnIPSet =
            CfnIPSet(cdkObject)

        internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.waf.CfnIPSet =
            wrapped.cdkObject
    }

    public interface IPSetDescriptorProperty {
        /**
         * Specify `IPV4` or `IPV6` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptor.html#cfn-waf-ipset-ipsetdescriptor-type)
         */
        public fun type(): String

        /**
         * Specify an IPv4 address by using CIDR notation. For example:.
         * * To configure AWS WAF to allow, block, or count requests that originated from the IP
         *   address 192.0.2.44, specify `192.0.2.44/32` .
         * * To configure AWS WAF to allow, block, or count requests that originated from IP
         *   addresses from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
         *
         * For more information about CIDR notation, see the Wikipedia entry
         * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
         * .
         *
         * Specify an IPv6 address by using CIDR notation. For example:
         * * To configure AWS WAF to allow, block, or count requests that originated from the IP
         *   address 1111:0000:0000:0000:0000:0000:0000:0111, specify
         *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
         * * To configure AWS WAF to allow, block, or count requests that originated from IP
         *   addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
         *   1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
         *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptor.html#cfn-waf-ipset-ipsetdescriptor-value)
         */
        public fun `value`(): String

        /** A builder for [IPSetDescriptorProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param type Specify `IPV4` or `IPV6` . */
            public fun type(type: String)

            /**
             * @param value Specify an IPv4 address by using CIDR notation. For example:.
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 192.0.2.44, specify `192.0.2.44/32` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
             *
             * For more information about CIDR notation, see the Wikipedia entry
             * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
             * .
             *
             * Specify an IPv6 address by using CIDR notation. For example:
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 1111:0000:0000:0000:0000:0000:0000:0111, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
             *   1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
             */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty.Builder =
                software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty.builder()

            /** @param type Specify `IPV4` or `IPV6` . */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            /**
             * @param value Specify an IPv4 address by using CIDR notation. For example:.
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 192.0.2.44, specify `192.0.2.44/32` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
             *
             * For more information about CIDR notation, see the Wikipedia entry
             * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
             * .
             *
             * Specify an IPv6 address by using CIDR notation. For example:
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 1111:0000:0000:0000:0000:0000:0000:0111, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
             *   1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
             */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty,
        ) : IPSetDescriptorProperty {
            /**
             * Specify `IPV4` or `IPV6` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptor.html#cfn-waf-ipset-ipsetdescriptor-type)
             */
            override fun type(): String = unwrap(this).getType()

            /**
             * Specify an IPv4 address by using CIDR notation. For example:.
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 192.0.2.44, specify `192.0.2.44/32` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
             *
             * For more information about CIDR notation, see the Wikipedia entry
             * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
             * .
             *
             * Specify an IPv6 address by using CIDR notation. For example:
             * * To configure AWS WAF to allow, block, or count requests that originated from the IP
             *   address 1111:0000:0000:0000:0000:0000:0000:0111, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
             * * To configure AWS WAF to allow, block, or count requests that originated from IP
             *   addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
             *   1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
             *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptor.html#cfn-waf-ipset-ipsetdescriptor-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): IPSetDescriptorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty
            ): IPSetDescriptorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: IPSetDescriptorProperty
            ): software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
