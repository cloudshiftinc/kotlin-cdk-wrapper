@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.StringAttribute

@CdkDslMarker
public class StringAttributeDsl {
  private val cdkBuilder: StringAttribute.Builder = StringAttribute.Builder.create()

  public fun maxLen(maxLen: Number) {
    cdkBuilder.maxLen(maxLen)
  }

  public fun minLen(minLen: Number) {
    cdkBuilder.minLen(minLen)
  }

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): StringAttribute = cdkBuilder.build()
}
