@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The CA certificate used for a DB instance.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .caCertificate(CaCertificate.RDS_CA_RSA4096_G1)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html)
 */
public open class CaCertificate(
  cdkObject: software.amazon.awscdk.services.rds.CaCertificate,
) : CdkObject(cdkObject) {
  public companion object {
    public val RDS_CA_2019: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_2019)

    public val RDS_CA_ECC384_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_ECC384_G1)

    public val RDS_CA_RDS2048_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RDS2048_G1)

    public val RDS_CA_RDS4096_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RDS4096_G1)

    public val RDS_CA_RSA2048_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RSA2048_G1)

    public val RDS_CA_RSA4096_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RSA4096_G1)

    public fun of(identifier: String): CaCertificate =
        software.amazon.awscdk.services.rds.CaCertificate.of(identifier).let(CaCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CaCertificate): CaCertificate =
        CaCertificate(cdkObject)

    internal fun unwrap(wrapped: CaCertificate): software.amazon.awscdk.services.rds.CaCertificate =
        wrapped.cdkObject as software.amazon.awscdk.services.rds.CaCertificate
  }
}
