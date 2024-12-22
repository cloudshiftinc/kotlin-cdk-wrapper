@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInfluxDBInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * CfnInfluxDBInstanceProps cfnInfluxDBInstanceProps = CfnInfluxDBInstanceProps.builder()
 * .allocatedStorage(123)
 * .bucket("bucket")
 * .dbInstanceType("dbInstanceType")
 * .dbParameterGroupIdentifier("dbParameterGroupIdentifier")
 * .dbStorageType("dbStorageType")
 * .deploymentType("deploymentType")
 * .logDeliveryConfiguration(LogDeliveryConfigurationProperty.builder()
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .enabled(false)
 * .build())
 * .build())
 * .name("name")
 * .organization("organization")
 * .password("password")
 * .port(123)
 * .publiclyAccessible(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .username("username")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .vpcSubnetIds(List.of("vpcSubnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html)
 */
public interface CfnInfluxDBInstanceProps {
  /**
   * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-allocatedstorage)
   */
  public fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  /**
   * The name of the initial InfluxDB bucket.
   *
   * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
   * retention period (the duration of time that each data point persists). A bucket belongs to an
   * organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-bucket)
   */
  public fun bucket(): String? = unwrap(this).getBucket()

  /**
   * The Timestream for InfluxDB DB instance type to run on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbinstancetype)
   */
  public fun dbInstanceType(): String? = unwrap(this).getDbInstanceType()

  /**
   * The name or id of the DB parameter group to assign to your DB instance.
   *
   * DB parameter groups specify how the database is configured. For example, DB parameter groups
   * can specify the limit for query concurrency.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbparametergroupidentifier)
   */
  public fun dbParameterGroupIdentifier(): String? = unwrap(this).getDbParameterGroupIdentifier()

  /**
   * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
   *
   * You can choose between 3 different types of provisioned Influx IOPS included storage according
   * to your workloads requirements:
   *
   * * Influx IO Included 3000 IOPS
   * * Influx IO Included 12000 IOPS
   * * Influx IO Included 16000 IOPS
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbstoragetype)
   */
  public fun dbStorageType(): String? = unwrap(this).getDbStorageType()

  /**
   * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
   * Standby for High availability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-deploymenttype)
   */
  public fun deploymentType(): String? = unwrap(this).getDeploymentType()

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
   */
  public fun logDeliveryConfiguration(): Any? = unwrap(this).getLogDeliveryConfiguration()

  /**
   * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
   * for InfluxDB API and CLI commands.
   *
   * This name will also be a prefix included in the endpoint. DB instance names must be unique per
   * customer and per region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The name of the initial organization for the initial admin user in InfluxDB.
   *
   * An InfluxDB organization is a workspace for a group of users.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-organization)
   */
  public fun organization(): String? = unwrap(this).getOrganization()

  /**
   * The password of the initial admin user created in InfluxDB.
   *
   * This password will allow you to access the InfluxDB UI to perform various administrative tasks
   * and also use the InfluxDB CLI to create an operator token. These attributes will be stored in a
   * Secret created in Amazon SecretManager in your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * The port number on which InfluxDB accepts connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Configures the DB instance with a public IP to facilitate access.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * A list of key-value pairs to associate with the DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The username of the initial admin user created in InfluxDB.
   *
   * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
   * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
   * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
   * will be stored in a Secret created in Amazon Secrets Manager in your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-username)
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A list of VPC security group IDs to associate with the DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of VPC subnet IDs to associate with the DB instance.
   *
   * Provide at least two VPC subnet IDs in different availability zones when deploying with a
   * Multi-AZ standby.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
   */
  public fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds() ?: emptyList()

  /**
   * A builder for [CfnInfluxDBInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedStorage The amount of storage to allocate for your DB storage type in GiB
     * (gibibytes).
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * @param bucket The name of the initial InfluxDB bucket.
     * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
     * retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     */
    public fun bucket(bucket: String)

    /**
     * @param dbInstanceType The Timestream for InfluxDB DB instance type to run on.
     */
    public fun dbInstanceType(dbInstanceType: String)

    /**
     * @param dbParameterGroupIdentifier The name or id of the DB parameter group to assign to your
     * DB instance.
     * DB parameter groups specify how the database is configured. For example, DB parameter groups
     * can specify the limit for query concurrency.
     */
    public fun dbParameterGroupIdentifier(dbParameterGroupIdentifier: String)

    /**
     * @param dbStorageType The Timestream for InfluxDB DB storage type to read and write InfluxDB
     * data.
     * You can choose between 3 different types of provisioned Influx IOPS included storage
     * according to your workloads requirements:
     *
     * * Influx IO Included 3000 IOPS
     * * Influx IO Included 12000 IOPS
     * * Influx IO Included 16000 IOPS
     */
    public fun dbStorageType(dbStorageType: String)

    /**
     * @param deploymentType Specifies whether the Timestream for InfluxDB is deployed as Single-AZ
     * or with a MultiAZ Standby for High availability.
     */
    public fun deploymentType(deploymentType: String)

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    public fun logDeliveryConfiguration(logDeliveryConfiguration: IResolvable)

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    public
        fun logDeliveryConfiguration(logDeliveryConfiguration: CfnInfluxDBInstance.LogDeliveryConfigurationProperty)

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34f8d628b0378c94f09c7fa77e2a81a33872b464ee3f8e94340577a3ab9cb8cb")
    public
        fun logDeliveryConfiguration(logDeliveryConfiguration: CfnInfluxDBInstance.LogDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name that uniquely identifies the DB instance when interacting with the
     * Amazon Timestream for InfluxDB API and CLI commands.
     * This name will also be a prefix included in the endpoint. DB instance names must be unique
     * per customer and per region.
     */
    public fun name(name: String)

    /**
     * @param organization The name of the initial organization for the initial admin user in
     * InfluxDB.
     * An InfluxDB organization is a workspace for a group of users.
     */
    public fun organization(organization: String)

    /**
     * @param password The password of the initial admin user created in InfluxDB.
     * This password will allow you to access the InfluxDB UI to perform various administrative
     * tasks and also use the InfluxDB CLI to create an operator token. These attributes will be stored
     * in a Secret created in Amazon SecretManager in your account.
     */
    public fun password(password: String)

    /**
     * @param port The port number on which InfluxDB accepts connections.
     */
    public fun port(port: Number)

    /**
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param tags A list of key-value pairs to associate with the DB instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to associate with the DB instance.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param username The username of the initial admin user created in InfluxDB.
     * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
     * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
     * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
     * will be stored in a Secret created in Amazon Secrets Manager in your account.
     */
    public fun username(username: String)

    /**
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance.
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance.
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps.Builder =
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps.builder()

    /**
     * @param allocatedStorage The amount of storage to allocate for your DB storage type in GiB
     * (gibibytes).
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param bucket The name of the initial InfluxDB bucket.
     * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
     * retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param dbInstanceType The Timestream for InfluxDB DB instance type to run on.
     */
    override fun dbInstanceType(dbInstanceType: String) {
      cdkBuilder.dbInstanceType(dbInstanceType)
    }

    /**
     * @param dbParameterGroupIdentifier The name or id of the DB parameter group to assign to your
     * DB instance.
     * DB parameter groups specify how the database is configured. For example, DB parameter groups
     * can specify the limit for query concurrency.
     */
    override fun dbParameterGroupIdentifier(dbParameterGroupIdentifier: String) {
      cdkBuilder.dbParameterGroupIdentifier(dbParameterGroupIdentifier)
    }

    /**
     * @param dbStorageType The Timestream for InfluxDB DB storage type to read and write InfluxDB
     * data.
     * You can choose between 3 different types of provisioned Influx IOPS included storage
     * according to your workloads requirements:
     *
     * * Influx IO Included 3000 IOPS
     * * Influx IO Included 12000 IOPS
     * * Influx IO Included 16000 IOPS
     */
    override fun dbStorageType(dbStorageType: String) {
      cdkBuilder.dbStorageType(dbStorageType)
    }

    /**
     * @param deploymentType Specifies whether the Timestream for InfluxDB is deployed as Single-AZ
     * or with a MultiAZ Standby for High availability.
     */
    override fun deploymentType(deploymentType: String) {
      cdkBuilder.deploymentType(deploymentType)
    }

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    override fun logDeliveryConfiguration(logDeliveryConfiguration: IResolvable) {
      cdkBuilder.logDeliveryConfiguration(logDeliveryConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    override
        fun logDeliveryConfiguration(logDeliveryConfiguration: CfnInfluxDBInstance.LogDeliveryConfigurationProperty) {
      cdkBuilder.logDeliveryConfiguration(logDeliveryConfiguration.let(CfnInfluxDBInstance.LogDeliveryConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34f8d628b0378c94f09c7fa77e2a81a33872b464ee3f8e94340577a3ab9cb8cb")
    override
        fun logDeliveryConfiguration(logDeliveryConfiguration: CfnInfluxDBInstance.LogDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        logDeliveryConfiguration(CfnInfluxDBInstance.LogDeliveryConfigurationProperty(logDeliveryConfiguration))

    /**
     * @param name The name that uniquely identifies the DB instance when interacting with the
     * Amazon Timestream for InfluxDB API and CLI commands.
     * This name will also be a prefix included in the endpoint. DB instance names must be unique
     * per customer and per region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param organization The name of the initial organization for the initial admin user in
     * InfluxDB.
     * An InfluxDB organization is a workspace for a group of users.
     */
    override fun organization(organization: String) {
      cdkBuilder.organization(organization)
    }

    /**
     * @param password The password of the initial admin user created in InfluxDB.
     * This password will allow you to access the InfluxDB UI to perform various administrative
     * tasks and also use the InfluxDB CLI to create an operator token. These attributes will be stored
     * in a Secret created in Amazon SecretManager in your account.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param port The port number on which InfluxDB accepts connections.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to associate with the DB instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to associate with the DB instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param username The username of the initial admin user created in InfluxDB.
     * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
     * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
     * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
     * will be stored in a Secret created in Amazon Secrets Manager in your account.
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    /**
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance.
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance.
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps,
  ) : CdkObject(cdkObject),
      CfnInfluxDBInstanceProps {
    /**
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-allocatedstorage)
     */
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

    /**
     * The name of the initial InfluxDB bucket.
     *
     * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
     * retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-bucket)
     */
    override fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The Timestream for InfluxDB DB instance type to run on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbinstancetype)
     */
    override fun dbInstanceType(): String? = unwrap(this).getDbInstanceType()

    /**
     * The name or id of the DB parameter group to assign to your DB instance.
     *
     * DB parameter groups specify how the database is configured. For example, DB parameter groups
     * can specify the limit for query concurrency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbparametergroupidentifier)
     */
    override fun dbParameterGroupIdentifier(): String? =
        unwrap(this).getDbParameterGroupIdentifier()

    /**
     * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
     *
     * You can choose between 3 different types of provisioned Influx IOPS included storage
     * according to your workloads requirements:
     *
     * * Influx IO Included 3000 IOPS
     * * Influx IO Included 12000 IOPS
     * * Influx IO Included 16000 IOPS
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbstoragetype)
     */
    override fun dbStorageType(): String? = unwrap(this).getDbStorageType()

    /**
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
     * Standby for High availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-deploymenttype)
     */
    override fun deploymentType(): String? = unwrap(this).getDeploymentType()

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     */
    override fun logDeliveryConfiguration(): Any? = unwrap(this).getLogDeliveryConfiguration()

    /**
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
     * for InfluxDB API and CLI commands.
     *
     * This name will also be a prefix included in the endpoint. DB instance names must be unique
     * per customer and per region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The name of the initial organization for the initial admin user in InfluxDB.
     *
     * An InfluxDB organization is a workspace for a group of users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-organization)
     */
    override fun organization(): String? = unwrap(this).getOrganization()

    /**
     * The password of the initial admin user created in InfluxDB.
     *
     * This password will allow you to access the InfluxDB UI to perform various administrative
     * tasks and also use the InfluxDB CLI to create an operator token. These attributes will be stored
     * in a Secret created in Amazon SecretManager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * The port number on which InfluxDB accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Configures the DB instance with a public IP to facilitate access.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * A list of key-value pairs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The username of the initial admin user created in InfluxDB.
     *
     * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
     * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
     * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
     * will be stored in a Secret created in Amazon Secrets Manager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-username)
     */
    override fun username(): String? = unwrap(this).getUsername()

    /**
     * A list of VPC security group IDs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    /**
     * A list of VPC subnet IDs to associate with the DB instance.
     *
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
     */
    override fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInfluxDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps):
        CfnInfluxDBInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInfluxDBInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInfluxDBInstanceProps):
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps
  }
}
