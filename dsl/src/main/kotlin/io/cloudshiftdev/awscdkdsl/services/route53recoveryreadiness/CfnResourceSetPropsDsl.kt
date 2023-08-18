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
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps

/**
 * Properties for defining a `CfnResourceSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnResourceSetProps cfnResourceSetProps = CfnResourceSetProps.builder()
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
public class CfnResourceSetPropsDsl {
    private val cdkBuilder: CfnResourceSetProps.Builder = CfnResourceSetProps.builder()

    private val _resources: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param resourceSetName The name of the resource set to create. */
    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     *   the following values for resource type:. AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage,
     *   AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway,
     *   AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer,
     *   AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster,
     *   AWS::RDS::DBCluster, AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic,
     *   AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway,
     *   AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     */
    public fun resourceSetType(resourceSetType: String) {
        cdkBuilder.resourceSetType(resourceSetType)
    }

    /** @param resources A list of resource objects in the resource set. */
    public fun resources(vararg resources: Any) {
        _resources.addAll(listOf(*resources))
    }

    /** @param resources A list of resource objects in the resource set. */
    public fun resources(resources: Collection<Any>) {
        _resources.addAll(resources)
    }

    /** @param resources A list of resource objects in the resource set. */
    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    /** @param tags A tag to associate with the parameters for a resource set. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A tag to associate with the parameters for a resource set. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceSetProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
