@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GlobalAccelerator::EndpointGroup` resource is a Global Accelerator resource type that
 * contains information about how you create an endpoint group for the specified listener.
 *
 * An endpoint group is a collection of endpoints in one AWS Region .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnEndpointGroup cfnEndpointGroup = CfnEndpointGroup.Builder.create(this, "MyCfnEndpointGroup")
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
public open class CfnEndpointGroup(
  cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointGroupProps,
  ) :
      this(software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEndpointGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointGroupProps(props)
  )

  /**
   * The ARN of the endpoint group, such as
   * `arn:aws:globalaccelerator::012345678901:accelerator/1234abcd-abcd-1234-abcd-1234abcdefgh/listener/0123vxyz/endpoint-group/098765zyxwvu`
   * .
   */
  public open fun attrEndpointGroupArn(): String = unwrap(this).getAttrEndpointGroupArn()

  /**
   * The list of endpoint objects.
   */
  public open fun endpointConfigurations(): Any? = unwrap(this).getEndpointConfigurations()

  /**
   * The list of endpoint objects.
   */
  public open fun endpointConfigurations(`value`: IResolvable) {
    unwrap(this).setEndpointConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of endpoint objects.
   */
  public open fun endpointConfigurations(`value`: List<Any>) {
    unwrap(this).setEndpointConfigurations(`value`)
  }

  /**
   * The list of endpoint objects.
   */
  public open fun endpointConfigurations(vararg `value`: Any): Unit =
      endpointConfigurations(`value`.toList())

  /**
   * The AWS Regions where the endpoint group is located.
   */
  public open fun endpointGroupRegion(): String = unwrap(this).getEndpointGroupRegion()

  /**
   * The AWS Regions where the endpoint group is located.
   */
  public open fun endpointGroupRegion(`value`: String) {
    unwrap(this).setEndpointGroupRegion(`value`)
  }

  /**
   * The time—10 seconds or 30 seconds—between health checks for each endpoint.
   */
  public open fun healthCheckIntervalSeconds(): Number? =
      unwrap(this).getHealthCheckIntervalSeconds()

  /**
   * The time—10 seconds or 30 seconds—between health checks for each endpoint.
   */
  public open fun healthCheckIntervalSeconds(`value`: Number) {
    unwrap(this).setHealthCheckIntervalSeconds(`value`)
  }

  /**
   * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses
   * for the destination on the endpoints for health checks.
   */
  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses
   * for the destination on the endpoints for health checks.
   */
  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  /**
   * The port that Global Accelerator uses to perform health checks on endpoints that are part of
   * this endpoint group.
   */
  public open fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

  /**
   * The port that Global Accelerator uses to perform health checks on endpoints that are part of
   * this endpoint group.
   */
  public open fun healthCheckPort(`value`: Number) {
    unwrap(this).setHealthCheckPort(`value`)
  }

  /**
   * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
   * of this endpoint group.
   */
  public open fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  /**
   * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
   * of this endpoint group.
   */
  public open fun healthCheckProtocol(`value`: String) {
    unwrap(this).setHealthCheckProtocol(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(): String = unwrap(this).getListenerArn()

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  /**
   * Allows you to override the destination ports used to route traffic to an endpoint.
   */
  public open fun portOverrides(): Any? = unwrap(this).getPortOverrides()

  /**
   * Allows you to override the destination ports used to route traffic to an endpoint.
   */
  public open fun portOverrides(`value`: IResolvable) {
    unwrap(this).setPortOverrides(`value`.let(IResolvable::unwrap))
  }

  /**
   * Allows you to override the destination ports used to route traffic to an endpoint.
   */
  public open fun portOverrides(`value`: List<Any>) {
    unwrap(this).setPortOverrides(`value`)
  }

  /**
   * Allows you to override the destination ports used to route traffic to an endpoint.
   */
  public open fun portOverrides(vararg `value`: Any): Unit = portOverrides(`value`.toList())

  /**
   * The number of consecutive health checks required to set the state of a healthy endpoint to
   * unhealthy, or to set an unhealthy endpoint to healthy.
   */
  public open fun thresholdCount(): Number? = unwrap(this).getThresholdCount()

  /**
   * The number of consecutive health checks required to set the state of a healthy endpoint to
   * unhealthy, or to set an unhealthy endpoint to healthy.
   */
  public open fun thresholdCount(`value`: Number) {
    unwrap(this).setThresholdCount(`value`)
  }

  /**
   * The percentage of traffic to send to an AWS Regions .
   */
  public open fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()

  /**
   * The percentage of traffic to send to an AWS Regions .
   */
  public open fun trafficDialPercentage(`value`: Number) {
    unwrap(this).setTrafficDialPercentage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.CfnEndpointGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    public fun endpointConfigurations(endpointConfigurations: IResolvable)

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    public fun endpointConfigurations(endpointConfigurations: List<Any>)

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    public fun endpointConfigurations(vararg endpointConfigurations: Any)

    /**
     * The AWS Regions where the endpoint group is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion)
     * @param endpointGroupRegion The AWS Regions where the endpoint group is located. 
     */
    public fun endpointGroupRegion(endpointGroupRegion: String)

    /**
     * The time—10 seconds or 30 seconds—between health checks for each endpoint.
     *
     * The default value is 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds)
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     * each endpoint. 
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    /**
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator
     * uses for the destination on the endpoints for health checks.
     *
     * The default is slash (/).
     *
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath)
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     * Global Accelerator uses for the destination on the endpoints for health checks. 
     */
    public fun healthCheckPath(healthCheckPath: String)

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
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     * endpoints that are part of this endpoint group. 
     */
    public fun healthCheckPort(healthCheckPort: Number)

    /**
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
     * of this endpoint group.
     *
     * The default value is TCP.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol)
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     * on endpoints that are part of this endpoint group. 
     */
    public fun healthCheckProtocol(healthCheckProtocol: String)

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerArn(listenerArn: String)

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    public fun portOverrides(portOverrides: IResolvable)

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    public fun portOverrides(portOverrides: List<Any>)

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    public fun portOverrides(vararg portOverrides: Any)

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * The default value is 3.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount)
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     * healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. 
     */
    public fun thresholdCount(thresholdCount: Number)

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
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions . 
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.Builder.create(scope, id)

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    override fun endpointConfigurations(endpointConfigurations: IResolvable) {
      cdkBuilder.endpointConfigurations(endpointConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    override fun endpointConfigurations(endpointConfigurations: List<Any>) {
      cdkBuilder.endpointConfigurations(endpointConfigurations)
    }

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     * @param endpointConfigurations The list of endpoint objects. 
     */
    override fun endpointConfigurations(vararg endpointConfigurations: Any): Unit =
        endpointConfigurations(endpointConfigurations.toList())

    /**
     * The AWS Regions where the endpoint group is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion)
     * @param endpointGroupRegion The AWS Regions where the endpoint group is located. 
     */
    override fun endpointGroupRegion(endpointGroupRegion: String) {
      cdkBuilder.endpointGroupRegion(endpointGroupRegion)
    }

    /**
     * The time—10 seconds or 30 seconds—between health checks for each endpoint.
     *
     * The default value is 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds)
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     * each endpoint. 
     */
    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator
     * uses for the destination on the endpoints for health checks.
     *
     * The default is slash (/).
     *
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath)
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     * Global Accelerator uses for the destination on the endpoints for health checks. 
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

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
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     * endpoints that are part of this endpoint group. 
     */
    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
     * of this endpoint group.
     *
     * The default value is TCP.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol)
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     * on endpoints that are part of this endpoint group. 
     */
    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    override fun portOverrides(portOverrides: IResolvable) {
      cdkBuilder.portOverrides(portOverrides.let(IResolvable::unwrap))
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    override fun portOverrides(portOverrides: List<Any>) {
      cdkBuilder.portOverrides(portOverrides)
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     * endpoint. 
     */
    override fun portOverrides(vararg portOverrides: Any): Unit =
        portOverrides(portOverrides.toList())

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * The default value is 3.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount)
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     * healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. 
     */
    override fun thresholdCount(thresholdCount: Number) {
      cdkBuilder.thresholdCount(thresholdCount)
    }

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
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions . 
     */
    override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup):
        CfnEndpointGroup = CfnEndpointGroup(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointGroup):
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
  }

  /**
   * A complex type for endpoints.
   *
   * A resource must be valid and active when you add it as an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
   * EndpointConfigurationProperty endpointConfigurationProperty =
   * EndpointConfigurationProperty.builder()
   * .endpointId("endpointId")
   * // the properties below are optional
   * .attachmentArn("attachmentArn")
   * .clientIpPreservationEnabled(false)
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html)
   */
  public interface EndpointConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints
     * (resources) that can be added to accelerators and principals that have permission to add the
     * endpoints to accelerators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-attachmentarn)
     */
    public fun attachmentArn(): String? = unwrap(this).getAttachmentArn()

    /**
     * Indicates whether client IP address preservation is enabled for an Application Load Balancer
     * endpoint.
     *
     * The value is true or false. The default value is true for new accelerators.
     *
     * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
     * request header as traffic travels to applications on the Application Load Balancer endpoint
     * fronted by the accelerator.
     *
     * For more information, see [Preserve Client IP
     * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled)
     */
    public fun clientIpPreservationEnabled(): Any? = unwrap(this).getClientIpPreservationEnabled()

    /**
     * An ID for the endpoint.
     *
     * If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon
     * Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
     * Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. A
     * resource must be valid and active when you add it as an endpoint.
     *
     * For cross-account endpoints, this must be the ARN of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid)
     */
    public fun endpointId(): String

    /**
     * The weight associated with the endpoint.
     *
     * When you add weights to endpoints, you configure Global Accelerator to route traffic based on
     * proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6
     * (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint,
     * 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint.
     * For more information, see [Endpoint
     * Weights](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * Default: - 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [EndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentArn The Amazon Resource Name (ARN) of the cross-account attachment that
       * specifies the endpoints (resources) that can be added to accelerators and principals that have
       * permission to add the endpoints to accelerators.
       */
      public fun attachmentArn(attachmentArn: String)

      /**
       * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
       * enabled for an Application Load Balancer endpoint.
       * The value is true or false. The default value is true for new accelerators.
       *
       * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
       * request header as traffic travels to applications on the Application Load Balancer endpoint
       * fronted by the accelerator.
       *
       * For more information, see [Preserve Client IP
       * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      public fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean)

      /**
       * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
       * enabled for an Application Load Balancer endpoint.
       * The value is true or false. The default value is true for new accelerators.
       *
       * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
       * request header as traffic travels to applications on the Application Load Balancer endpoint
       * fronted by the accelerator.
       *
       * For more information, see [Preserve Client IP
       * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      public fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable)

      /**
       * @param endpointId An ID for the endpoint. 
       * If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon
       * Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
       * Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. A
       * resource must be valid and active when you add it as an endpoint.
       *
       * For cross-account endpoints, this must be the ARN of the resource.
       */
      public fun endpointId(endpointId: String)

      /**
       * @param weight The weight associated with the endpoint.
       * When you add weights to endpoints, you configure Global Accelerator to route traffic based
       * on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5,
       * and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first
       * endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the
       * last endpoint. For more information, see [Endpoint
       * Weights](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty.builder()

      /**
       * @param attachmentArn The Amazon Resource Name (ARN) of the cross-account attachment that
       * specifies the endpoints (resources) that can be added to accelerators and principals that have
       * permission to add the endpoints to accelerators.
       */
      override fun attachmentArn(attachmentArn: String) {
        cdkBuilder.attachmentArn(attachmentArn)
      }

      /**
       * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
       * enabled for an Application Load Balancer endpoint.
       * The value is true or false. The default value is true for new accelerators.
       *
       * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
       * request header as traffic travels to applications on the Application Load Balancer endpoint
       * fronted by the accelerator.
       *
       * For more information, see [Preserve Client IP
       * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      override fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
      }

      /**
       * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
       * enabled for an Application Load Balancer endpoint.
       * The value is true or false. The default value is true for new accelerators.
       *
       * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
       * request header as traffic travels to applications on the Application Load Balancer endpoint
       * fronted by the accelerator.
       *
       * For more information, see [Preserve Client IP
       * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      override fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param endpointId An ID for the endpoint. 
       * If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon
       * Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
       * Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. A
       * resource must be valid and active when you add it as an endpoint.
       *
       * For cross-account endpoints, this must be the ARN of the resource.
       */
      override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      /**
       * @param weight The weight associated with the endpoint.
       * When you add weights to endpoints, you configure Global Accelerator to route traffic based
       * on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5,
       * and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first
       * endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the
       * last endpoint. For more information, see [Endpoint
       * Weights](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html)
       * in the *AWS Global Accelerator Developer Guide* .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints
       * (resources) that can be added to accelerators and principals that have permission to add the
       * endpoints to accelerators.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-attachmentarn)
       */
      override fun attachmentArn(): String? = unwrap(this).getAttachmentArn()

      /**
       * Indicates whether client IP address preservation is enabled for an Application Load
       * Balancer endpoint.
       *
       * The value is true or false. The default value is true for new accelerators.
       *
       * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
       * request header as traffic travels to applications on the Application Load Balancer endpoint
       * fronted by the accelerator.
       *
       * For more information, see [Preserve Client IP
       * Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
       * in the *AWS Global Accelerator Developer Guide* .
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-clientippreservationenabled)
       */
      override fun clientIpPreservationEnabled(): Any? =
          unwrap(this).getClientIpPreservationEnabled()

      /**
       * An ID for the endpoint.
       *
       * If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon
       * Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the
       * Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. A
       * resource must be valid and active when you add it as an endpoint.
       *
       * For cross-account endpoints, this must be the ARN of the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-endpointid)
       */
      override fun endpointId(): String = unwrap(this).getEndpointId()

      /**
       * The weight associated with the endpoint.
       *
       * When you add weights to endpoints, you configure Global Accelerator to route traffic based
       * on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5,
       * and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first
       * endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the
       * last endpoint. For more information, see [Endpoint
       * Weights](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html)
       * in the *AWS Global Accelerator Developer Guide* .
       *
       * Default: - 100
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html#cfn-globalaccelerator-endpointgroup-endpointconfiguration-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty):
          EndpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EndpointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.EndpointConfigurationProperty
    }
  }

  /**
   * Override specific listener ports used to route traffic to endpoints that are part of an
   * endpoint group.
   *
   * For example, you can create a port override in which the listener receives user traffic on
   * ports 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443, respectively,
   * on the endpoints.
   *
   * For more information, see [Port
   * overrides](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoint-groups-port-override.html)
   * in the *AWS Global Accelerator Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
   * PortOverrideProperty portOverrideProperty = PortOverrideProperty.builder()
   * .endpointPort(123)
   * .listenerPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html)
   */
  public interface PortOverrideProperty {
    /**
     * The endpoint port that you want a listener port to be mapped to.
     *
     * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html#cfn-globalaccelerator-endpointgroup-portoverride-endpointport)
     */
    public fun endpointPort(): Number

    /**
     * The listener port that you want to map to a specific endpoint port.
     *
     * This is the port that user traffic arrives to the Global Accelerator on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html#cfn-globalaccelerator-endpointgroup-portoverride-listenerport)
     */
    public fun listenerPort(): Number

    /**
     * A builder for [PortOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointPort The endpoint port that you want a listener port to be mapped to. 
       * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
       * instance.
       */
      public fun endpointPort(endpointPort: Number)

      /**
       * @param listenerPort The listener port that you want to map to a specific endpoint port. 
       * This is the port that user traffic arrives to the Global Accelerator on.
       */
      public fun listenerPort(listenerPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty.Builder
          =
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty.builder()

      /**
       * @param endpointPort The endpoint port that you want a listener port to be mapped to. 
       * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
       * instance.
       */
      override fun endpointPort(endpointPort: Number) {
        cdkBuilder.endpointPort(endpointPort)
      }

      /**
       * @param listenerPort The listener port that you want to map to a specific endpoint port. 
       * This is the port that user traffic arrives to the Global Accelerator on.
       */
      override fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty,
    ) : CdkObject(cdkObject), PortOverrideProperty {
      /**
       * The endpoint port that you want a listener port to be mapped to.
       *
       * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
       * instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html#cfn-globalaccelerator-endpointgroup-portoverride-endpointport)
       */
      override fun endpointPort(): Number = unwrap(this).getEndpointPort()

      /**
       * The listener port that you want to map to a specific endpoint port.
       *
       * This is the port that user traffic arrives to the Global Accelerator on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html#cfn-globalaccelerator-endpointgroup-portoverride-listenerport)
       */
      override fun listenerPort(): Number = unwrap(this).getListenerPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty):
          PortOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as? PortOverrideProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortOverrideProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty
    }
  }
}
