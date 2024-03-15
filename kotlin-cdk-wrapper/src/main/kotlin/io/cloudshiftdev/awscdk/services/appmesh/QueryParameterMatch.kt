@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class QueryParameterMatch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): QueryParameterMatchConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(QueryParameterMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
  ) : QueryParameterMatch(cdkObject)

  public companion object {
    public fun valueIs(queryParameterName: String, queryParameterValue: String): QueryParameterMatch
        = software.amazon.awscdk.services.appmesh.QueryParameterMatch.valueIs(queryParameterName,
        queryParameterValue).let(QueryParameterMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch):
        QueryParameterMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryParameterMatch):
        software.amazon.awscdk.services.appmesh.QueryParameterMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.QueryParameterMatch
  }
}
