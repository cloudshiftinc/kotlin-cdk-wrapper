@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The source credentials used when contacting the BitBucket API.
 *
 * **Note**: CodeBuild only allows a single credential for BitBucket
 * to be saved in a given AWS account in a given region -
 * any attempt to add more than one will result in an error.
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
public open class BitBucketSourceCredentials(
  cdkObject: software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BitBucketSourceCredentialsProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(BitBucketSourceCredentialsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BitBucketSourceCredentialsProps.Builder.() -> Unit,
  ) : this(scope, id, BitBucketSourceCredentialsProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.BitBucketSourceCredentials].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Your BitBucket application password.
     *
     * @param password Your BitBucket application password. 
     */
    public fun password(password: SecretValue)

    /**
     * Your BitBucket username.
     *
     * @param username Your BitBucket username. 
     */
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

    /**
     * Your BitBucket application password.
     *
     * @param password Your BitBucket application password. 
     */
    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue.Companion::unwrap))
    }

    /**
     * Your BitBucket username.
     *
     * @param username Your BitBucket username. 
     */
    override fun username(username: SecretValue) {
      cdkBuilder.username(username.let(SecretValue.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.PROPERTY_INJECTION_ID

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
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
  }
}
