package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationContextBeta1 {
  /**
   * The absolute path of all templates to be processed.
   */
  public fun templatePaths(): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1,
  ) : CdkObject(cdkObject), IPolicyValidationContextBeta1 {
    /**
     * The absolute path of all templates to be processed.
     */
    override fun templatePaths(): List<String> = unwrap(this).getTemplatePaths()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1):
        IPolicyValidationContextBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationContextBeta1):
        software.amazon.awscdk.IPolicyValidationContextBeta1 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IPolicyValidationContextBeta1
  }
}
