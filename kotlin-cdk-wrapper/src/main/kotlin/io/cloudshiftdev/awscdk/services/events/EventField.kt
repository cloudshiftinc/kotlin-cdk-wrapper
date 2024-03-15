@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class EventField internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.EventField,
) : CdkObject(cdkObject), IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public open fun displayHint(): String = unwrap(this).getDisplayHint()

  public open fun path(): String = unwrap(this).getPath()

  public override fun resolve(_ctx: IResolveContext): Any =
      unwrap(this).resolve(_ctx.let(IResolveContext::unwrap))

  public open fun toJson(): String = unwrap(this).toJSON()

  public companion object {
    public fun account(): String = software.amazon.awscdk.services.events.EventField.getAccount()

    public fun detailType(): String =
        software.amazon.awscdk.services.events.EventField.getDetailType()

    public fun eventId(): String = software.amazon.awscdk.services.events.EventField.getEventId()

    public fun fromPath(path: String): String =
        software.amazon.awscdk.services.events.EventField.fromPath(path)

    public fun region(): String = software.amazon.awscdk.services.events.EventField.getRegion()

    public fun source(): String = software.amazon.awscdk.services.events.EventField.getSource()

    public fun time(): String = software.amazon.awscdk.services.events.EventField.getTime()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventField): EventField =
        EventField(cdkObject)

    internal fun unwrap(wrapped: EventField): software.amazon.awscdk.services.events.EventField =
        wrapped.cdkObject
  }
}
