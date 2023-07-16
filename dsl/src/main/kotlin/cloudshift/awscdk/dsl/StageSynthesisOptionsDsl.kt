@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.StageSynthesisOptions

@CdkDslMarker
public class StageSynthesisOptionsDsl {
  private val cdkBuilder: StageSynthesisOptions.Builder = StageSynthesisOptions.builder()

  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  public fun skipValidation(skipValidation: Boolean) {
    cdkBuilder.skipValidation(skipValidation)
  }

  public fun validateOnSynthesis(validateOnSynthesis: Boolean) {
    cdkBuilder.validateOnSynthesis(validateOnSynthesis)
  }

  public fun build(): StageSynthesisOptions = cdkBuilder.build()
}
