@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IValidator {
  public fun content(): String

  public fun type(): ValidatorType

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IValidator,
  ) : CdkObject(cdkObject), IValidator {
    override fun content(): String = unwrap(this).getContent()

    override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IValidator): IValidator =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IValidator): software.amazon.awscdk.services.appconfig.IValidator =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IValidator
  }
}
