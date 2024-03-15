@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BitBucketSourceCredentials internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials,
) : Resource(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun password(password: SecretValue)

    public fun username(username: SecretValue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder =
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder.create(scope,
        id)

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun username(username: SecretValue) {
      cdkBuilder.username(username.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BitBucketSourceCredentials {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BitBucketSourceCredentials(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials):
        BitBucketSourceCredentials = BitBucketSourceCredentials(cdkObject)

    internal fun unwrap(wrapped: BitBucketSourceCredentials):
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials = wrapped.cdkObject
  }
}
