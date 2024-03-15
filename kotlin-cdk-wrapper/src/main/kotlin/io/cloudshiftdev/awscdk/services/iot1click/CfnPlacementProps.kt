@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnPlacementProps {
  public fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun placementName(): String? = unwrap(this).getPlacementName()

  public fun projectName(): String

  @CdkDslMarker
  public interface Builder {
    public fun associatedDevices(associatedDevices: Any)

    public fun attributes(attributes: Any)

    public fun placementName(placementName: String)

    public fun projectName(projectName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnPlacementProps.builder()

    override fun associatedDevices(associatedDevices: Any) {
      cdkBuilder.associatedDevices(associatedDevices)
    }

    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    override fun placementName(placementName: String) {
      cdkBuilder.placementName(placementName)
    }

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnPlacementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacementProps,
  ) : CdkObject(cdkObject), CfnPlacementProps {
    override fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun placementName(): String? = unwrap(this).getPlacementName()

    override fun projectName(): String = unwrap(this).getProjectName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlacementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacementProps):
        CfnPlacementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlacementProps):
        software.amazon.awscdk.services.iot1click.CfnPlacementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot1click.CfnPlacementProps
  }
}
