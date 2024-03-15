@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class SubjectAlternativeNames internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): SubjectAlternativeNamesMatcherConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(SubjectAlternativeNamesMatcherConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames,
  ) : SubjectAlternativeNames(cdkObject)

  public companion object {
    public fun matchingExactly(names: String): SubjectAlternativeNames =
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNames.matchingExactly(names).let(SubjectAlternativeNames::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames):
        SubjectAlternativeNames = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubjectAlternativeNames):
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNames = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.SubjectAlternativeNames
  }
}
