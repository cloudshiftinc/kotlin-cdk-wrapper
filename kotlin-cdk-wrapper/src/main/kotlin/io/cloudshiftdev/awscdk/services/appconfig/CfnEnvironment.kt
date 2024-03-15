@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun monitors(): Any? = unwrap(this).getMonitors()

  public open fun monitors(`value`: IResolvable) {
    unwrap(this).setMonitors(`value`.let(IResolvable::unwrap))
  }

  public open fun monitors(__idx_ac66f0: List<Any>) {
    unwrap(this).setMonitors(__idx_ac66f0)
  }

  public open fun monitors(vararg __idx_ac66f0: Any): Unit = monitors(__idx_ac66f0.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun description(description: String)

    public fun monitors(monitors: IResolvable)

    public fun monitors(monitors: List<Any>)

    public fun monitors(vararg monitors: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder =
        software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder.create(scope, id)

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun monitors(monitors: IResolvable) {
      cdkBuilder.monitors(monitors.let(IResolvable::unwrap))
    }

    override fun monitors(monitors: List<Any>) {
      cdkBuilder.monitors(monitors)
    }

    override fun monitors(vararg monitors: Any): Unit = monitors(monitors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.appconfig.CfnEnvironment = wrapped.cdkObject
  }

  public interface MonitorProperty {
    public fun alarmArn(): String

    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun alarmArn(alarmArn: String)

      public fun alarmRoleArn(alarmRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty.builder()

      override fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
      }

      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty,
    ) : CdkObject(cdkObject), MonitorProperty {
      override fun alarmArn(): String = unwrap(this).getAlarmArn()

      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty):
          MonitorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitorProperty):
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty
    }
  }

  public interface MonitorsProperty {
    public fun alarmArn(): String? = unwrap(this).getAlarmArn()

    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun alarmArn(alarmArn: String)

      public fun alarmRoleArn(alarmRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty.builder()

      override fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
      }

      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty,
    ) : CdkObject(cdkObject), MonitorsProperty {
      override fun alarmArn(): String? = unwrap(this).getAlarmArn()

      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty):
          MonitorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitorsProperty):
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty
    }
  }
}