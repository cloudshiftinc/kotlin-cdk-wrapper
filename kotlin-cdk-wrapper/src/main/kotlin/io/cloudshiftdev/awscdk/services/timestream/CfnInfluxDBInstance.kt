@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A DB instance is an isolated database environment running in the cloud.
 *
 * It is the basic building block of Amazon Timestream for InfluxDB. A DB instance can contain
 * multiple user-created databases (or organizations and buckets for the case of InfluxDb 2.x
 * databases), and can be accessed using the same client tools and applications you might use to access
 * a standalone self-managed InfluxDB instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * CfnInfluxDBInstance cfnInfluxDBInstance = CfnInfluxDBInstance.Builder.create(this,
 * "MyCfnInfluxDBInstance")
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
public open class CfnInfluxDBInstance(
  cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.timestream.CfnInfluxDBInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInfluxDBInstanceProps,
  ) :
      this(software.amazon.awscdk.services.timestream.CfnInfluxDBInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInfluxDBInstanceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInfluxDBInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInfluxDBInstanceProps(props)
  )

  /**
   * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
   */
  public open fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  /**
   * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
   */
  public open fun allocatedStorage(`value`: Number) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the DB instance.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Availability Zone in which the DB instance resides.
   */
  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  /**
   * The endpoint used to connect to InfluxDB.
   *
   * The default InfluxDB port is 8086.
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * A service-generated unique identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Secrets Manager secret containing the initial
   * InfluxDB authorization parameters.
   *
   * The secret value is a JSON formatted key-value pair holding InfluxDB authorization values:
   * organization, bucket, username, and password.
   */
  public open fun attrInfluxAuthParametersSecretArn(): String =
      unwrap(this).getAttrInfluxAuthParametersSecretArn()

  /**
   * Describes an Availability Zone in which the InfluxDB instance is located.
   */
  public open fun attrSecondaryAvailabilityZone(): String =
      unwrap(this).getAttrSecondaryAvailabilityZone()

  /**
   * The status of the DB instance.
   *
   * Valid Values: `CREATING` | `AVAILABLE` | `DELETING` | `MODIFYING` | `UPDATING` | `DELETED` |
   * `FAILED`
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The name of the initial InfluxDB bucket.
   */
  public open fun bucket(): String? = unwrap(this).getBucket()

  /**
   * The name of the initial InfluxDB bucket.
   */
  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Timestream for InfluxDB DB instance type to run on.
   */
  public open fun dbInstanceType(): String? = unwrap(this).getDbInstanceType()

  /**
   * The Timestream for InfluxDB DB instance type to run on.
   */
  public open fun dbInstanceType(`value`: String) {
    unwrap(this).setDbInstanceType(`value`)
  }

  /**
   * The name or id of the DB parameter group to assign to your DB instance.
   */
  public open fun dbParameterGroupIdentifier(): String? =
      unwrap(this).getDbParameterGroupIdentifier()

  /**
   * The name or id of the DB parameter group to assign to your DB instance.
   */
  public open fun dbParameterGroupIdentifier(`value`: String) {
    unwrap(this).setDbParameterGroupIdentifier(`value`)
  }

  /**
   * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
   */
  public open fun dbStorageType(): String? = unwrap(this).getDbStorageType()

  /**
   * The Timestream for InfluxDB DB storage type to read and write InfluxDB data.
   */
  public open fun dbStorageType(`value`: String) {
    unwrap(this).setDbStorageType(`value`)
  }

  /**
   * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
   * Standby for High availability.
   */
  public open fun deploymentType(): String? = unwrap(this).getDeploymentType()

  /**
   * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
   * Standby for High availability.
   */
  public open fun deploymentType(`value`: String) {
    unwrap(this).setDeploymentType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   */
  public open fun logDeliveryConfiguration(): Any? = unwrap(this).getLogDeliveryConfiguration()

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   */
  public open fun logDeliveryConfiguration(`value`: IResolvable) {
    unwrap(this).setLogDeliveryConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   */
  public open fun logDeliveryConfiguration(`value`: LogDeliveryConfigurationProperty) {
    unwrap(this).setLogDeliveryConfiguration(`value`.let(LogDeliveryConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("691015c1f5050ac16f1295c3c5f142f2d89459547a6702949be8c89a8db3b94d")
  public open
      fun logDeliveryConfiguration(`value`: LogDeliveryConfigurationProperty.Builder.() -> Unit):
      Unit = logDeliveryConfiguration(LogDeliveryConfigurationProperty(`value`))

  /**
   * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
   * for InfluxDB API and CLI commands.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
   * for InfluxDB API and CLI commands.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The name of the initial organization for the initial admin user in InfluxDB.
   */
  public open fun organization(): String? = unwrap(this).getOrganization()

  /**
   * The name of the initial organization for the initial admin user in InfluxDB.
   */
  public open fun organization(`value`: String) {
    unwrap(this).setOrganization(`value`)
  }

  /**
   * The password of the initial admin user created in InfluxDB.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The password of the initial admin user created in InfluxDB.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * Configures the DB instance with a public IP to facilitate access.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Configures the DB instance with a public IP to facilitate access.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Configures the DB instance with a public IP to facilitate access.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to associate with the DB instance.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs to associate with the DB instance.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to associate with the DB instance.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The username of the initial admin user created in InfluxDB.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The username of the initial admin user created in InfluxDB.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A list of VPC security group IDs to associate with the DB instance.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of VPC security group IDs to associate with the DB instance.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * A list of VPC security group IDs to associate with the DB instance.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A list of VPC subnet IDs to associate with the DB instance.
   */
  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds() ?: emptyList()

  /**
   * A list of VPC subnet IDs to associate with the DB instance.
   */
  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  /**
   * A list of VPC subnet IDs to associate with the DB instance.
   */
  public open fun vpcSubnetIds(vararg `value`: String): Unit = vpcSubnetIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.timestream.CfnInfluxDBInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-allocatedstorage)
     * @param allocatedStorage The amount of storage to allocate for your DB storage type in GiB
     * (gibibytes). 
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * The name of the initial InfluxDB bucket.
     *
     * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
     * retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-bucket)
     * @param bucket The name of the initial InfluxDB bucket. 
     */
    public fun bucket(bucket: String)

    /**
     * The Timestream for InfluxDB DB instance type to run on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbinstancetype)
     * @param dbInstanceType The Timestream for InfluxDB DB instance type to run on. 
     */
    public fun dbInstanceType(dbInstanceType: String)

    /**
     * The name or id of the DB parameter group to assign to your DB instance.
     *
     * DB parameter groups specify how the database is configured. For example, DB parameter groups
     * can specify the limit for query concurrency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbparametergroupidentifier)
     * @param dbParameterGroupIdentifier The name or id of the DB parameter group to assign to your
     * DB instance. 
     */
    public fun dbParameterGroupIdentifier(dbParameterGroupIdentifier: String)

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
     * @param dbStorageType The Timestream for InfluxDB DB storage type to read and write InfluxDB
     * data. 
     */
    public fun dbStorageType(dbStorageType: String)

    /**
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
     * Standby for High availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-deploymenttype)
     * @param deploymentType Specifies whether the Timestream for InfluxDB is deployed as Single-AZ
     * or with a MultiAZ Standby for High availability. 
     */
    public fun deploymentType(deploymentType: String)

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    public fun logDeliveryConfiguration(logDeliveryConfiguration: IResolvable)

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    public fun logDeliveryConfiguration(logDeliveryConfiguration: LogDeliveryConfigurationProperty)

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("071edc41ae4f860f1208b59587cad1acf9ab2ef97bf8c693921efec85e8f4b5e")
    public
        fun logDeliveryConfiguration(logDeliveryConfiguration: LogDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
     * for InfluxDB API and CLI commands.
     *
     * This name will also be a prefix included in the endpoint. DB instance names must be unique
     * per customer and per region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-name)
     * @param name The name that uniquely identifies the DB instance when interacting with the
     * Amazon Timestream for InfluxDB API and CLI commands. 
     */
    public fun name(name: String)

    /**
     * The name of the initial organization for the initial admin user in InfluxDB.
     *
     * An InfluxDB organization is a workspace for a group of users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-organization)
     * @param organization The name of the initial organization for the initial admin user in
     * InfluxDB. 
     */
    public fun organization(organization: String)

    /**
     * The password of the initial admin user created in InfluxDB.
     *
     * This password will allow you to access the InfluxDB UI to perform various administrative
     * tasks and also use the InfluxDB CLI to create an operator token. These attributes will be stored
     * in a Secret created in Amazon SecretManager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-password)
     * @param password The password of the initial admin user created in InfluxDB. 
     */
    public fun password(password: String)

    /**
     * Configures the DB instance with a public IP to facilitate access.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * Configures the DB instance with a public IP to facilitate access.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * A list of key-value pairs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
     * @param tags A list of key-value pairs to associate with the DB instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
     * @param tags A list of key-value pairs to associate with the DB instance. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The username of the initial admin user created in InfluxDB.
     *
     * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
     * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
     * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
     * will be stored in a Secret created in Amazon Secrets Manager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-username)
     * @param username The username of the initial admin user created in InfluxDB. 
     */
    public fun username(username: String)

    /**
     * A list of VPC security group IDs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * A list of VPC security group IDs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * A list of VPC subnet IDs to associate with the DB instance.
     *
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance. 
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * A list of VPC subnet IDs to associate with the DB instance.
     *
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance. 
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.Builder =
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.Builder.create(scope, id)

    /**
     * The amount of storage to allocate for your DB storage type in GiB (gibibytes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-allocatedstorage)
     * @param allocatedStorage The amount of storage to allocate for your DB storage type in GiB
     * (gibibytes). 
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * The name of the initial InfluxDB bucket.
     *
     * All InfluxDB data is stored in a bucket. A bucket combines the concept of a database and a
     * retention period (the duration of time that each data point persists). A bucket belongs to an
     * organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-bucket)
     * @param bucket The name of the initial InfluxDB bucket. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * The Timestream for InfluxDB DB instance type to run on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbinstancetype)
     * @param dbInstanceType The Timestream for InfluxDB DB instance type to run on. 
     */
    override fun dbInstanceType(dbInstanceType: String) {
      cdkBuilder.dbInstanceType(dbInstanceType)
    }

    /**
     * The name or id of the DB parameter group to assign to your DB instance.
     *
     * DB parameter groups specify how the database is configured. For example, DB parameter groups
     * can specify the limit for query concurrency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-dbparametergroupidentifier)
     * @param dbParameterGroupIdentifier The name or id of the DB parameter group to assign to your
     * DB instance. 
     */
    override fun dbParameterGroupIdentifier(dbParameterGroupIdentifier: String) {
      cdkBuilder.dbParameterGroupIdentifier(dbParameterGroupIdentifier)
    }

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
     * @param dbStorageType The Timestream for InfluxDB DB storage type to read and write InfluxDB
     * data. 
     */
    override fun dbStorageType(dbStorageType: String) {
      cdkBuilder.dbStorageType(dbStorageType)
    }

    /**
     * Specifies whether the Timestream for InfluxDB is deployed as Single-AZ or with a MultiAZ
     * Standby for High availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-deploymenttype)
     * @param deploymentType Specifies whether the Timestream for InfluxDB is deployed as Single-AZ
     * or with a MultiAZ Standby for High availability. 
     */
    override fun deploymentType(deploymentType: String) {
      cdkBuilder.deploymentType(deploymentType)
    }

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    override fun logDeliveryConfiguration(logDeliveryConfiguration: IResolvable) {
      cdkBuilder.logDeliveryConfiguration(logDeliveryConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    override
        fun logDeliveryConfiguration(logDeliveryConfiguration: LogDeliveryConfigurationProperty) {
      cdkBuilder.logDeliveryConfiguration(logDeliveryConfiguration.let(LogDeliveryConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration)
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified
     * S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("071edc41ae4f860f1208b59587cad1acf9ab2ef97bf8c693921efec85e8f4b5e")
    override
        fun logDeliveryConfiguration(logDeliveryConfiguration: LogDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit = logDeliveryConfiguration(LogDeliveryConfigurationProperty(logDeliveryConfiguration))

    /**
     * The name that uniquely identifies the DB instance when interacting with the Amazon Timestream
     * for InfluxDB API and CLI commands.
     *
     * This name will also be a prefix included in the endpoint. DB instance names must be unique
     * per customer and per region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-name)
     * @param name The name that uniquely identifies the DB instance when interacting with the
     * Amazon Timestream for InfluxDB API and CLI commands. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The name of the initial organization for the initial admin user in InfluxDB.
     *
     * An InfluxDB organization is a workspace for a group of users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-organization)
     * @param organization The name of the initial organization for the initial admin user in
     * InfluxDB. 
     */
    override fun organization(organization: String) {
      cdkBuilder.organization(organization)
    }

    /**
     * The password of the initial admin user created in InfluxDB.
     *
     * This password will allow you to access the InfluxDB UI to perform various administrative
     * tasks and also use the InfluxDB CLI to create an operator token. These attributes will be stored
     * in a Secret created in Amazon SecretManager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-password)
     * @param password The password of the initial admin user created in InfluxDB. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * Configures the DB instance with a public IP to facilitate access.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Configures the DB instance with a public IP to facilitate access.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-publiclyaccessible)
     * @param publiclyAccessible Configures the DB instance with a public IP to facilitate access. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of key-value pairs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
     * @param tags A list of key-value pairs to associate with the DB instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-tags)
     * @param tags A list of key-value pairs to associate with the DB instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The username of the initial admin user created in InfluxDB.
     *
     * Must start with a letter and can't end with a hyphen or contain two consecutive hyphens. For
     * example, my-user1. This username will allow you to access the InfluxDB UI to perform various
     * administrative tasks and also use the InfluxDB CLI to create an operator token. These attributes
     * will be stored in a Secret created in Amazon Secrets Manager in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-username)
     * @param username The username of the initial admin user created in InfluxDB. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    /**
     * A list of VPC security group IDs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * A list of VPC security group IDs to associate with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of VPC security group IDs to associate with the DB
     * instance. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * A list of VPC subnet IDs to associate with the DB instance.
     *
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance. 
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * A list of VPC subnet IDs to associate with the DB instance.
     *
     * Provide at least two VPC subnet IDs in different availability zones when deploying with a
     * Multi-AZ standby.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-influxdbinstance.html#cfn-timestream-influxdbinstance-vpcsubnetids)
     * @param vpcSubnetIds A list of VPC subnet IDs to associate with the DB instance. 
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnInfluxDBInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInfluxDBInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInfluxDBInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance):
        CfnInfluxDBInstance = CfnInfluxDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInfluxDBInstance):
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstance = wrapped.cdkObject as
        software.amazon.awscdk.services.timestream.CfnInfluxDBInstance
  }

  /**
   * Configuration for sending InfluxDB engine logs to a specified S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * LogDeliveryConfigurationProperty logDeliveryConfigurationProperty =
   * LogDeliveryConfigurationProperty.builder()
   * .s3Configuration(S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .enabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-logdeliveryconfiguration.html)
   */
  public interface LogDeliveryConfigurationProperty {
    /**
     * Configuration for S3 bucket log delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-logdeliveryconfiguration.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * A builder for [LogDeliveryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty)

      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86584c730b4c4a4feaa47dc3675a07bbb364305722a730b4afa1debcd7a4a669")
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty.builder()

      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3Configuration Configuration for S3 bucket log delivery. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86584c730b4c4a4feaa47dc3675a07bbb364305722a730b4afa1debcd7a4a669")
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3ConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject),
        LogDeliveryConfigurationProperty {
      /**
       * Configuration for S3 bucket log delivery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-logdeliveryconfiguration.html#cfn-timestream-influxdbinstance-logdeliveryconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty):
          LogDeliveryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogDeliveryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.LogDeliveryConfigurationProperty
    }
  }

  /**
   * Configuration for S3 bucket log delivery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-s3configuration.html)
   */
  public interface S3ConfigurationProperty {
    /**
     * The bucket name of the customer S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-s3configuration.html#cfn-timestream-influxdbinstance-s3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * Indicates whether log delivery to the S3 bucket is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-s3configuration.html#cfn-timestream-influxdbinstance-s3configuration-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [S3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The bucket name of the customer S3 bucket. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param enabled Indicates whether log delivery to the S3 bucket is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether log delivery to the S3 bucket is enabled. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty.builder()

      /**
       * @param bucketName The bucket name of the customer S3 bucket. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param enabled Indicates whether log delivery to the S3 bucket is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether log delivery to the S3 bucket is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3ConfigurationProperty {
      /**
       * The bucket name of the customer S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-s3configuration.html#cfn-timestream-influxdbinstance-s3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * Indicates whether log delivery to the S3 bucket is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-influxdbinstance-s3configuration.html#cfn-timestream-influxdbinstance-s3configuration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty):
          S3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnInfluxDBInstance.S3ConfigurationProperty
    }
  }
}
