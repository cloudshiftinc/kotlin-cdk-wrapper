@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMaintenanceWindowTargetProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

  public fun resourceType(): String

  public fun targets(): Any

  public fun windowId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun ownerInformation(ownerInformation: String)

    public fun resourceType(resourceType: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun windowId(windowId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ownerInformation(ownerInformation: String) {
      cdkBuilder.ownerInformation(ownerInformation)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowTargetProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

    override fun resourceType(): String = unwrap(this).getResourceType()

    override fun targets(): Any = unwrap(this).getTargets()

    override fun windowId(): String = unwrap(this).getWindowId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps):
        CfnMaintenanceWindowTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTargetProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
  }
}
