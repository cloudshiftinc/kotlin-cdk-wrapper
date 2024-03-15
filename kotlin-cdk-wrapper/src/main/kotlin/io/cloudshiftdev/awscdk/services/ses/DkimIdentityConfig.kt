@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DkimIdentityConfig {
  public fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

  public fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

  public fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
      unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun domainSigningPrivateKey(domainSigningPrivateKey: String)

    public fun domainSigningSelector(domainSigningSelector: String)

    public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimIdentityConfig.Builder =
        software.amazon.awscdk.services.ses.DkimIdentityConfig.builder()

    override fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
      cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    override fun domainSigningSelector(domainSigningSelector: String) {
      cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    override fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
      cdkBuilder.nextSigningKeyLength(nextSigningKeyLength.let(EasyDkimSigningKeyLength::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimIdentityConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig,
  ) : CdkObject(cdkObject), DkimIdentityConfig {
    override fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

    override fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

    override fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
        unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DkimIdentityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig):
        DkimIdentityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimIdentityConfig):
        software.amazon.awscdk.services.ses.DkimIdentityConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.DkimIdentityConfig
  }
}
