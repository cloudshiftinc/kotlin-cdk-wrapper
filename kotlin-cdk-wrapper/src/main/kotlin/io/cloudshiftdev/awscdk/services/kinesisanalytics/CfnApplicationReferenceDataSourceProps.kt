@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplicationReferenceDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationReferenceDataSourceProps cfnApplicationReferenceDataSourceProps =
 * CfnApplicationReferenceDataSourceProps.builder()
 * .applicationName("applicationName")
 * .referenceDataSource(ReferenceDataSourceProperty.builder()
 * .referenceSchema(ReferenceSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build())
 * // the properties below are optional
 * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * .referenceRoleArn("referenceRoleArn")
 * .build())
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
public interface CfnApplicationReferenceDataSourceProps {
  /**
   * Name of an existing application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
   */
  public fun applicationName(): String

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   *
   * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
   * that is created. You provide an S3 bucket, object key name, and the resulting in-application table
   * that is created. You must also provide an IAM role with the necessary permissions that Amazon
   * Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
   */
  public fun referenceDataSource(): Any

  /**
   * A builder for [CfnApplicationReferenceDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName Name of an existing application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    public fun referenceDataSource(referenceDataSource: IResolvable)

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty)

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0f23419ee030d3edde05f6d9c1fa67b1ad200dd7c8bb965b49983217a8a6c3")
    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.builder()

    /**
     * @param applicationName Name of an existing application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Companion::unwrap))
    }

    /**
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0f23419ee030d3edde05f6d9c1fa67b1ad200dd7c8bb965b49983217a8a6c3")
    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit =
        referenceDataSource(CfnApplicationReferenceDataSource.ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps,
  ) : CdkObject(cdkObject), CfnApplicationReferenceDataSourceProps {
    /**
     * Name of an existing application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     */
    override fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationReferenceDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps):
        CfnApplicationReferenceDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnApplicationReferenceDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceProps):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps
  }
}
