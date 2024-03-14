package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface VpcLookupOptions {
    /**
     * Whether to match the default VPC.
     *
     * Default: Don't care whether we return the default VPC
     */
    public fun isDefault(): Boolean? = unwrap(this).getIsDefault()

    /**
     * The ID of the AWS account that owns the VPC.
     *
     * Default: the account id of the parent stack
     */
    public fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

    /**
     * Optional to override inferred region.
     *
     * Default: Current stack's environment region
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * Whether to look up whether a VPN Gateway is attached to the looked up VPC.
     *
     * You can set this to `false` if you know the VPC does not have a VPN Gateway attached, in
     * order to avoid an API call.
     *
     * If you change this property from `false` to `true` or undefined, you may need to clear the
     * corresponding context entry in `cdk.context.json` in order to trigger a new lookup.
     *
     * Default: true
     */
    public fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

    /**
     * Optional tag for subnet group name.
     *
     * If not provided, we'll look at the aws-cdk:subnet-name tag. If the subnet does not have the
     * specified tag, we'll use its type as the name.
     *
     * Default: aws-cdk:subnet-name
     */
    public fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

    /**
     * Tags on the VPC.
     *
     * The VPC must have all of these tags
     *
     * Default: Don't filter on tags
     */
    public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the VPC.
     *
     * If given, will import exactly this VPC.
     *
     * Default: Don't filter on vpcId
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * The name of the VPC.
     *
     * If given, will import the VPC with this name.
     *
     * Default: Don't filter on vpcName
     */
    public fun vpcName(): String? = unwrap(this).getVpcName()

    /** A builder for [VpcLookupOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param isDefault Whether to match the default VPC. */
        public fun isDefault(isDefault: Boolean)

        /** @param ownerAccountId The ID of the AWS account that owns the VPC. */
        public fun ownerAccountId(ownerAccountId: String)

        /** @param region Optional to override inferred region. */
        public fun region(region: String)

        /**
         * @param returnVpnGateways Whether to look up whether a VPN Gateway is attached to the
         *   looked up VPC. You can set this to `false` if you know the VPC does not have a VPN
         *   Gateway attached, in order to avoid an API call.
         *
         * If you change this property from `false` to `true` or undefined, you may need to clear
         * the corresponding context entry in `cdk.context.json` in order to trigger a new lookup.
         */
        public fun returnVpnGateways(returnVpnGateways: Boolean)

        /**
         * @param subnetGroupNameTag Optional tag for subnet group name. If not provided, we'll look
         *   at the aws-cdk:subnet-name tag. If the subnet does not have the specified tag, we'll
         *   use its type as the name.
         */
        public fun subnetGroupNameTag(subnetGroupNameTag: String)

        /** @param tags Tags on the VPC. The VPC must have all of these tags */
        public fun tags(tags: Map<String, String>)

        /** @param vpcId The ID of the VPC. If given, will import exactly this VPC. */
        public fun vpcId(vpcId: String)

        /** @param vpcName The name of the VPC. If given, will import the VPC with this name. */
        public fun vpcName(vpcName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcLookupOptions.Builder =
            software.amazon.awscdk.services.ec2.VpcLookupOptions.builder()

        /** @param isDefault Whether to match the default VPC. */
        override fun isDefault(isDefault: Boolean) {
            cdkBuilder.isDefault(isDefault)
        }

        /** @param ownerAccountId The ID of the AWS account that owns the VPC. */
        override fun ownerAccountId(ownerAccountId: String) {
            cdkBuilder.ownerAccountId(ownerAccountId)
        }

        /** @param region Optional to override inferred region. */
        override fun region(region: String) {
            cdkBuilder.region(region)
        }

        /**
         * @param returnVpnGateways Whether to look up whether a VPN Gateway is attached to the
         *   looked up VPC. You can set this to `false` if you know the VPC does not have a VPN
         *   Gateway attached, in order to avoid an API call.
         *
         * If you change this property from `false` to `true` or undefined, you may need to clear
         * the corresponding context entry in `cdk.context.json` in order to trigger a new lookup.
         */
        override fun returnVpnGateways(returnVpnGateways: Boolean) {
            cdkBuilder.returnVpnGateways(returnVpnGateways)
        }

        /**
         * @param subnetGroupNameTag Optional tag for subnet group name. If not provided, we'll look
         *   at the aws-cdk:subnet-name tag. If the subnet does not have the specified tag, we'll
         *   use its type as the name.
         */
        override fun subnetGroupNameTag(subnetGroupNameTag: String) {
            cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
        }

        /** @param tags Tags on the VPC. The VPC must have all of these tags */
        override fun tags(tags: Map<String, String>) {
            cdkBuilder.tags(tags)
        }

        /** @param vpcId The ID of the VPC. If given, will import exactly this VPC. */
        override fun vpcId(vpcId: String) {
            cdkBuilder.vpcId(vpcId)
        }

        /** @param vpcName The name of the VPC. If given, will import the VPC with this name. */
        override fun vpcName(vpcName: String) {
            cdkBuilder.vpcName(vpcName)
        }

        public fun build(): software.amazon.awscdk.services.ec2.VpcLookupOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.VpcLookupOptions,
    ) : VpcLookupOptions {
        /**
         * Whether to match the default VPC.
         *
         * Default: Don't care whether we return the default VPC
         */
        override fun isDefault(): Boolean? = unwrap(this).getIsDefault()

        /**
         * The ID of the AWS account that owns the VPC.
         *
         * Default: the account id of the parent stack
         */
        override fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

        /**
         * Optional to override inferred region.
         *
         * Default: Current stack's environment region
         */
        override fun region(): String? = unwrap(this).getRegion()

        /**
         * Whether to look up whether a VPN Gateway is attached to the looked up VPC.
         *
         * You can set this to `false` if you know the VPC does not have a VPN Gateway attached, in
         * order to avoid an API call.
         *
         * If you change this property from `false` to `true` or undefined, you may need to clear
         * the corresponding context entry in `cdk.context.json` in order to trigger a new lookup.
         *
         * Default: true
         */
        override fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

        /**
         * Optional tag for subnet group name.
         *
         * If not provided, we'll look at the aws-cdk:subnet-name tag. If the subnet does not have
         * the specified tag, we'll use its type as the name.
         *
         * Default: aws-cdk:subnet-name
         */
        override fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

        /**
         * Tags on the VPC.
         *
         * The VPC must have all of these tags
         *
         * Default: Don't filter on tags
         */
        override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

        /**
         * The ID of the VPC.
         *
         * If given, will import exactly this VPC.
         *
         * Default: Don't filter on vpcId
         */
        override fun vpcId(): String? = unwrap(this).getVpcId()

        /**
         * The name of the VPC.
         *
         * If given, will import the VPC with this name.
         *
         * Default: Don't filter on vpcName
         */
        override fun vpcName(): String? = unwrap(this).getVpcName()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): VpcLookupOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.VpcLookupOptions
        ): VpcLookupOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: VpcLookupOptions
        ): software.amazon.awscdk.services.ec2.VpcLookupOptions = (wrapped as Wrapper).cdkObject
    }
}
