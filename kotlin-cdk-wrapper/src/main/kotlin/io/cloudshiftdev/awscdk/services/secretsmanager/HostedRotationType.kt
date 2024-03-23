@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * Hosted rotation type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * HostedRotationType hostedRotationType = HostedRotationType.MARIADB_MULTI_USER;
 * ```
 */
public open class HostedRotationType(
  cdkObject: software.amazon.awscdk.services.secretsmanager.HostedRotationType,
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
        software.amazon.awscdk.services.secretsmanager.HostedRotationType = wrapped.cdkObject as
        software.amazon.awscdk.services.secretsmanager.HostedRotationType
  }
}
