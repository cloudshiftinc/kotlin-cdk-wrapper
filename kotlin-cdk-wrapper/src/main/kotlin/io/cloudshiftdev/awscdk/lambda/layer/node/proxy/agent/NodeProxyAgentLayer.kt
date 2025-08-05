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
public open class NodeProxyAgentLayer(
  cdkObject: software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer,
) : LayerVersion(cdkObject) {
  public constructor(scope: Construct, id: String) :
      this(software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer(scope.let(Construct.Companion::unwrap),
      id)
  )

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer.PROPERTY_INJECTION_ID

    internal
        fun wrap(cdkObject: software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer):
        NodeProxyAgentLayer = NodeProxyAgentLayer(cdkObject)

    internal fun unwrap(wrapped: NodeProxyAgentLayer):
        software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer = wrapped.cdkObject
        as software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer
  }
}
