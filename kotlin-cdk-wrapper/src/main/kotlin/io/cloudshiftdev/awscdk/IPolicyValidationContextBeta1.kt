@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationContextBeta1 {
  public fun templatePaths(): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IPolicyValidationContextBeta1,
  ) : CdkObject(cdkObject), IPolicyValidationContextBeta1 {
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
