@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTopicRuleDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnTopicRuleDestinationProps cfnTopicRuleDestinationProps =
 * CfnTopicRuleDestinationProps.builder()
 * .httpUrlProperties(HttpUrlDestinationSummaryProperty.builder()
 * .confirmationUrl("confirmationUrl")
 * .build())
 * .status("status")
 * .vpcProperties(VpcDestinationPropertiesProperty.builder()
 * .roleArn("roleArn")
 * .securityGroups(List.of("securityGroups"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html)
 */
public interface CfnTopicRuleDestinationProps {
  /**
   * Properties of the HTTP URL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
   */
  public fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

  /**
   * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
   *
   * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
   * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
   * endpoint.
   *
   * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You can
   * set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
   * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
   * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
   * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed out.
   * You can call `GetTopicRuleDestination` for details about the error. You can set status to
   * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
   * causes a new confirmation challenge to be sent to your confirmation endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Properties of the virtual private cloud (VPC) connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
   */
  public fun vpcProperties(): Any? = unwrap(this).getVpcProperties()

  /**
   * A builder for [CfnTopicRuleDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    public fun httpUrlProperties(httpUrlProperties: IResolvable)

    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    public
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty)

    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010bd1522fe20d65d1e51792627d288e2dac240d978257f23fa77787dff6b1a3")
    public
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder.() -> Unit)

    /**
     * @param status * **IN_PROGRESS** - A topic rule destination was created but has not been
     * confirmed.
     * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     *
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     * can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     * out. You can call `GetTopicRuleDestination` for details about the error. You can set status to
     * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
     * causes a new confirmation challenge to be sent to your confirmation endpoint.
     */
    public fun status(status: String)

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    public fun vpcProperties(vpcProperties: IResolvable)

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    public
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty)

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e10148f81787769647ddb8430133f3b1493dd84af69f1bdf37c0a60239fbd5")
    public
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps.Builder
        = software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps.builder()

    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    override fun httpUrlProperties(httpUrlProperties: IResolvable) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(IResolvable::unwrap))
    }

    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    override
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty::unwrap))
    }

    /**
     * @param httpUrlProperties Properties of the HTTP URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010bd1522fe20d65d1e51792627d288e2dac240d978257f23fa77787dff6b1a3")
    override
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
        Unit =
        httpUrlProperties(CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty(httpUrlProperties))

    /**
     * @param status * **IN_PROGRESS** - A topic rule destination was created but has not been
     * confirmed.
     * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     *
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     * can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     * out. You can call `GetTopicRuleDestination` for details about the error. You can set status to
     * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
     * causes a new confirmation challenge to be sent to your confirmation endpoint.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    override fun vpcProperties(vpcProperties: IResolvable) {
      cdkBuilder.vpcProperties(vpcProperties.let(IResolvable::unwrap))
    }

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    override
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty) {
      cdkBuilder.vpcProperties(vpcProperties.let(CfnTopicRuleDestination.VpcDestinationPropertiesProperty::unwrap))
    }

    /**
     * @param vpcProperties Properties of the virtual private cloud (VPC) connection.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e10148f81787769647ddb8430133f3b1493dd84af69f1bdf37c0a60239fbd5")
    override
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder.() -> Unit):
        Unit =
        vpcProperties(CfnTopicRuleDestination.VpcDestinationPropertiesProperty(vpcProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps,
  ) : CdkObject(cdkObject), CfnTopicRuleDestinationProps {
    /**
     * Properties of the HTTP URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-httpurlproperties)
     */
    override fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

    /**
     * * **IN_PROGRESS** - A topic rule destination was created but has not been confirmed.
     *
     * You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     * `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     *
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     * can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     * You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     * out. You can call `GetTopicRuleDestination` for details about the error. You can set status to
     * `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling `UpdateTopicRuleDestination`
     * causes a new confirmation challenge to be sent to your confirmation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Properties of the virtual private cloud (VPC) connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html#cfn-iot-topicruledestination-vpcproperties)
     */
    override fun vpcProperties(): Any? = unwrap(this).getVpcProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicRuleDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps):
        CfnTopicRuleDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTopicRuleDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleDestinationProps):
        software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
  }
}
