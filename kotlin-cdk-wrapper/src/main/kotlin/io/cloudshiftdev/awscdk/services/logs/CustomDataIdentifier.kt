@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import kotlin.String

public open class CustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier,
) : DataIdentifier(cdkObject) {
  public override fun name(): String = unwrap(this).getName()

  public open fun regex(): String = unwrap(this).getRegex()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier):
        CustomDataIdentifier = CustomDataIdentifier(cdkObject)

    internal fun unwrap(wrapped: CustomDataIdentifier):
        software.amazon.awscdk.services.logs.CustomDataIdentifier = wrapped.cdkObject
  }
}
