@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnRoutingControlProps {
  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  public fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun controlPanelArn(controlPanelArn: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.builder()

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

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
    override fun clusterArn(): String? = unwrap(this).getClusterArn()

    override fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoutingControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps):
        CfnRoutingControlProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingControlProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
  }
}
