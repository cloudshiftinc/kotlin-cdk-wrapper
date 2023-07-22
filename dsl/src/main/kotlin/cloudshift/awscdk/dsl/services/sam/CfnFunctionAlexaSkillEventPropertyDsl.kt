@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * AlexaSkillEventProperty alexaSkillEventProperty = AlexaSkillEventProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html)
 */
@CdkDslMarker
public class CfnFunctionAlexaSkillEventPropertyDsl {
  private val cdkBuilder: CfnFunction.AlexaSkillEventProperty.Builder =
      CfnFunction.AlexaSkillEventProperty.builder()

  /**
   * @param variables the value to be set.
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param variables the value to be set.
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunction.AlexaSkillEventProperty = cdkBuilder.build()
}
