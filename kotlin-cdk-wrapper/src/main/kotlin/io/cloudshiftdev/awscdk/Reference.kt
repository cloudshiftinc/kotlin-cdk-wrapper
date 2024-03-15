@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String

/**
 * An intrinsic Token that represents a reference to a construct.
 *
 * References are recorded.
 */
public abstract class Reference internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Reference,
) : Intrinsic(cdkObject) {
  /**
   *
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   *
   */
  public open fun target(): IConstruct = unwrap(this).getTarget().let(IConstruct::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.Reference,
  ) : Reference(cdkObject)

  public companion object {
    public fun isReference(x: Any): Boolean = software.amazon.awscdk.Reference.isReference(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.Reference): Reference = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Reference): software.amazon.awscdk.Reference = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Reference
  }
}
