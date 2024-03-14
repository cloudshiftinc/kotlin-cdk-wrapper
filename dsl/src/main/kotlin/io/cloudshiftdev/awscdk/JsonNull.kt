package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.List

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
  public override fun resolve(_ctx: IResolveContext): Any =
      unwrap(this).resolve(_ctx.let(IResolveContext::unwrap))

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
