@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class SecretRotationApplication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.secretsmanager.SecretRotationApplication,
) : CdkObject(cdkObject) {
  public open fun applicationArnForPartition(partition: String): String =
      unwrap(this).applicationArnForPartition(partition)

  public open fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

  public open fun semanticVersionForPartition(partition: String): String =
      unwrap(this).semanticVersionForPartition(partition)

  @CdkDslMarker
  public interface Builder {
    public fun isMultiUser(isMultiUser: Boolean)
  }

  private class BuilderImpl(
    applicationId: String,
    semanticVersion: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder.create(applicationId,
        semanticVersion)

    override fun isMultiUser(isMultiUser: Boolean) {
      cdkBuilder.isMultiUser(isMultiUser)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val MARIADB_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MARIADB_ROTATION_MULTI_USER)

    public val MARIADB_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MARIADB_ROTATION_SINGLE_USER)

    public val MONGODB_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MONGODB_ROTATION_MULTI_USER)

    public val MONGODB_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MONGODB_ROTATION_SINGLE_USER)

    public val MYSQL_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)

    public val MYSQL_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.MYSQL_ROTATION_SINGLE_USER)

    public val ORACLE_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.ORACLE_ROTATION_MULTI_USER)

    public val ORACLE_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.ORACLE_ROTATION_SINGLE_USER)

    public val POSTGRES_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.POSTGRES_ROTATION_MULTI_USER)

    public val POSTGRES_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.POSTGRES_ROTATION_SINGLE_USER)

    public val REDSHIFT_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.REDSHIFT_ROTATION_MULTI_USER)

    public val REDSHIFT_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.REDSHIFT_ROTATION_SINGLE_USER)

    public val SQLSERVER_ROTATION_MULTI_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.SQLSERVER_ROTATION_MULTI_USER)

    public val SQLSERVER_ROTATION_SINGLE_USER: SecretRotationApplication =
        SecretRotationApplication.wrap(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.SQLSERVER_ROTATION_SINGLE_USER)

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
