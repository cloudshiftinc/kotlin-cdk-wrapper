@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application LogPatternSet` property type specifies the log pattern
 * set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * LogPatternSetProperty logPatternSetProperty = LogPatternSetProperty.builder()
 * .logPatterns(List.of(LogPatternProperty.builder()
 * .pattern("pattern")
 * .patternName("patternName")
 * .rank(123)
 * .build()))
 * .patternSetName("patternSetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html)
 */
@CdkDslMarker
public class CfnApplicationLogPatternSetPropertyDsl {
  private val cdkBuilder: CfnApplication.LogPatternSetProperty.Builder =
      CfnApplication.LogPatternSetProperty.builder()

  private val _logPatterns: MutableList<Any> = mutableListOf()

  /**
   * @param logPatterns A list of objects that define the log patterns that belong to
   * `LogPatternSet` . 
   */
  public fun logPatterns(vararg logPatterns: Any) {
    _logPatterns.addAll(listOf(*logPatterns))
  }

  /**
   * @param logPatterns A list of objects that define the log patterns that belong to
   * `LogPatternSet` . 
   */
  public fun logPatterns(logPatterns: Collection<Any>) {
    _logPatterns.addAll(logPatterns)
  }

  /**
   * @param logPatterns A list of objects that define the log patterns that belong to
   * `LogPatternSet` . 
   */
  public fun logPatterns(logPatterns: IResolvable) {
    cdkBuilder.logPatterns(logPatterns)
  }

  /**
   * @param patternSetName The name of the log pattern. 
   * A log pattern name can contain up to 30 characters, and it cannot be empty. The characters can
   * be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
   */
  public fun patternSetName(patternSetName: String) {
    cdkBuilder.patternSetName(patternSetName)
  }

  public fun build(): CfnApplication.LogPatternSetProperty {
    if(_logPatterns.isNotEmpty()) cdkBuilder.logPatterns(_logPatterns)
    return cdkBuilder.build()
  }
}
