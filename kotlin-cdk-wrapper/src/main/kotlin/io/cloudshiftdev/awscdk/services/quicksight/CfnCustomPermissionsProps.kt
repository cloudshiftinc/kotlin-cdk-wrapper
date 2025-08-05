@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCustomPermissions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnCustomPermissionsProps cfnCustomPermissionsProps = CfnCustomPermissionsProps.builder()
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
public interface CfnCustomPermissionsProps {
  /**
   * The ID of the AWS account that contains the custom permission configuration that you want to
   * update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * A set of actions in the custom permissions profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
   */
  public fun capabilities(): Any? = unwrap(this).getCapabilities()

  /**
   * The name of the custom permissions profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-custompermissionsname)
   */
  public fun customPermissionsName(): String

  /**
   * The tags to associate with the custom permissions profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomPermissionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID of the AWS account that contains the custom permission
     * configuration that you want to update. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    public fun capabilities(capabilities: IResolvable)

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    public fun capabilities(capabilities: CfnCustomPermissions.CapabilitiesProperty)

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd20f8f5d8b715a3e091328c5bfcbafce755f4332985e43ae9e7186f1a26dac")
    public
        fun capabilities(capabilities: CfnCustomPermissions.CapabilitiesProperty.Builder.() -> Unit)

    /**
     * @param customPermissionsName The name of the custom permissions profile. 
     */
    public fun customPermissionsName(customPermissionsName: String)

    /**
     * @param tags The tags to associate with the custom permissions profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to associate with the custom permissions profile.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps.builder()

    /**
     * @param awsAccountId The ID of the AWS account that contains the custom permission
     * configuration that you want to update. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    override fun capabilities(capabilities: IResolvable) {
      cdkBuilder.capabilities(capabilities.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    override fun capabilities(capabilities: CfnCustomPermissions.CapabilitiesProperty) {
      cdkBuilder.capabilities(capabilities.let(CfnCustomPermissions.CapabilitiesProperty.Companion::unwrap))
    }

    /**
     * @param capabilities A set of actions in the custom permissions profile.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd20f8f5d8b715a3e091328c5bfcbafce755f4332985e43ae9e7186f1a26dac")
    override
        fun capabilities(capabilities: CfnCustomPermissions.CapabilitiesProperty.Builder.() -> Unit):
        Unit = capabilities(CfnCustomPermissions.CapabilitiesProperty(capabilities))

    /**
     * @param customPermissionsName The name of the custom permissions profile. 
     */
    override fun customPermissionsName(customPermissionsName: String) {
      cdkBuilder.customPermissionsName(customPermissionsName)
    }

    /**
     * @param tags The tags to associate with the custom permissions profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to associate with the custom permissions profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps,
  ) : CdkObject(cdkObject),
      CfnCustomPermissionsProps {
    /**
     * The ID of the AWS account that contains the custom permission configuration that you want to
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * A set of actions in the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-capabilities)
     */
    override fun capabilities(): Any? = unwrap(this).getCapabilities()

    /**
     * The name of the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-custompermissionsname)
     */
    override fun customPermissionsName(): String = unwrap(this).getCustomPermissionsName()

    /**
     * The tags to associate with the custom permissions profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-custompermissions.html#cfn-quicksight-custompermissions-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomPermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps):
        CfnCustomPermissionsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomPermissionsProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomPermissionsProps):
        software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps
  }
}
