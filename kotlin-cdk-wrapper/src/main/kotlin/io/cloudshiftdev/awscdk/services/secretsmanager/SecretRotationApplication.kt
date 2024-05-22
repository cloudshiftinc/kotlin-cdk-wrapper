@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A secret rotation serverless application.
 *
 * Example:
 *
 * ```
 * Secret myUserSecret;
 * Secret myMasterSecret;
 * IConnectable myDatabase;
 * Vpc myVpc;
 * SecretRotation.Builder.create(this, "SecretRotation")
 * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
 * .secret(myUserSecret) // The secret that will be rotated
 * .masterSecret(myMasterSecret) // The secret used for the rotation
 * .target(myDatabase)
 * .vpc(myVpc)
 * .build();
 * ```
 */
public open class SecretRotationApplication(
  cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication,
) : CdkObject(cdkObject) {
  public constructor(applicationId: String, semanticVersion: String) :
      this(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication(applicationId,
      semanticVersion)
  )

  public constructor(
    applicationId: String,
    semanticVersion: String,
    options: SecretRotationApplicationOptions,
  ) : this(software.amazon.awscdk.services.secretsmanager.SecretRotationApplication(applicationId,
      semanticVersion, options.let(SecretRotationApplicationOptions.Companion::unwrap))
  )

  public constructor(
    applicationId: String,
    semanticVersion: String,
    options: SecretRotationApplicationOptions.Builder.() -> Unit,
  ) : this(applicationId, semanticVersion, SecretRotationApplicationOptions(options)
  )

  /**
   * Returns the application ARN for the current partition.
   *
   * Can be used in combination with a `CfnMapping` to automatically select the correct ARN based on
   * the current partition.
   *
   * @param partition 
   */
  public open fun applicationArnForPartition(partition: String): String =
      unwrap(this).applicationArnForPartition(partition)

  /**
   * Whether the rotation application uses the mutli user scheme.
   */
  public open fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

  /**
   * The semantic version of the app for the current partition.
   *
   * Can be used in combination with a `CfnMapping` to automatically select the correct version
   * based on the current partition.
   *
   * @param partition 
   */
  public open fun semanticVersionForPartition(partition: String): String =
      unwrap(this).semanticVersionForPartition(partition)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the rotation application uses the mutli user scheme.
     *
     * Default: false
     *
     * @param isMultiUser Whether the rotation application uses the mutli user scheme. 
     */
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

    /**
     * Whether the rotation application uses the mutli user scheme.
     *
     * Default: false
     *
     * @param isMultiUser Whether the rotation application uses the mutli user scheme. 
     */
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
        as software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
  }
}
