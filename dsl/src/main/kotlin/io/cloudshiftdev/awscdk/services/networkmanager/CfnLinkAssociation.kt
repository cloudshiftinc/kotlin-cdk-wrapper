package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLinkAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** The device ID for the link association. */
    public open fun deviceId(): String = unwrap(this).getDeviceId()

    /** The device ID for the link association. */
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
    public open fun linkId(): String = unwrap(this).getLinkId()

    /** The ID of the link. */
    public open fun linkId(`value`: String) {
        unwrap(this).setLinkId(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnLinkAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The device ID for the link association.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid)
         *
         * @param deviceId The device ID for the link association.
         */
        public fun deviceId(deviceId: String)

        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        public fun globalNetworkId(globalNetworkId: String)

        /**
         * The ID of the link.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid)
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
            software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder =
            software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder.create(
                scope,
                id
            )

        /**
         * The device ID for the link association.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid)
         *
         * @param deviceId The device ID for the link association.
         */
        override fun deviceId(deviceId: String) {
            cdkBuilder.deviceId(deviceId)
        }

        /**
         * The ID of the global network.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid)
         *
         * @param globalNetworkId The ID of the global network.
         */
        override fun globalNetworkId(globalNetworkId: String) {
            cdkBuilder.globalNetworkId(globalNetworkId)
        }

        /**
         * The ID of the link.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid)
         *
         * @param linkId The ID of the link.
         */
        override fun linkId(linkId: String) {
            cdkBuilder.linkId(linkId)
        }

        public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLinkAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLinkAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
        ): CfnLinkAssociation = CfnLinkAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnLinkAssociation
        ): software.amazon.awscdk.services.networkmanager.CfnLinkAssociation = wrapped.cdkObject
    }
}
