@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Construction properties of `BitBucketSourceCredentials`.
 *
 * Example:
 *
 * ```
 * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
 * .username(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("username").build()))
 * .password(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("password").build()))
 * .build();
 * ```
 */
public interface BitBucketSourceCredentialsProps {
  /**
   * Your BitBucket application password.
   */
  public fun password(): SecretValue

  /**
   * Your BitBucket username.
   */
  public fun username(): SecretValue

  /**
   * A builder for [BitBucketSourceCredentialsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param password Your BitBucket application password. 
     */
    public fun password(password: SecretValue)

    /**
     * @param username Your BitBucket username. 
     */
    public fun username(username: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.Builder =
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.builder()

    /**
     * @param password Your BitBucket application password. 
     */
    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    /**
     * @param username Your BitBucket username. 
     */
    override fun username(username: SecretValue) {
      cdkBuilder.username(username.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps,
  ) : CdkObject(cdkObject), BitBucketSourceCredentialsProps {
    /**
     * Your BitBucket application password.
     */
    override fun password(): SecretValue = unwrap(this).getPassword().let(SecretValue::wrap)

    /**
     * Your BitBucket username.
     */
    override fun username(): SecretValue = unwrap(this).getUsername().let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BitBucketSourceCredentialsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps):
        BitBucketSourceCredentialsProps = CdkObjectWrappers.wrap(cdkObject) as?
        BitBucketSourceCredentialsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BitBucketSourceCredentialsProps):
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
  }
}
