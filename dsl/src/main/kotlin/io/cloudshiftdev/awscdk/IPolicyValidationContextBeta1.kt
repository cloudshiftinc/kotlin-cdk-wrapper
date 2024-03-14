package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationContextBeta1 {
  public fun templatePaths(): List<String>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1,
  ) : IPolicyValidationContextBeta1 {
    public override fun templatePaths(): List<String> = unwrap(this).getTemplatePaths() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1):
        IPolicyValidationContextBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationContextBeta1):
        software.amazon.awscdk.IPolicyValidationContextBeta1 = (wrapped as Wrapper).cdkObject
  }
}
