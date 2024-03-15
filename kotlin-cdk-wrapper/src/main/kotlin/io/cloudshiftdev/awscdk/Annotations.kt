@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class Annotations internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Annotations,
) : CdkObject(cdkObject) {
  public open fun acknowledgeWarning(id: String) {
    unwrap(this).acknowledgeWarning(id)
  }

  public open fun acknowledgeWarning(id: String, message: String) {
    unwrap(this).acknowledgeWarning(id, message)
  }

  public open fun addDeprecation(api: String, message: String) {
    unwrap(this).addDeprecation(api, message)
  }

  public open fun addError(message: String) {
    unwrap(this).addError(message)
  }

  public open fun addInfo(message: String) {
    unwrap(this).addInfo(message)
  }

  public open fun addWarning(message: String) {
    unwrap(this).addWarning(message)
  }

  public open fun addWarningV2(id: String, message: String) {
    unwrap(this).addWarningV2(id, message)
  }

  public companion object {
    public fun of(scope: IConstruct): Annotations =
        software.amazon.awscdk.Annotations.of(scope.let(IConstruct::unwrap)).let(Annotations::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Annotations): Annotations =
        Annotations(cdkObject)

    internal fun unwrap(wrapped: Annotations): software.amazon.awscdk.Annotations =
        wrapped.cdkObject
  }
}
