@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AliasProps {
  public fun aliasName(): String

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun targetKey(): IKey

  @CdkDslMarker
  public interface Builder {
    public fun aliasName(aliasName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun targetKey(targetKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.AliasProps.Builder =
        software.amazon.awscdk.services.kms.AliasProps.builder()

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun targetKey(targetKey: IKey) {
      cdkBuilder.targetKey(targetKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.AliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.AliasProps,
  ) : CdkObject(cdkObject), AliasProps {
    override fun aliasName(): String = unwrap(this).getAliasName()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun targetKey(): IKey = unwrap(this).getTargetKey().let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.AliasProps): AliasProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasProps): software.amazon.awscdk.services.kms.AliasProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kms.AliasProps
  }
}
