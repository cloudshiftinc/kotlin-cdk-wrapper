@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class CfnElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnElement,
) : Construct(cdkObject) {
  public open fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public open fun logicalId(): String = unwrap(this).getLogicalId()

  public open fun overrideLogicalId(newLogicalId: String) {
    unwrap(this).overrideLogicalId(newLogicalId)
  }

  public open fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnElement,
  ) : CfnElement(cdkObject)

  public companion object {
    public fun isCfnElement(x: Any): Boolean = software.amazon.awscdk.CfnElement.isCfnElement(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnElement): CfnElement = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnElement): software.amazon.awscdk.CfnElement = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnElement
  }
}
