@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.constructs.Construct

/**
 * The `AWS::Route53::HealthCheck` resource is a Route 53 resource type that contains settings for a
 * Route 53 health check.
 *
 * For information about associating health checks with records, see
 * [HealthCheckId](https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId)
 * in
 * [ChangeResourceRecordSets](https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html)
 * .
 *
 *
 * You can't create a health check with simple routing.
 *
 *
 * *ELB Load Balancers*
 *
 * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not
 * create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a
 * load balancer, you configure settings for an ELB health check, which performs a similar function to
 * a Route 53 health check.
 *
 * *Private Hosted Zones*
 *
 * You can associate health checks with failover records in a private hosted zone. Note the
 * following:
 *
 * * Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC
 * by IP address, you must assign a public IP address to the instance in the VPC.
 * * You can configure a health checker to check the health of an external resource that the
 * instance relies on, such as a database server.
 * * You can create a CloudWatch metric, associate an alarm with the metric, and then create a
 * health check that is based on the state of the alarm. For example, you might create a CloudWatch
 * metric that checks the status of the Amazon EC2 `StatusCheckFailed` metric, add an alarm to the
 * metric, and then create a health check that is based on the state of the alarm. For information
 * about creating CloudWatch metrics and alarms by using the CloudWatch console, see the [Amazon
 * CloudWatch User
 * Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CfnHealthCheck cfnHealthCheck = CfnHealthCheck.Builder.create(this, "MyCfnHealthCheck")
 * .healthCheckConfig(HealthCheckConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .alarmIdentifier(AlarmIdentifierProperty.builder()
 * .name("name")
 * .region("region")
 * .build())
 * .childHealthChecks(List.of("childHealthChecks"))
 * .enableSni(false)
 * .failureThreshold(123)
 * .fullyQualifiedDomainName("fullyQualifiedDomainName")
 * .healthThreshold(123)
 * .insufficientDataHealthStatus("insufficientDataHealthStatus")
 * .inverted(false)
 * .ipAddress("ipAddress")
 * .measureLatency(false)
 * .port(123)
 * .regions(List.of("regions"))
 * .requestInterval(123)
 * .resourcePath("resourcePath")
 * .routingControlArn("routingControlArn")
 * .searchString("searchString")
 * .build())
 * // the properties below are optional
 * .healthCheckTags(List.of(HealthCheckTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
 */
@CdkDslMarker
public class CfnHealthCheckDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHealthCheck.Builder = CfnHealthCheck.Builder.create(scope, id)

  private val _healthCheckTags: MutableList<Any> = mutableListOf()

  /**
   * A complex type that contains detailed information about one health check.
   *
   * For the values to enter for `HealthCheckConfig` , see
   * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
   * @param healthCheckConfig A complex type that contains detailed information about one health
   * check. 
   */
  public fun healthCheckConfig(healthCheckConfig: IResolvable) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  /**
   * A complex type that contains detailed information about one health check.
   *
   * For the values to enter for `HealthCheckConfig` , see
   * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
   * @param healthCheckConfig A complex type that contains detailed information about one health
   * check. 
   */
  public fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  /**
   * The `HealthCheckTags` property describes key-value pairs that are associated with an
   * `AWS::Route53::HealthCheck` resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
   * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
   * associated with an `AWS::Route53::HealthCheck` resource. 
   */
  public fun healthCheckTags(vararg healthCheckTags: Any) {
    _healthCheckTags.addAll(listOf(*healthCheckTags))
  }

  /**
   * The `HealthCheckTags` property describes key-value pairs that are associated with an
   * `AWS::Route53::HealthCheck` resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
   * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
   * associated with an `AWS::Route53::HealthCheck` resource. 
   */
  public fun healthCheckTags(healthCheckTags: Collection<Any>) {
    _healthCheckTags.addAll(healthCheckTags)
  }

  /**
   * The `HealthCheckTags` property describes key-value pairs that are associated with an
   * `AWS::Route53::HealthCheck` resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
   * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
   * associated with an `AWS::Route53::HealthCheck` resource. 
   */
  public fun healthCheckTags(healthCheckTags: IResolvable) {
    cdkBuilder.healthCheckTags(healthCheckTags)
  }

  public fun build(): CfnHealthCheck {
    if(_healthCheckTags.isNotEmpty()) cdkBuilder.healthCheckTags(_healthCheckTags)
    return cdkBuilder.build()
  }
}
