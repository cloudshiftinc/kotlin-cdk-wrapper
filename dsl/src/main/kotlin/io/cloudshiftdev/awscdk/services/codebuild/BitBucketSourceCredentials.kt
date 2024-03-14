package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BitBucketSourceCredentials internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials,
) : Resource(cdkObject) {
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
    init {

    }

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
