@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class NodeType(
  private val cdkObject: software.amazon.awscdk.services.eks.NodeType,
) {
  STANDARD(software.amazon.awscdk.services.eks.NodeType.STANDARD),
  GPU(software.amazon.awscdk.services.eks.NodeType.GPU),
  INFERENTIA(software.amazon.awscdk.services.eks.NodeType.INFERENTIA),
  TRAINIUM(software.amazon.awscdk.services.eks.NodeType.TRAINIUM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodeType): NodeType = when
        (cdkObject) {
      software.amazon.awscdk.services.eks.NodeType.STANDARD -> NodeType.STANDARD
      software.amazon.awscdk.services.eks.NodeType.GPU -> NodeType.GPU
      software.amazon.awscdk.services.eks.NodeType.INFERENTIA -> NodeType.INFERENTIA
      software.amazon.awscdk.services.eks.NodeType.TRAINIUM -> NodeType.TRAINIUM
    }

    internal fun unwrap(wrapped: NodeType): software.amazon.awscdk.services.eks.NodeType =
        wrapped.cdkObject
  }
}
