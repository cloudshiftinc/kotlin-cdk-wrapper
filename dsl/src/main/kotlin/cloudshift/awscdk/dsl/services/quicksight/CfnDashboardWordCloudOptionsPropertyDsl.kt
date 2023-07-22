@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The word cloud options for a word cloud visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WordCloudOptionsProperty wordCloudOptionsProperty = WordCloudOptionsProperty.builder()
 * .cloudLayout("cloudLayout")
 * .maximumStringLength(123)
 * .wordCasing("wordCasing")
 * .wordOrientation("wordOrientation")
 * .wordPadding("wordPadding")
 * .wordScaling("wordScaling")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-wordcloudoptions.html)
 */
@CdkDslMarker
public class CfnDashboardWordCloudOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.WordCloudOptionsProperty.Builder =
      CfnDashboard.WordCloudOptionsProperty.builder()

  /**
   * @param cloudLayout The cloud layout options (fluid, normal) of a word cloud.
   */
  public fun cloudLayout(cloudLayout: String) {
    cdkBuilder.cloudLayout(cloudLayout)
  }

  /**
   * @param maximumStringLength The length limit of each word from 1-100.
   */
  public fun maximumStringLength(maximumStringLength: Number) {
    cdkBuilder.maximumStringLength(maximumStringLength)
  }

  /**
   * @param wordCasing The word casing options (lower_case, existing_case) for the words in a word
   * cloud.
   */
  public fun wordCasing(wordCasing: String) {
    cdkBuilder.wordCasing(wordCasing)
  }

  /**
   * @param wordOrientation The word orientation options (horizontal, horizontal_and_vertical) for
   * the words in a word cloud.
   */
  public fun wordOrientation(wordOrientation: String) {
    cdkBuilder.wordOrientation(wordOrientation)
  }

  /**
   * @param wordPadding The word padding options (none, small, medium, large) for the words in a
   * word cloud.
   */
  public fun wordPadding(wordPadding: String) {
    cdkBuilder.wordPadding(wordPadding)
  }

  /**
   * @param wordScaling The word scaling options (emphasize, normal) for the words in a word cloud.
   */
  public fun wordScaling(wordScaling: String) {
    cdkBuilder.wordScaling(wordScaling)
  }

  public fun build(): CfnDashboard.WordCloudOptionsProperty = cdkBuilder.build()
}
