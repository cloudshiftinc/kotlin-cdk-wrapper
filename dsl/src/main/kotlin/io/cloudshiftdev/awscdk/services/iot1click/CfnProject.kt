package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot1click.CfnProject,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrProjectName(): String = unwrap(this).getAttrProjectName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun placementTemplate(): Any = unwrap(this).getPlacementTemplate()

  public open fun placementTemplate(`value`: IResolvable) {
    unwrap(this).setPlacementTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun placementTemplate(`value`: PlacementTemplateProperty) {
    unwrap(this).setPlacementTemplate(`value`.let(PlacementTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("36e534349e8c355573d2f3a2c312529f9f6f5e28864d7d09130c4975173b649f")
  public open fun placementTemplate(`value`: PlacementTemplateProperty.Builder.() -> Unit): Unit =
      placementTemplate(PlacementTemplateProperty(`value`))

  public open fun projectName(): String? = unwrap(this).getProjectName()

  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun placementTemplate(placementTemplate: IResolvable) {
    }

    public fun placementTemplate(placementTemplate: PlacementTemplateProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ac3a1f80fd46182218bfd96b96a0cfed1cbc7a13894f7464c96e24fa4a74f97")
    public fun placementTemplate(placementTemplate: PlacementTemplateProperty.Builder.() -> Unit) {
    }

    public fun projectName(projectName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnProject.Builder =
        software.amazon.awscdk.services.iot1click.CfnProject.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun placementTemplate(placementTemplate: IResolvable) {
      cdkBuilder.placementTemplate(placementTemplate.let(IResolvable::unwrap))
    }

    public override fun placementTemplate(placementTemplate: PlacementTemplateProperty) {
      cdkBuilder.placementTemplate(placementTemplate.let(PlacementTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ac3a1f80fd46182218bfd96b96a0cfed1cbc7a13894f7464c96e24fa4a74f97")
    public override
        fun placementTemplate(placementTemplate: PlacementTemplateProperty.Builder.() -> Unit): Unit
        = placementTemplate(PlacementTemplateProperty(placementTemplate))

    public override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.iot1click.CfnProject =
        wrapped.cdkObject
  }

  public interface PlacementTemplateProperty {
    public fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

    public fun deviceTemplates(): Any? = unwrap(this).getDeviceTemplates()

    public interface Builder {
      public fun defaultAttributes(defaultAttributes: Any) {
      }

      public fun deviceTemplates(deviceTemplates: IResolvable) {
      }

      public fun deviceTemplates(deviceTemplates: Map<String, Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder =
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.builder()

      public override fun defaultAttributes(defaultAttributes: Any) {
        cdkBuilder.defaultAttributes(defaultAttributes)
      }

      public override fun deviceTemplates(deviceTemplates: IResolvable) {
        cdkBuilder.deviceTemplates(deviceTemplates.let(IResolvable::unwrap))
      }

      public override fun deviceTemplates(deviceTemplates: Map<String, Any>) {
        cdkBuilder.deviceTemplates(deviceTemplates)
      }

      public fun build():
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty,
    ) : PlacementTemplateProperty {
      public override fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

      public override fun deviceTemplates(): Any? = unwrap(this).getDeviceTemplates()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty):
          PlacementTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTemplateProperty):
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DeviceTemplateProperty {
    public fun callbackOverrides(): Any? = unwrap(this).getCallbackOverrides()

    public fun deviceType(): String? = unwrap(this).getDeviceType()

    public interface Builder {
      public fun callbackOverrides(callbackOverrides: Any) {
      }

      public fun deviceType(deviceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder =
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.builder()

      public override fun callbackOverrides(callbackOverrides: Any) {
        cdkBuilder.callbackOverrides(callbackOverrides)
      }

      public override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty,
    ) : DeviceTemplateProperty {
      public override fun callbackOverrides(): Any? = unwrap(this).getCallbackOverrides()

      public override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty):
          DeviceTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceTemplateProperty):
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
