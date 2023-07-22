@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application LogPattern` property type specifies an object that
 * defines the log patterns that belong to a `LogPatternSet` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * LogPatternProperty logPatternProperty = LogPatternProperty.builder()
 * .pattern("pattern")
 * .patternName("patternName")
 * .rank(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html)
 */
@CdkDslMarker
public class CfnApplicationLogPatternPropertyDsl {
  private val cdkBuilder: CfnApplication.LogPatternProperty.Builder =
      CfnApplication.LogPatternProperty.builder()

  /**
   * @param pattern A regular expression that defines the log pattern. 
   * A log pattern can contain up to 50 characters, and it cannot be empty.
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  /**
   * @param patternName The name of the log pattern. 
   * A log pattern name can contain up to 50 characters, and it cannot be empty. The characters can
   * be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
   */
  public fun patternName(patternName: String) {
    cdkBuilder.patternName(patternName)
  }

  /**
   * @param rank The rank of the log pattern. 
   */
  public fun rank(rank: Number) {
    cdkBuilder.rank(rank)
  }

  public fun build(): CfnApplication.LogPatternProperty = cdkBuilder.build()
}
