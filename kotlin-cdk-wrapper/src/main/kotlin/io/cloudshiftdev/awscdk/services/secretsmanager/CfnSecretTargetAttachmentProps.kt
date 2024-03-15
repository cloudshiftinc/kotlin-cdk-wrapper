@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSecretTargetAttachmentProps {
  public fun secretId(): String

  public fun targetId(): String

  public fun targetType(): String

  @CdkDslMarker
  public interface Builder {
    public fun secretId(secretId: String)

    public fun targetId(targetId: String)

    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.builder()

    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build():
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps,
  ) : CdkObject(cdkObject), CfnSecretTargetAttachmentProps {
    override fun secretId(): String = unwrap(this).getSecretId()

    override fun targetId(): String = unwrap(this).getTargetId()

    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecretTargetAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps):
        CfnSecretTargetAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecretTargetAttachmentProps):
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
  }
}
