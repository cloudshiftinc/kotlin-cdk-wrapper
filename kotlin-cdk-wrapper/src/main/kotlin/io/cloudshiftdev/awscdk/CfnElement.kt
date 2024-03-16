@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * An element of a CloudFormation stack.
 */
public abstract class CfnElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnElement,
) : Construct(cdkObject) {
  /**
   * @return the stack trace of the point where this Resource was created from, sourced
   * from the +metadata+ entry typed +aws:cdk:logicalId+, and with the bottom-most
   * node +internal+ entries filtered.
   */
  public open fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * The logical ID for this CloudFormation stack element.
   *
   * The logical ID of the element
   * is calculated from the path of the resource node in the construct tree.
   *
   * To override this value, use `overrideLogicalId(newLogicalId)`.
   *
   * @return the logical ID as a stringified token. This value will only get
   * resolved during synthesis.
   */
  public open fun logicalId(): String = unwrap(this).getLogicalId()

  /**
   * Overrides the auto-generated logical ID with a specific ID.
   *
   * @param newLogicalId The new logical ID to use for this stack element. 
   */
  public open fun overrideLogicalId(newLogicalId: String) {
    unwrap(this).overrideLogicalId(newLogicalId)
  }

  /**
   * The stack in which this element is defined.
   *
   * CfnElements must be defined within a stack scope (directly or indirectly).
   */
  public open fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  public companion object {
    public fun isCfnElement(x: Any): Boolean = software.amazon.awscdk.CfnElement.isCfnElement(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnElement): CfnElement =
        CdkObjectWrappers.wrap(cdkObject) as CfnElement

    internal fun unwrap(wrapped: CfnElement): software.amazon.awscdk.CfnElement = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnElement
  }
}
