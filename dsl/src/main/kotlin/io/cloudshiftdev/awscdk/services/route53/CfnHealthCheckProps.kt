package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
    }

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    override fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(CfnHealthCheck.HealthCheckConfigProperty::unwrap))
    }

    /**
     * @param healthCheckConfig A complex type that contains detailed information about one health
     * check. 
     * For the values to enter for `HealthCheckConfig` , see
     * [HealthCheckConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e1b3159cb2ed23d4f2a6ca6db791dceb189e7522f57dceea593a17ff4f463")
    override
        fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(CfnHealthCheck.HealthCheckConfigProperty(healthCheckConfig))

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    override fun healthCheckTags(healthCheckTags: IResolvable) {
      cdkBuilder.healthCheckTags(healthCheckTags.let(IResolvable::unwrap))
    }

    /**
     * @param healthCheckTags The `HealthCheckTags` property describes key-value pairs that are
     * associated with an `AWS::Route53::HealthCheck` resource.
     */
    override fun healthCheckTags(healthCheckTags: List<Any>) {
      cdkBuilder.healthCheckTags(healthCheckTags)
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
    override val cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheckProps,
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
        CfnHealthCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHealthCheckProps):
        software.amazon.awscdk.services.route53.CfnHealthCheckProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHealthCheckProps
  }
}
