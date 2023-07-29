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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The native Hive / HCatalog JsonSerDe.
 *
 * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
 * format in preparation for serializing it to the Parquet or ORC format. This is one of two
 * deserializers you can choose, depending on which one offers the functionality you need. The other
 * option is the OpenX SerDe.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * HiveJsonSerDeProperty hiveJsonSerDeProperty = HiveJsonSerDeProperty.builder()
 * .timestampFormats(List.of("timestampFormats"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamHiveJsonSerDePropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HiveJsonSerDeProperty.Builder =
        CfnDeliveryStream.HiveJsonSerDeProperty.builder()

    private val _timestampFormats: MutableList<String> = mutableListOf()

    /**
     * @param timestampFormats Indicates how you want Kinesis Data Firehose to parse the date and
     *   timestamps that may be present in your input data JSON. To specify these format strings,
     *   follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more
     *   information, see
     *   [Class DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
     *   . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
     *   you don't specify a format, Kinesis Data Firehose uses `java.sql.Timestamp::valueOf` by
     *   default.
     */
    public fun timestampFormats(vararg timestampFormats: String) {
        _timestampFormats.addAll(listOf(*timestampFormats))
    }

    /**
     * @param timestampFormats Indicates how you want Kinesis Data Firehose to parse the date and
     *   timestamps that may be present in your input data JSON. To specify these format strings,
     *   follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more
     *   information, see
     *   [Class DateTimeFormat](https://docs.aws.amazon.com/https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html)
     *   . You can also use the special value `millis` to parse timestamps in epoch milliseconds. If
     *   you don't specify a format, Kinesis Data Firehose uses `java.sql.Timestamp::valueOf` by
     *   default.
     */
    public fun timestampFormats(timestampFormats: Collection<String>) {
        _timestampFormats.addAll(timestampFormats)
    }

    public fun build(): CfnDeliveryStream.HiveJsonSerDeProperty {
        if (_timestampFormats.isNotEmpty()) cdkBuilder.timestampFormats(_timestampFormats)
        return cdkBuilder.build()
    }
}
