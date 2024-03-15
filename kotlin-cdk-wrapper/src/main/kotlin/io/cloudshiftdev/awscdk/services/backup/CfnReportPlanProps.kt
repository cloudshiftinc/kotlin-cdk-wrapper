@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReportPlanProps {
  public fun reportDeliveryChannel(): Any

  public fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

  public fun reportPlanName(): String? = unwrap(this).getReportPlanName()

  public fun reportPlanTags(): List<CfnTag> = unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?:
      emptyList()

  public fun reportSetting(): Any

  @CdkDslMarker
  public interface Builder {
    public fun reportDeliveryChannel(reportDeliveryChannel: Any)

    public fun reportPlanDescription(reportPlanDescription: String)

    public fun reportPlanName(reportPlanName: String)

    public fun reportPlanTags(reportPlanTags: List<CfnTag>)

    public fun reportPlanTags(vararg reportPlanTags: CfnTag)

    public fun reportSetting(reportSetting: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnReportPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnReportPlanProps.builder()

    override fun reportDeliveryChannel(reportDeliveryChannel: Any) {
      cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
    }

    override fun reportPlanDescription(reportPlanDescription: String) {
      cdkBuilder.reportPlanDescription(reportPlanDescription)
    }

    override fun reportPlanName(reportPlanName: String) {
      cdkBuilder.reportPlanName(reportPlanName)
    }

    override fun reportPlanTags(reportPlanTags: List<CfnTag>) {
      cdkBuilder.reportPlanTags(reportPlanTags.map(CfnTag::unwrap))
    }

    override fun reportPlanTags(vararg reportPlanTags: CfnTag): Unit =
        reportPlanTags(reportPlanTags.toList())

    override fun reportSetting(reportSetting: Any) {
      cdkBuilder.reportSetting(reportSetting)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnReportPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnReportPlanProps,
  ) : CdkObject(cdkObject), CfnReportPlanProps {
    override fun reportDeliveryChannel(): Any = unwrap(this).getReportDeliveryChannel()

    override fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

    override fun reportPlanName(): String? = unwrap(this).getReportPlanName()

    override fun reportPlanTags(): List<CfnTag> =
        unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun reportSetting(): Any = unwrap(this).getReportSetting()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlanProps):
        CfnReportPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReportPlanProps):
        software.amazon.awscdk.services.backup.CfnReportPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnReportPlanProps
  }
}
