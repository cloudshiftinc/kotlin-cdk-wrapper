package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.String

public abstract class HeaderMatch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the header match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HeaderMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(HeaderMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatch,
  ) : HeaderMatch(cdkObject)

  public companion object {
    public fun valueDoesNotEndWith(headerName: String, suffix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotEndWith(headerName,
        suffix).let(HeaderMatch::wrap)

    public fun valueDoesNotMatchRegex(headerName: String, regex: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotMatchRegex(headerName,
        regex).let(HeaderMatch::wrap)

    public fun valueDoesNotStartWith(headerName: String, prefix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotStartWith(headerName,
        prefix).let(HeaderMatch::wrap)

    public fun valueEndsWith(headerName: String, suffix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueEndsWith(headerName,
        suffix).let(HeaderMatch::wrap)

    public fun valueIs(headerName: String, headerValue: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueIs(headerName,
        headerValue).let(HeaderMatch::wrap)

    public fun valueIsNot(headerName: String, headerValue: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueIsNot(headerName,
        headerValue).let(HeaderMatch::wrap)

    public fun valueMatchesRegex(headerName: String, regex: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueMatchesRegex(headerName,
        regex).let(HeaderMatch::wrap)

    public fun valueStartsWith(headerName: String, prefix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueStartsWith(headerName,
        prefix).let(HeaderMatch::wrap)

    public fun valuesIsInRange(
      headerName: String,
      start: Number,
      end: Number,
    ): HeaderMatch = software.amazon.awscdk.services.appmesh.HeaderMatch.valuesIsInRange(headerName,
        start, end).let(HeaderMatch::wrap)

    public fun valuesIsNotInRange(
      headerName: String,
      start: Number,
      end: Number,
    ): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valuesIsNotInRange(headerName, start,
        end).let(HeaderMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatch): HeaderMatch =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HeaderMatch): software.amazon.awscdk.services.appmesh.HeaderMatch =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HeaderMatch
  }
}
