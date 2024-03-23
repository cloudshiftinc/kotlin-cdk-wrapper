@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.lambdalayer.kubectl

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * An AWS Lambda layer that includes `kubectl` and `helm`.
 *
 * Example:
 *
 * ```
 * // KubectlLayer bundles the 'kubectl' and 'helm' command lines
 * import io.cloudshiftdev.awscdk.lambdalayer.kubectl.KubectlLayer;
 * Function fn;
 * fn.addLayers(new KubectlLayer(this, "KubectlLayer"));
 * ```
 */
public open class KubectlLayer(
  cdkObject: software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer,
) : LayerVersion(cdkObject) {
  public constructor(scope: Construct, id: String) :
      this(software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer(scope.let(Construct::unwrap), id)
  )

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer):
        KubectlLayer = KubectlLayer(cdkObject)

    internal fun unwrap(wrapped: KubectlLayer):
        software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer = wrapped.cdkObject as
        software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer
  }
}
