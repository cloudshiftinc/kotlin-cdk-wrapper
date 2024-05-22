@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct

/**
 * Represents an Aspect.
 */
public interface IAspect {
  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public fun visit(node: IConstruct)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IAspect,
  ) : CdkObject(cdkObject), IAspect {
    /**
     * All aspects can visit an IConstruct.
     *
     * @param node 
     */
    override fun visit(node: IConstruct) {
      unwrap(this).visit(node.let(IConstruct.Companion::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAspect): IAspect =
        CdkObjectWrappers.wrap(cdkObject) as? IAspect ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAspect): software.amazon.awscdk.IAspect = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAspect
  }
}
