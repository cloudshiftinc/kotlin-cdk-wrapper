package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomerGatewayAssociation
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** The Amazon Resource Name (ARN) of the customer gateway. */
    public open fun customerGatewayArn(): String = unwrap(this).getCustomerGatewayArn()

    /** The Amazon Resource Name (ARN) of the customer gateway. */
    public open fun customerGatewayArn(`value`: String) {
        unwrap(this).setCustomerGatewayArn(`value`)
    }

    /** The ID of the device. */
    public open fun deviceId(): String = unwrap(this).getDeviceId()

    /** The ID of the device. */
    public open fun deviceId(`value`: String) {
        unwrap(this).setDeviceId(`value`)
    }

    /** The ID of the global network. */
    public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /** The ID of the global network. */
    public open fun globalNetworkId(`value`: String) {
        unwrap(this).setGlobalNetworkId(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the link. */
    public open fun linkId(): String? = unwrap(this).getLinkId()

    /** The ID of the link. */
    public open fun linkId(`value`: String) {
        unwrap(this).setLinkId(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.networkmanager.CfnCustomerGatewayAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Amazon Resource Name (ARN) of the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn)
         *
         * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway.
         */
        public fun customerGatewayArn(customerGatewayArn: String)

        /**
         * The ID of the device.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid)
         *
         * @param deviceId The ID of the device.
         */
        public fun deviceId(deviceId: String)

        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        public fun globalNetworkId(globalNetworkId: String)

        /**
         * The ID of the link.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid)
         *
         * @param linkId The ID of the link.
         */
        public fun linkId(linkId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder =
            software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder
                .create(scope, id)

        /**
         * The Amazon Resource Name (ARN) of the customer gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn)
         *
         * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway.
         */
        override fun customerGatewayArn(customerGatewayArn: String) {
            cdkBuilder.customerGatewayArn(customerGatewayArn)
        }

        /**
         * The ID of the device.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid)
         *
         * @param deviceId The ID of the device.
         */
        override fun deviceId(deviceId: String) {
            cdkBuilder.deviceId(deviceId)
        }

        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        override fun globalNetworkId(globalNetworkId: String) {
            cdkBuilder.globalNetworkId(globalNetworkId)
        }

        /**
         * The ID of the link.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid)
         *
         * @param linkId The ID of the link.
         */
        override fun linkId(linkId: String) {
            cdkBuilder.linkId(linkId)
        }

        public fun build():
            software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCustomerGatewayAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCustomerGatewayAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
        ): CfnCustomerGatewayAssociation = CfnCustomerGatewayAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnCustomerGatewayAssociation
        ): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation =
            wrapped.cdkObject
    }
}
