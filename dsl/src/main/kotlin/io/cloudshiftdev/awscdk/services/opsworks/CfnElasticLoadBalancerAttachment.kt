package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnElasticLoadBalancerAttachment
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The Elastic Load Balancing instance name. */
    public open fun elasticLoadBalancerName(): String = unwrap(this).getElasticLoadBalancerName()

    /** The Elastic Load Balancing instance name. */
    public open fun elasticLoadBalancerName(`value`: String) {
        unwrap(this).setElasticLoadBalancerName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached. */
    public open fun layerId(): String = unwrap(this).getLayerId()

    /** The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached. */
    public open fun layerId(`value`: String) {
        unwrap(this).setLayerId(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Elastic Load Balancing instance name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
         *
         * @param elasticLoadBalancerName The Elastic Load Balancing instance name.
         */
        public fun elasticLoadBalancerName(elasticLoadBalancerName: String)

        /**
         * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
         *
         * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load
         *   balancer is attached.
         */
        public fun layerId(layerId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder =
            software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder
                .create(scope, id)

        /**
         * The Elastic Load Balancing instance name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
         *
         * @param elasticLoadBalancerName The Elastic Load Balancing instance name.
         */
        override fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
            cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
        }

        /**
         * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
         *
         * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load
         *   balancer is attached.
         */
        override fun layerId(layerId: String) {
            cdkBuilder.layerId(layerId)
        }

        public fun build():
            software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnElasticLoadBalancerAttachment {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnElasticLoadBalancerAttachment(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
        ): CfnElasticLoadBalancerAttachment = CfnElasticLoadBalancerAttachment(cdkObject)

        internal fun unwrap(
            wrapped: CfnElasticLoadBalancerAttachment
        ): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
            wrapped.cdkObject
    }
}
