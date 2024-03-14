package io.cloudshiftdev.constructs

public enum class ConstructOrder(
  private val cdkObject: software.constructs.ConstructOrder,
) {
  PREORDER(software.constructs.ConstructOrder.PREORDER),
  POSTORDER(software.constructs.ConstructOrder.POSTORDER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.constructs.ConstructOrder): ConstructOrder = when
        (cdkObject) {
      software.constructs.ConstructOrder.PREORDER -> ConstructOrder.PREORDER
      software.constructs.ConstructOrder.POSTORDER -> ConstructOrder.POSTORDER
    }

    internal fun unwrap(wrapped: ConstructOrder): software.constructs.ConstructOrder =
        wrapped.cdkObject
  }
}
