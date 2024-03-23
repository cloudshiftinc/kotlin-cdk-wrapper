@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node

/**
 * Interface for triggers.
 */
public interface ITrigger : IConstruct {
  /**
   * Adds trigger dependencies.
   *
   * Execute this trigger only after these construct
   * scopes have been provisioned.
   *
   * @param scopes A list of construct scopes which this trigger will depend on. 
   */
  public fun executeAfter(vararg scopes: Construct)

  /**
   * Adds this trigger as a dependency on other constructs.
   *
   * This means that this
   * trigger will get executed *before* the given construct(s).
   *
   * @param scopes A list of construct scopes which will take a dependency on this trigger. 
   */
  public fun executeBefore(vararg scopes: Construct)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.triggers.ITrigger,
  ) : CdkObject(cdkObject), ITrigger {
    /**
     * Adds trigger dependencies.
     *
     * Execute this trigger only after these construct
     * scopes have been provisioned.
     *
     * @param scopes A list of construct scopes which this trigger will depend on. 
     */
    override fun executeAfter(vararg scopes: Construct) {
      unwrap(this).executeAfter(*scopes.map(Construct::unwrap).toTypedArray())
    }

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * @param scopes A list of construct scopes which will take a dependency on this trigger. 
     */
    override fun executeBefore(vararg scopes: Construct) {
      unwrap(this).executeBefore(*scopes.map(Construct::unwrap).toTypedArray())
    }

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.ITrigger): ITrigger =
        CdkObjectWrappers.wrap(cdkObject) as? ITrigger ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITrigger): software.amazon.awscdk.triggers.ITrigger = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.triggers.ITrigger
  }
}
