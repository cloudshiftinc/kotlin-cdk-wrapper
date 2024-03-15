@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnApplicationFleetAssociationProps {
  public fun applicationArn(): String

  public fun fleetName(): String

  @CdkDslMarker
  public interface Builder {
    public fun applicationArn(applicationArn: String)

    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps.builder()

    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps,
  ) : CdkObject(cdkObject), CfnApplicationFleetAssociationProps {
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    override fun fleetName(): String = unwrap(this).getFleetName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationFleetAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps):
        CfnApplicationFleetAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationFleetAssociationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
  }
}
