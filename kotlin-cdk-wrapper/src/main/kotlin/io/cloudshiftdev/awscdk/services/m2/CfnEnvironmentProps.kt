@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.m2.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
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
public interface CfnEnvironmentProps {
  /**
   * The description of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The target platform for the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-enginetype)
   */
  public fun engineType(): String

  /**
   * The version of the runtime engine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * Defines the details of a high availability configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
   */
  public fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

  /**
   * The instance type of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-instancetype)
   */
  public fun instanceType(): String

  /**
   * The identifier of a customer managed key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-name)
   */
  public fun name(): String

  /**
   * Configures the maintenance window that you want for the runtime environment.
   *
   * The maintenance window must have the format `ddd:hh24:mi-ddd:hh24:mi` and must be less than 24
   * hours. The following two examples are valid maintenance windows: `sun:23:45-mon:00:15` or
   * `sat:01:00-sat:03:00` .
   *
   * If you do not provide a value, a random system-generated value will be assigned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Specifies whether the runtime environment is publicly accessible.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * Defines the storage configuration for a runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
   */
  public fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the runtime environment.
     */
    public fun description(description: String)

    /**
     * @param engineType The target platform for the runtime environment. 
     */
    public fun engineType(engineType: String)

    /**
     * @param engineVersion The version of the runtime engine.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable)

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    public
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty)

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e21c4aab02522d5ee15d80737f824bad6ed26a8bc924eb9497418e6012e21c4")
    public
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty.Builder.() -> Unit)

    /**
     * @param instanceType The instance type of the runtime environment. 
     */
    public fun instanceType(instanceType: String)

    /**
     * @param kmsKeyId The identifier of a customer managed key.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the runtime environment. 
     */
    public fun name(name: String)

    /**
     * @param preferredMaintenanceWindow Configures the maintenance window that you want for the
     * runtime environment.
     * The maintenance window must have the format `ddd:hh24:mi-ddd:hh24:mi` and must be less than
     * 24 hours. The following two examples are valid maintenance windows: `sun:23:45-mon:00:15` or
     * `sat:01:00-sat:03:00` .
     *
     * If you do not provide a value, a random system-generated value will be assigned.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    public fun storageConfigurations(storageConfigurations: IResolvable)

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    public fun storageConfigurations(storageConfigurations: List<Any>)

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    public fun storageConfigurations(vararg storageConfigurations: Any)

    /**
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.m2.CfnEnvironmentProps.builder()

    /**
     * @param description The description of the runtime environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engineType The target platform for the runtime environment. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * @param engineVersion The version of the runtime engine.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    override fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(IResolvable::unwrap))
    }

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    override
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(CfnEnvironment.HighAvailabilityConfigProperty::unwrap))
    }

    /**
     * @param highAvailabilityConfig Defines the details of a high availability configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e21c4aab02522d5ee15d80737f824bad6ed26a8bc924eb9497418e6012e21c4")
    override
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty.Builder.() -> Unit):
        Unit =
        highAvailabilityConfig(CfnEnvironment.HighAvailabilityConfigProperty(highAvailabilityConfig))

    /**
     * @param instanceType The instance type of the runtime environment. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param kmsKeyId The identifier of a customer managed key.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the runtime environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param preferredMaintenanceWindow Configures the maintenance window that you want for the
     * runtime environment.
     * The maintenance window must have the format `ddd:hh24:mi-ddd:hh24:mi` and must be less than
     * 24 hours. The following two examples are valid maintenance windows: `sun:23:45-mon:00:15` or
     * `sat:01:00-sat:03:00` .
     *
     * If you do not provide a value, a random system-generated value will be assigned.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The list of security groups for the VPC associated with this runtime
     * environment.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    override fun storageConfigurations(storageConfigurations: IResolvable) {
      cdkBuilder.storageConfigurations(storageConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    override fun storageConfigurations(storageConfigurations: List<Any>) {
      cdkBuilder.storageConfigurations(storageConfigurations)
    }

    /**
     * @param storageConfigurations Defines the storage configuration for a runtime environment.
     */
    override fun storageConfigurations(vararg storageConfigurations: Any): Unit =
        storageConfigurations(storageConfigurations.toList())

    /**
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnEnvironmentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.m2.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * The description of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The target platform for the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-enginetype)
     */
    override fun engineType(): String = unwrap(this).getEngineType()

    /**
     * The version of the runtime engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * Defines the details of a high availability configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
     */
    override fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

    /**
     * The instance type of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Specifies whether the runtime environment is publicly accessible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The list of security groups for the VPC associated with this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
     */
    override fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

    /**
     * The list of subnets associated with the VPC for this runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.m2.CfnEnvironmentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.m2.CfnEnvironmentProps
  }
}
