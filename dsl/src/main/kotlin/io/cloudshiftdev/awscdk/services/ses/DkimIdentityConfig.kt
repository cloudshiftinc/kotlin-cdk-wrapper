package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface DkimIdentityConfig {
  public fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

  public fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

  public fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
      unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)

  public interface Builder {
    public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
    }

    public fun domainSigningSelector(domainSigningSelector: String) {
    }

    public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimIdentityConfig.Builder =
        software.amazon.awscdk.services.ses.DkimIdentityConfig.builder()

    public override fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
      cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    public override fun domainSigningSelector(domainSigningSelector: String) {
      cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    public override fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
      cdkBuilder.nextSigningKeyLength(nextSigningKeyLength.let(EasyDkimSigningKeyLength::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimIdentityConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig,
  ) : DkimIdentityConfig {
    public override fun domainSigningPrivateKey(): String? =
        unwrap(this).getDomainSigningPrivateKey()

    public override fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

    public override fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
        unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DkimIdentityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig):
        DkimIdentityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimIdentityConfig):
        software.amazon.awscdk.services.ses.DkimIdentityConfig = (wrapped as Wrapper).cdkObject
  }
}
