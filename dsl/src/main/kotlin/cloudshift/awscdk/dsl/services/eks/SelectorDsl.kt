@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.Selector

/**
 * Fargate profile selector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * Selector selector = Selector.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .build();
 * ```
 */
@CdkDslMarker
public class SelectorDsl {
  private val cdkBuilder: Selector.Builder = Selector.builder()

  /**
   * @param labels The Kubernetes labels that the selector should match.
   * A pod must contain
   * all of the labels that are specified in the selector for it to be
   * considered a match.
   */
  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param namespace The Kubernetes namespace that the selector should match. 
   * You must specify a namespace for a selector. The selector only matches pods
   * that are created in this namespace, but you can create multiple selectors
   * to target multiple namespaces.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): Selector = cdkBuilder.build()
}
