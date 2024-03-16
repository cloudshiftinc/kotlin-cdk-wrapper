@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEndpointGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnEndpointGroupProps cfnEndpointGroupProps = CfnEndpointGroupProps.builder()
 * .endpointGroupRegion("endpointGroupRegion")
 * .listenerArn("listenerArn")
 * // the properties below are optional
 * .endpointConfigurations(List.of(EndpointConfigurationProperty.builder()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .attachmentArn("attachmentArn")
 * .clientIpPreservationEnabled(false)
 * .weight(123)
 * .build()))
 * .healthCheckIntervalSeconds(123)
 * .healthCheckPath("healthCheckPath")
 * .healthCheckPort(123)
 * .healthCheckProtocol("healthCheckProtocol")
 * .portOverrides(List.of(PortOverrideProperty.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build()))
 * .thresholdCount(123)
 * .trafficDialPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html)
 */
public interface CfnEndpointGroupProps {
  /**
   * The list of endpoint objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
   */
  public fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

  /**
   * The AWS Regions where the endpoint group is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion)
   */
  public fun endpointGroupRegion(): String

  /**
   * The time—10 seconds or 30 seconds—between health checks for each endpoint.
   *
   * The default value is 30.
   *
   * Default: - 30
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds)
   */
  public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

