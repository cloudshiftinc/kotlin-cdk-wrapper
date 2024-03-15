@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAliasProps {
  public fun aliasName(): String

  public fun targetKeyId(): String

  @CdkDslMarker
  public interface Builder {
    public fun aliasName(aliasName: String)

    public fun targetKeyId(targetKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnAliasProps.Builder =
        software.amazon.awscdk.services.kms.CfnAliasProps.builder()

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun targetKeyId(targetKeyId: String) {
      cdkBuilder.targetKeyId(targetKeyId)
    }

    public fun build(): software.amazon.awscdk.services.kms.CfnAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    override fun aliasName(): String = unwrap(this).getAliasName()

    override fun targetKeyId(): String = unwrap(this).getTargetKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnAliasProps): CfnAliasProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAliasProps): software.amazon.awscdk.services.kms.CfnAliasProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kms.CfnAliasProps
  }
}
