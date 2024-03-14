package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class SubjectAlternativeNames internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames,
) {
  /**
   * Returns Subject Alternative Names Matcher based on method type.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): SubjectAlternativeNamesMatcherConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(SubjectAlternativeNamesMatcherConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames,
  ) : SubjectAlternativeNames(cdkObject)

  public companion object {
    public fun matchingExactly(names: String): SubjectAlternativeNames =
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNames.matchingExactly(names).let(SubjectAlternativeNames::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNames):
        SubjectAlternativeNames = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubjectAlternativeNames):
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNames = (wrapped as
        Wrapper).cdkObject
  }
}
