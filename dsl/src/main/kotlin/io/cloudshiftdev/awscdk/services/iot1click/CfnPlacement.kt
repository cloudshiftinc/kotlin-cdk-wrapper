package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPlacement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacement,
) : CfnResource(cdkObject), IInspectable {
  public open fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

  public open fun associatedDevices(`value`: Any) {
    unwrap(this).setAssociatedDevices(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPlacementName(): String = unwrap(this).getAttrPlacementName()

  public open fun attrProjectName(): String = unwrap(this).getAttrProjectName()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: Any) {
    unwrap(this).setAttributes(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun placementName(): String? = unwrap(this).getPlacementName()

  public open fun placementName(`value`: String) {
    unwrap(this).setPlacementName(`value`)
  }

  public open fun projectName(): String = unwrap(this).getProjectName()

  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  public interface Builder {
    public fun associatedDevices(associatedDevices: Any)

    public fun attributes(attributes: Any)

    public fun placementName(placementName: String)

    public fun projectName(projectName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnPlacement.Builder =
        software.amazon.awscdk.services.iot1click.CfnPlacement.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.iot1click.CfnPlacement = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlacement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlacement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacement):
        CfnPlacement = CfnPlacement(cdkObject)

    internal fun unwrap(wrapped: CfnPlacement):
        software.amazon.awscdk.services.iot1click.CfnPlacement = wrapped.cdkObject
  }
}
