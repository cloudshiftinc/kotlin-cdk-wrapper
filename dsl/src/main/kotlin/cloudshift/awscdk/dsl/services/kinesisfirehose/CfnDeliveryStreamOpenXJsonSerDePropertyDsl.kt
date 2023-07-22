@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The OpenX SerDe.
 *
 * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
 * format in preparation for serializing it to the Parquet or ORC format. This is one of two
 * deserializers you can choose, depending on which one offers the functionality you need. The other
 * option is the native Hive / HCatalog JsonSerDe.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * OpenXJsonSerDeProperty openXJsonSerDeProperty = OpenXJsonSerDeProperty.builder()
 * .caseInsensitive(false)
 * .columnToJsonKeyMappings(Map.of(
 * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
 * .convertDotsInJsonKeysToUnderscores(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamOpenXJsonSerDePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.OpenXJsonSerDeProperty.Builder =
      CfnDeliveryStream.OpenXJsonSerDeProperty.builder()

  /**
   * @param caseInsensitive When set to `true` , which is the default, Kinesis Data Firehose
   * converts JSON keys to lowercase before deserializing them.
   */
  public fun caseInsensitive(caseInsensitive: Boolean) {
    cdkBuilder.caseInsensitive(caseInsensitive)
  }

  /**
   * @param caseInsensitive When set to `true` , which is the default, Kinesis Data Firehose
   * converts JSON keys to lowercase before deserializing them.
   */
  public fun caseInsensitive(caseInsensitive: IResolvable) {
    cdkBuilder.caseInsensitive(caseInsensitive)
  }

  /**
   * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
   * column names.
   * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp` is
   * a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
   * "timestamp"}` to map this key to a column named `ts` .
   */
  public fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>) {
    cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
  }

  /**
   * @param columnToJsonKeyMappings Maps column names to JSON keys that aren't identical to the
   * column names.
   * This is useful when the JSON contains keys that are Hive keywords. For example, `timestamp` is
   * a Hive keyword. If you have a JSON key named `timestamp` , set this parameter to `{"ts":
   * "timestamp"}` to map this key to a column named `ts` .
   */
  public fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable) {
    cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
  }

  /**
   * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of the
   * keys include dots and that you want Kinesis Data Firehose to replace them with underscores.
   * This is useful because Apache Hive does not allow dots in column names. For example, if the
   * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
   * this option.
   *
   * The default is `false` .
   */
  public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean) {
    cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
  }

  /**
   * @param convertDotsInJsonKeysToUnderscores When set to `true` , specifies that the names of the
   * keys include dots and that you want Kinesis Data Firehose to replace them with underscores.
   * This is useful because Apache Hive does not allow dots in column names. For example, if the
   * JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using
   * this option.
   *
   * The default is `false` .
   */
  public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable) {
    cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
  }

  public fun build(): CfnDeliveryStream.OpenXJsonSerDeProperty = cdkBuilder.build()
}
