@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a negative format.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NegativeFormatProperty negativeFormatProperty = NegativeFormatProperty.builder()
 * .prefix("prefix")
 * .suffix("suffix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html)
 */
@CdkDslMarker
public class CfnTopicNegativeFormatPropertyDsl {
  private val cdkBuilder: CfnTopic.NegativeFormatProperty.Builder =
      CfnTopic.NegativeFormatProperty.builder()

  /**
   * @param prefix The prefix for a negative format.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param suffix The suffix for a negative format.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnTopic.NegativeFormatProperty = cdkBuilder.build()
}
