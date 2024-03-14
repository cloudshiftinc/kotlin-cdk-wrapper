package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcConnection
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The ARN of the VPC connection. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The type of private link authentication. */
    public open fun authentication(): String = unwrap(this).getAuthentication()

    /** The type of private link authentication. */
    public open fun authentication(`value`: String) {
        unwrap(this).setAuthentication(`value`)
    }

    /** The list of subnets in the client VPC to connect to. */
    public open fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

    /** The list of subnets in the client VPC to connect to. */
    public open fun clientSubnets(`value`: List<String>) {
        unwrap(this).setClientSubnets(`value`)
    }

    /** The list of subnets in the client VPC to connect to. */
    public open fun clientSubnets(vararg `value`: String): Unit = clientSubnets(`value`.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The security groups to attach to the ENIs for the broker nodes. */
    public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    /** The security groups to attach to the ENIs for the broker nodes. */
    public open fun securityGroups(`value`: List<String>) {
        unwrap(this).setSecurityGroups(`value`)
    }

    /** The security groups to attach to the ENIs for the broker nodes. */
    public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Create tags when creating the VPC connection. */
    public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

    /** Create tags when creating the VPC connection. */
    public open fun tagsRaw(`value`: Map<String, String>) {
        unwrap(this).setTagsRaw(`value`)
    }

    /** The Amazon Resource Name (ARN) of the cluster. */
    public open fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

    /** The Amazon Resource Name (ARN) of the cluster. */
    public open fun targetClusterArn(`value`: String) {
        unwrap(this).setTargetClusterArn(`value`)
    }

    /** The VPC id of the remote client. */
    public open fun vpcId(): String = unwrap(this).getVpcId()

    /** The VPC id of the remote client. */
    public open fun vpcId(`value`: String) {
        unwrap(this).setVpcId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnVpcConnection]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The type of private link authentication.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
         *
         * @param authentication The type of private link authentication.
         */
        public fun authentication(authentication: String)

        /**
         * The list of subnets in the client VPC to connect to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
         *
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         */
        public fun clientSubnets(clientSubnets: List<String>)

        /**
         * The list of subnets in the client VPC to connect to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
         *
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         */
        public fun clientSubnets(vararg clientSubnets: String)

        /**
         * The security groups to attach to the ENIs for the broker nodes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
         *
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         */
        public fun securityGroups(securityGroups: List<String>)

        /**
         * The security groups to attach to the ENIs for the broker nodes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
         *
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         */
        public fun securityGroups(vararg securityGroups: String)

        /**
         * Create tags when creating the VPC connection.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
         *
         * @param tags Create tags when creating the VPC connection.
         */
        public fun tags(tags: Map<String, String>)

        /**
         * The Amazon Resource Name (ARN) of the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
         *
         * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster.
         */
        public fun targetClusterArn(targetClusterArn: String)

        /**
         * The VPC id of the remote client.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
         *
         * @param vpcId The VPC id of the remote client.
         */
        public fun vpcId(vpcId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.msk.CfnVpcConnection.Builder =
            software.amazon.awscdk.services.msk.CfnVpcConnection.Builder.create(scope, id)

        /**
         * The type of private link authentication.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
         *
         * @param authentication The type of private link authentication.
         */
        override fun authentication(authentication: String) {
            cdkBuilder.authentication(authentication)
        }

        /**
         * The list of subnets in the client VPC to connect to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
         *
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         */
        override fun clientSubnets(clientSubnets: List<String>) {
            cdkBuilder.clientSubnets(clientSubnets)
        }

        /**
         * The list of subnets in the client VPC to connect to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
         *
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         */
        override fun clientSubnets(vararg clientSubnets: String): Unit =
            clientSubnets(clientSubnets.toList())

        /**
         * The security groups to attach to the ENIs for the broker nodes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
         *
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         */
        override fun securityGroups(securityGroups: List<String>) {
            cdkBuilder.securityGroups(securityGroups)
        }

        /**
         * The security groups to attach to the ENIs for the broker nodes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
         *
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         */
        override fun securityGroups(vararg securityGroups: String): Unit =
            securityGroups(securityGroups.toList())

        /**
         * Create tags when creating the VPC connection.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
         *
         * @param tags Create tags when creating the VPC connection.
         */
        override fun tags(tags: Map<String, String>) {
            cdkBuilder.tags(tags)
        }

        /**
         * The Amazon Resource Name (ARN) of the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
         *
         * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster.
         */
        override fun targetClusterArn(targetClusterArn: String) {
            cdkBuilder.targetClusterArn(targetClusterArn)
        }

        /**
         * The VPC id of the remote client.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
         *
         * @param vpcId The VPC id of the remote client.
         */
        override fun vpcId(vpcId: String) {
            cdkBuilder.vpcId(vpcId)
        }

        public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnection =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnVpcConnection {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnVpcConnection(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection
        ): CfnVpcConnection = CfnVpcConnection(cdkObject)

        internal fun unwrap(
            wrapped: CfnVpcConnection
        ): software.amazon.awscdk.services.msk.CfnVpcConnection = wrapped.cdkObject
    }
}
