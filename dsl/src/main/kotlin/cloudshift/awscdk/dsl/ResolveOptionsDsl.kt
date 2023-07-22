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

  /**
   * @param preparing Whether the resolution is being executed during the prepare phase or not.
   */
  public fun preparing(preparing: Boolean) {
    cdkBuilder.preparing(preparing)
  }

  /**
   * @param removeEmpty Whether to remove undefined elements from arrays and objects when resolving.
   */
  public fun removeEmpty(removeEmpty: Boolean) {
    cdkBuilder.removeEmpty(removeEmpty)
  }

  /**
   * @param resolver The resolver to apply to any resolvable tokens found. 
   */
  public fun resolver(resolver: ITokenResolver) {
    cdkBuilder.resolver(resolver)
  }

  /**
   * @param scope The scope from which resolution is performed. 
   */
  public fun scope(scope: IConstruct) {
    cdkBuilder.scope(scope)
  }

  public fun build(): ResolveOptions = cdkBuilder.build()
}
