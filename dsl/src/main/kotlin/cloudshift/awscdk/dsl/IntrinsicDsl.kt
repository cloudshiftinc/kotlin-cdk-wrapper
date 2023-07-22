@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.ResolutionTypeHint

@CdkDslMarker
public class IntrinsicDsl(
  `value`: Any,
) {
  private val cdkBuilder: Intrinsic.Builder = Intrinsic.Builder.create(value)

  /**
   * Capture the stack trace of where this token is created.
   *
   * Default: true
   *
   * @param stackTrace Capture the stack trace of where this token is created. 
   */
  public fun stackTrace(stackTrace: Boolean) {
    cdkBuilder.stackTrace(stackTrace)
  }

  /**
   * Type that this token is expected to evaluate to.
   *
   * Default: ResolutionTypeHint.STRING
   *
   * @param typeHint Type that this token is expected to evaluate to. 
   */
  public fun typeHint(typeHint: ResolutionTypeHint) {
    cdkBuilder.typeHint(typeHint)
  }

  public fun build(): Intrinsic = cdkBuilder.build()
}
