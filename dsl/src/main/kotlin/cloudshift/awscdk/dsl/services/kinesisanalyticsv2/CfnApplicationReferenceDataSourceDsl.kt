@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.constructs.Construct

/**
 * Adds a reference data source to an existing SQL-based Kinesis Data Analytics application.
 *
 * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an
 * in-application table within your application. In the request, you provide the source (S3 bucket
 * name and object key name), name of the in-application table to create, and the necessary mapping
 * information that describes how data in an Amazon S3 object maps to columns in the resulting
 * in-application table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationReferenceDataSource cfnApplicationReferenceDataSource =
 * CfnApplicationReferenceDataSource.Builder.create(this, "MyCfnApplicationReferenceDataSource")
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
 * .build())
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationReferenceDataSource.Builder =
        CfnApplicationReferenceDataSource.Builder.create(scope, id)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
     *
     * @param applicationName The name of the application.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements
     * in the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     *
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     *   reference data source by providing the source information (Amazon S3 bucket name and object
     *   key name), the resulting in-application table name that is created, and the necessary
     *   schema to map the data elements in the Amazon S3 object to the in-application table.
     */
    public fun referenceDataSource(referenceDataSource: IResolvable) {
        cdkBuilder.referenceDataSource(referenceDataSource)
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements
     * in the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     *
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     *   reference data source by providing the source information (Amazon S3 bucket name and object
     *   key name), the resulting in-application table name that is created, and the necessary
     *   schema to map the data elements in the Amazon S3 object to the in-application table.
     */
    public fun referenceDataSource(
        referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty
    ) {
        cdkBuilder.referenceDataSource(referenceDataSource)
    }

    public fun build(): CfnApplicationReferenceDataSource = cdkBuilder.build()
}
