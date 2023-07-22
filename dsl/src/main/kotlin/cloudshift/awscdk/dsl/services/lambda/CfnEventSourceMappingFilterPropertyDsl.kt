@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * A structure within a `FilterCriteria` object that defines an event filtering pattern.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .pattern("pattern")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filter.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingFilterPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.FilterProperty.Builder =
      CfnEventSourceMapping.FilterProperty.builder()

  /**
   * @param pattern A filter pattern.
   * For more information on the syntax of a filter pattern, see [Filter rule
   * syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax)
   * .
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnEventSourceMapping.FilterProperty = cdkBuilder.build()
}
