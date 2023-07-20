@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IntrinsicProps
import software.amazon.awscdk.ResolutionTypeHint

@CdkDslMarker
public class IntrinsicPropsDsl {
  private val cdkBuilder: IntrinsicProps.Builder = IntrinsicProps.builder()

  public fun stackTrace(stackTrace: Boolean) {
    cdkBuilder.stackTrace(stackTrace)
  }

  public fun typeHint(typeHint: ResolutionTypeHint) {
    cdkBuilder.typeHint(typeHint)
  }

  public fun build(): IntrinsicProps = cdkBuilder.build()
}
