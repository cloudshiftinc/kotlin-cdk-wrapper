@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.events.RuleTargetInputProperties

@CdkDslMarker
public class RuleTargetInputPropertiesDsl {
  private val cdkBuilder: RuleTargetInputProperties.Builder = RuleTargetInputProperties.builder()

  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun inputPathsMap(inputPathsMap: Map<String, String>) {
    cdkBuilder.inputPathsMap(inputPathsMap)
  }

  public fun inputTemplate(inputTemplate: String) {
    cdkBuilder.inputTemplate(inputTemplate)
  }

  public fun build(): RuleTargetInputProperties = cdkBuilder.build()
}
