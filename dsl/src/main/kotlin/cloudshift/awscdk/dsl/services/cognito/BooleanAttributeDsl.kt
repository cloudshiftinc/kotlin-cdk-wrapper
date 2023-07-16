@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.BooleanAttribute

@CdkDslMarker
public class BooleanAttributeDsl {
  private val cdkBuilder: BooleanAttribute.Builder = BooleanAttribute.Builder.create()

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): BooleanAttribute = cdkBuilder.build()
}
