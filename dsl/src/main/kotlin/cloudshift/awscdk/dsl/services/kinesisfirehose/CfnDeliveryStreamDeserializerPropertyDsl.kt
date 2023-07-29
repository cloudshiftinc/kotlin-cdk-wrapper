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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON.
 *
 * Kinesis Data Firehose then serializes the data to its final format using the `Serializer` .
 * Kinesis Data Firehose supports two types of deserializers: the
 * [Apache Hive JSON SerDe](https://docs.aws.amazon.com/https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON)
 * and the
 * [OpenX JSON SerDe](https://docs.aws.amazon.com/https://github.com/rcongiu/Hive-JSON-Serde) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * DeserializerProperty deserializerProperty = DeserializerProperty.builder()
 * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
 * .timestampFormats(List.of("timestampFormats"))
 * .build())
 * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
 * .caseInsensitive(false)
 * .columnToJsonKeyMappings(Map.of(
 * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
 * .convertDotsInJsonKeysToUnderscores(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDeserializerPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DeserializerProperty.Builder =
        CfnDeliveryStream.DeserializerProperty.builder()

    /**
     * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for
     *   deserializing data, which means converting it from the JSON format in preparation for
     *   serializing it to the Parquet or ORC format. This is one of two deserializers you can
     *   choose, depending on which one offers the functionality you need. The other option is the
     *   OpenX SerDe.
     */
    public fun hiveJsonSerDe(hiveJsonSerDe: IResolvable) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
    }

    /**
     * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for
     *   deserializing data, which means converting it from the JSON format in preparation for
     *   serializing it to the Parquet or ORC format. This is one of two deserializers you can
     *   choose, depending on which one offers the functionality you need. The other option is the
     *   OpenX SerDe.
     */
    public fun hiveJsonSerDe(hiveJsonSerDe: CfnDeliveryStream.HiveJsonSerDeProperty) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
    }

    /**
     * @param openXJsonSerDe The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data,
     *   which means converting it from the JSON format in preparation for serializing it to the
     *   Parquet or ORC format. This is one of two deserializers you can choose, depending on which
     *   one offers the functionality you need. The other option is the native Hive / HCatalog
     *   JsonSerDe.
     */
    public fun openXJsonSerDe(openXJsonSerDe: IResolvable) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe)
    }

    /**
     * @param openXJsonSerDe The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data,
     *   which means converting it from the JSON format in preparation for serializing it to the
     *   Parquet or ORC format. This is one of two deserializers you can choose, depending on which
     *   one offers the functionality you need. The other option is the native Hive / HCatalog
     *   JsonSerDe.
     */
    public fun openXJsonSerDe(openXJsonSerDe: CfnDeliveryStream.OpenXJsonSerDeProperty) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe)
    }

    public fun build(): CfnDeliveryStream.DeserializerProperty = cdkBuilder.build()
}
