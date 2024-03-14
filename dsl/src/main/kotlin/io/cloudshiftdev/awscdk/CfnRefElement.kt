package io.cloudshiftdev.awscdk

import kotlin.String

public abstract class CfnRefElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnRefElement,
) : CfnElement(cdkObject) {
  /**
   * Return a string that will be resolved to a CloudFormation `{ Ref }` for this element.
   *
   * If, by any chance, the intrinsic reference of a resource is not a string, you could
   * coerce it to an IResolvable through `Lazy.any({ produce: resource.ref })`.
   */
  public open fun ref(): String = unwrap(this).getRef()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnRefElement,
  ) : CfnRefElement(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRefElement): CfnRefElement =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRefElement): software.amazon.awscdk.CfnRefElement = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnRefElement
  }
}
