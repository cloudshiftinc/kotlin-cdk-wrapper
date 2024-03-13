package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TreeInspector internal constructor(
  private val cdkObject: software.amazon.awscdk.TreeInspector,
) {
  public open fun addAttribute(key: String, `value`: Any) {
    unwrap(this).addAttribute(key, `value`)
  }

  public open fun attributes(): Map<String, Any> = unwrap(this).getAttributes() ?: emptyMap()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TreeInspector): TreeInspector =
        TreeInspector(cdkObject)

    internal fun unwrap(wrapped: TreeInspector): software.amazon.awscdk.TreeInspector =
        wrapped.cdkObject
  }
}
