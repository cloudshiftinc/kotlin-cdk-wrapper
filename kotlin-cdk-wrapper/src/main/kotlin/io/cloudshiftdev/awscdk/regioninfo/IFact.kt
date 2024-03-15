@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IFact {
  public fun name(): String

  public fun region(): String

  public fun `value`(): String? = unwrap(this).getValue()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.regioninfo.IFact,
  ) : CdkObject(cdkObject), IFact {
    override fun name(): String = unwrap(this).getName()

    override fun region(): String = unwrap(this).getRegion()

    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.IFact): IFact =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFact): software.amazon.awscdk.regioninfo.IFact = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.regioninfo.IFact
  }
}
