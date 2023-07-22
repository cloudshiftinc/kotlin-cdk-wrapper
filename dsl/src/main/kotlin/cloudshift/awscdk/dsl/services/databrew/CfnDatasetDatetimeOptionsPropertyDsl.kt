@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents additional options for correct interpretation of datetime parameters used in the
 * Amazon S3 path of a dataset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * DatetimeOptionsProperty datetimeOptionsProperty = DatetimeOptionsProperty.builder()
 * .format("format")
 * // the properties below are optional
 * .localeCode("localeCode")
 * .timezoneOffset("timezoneOffset")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html)
 */
@CdkDslMarker
public class CfnDatasetDatetimeOptionsPropertyDsl {
  private val cdkBuilder: CfnDataset.DatetimeOptionsProperty.Builder =
      CfnDataset.DatetimeOptionsProperty.builder()

  /**
   * @param format Required option, that defines the datetime format used for a date parameter in
   * the Amazon S3 path. 
   * Should use only supported datetime specifiers and separation characters, all litera a-z or A-Z
   * character should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  /**
   * @param localeCode Optional value for a non-US locale code, needed for correct interpretation of
   * some date formats.
   */
  public fun localeCode(localeCode: String) {
    cdkBuilder.localeCode(localeCode)
  }

  /**
   * @param timezoneOffset Optional value for a timezone offset of the datetime parameter value in
   * the Amazon S3 path.
   * Shouldn't be used if Format for this parameter includes timezone fields. If no offset
   * specified, UTC is assumed.
   */
  public fun timezoneOffset(timezoneOffset: String) {
    cdkBuilder.timezoneOffset(timezoneOffset)
  }

  public fun build(): CfnDataset.DatetimeOptionsProperty = cdkBuilder.build()
}
