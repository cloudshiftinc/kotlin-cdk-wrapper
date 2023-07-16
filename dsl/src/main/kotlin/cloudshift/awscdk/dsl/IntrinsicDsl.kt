@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.ResolutionTypeHint

@CdkDslMarker
public class IntrinsicDsl(
  arg0: Any,
) {
  private val cdkBuilder: Intrinsic.Builder = Intrinsic.Builder.create(arg0)

  public fun stackTrace(stackTrace: Boolean) {
    cdkBuilder.stackTrace(stackTrace)
  }

  public fun typeHint(typeHint: ResolutionTypeHint) {
    cdkBuilder.typeHint(typeHint)
  }

  public fun build(): Intrinsic = cdkBuilder.build()
}
