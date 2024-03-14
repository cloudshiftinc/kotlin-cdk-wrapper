package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Secret internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.Secret,
) {
  public open fun arn(): String = unwrap(this).getArn()

  public open fun grantRead(arg0: IGrantable): Grant =
      unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun hasField(): Boolean? = unwrap(this).getHasField()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.Secret,
  ) : Secret(cdkObject)

  public companion object {
    public open fun fromSecretsManager(secret: ISecret): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManager(secret.let(ISecret::unwrap)).let(Secret::wrap)

    public open fun fromSecretsManager(secret: ISecret, `field`: String): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManager(secret.let(ISecret::unwrap),
        `field`).let(Secret::wrap)

    public open fun fromSecretsManagerVersion(secret: ISecret, versionInfo: SecretVersionInfo):
        Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap)).let(Secret::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("966c60368733c7613666a1761208e945ee20d0c452ada822c533e1ebf1a619b5")
    public open fun fromSecretsManagerVersion(secret: ISecret,
        versionInfo: SecretVersionInfo.Builder.() -> Unit): Secret =
        fromSecretsManagerVersion(secret, SecretVersionInfo(versionInfo))

    public open fun fromSecretsManagerVersion(
      secret: ISecret,
      versionInfo: SecretVersionInfo,
      `field`: String,
    ): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap), `field`).let(Secret::wrap)

    public open fun fromSsmParameter(parameter: IParameter): Secret =
        software.amazon.awscdk.services.batch.Secret.fromSsmParameter(parameter.let(IParameter::unwrap)).let(Secret::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Secret): Secret =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.batch.Secret = (wrapped as
        Wrapper).cdkObject
  }
}
