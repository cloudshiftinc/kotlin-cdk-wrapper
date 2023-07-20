@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.NumberAttribute

@CdkDslMarker
public class NumberAttributeDsl {
  private val cdkBuilder: NumberAttribute.Builder = NumberAttribute.Builder.create()

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): NumberAttribute = cdkBuilder.build()
}
