@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface BitBucketSourceCredentialsProps {
  public fun password(): SecretValue

  public fun username(): SecretValue

  @CdkDslMarker
  public interface Builder {
    public fun password(password: SecretValue)

    public fun username(username: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.Builder =
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.builder()

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun username(username: SecretValue) {
      cdkBuilder.username(username.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps,
  ) : CdkObject(cdkObject), BitBucketSourceCredentialsProps {
    override fun password(): SecretValue = unwrap(this).getPassword().let(SecretValue::wrap)

    override fun username(): SecretValue = unwrap(this).getUsername().let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BitBucketSourceCredentialsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps):
        BitBucketSourceCredentialsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BitBucketSourceCredentialsProps):
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
  }
}
