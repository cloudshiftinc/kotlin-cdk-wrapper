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
 * The serializer that you want Firehose to use to convert data to the target format before writing
 * it to Amazon S3.
 *
 * Firehose supports two types of serializers: the
 * [ORC SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html)
 * and the
 * [Parquet SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SerializerProperty serializerProperty = SerializerProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSerializerPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SerializerProperty.Builder =
        CfnDeliveryStream.SerializerProperty.builder()

    /**
     * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
     *   in Amazon S3. For more information, see
     *   [Apache ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
     */
    public fun orcSerDe(orcSerDe: IResolvable) {
        cdkBuilder.orcSerDe(orcSerDe)
    }

    /**
     * @param orcSerDe A serializer to use for converting data to the ORC format before storing it
     *   in Amazon S3. For more information, see
     *   [Apache ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
     */
    public fun orcSerDe(orcSerDe: CfnDeliveryStream.OrcSerDeProperty) {
        cdkBuilder.orcSerDe(orcSerDe)
    }

    /**
     * @param parquetSerDe A serializer to use for converting data to the Parquet format before
     *   storing it in Amazon S3. For more information, see
     *   [Apache Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/)
     *   .
     */
    public fun parquetSerDe(parquetSerDe: IResolvable) {
        cdkBuilder.parquetSerDe(parquetSerDe)
    }

    /**
     * @param parquetSerDe A serializer to use for converting data to the Parquet format before
     *   storing it in Amazon S3. For more information, see
     *   [Apache Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/)
     *   .
     */
    public fun parquetSerDe(parquetSerDe: CfnDeliveryStream.ParquetSerDeProperty) {
        cdkBuilder.parquetSerDe(parquetSerDe)
    }

    public fun build(): CfnDeliveryStream.SerializerProperty = cdkBuilder.build()
}
