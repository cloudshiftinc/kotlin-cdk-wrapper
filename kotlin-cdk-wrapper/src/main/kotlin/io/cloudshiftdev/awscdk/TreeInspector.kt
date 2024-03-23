@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Inspector that maintains an attribute bag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * TreeInspector treeInspector = new TreeInspector();
 * ```
 */
public open class TreeInspector(
  cdkObject: software.amazon.awscdk.TreeInspector,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.TreeInspector()
  )

  /**
   * Adds attribute to bag.
   *
   * Keys should be added by convention to prevent conflicts
   * i.e. L1 constructs will contain attributes with keys prefixed with aws:cdk:cloudformation
   *
   * @param key * key for metadata. 
   * @param value * value of metadata. 
   */
  public open fun addAttribute(key: String, `value`: Any) {
    unwrap(this).addAttribute(key, `value`)
  }

  /**
   * Represents the bag of attributes as key-value pairs.
   */
  public open fun attributes(): Map<String, Any> = unwrap(this).getAttributes() ?: emptyMap()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.TreeInspector): TreeInspector =
        TreeInspector(cdkObject)

    internal fun unwrap(wrapped: TreeInspector): software.amazon.awscdk.TreeInspector =
        wrapped.cdkObject as software.amazon.awscdk.TreeInspector
  }
}
