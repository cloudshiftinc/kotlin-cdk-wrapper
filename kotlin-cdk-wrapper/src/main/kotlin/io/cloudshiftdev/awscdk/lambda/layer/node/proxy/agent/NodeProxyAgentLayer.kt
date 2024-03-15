@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.lambda.layer.node.proxy.agent

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * An AWS Lambda layer that includes the NPM dependency `proxy-agent`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * fn.addLayers(new NodeProxyAgentLayer(this, "NodeProxyAgentLayer"));
 * ```
 */
public open class NodeProxyAgentLayer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer,
) : LayerVersion(cdkObject) {
  public constructor(scope: Construct, id: String) :
      this(software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer(scope.let(Construct::unwrap),
      id)
  )

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer):
        NodeProxyAgentLayer = NodeProxyAgentLayer(cdkObject)

    internal fun unwrap(wrapped: NodeProxyAgentLayer):
        software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer = wrapped.cdkObject
  }
}
