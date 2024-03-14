package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class HttpGatewayRoutePathMatch internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
) {
  /**
   * Returns the gateway route path match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HttpGatewayRoutePathMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(HttpGatewayRoutePathMatchConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
  ) : HttpGatewayRoutePathMatch(cdkObject)

  public companion object {
    public fun exactly(path: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.exactly(path).let(HttpGatewayRoutePathMatch::wrap)

    public fun exactly(path: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.exactly(path,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    public fun regex(regex: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.regex(regex).let(HttpGatewayRoutePathMatch::wrap)

    public fun regex(regex: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.regex(regex,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    public fun startsWith(prefix: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.startsWith(prefix).let(HttpGatewayRoutePathMatch::wrap)

    public fun startsWith(prefix: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.startsWith(prefix,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch):
        HttpGatewayRoutePathMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRoutePathMatch):
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch = (wrapped as
        Wrapper).cdkObject
  }
}
