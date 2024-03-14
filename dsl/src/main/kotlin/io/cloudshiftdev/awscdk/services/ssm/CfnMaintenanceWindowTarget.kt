package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMaintenanceWindowTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

  public open fun ownerInformation(`value`: String) {
    unwrap(this).setOwnerInformation(`value`)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun targets(): Any = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun windowId(): String = unwrap(this).getWindowId()

  public open fun windowId(`value`: String) {
    unwrap(this).setWindowId(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun ownerInformation(ownerInformation: String) {
    }

    public fun resourceType(resourceType: String) {
    }

    public fun targets(targets: IResolvable) {
    }

    public fun targets(targets: List<Any>) {
    }

    public fun windowId(windowId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun ownerInformation(ownerInformation: String) {
      cdkBuilder.ownerInformation(ownerInformation)
    }

    public override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    public override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    public override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindowTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindowTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget):
        CfnMaintenanceWindowTarget = CfnMaintenanceWindowTarget(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTarget):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget = wrapped.cdkObject
  }

  public interface TargetsProperty {
    public fun key(): String

    public fun values(): List<String>

    public interface Builder {
      public fun key(key: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty,
    ) : TargetsProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
