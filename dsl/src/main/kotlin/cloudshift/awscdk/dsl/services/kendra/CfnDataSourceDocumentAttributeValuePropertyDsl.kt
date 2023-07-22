@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * The value of a document attribute.
 *
 * You can only provide one value for a document attribute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DocumentAttributeValueProperty documentAttributeValueProperty =
 * DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html)
 */
@CdkDslMarker
public class CfnDataSourceDocumentAttributeValuePropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentAttributeValueProperty.Builder =
      CfnDataSource.DocumentAttributeValueProperty.builder()

  private val _stringListValue: MutableList<String> = mutableListOf()

  /**
   * @param dateValue A date expressed as an ISO 8601 string.
   * It is important for the time zone to be included in the ISO 8601 date-time format. For example,
   * 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at 12:30PM (plus 10
   * seconds) in Central European Time.
   */
  public fun dateValue(dateValue: String) {
    cdkBuilder.dateValue(dateValue)
  }

  /**
   * @param longValue A long integer value.
   */
  public fun longValue(longValue: Number) {
    cdkBuilder.longValue(longValue)
  }

  /**
   * @param stringListValue A list of strings.
   * The default maximum length or number of strings is 10.
   */
  public fun stringListValue(vararg stringListValue: String) {
    _stringListValue.addAll(listOf(*stringListValue))
  }

  /**
   * @param stringListValue A list of strings.
   * The default maximum length or number of strings is 10.
   */
  public fun stringListValue(stringListValue: Collection<String>) {
    _stringListValue.addAll(stringListValue)
  }

  /**
   * @param stringValue A string, such as "department".
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnDataSource.DocumentAttributeValueProperty {
    if(_stringListValue.isNotEmpty()) cdkBuilder.stringListValue(_stringListValue)
    return cdkBuilder.build()
  }
}
