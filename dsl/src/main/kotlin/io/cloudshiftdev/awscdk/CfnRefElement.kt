package io.cloudshiftdev.awscdk

import kotlin.String

public abstract class CfnRefElement internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnRefElement,
) : CfnElement(cdkObject) {
  public open fun ref(): String = unwrap(this).getRef()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnRefElement,
  ) : CfnRefElement(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRefElement): CfnRefElement =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRefElement): software.amazon.awscdk.CfnRefElement = (wrapped as
        Wrapper).cdkObject
  }
}
