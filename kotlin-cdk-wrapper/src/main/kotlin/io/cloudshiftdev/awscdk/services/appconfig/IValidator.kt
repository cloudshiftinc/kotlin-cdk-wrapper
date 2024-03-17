@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IValidator {
  /**
   * The content of the validator.
   */
  public fun content(): String

  /**
   * The type of validator.
   */
  public fun type(): ValidatorType

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IValidator,
  ) : CdkObject(cdkObject), IValidator {
    /**
     * The content of the validator.
     */
    override fun content(): String = unwrap(this).getContent()

    /**
     * The type of validator.
     */
    override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IValidator): IValidator =
        CdkObjectWrappers.wrap(cdkObject) as? IValidator ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IValidator): software.amazon.awscdk.services.appconfig.IValidator =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IValidator
  }
}
