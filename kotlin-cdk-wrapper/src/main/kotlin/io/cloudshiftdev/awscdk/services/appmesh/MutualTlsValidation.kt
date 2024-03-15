@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface MutualTlsValidation {
  public fun subjectAlternativeNames(): SubjectAlternativeNames? =
      unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

  public fun trust(): MutualTlsValidationTrust

  @CdkDslMarker
  public interface Builder {
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames)

    public fun trust(trust: MutualTlsValidationTrust)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MutualTlsValidation.Builder =
        software.amazon.awscdk.services.appmesh.MutualTlsValidation.builder()

    override fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNames::unwrap))
    }

    override fun trust(trust: MutualTlsValidationTrust) {
      cdkBuilder.trust(trust.let(MutualTlsValidationTrust::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation,
  ) : CdkObject(cdkObject), MutualTlsValidation {
    override fun subjectAlternativeNames(): SubjectAlternativeNames? =
        unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

    override fun trust(): MutualTlsValidationTrust =
        unwrap(this).getTrust().let(MutualTlsValidationTrust::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsValidation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation):
        MutualTlsValidation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsValidation):
        software.amazon.awscdk.services.appmesh.MutualTlsValidation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MutualTlsValidation
  }
}
