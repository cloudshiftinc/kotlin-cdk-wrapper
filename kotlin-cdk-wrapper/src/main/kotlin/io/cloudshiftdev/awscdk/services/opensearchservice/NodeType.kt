@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

public enum class NodeType(
  private val cdkObject: software.amazon.awscdk.services.opensearchservice.NodeType,
) {
  COORDINATOR(software.amazon.awscdk.services.opensearchservice.NodeType.COORDINATOR),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.NodeType):
        NodeType = when (cdkObject) {
      software.amazon.awscdk.services.opensearchservice.NodeType.COORDINATOR -> NodeType.COORDINATOR
    }

    internal fun unwrap(wrapped: NodeType):
        software.amazon.awscdk.services.opensearchservice.NodeType = wrapped.cdkObject
  }
}
