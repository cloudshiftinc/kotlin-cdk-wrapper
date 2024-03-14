package io.cloudshiftdev.awscdk.services.signer

import kotlin.String
import kotlin.Unit

public interface SigningProfileAttributes {
  public fun signingProfileName(): String

  public fun signingProfileVersion(): String

  public interface Builder {
    public fun signingProfileName(signingProfileName: String) {
    }

    public fun signingProfileVersion(signingProfileVersion: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfileAttributes.Builder
        = software.amazon.awscdk.services.signer.SigningProfileAttributes.builder()

    public override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    public override fun signingProfileVersion(signingProfileVersion: String) {
      cdkBuilder.signingProfileVersion(signingProfileVersion)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfileAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.signer.SigningProfileAttributes,
  ) : SigningProfileAttributes {
    public override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

    public override fun signingProfileVersion(): String = unwrap(this).getSigningProfileVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SigningProfileAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.SigningProfileAttributes):
        SigningProfileAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SigningProfileAttributes):
        software.amazon.awscdk.services.signer.SigningProfileAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
