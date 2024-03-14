package io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSuiteDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrSuiteDefinitionArn(): String = unwrap(this).getAttrSuiteDefinitionArn()

  public open fun attrSuiteDefinitionId(): String = unwrap(this).getAttrSuiteDefinitionId()

  public open fun attrSuiteDefinitionVersion(): String =
      unwrap(this).getAttrSuiteDefinitionVersion()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun suiteDefinitionConfiguration(): Any =
      unwrap(this).getSuiteDefinitionConfiguration()

  public open fun suiteDefinitionConfiguration(`value`: Any) {
    unwrap(this).setSuiteDefinitionConfiguration(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder =
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder.create(scope,
        id)

    override fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
      cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSuiteDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSuiteDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition):
        CfnSuiteDefinition = CfnSuiteDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnSuiteDefinition):
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition = wrapped.cdkObject
  }

  public interface SuiteDefinitionConfigurationProperty {
    public fun devicePermissionRoleArn(): String

    public fun devices(): Any? = unwrap(this).getDevices()

    public fun intendedForQualification(): Any? = unwrap(this).getIntendedForQualification()

    public fun rootGroup(): String

    public fun suiteDefinitionName(): String? = unwrap(this).getSuiteDefinitionName()

    public interface Builder {
      public fun devicePermissionRoleArn(devicePermissionRoleArn: String)

      public fun devices(devices: IResolvable)

      public fun devices(devices: List<Any>)

      public fun intendedForQualification(intendedForQualification: Boolean)

      public fun intendedForQualification(intendedForQualification: IResolvable)

      public fun rootGroup(rootGroup: String)

      public fun suiteDefinitionName(suiteDefinitionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.builder()

      override fun devicePermissionRoleArn(devicePermissionRoleArn: String) {
        cdkBuilder.devicePermissionRoleArn(devicePermissionRoleArn)
      }

      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      override fun intendedForQualification(intendedForQualification: Boolean) {
        cdkBuilder.intendedForQualification(intendedForQualification)
      }

      override fun intendedForQualification(intendedForQualification: IResolvable) {
        cdkBuilder.intendedForQualification(intendedForQualification.let(IResolvable::unwrap))
      }

      override fun rootGroup(rootGroup: String) {
        cdkBuilder.rootGroup(rootGroup)
      }

      override fun suiteDefinitionName(suiteDefinitionName: String) {
        cdkBuilder.suiteDefinitionName(suiteDefinitionName)
      }

      public fun build():
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty,
    ) : SuiteDefinitionConfigurationProperty {
      override fun devicePermissionRoleArn(): String = unwrap(this).getDevicePermissionRoleArn()

      override fun devices(): Any? = unwrap(this).getDevices()

      override fun intendedForQualification(): Any? = unwrap(this).getIntendedForQualification()

      override fun rootGroup(): String = unwrap(this).getRootGroup()

      override fun suiteDefinitionName(): String? = unwrap(this).getSuiteDefinitionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SuiteDefinitionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty):
          SuiteDefinitionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuiteDefinitionConfigurationProperty):
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeviceUnderTestProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public fun thingArn(): String? = unwrap(this).getThingArn()

    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty.Builder
          =
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty,
    ) : DeviceUnderTestProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      override fun thingArn(): String? = unwrap(this).getThingArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceUnderTestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty):
          DeviceUnderTestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceUnderTestProperty):
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
