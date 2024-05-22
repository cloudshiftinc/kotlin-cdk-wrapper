@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface for examining a construct and exposing metadata.
 */
public interface IInspectable {
  /**
   * Examines construct.
   *
   * @param inspector * tree inspector to collect and process attributes. 
   */
  public fun inspect(inspector: TreeInspector)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IInspectable,
  ) : CdkObject(cdkObject), IInspectable {
    /**
     * Examines construct.
     *
     * @param inspector * tree inspector to collect and process attributes. 
     */
    override fun inspect(inspector: TreeInspector) {
      unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IInspectable): IInspectable =
        CdkObjectWrappers.wrap(cdkObject) as? IInspectable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInspectable): software.amazon.awscdk.IInspectable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IInspectable
  }
}
