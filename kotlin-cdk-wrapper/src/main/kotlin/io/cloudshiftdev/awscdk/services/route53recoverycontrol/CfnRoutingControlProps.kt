@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRoutingControl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnRoutingControlProps cfnRoutingControlProps = CfnRoutingControlProps.builder()
 * .name("name")
 * // the properties below are optional
 * .clusterArn("clusterArn")
 * .controlPanelArn("controlPanelArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html)
 */
public interface CfnRoutingControlProps {
  /**
   * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-clusterarn)
   */
  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  /**
   * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
   */
  public fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

  /**
   * The name of the routing control.
   *
   * You can use any non-white space character in the name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnRoutingControlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     * control.
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     * routing control.
     */
    public fun controlPanelArn(controlPanelArn: String)

    /**
     * @param name The name of the routing control. 
     * You can use any non-white space character in the name.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.builder()

    /**
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster that hosts the routing
     * control.
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel that includes the
     * routing control.
     */
    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * @param name The name of the routing control. 
     * You can use any non-white space character in the name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build():
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps,
  ) : CdkObject(cdkObject), CfnRoutingControlProps {
    /**
     * The Amazon Resource Name (ARN) of the cluster that hosts the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-clusterarn)
     */
    override fun clusterArn(): String? = unwrap(this).getClusterArn()

    /**
     * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-controlpanelarn)
     */
    override fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

    /**
     * The name of the routing control.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html#cfn-route53recoverycontrol-routingcontrol-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoutingControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps):
        CfnRoutingControlProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRoutingControlProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingControlProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
  }
}
