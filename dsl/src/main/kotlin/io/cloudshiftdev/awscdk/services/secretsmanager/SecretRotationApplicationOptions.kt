package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface SecretRotationApplicationOptions {
  /**
   * Whether the rotation application uses the mutli user scheme.
   *
   * Default: false
   */
  public fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

  /**
   * A builder for [SecretRotationApplicationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param isMultiUser Whether the rotation application uses the mutli user scheme.
     */
    public fun isMultiUser(isMultiUser: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions.builder()

    /**
     * @param isMultiUser Whether the rotation application uses the mutli user scheme.
     */
    override fun isMultiUser(isMultiUser: Boolean) {
      cdkBuilder.isMultiUser(isMultiUser)
    }

    public fun build():
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions,
  ) : CdkObject(cdkObject), SecretRotationApplicationOptions {
    /**
     * Whether the rotation application uses the mutli user scheme.
     *
     * Default: false
     */
    override fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretRotationApplicationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions):
        SecretRotationApplicationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretRotationApplicationOptions):
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions
  }
}
