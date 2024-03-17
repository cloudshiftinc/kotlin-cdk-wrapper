@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A secret environment variable.
 *
 * Example:
 *
 * ```
 * ISecret mySecret;
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .secrets(Map.of(
 * "MY_SECRET_ENV_VAR", Secret.fromSecretsManager(mySecret)))
 * .build())
 * .build();
 * ```
 */
public abstract class Secret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.Secret,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the secret.
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * Grants reading the secret to a principal.
   *
   * @param grantee 
   */
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Whether this secret uses a specific JSON field.
   */
  public open fun hasField(): Boolean? = unwrap(this).getHasField()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.Secret,
  ) : Secret(cdkObject)

  public companion object {
    public fun fromSecretsManager(secret: ISecret): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManager(secret.let(ISecret::unwrap)).let(Secret::wrap)

    public fun fromSecretsManager(secret: ISecret, `field`: String): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManager(secret.let(ISecret::unwrap),
        `field`).let(Secret::wrap)

    public fun fromSecretsManagerVersion(secret: ISecret, versionInfo: SecretVersionInfo): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap)).let(Secret::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("966c60368733c7613666a1761208e945ee20d0c452ada822c533e1ebf1a619b5")
    public fun fromSecretsManagerVersion(secret: ISecret,
        versionInfo: SecretVersionInfo.Builder.() -> Unit): Secret =
        fromSecretsManagerVersion(secret, SecretVersionInfo(versionInfo))

    public fun fromSecretsManagerVersion(
      secret: ISecret,
      versionInfo: SecretVersionInfo,
      `field`: String,
    ): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap), `field`).let(Secret::wrap)

    public fun fromSsmParameter(parameter: IParameter): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSsmParameter(parameter.let(IParameter::unwrap)).let(Secret::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Secret): Secret =
        CdkObjectWrappers.wrap(cdkObject) as? Secret ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.batch.Secret = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.Secret
  }
}
