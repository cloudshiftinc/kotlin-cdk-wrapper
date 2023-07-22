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
