package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoutingControl internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the routing control.
   */
  public open fun attrRoutingControlArn(): String = unwrap(this).getAttrRoutingControlArn()

  /**
   * The deployment status of the routing control.
   *
   * Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
   */
  public open fun clusterArn(): String? = unwrap(this).getClusterArn()

  /**
   * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
   */
  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
   */
  public open fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

  /**
   * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
   */
  public open fun controlPanelArn(`value`: String) {
    unwrap(this).setControlPanelArn(`value`)
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
   * The name of the routing control.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the routing control.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53recoverycontrol.CfnRoutingControl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     * control. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     * routing control. 
     */
    public fun controlPanelArn(controlPanelArn: String)

    /**
     * The name of the routing control.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-name)
     * @param name The name of the routing control. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     * control. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     * routing control. 
     */
    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * The name of the routing control.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-name)
     * @param name The name of the routing control. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoutingControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoutingControl(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl):
        CfnRoutingControl = CfnRoutingControl(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingControl):
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl = wrapped.cdkObject
  }
}
