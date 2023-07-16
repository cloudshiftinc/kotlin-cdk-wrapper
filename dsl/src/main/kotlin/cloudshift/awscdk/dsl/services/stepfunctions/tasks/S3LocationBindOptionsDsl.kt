@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions

@CdkDslMarker
public class S3LocationBindOptionsDsl {
  private val cdkBuilder: S3LocationBindOptions.Builder = S3LocationBindOptions.builder()

  public fun forReading(forReading: Boolean) {
    cdkBuilder.forReading(forReading)
  }

  public fun forWriting(forWriting: Boolean) {
    cdkBuilder.forWriting(forWriting)
  }

  public fun build(): S3LocationBindOptions = cdkBuilder.build()
}
