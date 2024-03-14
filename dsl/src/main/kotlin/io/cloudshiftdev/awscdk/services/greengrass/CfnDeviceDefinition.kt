package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeviceDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: DeviceDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(DeviceDefinitionVersionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63540674c1e81229a8719e6fe32e737669c6c01d44c8641a314f6ed7c41cf20f")
  public open fun initialVersion(`value`: DeviceDefinitionVersionProperty.Builder.() -> Unit): Unit
      = initialVersion(DeviceDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable) {
    }

    public fun initialVersion(initialVersion: DeviceDefinitionVersionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a9c6093ebdd2b7b760d2e78030469c7097e411ac682b04db29bd9cf45d91e8")
    public fun initialVersion(initialVersion: DeviceDefinitionVersionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.Builder.create(scope, id)

    public override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    public override fun initialVersion(initialVersion: DeviceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(DeviceDefinitionVersionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a9c6093ebdd2b7b760d2e78030469c7097e411ac682b04db29bd9cf45d91e8")
    public override
        fun initialVersion(initialVersion: DeviceDefinitionVersionProperty.Builder.() -> Unit): Unit
        = initialVersion(DeviceDefinitionVersionProperty(initialVersion))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition):
        CfnDeviceDefinition = CfnDeviceDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinition):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinition = wrapped.cdkObject
  }

  public interface DeviceProperty {
    public fun certificateArn(): String

    public fun id(): String

    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    public fun thingArn(): String

    public interface Builder {
      public fun certificateArn(certificateArn: String) {
      }

      public fun id(id: String) {
      }

      public fun syncShadow(syncShadow: Boolean) {
      }

      public fun syncShadow(syncShadow: IResolvable) {
      }

      public fun thingArn(thingArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty.builder()

      public override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      public override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      public override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty,
    ) : DeviceProperty {
      public override fun certificateArn(): String = unwrap(this).getCertificateArn()

      public override fun id(): String = unwrap(this).getId()

      public override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      public override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DeviceDefinitionVersionProperty {
    public fun devices(): Any

    public interface Builder {
      public fun devices(devices: IResolvable) {
      }

      public fun devices(devices: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty.builder()

      public override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      public override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty,
    ) : DeviceDefinitionVersionProperty {
      public override fun devices(): Any = unwrap(this).getDevices()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty):
          DeviceDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinition.DeviceDefinitionVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
