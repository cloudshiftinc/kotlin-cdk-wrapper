package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpointConnectionNotification internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the notification.
   */
  public open fun attrVpcEndpointConnectionNotificationId(): String =
      unwrap(this).getAttrVpcEndpointConnectionNotificationId()

  /**
   * The endpoint events for which to receive notifications.
   */
  public open fun connectionEvents(): List<String> = unwrap(this).getConnectionEvents()

  /**
   * The endpoint events for which to receive notifications.
   */
  public open fun connectionEvents(`value`: List<String>) {
    unwrap(this).setConnectionEvents(`value`)
  }

  /**
   * The endpoint events for which to receive notifications.
   */
  public open fun connectionEvents(vararg `value`: String): Unit =
      connectionEvents(`value`.toList())

  /**
   * The ARN of the SNS topic for the notifications.
   */
  public open fun connectionNotificationArn(): String = unwrap(this).getConnectionNotificationArn()

  /**
   * The ARN of the SNS topic for the notifications.
   */
  public open fun connectionNotificationArn(`value`: String) {
    unwrap(this).setConnectionNotificationArn(`value`)
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
   * The ID of the endpoint service.
   */
  public open fun serviceId(): String? = unwrap(this).getServiceId()

  /**
   * The ID of the endpoint service.
   */
  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  /**
   * The ID of the endpoint.
   */
  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * The ID of the endpoint.
   */
  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpointConnectionNotification].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     * @param connectionEvents The endpoint events for which to receive notifications. 
     */
    public fun connectionEvents(connectionEvents: List<String>)

    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     * @param connectionEvents The endpoint events for which to receive notifications. 
     */
    public fun connectionEvents(vararg connectionEvents: String)

    /**
     * The ARN of the SNS topic for the notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
     * @param connectionNotificationArn The ARN of the SNS topic for the notifications. 
     */
    public fun connectionNotificationArn(connectionNotificationArn: String)

    /**
     * The ID of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
     * @param serviceId The ID of the endpoint service. 
     */
    public fun serviceId(serviceId: String)

    /**
     * The ID of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
     * @param vpcEndpointId The ID of the endpoint. 
     */
    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder.create(scope,
        id)

    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     * @param connectionEvents The endpoint events for which to receive notifications. 
     */
    override fun connectionEvents(connectionEvents: List<String>) {
      cdkBuilder.connectionEvents(connectionEvents)
    }

    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     * @param connectionEvents The endpoint events for which to receive notifications. 
     */
    override fun connectionEvents(vararg connectionEvents: String): Unit =
        connectionEvents(connectionEvents.toList())

    /**
     * The ARN of the SNS topic for the notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
     * @param connectionNotificationArn The ARN of the SNS topic for the notifications. 
     */
    override fun connectionNotificationArn(connectionNotificationArn: String) {
      cdkBuilder.connectionNotificationArn(connectionNotificationArn)
    }

    /**
     * The ID of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
     * @param serviceId The ID of the endpoint service. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    /**
     * The ID of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
     * @param vpcEndpointId The ID of the endpoint. 
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointConnectionNotification {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointConnectionNotification(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification):
        CfnVPCEndpointConnectionNotification = CfnVPCEndpointConnectionNotification(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointConnectionNotification):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification = wrapped.cdkObject
  }
}
