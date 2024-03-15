@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
  public open fun attrRoutingControlArn(): String = unwrap(this).getAttrRoutingControlArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun clusterArn(): String? = unwrap(this).getClusterArn()

  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
  }

  public open fun controlPanelArn(): String? = unwrap(this).getControlPanelArn()

  public open fun controlPanelArn(`value`: String) {
    unwrap(this).setControlPanelArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun controlPanelArn(controlPanelArn: String)

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

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl.CFN_RESOURCE_TYPE_NAME

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
