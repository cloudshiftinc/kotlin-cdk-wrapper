package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The connection endpoint for the instance.
   *
   * For example: `sample-cluster.cluster-abcdefghijkl.us-east-1.docdb.amazonaws.com` .
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The port number on which the database accepts connections, such as `27017` .
   */
  public open fun attrPort(): String = unwrap(this).getAttrPort()

  /**
   * This parameter does not apply to Amazon DocumentDB.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * This parameter does not apply to Amazon DocumentDB.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * This parameter does not apply to Amazon DocumentDB.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon EC2 Availability Zone that the instance is created in.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Amazon EC2 Availability Zone that the instance is created in.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The CA certificate identifier to use for the DB instance's server certificate.
   */
  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * The CA certificate identifier to use for the DB instance's server certificate.
   */
  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
  }

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(`value`: Boolean) {
    unwrap(this).setCertificateRotationRestart(`value`)
  }

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(`value`: IResolvable) {
    unwrap(this).setCertificateRotationRestart(`value`.let(IResolvable::unwrap))
  }

  /**
   * The identifier of the cluster that the instance will belong to.
   */
  public open fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

  /**
   * The identifier of the cluster that the instance will belong to.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * The compute and memory capacity of the instance;
   */
  public open fun dbInstanceClass(): String = unwrap(this).getDbInstanceClass()

  /**
   * The compute and memory capacity of the instance;
   */
  public open fun dbInstanceClass(`value`: String) {
    unwrap(this).setDbInstanceClass(`value`)
  }

  /**
   * The instance identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  /**
   * The instance identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbInstanceIdentifier(`value`: String) {
    unwrap(this).setDbInstanceIdentifier(`value`)
  }

  /**
   * A value that indicates whether to enable Performance Insights for the DB Instance.
   */
  public open fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  /**
   * A value that indicates whether to enable Performance Insights for the DB Instance.
   */
  public open fun enablePerformanceInsights(`value`: Boolean) {
    unwrap(this).setEnablePerformanceInsights(`value`)
  }

  /**
   * A value that indicates whether to enable Performance Insights for the DB Instance.
   */
  public open fun enablePerformanceInsights(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceInsights(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The time range each week during which system maintenance can occur, in Universal Coordinated
   * Time (UTC).
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The time range each week during which system maintenance can occur, in Universal Coordinated
   * Time (UTC).
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be assigned to the instance.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be assigned to the instance.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to be assigned to the instance.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.CfnDBInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This parameter does not apply to Amazon DocumentDB.
     *
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * This parameter does not apply to Amazon DocumentDB.
     *
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * The Amazon EC2 Availability Zone that the instance is created in.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-availabilityzone)
     * @param availabilityZone The Amazon EC2 Availability Zone that the instance is created in. 
     */
    public fun availabilityZone(availabilityZone: String)

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
     * @param caCertificateIdentifier The CA certificate identifier to use for the DB instance's
     * server certificate. 
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    /**
     * The identifier of the cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbclusteridentifier)
     * @param dbClusterIdentifier The identifier of the cluster that the instance will belong to. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * The compute and memory capacity of the instance;
     *
     * for example, `db.m4.large` . If you change the class of an instance there can be some
     * interruption in the cluster's service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceclass)
     * @param dbInstanceClass The compute and memory capacity of the instance;. 
     */
    public fun dbInstanceClass(dbInstanceClass: String)

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
     * @param dbInstanceIdentifier The instance identifier. This parameter is stored as a lowercase
     * string. 
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

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
     * @param preferredMaintenanceWindow The time range each week during which system maintenance
     * can occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * The tags to be assigned to the instance.
     *
     * You can assign up to 10 tags to an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
     * @param tags The tags to be assigned to the instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be assigned to the instance.
     *
     * You can assign up to 10 tags to an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
     * @param tags The tags to be assigned to the instance. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBInstance.Builder =
        software.amazon.awscdk.services.docdb.CfnDBInstance.Builder.create(scope, id)

    /**
     * This parameter does not apply to Amazon DocumentDB.
     *
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * This parameter does not apply to Amazon DocumentDB.
     *
     * Amazon DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * The Amazon EC2 Availability Zone that the instance is created in.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-availabilityzone)
     * @param availabilityZone The Amazon EC2 Availability Zone that the instance is created in. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

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
     * @param caCertificateIdentifier The CA certificate identifier to use for the DB instance's
     * server certificate. 
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
    }

    /**
     * The identifier of the cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbclusteridentifier)
     * @param dbClusterIdentifier The identifier of the cluster that the instance will belong to. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * The compute and memory capacity of the instance;
     *
     * for example, `db.m4.large` . If you change the class of an instance there can be some
     * interruption in the cluster's service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-dbinstanceclass)
     * @param dbInstanceClass The compute and memory capacity of the instance;. 
     */
    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

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
     * @param dbInstanceIdentifier The instance identifier. This parameter is stored as a lowercase
     * string. 
     */
    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * A value that indicates whether to enable Performance Insights for the DB Instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-enableperformanceinsights)
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the DB Instance. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

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
     * @param preferredMaintenanceWindow The time range each week during which system maintenance
     * can occur, in Universal Coordinated Time (UTC). 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The tags to be assigned to the instance.
     *
     * You can assign up to 10 tags to an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
     * @param tags The tags to be assigned to the instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to be assigned to the instance.
     *
     * You can assign up to 10 tags to an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html#cfn-docdb-dbinstance-tags)
     * @param tags The tags to be assigned to the instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBInstance = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.docdb.CfnDBInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstance): CfnDBInstance
        = CfnDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstance): software.amazon.awscdk.services.docdb.CfnDBInstance
        = wrapped.cdkObject
  }
}
