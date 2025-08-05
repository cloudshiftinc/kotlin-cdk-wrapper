@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom permissions profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnCustomPermissions cfnCustomPermissions = CfnCustomPermissions.Builder.create(this,
 * "MyCfnCustomPermissions")
 * .awsAccountId("awsAccountId")
 * .customPermissionsName("customPermissionsName")
 * // the properties below are optional
 * .capabilities(CapabilitiesProperty.builder()
 * .addOrRunAnomalyDetectionForAnalyses("addOrRunAnomalyDetectionForAnalyses")
 * .createAndUpdateDashboardEmailReports("createAndUpdateDashboardEmailReports")
 * .createAndUpdateDatasets("createAndUpdateDatasets")
 * .createAndUpdateDataSources("createAndUpdateDataSources")
 * .createAndUpdateThemes("createAndUpdateThemes")
 * .createAndUpdateThresholdAlerts("createAndUpdateThresholdAlerts")
 * .createSharedFolders("createSharedFolders")
 * .createSpiceDataset("createSpiceDataset")
 * .exportToCsv("exportToCsv")
 * .exportToCsvInScheduledReports("exportToCsvInScheduledReports")
 * .exportToExcel("exportToExcel")
 * .exportToExcelInScheduledReports("exportToExcelInScheduledReports")
 * .exportToPdf("exportToPdf")
 * .exportToPdfInScheduledReports("exportToPdfInScheduledReports")
 * .includeContentInScheduledReportsEmail("includeContentInScheduledReportsEmail")
 * .printReports("printReports")
 * .renameSharedFolders("renameSharedFolders")
 * .shareAnalyses("shareAnalyses")
 * .shareDashboards("shareDashboards")
 * .shareDatasets("shareDatasets")
 * .shareDataSources("shareDataSources")
 * .subscribeDashboardEmailReports("subscribeDashboardEmailReports")
 * .viewAccountSpiceCapacity("viewAccountSpiceCapacity")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html)
 */
