@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnStackFleetAssociationProps {
  public fun fleetName(): String

  public fun stackName(): String

  @CdkDslMarker
  public interface Builder {
    public fun fleetName(fleetName: String)

    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.builder()

    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps,
  ) : CdkObject(cdkObject), CfnStackFleetAssociationProps {
    override fun fleetName(): String = unwrap(this).getFleetName()

    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackFleetAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps):
        CfnStackFleetAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackFleetAssociationProps):
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
  }
}
