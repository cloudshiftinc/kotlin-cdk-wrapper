@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A filter that filters topics based on the value of a numeric field.
 *
 * The filter includes only topics whose numeric field value matches the specified value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicNumericEqualityFilterProperty topicNumericEqualityFilterProperty =
 * TopicNumericEqualityFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html)
 */
@CdkDslMarker
public class CfnTopicTopicNumericEqualityFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicNumericEqualityFilterProperty.Builder =
      CfnTopic.TopicNumericEqualityFilterProperty.builder()

  /**
   * @param aggregation An aggregation function that specifies how to calculate the value of a
   * numeric field for a topic.
   * Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
   * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
   */
  public fun aggregation(aggregation: String) {
    cdkBuilder.aggregation(aggregation)
  }

  /**
   * @param constant The constant used in a numeric equality filter.
   */
  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param constant The constant used in a numeric equality filter.
   */
  public fun constant(constant: CfnTopic.TopicSingularFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  public fun build(): CfnTopic.TopicNumericEqualityFilterProperty = cdkBuilder.build()
}
