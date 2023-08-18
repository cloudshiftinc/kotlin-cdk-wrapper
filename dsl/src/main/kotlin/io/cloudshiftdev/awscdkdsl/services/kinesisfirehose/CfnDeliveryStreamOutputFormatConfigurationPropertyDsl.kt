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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your
 * data before it writes it to Amazon S3.
 *
 * This parameter is required if `Enabled` is set to true.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * OutputFormatConfigurationProperty outputFormatConfigurationProperty =
 * OutputFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamOutputFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.OutputFormatConfigurationProperty.Builder =
        CfnDeliveryStream.OutputFormatConfigurationProperty.builder()

    /**
     * @param serializer Specifies which serializer to use. You can choose either the ORC SerDe or
     *   the Parquet SerDe. If both are non-null, the server rejects the request.
     */
    public fun serializer(serializer: IResolvable) {
        cdkBuilder.serializer(serializer)
    }

    /**
     * @param serializer Specifies which serializer to use. You can choose either the ORC SerDe or
     *   the Parquet SerDe. If both are non-null, the server rejects the request.
     */
    public fun serializer(serializer: CfnDeliveryStream.SerializerProperty) {
        cdkBuilder.serializer(serializer)
    }

    public fun build(): CfnDeliveryStream.OutputFormatConfigurationProperty = cdkBuilder.build()
}