public open class CfnCustomPermissions(
  cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissions,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomPermissionsProps,
  ) :
      this(software.amazon.awscdk.services.quicksight.CfnCustomPermissions(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomPermissionsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomPermissionsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomPermissionsProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the custom permissions profile.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the AWS account that contains the custom permission configuration that you want to
   * update.
   */
  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  /**
   * The ID of the AWS account that contains the custom permission configuration that you want to
   * update.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * A set of actions in the custom permissions profile.
   */
  public open fun capabilities(): Any? = unwrap(this).getCapabilities()

  /**
   * A set of actions in the custom permissions profile.
   */
  public open fun capabilities(`value`: IResolvable) {
    unwrap(this).setCapabilities(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of actions in the custom permissions profile.
   */
  public open fun capabilities(`value`: CapabilitiesProperty) {
    unwrap(this).setCapabilities(`value`.let(CapabilitiesProperty.Companion::unwrap))
  }

  /**
   * A set of actions in the custom permissions profile.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4c6275cf59af468904b715d534d0787c12a935bbf5a84248b7d04ad6460cbad")
  public open fun capabilities(`value`: CapabilitiesProperty.Builder.() -> Unit): Unit =
      capabilities(CapabilitiesProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the custom permissions profile.
   */
  public open fun customPermissionsName(): String = unwrap(this).getCustomPermissionsName()

  /**
   * The name of the custom permissions profile.
   */
  public open fun customPermissionsName(`value`: String) {
    unwrap(this).setCustomPermissionsName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The tags to associate with the custom permissions profile.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to associate with the custom permissions profile.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to associate with the custom permissions profile.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnCustomPermissions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the AWS account that contains the custom permission configuration that you want to
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-awsaccountid)
     * @param awsAccountId The ID of the AWS account that contains the custom permission
     * configuration that you want to update. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    public fun capabilities(capabilities: IResolvable)

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    public fun capabilities(capabilities: CapabilitiesProperty)

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58b50cfa12c7f96e1fc3c792a9d8b8936f16345bbe49bf6167f44f8619965a75")
    public fun capabilities(capabilities: CapabilitiesProperty.Builder.() -> Unit)

    /**
     * The name of the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-custompermissionsname)
     * @param customPermissionsName The name of the custom permissions profile. 
     */
    public fun customPermissionsName(customPermissionsName: String)

    /**
     * The tags to associate with the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
     * @param tags The tags to associate with the custom permissions profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to associate with the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
     * @param tags The tags to associate with the custom permissions profile. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnCustomPermissions.Builder
        = software.amazon.awscdk.services.quicksight.CfnCustomPermissions.Builder.create(scope, id)

    /**
     * The ID of the AWS account that contains the custom permission configuration that you want to
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-awsaccountid)
     * @param awsAccountId The ID of the AWS account that contains the custom permission
     * configuration that you want to update. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    override fun capabilities(capabilities: IResolvable) {
      cdkBuilder.capabilities(capabilities.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    override fun capabilities(capabilities: CapabilitiesProperty) {
      cdkBuilder.capabilities(capabilities.let(CapabilitiesProperty.Companion::unwrap))
    }

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     * @param capabilities A set of actions in the custom permissions profile. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58b50cfa12c7f96e1fc3c792a9d8b8936f16345bbe49bf6167f44f8619965a75")
    override fun capabilities(capabilities: CapabilitiesProperty.Builder.() -> Unit): Unit =
        capabilities(CapabilitiesProperty(capabilities))

    /**
     * The name of the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-custompermissionsname)
     * @param customPermissionsName The name of the custom permissions profile. 
     */
    override fun customPermissionsName(customPermissionsName: String) {
      cdkBuilder.customPermissionsName(customPermissionsName)
    }

    /**
     * The tags to associate with the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
     * @param tags The tags to associate with the custom permissions profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to associate with the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
     * @param tags The tags to associate with the custom permissions profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnCustomPermissions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomPermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomPermissions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissions):
        CfnCustomPermissions = CfnCustomPermissions(cdkObject)

    internal fun unwrap(wrapped: CfnCustomPermissions):
        software.amazon.awscdk.services.quicksight.CfnCustomPermissions = wrapped.cdkObject as
        software.amazon.awscdk.services.quicksight.CfnCustomPermissions
  }

  /**
   * A set of actions that correspond to Amazon QuickSight permissions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CapabilitiesProperty capabilitiesProperty = CapabilitiesProperty.builder()
   * .addOrRunAnomalyDetectionForAnalyses("addOrRunAnomalyDetectionForAnalyses")
   * .createAndUpdateDashboardEmailReports("createAndUpdateDashboardEmailReports")
   * .createAndUpdateDatasets("createAndUpdateDatasets")
   * .createAndUpdateDataSources("createAndUpdateDataSources")
   * .createAndUpdateThemes("createAndUpdateThemes")
   * .createAndUpdateThresholdAlerts("createAndUpdateThresholdAlerts")
   * .createSharedFolders("createSharedFolders")
   * .createSpiceDataset("createSpiceDataset")
   * .exportToCsv("exportToCsv")
   * .exportToCsvInScheduledReports("exportToCsvInScheduledReports")
   * .exportToExcel("exportToExcel")
   * .exportToExcelInScheduledReports("exportToExcelInScheduledReports")
   * .exportToPdf("exportToPdf")
   * .exportToPdfInScheduledReports("exportToPdfInScheduledReports")
   * .includeContentInScheduledReportsEmail("includeContentInScheduledReportsEmail")
   * .printReports("printReports")
   * .renameSharedFolders("renameSharedFolders")
   * .shareAnalyses("shareAnalyses")
   * .shareDashboards("shareDashboards")
   * .shareDatasets("shareDatasets")
   * .shareDataSources("shareDataSources")
   * .subscribeDashboardEmailReports("subscribeDashboardEmailReports")
   * .viewAccountSpiceCapacity("viewAccountSpiceCapacity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html)
   */
  public interface CapabilitiesProperty {
    /**
     * The ability to add or run anomaly detection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-addorrunanomalydetectionforanalyses)
     */
    public fun addOrRunAnomalyDetectionForAnalyses(): String? =
        unwrap(this).getAddOrRunAnomalyDetectionForAnalyses()

    /**
     * The ability to create and update email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedashboardemailreports)
     */
    public fun createAndUpdateDashboardEmailReports(): String? =
        unwrap(this).getCreateAndUpdateDashboardEmailReports()

    /**
     * The ability to create and update data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedatasources)
     */
    public fun createAndUpdateDataSources(): String? = unwrap(this).getCreateAndUpdateDataSources()

    /**
     * The ability to create and update datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedatasets)
     */
    public fun createAndUpdateDatasets(): String? = unwrap(this).getCreateAndUpdateDatasets()

    /**
     * The ability to export to Create and Update themes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatethemes)
     */
    public fun createAndUpdateThemes(): String? = unwrap(this).getCreateAndUpdateThemes()

    /**
     * The ability to create and update threshold alerts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatethresholdalerts)
     */
    public fun createAndUpdateThresholdAlerts(): String? =
        unwrap(this).getCreateAndUpdateThresholdAlerts()

    /**
     * The ability to create shared folders.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createsharedfolders)
     */
    public fun createSharedFolders(): String? = unwrap(this).getCreateSharedFolders()

    /**
     * The ability to create a SPICE dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createspicedataset)
     */
    public fun createSpiceDataset(): String? = unwrap(this).getCreateSpiceDataset()

    /**
     * The ability to export to CSV files from the UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttocsv)
     */
    public fun exportToCsv(): String? = unwrap(this).getExportToCsv()

    /**
     * The ability to export to CSV files in scheduled email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttocsvinscheduledreports)
     */
    public fun exportToCsvInScheduledReports(): String? =
        unwrap(this).getExportToCsvInScheduledReports()

    /**
     * The ability to export to Excel files from the UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttoexcel)
     */
    public fun exportToExcel(): String? = unwrap(this).getExportToExcel()

    /**
     * The ability to export to Excel files in scheduled email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttoexcelinscheduledreports)
     */
    public fun exportToExcelInScheduledReports(): String? =
        unwrap(this).getExportToExcelInScheduledReports()

    /**
     * The ability to export to PDF files from the UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttopdf)
     */
    public fun exportToPdf(): String? = unwrap(this).getExportToPdf()

    /**
     * The ability to export to PDF files in scheduled email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttopdfinscheduledreports)
     */
    public fun exportToPdfInScheduledReports(): String? =
        unwrap(this).getExportToPdfInScheduledReports()

    /**
     * The ability to include content in scheduled email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-includecontentinscheduledreportsemail)
     */
    public fun includeContentInScheduledReportsEmail(): String? =
        unwrap(this).getIncludeContentInScheduledReportsEmail()

    /**
     * The ability to print reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-printreports)
     */
    public fun printReports(): String? = unwrap(this).getPrintReports()

    /**
     * The ability to rename shared folders.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-renamesharedfolders)
     */
    public fun renameSharedFolders(): String? = unwrap(this).getRenameSharedFolders()

    /**
     * The ability to share analyses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-shareanalyses)
     */
    public fun shareAnalyses(): String? = unwrap(this).getShareAnalyses()

    /**
     * The ability to share dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedashboards)
     */
    public fun shareDashboards(): String? = unwrap(this).getShareDashboards()

    /**
     * The ability to share data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedatasources)
     */
    public fun shareDataSources(): String? = unwrap(this).getShareDataSources()

    /**
     * The ability to share datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedatasets)
     */
    public fun shareDatasets(): String? = unwrap(this).getShareDatasets()

    /**
     * The ability to subscribe to email reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-subscribedashboardemailreports)
     */
    public fun subscribeDashboardEmailReports(): String? =
        unwrap(this).getSubscribeDashboardEmailReports()

    /**
     * The ability to view account SPICE capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-viewaccountspicecapacity)
     */
    public fun viewAccountSpiceCapacity(): String? = unwrap(this).getViewAccountSpiceCapacity()

    /**
     * A builder for [CapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addOrRunAnomalyDetectionForAnalyses The ability to add or run anomaly detection.
       */
      public fun addOrRunAnomalyDetectionForAnalyses(addOrRunAnomalyDetectionForAnalyses: String)

      /**
       * @param createAndUpdateDashboardEmailReports The ability to create and update email reports.
       */
      public fun createAndUpdateDashboardEmailReports(createAndUpdateDashboardEmailReports: String)

      /**
       * @param createAndUpdateDataSources The ability to create and update data sources.
       */
      public fun createAndUpdateDataSources(createAndUpdateDataSources: String)

      /**
       * @param createAndUpdateDatasets The ability to create and update datasets.
       */
      public fun createAndUpdateDatasets(createAndUpdateDatasets: String)

      /**
       * @param createAndUpdateThemes The ability to export to Create and Update themes.
       */
      public fun createAndUpdateThemes(createAndUpdateThemes: String)

      /**
       * @param createAndUpdateThresholdAlerts The ability to create and update threshold alerts.
       */
      public fun createAndUpdateThresholdAlerts(createAndUpdateThresholdAlerts: String)

      /**
       * @param createSharedFolders The ability to create shared folders.
       */
      public fun createSharedFolders(createSharedFolders: String)

      /**
       * @param createSpiceDataset The ability to create a SPICE dataset.
       */
      public fun createSpiceDataset(createSpiceDataset: String)

      /**
       * @param exportToCsv The ability to export to CSV files from the UI.
       */
      public fun exportToCsv(exportToCsv: String)

      /**
       * @param exportToCsvInScheduledReports The ability to export to CSV files in scheduled email
       * reports.
       */
      public fun exportToCsvInScheduledReports(exportToCsvInScheduledReports: String)

      /**
       * @param exportToExcel The ability to export to Excel files from the UI.
       */
      public fun exportToExcel(exportToExcel: String)

      /**
       * @param exportToExcelInScheduledReports The ability to export to Excel files in scheduled
       * email reports.
       */
      public fun exportToExcelInScheduledReports(exportToExcelInScheduledReports: String)

      /**
       * @param exportToPdf The ability to export to PDF files from the UI.
       */
      public fun exportToPdf(exportToPdf: String)

      /**
       * @param exportToPdfInScheduledReports The ability to export to PDF files in scheduled email
       * reports.
       */
      public fun exportToPdfInScheduledReports(exportToPdfInScheduledReports: String)

      /**
       * @param includeContentInScheduledReportsEmail The ability to include content in scheduled
       * email reports.
       */
      public
          fun includeContentInScheduledReportsEmail(includeContentInScheduledReportsEmail: String)

      /**
       * @param printReports The ability to print reports.
       */
      public fun printReports(printReports: String)

      /**
       * @param renameSharedFolders The ability to rename shared folders.
       */
      public fun renameSharedFolders(renameSharedFolders: String)

      /**
       * @param shareAnalyses The ability to share analyses.
       */
      public fun shareAnalyses(shareAnalyses: String)

      /**
       * @param shareDashboards The ability to share dashboards.
       */
      public fun shareDashboards(shareDashboards: String)

      /**
       * @param shareDataSources The ability to share data sources.
       */
      public fun shareDataSources(shareDataSources: String)

      /**
       * @param shareDatasets The ability to share datasets.
       */
      public fun shareDatasets(shareDatasets: String)

      /**
       * @param subscribeDashboardEmailReports The ability to subscribe to email reports.
       */
      public fun subscribeDashboardEmailReports(subscribeDashboardEmailReports: String)

      /**
       * @param viewAccountSpiceCapacity The ability to view account SPICE capacity.
       */
      public fun viewAccountSpiceCapacity(viewAccountSpiceCapacity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty.builder()

      /**
       * @param addOrRunAnomalyDetectionForAnalyses The ability to add or run anomaly detection.
       */
      override
          fun addOrRunAnomalyDetectionForAnalyses(addOrRunAnomalyDetectionForAnalyses: String) {
        cdkBuilder.addOrRunAnomalyDetectionForAnalyses(addOrRunAnomalyDetectionForAnalyses)
      }

      /**
       * @param createAndUpdateDashboardEmailReports The ability to create and update email reports.
       */
      override
          fun createAndUpdateDashboardEmailReports(createAndUpdateDashboardEmailReports: String) {
        cdkBuilder.createAndUpdateDashboardEmailReports(createAndUpdateDashboardEmailReports)
      }

      /**
       * @param createAndUpdateDataSources The ability to create and update data sources.
       */
      override fun createAndUpdateDataSources(createAndUpdateDataSources: String) {
        cdkBuilder.createAndUpdateDataSources(createAndUpdateDataSources)
      }

      /**
       * @param createAndUpdateDatasets The ability to create and update datasets.
       */
      override fun createAndUpdateDatasets(createAndUpdateDatasets: String) {
        cdkBuilder.createAndUpdateDatasets(createAndUpdateDatasets)
      }

      /**
       * @param createAndUpdateThemes The ability to export to Create and Update themes.
       */
      override fun createAndUpdateThemes(createAndUpdateThemes: String) {
        cdkBuilder.createAndUpdateThemes(createAndUpdateThemes)
      }

      /**
       * @param createAndUpdateThresholdAlerts The ability to create and update threshold alerts.
       */
      override fun createAndUpdateThresholdAlerts(createAndUpdateThresholdAlerts: String) {
        cdkBuilder.createAndUpdateThresholdAlerts(createAndUpdateThresholdAlerts)
      }

      /**
       * @param createSharedFolders The ability to create shared folders.
       */
      override fun createSharedFolders(createSharedFolders: String) {
        cdkBuilder.createSharedFolders(createSharedFolders)
      }

      /**
       * @param createSpiceDataset The ability to create a SPICE dataset.
       */
      override fun createSpiceDataset(createSpiceDataset: String) {
        cdkBuilder.createSpiceDataset(createSpiceDataset)
      }

      /**
       * @param exportToCsv The ability to export to CSV files from the UI.
       */
      override fun exportToCsv(exportToCsv: String) {
        cdkBuilder.exportToCsv(exportToCsv)
      }

      /**
       * @param exportToCsvInScheduledReports The ability to export to CSV files in scheduled email
       * reports.
       */
      override fun exportToCsvInScheduledReports(exportToCsvInScheduledReports: String) {
        cdkBuilder.exportToCsvInScheduledReports(exportToCsvInScheduledReports)
      }

      /**
       * @param exportToExcel The ability to export to Excel files from the UI.
       */
      override fun exportToExcel(exportToExcel: String) {
        cdkBuilder.exportToExcel(exportToExcel)
      }

      /**
       * @param exportToExcelInScheduledReports The ability to export to Excel files in scheduled
       * email reports.
       */
      override fun exportToExcelInScheduledReports(exportToExcelInScheduledReports: String) {
        cdkBuilder.exportToExcelInScheduledReports(exportToExcelInScheduledReports)
      }

      /**
       * @param exportToPdf The ability to export to PDF files from the UI.
       */
      override fun exportToPdf(exportToPdf: String) {
        cdkBuilder.exportToPdf(exportToPdf)
      }

      /**
       * @param exportToPdfInScheduledReports The ability to export to PDF files in scheduled email
       * reports.
       */
      override fun exportToPdfInScheduledReports(exportToPdfInScheduledReports: String) {
        cdkBuilder.exportToPdfInScheduledReports(exportToPdfInScheduledReports)
      }

      /**
       * @param includeContentInScheduledReportsEmail The ability to include content in scheduled
       * email reports.
       */
      override
          fun includeContentInScheduledReportsEmail(includeContentInScheduledReportsEmail: String) {
        cdkBuilder.includeContentInScheduledReportsEmail(includeContentInScheduledReportsEmail)
      }

      /**
       * @param printReports The ability to print reports.
       */
      override fun printReports(printReports: String) {
        cdkBuilder.printReports(printReports)
      }

      /**
       * @param renameSharedFolders The ability to rename shared folders.
       */
      override fun renameSharedFolders(renameSharedFolders: String) {
        cdkBuilder.renameSharedFolders(renameSharedFolders)
      }

      /**
       * @param shareAnalyses The ability to share analyses.
       */
      override fun shareAnalyses(shareAnalyses: String) {
        cdkBuilder.shareAnalyses(shareAnalyses)
      }

      /**
       * @param shareDashboards The ability to share dashboards.
       */
      override fun shareDashboards(shareDashboards: String) {
        cdkBuilder.shareDashboards(shareDashboards)
      }

      /**
       * @param shareDataSources The ability to share data sources.
       */
      override fun shareDataSources(shareDataSources: String) {
        cdkBuilder.shareDataSources(shareDataSources)
      }

      /**
       * @param shareDatasets The ability to share datasets.
       */
      override fun shareDatasets(shareDatasets: String) {
        cdkBuilder.shareDatasets(shareDatasets)
      }

      /**
       * @param subscribeDashboardEmailReports The ability to subscribe to email reports.
       */
      override fun subscribeDashboardEmailReports(subscribeDashboardEmailReports: String) {
        cdkBuilder.subscribeDashboardEmailReports(subscribeDashboardEmailReports)
      }

      /**
       * @param viewAccountSpiceCapacity The ability to view account SPICE capacity.
       */
      override fun viewAccountSpiceCapacity(viewAccountSpiceCapacity: String) {
        cdkBuilder.viewAccountSpiceCapacity(viewAccountSpiceCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty,
    ) : CdkObject(cdkObject),
        CapabilitiesProperty {
      /**
       * The ability to add or run anomaly detection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-addorrunanomalydetectionforanalyses)
       */
      override fun addOrRunAnomalyDetectionForAnalyses(): String? =
          unwrap(this).getAddOrRunAnomalyDetectionForAnalyses()

      /**
       * The ability to create and update email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedashboardemailreports)
       */
      override fun createAndUpdateDashboardEmailReports(): String? =
          unwrap(this).getCreateAndUpdateDashboardEmailReports()

      /**
       * The ability to create and update data sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedatasources)
       */
      override fun createAndUpdateDataSources(): String? =
          unwrap(this).getCreateAndUpdateDataSources()

      /**
       * The ability to create and update datasets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatedatasets)
       */
      override fun createAndUpdateDatasets(): String? = unwrap(this).getCreateAndUpdateDatasets()

      /**
       * The ability to export to Create and Update themes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatethemes)
       */
      override fun createAndUpdateThemes(): String? = unwrap(this).getCreateAndUpdateThemes()

      /**
       * The ability to create and update threshold alerts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createandupdatethresholdalerts)
       */
      override fun createAndUpdateThresholdAlerts(): String? =
          unwrap(this).getCreateAndUpdateThresholdAlerts()

      /**
       * The ability to create shared folders.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createsharedfolders)
       */
      override fun createSharedFolders(): String? = unwrap(this).getCreateSharedFolders()

      /**
       * The ability to create a SPICE dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-createspicedataset)
       */
      override fun createSpiceDataset(): String? = unwrap(this).getCreateSpiceDataset()

      /**
       * The ability to export to CSV files from the UI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttocsv)
       */
      override fun exportToCsv(): String? = unwrap(this).getExportToCsv()

      /**
       * The ability to export to CSV files in scheduled email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttocsvinscheduledreports)
       */
      override fun exportToCsvInScheduledReports(): String? =
          unwrap(this).getExportToCsvInScheduledReports()

      /**
       * The ability to export to Excel files from the UI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttoexcel)
       */
      override fun exportToExcel(): String? = unwrap(this).getExportToExcel()

      /**
       * The ability to export to Excel files in scheduled email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttoexcelinscheduledreports)
       */
      override fun exportToExcelInScheduledReports(): String? =
          unwrap(this).getExportToExcelInScheduledReports()

      /**
       * The ability to export to PDF files from the UI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttopdf)
       */
      override fun exportToPdf(): String? = unwrap(this).getExportToPdf()

      /**
       * The ability to export to PDF files in scheduled email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-exporttopdfinscheduledreports)
       */
      override fun exportToPdfInScheduledReports(): String? =
          unwrap(this).getExportToPdfInScheduledReports()

      /**
       * The ability to include content in scheduled email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-includecontentinscheduledreportsemail)
       */
      override fun includeContentInScheduledReportsEmail(): String? =
          unwrap(this).getIncludeContentInScheduledReportsEmail()

      /**
       * The ability to print reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-printreports)
       */
      override fun printReports(): String? = unwrap(this).getPrintReports()

      /**
       * The ability to rename shared folders.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-renamesharedfolders)
       */
      override fun renameSharedFolders(): String? = unwrap(this).getRenameSharedFolders()

      /**
       * The ability to share analyses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-shareanalyses)
       */
      override fun shareAnalyses(): String? = unwrap(this).getShareAnalyses()

      /**
       * The ability to share dashboards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedashboards)
       */
      override fun shareDashboards(): String? = unwrap(this).getShareDashboards()

      /**
       * The ability to share data sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedatasources)
       */
      override fun shareDataSources(): String? = unwrap(this).getShareDataSources()

      /**
       * The ability to share datasets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-sharedatasets)
       */
      override fun shareDatasets(): String? = unwrap(this).getShareDatasets()

      /**
       * The ability to subscribe to email reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-subscribedashboardemailreports)
       */
      override fun subscribeDashboardEmailReports(): String? =
          unwrap(this).getSubscribeDashboardEmailReports()

      /**
       * The ability to view account SPICE capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-custompermissions-capabilities.html#cfn-quicksight-custompermissions-capabilities-viewaccountspicecapacity)
       */
      override fun viewAccountSpiceCapacity(): String? = unwrap(this).getViewAccountSpiceCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty):
          CapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as? CapabilitiesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapabilitiesProperty):
          software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnCustomPermissions.CapabilitiesProperty
    }
  }
}
