package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReportPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrReportPlanArn(): String = unwrap(this).getAttrReportPlanArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun reportDeliveryChannel(): Any = unwrap(this).getReportDeliveryChannel()

  public open fun reportDeliveryChannel(`value`: Any) {
    unwrap(this).setReportDeliveryChannel(`value`)
  }

  public open fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

  public open fun reportPlanDescription(`value`: String) {
    unwrap(this).setReportPlanDescription(`value`)
  }

  public open fun reportPlanName(): String? = unwrap(this).getReportPlanName()

  public open fun reportPlanName(`value`: String) {
    unwrap(this).setReportPlanName(`value`)
  }

  public open fun reportPlanTags(): List<CfnTag> =
      unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun reportPlanTags(`value`: List<CfnTag>) {
    unwrap(this).setReportPlanTags(`value`.map(CfnTag::unwrap))
  }

  public open fun reportSetting(): Any = unwrap(this).getReportSetting()

  public open fun reportSetting(`value`: Any) {
    unwrap(this).setReportSetting(`value`)
  }

  public interface Builder {
    public fun reportDeliveryChannel(reportDeliveryChannel: Any)

    public fun reportPlanDescription(reportPlanDescription: String)

    public fun reportPlanName(reportPlanName: String)

    public fun reportPlanTags(reportPlanTags: List<CfnTag>)

    public fun reportSetting(reportSetting: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnReportPlan.Builder =
        software.amazon.awscdk.services.backup.CfnReportPlan.Builder.create(scope, id)

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

    override fun reportSetting(reportSetting: Any) {
      cdkBuilder.reportSetting(reportSetting)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnReportPlan = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReportPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReportPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan):
        CfnReportPlan = CfnReportPlan(cdkObject)

    internal fun unwrap(wrapped: CfnReportPlan):
        software.amazon.awscdk.services.backup.CfnReportPlan = wrapped.cdkObject
  }

  public interface ReportDeliveryChannelProperty {
    public fun formats(): List<String> = unwrap(this).getFormats() ?: emptyList()

    public fun s3BucketName(): String

    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    public interface Builder {
      public fun formats(formats: List<String>)

      public fun s3BucketName(s3BucketName: String)

      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty.builder()

      override fun formats(formats: List<String>) {
        cdkBuilder.formats(formats)
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty,
    ) : ReportDeliveryChannelProperty {
      override fun formats(): List<String> = unwrap(this).getFormats() ?: emptyList()

      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReportDeliveryChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty):
          ReportDeliveryChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportDeliveryChannelProperty):
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReportSettingProperty {
    public fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

    public fun frameworkArns(): List<String> = unwrap(this).getFrameworkArns() ?: emptyList()

    public fun organizationUnits(): List<String> = unwrap(this).getOrganizationUnits() ?:
        emptyList()

    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    public fun reportTemplate(): String

    public interface Builder {
      public fun accounts(accounts: List<String>)

      public fun frameworkArns(frameworkArns: List<String>)

      public fun organizationUnits(organizationUnits: List<String>)

      public fun regions(regions: List<String>)

      public fun reportTemplate(reportTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty.Builder =
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty.builder()

      override fun accounts(accounts: List<String>) {
        cdkBuilder.accounts(accounts)
      }

      override fun frameworkArns(frameworkArns: List<String>) {
        cdkBuilder.frameworkArns(frameworkArns)
      }

      override fun organizationUnits(organizationUnits: List<String>) {
        cdkBuilder.organizationUnits(organizationUnits)
      }

      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      override fun reportTemplate(reportTemplate: String) {
        cdkBuilder.reportTemplate(reportTemplate)
      }

      public fun build(): software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty,
    ) : ReportSettingProperty {
      override fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

      override fun frameworkArns(): List<String> = unwrap(this).getFrameworkArns() ?: emptyList()

      override fun organizationUnits(): List<String> = unwrap(this).getOrganizationUnits() ?:
          emptyList()

      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      override fun reportTemplate(): String = unwrap(this).getReportTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReportSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty):
          ReportSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportSettingProperty):
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
