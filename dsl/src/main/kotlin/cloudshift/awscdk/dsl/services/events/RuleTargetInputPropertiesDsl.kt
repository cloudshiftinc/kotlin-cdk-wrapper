@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.events.RuleTargetInputProperties

@CdkDslMarker
public class RuleTargetInputPropertiesDsl {
  private val cdkBuilder: RuleTargetInputProperties.Builder = RuleTargetInputProperties.builder()

  /**
   * @param input Literal input to the target service (must be valid JSON).
   */
  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  /**
   * @param inputPath JsonPath to take input from the input event.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param inputPathsMap Paths map to extract values from event and insert into `inputTemplate`.
   */
  public fun inputPathsMap(inputPathsMap: Map<String, String>) {
    cdkBuilder.inputPathsMap(inputPathsMap)
  }

  /**
   * @param inputTemplate Input template to insert paths map into.
   */
  public fun inputTemplate(inputTemplate: String) {
    cdkBuilder.inputTemplate(inputTemplate)
  }

  public fun build(): RuleTargetInputProperties = cdkBuilder.build()
}
