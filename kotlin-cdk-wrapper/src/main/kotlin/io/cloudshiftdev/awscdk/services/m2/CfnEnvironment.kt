@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a runtime environment for a given runtime engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.m2.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .engineType("engineType")
 * .instanceType("instanceType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .engineVersion("engineVersion")
 * .highAvailabilityConfig(HighAvailabilityConfigProperty.builder()
 * .desiredCapacity(123)
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .storageConfigurations(List.of(StorageConfigurationProperty.builder()
 * .efs(EfsStorageConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .mountPoint("mountPoint")
 * .build())
 * .fsx(FsxStorageConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .mountPoint("mountPoint")
 * .build())
 * .build()))
 * .subnetIds(List.of("subnetIds"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html)
 */
public open class CfnEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.m2.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEnvironmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the runtime environment.
   */
  public open fun attrEnvironmentArn(): String = unwrap(this).getAttrEnvironmentArn()

  /**
   * The unique identifier of the runtime environment.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The description of the runtime environment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the runtime environment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The target platform for the runtime environment.
   */
  public open fun engineType(): String = unwrap(this).getEngineType()

  /**
   * The target platform for the runtime environment.
   */
  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  /**
   * The version of the runtime engine.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version of the runtime engine.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Defines the details of a high availability configuration.
   */
  public open fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

  /**
   * Defines the details of a high availability configuration.
   */
  public open fun highAvailabilityConfig(`value`: IResolvable) {
    unwrap(this).setHighAvailabilityConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines the details of a high availability configuration.
   */
  public open fun highAvailabilityConfig(`value`: HighAvailabilityConfigProperty) {
    unwrap(this).setHighAvailabilityConfig(`value`.let(HighAvailabilityConfigProperty::unwrap))
  }

  /**
   * Defines the details of a high availability configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d085a9507d655bfdb1d242e2757f51c3a4bf6c7b9c18622417b4ca0bba03a40a")
  public open
      fun highAvailabilityConfig(`value`: HighAvailabilityConfigProperty.Builder.() -> Unit): Unit =
      highAvailabilityConfig(HighAvailabilityConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The instance type of the runtime environment.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The instance type of the runtime environment.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The identifier of a customer managed key.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The identifier of a customer managed key.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the runtime environment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the runtime environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Configures the maintenance window that you want for the runtime environment.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Configures the maintenance window that you want for the runtime environment.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * Specifies whether the runtime environment is publicly accessible.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Specifies whether the runtime environment is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Specifies whether the runtime environment is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Defines the storage configuration for a runtime environment.
   */
  public open fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

  /**
   * Defines the storage configuration for a runtime environment.
   */
  public open fun storageConfigurations(`value`: IResolvable) {
    unwrap(this).setStorageConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines the storage configuration for a runtime environment.
   */
  public open fun storageConfigurations(`value`: List<Any>) {
    unwrap(this).setStorageConfigurations(`value`)
  }

  /**
   * Defines the storage configuration for a runtime environment.
   */
  public open fun storageConfigurations(vararg `value`: Any): Unit =
      storageConfigurations(`value`.toList())

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.m2.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-description)
     * @param description The description of the runtime environment. 
     */
    public fun description(description: String)

    /**
     * The target platform for the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-enginetype)
     * @param engineType The target platform for the runtime environment. 
     */
    public fun engineType(engineType: String)

    /**
     * The version of the runtime engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-engineversion)
     * @param engineVersion The version of the runtime engine. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable)

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    public fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty)

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13c8004696035f79c161d3284044479a55962b5eea499af16c24cab14b58fc3")
    public
        fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty.Builder.() -> Unit)

    /**
     * The instance type of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-instancetype)
     * @param instanceType The instance type of the runtime environment. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-kmskeyid)
     * @param kmsKeyId The identifier of a customer managed key. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-name)
     * @param name The name of the runtime environment. 
     */
    public fun name(name: String)

    /**
     * Configures the maintenance window that you want for the runtime environment.
     *
     * The maintenance window must have the format `ddd:hh24:mi-ddd:hh24:mi` and must be less than
     * 24 hours. The following two examples are valid maintenance windows: `sun:23:45-mon:00:15` or
     * `sat:01:00-sat:03:00` .
     *
     * If you do not provide a value, a random system-generated value will be assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Configures the maintenance window that you want for the
     * runtime environment. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * Specifies whether the runtime environment is publicly accessible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * Specifies whether the runtime environment is publicly accessible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The list of security groups for the VPC associated with this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The list of security groups for the VPC associated with this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    public fun storageConfigurations(storageConfigurations: IResolvable)

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    public fun storageConfigurations(storageConfigurations: List<Any>)

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    public fun storageConfigurations(vararg storageConfigurations: Any)

    /**
     * The list of subnets associated with the VPC for this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The list of subnets associated with the VPC for this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnEnvironment.Builder =
        software.amazon.awscdk.services.m2.CfnEnvironment.Builder.create(scope, id)

    /**
     * The description of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-description)
     * @param description The description of the runtime environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The target platform for the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-enginetype)
     * @param engineType The target platform for the runtime environment. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * The version of the runtime engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-engineversion)
     * @param engineVersion The version of the runtime engine. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    override fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(IResolvable::unwrap))
    }

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    override fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(HighAvailabilityConfigProperty::unwrap))
    }

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     * @param highAvailabilityConfig Defines the details of a high availability configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13c8004696035f79c161d3284044479a55962b5eea499af16c24cab14b58fc3")
    override
        fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty.Builder.() -> Unit):
        Unit = highAvailabilityConfig(HighAvailabilityConfigProperty(highAvailabilityConfig))

    /**
     * The instance type of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-instancetype)
     * @param instanceType The instance type of the runtime environment. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-kmskeyid)
     * @param kmsKeyId The identifier of a customer managed key. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-name)
     * @param name The name of the runtime environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Configures the maintenance window that you want for the runtime environment.
     *
     * The maintenance window must have the format `ddd:hh24:mi-ddd:hh24:mi` and must be less than
     * 24 hours. The following two examples are valid maintenance windows: `sun:23:45-mon:00:15` or
     * `sat:01:00-sat:03:00` .
     *
     * If you do not provide a value, a random system-generated value will be assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Configures the maintenance window that you want for the
     * runtime environment. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * Specifies whether the runtime environment is publicly accessible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Specifies whether the runtime environment is publicly accessible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The list of security groups for the VPC associated with this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The list of security groups for the VPC associated with this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    override fun storageConfigurations(storageConfigurations: IResolvable) {
      cdkBuilder.storageConfigurations(storageConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    override fun storageConfigurations(storageConfigurations: List<Any>) {
      cdkBuilder.storageConfigurations(storageConfigurations)
    }

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     * @param storageConfigurations Defines the storage configuration for a runtime environment. 
     */
    override fun storageConfigurations(vararg storageConfigurations: Any): Unit =
        storageConfigurations(storageConfigurations.toList())

    /**
     * The list of subnets associated with the VPC for this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The list of subnets associated with the VPC for this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.m2.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment): CfnEnvironment
        = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment): software.amazon.awscdk.services.m2.CfnEnvironment
        = wrapped.cdkObject
  }

  /**
   * Defines the storage configuration for an Amazon EFS file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.m2.*;
   * EfsStorageConfigurationProperty efsStorageConfigurationProperty =
   * EfsStorageConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .mountPoint("mountPoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html)
   */
  public interface EfsStorageConfigurationProperty {
    /**
     * The file system identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html#cfn-m2-environment-efsstorageconfiguration-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * The mount point for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html#cfn-m2-environment-efsstorageconfiguration-mountpoint)
     */
    public fun mountPoint(): String

    /**
     * A builder for [EfsStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The file system identifier. 
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param mountPoint The mount point for the file system. 
       */
      public fun mountPoint(mountPoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty.builder()

      /**
       * @param fileSystemId The file system identifier. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param mountPoint The mount point for the file system. 
       */
      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty,
    ) : CdkObject(cdkObject), EfsStorageConfigurationProperty {
      /**
       * The file system identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html#cfn-m2-environment-efsstorageconfiguration-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      /**
       * The mount point for the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html#cfn-m2-environment-efsstorageconfiguration-mountpoint)
       */
      override fun mountPoint(): String = unwrap(this).getMountPoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EfsStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty):
          EfsStorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EfsStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsStorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty
    }
  }

  /**
   * Defines the storage configuration for an Amazon FSx file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.m2.*;
   * FsxStorageConfigurationProperty fsxStorageConfigurationProperty =
   * FsxStorageConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .mountPoint("mountPoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html)
   */
  public interface FsxStorageConfigurationProperty {
    /**
     * The file system identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html#cfn-m2-environment-fsxstorageconfiguration-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * The mount point for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html#cfn-m2-environment-fsxstorageconfiguration-mountpoint)
     */
    public fun mountPoint(): String

    /**
     * A builder for [FsxStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The file system identifier. 
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param mountPoint The mount point for the file system. 
       */
      public fun mountPoint(mountPoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty.builder()

      /**
       * @param fileSystemId The file system identifier. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param mountPoint The mount point for the file system. 
       */
      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty,
    ) : CdkObject(cdkObject), FsxStorageConfigurationProperty {
      /**
       * The file system identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html#cfn-m2-environment-fsxstorageconfiguration-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      /**
       * The mount point for the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html#cfn-m2-environment-fsxstorageconfiguration-mountpoint)
       */
      override fun mountPoint(): String = unwrap(this).getMountPoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FsxStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty):
          FsxStorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FsxStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FsxStorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty
    }
  }

  /**
   * Defines the details of a high availability configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.m2.*;
   * HighAvailabilityConfigProperty highAvailabilityConfigProperty =
   * HighAvailabilityConfigProperty.builder()
   * .desiredCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-highavailabilityconfig.html)
   */
  public interface HighAvailabilityConfigProperty {
    /**
     * The number of instances in a high availability configuration.
     *
     * The minimum possible value is 1 and the maximum is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-highavailabilityconfig.html#cfn-m2-environment-highavailabilityconfig-desiredcapacity)
     */
    public fun desiredCapacity(): Number

    /**
     * A builder for [HighAvailabilityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredCapacity The number of instances in a high availability configuration. 
       * The minimum possible value is 1 and the maximum is 100.
       */
      public fun desiredCapacity(desiredCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty.Builder =
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty.builder()

      /**
       * @param desiredCapacity The number of instances in a high availability configuration. 
       * The minimum possible value is 1 and the maximum is 100.
       */
      override fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty,
    ) : CdkObject(cdkObject), HighAvailabilityConfigProperty {
      /**
       * The number of instances in a high availability configuration.
       *
       * The minimum possible value is 1 and the maximum is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-highavailabilityconfig.html#cfn-m2-environment-highavailabilityconfig-desiredcapacity)
       */
      override fun desiredCapacity(): Number = unwrap(this).getDesiredCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HighAvailabilityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty):
          HighAvailabilityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HighAvailabilityConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HighAvailabilityConfigProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty
    }
  }

  /**
   * Defines the storage configuration for a runtime environment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.m2.*;
   * StorageConfigurationProperty storageConfigurationProperty =
   * StorageConfigurationProperty.builder()
   * .efs(EfsStorageConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .mountPoint("mountPoint")
   * .build())
   * .fsx(FsxStorageConfigurationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .mountPoint("mountPoint")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html)
   */
  public interface StorageConfigurationProperty {
    /**
     * Defines the storage configuration for an Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html#cfn-m2-environment-storageconfiguration-efs)
     */
    public fun efs(): Any? = unwrap(this).getEfs()

    /**
     * Defines the storage configuration for an Amazon FSx file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html#cfn-m2-environment-storageconfiguration-fsx)
     */
    public fun fsx(): Any? = unwrap(this).getFsx()

    /**
     * A builder for [StorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      public fun efs(efs: IResolvable)

      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      public fun efs(efs: EfsStorageConfigurationProperty)

      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982d2400e5a435958f70a095a68506a24c3648d545f05972d6a19ddea904890d")
      public fun efs(efs: EfsStorageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      public fun fsx(fsx: IResolvable)

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      public fun fsx(fsx: FsxStorageConfigurationProperty)

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0448502b2b34b463b25365a9992a1755098f720f79da3f879db4023f8ca786b4")
      public fun fsx(fsx: FsxStorageConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty.Builder =
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty.builder()

      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      override fun efs(efs: IResolvable) {
        cdkBuilder.efs(efs.let(IResolvable::unwrap))
      }

      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      override fun efs(efs: EfsStorageConfigurationProperty) {
        cdkBuilder.efs(efs.let(EfsStorageConfigurationProperty::unwrap))
      }

      /**
       * @param efs Defines the storage configuration for an Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982d2400e5a435958f70a095a68506a24c3648d545f05972d6a19ddea904890d")
      override fun efs(efs: EfsStorageConfigurationProperty.Builder.() -> Unit): Unit =
          efs(EfsStorageConfigurationProperty(efs))

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      override fun fsx(fsx: IResolvable) {
        cdkBuilder.fsx(fsx.let(IResolvable::unwrap))
      }

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      override fun fsx(fsx: FsxStorageConfigurationProperty) {
        cdkBuilder.fsx(fsx.let(FsxStorageConfigurationProperty::unwrap))
      }

      /**
       * @param fsx Defines the storage configuration for an Amazon FSx file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0448502b2b34b463b25365a9992a1755098f720f79da3f879db4023f8ca786b4")
      override fun fsx(fsx: FsxStorageConfigurationProperty.Builder.() -> Unit): Unit =
          fsx(FsxStorageConfigurationProperty(fsx))

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty,
    ) : CdkObject(cdkObject), StorageConfigurationProperty {
      /**
       * Defines the storage configuration for an Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html#cfn-m2-environment-storageconfiguration-efs)
       */
      override fun efs(): Any? = unwrap(this).getEfs()

      /**
       * Defines the storage configuration for an Amazon FSx file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html#cfn-m2-environment-storageconfiguration-fsx)
       */
      override fun fsx(): Any? = unwrap(this).getFsx()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty):
          StorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty
    }
  }
}
