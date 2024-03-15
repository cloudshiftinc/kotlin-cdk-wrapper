@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPortalProps {
  public fun alarms(): Any? = unwrap(this).getAlarms()

  public fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

  public fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

  public fun portalContactEmail(): String

  public fun portalDescription(): String? = unwrap(this).getPortalDescription()

  public fun portalName(): String

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: Any)

    public fun notificationSenderEmail(notificationSenderEmail: String)

    public fun portalAuthMode(portalAuthMode: String)

    public fun portalContactEmail(portalContactEmail: String)

    public fun portalDescription(portalDescription: String)

    public fun portalName(portalName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnPortalProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnPortalProps.builder()

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

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortalProps,
  ) : CdkObject(cdkObject), CfnPortalProps {
    override fun alarms(): Any? = unwrap(this).getAlarms()

    override fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

    override fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

    override fun portalContactEmail(): String = unwrap(this).getPortalContactEmail()

    override fun portalDescription(): String? = unwrap(this).getPortalDescription()

    override fun portalName(): String = unwrap(this).getPortalName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortalProps):
        CfnPortalProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortalProps):
        software.amazon.awscdk.services.iotsitewise.CfnPortalProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnPortalProps
  }
}
