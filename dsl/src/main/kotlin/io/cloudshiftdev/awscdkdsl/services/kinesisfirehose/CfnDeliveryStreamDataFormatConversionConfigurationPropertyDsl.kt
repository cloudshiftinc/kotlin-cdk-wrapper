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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet
 * or ORC format before writing it to Amazon S3.
 *
 * Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the
 * column information from the AWS Glue table, to deserialize your input data from JSON and then
 * serialize it to the Parquet or ORC format. For more information, see
 * [Kinesis Data Firehose Record Format Conversion](https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * DataFormatConversionConfigurationProperty dataFormatConversionConfigurationProperty =
 * DataFormatConversionConfigurationProperty.builder()
 * .enabled(false)
 * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
 * .deserializer(DeserializerProperty.builder()
 * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
 * .timestampFormats(List.of("timestampFormats"))
 * .build())
 * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
 * .caseInsensitive(false)
 * .columnToJsonKeyMappings(Map.of(
 * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
 * .convertDotsInJsonKeysToUnderscores(false)
 * .build())
 * .build())
 * .build())
 * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
 * .serializer(SerializerProperty.builder()
 * .orcSerDe(OrcSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .bloomFilterColumns(List.of("bloomFilterColumns"))
 * .bloomFilterFalsePositiveProbability(123)
 * .compression("compression")
 * .dictionaryKeyThreshold(123)
 * .enablePadding(false)
 * .formatVersion("formatVersion")
 * .paddingTolerance(123)
 * .rowIndexStride(123)
 * .stripeSizeBytes(123)
 * .build())
 * .parquetSerDe(ParquetSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .compression("compression")
 * .enableDictionaryCompression(false)
 * .maxPaddingBytes(123)
 * .pageSizeBytes(123)
 * .writerVersion("writerVersion")
 * .build())
 * .build())
 * .build())
 * .schemaConfiguration(SchemaConfigurationProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * .versionId("versionId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder =
        CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder()

    /**
     * @param enabled Defaults to `true` . Set it to `false` if you want to disable format
     *   conversion while preserving the configuration details.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Defaults to `true` . Set it to `false` if you want to disable format
     *   conversion while preserving the configuration details.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
     *   convert the format of your data from JSON. This parameter is required if `Enabled` is set
     *   to true.
     */
    public fun inputFormatConfiguration(inputFormatConfiguration: IResolvable) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
    }

    /**
     * @param inputFormatConfiguration Specifies the deserializer that you want Firehose to use to
     *   convert the format of your data from JSON. This parameter is required if `Enabled` is set
     *   to true.
     */
    public fun inputFormatConfiguration(
        inputFormatConfiguration: CfnDeliveryStream.InputFormatConfigurationProperty
    ) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
    }

    /**
     * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
     *   convert the format of your data to the Parquet or ORC format. This parameter is required if
     *   `Enabled` is set to true.
     */
    public fun outputFormatConfiguration(outputFormatConfiguration: IResolvable) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
    }

    /**
     * @param outputFormatConfiguration Specifies the serializer that you want Firehose to use to
     *   convert the format of your data to the Parquet or ORC format. This parameter is required if
     *   `Enabled` is set to true.
     */
    public fun outputFormatConfiguration(
        outputFormatConfiguration: CfnDeliveryStream.OutputFormatConfigurationProperty
    ) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
    }

    /**
     * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the column
     *   information. This parameter is required if `Enabled` is set to true.
     */
    public fun schemaConfiguration(schemaConfiguration: IResolvable) {
        cdkBuilder.schemaConfiguration(schemaConfiguration)
    }

    /**
     * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the column
     *   information. This parameter is required if `Enabled` is set to true.
     */
    public fun schemaConfiguration(
        schemaConfiguration: CfnDeliveryStream.SchemaConfigurationProperty
    ) {
        cdkBuilder.schemaConfiguration(schemaConfiguration)
    }

    public fun build(): CfnDeliveryStream.DataFormatConversionConfigurationProperty =
        cdkBuilder.build()
}
