@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ChoiceProps

@CdkDslMarker
public class ChoicePropsDsl {
  private val cdkBuilder: ChoiceProps.Builder = ChoiceProps.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun build(): ChoiceProps = cdkBuilder.build()
}
