package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetRouteTableAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** The ID of the subnet route table association. */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the route table. */
    public open fun routeTableId(): String = unwrap(this).getRouteTableId()

    /** The ID of the route table. */
    public open fun routeTableId(`value`: String) {
        unwrap(this).setRouteTableId(`value`)
    }

    /** The ID of the subnet. */
    public open fun subnetId(): String = unwrap(this).getSubnetId()

    /** The ID of the subnet. */
    public open fun subnetId(`value`: String) {
        unwrap(this).setSubnetId(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSubnetRouteTableAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ID of the route table.
         *
         * The physical ID changes when the route table ID is changed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-routetableid)
         *
         * @param routeTableId The ID of the route table.
         */
        public fun routeTableId(routeTableId: String)

        /**
         * The ID of the subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-subnetid)
         *
         * @param subnetId The ID of the subnet.
         */
        public fun subnetId(subnetId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder =
            software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder.create(
                scope,
                id
            )

        /**
         * The ID of the route table.
         *
         * The physical ID changes when the route table ID is changed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-routetableid)
         *
         * @param routeTableId The ID of the route table.
         */
        override fun routeTableId(routeTableId: String) {
            cdkBuilder.routeTableId(routeTableId)
        }

        /**
         * The ID of the subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-subnetid)
         *
         * @param subnetId The ID of the subnet.
         */
        override fun subnetId(subnetId: String) {
            cdkBuilder.subnetId(subnetId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSubnetRouteTableAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSubnetRouteTableAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
        ): CfnSubnetRouteTableAssociation = CfnSubnetRouteTableAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnSubnetRouteTableAssociation
        ): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation = wrapped.cdkObject
    }
}
