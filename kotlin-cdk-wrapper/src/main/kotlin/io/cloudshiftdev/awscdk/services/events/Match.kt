@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public open class Match internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.Match,
) : CdkObject(cdkObject), IResolvable {
  public open fun asList(): List<String> = unwrap(this).asList()

  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  public companion object {
    public fun allOf(matchers: Any): List<String> =
        software.amazon.awscdk.services.events.Match.allOf(matchers)

    public fun anyOf(matchers: Any): List<String> =
        software.amazon.awscdk.services.events.Match.anyOf(matchers)

    public fun anythingBut(values: Any): List<String> =
        software.amazon.awscdk.services.events.Match.anythingBut(values)

    public fun anythingButPrefix(prefix: String): List<String> =
        software.amazon.awscdk.services.events.Match.anythingButPrefix(prefix)

    public fun cidr(range: String): List<String> =
        software.amazon.awscdk.services.events.Match.cidr(range)

    public fun doesNotExist(): List<String> =
        software.amazon.awscdk.services.events.Match.doesNotExist()

    public fun equal(`value`: Number): List<String> =
        software.amazon.awscdk.services.events.Match.equal(`value`)

    public fun equalsIgnoreCase(`value`: String): List<String> =
        software.amazon.awscdk.services.events.Match.equalsIgnoreCase(`value`)

    public fun exactString(`value`: String): List<String> =
        software.amazon.awscdk.services.events.Match.exactString(`value`)

    public fun exists(): List<String> = software.amazon.awscdk.services.events.Match.exists()

    public fun greaterThan(`value`: Number): List<String> =
        software.amazon.awscdk.services.events.Match.greaterThan(`value`)

    public fun greaterThanOrEqual(`value`: Number): List<String> =
        software.amazon.awscdk.services.events.Match.greaterThanOrEqual(`value`)

    public fun interval(lower: Number, upper: Number): List<String> =
        software.amazon.awscdk.services.events.Match.interval(lower, upper)

    public fun ipAddressRange(range: String): List<String> =
        software.amazon.awscdk.services.events.Match.ipAddressRange(range)

    public fun lessThan(`value`: Number): List<String> =
        software.amazon.awscdk.services.events.Match.lessThan(`value`)

    public fun lessThanOrEqual(`value`: Number): List<String> =
        software.amazon.awscdk.services.events.Match.lessThanOrEqual(`value`)

    public fun nullValue(): List<String> = software.amazon.awscdk.services.events.Match.nullValue()

    public fun prefix(`value`: String): List<String> =
        software.amazon.awscdk.services.events.Match.prefix(`value`)

    public fun suffix(`value`: String): List<String> =
        software.amazon.awscdk.services.events.Match.suffix(`value`)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Match): Match =
        Match(cdkObject)

    internal fun unwrap(wrapped: Match): software.amazon.awscdk.services.events.Match =
        wrapped.cdkObject
  }
}