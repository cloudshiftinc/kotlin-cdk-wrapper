@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a report plan.
 *
 * A report plan is a document that contains information about the contents of the report and where
 * AWS Backup will deliver it.
 *
 * If you call `CreateReportPlan` with a plan that already exists, you receive an
 * `AlreadyExistsException` exception.
 *
 * For a sample AWS CloudFormation template, see the [AWS Backup Developer
 * Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object reportDeliveryChannel;
 * Object reportSetting;
 * CfnReportPlan cfnReportPlan = CfnReportPlan.Builder.create(this, "MyCfnReportPlan")
 * .reportDeliveryChannel(reportDeliveryChannel)
 * .reportSetting(reportSetting)
 * // the properties below are optional
 * .reportPlanDescription("reportPlanDescription")
 * .reportPlanName("reportPlanName")
 * .reportPlanTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html)
 */
public open class CfnReportPlan(
  cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportPlanProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnReportPlan(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReportPlanProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportPlanProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReportPlanProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of your report plan.
   */
  public open fun attrReportPlanArn(): String = unwrap(this).getAttrReportPlanArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Contains information about where and how to deliver your reports, specifically your Amazon S3
   * bucket name, S3 key prefix, and the formats of your reports.
   */
  public open fun reportDeliveryChannel(): Any = unwrap(this).getReportDeliveryChannel()

  /**
   * Contains information about where and how to deliver your reports, specifically your Amazon S3
   * bucket name, S3 key prefix, and the formats of your reports.
   */
  public open fun reportDeliveryChannel(`value`: Any) {
    unwrap(this).setReportDeliveryChannel(`value`)
  }

  /**
   * An optional description of the report plan with a maximum 1,024 characters.
   */
  public open fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

  /**
   * An optional description of the report plan with a maximum 1,024 characters.
   */
  public open fun reportPlanDescription(`value`: String) {
    unwrap(this).setReportPlanDescription(`value`)
  }

  /**
   * The unique name of the report plan.
   */
  public open fun reportPlanName(): String? = unwrap(this).getReportPlanName()

  /**
   * The unique name of the report plan.
   */
  public open fun reportPlanName(`value`: String) {
    unwrap(this).setReportPlanName(`value`)
  }

  /**
   * The tags to assign to your report plan.
   */
  public open fun reportPlanTags(): List<CfnTag> =
      unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to assign to your report plan.
   */
  public open fun reportPlanTags(`value`: List<CfnTag>) {
    unwrap(this).setReportPlanTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to your report plan.
   */
  public open fun reportPlanTags(vararg `value`: CfnTag): Unit = reportPlanTags(`value`.toList())

  /**
   * Identifies the report template for the report.
   *
   * Reports are built using a report template. The report templates are:.
   */
  public open fun reportSetting(): Any = unwrap(this).getReportSetting()

  /**
   * Identifies the report template for the report.
   *
   * Reports are built using a report template. The report templates are:.
   */
  public open fun reportSetting(`value`: Any) {
    unwrap(this).setReportSetting(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnReportPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains information about where and how to deliver your reports, specifically your Amazon S3
     * bucket name, S3 key prefix, and the formats of your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     * reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     * reports. 
     */
    public fun reportDeliveryChannel(reportDeliveryChannel: Any)

    /**
     * An optional description of the report plan with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplandescription)
     * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
     * characters. 
     */
    public fun reportPlanDescription(reportPlanDescription: String)

    /**
     * The unique name of the report plan.
     *
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplanname)
     * @param reportPlanName The unique name of the report plan. 
     */
    public fun reportPlanName(reportPlanName: String)

    /**
     * The tags to assign to your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     * @param reportPlanTags The tags to assign to your report plan. 
     */
    public fun reportPlanTags(reportPlanTags: List<CfnTag>)

    /**
     * The tags to assign to your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     * @param reportPlanTags The tags to assign to your report plan. 
     */
    public fun reportPlanTags(vararg reportPlanTags: CfnTag)

    /**
     * Identifies the report template for the report. Reports are built using a report template. The
     * report templates are:.
     *
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportsetting)
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     * report template. The report templates are:. 
     */
    public fun reportSetting(reportSetting: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnReportPlan.Builder =
        software.amazon.awscdk.services.backup.CfnReportPlan.Builder.create(scope, id)

    /**
     * Contains information about where and how to deliver your reports, specifically your Amazon S3
     * bucket name, S3 key prefix, and the formats of your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     * reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     * reports. 
     */
    override fun reportDeliveryChannel(reportDeliveryChannel: Any) {
      cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
    }

    /**
     * An optional description of the report plan with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplandescription)
     * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
     * characters. 
     */
    override fun reportPlanDescription(reportPlanDescription: String) {
      cdkBuilder.reportPlanDescription(reportPlanDescription)
    }

    /**
     * The unique name of the report plan.
     *
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplanname)
     * @param reportPlanName The unique name of the report plan. 
     */
    override fun reportPlanName(reportPlanName: String) {
      cdkBuilder.reportPlanName(reportPlanName)
    }

    /**
     * The tags to assign to your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     * @param reportPlanTags The tags to assign to your report plan. 
     */
    override fun reportPlanTags(reportPlanTags: List<CfnTag>) {
      cdkBuilder.reportPlanTags(reportPlanTags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     * @param reportPlanTags The tags to assign to your report plan. 
     */
    override fun reportPlanTags(vararg reportPlanTags: CfnTag): Unit =
        reportPlanTags(reportPlanTags.toList())

    /**
     * Identifies the report template for the report. Reports are built using a report template. The
     * report templates are:.
     *
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportsetting)
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     * report template. The report templates are:. 
     */
    override fun reportSetting(reportSetting: Any) {
      cdkBuilder.reportSetting(reportSetting)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnReportPlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnReportPlan.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.backup.CfnReportPlan = wrapped.cdkObject as
        software.amazon.awscdk.services.backup.CfnReportPlan
  }

  /**
   * Contains information from your report plan about where to deliver your reports, specifically
   * your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * ReportDeliveryChannelProperty reportDeliveryChannelProperty =
   * ReportDeliveryChannelProperty.builder()
   * .s3BucketName("s3BucketName")
   * // the properties below are optional
   * .formats(List.of("formats"))
   * .s3KeyPrefix("s3KeyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html)
   */
  public interface ReportDeliveryChannelProperty {
    /**
     * The format of your reports: `CSV` , `JSON` , or both.
     *
     * If not specified, the default format is `CSV` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-formats)
     */
    public fun formats(): List<String> = unwrap(this).getFormats() ?: emptyList()

    /**
     * The unique name of the S3 bucket that receives your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-s3bucketname)
     */
    public fun s3BucketName(): String

    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3.
     *
     * The prefix is this part of the following path: s3://your-bucket-name/ `prefix`
     * /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-s3keyprefix)
     */
    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * A builder for [ReportDeliveryChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param formats The format of your reports: `CSV` , `JSON` , or both.
       * If not specified, the default format is `CSV` .
       */
      public fun formats(formats: List<String>)

      /**
       * @param formats The format of your reports: `CSV` , `JSON` , or both.
       * If not specified, the default format is `CSV` .
       */
      public fun formats(vararg formats: String)

      /**
       * @param s3BucketName The unique name of the S3 bucket that receives your reports. 
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3KeyPrefix The prefix for where AWS Backup Audit Manager delivers your reports to
       * Amazon S3.
       * The prefix is this part of the following path: s3://your-bucket-name/ `prefix`
       * /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
       */
      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty.builder()

      /**
       * @param formats The format of your reports: `CSV` , `JSON` , or both.
       * If not specified, the default format is `CSV` .
       */
      override fun formats(formats: List<String>) {
        cdkBuilder.formats(formats)
      }

      /**
       * @param formats The format of your reports: `CSV` , `JSON` , or both.
       * If not specified, the default format is `CSV` .
       */
      override fun formats(vararg formats: String): Unit = formats(formats.toList())

      /**
       * @param s3BucketName The unique name of the S3 bucket that receives your reports. 
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3KeyPrefix The prefix for where AWS Backup Audit Manager delivers your reports to
       * Amazon S3.
       * The prefix is this part of the following path: s3://your-bucket-name/ `prefix`
       * /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
       */
      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty,
    ) : CdkObject(cdkObject), ReportDeliveryChannelProperty {
      /**
       * The format of your reports: `CSV` , `JSON` , or both.
       *
       * If not specified, the default format is `CSV` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-formats)
       */
      override fun formats(): List<String> = unwrap(this).getFormats() ?: emptyList()

      /**
       * The unique name of the S3 bucket that receives your reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-s3bucketname)
       */
      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      /**
       * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3.
       *
       * The prefix is this part of the following path: s3://your-bucket-name/ `prefix`
       * /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html#cfn-backup-reportplan-reportdeliverychannel-s3keyprefix)
       */
      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReportDeliveryChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty):
          ReportDeliveryChannelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReportDeliveryChannelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportDeliveryChannelProperty):
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportDeliveryChannelProperty
    }
  }

  /**
   * Contains detailed information about a report setting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * ReportSettingProperty reportSettingProperty = ReportSettingProperty.builder()
   * .reportTemplate("reportTemplate")
   * // the properties below are optional
   * .accounts(List.of("accounts"))
   * .frameworkArns(List.of("frameworkArns"))
   * .organizationUnits(List.of("organizationUnits"))
   * .regions(List.of("regions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html)
   */
  public interface ReportSettingProperty {
    /**
     * These are the accounts to be included in the report.
     *
     * Use string value of `ROOT` to include all organizational units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-accounts)
     */
    public fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

    /**
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-frameworkarns)
     */
    public fun frameworkArns(): List<String> = unwrap(this).getFrameworkArns() ?: emptyList()

    /**
     * These are the Organizational Units to be included in the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-organizationunits)
     */
    public fun organizationUnits(): List<String> = unwrap(this).getOrganizationUnits() ?:
        emptyList()

    /**
     * These are the Regions to be included in the report.
     *
     * Use the wildcard as the string value to include all Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-regions)
     */
    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    /**
     * Identifies the report template for the report. Reports are built using a report template. The
     * report templates are:.
     *
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-reporttemplate)
     */
    public fun reportTemplate(): String

    /**
     * A builder for [ReportSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accounts These are the accounts to be included in the report.
       * Use string value of `ROOT` to include all organizational units.
       */
      public fun accounts(accounts: List<String>)

      /**
       * @param accounts These are the accounts to be included in the report.
       * Use string value of `ROOT` to include all organizational units.
       */
      public fun accounts(vararg accounts: String)

      /**
       * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
       */
      public fun frameworkArns(frameworkArns: List<String>)

      /**
       * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
       */
      public fun frameworkArns(vararg frameworkArns: String)

      /**
       * @param organizationUnits These are the Organizational Units to be included in the report.
       */
      public fun organizationUnits(organizationUnits: List<String>)

      /**
       * @param organizationUnits These are the Organizational Units to be included in the report.
       */
      public fun organizationUnits(vararg organizationUnits: String)

      /**
       * @param regions These are the Regions to be included in the report.
       * Use the wildcard as the string value to include all Regions.
       */
      public fun regions(regions: List<String>)

      /**
       * @param regions These are the Regions to be included in the report.
       * Use the wildcard as the string value to include all Regions.
       */
      public fun regions(vararg regions: String)

      /**
       * @param reportTemplate Identifies the report template for the report. Reports are built
       * using a report template. The report templates are:. 
       * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT |
       * COPY_JOB_REPORT | RESTORE_JOB_REPORT`
       */
      public fun reportTemplate(reportTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty.Builder =
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty.builder()

      /**
       * @param accounts These are the accounts to be included in the report.
       * Use string value of `ROOT` to include all organizational units.
       */
      override fun accounts(accounts: List<String>) {
        cdkBuilder.accounts(accounts)
      }

      /**
       * @param accounts These are the accounts to be included in the report.
       * Use string value of `ROOT` to include all organizational units.
       */
      override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

      /**
       * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
       */
      override fun frameworkArns(frameworkArns: List<String>) {
        cdkBuilder.frameworkArns(frameworkArns)
      }

      /**
       * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
       */
      override fun frameworkArns(vararg frameworkArns: String): Unit =
          frameworkArns(frameworkArns.toList())

      /**
       * @param organizationUnits These are the Organizational Units to be included in the report.
       */
      override fun organizationUnits(organizationUnits: List<String>) {
        cdkBuilder.organizationUnits(organizationUnits)
      }

      /**
       * @param organizationUnits These are the Organizational Units to be included in the report.
       */
      override fun organizationUnits(vararg organizationUnits: String): Unit =
          organizationUnits(organizationUnits.toList())

      /**
       * @param regions These are the Regions to be included in the report.
       * Use the wildcard as the string value to include all Regions.
       */
      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      /**
       * @param regions These are the Regions to be included in the report.
       * Use the wildcard as the string value to include all Regions.
       */
      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      /**
       * @param reportTemplate Identifies the report template for the report. Reports are built
       * using a report template. The report templates are:. 
       * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT |
       * COPY_JOB_REPORT | RESTORE_JOB_REPORT`
       */
      override fun reportTemplate(reportTemplate: String) {
        cdkBuilder.reportTemplate(reportTemplate)
      }

      public fun build(): software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty,
    ) : CdkObject(cdkObject), ReportSettingProperty {
      /**
       * These are the accounts to be included in the report.
       *
       * Use string value of `ROOT` to include all organizational units.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-accounts)
       */
      override fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

      /**
       * The Amazon Resource Names (ARNs) of the frameworks a report covers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-frameworkarns)
       */
      override fun frameworkArns(): List<String> = unwrap(this).getFrameworkArns() ?: emptyList()

      /**
       * These are the Organizational Units to be included in the report.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-organizationunits)
       */
      override fun organizationUnits(): List<String> = unwrap(this).getOrganizationUnits() ?:
          emptyList()

      /**
       * These are the Regions to be included in the report.
       *
       * Use the wildcard as the string value to include all Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-regions)
       */
      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      /**
       * Identifies the report template for the report. Reports are built using a report template.
       * The report templates are:.
       *
       * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT |
       * COPY_JOB_REPORT | RESTORE_JOB_REPORT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html#cfn-backup-reportplan-reportsetting-reporttemplate)
       */
      override fun reportTemplate(): String = unwrap(this).getReportTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReportSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty):
          ReportSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? ReportSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportSettingProperty):
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnReportPlan.ReportSettingProperty
    }
  }
}
