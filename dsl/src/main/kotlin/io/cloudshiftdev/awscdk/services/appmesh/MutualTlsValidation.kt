package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Unit

public interface MutualTlsValidation {
  public fun subjectAlternativeNames(): SubjectAlternativeNames? =
      unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

  public fun trust(): MutualTlsValidationTrust

  public interface Builder {
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
    }

    public fun trust(trust: MutualTlsValidationTrust) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MutualTlsValidation.Builder =
        software.amazon.awscdk.services.appmesh.MutualTlsValidation.builder()

    public override fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNames::unwrap))
    }

    public override fun trust(trust: MutualTlsValidationTrust) {
      cdkBuilder.trust(trust.let(MutualTlsValidationTrust::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation,
  ) : MutualTlsValidation {
    public override fun subjectAlternativeNames(): SubjectAlternativeNames? =
        unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

    public override fun trust(): MutualTlsValidationTrust =
        unwrap(this).getTrust().let(MutualTlsValidationTrust::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsValidation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation):
        MutualTlsValidation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsValidation):
        software.amazon.awscdk.services.appmesh.MutualTlsValidation = (wrapped as Wrapper).cdkObject
  }
}
