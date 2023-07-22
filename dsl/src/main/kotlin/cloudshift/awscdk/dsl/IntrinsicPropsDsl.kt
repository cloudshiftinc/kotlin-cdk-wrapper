@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IntrinsicProps
import software.amazon.awscdk.ResolutionTypeHint

/**
 * Customization properties for an Intrinsic token.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * IntrinsicProps intrinsicProps = IntrinsicProps.builder()
 * .stackTrace(false)
 * .typeHint(ResolutionTypeHint.STRING)
 * .build();
 * ```
 */
@CdkDslMarker
public class IntrinsicPropsDsl {
  private val cdkBuilder: IntrinsicProps.Builder = IntrinsicProps.builder()

  /**
   * @param stackTrace Capture the stack trace of where this token is created.
   */
  public fun stackTrace(stackTrace: Boolean) {
    cdkBuilder.stackTrace(stackTrace)
  }

  /**
   * @param typeHint Type that this token is expected to evaluate to.
   */
  public fun typeHint(typeHint: ResolutionTypeHint) {
    cdkBuilder.typeHint(typeHint)
  }

  public fun build(): IntrinsicProps = cdkBuilder.build()
}
