package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcConnector
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of this VPC connector. */
    public open fun attrVpcConnectorArn(): String = unwrap(this).getAttrVpcConnectorArn()

    /**
     * The revision of this VPC connector.
     *
     * It's unique among all the active connectors ( `"Status": "ACTIVE"` ) that share the same
     * `Name` .
     *
     * At this time, App Runner supports only one revision per name.
     */
    public open fun attrVpcConnectorRevision(): Number = unwrap(this).getAttrVpcConnectorRevision()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     */
    public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     */
    public open fun securityGroups(`value`: List<String>) {
        unwrap(this).setSecurityGroups(`value`)
    }

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     */
    public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     */
    public open fun subnets(): List<String> = unwrap(this).getSubnets()

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     */
    public open fun subnets(`value`: List<String>) {
        unwrap(this).setSubnets(`value`)
    }

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     */
    public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A list of metadata items that you can associate with your VPC connector resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A list of metadata items that you can associate with your VPC connector resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A list of metadata items that you can associate with your VPC connector resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A name for the VPC connector. */
    public open fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()

    /** A name for the VPC connector. */
    public open fun vpcConnectorName(`value`: String) {
        unwrap(this).setVpcConnectorName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apprunner.CfnVpcConnector]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A list of IDs of security groups that App Runner should use for access to AWS resources
         * under the specified subnets.
         *
         * If not specified, App Runner uses the default security group of the Amazon VPC. The
         * default security group allows all outbound traffic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
         *
         * @param securityGroups A list of IDs of security groups that App Runner should use for
         *   access to AWS resources under the specified subnets.
         */
        public fun securityGroups(securityGroups: List<String>)

        /**
         * A list of IDs of security groups that App Runner should use for access to AWS resources
         * under the specified subnets.
         *
         * If not specified, App Runner uses the default security group of the Amazon VPC. The
         * default security group allows all outbound traffic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
         *
         * @param securityGroups A list of IDs of security groups that App Runner should use for
         *   access to AWS resources under the specified subnets.
         */
        public fun securityGroups(vararg securityGroups: String)

        /**
         * A list of IDs of subnets that App Runner should use when it associates your service with
         * a custom Amazon VPC.
         *
         * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from
         * the subnets you specify.
         *
         * App Runner currently only provides support for IPv4.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
         *
         * @param subnets A list of IDs of subnets that App Runner should use when it associates
         *   your service with a custom Amazon VPC.
         */
        public fun subnets(subnets: List<String>)

        /**
         * A list of IDs of subnets that App Runner should use when it associates your service with
         * a custom Amazon VPC.
         *
         * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from
         * the subnets you specify.
         *
         * App Runner currently only provides support for IPv4.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
         *
         * @param subnets A list of IDs of subnets that App Runner should use when it associates
         *   your service with a custom Amazon VPC.
         */
        public fun subnets(vararg subnets: String)

        /**
         * A list of metadata items that you can associate with your VPC connector resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
         *
         * @param tags A list of metadata items that you can associate with your VPC connector
         *   resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of metadata items that you can associate with your VPC connector resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
         *
         * @param tags A list of metadata items that you can associate with your VPC connector
         *   resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * A name for the VPC connector.
         *
         * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-vpcconnectorname)
         *
         * @param vpcConnectorName A name for the VPC connector.
         */
        public fun vpcConnectorName(vpcConnectorName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnVpcConnector.Builder =
            software.amazon.awscdk.services.apprunner.CfnVpcConnector.Builder.create(scope, id)

        /**
         * A list of IDs of security groups that App Runner should use for access to AWS resources
         * under the specified subnets.
         *
         * If not specified, App Runner uses the default security group of the Amazon VPC. The
         * default security group allows all outbound traffic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
         *
         * @param securityGroups A list of IDs of security groups that App Runner should use for
         *   access to AWS resources under the specified subnets.
         */
        override fun securityGroups(securityGroups: List<String>) {
            cdkBuilder.securityGroups(securityGroups)
        }

        /**
         * A list of IDs of security groups that App Runner should use for access to AWS resources
         * under the specified subnets.
         *
         * If not specified, App Runner uses the default security group of the Amazon VPC. The
         * default security group allows all outbound traffic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
         *
         * @param securityGroups A list of IDs of security groups that App Runner should use for
         *   access to AWS resources under the specified subnets.
         */
        override fun securityGroups(vararg securityGroups: String): Unit =
            securityGroups(securityGroups.toList())

        /**
         * A list of IDs of subnets that App Runner should use when it associates your service with
         * a custom Amazon VPC.
         *
         * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from
         * the subnets you specify.
         *
         * App Runner currently only provides support for IPv4.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
         *
         * @param subnets A list of IDs of subnets that App Runner should use when it associates
         *   your service with a custom Amazon VPC.
         */
        override fun subnets(subnets: List<String>) {
            cdkBuilder.subnets(subnets)
        }

        /**
         * A list of IDs of subnets that App Runner should use when it associates your service with
         * a custom Amazon VPC.
         *
         * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from
         * the subnets you specify.
         *
         * App Runner currently only provides support for IPv4.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
         *
         * @param subnets A list of IDs of subnets that App Runner should use when it associates
         *   your service with a custom Amazon VPC.
         */
        override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

        /**
         * A list of metadata items that you can associate with your VPC connector resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
         *
         * @param tags A list of metadata items that you can associate with your VPC connector
         *   resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of metadata items that you can associate with your VPC connector resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
         *
         * @param tags A list of metadata items that you can associate with your VPC connector
         *   resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * A name for the VPC connector.
         *
         * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-vpcconnectorname)
         *
         * @param vpcConnectorName A name for the VPC connector.
         */
        override fun vpcConnectorName(vpcConnectorName: String) {
            cdkBuilder.vpcConnectorName(vpcConnectorName)
        }

        public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcConnector =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnVpcConnector {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnVpcConnector(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnector
        ): CfnVpcConnector = CfnVpcConnector(cdkObject)

        internal fun unwrap(
            wrapped: CfnVpcConnector
        ): software.amazon.awscdk.services.apprunner.CfnVpcConnector = wrapped.cdkObject
    }
}
