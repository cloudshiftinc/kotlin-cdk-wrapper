@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The CA certificate used for a DB instance.
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html)
 */
public open class CaCertificate(
  cdkObject: software.amazon.awscdk.services.docdb.CaCertificate,
) : CdkObject(cdkObject) {
  public companion object {
    public val RDS_CA_2019: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_2019)

    public val RDS_CA_ECC384_G1: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_ECC384_G1)

    public val RDS_CA_RDS2048_G1: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_RDS2048_G1)

    public val RDS_CA_RDS4096_G1: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_RDS4096_G1)

    public val RDS_CA_RSA2048_G1: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_RSA2048_G1)

    public val RDS_CA_RSA4096_G1: io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        io.cloudshiftdev.awscdk.services.rds.CaCertificate.wrap(software.amazon.awscdk.services.docdb.CaCertificate.RDS_CA_RSA4096_G1)

    public fun of(identifier: String): io.cloudshiftdev.awscdk.services.rds.CaCertificate =
        software.amazon.awscdk.services.docdb.CaCertificate.of(identifier).let(io.cloudshiftdev.awscdk.services.rds.CaCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CaCertificate): CaCertificate
        = CaCertificate(cdkObject)

    internal fun unwrap(wrapped: CaCertificate): software.amazon.awscdk.services.docdb.CaCertificate
        = wrapped.cdkObject as software.amazon.awscdk.services.docdb.CaCertificate
  }
}
