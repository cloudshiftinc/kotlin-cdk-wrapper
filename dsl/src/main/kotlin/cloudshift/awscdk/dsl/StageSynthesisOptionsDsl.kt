@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.StageSynthesisOptions

@CdkDslMarker
public class StageSynthesisOptionsDsl {
  private val cdkBuilder: StageSynthesisOptions.Builder = StageSynthesisOptions.builder()

  /**
   * @param force Force a re-synth, even if the stage has already been synthesized.
   * This is used by tests to allow for incremental verification of the output.
   * Do not use in production.
   */
  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  /**
   * @param skipValidation Should we skip construct validation.
   */
  public fun skipValidation(skipValidation: Boolean) {
    cdkBuilder.skipValidation(skipValidation)
  }

  /**
   * @param validateOnSynthesis Whether the stack should be validated after synthesis to check for
   * error metadata.
   */
  public fun validateOnSynthesis(validateOnSynthesis: Boolean) {
    cdkBuilder.validateOnSynthesis(validateOnSynthesis)
  }

  public fun build(): StageSynthesisOptions = cdkBuilder.build()
}
