@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Utility class representing the assigment of a value to an attribute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Assign assign = new Assign("attr", "arg");
 * ```
 */
public open class Assign internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Assign,
) : CdkObject(cdkObject) {
  public constructor(attr: String, arg: String) :
      this(software.amazon.awscdk.services.appsync.Assign(attr, arg)
  )

  /**
   * Renders the assignment as a map element.
   *
   * @param map 
   */
  public open fun putInMap(map: String): String = unwrap(this).putInMap(map)

  /**
   * Renders the assignment as a VTL string.
   */
  public open fun renderAsAssignment(): String = unwrap(this).renderAsAssignment()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Assign): Assign =
        Assign(cdkObject)

    internal fun unwrap(wrapped: Assign): software.amazon.awscdk.services.appsync.Assign =
        wrapped.cdkObject
  }
}
