package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class HttpRoutePathMatch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the route path match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HttpRoutePathMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(HttpRoutePathMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
  ) : HttpRoutePathMatch(cdkObject)

  public companion object {
    public fun exactly(path: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.exactly(path).let(HttpRoutePathMatch::wrap)

    public fun regex(regex: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.regex(regex).let(HttpRoutePathMatch::wrap)

    public fun startsWith(prefix: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.startsWith(prefix).let(HttpRoutePathMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch):
        HttpRoutePathMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRoutePathMatch):
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpRoutePathMatch
  }
}