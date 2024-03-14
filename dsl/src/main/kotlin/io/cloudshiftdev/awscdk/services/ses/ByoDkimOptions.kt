package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String
import kotlin.Unit

public interface ByoDkimOptions {
  public fun privateKey(): SecretValue

  public fun publicKey(): String? = unwrap(this).getPublicKey()

  public fun selector(): String

  public interface Builder {
    public fun privateKey(privateKey: SecretValue)

    public fun publicKey(publicKey: String)

    public fun selector(selector: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ByoDkimOptions.Builder =
        software.amazon.awscdk.services.ses.ByoDkimOptions.builder()

    override fun privateKey(privateKey: SecretValue) {
      cdkBuilder.privateKey(privateKey.let(SecretValue::unwrap))
    }

    override fun publicKey(publicKey: String) {
      cdkBuilder.publicKey(publicKey)
    }

    override fun selector(selector: String) {
      cdkBuilder.selector(selector)
    }

    public fun build(): software.amazon.awscdk.services.ses.ByoDkimOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.ByoDkimOptions,
  ) : ByoDkimOptions {
    override fun privateKey(): SecretValue = unwrap(this).getPrivateKey().let(SecretValue::wrap)

    override fun publicKey(): String? = unwrap(this).getPublicKey()

    override fun selector(): String = unwrap(this).getSelector()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ByoDkimOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ByoDkimOptions): ByoDkimOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ByoDkimOptions): software.amazon.awscdk.services.ses.ByoDkimOptions
        = (wrapped as Wrapper).cdkObject
  }
}
