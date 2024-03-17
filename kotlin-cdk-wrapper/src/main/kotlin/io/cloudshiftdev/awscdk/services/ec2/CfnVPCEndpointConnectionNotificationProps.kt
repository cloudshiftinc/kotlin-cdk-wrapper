@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPCEndpointConnectionNotification`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCEndpointConnectionNotificationProps cfnVPCEndpointConnectionNotificationProps =
 * CfnVPCEndpointConnectionNotificationProps.builder()
 * .connectionEvents(List.of("connectionEvents"))
 * .connectionNotificationArn("connectionNotificationArn")
 * // the properties below are optional
 * .serviceId("serviceId")
 * .vpcEndpointId("vpcEndpointId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
 */
public interface CfnVPCEndpointConnectionNotificationProps {
  /**
   * The endpoint events for which to receive notifications.
   *
   * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
   */
  public fun connectionEvents(): List<String>

  /**
   * The ARN of the SNS topic for the notifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
   */
  public fun connectionNotificationArn(): String

  /**
   * The ID of the endpoint service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
   */
  public fun serviceId(): String? = unwrap(this).getServiceId()

  /**
   * The ID of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
   */
  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * A builder for [CfnVPCEndpointConnectionNotificationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionEvents The endpoint events for which to receive notifications. 
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     */
    public fun connectionEvents(connectionEvents: List<String>)

    /**
     * @param connectionEvents The endpoint events for which to receive notifications. 
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     */
    public fun connectionEvents(vararg connectionEvents: String)

    /**
     * @param connectionNotificationArn The ARN of the SNS topic for the notifications. 
     */
    public fun connectionNotificationArn(connectionNotificationArn: String)

    /**
     * @param serviceId The ID of the endpoint service.
     */
    public fun serviceId(serviceId: String)

    /**
     * @param vpcEndpointId The ID of the endpoint.
     */
    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.builder()

    /**
     * @param connectionEvents The endpoint events for which to receive notifications. 
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     */
    override fun connectionEvents(connectionEvents: List<String>) {
      cdkBuilder.connectionEvents(connectionEvents)
    }

    /**
     * @param connectionEvents The endpoint events for which to receive notifications. 
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     */
    override fun connectionEvents(vararg connectionEvents: String): Unit =
        connectionEvents(connectionEvents.toList())

    /**
     * @param connectionNotificationArn The ARN of the SNS topic for the notifications. 
     */
    override fun connectionNotificationArn(connectionNotificationArn: String) {
      cdkBuilder.connectionNotificationArn(connectionNotificationArn)
    }

    /**
     * @param serviceId The ID of the endpoint service.
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    /**
     * @param vpcEndpointId The ID of the endpoint.
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointConnectionNotificationProps {
    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     */
    override fun connectionEvents(): List<String> = unwrap(this).getConnectionEvents()

    /**
     * The ARN of the SNS topic for the notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
     */
    override fun connectionNotificationArn(): String = unwrap(this).getConnectionNotificationArn()

    /**
     * The ID of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
     */
    override fun serviceId(): String? = unwrap(this).getServiceId()

    /**
     * The ID of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
     */
    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCEndpointConnectionNotificationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps):
        CfnVPCEndpointConnectionNotificationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPCEndpointConnectionNotificationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointConnectionNotificationProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
  }
}
