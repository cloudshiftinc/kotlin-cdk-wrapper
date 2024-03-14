package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class HttpRoutePathMatch internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
) {
  public open fun bind(arg0: Construct): HttpRoutePathMatchConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(HttpRoutePathMatchConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
  ) : HttpRoutePathMatch(cdkObject)

  public companion object {
    public open fun exactly(path: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.exactly(path).let(HttpRoutePathMatch::wrap)

    public open fun regex(regex: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.regex(regex).let(HttpRoutePathMatch::wrap)

    public open fun startsWith(prefix: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.startsWith(prefix).let(HttpRoutePathMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch):
        HttpRoutePathMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRoutePathMatch):
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch = (wrapped as Wrapper).cdkObject
  }
}
