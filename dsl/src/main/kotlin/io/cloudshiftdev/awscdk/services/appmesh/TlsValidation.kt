package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Unit

public interface TlsValidation {
  public fun subjectAlternativeNames(): SubjectAlternativeNames? =
      unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

  public fun trust(): TlsValidationTrust

  public interface Builder {
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
    }

    public fun trust(trust: TlsValidationTrust) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsValidation.Builder =
        software.amazon.awscdk.services.appmesh.TlsValidation.builder()

    public override fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNames::unwrap))
    }

    public override fun trust(trust: TlsValidationTrust) {
      cdkBuilder.trust(trust.let(TlsValidationTrust::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TlsValidation = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TlsValidation,
  ) : TlsValidation {
    public override fun subjectAlternativeNames(): SubjectAlternativeNames? =
        unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

    public override fun trust(): TlsValidationTrust =
        unwrap(this).getTrust().let(TlsValidationTrust::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TlsValidation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsValidation):
        TlsValidation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsValidation):
        software.amazon.awscdk.services.appmesh.TlsValidation = (wrapped as Wrapper).cdkObject
  }
}
