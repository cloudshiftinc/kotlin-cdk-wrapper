package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetNetworkAclAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** Returns the value of this object's AssociationId property. */
    public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the network ACL. */
    public open fun networkAclId(): String = unwrap(this).getNetworkAclId()

    /** The ID of the network ACL. */
    public open fun networkAclId(`value`: String) {
        unwrap(this).setNetworkAclId(`value`)
    }

    /** The ID of the subnet. */
    public open fun subnetId(): String = unwrap(this).getSubnetId()

    /** The ID of the subnet. */
    public open fun subnetId(`value`: String) {
        unwrap(this).setSubnetId(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSubnetNetworkAclAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ID of the network ACL.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
         *
         * @param networkAclId The ID of the network ACL.
         */
        public fun networkAclId(networkAclId: String)

        /**
         * The ID of the subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
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
            software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder =
            software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder.create(
                scope,
                id
            )

        /**
         * The ID of the network ACL.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
         *
         * @param networkAclId The ID of the network ACL.
         */
        override fun networkAclId(networkAclId: String) {
            cdkBuilder.networkAclId(networkAclId)
        }

        /**
         * The ID of the subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
         *
         * @param subnetId The ID of the subnet.
         */
        override fun subnetId(subnetId: String) {
            cdkBuilder.subnetId(subnetId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSubnetNetworkAclAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSubnetNetworkAclAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
        ): CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnSubnetNetworkAclAssociation
        ): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation = wrapped.cdkObject
    }
}
