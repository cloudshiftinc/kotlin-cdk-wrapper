@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnServiceProps

@CdkDslMarker
public class CfnServicePropsDsl {
  private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
    cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
  }

  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public
      fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
    cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
  }

  public
      fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty) {
    cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
  }

  public fun instanceConfiguration(instanceConfiguration: IResolvable) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  public
      fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
    cdkBuilder.observabilityConfiguration(observabilityConfiguration)
  }

  public
      fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty) {
    cdkBuilder.observabilityConfiguration(observabilityConfiguration)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnServiceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
