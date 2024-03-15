@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface ResourcePolicyProps {
  public fun secret(): ISecret

  @CdkDslMarker
  public interface Builder {
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps.Builder =
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps.builder()

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps,
  ) : CdkObject(cdkObject), ResourcePolicyProps {
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps):
        ResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicyProps):
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
  }
}
