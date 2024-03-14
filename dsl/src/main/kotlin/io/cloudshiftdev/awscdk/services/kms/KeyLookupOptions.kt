package io.cloudshiftdev.awscdk.services.kms

import kotlin.String
import kotlin.Unit

public interface KeyLookupOptions {
  public fun aliasName(): String

  public interface Builder {
    public fun aliasName(aliasName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.KeyLookupOptions.Builder =
        software.amazon.awscdk.services.kms.KeyLookupOptions.builder()

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    public fun build(): software.amazon.awscdk.services.kms.KeyLookupOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions,
  ) : KeyLookupOptions {
    override fun aliasName(): String = unwrap(this).getAliasName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KeyLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions):
        KeyLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyLookupOptions):
        software.amazon.awscdk.services.kms.KeyLookupOptions = (wrapped as Wrapper).cdkObject
  }
}
