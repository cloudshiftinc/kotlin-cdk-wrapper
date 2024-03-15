@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class CfnRefElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnRefElement,
) : CfnElement(cdkObject) {
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
