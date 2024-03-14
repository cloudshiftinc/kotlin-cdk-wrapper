package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRegistration
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration,
) : CfnResource(cdkObject), IInspectable {
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

    /** The Amazon Resource Name (ARN) of the transit gateway. */
    public open fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()

    /** The Amazon Resource Name (ARN) of the transit gateway. */
    public open fun transitGatewayArn(`value`: String) {
        unwrap(this).setTransitGatewayArn(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.networkmanager.CfnTransitGatewayRegistration].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        public fun globalNetworkId(globalNetworkId: String)

        /**
         * The Amazon Resource Name (ARN) of the transit gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
         *
         * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway.
         */
        public fun transitGatewayArn(transitGatewayArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder =
            software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder
                .create(scope, id)

        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        override fun globalNetworkId(globalNetworkId: String) {
            cdkBuilder.globalNetworkId(globalNetworkId)
        }

        /**
         * The Amazon Resource Name (ARN) of the transit gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
         *
         * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway.
         */
        override fun transitGatewayArn(transitGatewayArn: String) {
            cdkBuilder.transitGatewayArn(transitGatewayArn)
        }

        public fun build():
            software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnTransitGatewayRegistration {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnTransitGatewayRegistration(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
        ): CfnTransitGatewayRegistration = CfnTransitGatewayRegistration(cdkObject)

        internal fun unwrap(
            wrapped: CfnTransitGatewayRegistration
        ): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration =
            wrapped.cdkObject
    }
}
