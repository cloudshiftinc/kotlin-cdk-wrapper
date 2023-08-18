@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.route53recoveryreadiness

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
import software.constructs.Construct

/**
 * Creates a resource set in Amazon Route 53 Application Recovery Controller.
 *
 * A resource set is a set of resources of one type, such as Network Load Balancers, that span
 * multiple cells. You can associate a resource set with a readiness check to have Route 53 ARC
 * continually monitor the resources in the set for failover readiness.
 *
 * You typically create a resource set and a readiness check for each supported type of AWS resource
 * in your application.
 *
 * For more information, see
 * [Readiness checks, resource sets, and readiness scopes](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.recovery-groups.readiness-scope.html)
 * in the Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnResourceSet cfnResourceSet = CfnResourceSet.Builder.create(this, "MyCfnResourceSet")
 * .resources(List.of(ResourceProperty.builder()
 * .componentId("componentId")
 * .dnsTargetResource(DNSTargetResourceProperty.builder()
 * .domainName("domainName")
 * .hostedZoneArn("hostedZoneArn")
 * .recordSetId("recordSetId")
 * .recordType("recordType")
 * .targetResource(TargetResourceProperty.builder()
 * .nlbResource(NLBResourceProperty.builder()
 * .arn("arn")
 * .build())
 * .r53Resource(R53ResourceRecordProperty.builder()
 * .domainName("domainName")
 * .recordSetId("recordSetId")
 * .build())
 * .build())
 * .build())
 * .readinessScopes(List.of("readinessScopes"))
 * .resourceArn("resourceArn")
 * .build()))
 * .resourceSetType("resourceSetType")
 * // the properties below are optional
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html)
 */
@CdkDslMarker
public class CfnResourceSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceSet.Builder = CfnResourceSet.Builder.create(scope, id)

    private val _resources: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the resource set to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesetname)
     *
     * @param resourceSetName The name of the resource set to create.
     */
    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * The resource type of the resources in the resource set. Enter one of the following values for
     * resource type:.
     *
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway,
     * AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesettype)
     *
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     *   the following values for resource type:.
     */
    public fun resourceSetType(resourceSetType: String) {
        cdkBuilder.resourceSetType(resourceSetType)
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     *
     * @param resources A list of resource objects in the resource set.
     */
    public fun resources(vararg resources: Any) {
        _resources.addAll(listOf(*resources))
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     *
     * @param resources A list of resource objects in the resource set.
     */
    public fun resources(resources: Collection<Any>) {
        _resources.addAll(resources)
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     *
     * @param resources A list of resource objects in the resource set.
     */
    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     *
     * @param tags A tag to associate with the parameters for a resource set.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     *
     * @param tags A tag to associate with the parameters for a resource set.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceSet {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
