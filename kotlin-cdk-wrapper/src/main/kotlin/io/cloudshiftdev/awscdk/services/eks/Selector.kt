@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Fargate profile selector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * Selector selector = Selector.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .build();
 * ```
 */
public interface Selector {
  /**
   * The Kubernetes labels that the selector should match.
   *
   * A pod must contain
   * all of the labels that are specified in the selector for it to be
   * considered a match.
   *
   * Default: - all pods within the namespace will be selected.
   */
  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  /**
   * The Kubernetes namespace that the selector should match.
   *
   * You must specify a namespace for a selector. The selector only matches pods
   * that are created in this namespace, but you can create multiple selectors
   * to target multiple namespaces.
   */
  public fun namespace(): String

  /**
   * A builder for [Selector]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param labels The Kubernetes labels that the selector should match.
     * A pod must contain
     * all of the labels that are specified in the selector for it to be
     * considered a match.
     */
    public fun labels(labels: Map<String, String>)

    /**
     * @param namespace The Kubernetes namespace that the selector should match. 
     * You must specify a namespace for a selector. The selector only matches pods
     * that are created in this namespace, but you can create multiple selectors
     * to target multiple namespaces.
     */
    public fun namespace(namespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Selector.Builder =
        software.amazon.awscdk.services.eks.Selector.builder()

    /**
     * @param labels The Kubernetes labels that the selector should match.
     * A pod must contain
     * all of the labels that are specified in the selector for it to be
     * considered a match.
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param namespace The Kubernetes namespace that the selector should match. 
     * You must specify a namespace for a selector. The selector only matches pods
     * that are created in this namespace, but you can create multiple selectors
     * to target multiple namespaces.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.Selector = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.Selector,
  ) : CdkObject(cdkObject), Selector {
    /**
     * The Kubernetes labels that the selector should match.
     *
     * A pod must contain
     * all of the labels that are specified in the selector for it to be
     * considered a match.
     *
     * Default: - all pods within the namespace will be selected.
     */
    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    /**
     * The Kubernetes namespace that the selector should match.
     *
     * You must specify a namespace for a selector. The selector only matches pods
     * that are created in this namespace, but you can create multiple selectors
     * to target multiple namespaces.
     */
    override fun namespace(): String = unwrap(this).getNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Selector {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Selector): Selector =
        CdkObjectWrappers.wrap(cdkObject) as? Selector ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Selector): software.amazon.awscdk.services.eks.Selector = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.eks.Selector
  }
}
