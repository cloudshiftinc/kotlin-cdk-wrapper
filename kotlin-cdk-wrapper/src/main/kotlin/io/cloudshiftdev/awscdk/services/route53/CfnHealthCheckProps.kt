@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnHealthCheck`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnHealthCheckProps cfnHealthCheckProps = CfnHealthCheckProps.builder()
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
public interface CfnHealthCheckProps {
  /**
   * A complex type that contains detailed information about one health check.
   *
   * For the values to enter for `HealthCheckConfig` , see
   * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
   */
  public fun healthCheckConfig(): Any

  /**
   * The `HealthCheckTags` property describes key-value pairs that are associated with an
   * `AWS::Route53::HealthCheck` resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
   */
  public fun healthCheckTags(): Any? = unwrap(this).getHealthCheckTags()

  /**
   * A builder for [CfnHealthCheckProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    public fun healthCheckConfig(healthCheckConfig: IResolvable)

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    public fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty)

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e1b3159cb2ed23d4f2a6ca6db791dceb189e7522f57dceea593a17ff4f463")
    public
        fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit)

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    public fun healthCheckTags(healthCheckTags: IResolvable)

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    public fun healthCheckTags(healthCheckTags: List<Any>)

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    public fun healthCheckTags(vararg healthCheckTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHealthCheckProps.Builder =
        software.amazon.awscdk.services.route53.CfnHealthCheckProps.builder()

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    override fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(CfnHealthCheck.HealthCheckConfigProperty.Companion::unwrap))
    }

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e1b3159cb2ed23d4f2a6ca6db791dceb189e7522f57dceea593a17ff4f463")
    override
        fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(CfnHealthCheck.HealthCheckConfigProperty(healthCheckConfig))

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    override fun healthCheckTags(healthCheckTags: IResolvable) {
      cdkBuilder.healthCheckTags(healthCheckTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    override fun healthCheckTags(healthCheckTags: List<Any>) {
      cdkBuilder.healthCheckTags(healthCheckTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    override fun healthCheckTags(vararg healthCheckTags: Any): Unit =
        healthCheckTags(healthCheckTags.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHealthCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheckProps,
  ) : CdkObject(cdkObject), CfnHealthCheckProps {
    /**
     * A complex type that contains detailed information about one health check.
     *
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
     */
    override fun healthCheckConfig(): Any = unwrap(this).getHealthCheckConfig()

    /**
     * The `HealthCheckTags` property describes key-value pairs that are associated with an
     * `AWS::Route53::HealthCheck` resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
     */
    override fun healthCheckTags(): Any? = unwrap(this).getHealthCheckTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHealthCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheckProps):
        CfnHealthCheckProps = CdkObjectWrappers.wrap(cdkObject) as? CfnHealthCheckProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHealthCheckProps):
        software.amazon.awscdk.services.route53.CfnHealthCheckProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHealthCheckProps
  }
}