  /**
   * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses
   * for the destination on the endpoints for health checks.
   *
   * The default is slash (/).
   *
   * Default: - "/"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath)
   */
  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * The port that Global Accelerator uses to perform health checks on endpoints that are part of
   * this endpoint group.
   *
   * The default port is the port for the listener that this endpoint group is associated with. If
   * the listener port is a list, Global Accelerator uses the first specified port in the list of
   * ports.
   *
   * Default: - -1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport)
   */
  public fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

  /**
   * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
   * of this endpoint group.
   *
   * The default value is TCP.
   *
   * Default: - "TCP"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol)
   */
  public fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  /**
   * The Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn)
   */
  public fun listenerArn(): String

  /**
   * Allows you to override the destination ports used to route traffic to an endpoint.
   *
   * Using a port override lets you map a list of external destination ports (that your users send
   * traffic to) to a list of internal destination ports that you want an application endpoint to
   * receive traffic on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
   */
  public fun portOverrides(): Any? = unwrap(this).getPortOverrides()

  /**
   * The number of consecutive health checks required to set the state of a healthy endpoint to
   * unhealthy, or to set an unhealthy endpoint to healthy.
   *
   * The default value is 3.
   *
   * Default: - 3
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount)
   */
  public fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

  /**
   * The percentage of traffic to send to an AWS Regions .
   *
   * Additional traffic is distributed to other endpoint groups for this listener.
   *
   * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The
   * percentage is applied to the traffic that would otherwise have been routed to the Region based on
   * optimal routing.
   *
   * The default value is 100.
   *
   * Default: - 100
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage)
   */
  public fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()

  /**
   * A builder for [CfnEndpointGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(endpointConfigurations: IResolvable)

    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(endpointConfigurations: List<Any>)

    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(vararg endpointConfigurations: Any)

    /**
     * @param endpointGroupRegion The AWS Regions where the endpoint group is located. 
     */
    public fun endpointGroupRegion(endpointGroupRegion: String)

    /**
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     * each endpoint.
     * The default value is 30.
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    /**
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     * Global Accelerator uses for the destination on the endpoints for health checks.
     * The default is slash (/).
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     * endpoints that are part of this endpoint group.
     * The default port is the port for the listener that this endpoint group is associated with. If
     * the listener port is a list, Global Accelerator uses the first specified port in the list of
     * ports.
     */
    public fun healthCheckPort(healthCheckPort: Number)

    /**
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     * on endpoints that are part of this endpoint group.
     * The default value is TCP.
     */
    public fun healthCheckProtocol(healthCheckProtocol: String)

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerArn(listenerArn: String)

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    public fun portOverrides(portOverrides: IResolvable)

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    public fun portOverrides(portOverrides: List<Any>)

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    public fun portOverrides(vararg portOverrides: Any)

    /**
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     * healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     * The default value is 3.
     */
    public fun thresholdCount(thresholdCount: Number)

    /**
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions .
     * Additional traffic is distributed to other endpoint groups for this listener.
     *
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region.
     * The percentage is applied to the traffic that would otherwise have been routed to the Region
     * based on optimal routing.
     *
     * The default value is 100.
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps.builder()

    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    override fun endpointConfigurations(endpointConfigurations: IResolvable) {
      cdkBuilder.endpointConfigurations(endpointConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    override fun endpointConfigurations(endpointConfigurations: List<Any>) {
      cdkBuilder.endpointConfigurations(endpointConfigurations)
    }

    /**
     * @param endpointConfigurations The list of endpoint objects.
     */
    override fun endpointConfigurations(vararg endpointConfigurations: Any): Unit =
        endpointConfigurations(endpointConfigurations.toList())

    /**
     * @param endpointGroupRegion The AWS Regions where the endpoint group is located. 
     */
    override fun endpointGroupRegion(endpointGroupRegion: String) {
      cdkBuilder.endpointGroupRegion(endpointGroupRegion)
    }

    /**
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     * each endpoint.
     * The default value is 30.
     */
    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     * Global Accelerator uses for the destination on the endpoints for health checks.
     * The default is slash (/).
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     * endpoints that are part of this endpoint group.
     * The default port is the port for the listener that this endpoint group is associated with. If
     * the listener port is a list, Global Accelerator uses the first specified port in the list of
     * ports.
     */
    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     * on endpoints that are part of this endpoint group.
     * The default value is TCP.
     */
    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    override fun portOverrides(portOverrides: IResolvable) {
      cdkBuilder.portOverrides(portOverrides.let(IResolvable::unwrap))
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    override fun portOverrides(portOverrides: List<Any>) {
      cdkBuilder.portOverrides(portOverrides)
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint.
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     */
    override fun portOverrides(vararg portOverrides: Any): Unit =
        portOverrides(portOverrides.toList())

    /**
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     * healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     * The default value is 3.
     */
    override fun thresholdCount(thresholdCount: Number) {
      cdkBuilder.thresholdCount(thresholdCount)
    }

    /**
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions .
     * Additional traffic is distributed to other endpoint groups for this listener.
     *
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region.
     * The percentage is applied to the traffic that would otherwise have been routed to the Region
     * based on optimal routing.
     *
     * The default value is 100.
     */
    override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps,
  ) : CdkObject(cdkObject), CfnEndpointGroupProps {
    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     */
    override fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

    /**
     * The AWS Regions where the endpoint group is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion)
     */
    override fun endpointGroupRegion(): String = unwrap(this).getEndpointGroupRegion()

    /**
     * The time—10 seconds or 30 seconds—between health checks for each endpoint.
     *
     * The default value is 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds)
     */
    override fun healthCheckIntervalSeconds(): Number? =
        unwrap(this).getHealthCheckIntervalSeconds()

    /**
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator
     * uses for the destination on the endpoints for health checks.
     *
     * The default is slash (/).
     *
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath)
     */
    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    /**
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of
     * this endpoint group.
     *
     * The default port is the port for the listener that this endpoint group is associated with. If
     * the listener port is a list, Global Accelerator uses the first specified port in the list of
     * ports.
     *
     * Default: - -1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport)
     */
    override fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

    /**
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
     * of this endpoint group.
     *
     * The default value is TCP.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol)
     */
    override fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn)
     */
    override fun listenerArn(): String = unwrap(this).getListenerArn()

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     */
    override fun portOverrides(): Any? = unwrap(this).getPortOverrides()

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * The default value is 3.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount)
     */
    override fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

    /**
     * The percentage of traffic to send to an AWS Regions .
     *
     * Additional traffic is distributed to other endpoint groups for this listener.
     *
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region.
     * The percentage is applied to the traffic that would otherwise have been routed to the Region
     * based on optimal routing.
     *
     * The default value is 100.
     *
     * Default: - 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage)
     */
    override fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps):
        CfnEndpointGroupProps = CdkObjectWrappers.wrap(cdkObject) as CfnEndpointGroupProps

    internal fun unwrap(wrapped: CfnEndpointGroupProps):
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
  }
}
