package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInterfacePermission
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The AWS account ID. */
    public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /** The AWS account ID. */
    public open fun awsAccountId(`value`: String) {
        unwrap(this).setAwsAccountId(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the network interface. */
    public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /** The ID of the network interface. */
    public open fun networkInterfaceId(`value`: String) {
        unwrap(this).setNetworkInterfaceId(`value`)
    }

    /** The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . */
    public open fun permission(): String = unwrap(this).getPermission()

    /** The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . */
    public open fun permission(`value`: String) {
        unwrap(this).setPermission(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInterfacePermission].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The AWS account ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
         *
         * @param awsAccountId The AWS account ID.
         */
        public fun awsAccountId(awsAccountId: String)

        /**
         * The ID of the network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
         *
         * @param networkInterfaceId The ID of the network interface.
         */
        public fun networkInterfaceId(networkInterfaceId: String)

        /**
         * The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
         *
         * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
         */
        public fun permission(permission: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder =
            software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder.create(
                scope,
                id
            )

        /**
         * The AWS account ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
         *
         * @param awsAccountId The AWS account ID.
         */
        override fun awsAccountId(awsAccountId: String) {
            cdkBuilder.awsAccountId(awsAccountId)
        }

        /**
         * The ID of the network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
         *
         * @param networkInterfaceId The ID of the network interface.
         */
        override fun networkInterfaceId(networkInterfaceId: String) {
            cdkBuilder.networkInterfaceId(networkInterfaceId)
        }

        /**
         * The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
         *
         * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
         */
        override fun permission(permission: String) {
            cdkBuilder.permission(permission)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnNetworkInterfacePermission {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnNetworkInterfacePermission(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
        ): CfnNetworkInterfacePermission = CfnNetworkInterfacePermission(cdkObject)

        internal fun unwrap(
            wrapped: CfnNetworkInterfacePermission
        ): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission = wrapped.cdkObject
    }
}
