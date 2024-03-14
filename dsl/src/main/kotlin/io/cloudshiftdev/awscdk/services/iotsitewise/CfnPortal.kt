package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortal internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun alarms(): Any? = unwrap(this).getAlarms()

  public open fun alarms(`value`: Any) {
    unwrap(this).setAlarms(`value`)
  }

  public open fun attrPortalArn(): String = unwrap(this).getAttrPortalArn()

  public open fun attrPortalClientId(): String = unwrap(this).getAttrPortalClientId()

  public open fun attrPortalId(): String = unwrap(this).getAttrPortalId()

  public open fun attrPortalStartUrl(): String = unwrap(this).getAttrPortalStartUrl()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

  public open fun notificationSenderEmail(`value`: String) {
    unwrap(this).setNotificationSenderEmail(`value`)
  }

  public open fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

  public open fun portalAuthMode(`value`: String) {
    unwrap(this).setPortalAuthMode(`value`)
  }

  public open fun portalContactEmail(): String = unwrap(this).getPortalContactEmail()

  public open fun portalContactEmail(`value`: String) {
    unwrap(this).setPortalContactEmail(`value`)
  }

  public open fun portalDescription(): String? = unwrap(this).getPortalDescription()

  public open fun portalDescription(`value`: String) {
    unwrap(this).setPortalDescription(`value`)
  }

  public open fun portalName(): String = unwrap(this).getPortalName()

  public open fun portalName(`value`: String) {
    unwrap(this).setPortalName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun alarms(alarms: Any)

    public fun notificationSenderEmail(notificationSenderEmail: String)

    public fun portalAuthMode(portalAuthMode: String)

    public fun portalContactEmail(portalContactEmail: String)

    public fun portalDescription(portalDescription: String)

    public fun portalName(portalName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnPortal.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnPortal.Builder.create(scope, id)

    override fun alarms(alarms: Any) {
      cdkBuilder.alarms(alarms)
    }

    override fun notificationSenderEmail(notificationSenderEmail: String) {
      cdkBuilder.notificationSenderEmail(notificationSenderEmail)
    }

    override fun portalAuthMode(portalAuthMode: String) {
      cdkBuilder.portalAuthMode(portalAuthMode)
    }

    override fun portalContactEmail(portalContactEmail: String) {
      cdkBuilder.portalContactEmail(portalContactEmail)
    }

    override fun portalDescription(portalDescription: String) {
      cdkBuilder.portalDescription(portalDescription)
    }

    override fun portalName(portalName: String) {
      cdkBuilder.portalName(portalName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortal = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortal {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal): CfnPortal =
        CfnPortal(cdkObject)

    internal fun unwrap(wrapped: CfnPortal): software.amazon.awscdk.services.iotsitewise.CfnPortal =
        wrapped.cdkObject
  }

  public interface AlarmsProperty {
    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    public fun notificationLambdaArn(): String? = unwrap(this).getNotificationLambdaArn()

    public interface Builder {
      public fun alarmRoleArn(alarmRoleArn: String)

      public fun notificationLambdaArn(notificationLambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty.builder()

      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      override fun notificationLambdaArn(notificationLambdaArn: String) {
        cdkBuilder.notificationLambdaArn(notificationLambdaArn)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty,
    ) : AlarmsProperty {
      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

      override fun notificationLambdaArn(): String? = unwrap(this).getNotificationLambdaArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty):
          AlarmsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmsProperty):
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
