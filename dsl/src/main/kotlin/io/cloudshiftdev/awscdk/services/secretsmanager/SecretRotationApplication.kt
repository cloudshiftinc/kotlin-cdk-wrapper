package io.cloudshiftdev.awscdk.services.secretsmanager

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class SecretRotationApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication,
) {
  public open fun applicationArnForPartition(partition: String): String =
      unwrap(this).applicationArnForPartition(partition)

  public open fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

  public open fun semanticVersionForPartition(partition: String): String =
      unwrap(this).semanticVersionForPartition(partition)

  public interface Builder {
    public fun isMultiUser(isMultiUser: Boolean) {
    }
  }

  private class BuilderImpl(
    applicationId: String,
    semanticVersion: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder.create(applicationId,
        semanticVersion)

    public override fun isMultiUser(isMultiUser: Boolean) {
      cdkBuilder.isMultiUser(isMultiUser)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      applicationId: String,
      semanticVersion: String,
      block: Builder.() -> Unit = {},
    ): SecretRotationApplication {
      val builderImpl = BuilderImpl(applicationId, semanticVersion)
      return SecretRotationApplication(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication):
        SecretRotationApplication = SecretRotationApplication(cdkObject)

    internal fun unwrap(wrapped: SecretRotationApplication):
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplication = wrapped.cdkObject
  }
}
