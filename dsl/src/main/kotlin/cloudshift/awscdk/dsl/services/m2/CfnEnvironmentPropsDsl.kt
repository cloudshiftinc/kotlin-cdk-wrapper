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
import software.amazon.awscdk.services.m2.CfnEnvironmentProps

@CdkDslMarker
public class CfnEnvironmentPropsDsl {
  private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _storageConfigurations: MutableList<Any> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param description The description of the runtime environment.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engineType The target platform for the runtime environment. 
   */
  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  /**
   * @param engineVersion The version of the runtime engine.
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param highAvailabilityConfig Defines the details of a high availability configuration.
   */
  public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
    cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
  }

  /**
   * @param highAvailabilityConfig Defines the details of a high availability configuration.
   */
  public
      fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty) {
    cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
  }

  /**
   * @param instanceType The instance type of the runtime environment. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param kmsKeyId The identifier of a customer managed key.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param name The name of the runtime environment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param preferredMaintenanceWindow Configures the maintenance window you want for the runtime
   * environment.
   * If you do not provide a value, a random system-generated value will be assigned.
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param publiclyAccessible Specifies whether the runtime environment is publicly accessible.
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param securityGroupIds The list of security groups for the VPC associated with this runtime
   * environment.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The list of security groups for the VPC associated with this runtime
   * environment.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param storageConfigurations Defines the storage configuration for a runtime environment.
   */
  public fun storageConfigurations(vararg storageConfigurations: Any) {
    _storageConfigurations.addAll(listOf(*storageConfigurations))
  }

  /**
   * @param storageConfigurations Defines the storage configuration for a runtime environment.
   */
  public fun storageConfigurations(storageConfigurations: Collection<Any>) {
    _storageConfigurations.addAll(storageConfigurations)
  }

  /**
   * @param storageConfigurations Defines the storage configuration for a runtime environment.
   */
  public fun storageConfigurations(storageConfigurations: IResolvable) {
    cdkBuilder.storageConfigurations(storageConfigurations)
  }

  /**
   * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The list of subnets associated with the VPC for this runtime environment.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnEnvironmentProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_storageConfigurations.isNotEmpty()) cdkBuilder.storageConfigurations(_storageConfigurations)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
