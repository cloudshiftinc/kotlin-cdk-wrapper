@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A fact that can be registered about a particular region.
 */
public interface IFact {
  /**
   * The name of this fact.
   *
   * Standardized values are provided by the `Facts` class.
   */
  public fun name(): String

  /**
   * The region for which this fact applies.
   */
  public fun region(): String

  /**
   * The value of this fact.
   */
  public fun `value`(): String? = unwrap(this).getValue()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.regioninfo.IFact,
  ) : CdkObject(cdkObject), IFact {
    /**
     * The name of this fact.
     *
     * Standardized values are provided by the `Facts` class.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The region for which this fact applies.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * The value of this fact.
     */
    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.IFact): IFact =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFact): software.amazon.awscdk.regioninfo.IFact = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.regioninfo.IFact
  }
}
