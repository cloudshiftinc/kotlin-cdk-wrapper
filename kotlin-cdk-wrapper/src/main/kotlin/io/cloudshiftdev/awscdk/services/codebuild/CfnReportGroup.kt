@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a report group.
 *
 * A report group contains a collection of reports.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * CfnReportGroup cfnReportGroup = CfnReportGroup.Builder.create(this, "MyCfnReportGroup")
 * .exportConfig(ReportExportConfigProperty.builder()
 * .exportConfigType("exportConfigType")
 * // the properties below are optional
 * .s3Destination(S3ReportExportConfigProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .encryptionDisabled(false)
 * .encryptionKey("encryptionKey")
 * .packaging("packaging")
 * .path("path")
 * .build())
 * .build())
 * .type("type")
 * // the properties below are optional
 * .deleteReports(false)
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html)
 */
public open class CfnReportGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportGroupProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.CfnReportGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReportGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReportGroupProps(props)
  )

  /**
   * The ARN of the AWS CodeBuild report group, such as
   * `arn:aws:codebuild:region:123456789012:report-group/myReportGroupName` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   */
  public open fun deleteReports(): Any? = unwrap(this).getDeleteReports()

  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   */
  public open fun deleteReports(`value`: Boolean) {
    unwrap(this).setDeleteReports(`value`)
  }

  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   */
  public open fun deleteReports(`value`: IResolvable) {
    unwrap(this).setDeleteReports(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   */
  public open fun exportConfig(): Any = unwrap(this).getExportConfig()

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   */
  public open fun exportConfig(`value`: IResolvable) {
    unwrap(this).setExportConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   */
  public open fun exportConfig(`value`: ReportExportConfigProperty) {
    unwrap(this).setExportConfig(`value`.let(ReportExportConfigProperty::unwrap))
  }

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("48dc81ef0ab5217e42e049cc5656a0c665d853122980e339160b77c3a7d532fa")
  public open fun exportConfig(`value`: ReportExportConfigProperty.Builder.() -> Unit): Unit =
      exportConfig(ReportExportConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the `ReportGroup` .
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the `ReportGroup` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tag key and value pairs associated with this report group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tag key and value pairs associated with this report group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tag key and value pairs associated with this report group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the `ReportGroup` .
   *
   * This can be one of the following values:.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the `ReportGroup` .
   *
   * This can be one of the following values:.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.CfnReportGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * When deleting a report group, specifies if reports within the report group should be deleted.
     *
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted. 
     */
    public fun deleteReports(deleteReports: Boolean)

    /**
     * When deleting a report group, specifies if reports within the report group should be deleted.
     *
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted. 
     */
    public fun deleteReports(deleteReports: IResolvable)

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    public fun exportConfig(exportConfig: IResolvable)

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    public fun exportConfig(exportConfig: ReportExportConfigProperty)

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa6125674745828975a38ffec20be585fad7e9227e52c899bf030b971cac495")
    public fun exportConfig(exportConfig: ReportExportConfigProperty.Builder.() -> Unit)

    /**
     * The name of the `ReportGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-name)
     * @param name The name of the `ReportGroup` . 
     */
    public fun name(name: String)

    /**
     * A list of tag key and value pairs associated with this report group.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
     * @param tags A list of tag key and value pairs associated with this report group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tag key and value pairs associated with this report group.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
     * @param tags A list of tag key and value pairs associated with this report group. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the `ReportGroup` . This can be one of the following values:.
     *
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-type)
     * @param type The type of the `ReportGroup` . This can be one of the following values:. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder =
        software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder.create(scope, id)

    /**
     * When deleting a report group, specifies if reports within the report group should be deleted.
     *
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted. 
     */
    override fun deleteReports(deleteReports: Boolean) {
      cdkBuilder.deleteReports(deleteReports)
    }

    /**
     * When deleting a report group, specifies if reports within the report group should be deleted.
     *
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     * group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     * you delete a report group that contains one or more reports, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
     * @param deleteReports When deleting a report group, specifies if reports within the report
     * group should be deleted. 
     */
    override fun deleteReports(deleteReports: IResolvable) {
      cdkBuilder.deleteReports(deleteReports.let(IResolvable::unwrap))
    }

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    override fun exportConfig(exportConfig: IResolvable) {
      cdkBuilder.exportConfig(exportConfig.let(IResolvable::unwrap))
    }

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    override fun exportConfig(exportConfig: ReportExportConfigProperty) {
      cdkBuilder.exportConfig(exportConfig.let(ReportExportConfigProperty::unwrap))
    }

    /**
     * Information about the destination where the raw data of this `ReportGroup` is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
     * @param exportConfig Information about the destination where the raw data of this
     * `ReportGroup` is exported. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa6125674745828975a38ffec20be585fad7e9227e52c899bf030b971cac495")
    override fun exportConfig(exportConfig: ReportExportConfigProperty.Builder.() -> Unit): Unit =
        exportConfig(ReportExportConfigProperty(exportConfig))

    /**
     * The name of the `ReportGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-name)
     * @param name The name of the `ReportGroup` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of tag key and value pairs associated with this report group.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
     * @param tags A list of tag key and value pairs associated with this report group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tag key and value pairs associated with this report group.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild report group
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
     * @param tags A list of tag key and value pairs associated with this report group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the `ReportGroup` . This can be one of the following values:.
     *
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-type)
     * @param type The type of the `ReportGroup` . This can be one of the following values:. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnReportGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnReportGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReportGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReportGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup):
        CfnReportGroup = CfnReportGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReportGroup):
        software.amazon.awscdk.services.codebuild.CfnReportGroup = wrapped.cdkObject
  }

  /**
   * Information about the location where the run of a report is exported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * ReportExportConfigProperty reportExportConfigProperty = ReportExportConfigProperty.builder()
   * .exportConfigType("exportConfigType")
   * // the properties below are optional
   * .s3Destination(S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html)
   */
  public interface ReportExportConfigProperty {
    /**
     * The export configuration type. Valid values are:.
     *
     * * `S3` : The report results are exported to an S3 bucket.
     * * `NO_EXPORT` : The report results are not exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype)
     */
    public fun exportConfigType(): String

    /**
     * A `S3ReportExportConfig` object that contains information about the S3 bucket where the run
     * of a report is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-s3destination)
     */
    public fun s3Destination(): Any? = unwrap(this).getS3Destination()

    /**
     * A builder for [ReportExportConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exportConfigType The export configuration type. Valid values are:. 
       * * `S3` : The report results are exported to an S3 bucket.
       * * `NO_EXPORT` : The report results are not exported.
       */
      public fun exportConfigType(exportConfigType: String)

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      public fun s3Destination(s3Destination: IResolvable)

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      public fun s3Destination(s3Destination: S3ReportExportConfigProperty)

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c4a28a99304714e987aae310598437035e5dbf4ed325d630307bf19085cf04")
      public fun s3Destination(s3Destination: S3ReportExportConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty.builder()

      /**
       * @param exportConfigType The export configuration type. Valid values are:. 
       * * `S3` : The report results are exported to an S3 bucket.
       * * `NO_EXPORT` : The report results are not exported.
       */
      override fun exportConfigType(exportConfigType: String) {
        cdkBuilder.exportConfigType(exportConfigType)
      }

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      override fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
      }

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      override fun s3Destination(s3Destination: S3ReportExportConfigProperty) {
        cdkBuilder.s3Destination(s3Destination.let(S3ReportExportConfigProperty::unwrap))
      }

      /**
       * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
       * bucket where the run of a report is exported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c4a28a99304714e987aae310598437035e5dbf4ed325d630307bf19085cf04")
      override fun s3Destination(s3Destination: S3ReportExportConfigProperty.Builder.() -> Unit):
          Unit = s3Destination(S3ReportExportConfigProperty(s3Destination))

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty,
    ) : CdkObject(cdkObject), ReportExportConfigProperty {
      /**
       * The export configuration type. Valid values are:.
       *
       * * `S3` : The report results are exported to an S3 bucket.
       * * `NO_EXPORT` : The report results are not exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype)
       */
      override fun exportConfigType(): String = unwrap(this).getExportConfigType()

      /**
       * A `S3ReportExportConfig` object that contains information about the S3 bucket where the run
       * of a report is exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-s3destination)
       */
      override fun s3Destination(): Any? = unwrap(this).getS3Destination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReportExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty):
          ReportExportConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReportExportConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportExportConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty
    }
  }

  /**
   * Information about the S3 bucket where the raw data of a report are exported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * S3ReportExportConfigProperty s3ReportExportConfigProperty =
   * S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html)
   */
  public interface S3ReportExportConfigProperty {
    /**
     * The name of the S3 bucket where the raw data of a report are exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-bucket)
     */
    public fun bucket(): String

    /**
     * The AWS account identifier of the owner of the Amazon S3 bucket.
     *
     * This allows report data to be exported to an Amazon S3 bucket that is owned by an account
     * other than the account running the build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * A boolean value that specifies if the results of a report are encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-encryptiondisabled)
     */
    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    /**
     * The encryption key for the report's encrypted raw data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-encryptionkey)
     */
    public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The type of build output artifact to create. Valid values include:.
     *
     * * `NONE` : CodeBuild creates the raw data in the output bucket. This is the default if
     * packaging is not specified.
     * * `ZIP` : CodeBuild creates a ZIP file with the raw data in the output bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-packaging)
     */
    public fun packaging(): String? = unwrap(this).getPackaging()

    /**
     * The path to the exported report's raw data results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [S3ReportExportConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket where the raw data of a report are exported. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bucketOwner The AWS account identifier of the owner of the Amazon S3 bucket.
       * This allows report data to be exported to an Amazon S3 bucket that is owned by an account
       * other than the account running the build.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param encryptionDisabled A boolean value that specifies if the results of a report are
       * encrypted.
       */
      public fun encryptionDisabled(encryptionDisabled: Boolean)

      /**
       * @param encryptionDisabled A boolean value that specifies if the results of a report are
       * encrypted.
       */
      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      /**
       * @param encryptionKey The encryption key for the report's encrypted raw data.
       */
      public fun encryptionKey(encryptionKey: String)

      /**
       * @param packaging The type of build output artifact to create. Valid values include:.
       * * `NONE` : CodeBuild creates the raw data in the output bucket. This is the default if
       * packaging is not specified.
       * * `ZIP` : CodeBuild creates a ZIP file with the raw data in the output bucket.
       */
      public fun packaging(packaging: String)

      /**
       * @param path The path to the exported report's raw data results.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.builder()

      /**
       * @param bucket The name of the S3 bucket where the raw data of a report are exported. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bucketOwner The AWS account identifier of the owner of the Amazon S3 bucket.
       * This allows report data to be exported to an Amazon S3 bucket that is owned by an account
       * other than the account running the build.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param encryptionDisabled A boolean value that specifies if the results of a report are
       * encrypted.
       */
      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      /**
       * @param encryptionDisabled A boolean value that specifies if the results of a report are
       * encrypted.
       */
      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionKey The encryption key for the report's encrypted raw data.
       */
      override fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
      }

      /**
       * @param packaging The type of build output artifact to create. Valid values include:.
       * * `NONE` : CodeBuild creates the raw data in the output bucket. This is the default if
       * packaging is not specified.
       * * `ZIP` : CodeBuild creates a ZIP file with the raw data in the output bucket.
       */
      override fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
      }

      /**
       * @param path The path to the exported report's raw data results.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty,
    ) : CdkObject(cdkObject), S3ReportExportConfigProperty {
      /**
       * The name of the S3 bucket where the raw data of a report are exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The AWS account identifier of the owner of the Amazon S3 bucket.
       *
       * This allows report data to be exported to an Amazon S3 bucket that is owned by an account
       * other than the account running the build.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * A boolean value that specifies if the results of a report are encrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-encryptiondisabled)
       */
      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      /**
       * The encryption key for the report's encrypted raw data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-encryptionkey)
       */
      override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

      /**
       * The type of build output artifact to create. Valid values include:.
       *
       * * `NONE` : CodeBuild creates the raw data in the output bucket. This is the default if
       * packaging is not specified.
       * * `ZIP` : CodeBuild creates a ZIP file with the raw data in the output bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-packaging)
       */
      override fun packaging(): String? = unwrap(this).getPackaging()

      /**
       * The path to the exported report's raw data results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html#cfn-codebuild-reportgroup-s3reportexportconfig-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReportExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty):
          S3ReportExportConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ReportExportConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReportExportConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty
    }
  }
}
