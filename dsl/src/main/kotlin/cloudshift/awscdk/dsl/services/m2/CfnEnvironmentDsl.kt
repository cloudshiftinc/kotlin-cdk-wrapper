@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnEnvironment
import software.constructs.Construct

/**
 * Specifies a runtime environment for a given runtime engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
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
@CdkDslMarker
public class CfnEnvironmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _storageConfigurations: MutableList<Any> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * The description of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-description)
   * @param description The description of the runtime environment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The target platform for the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-enginetype)
   * @param engineType The target platform for the runtime environment. 
   */
  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  /**
   * The version of the runtime engine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-engineversion)
   * @param engineVersion The version of the runtime engine. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * Defines the details of a high availability configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
   * @param highAvailabilityConfig Defines the details of a high availability configuration. 
   */
  public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
    cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
  }

  /**
   * Defines the details of a high availability configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-highavailabilityconfig)
   * @param highAvailabilityConfig Defines the details of a high availability configuration. 
   */
  public
      fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty) {
    cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
  }

  /**
   * The instance type of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-instancetype)
   * @param instanceType The instance type of the runtime environment. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * The identifier of a customer managed key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-kmskeyid)
   * @param kmsKeyId The identifier of a customer managed key. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * The name of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-name)
   * @param name The name of the runtime environment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Configures the maintenance window you want for the runtime environment.
   *
   * If you do not provide a value, a random system-generated value will be assigned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-preferredmaintenancewindow)
   * @param preferredMaintenanceWindow Configures the maintenance window you want for the runtime
   * environment. 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * Specifies whether the runtime environment is publicly accessible.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
   * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * Specifies whether the runtime environment is publicly accessible.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-publiclyaccessible)
   * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible. 
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
   * @param securityGroupIds The list of security groups for the VPC associated with this runtime
   * environment. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * The list of security groups for the VPC associated with this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-securitygroupids)
   * @param securityGroupIds The list of security groups for the VPC associated with this runtime
   * environment. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * Defines the storage configuration for a runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
   * @param storageConfigurations Defines the storage configuration for a runtime environment. 
   */
  public fun storageConfigurations(vararg storageConfigurations: Any) {
    _storageConfigurations.addAll(listOf(*storageConfigurations))
  }

  /**
   * Defines the storage configuration for a runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
   * @param storageConfigurations Defines the storage configuration for a runtime environment. 
   */
  public fun storageConfigurations(storageConfigurations: Collection<Any>) {
    _storageConfigurations.addAll(storageConfigurations)
  }

  /**
   * Defines the storage configuration for a runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-storageconfigurations)
   * @param storageConfigurations Defines the storage configuration for a runtime environment. 
   */
  public fun storageConfigurations(storageConfigurations: IResolvable) {
    cdkBuilder.storageConfigurations(storageConfigurations)
  }

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
   * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * The list of subnets associated with the VPC for this runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html#cfn-m2-environment-subnetids)
   * @param subnetIds The list of subnets associated with the VPC for this runtime environment. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

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
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnEnvironment {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_storageConfigurations.isNotEmpty()) cdkBuilder.storageConfigurations(_storageConfigurations)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
