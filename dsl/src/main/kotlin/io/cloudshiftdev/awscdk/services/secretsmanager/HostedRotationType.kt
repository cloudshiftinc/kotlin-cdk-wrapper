package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String

public open class HostedRotationType internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.secretsmanager.HostedRotationType,
) : CdkObject(cdkObject) {
  /**
   * Whether the rotation uses the mutli user scheme.
   */
  public open fun isMultiUser(): Boolean? = unwrap(this).getIsMultiUser()

  /**
   * The type of rotation.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val MARIADB_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MARIADB_MULTI_USER)

    public val MARIADB_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MARIADB_SINGLE_USER)

    public val MONGODB_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MONGODB_MULTI_USER)

    public val MONGODB_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MONGODB_SINGLE_USER)

    public val MYSQL_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MYSQL_MULTI_USER)

    public val MYSQL_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.MYSQL_SINGLE_USER)

    public val ORACLE_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.ORACLE_MULTI_USER)

    public val ORACLE_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.ORACLE_SINGLE_USER)

    public val POSTGRESQL_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.POSTGRESQL_MULTI_USER)

    public val POSTGRESQL_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.POSTGRESQL_SINGLE_USER)

    public val REDSHIFT_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.REDSHIFT_MULTI_USER)

    public val REDSHIFT_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.REDSHIFT_SINGLE_USER)

    public val SQLSERVER_MULTI_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.SQLSERVER_MULTI_USER)

    public val SQLSERVER_SINGLE_USER: HostedRotationType =
        HostedRotationType.wrap(software.amazon.awscdk.services.secretsmanager.HostedRotationType.SQLSERVER_SINGLE_USER)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.HostedRotationType):
        HostedRotationType = HostedRotationType(cdkObject)

    internal fun unwrap(wrapped: HostedRotationType):
        software.amazon.awscdk.services.secretsmanager.HostedRotationType = wrapped.cdkObject
  }
}
