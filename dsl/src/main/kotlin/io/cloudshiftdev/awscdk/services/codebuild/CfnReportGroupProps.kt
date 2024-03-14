package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnReportGroupProps {
  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   *
   * * **true** - Deletes any reports that belong to the report group before deleting the report
   * group.
   * * **false** - You must delete any reports in the report group. This is the default value. If
   * you delete a report group that contains one or more reports, an exception is thrown.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
   */
  public fun deleteReports(): Any? = unwrap(this).getDeleteReports()

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
   */
  public fun exportConfig(): Any

  /**
   * The name of the `ReportGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of tag key and value pairs associated with this report group.
   *
   * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the `ReportGroup` . This can be one of the following values:.
   *
   * * **CODE_COVERAGE** - The report group contains code coverage reports.
   * * **TEST** - The report group contains test reports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnReportGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     */
    public fun deleteReports(deleteReports: Boolean)

    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     */
    public fun deleteReports(deleteReports: IResolvable)

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    public fun exportConfig(exportConfig: IResolvable)

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    public fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty)

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c3cb3de75b844bd82295d8ecf486748951b06392d562004f8817d8101ed78ec")
    public
        fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the `ReportGroup` .
     */
    public fun name(name: String)

    /**
     * @param tags A list of tag key and value pairs associated with this report group.
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tag key and value pairs associated with this report group.
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the `ReportGroup` . This can be one of the following values:. 
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnReportGroupProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnReportGroupProps.builder()

    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     */
    override fun deleteReports(deleteReports: Boolean) {
      cdkBuilder.deleteReports(deleteReports)
    }

    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     */
    override fun deleteReports(deleteReports: IResolvable) {
      cdkBuilder.deleteReports(deleteReports.let(IResolvable::unwrap))
    }

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    override fun exportConfig(exportConfig: IResolvable) {
      cdkBuilder.exportConfig(exportConfig.let(IResolvable::unwrap))
    }

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    override fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty) {
      cdkBuilder.exportConfig(exportConfig.let(CfnReportGroup.ReportExportConfigProperty::unwrap))
    }

    /**
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c3cb3de75b844bd82295d8ecf486748951b06392d562004f8817d8101ed78ec")
    override
        fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty.Builder.() -> Unit):
        Unit = exportConfig(CfnReportGroup.ReportExportConfigProperty(exportConfig))

    /**
     * @param name The name of the `ReportGroup` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tag key and value pairs associated with this report group.
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tag key and value pairs associated with this report group.
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the `ReportGroup` . This can be one of the following values:. 
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnReportGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroupProps,
  ) : CdkObject(cdkObject), CfnReportGroupProps {
    /**
     * When deleting a report group, specifies if reports within the report group should be deleted.
     *
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
     */
    override fun deleteReports(): Any? = unwrap(this).getDeleteReports()

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     */
    override fun exportConfig(): Any = unwrap(this).getExportConfig()

    /**
     * The name of the `ReportGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of tag key and value pairs associated with this report group.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the `ReportGroup` . This can be one of the following values:.
     *
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroupProps):
        CfnReportGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReportGroupProps):
        software.amazon.awscdk.services.codebuild.CfnReportGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CfnReportGroupProps
  }
}
