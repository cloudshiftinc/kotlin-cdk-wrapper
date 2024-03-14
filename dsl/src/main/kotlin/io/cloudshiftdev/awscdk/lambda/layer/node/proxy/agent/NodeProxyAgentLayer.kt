package io.cloudshiftdev.awscdk.lambda.layer.node.proxy.agent

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion

public open class NodeProxyAgentLayer internal constructor(
  private val cdkObject: software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer,
) : LayerVersion(cdkObject) {
  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer):
        NodeProxyAgentLayer = NodeProxyAgentLayer(cdkObject)

    internal fun unwrap(wrapped: NodeProxyAgentLayer):
        software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer = wrapped.cdkObject
  }
}
