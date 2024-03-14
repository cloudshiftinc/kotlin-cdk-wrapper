package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TreeInspector
internal constructor(
    private val cdkObject: software.amazon.awscdk.TreeInspector,
) {
    /**
     * Adds attribute to bag.
     *
     * Keys should be added by convention to prevent conflicts i.e. L1 constructs will contain
     * attributes with keys prefixed with aws:cdk:cloudformation
     *
     * @param key * key for metadata.
     * @param value * value of metadata.
     */
    public open fun addAttribute(key: String, `value`: Any) {
        unwrap(this).addAttribute(key, `value`)
    }

    /** Represents the bag of attributes as key-value pairs. */
    public open fun attributes(): Map<String, Any> = unwrap(this).getAttributes() ?: emptyMap()

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.TreeInspector): TreeInspector =
            TreeInspector(cdkObject)

        internal fun unwrap(wrapped: TreeInspector): software.amazon.awscdk.TreeInspector =
            wrapped.cdkObject
    }
}
