@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Context available to the validation plugin.
 */
public interface IPolicyValidationContextBeta1 {
  /**
   * The absolute path of all templates to be processed.
   */
  public fun templatePaths(): List<String>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1,
  ) : CdkObject(cdkObject), IPolicyValidationContextBeta1 {
    /**
     * The absolute path of all templates to be processed.
     */
    override fun templatePaths(): List<String> = unwrap(this).getTemplatePaths()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1):
        IPolicyValidationContextBeta1 = CdkObjectWrappers.wrap(cdkObject) as?
        IPolicyValidationContextBeta1 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationContextBeta1):
        software.amazon.awscdk.IPolicyValidationContextBeta1 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IPolicyValidationContextBeta1
  }
}
