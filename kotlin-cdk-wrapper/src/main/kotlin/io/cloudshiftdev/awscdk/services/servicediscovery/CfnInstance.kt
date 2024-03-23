@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A complex type that contains information about an instance that AWS Cloud Map creates when you
 * submit a `RegisterInstance` request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * Object instanceAttributes;
 * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
 * .instanceAttributes(instanceAttributes)
 * .serviceId("serviceId")
 * // the properties below are optional
 * .instanceId("instanceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
 */
public open class CfnInstance(
  cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstance,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.CfnInstance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInstanceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A string map that contains the following information for the service that you specify in
   * `ServiceId` :.
   */
  public open fun instanceAttributes(): Any = unwrap(this).getInstanceAttributes()

  /**
   * A string map that contains the following information for the service that you specify in
   * `ServiceId` :.
   */
  public open fun instanceAttributes(`value`: Any) {
    unwrap(this).setInstanceAttributes(`value`)
  }

  /**
   *
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   *
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The ID of the service that you want to use for settings for the instance.
   */
  public open fun serviceId(): String = unwrap(this).getServiceId()

  /**
   * The ID of the service that you want to use for settings for the instance.
   */
  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.CfnInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string map that contains the following information for the service that you specify in
     * `ServiceId` :.
     *
     * * The attributes that apply to the records that are defined in the service.
     * * For each attribute, the applicable value.
     *
     * Supported attribute keys include the following:
     *
     * * **AWS_ALIAS_DNS_NAME** - If you want AWS Cloud Map to create a Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the DNS name that is
     * associated with the load balancer. For information about how to get the DNS name, see
     * [AliasTarget-&gt;DNSName](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-DNSName)
     * in the *Route 53 API Reference* .
     *
     * Note the following:
     *
     * * The configuration for the service that is specified by `ServiceId` must include settings
     * for an `A` record, an `AAAA` record, or both.
     * * In the service that is specified by `ServiceId` , the value of `RoutingPolicy` must be
     * `WEIGHTED` .
     * * If the service that is specified by `ServiceId` includes `HealthCheckConfig` settings, AWS
     * Cloud Map will create the health check, but it won't associate the health check with the alias
     * record.
     * * Auto naming currently doesn't support creating alias records that route traffic to AWS
     * resources other than ELB load balancers.
     * * If you specify a value for `AWS_ALIAS_DNS_NAME` , don't specify values for any of the
     * `AWS_INSTANCE` attributes.
     * * **AWS_EC2_INSTANCE_ID** - *HTTP namespaces only.* The Amazon EC2 instance ID for the
     * instance. The `AWS_INSTANCE_IPV4` attribute contains the primary private IPv4 address. When
     * creating resources with a type of
     * [AWS::ServiceDiscovery::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     * , if the `AWS_EC2_INSTANCE_ID` attribute is specified, the only other attribute that can be
     * specified is `AWS_INIT_HEALTH_STATUS` . After the resource has been created, the
     * `AWS_INSTANCE_IPV4` attribute contains the primary private IPv4 address.
     * * **AWS_INIT_HEALTH_STATUS** - If the service configuration includes
     * `HealthCheckCustomConfig` , when creating resources with a type of
     * [AWS::ServiceDiscovery::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     * you can optionally use `AWS_INIT_HEALTH_STATUS` to specify the initial status of the custom
     * health check, `HEALTHY` or `UNHEALTHY` . If you don't specify a value for
     * `AWS_INIT_HEALTH_STATUS` , the initial status is `HEALTHY` . This attribute can only be used
     * when creating resources and will not be seen on existing resources.
     * * **AWS_INSTANCE_CNAME** - If the service configuration includes a `CNAME` record, the domain
     * name that you want Route 53 to return in response to DNS queries, for example, `example.com` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an
     * `CNAME` record.
     *
     * * **AWS_INSTANCE_IPV4** - If the service configuration includes an `A` record, the IPv4
     * address that you want Route 53 to return in response to DNS queries, for example, `192.0.2.44` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an `A`
     * record. If the service includes settings for an `SRV` record, you must specify a value for
     * `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both.
     *
     * * **AWS_INSTANCE_IPV6** - If the service configuration includes an `AAAA` record, the IPv6
     * address that you want Route 53 to return in response to DNS queries, for example,
     * `2001:0db8:85a3:0000:0000:abcd:0001:2345` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an
     * `AAAA` record. If the service includes settings for an `SRV` record, you must specify a value
     * for `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both.
     *
     * * **AWS_INSTANCE_PORT** - If the service includes an `SRV` record, the value that you want
     * Route 53 to return for the port.
     *
     * If the service includes `HealthCheckConfig` , the port on the endpoint that you want Route 53
     * to send requests to.
     *
     * This value is required if you specified settings for an `SRV` record or a Route 53 health
     * check when you created the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes)
     * @param instanceAttributes A string map that contains the following information for the
     * service that you specify in `ServiceId` :. 
     */
    public fun instanceAttributes(instanceAttributes: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid)
     * @param instanceId 
     */
    public fun instanceId(instanceId: String)

    /**
     * The ID of the service that you want to use for settings for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid)
     * @param serviceId The ID of the service that you want to use for settings for the instance. 
     */
    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnInstance.Builder.create(scope, id)

    /**
     * A string map that contains the following information for the service that you specify in
     * `ServiceId` :.
     *
     * * The attributes that apply to the records that are defined in the service.
     * * For each attribute, the applicable value.
     *
     * Supported attribute keys include the following:
     *
     * * **AWS_ALIAS_DNS_NAME** - If you want AWS Cloud Map to create a Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the DNS name that is
     * associated with the load balancer. For information about how to get the DNS name, see
     * [AliasTarget-&gt;DNSName](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-DNSName)
     * in the *Route 53 API Reference* .
     *
     * Note the following:
     *
     * * The configuration for the service that is specified by `ServiceId` must include settings
     * for an `A` record, an `AAAA` record, or both.
     * * In the service that is specified by `ServiceId` , the value of `RoutingPolicy` must be
     * `WEIGHTED` .
     * * If the service that is specified by `ServiceId` includes `HealthCheckConfig` settings, AWS
     * Cloud Map will create the health check, but it won't associate the health check with the alias
     * record.
     * * Auto naming currently doesn't support creating alias records that route traffic to AWS
     * resources other than ELB load balancers.
     * * If you specify a value for `AWS_ALIAS_DNS_NAME` , don't specify values for any of the
     * `AWS_INSTANCE` attributes.
     * * **AWS_EC2_INSTANCE_ID** - *HTTP namespaces only.* The Amazon EC2 instance ID for the
     * instance. The `AWS_INSTANCE_IPV4` attribute contains the primary private IPv4 address. When
     * creating resources with a type of
     * [AWS::ServiceDiscovery::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     * , if the `AWS_EC2_INSTANCE_ID` attribute is specified, the only other attribute that can be
     * specified is `AWS_INIT_HEALTH_STATUS` . After the resource has been created, the
     * `AWS_INSTANCE_IPV4` attribute contains the primary private IPv4 address.
     * * **AWS_INIT_HEALTH_STATUS** - If the service configuration includes
     * `HealthCheckCustomConfig` , when creating resources with a type of
     * [AWS::ServiceDiscovery::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
     * you can optionally use `AWS_INIT_HEALTH_STATUS` to specify the initial status of the custom
     * health check, `HEALTHY` or `UNHEALTHY` . If you don't specify a value for
     * `AWS_INIT_HEALTH_STATUS` , the initial status is `HEALTHY` . This attribute can only be used
     * when creating resources and will not be seen on existing resources.
     * * **AWS_INSTANCE_CNAME** - If the service configuration includes a `CNAME` record, the domain
     * name that you want Route 53 to return in response to DNS queries, for example, `example.com` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an
     * `CNAME` record.
     *
     * * **AWS_INSTANCE_IPV4** - If the service configuration includes an `A` record, the IPv4
     * address that you want Route 53 to return in response to DNS queries, for example, `192.0.2.44` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an `A`
     * record. If the service includes settings for an `SRV` record, you must specify a value for
     * `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both.
     *
     * * **AWS_INSTANCE_IPV6** - If the service configuration includes an `AAAA` record, the IPv6
     * address that you want Route 53 to return in response to DNS queries, for example,
     * `2001:0db8:85a3:0000:0000:abcd:0001:2345` .
     *
     * This value is required if the service specified by `ServiceId` includes settings for an
     * `AAAA` record. If the service includes settings for an `SRV` record, you must specify a value
     * for `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both.
     *
     * * **AWS_INSTANCE_PORT** - If the service includes an `SRV` record, the value that you want
     * Route 53 to return for the port.
     *
     * If the service includes `HealthCheckConfig` , the port on the endpoint that you want Route 53
     * to send requests to.
     *
     * This value is required if you specified settings for an `SRV` record or a Route 53 health
     * check when you created the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes)
     * @param instanceAttributes A string map that contains the following information for the
     * service that you specify in `ServiceId` :. 
     */
    override fun instanceAttributes(instanceAttributes: Any) {
      cdkBuilder.instanceAttributes(instanceAttributes)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid)
     * @param instanceId 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The ID of the service that you want to use for settings for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid)
     * @param serviceId The ID of the service that you want to use for settings for the instance. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicediscovery.CfnInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnInstance):
        CfnInstance = CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance):
        software.amazon.awscdk.services.servicediscovery.CfnInstance = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnInstance
  }
}
