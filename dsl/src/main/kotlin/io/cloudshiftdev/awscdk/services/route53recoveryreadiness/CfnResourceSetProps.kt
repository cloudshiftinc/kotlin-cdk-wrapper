package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceSetProps {
  /**
   * The name of the resource set to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesetname)
   */
  public fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  /**
   * The resource type of the resources in the resource set. Enter one of the following values for
   * resource type:.
   *
   * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
   * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
   * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
   * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
   * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection,
   * AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
   *
   * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
   * isn't an actual AWS CloudFormation resource type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesettype)
   */
  public fun resourceSetType(): String

  /**
   * A list of resource objects in the resource set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
   */
  public fun resources(): Any

  /**
   * A tag to associate with the parameters for a resource set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourceSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceSetName The name of the resource set to create.
     */
    public fun resourceSetName(resourceSetName: String)

    /**
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     * the following values for resource type:. 
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     */
    public fun resourceSetType(resourceSetType: String)

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(resources: IResolvable)

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(resources: List<Any>)

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(vararg resources: Any)

    /**
     * @param tags A tag to associate with the parameters for a resource set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag to associate with the parameters for a resource set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.builder()

    /**
     * @param resourceSetName The name of the resource set to create.
     */
    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     * the following values for resource type:. 
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     */
    override fun resourceSetType(resourceSetType: String) {
      cdkBuilder.resourceSetType(resourceSetType)
    }

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    /**
     * @param tags A tag to associate with the parameters for a resource set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A tag to associate with the parameters for a resource set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps,
  ) : CdkObject(cdkObject), CfnResourceSetProps {
    /**
     * The name of the resource set to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesetname)
     */
    override fun resourceSetName(): String? = unwrap(this).getResourceSetName()

    /**
     * The resource type of the resources in the resource set. Enter one of the following values for
     * resource type:.
     *
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesettype)
     */
    override fun resourceSetType(): String = unwrap(this).getResourceSetType()

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     */
    override fun resources(): Any = unwrap(this).getResources()

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps):
        CfnResourceSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSetProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
  }
}
