@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class Capture internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Capture,
) : Matcher(cdkObject) {
  public open fun asArray(): List<Any> = unwrap(this).asArray()

  public open fun asBoolean(): Boolean = unwrap(this).asBoolean()

  public open fun asNumber(): Number = unwrap(this).asNumber()

  public open fun asObject(): Map<String, Any> = unwrap(this).asObject() ?: emptyMap()

  public open fun asString(): String = unwrap(this).asString()

  public override fun name(): String = unwrap(this).getName()

  public open fun next(): Boolean = unwrap(this).next()

  public override fun test(`actual`: Any): MatchResult =
      unwrap(this).test(`actual`).let(MatchResult::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Capture): Capture =
        Capture(cdkObject)

    internal fun unwrap(wrapped: Capture): software.amazon.awscdk.assertions.Capture =
        wrapped.cdkObject
  }
}
