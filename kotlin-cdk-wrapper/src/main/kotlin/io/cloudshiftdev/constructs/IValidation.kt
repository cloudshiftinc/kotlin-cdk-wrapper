@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

public interface IValidation {
  public fun validate(): List<String>

  private class Wrapper(
    override val cdkObject: software.constructs.IValidation,
  ) : CdkObject(cdkObject), IValidation {
    override fun validate(): List<String> = unwrap(this).validate()
  }

  public companion object {
    internal fun wrap(cdkObject: software.constructs.IValidation): IValidation =
        CdkObjectWrappers.wrap(cdkObject) as? IValidation ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IValidation): software.constructs.IValidation = (wrapped as
        CdkObject).cdkObject as software.constructs.IValidation
  }
}
