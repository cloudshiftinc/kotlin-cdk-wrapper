@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AliasAttributes {
  public fun aliasName(): String

  public fun aliasTargetKey(): IKey

  @CdkDslMarker
  public interface Builder {
    public fun aliasName(aliasName: String)

    public fun aliasTargetKey(aliasTargetKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.AliasAttributes.Builder =
        software.amazon.awscdk.services.kms.AliasAttributes.builder()

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun aliasTargetKey(aliasTargetKey: IKey) {
      cdkBuilder.aliasTargetKey(aliasTargetKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.AliasAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.AliasAttributes,
  ) : CdkObject(cdkObject), AliasAttributes {
    override fun aliasName(): String = unwrap(this).getAliasName()

    override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.AliasAttributes):
        AliasAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasAttributes):
        software.amazon.awscdk.services.kms.AliasAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.AliasAttributes
  }
}
