package io.cloudshiftdev.awscdk.services.workspacesthinclient

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrActivationCode(): String = unwrap(this).getAttrActivationCode()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDesktopType(): String = unwrap(this).getAttrDesktopType()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPendingSoftwareSetId(): String = unwrap(this).getAttrPendingSoftwareSetId()

  public open fun attrPendingSoftwareSetVersion(): String =
      unwrap(this).getAttrPendingSoftwareSetVersion()

  public open fun attrRegisteredDevicesCount(): Number =
      unwrap(this).getAttrRegisteredDevicesCount()

  public open fun attrSoftwareSetComplianceStatus(): String =
      unwrap(this).getAttrSoftwareSetComplianceStatus()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

  public open fun desiredSoftwareSetId(`value`: String) {
    unwrap(this).setDesiredSoftwareSetId(`value`)
  }

  public open fun desktopArn(): String = unwrap(this).getDesktopArn()

  public open fun desktopArn(`value`: String) {
    unwrap(this).setDesktopArn(`value`)
  }

  public open fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

  public open fun desktopEndpoint(`value`: String) {
    unwrap(this).setDesktopEndpoint(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  public open fun maintenanceWindow(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindow(`value`.let(IResolvable::unwrap))
  }

  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty) {
    unwrap(this).setMaintenanceWindow(`value`.let(MaintenanceWindowProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f882a793f43a14871908b1f869b47e5df8b398cd450e624b48d62bbb4e2de483")
  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty.Builder.() -> Unit): Unit =
      maintenanceWindow(MaintenanceWindowProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

  public open fun softwareSetUpdateMode(`value`: String) {
    unwrap(this).setSoftwareSetUpdateMode(`value`)
  }

  public open fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

  public open fun softwareSetUpdateSchedule(`value`: String) {
    unwrap(this).setSoftwareSetUpdateSchedule(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String)

    public fun desktopArn(desktopArn: String)

    public fun desktopEndpoint(desktopEndpoint: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("519fda3457d6ed44d5fc04754070dfd2014c3c36808a6805fc980825a2fdd616")
    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun softwareSetUpdateMode(softwareSetUpdateMode: String)

    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.Builder =
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.Builder.create(scope,
        id)

    override fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
      cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    override fun desktopArn(desktopArn: String) {
      cdkBuilder.desktopArn(desktopArn)
    }

    override fun desktopEndpoint(desktopEndpoint: String) {
      cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable::unwrap))
    }

    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(MaintenanceWindowProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("519fda3457d6ed44d5fc04754070dfd2014c3c36808a6805fc980825a2fdd616")
    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindow(MaintenanceWindowProperty(maintenanceWindow))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
      cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    override fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
      cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment = wrapped.cdkObject
  }

  public interface MaintenanceWindowProperty {
    public fun applyTimeOf(): String? = unwrap(this).getApplyTimeOf()

    public fun daysOfTheWeek(): List<String> = unwrap(this).getDaysOfTheWeek() ?: emptyList()

    public fun endTimeHour(): Number? = unwrap(this).getEndTimeHour()

    public fun endTimeMinute(): Number? = unwrap(this).getEndTimeMinute()

    public fun startTimeHour(): Number? = unwrap(this).getStartTimeHour()

    public fun startTimeMinute(): Number? = unwrap(this).getStartTimeMinute()

    public fun type(): String

    public interface Builder {
      public fun applyTimeOf(applyTimeOf: String)

      public fun daysOfTheWeek(daysOfTheWeek: List<String>)

      public fun endTimeHour(endTimeHour: Number)

      public fun endTimeMinute(endTimeMinute: Number)

      public fun startTimeHour(startTimeHour: Number)

      public fun startTimeMinute(startTimeMinute: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty.Builder
          =
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty.builder()

      override fun applyTimeOf(applyTimeOf: String) {
        cdkBuilder.applyTimeOf(applyTimeOf)
      }

      override fun daysOfTheWeek(daysOfTheWeek: List<String>) {
        cdkBuilder.daysOfTheWeek(daysOfTheWeek)
      }

      override fun endTimeHour(endTimeHour: Number) {
        cdkBuilder.endTimeHour(endTimeHour)
      }

      override fun endTimeMinute(endTimeMinute: Number) {
        cdkBuilder.endTimeMinute(endTimeMinute)
      }

      override fun startTimeHour(startTimeHour: Number) {
        cdkBuilder.startTimeHour(startTimeHour)
      }

      override fun startTimeMinute(startTimeMinute: Number) {
        cdkBuilder.startTimeMinute(startTimeMinute)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty,
    ) : MaintenanceWindowProperty {
      override fun applyTimeOf(): String? = unwrap(this).getApplyTimeOf()

      override fun daysOfTheWeek(): List<String> = unwrap(this).getDaysOfTheWeek() ?: emptyList()

      override fun endTimeHour(): Number? = unwrap(this).getEndTimeHour()

      override fun endTimeMinute(): Number? = unwrap(this).getEndTimeMinute()

      override fun startTimeHour(): Number? = unwrap(this).getStartTimeHour()

      override fun startTimeMinute(): Number? = unwrap(this).getStartTimeMinute()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty):
          MaintenanceWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
