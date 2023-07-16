@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.ITokenResolver
import software.amazon.awscdk.ResolveOptions
import software.constructs.IConstruct

@CdkDslMarker
public class ResolveOptionsDsl {
  private val cdkBuilder: ResolveOptions.Builder = ResolveOptions.builder()

  public fun preparing(preparing: Boolean) {
    cdkBuilder.preparing(preparing)
  }

  public fun removeEmpty(removeEmpty: Boolean) {
    cdkBuilder.removeEmpty(removeEmpty)
  }

  public fun resolver(resolver: ITokenResolver) {
    cdkBuilder.resolver(resolver)
  }

  public fun scope(scope: IConstruct) {
    cdkBuilder.scope(scope)
  }

  public fun build(): ResolveOptions = cdkBuilder.build()
}
