@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class HttpGatewayRoutePathMatch internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): HttpGatewayRoutePathMatchConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(HttpGatewayRoutePathMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
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
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch
  }
}
