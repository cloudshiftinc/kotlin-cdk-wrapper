@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps

@CdkDslMarker
public class CfnResourceSetPropsDsl {
  private val cdkBuilder: CfnResourceSetProps.Builder = CfnResourceSetProps.builder()

  private val _resources: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param resourceSetName The name of the resource set to create.
   */
  public fun resourceSetName(resourceSetName: String) {
    cdkBuilder.resourceSetName(resourceSetName)
  }

  /**
   * @param resourceSetType The resource type of the resources in the resource set. Enter one of the
   * following values for resource type:. 
   * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
   * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
   * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
   * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
   * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection,
   * AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
   *
   * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
   * isn't an actual AWS CloudFormation resource type.
   */
  public fun resourceSetType(resourceSetType: String) {
    cdkBuilder.resourceSetType(resourceSetType)
  }

  /**
   * @param resources A list of resource objects in the resource set. 
   */
  public fun resources(vararg resources: Any) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources A list of resource objects in the resource set. 
   */
  public fun resources(resources: Collection<Any>) {
    _resources.addAll(resources)
  }

  /**
   * @param resources A list of resource objects in the resource set. 
   */
  public fun resources(resources: IResolvable) {
    cdkBuilder.resources(resources)
  }

  /**
   * @param tags A tag to associate with the parameters for a resource set.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A tag to associate with the parameters for a resource set.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnResourceSetProps {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
