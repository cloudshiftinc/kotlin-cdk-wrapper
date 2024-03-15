@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TreeInspector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.TreeInspector,
) : CdkObject(cdkObject) {
  public open fun addAttribute(key: String, `value`: Any) {
    unwrap(this).addAttribute(key, `value`)
  }

  public open fun attributes(): Map<String, Any> = unwrap(this).getAttributes() ?: emptyMap()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.TreeInspector): TreeInspector =
        TreeInspector(cdkObject)

    internal fun unwrap(wrapped: TreeInspector): software.amazon.awscdk.TreeInspector =
        wrapped.cdkObject
  }
}
