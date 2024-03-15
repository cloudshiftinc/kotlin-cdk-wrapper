@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * An object which serializes to the JSON `null` literal, and which can safely be passed across
 * languages where `undefined` and `null` are not different.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * JsonNull jsonNull = JsonNull.INSTANCE;
 * ```
 */
public open class JsonNull internal constructor(
  internal override val cdkObject: software.amazon.awscdk.JsonNull,
) : CdkObject(cdkObject), IResolvable {
  /**
   * The creation stack of this resolvable which will be appended to errors thrown during
   * resolution.
   *
   * This may return an array with a single informational element indicating how
   * to get this property populated, if it was skipped for performance reasons.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param _ctx 
   */
  public override fun resolve(ctx: IResolveContext): Any =
      unwrap(this).resolve(ctx.let(IResolveContext::unwrap))

  /**
   * Obtains the JSON representation of this object (`null`).
   */
  public open fun toJson(): Any = unwrap(this).toJSON()

  public companion object {
    public val INSTANCE: JsonNull = JsonNull.wrap(software.amazon.awscdk.JsonNull.INSTANCE)

    internal fun wrap(cdkObject: software.amazon.awscdk.JsonNull): JsonNull = JsonNull(cdkObject)

    internal fun unwrap(wrapped: JsonNull): software.amazon.awscdk.JsonNull = wrapped.cdkObject
  }
}
