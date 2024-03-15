@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KeyLookupOptions {
  public fun aliasName(): String

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions,
  ) : CdkObject(cdkObject), KeyLookupOptions {
    override fun aliasName(): String = unwrap(this).getAliasName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions):
        KeyLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyLookupOptions):
        software.amazon.awscdk.services.kms.KeyLookupOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.KeyLookupOptions
  }
}
