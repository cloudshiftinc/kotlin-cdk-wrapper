@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface MatchFailure {
  public fun cost(): Number? = unwrap(this).getCost()

  public fun matcher(): Matcher

  public fun message(): String

  public fun path(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun cost(cost: Number)

    public fun matcher(matcher: Matcher)

    public fun message(message: String)

    public fun path(path: List<String>)

    public fun path(vararg path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.MatchFailure.Builder =
        software.amazon.awscdk.assertions.MatchFailure.builder()

    override fun cost(cost: Number) {
      cdkBuilder.cost(cost)
    }

    override fun matcher(matcher: Matcher) {
      cdkBuilder.matcher(matcher.let(Matcher::unwrap))
    }

    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    override fun path(path: List<String>) {
      cdkBuilder.path(path)
    }

    override fun path(vararg path: String): Unit = path(path.toList())

    public fun build(): software.amazon.awscdk.assertions.MatchFailure = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.MatchFailure,
  ) : CdkObject(cdkObject), MatchFailure {
    override fun cost(): Number? = unwrap(this).getCost()

    override fun matcher(): Matcher = unwrap(this).getMatcher().let(Matcher::wrap)

    override fun message(): String = unwrap(this).getMessage()

    override fun path(): List<String> = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MatchFailure {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchFailure): MatchFailure =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MatchFailure): software.amazon.awscdk.assertions.MatchFailure =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.assertions.MatchFailure
  }
}
