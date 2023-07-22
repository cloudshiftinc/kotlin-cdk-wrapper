@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.ITokenResolver
import software.amazon.awscdk.ResolveOptions
import software.constructs.IConstruct

/**
 * Options to the resolve() operation.
 *
 * NOT the same as the ResolveContext; ResolveContext is exposed to Token
 * implementors and resolution hooks, whereas this struct is just to bundle
 * a number of things that would otherwise be arguments to resolve() in a
 * readable way.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.constructs.*;
 * Construct construct;
 * ITokenResolver tokenResolver;
 * ResolveOptions resolveOptions = ResolveOptions.builder()
 * .resolver(tokenResolver)
 * .scope(construct)
 * // the properties below are optional
 * .preparing(false)
 * .removeEmpty(false)
 * .build();
 * ```
 */
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
