@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbInstanceClass("dbInstanceClass")
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .caCertificateIdentifier("caCertificateIdentifier")
 * .certificateRotationRestart(false)
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .enablePerformanceInsights(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html)
 */
public interface CfnDBInstanceProps {
  /**
   * This parameter does not apply to Amazon DocumentDB.
   *
   * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The Amazon EC2 Availability Zone that the instance is created in.
   *
   * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
   *
   * Example: `us-east-1d`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The CA certificate identifier to use for the DB instance's server certificate.
   *
   * For more information, see [Updating Your Amazon DocumentDB TLS
   * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
   * and [Encrypting Data in
   * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
   * in the *Amazon DocumentDB Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-cacertificateidentifier)
   */
  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   *
   * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
   * certificate is not updated until the DB instance is restarted.
   *
   *
   * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
   *
   *
   * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
   * TLS
   * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
   * and [Encrypting Data in
   * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
   * in the *Amazon DocumentDB Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-certificaterotationrestart)
   */
  public fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  /**
   * The identifier of the cluster that the instance will belong to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String

  /**
   * The compute and memory capacity of the instance;
   *
   * for example, `db.m4.large` . If you change the class of an instance there can be some
   * interruption in the cluster's service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceclass)
   */
  public fun dbInstanceClass(): String

  /**
   * The instance identifier. This parameter is stored as a lowercase string.
   *
   * Constraints:
   *
   * * Must contain from 1 to 63 letters, numbers, or hyphens.
   * * The first character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * Example: `mydbinstance`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceidentifier)
   */
  public fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  /**
   * A value that indicates whether to enable Performance Insights for the DB Instance.
   *
   * For more information, see [Using Amazon Performance
   * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
   */
  public fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  /**
   * The time range each week during which system maintenance can occur, in Universal Coordinated
   * Time (UTC).
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region , occurring on a random day of the week.
   *
   * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
   *
   * Constraints: Minimum 30-minute window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The tags to be assigned to the instance.
   *
   * You can assign up to 10 tags to an instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB.
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB.
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param availabilityZone The Amazon EC2 Availability Zone that the instance is created in.
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param caCertificateIdentifier The CA certificate identifier to use for the DB instance's
     * server certificate.
     * For more information, see [Updating Your Amazon DocumentDB TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
     * TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
     * TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    /**
     * @param dbClusterIdentifier The identifier of the cluster that the instance will belong to. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbInstanceClass The compute and memory capacity of the instance;. 
     * for example, `db.m4.large` . If you change the class of an instance there can be some
     * interruption in the cluster's service.
     */
    public fun dbInstanceClass(dbInstanceClass: String)

    /**
     * @param dbInstanceIdentifier The instance identifier. This parameter is stored as a lowercase
     * string.
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `mydbinstance`
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    /**
     * @param preferredMaintenanceWindow The time range each week during which system maintenance
     * can occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param tags The tags to be assigned to the instance.
     * You can assign up to 10 tags to an instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be assigned to the instance.
     * You can assign up to 10 tags to an instance.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBInstanceProps.builder()

    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB.
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB.
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZone The Amazon EC2 Availability Zone that the instance is created in.
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param caCertificateIdentifier The CA certificate identifier to use for the DB instance's
     * server certificate.
     * For more information, see [Updating Your Amazon DocumentDB TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
     * TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
     * TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     */
    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dbClusterIdentifier The identifier of the cluster that the instance will belong to. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbInstanceClass The compute and memory capacity of the instance;. 
     * for example, `db.m4.large` . If you change the class of an instance there can be some
     * interruption in the cluster's service.
     */
    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    /**
     * @param dbInstanceIdentifier The instance identifier. This parameter is stored as a lowercase
     * string.
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `mydbinstance`
     */
    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param preferredMaintenanceWindow The time range each week during which system maintenance
     * can occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param tags The tags to be assigned to the instance.
     * You can assign up to 10 tags to an instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be assigned to the instance.
     * You can assign up to 10 tags to an instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstanceProps,
  ) : CdkObject(cdkObject),
      CfnDBInstanceProps {
    /**
     * This parameter does not apply to Amazon DocumentDB.
     *
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The Amazon EC2 Availability Zone that the instance is created in.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The CA certificate identifier to use for the DB instance's server certificate.
     *
     * For more information, see [Updating Your Amazon DocumentDB TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-cacertificateidentifier)
     */
    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    /**
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     *
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, see [Updating Your Amazon DocumentDB
     * TLS
     * Certificates](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * and [Encrypting Data in
     * Transit](https://docs.aws.amazon.com/documentdb/latest/developerguide/security.encryption.ssl.html)
     * in the *Amazon DocumentDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-certificaterotationrestart)
     */
    override fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

    /**
     * The identifier of the cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

    /**
     * The compute and memory capacity of the instance;
     *
     * for example, `db.m4.large` . If you change the class of an instance there can be some
     * interruption in the cluster's service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceclass)
     */
    override fun dbInstanceClass(): String = unwrap(this).getDbInstanceClass()

    /**
     * The instance identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `mydbinstance`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceidentifier)
     */
    override fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
     */
    override fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The time range each week during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The tags to be assigned to the instance.
     *
     * You can assign up to 10 tags to an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstanceProps):
        CfnDBInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstanceProps):
        software.amazon.awscdk.services.docdb.CfnDBInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.CfnDBInstanceProps
  }
}
