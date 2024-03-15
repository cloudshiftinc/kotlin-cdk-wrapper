@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class JsonNull internal constructor(
  internal override val cdkObject: software.amazon.awscdk.JsonNull,
) : CdkObject(cdkObject), IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public override fun resolve(_ctx: IResolveContext): Any =
      unwrap(this).resolve(_ctx.let(IResolveContext::unwrap))

  public open fun toJson(): Any = unwrap(this).toJSON()

  public companion object {
    public val INSTANCE: JsonNull = JsonNull.wrap(software.amazon.awscdk.JsonNull.INSTANCE)

    internal fun wrap(cdkObject: software.amazon.awscdk.JsonNull): JsonNull = JsonNull(cdkObject)

    internal fun unwrap(wrapped: JsonNull): software.amazon.awscdk.JsonNull = wrapped.cdkObject
  }
}
