@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps

@CdkDslMarker
public class CfnEndpointPropsDsl {
  private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

  private val _excludeRetainedVariantProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun deploymentConfig(deploymentConfig: IResolvable) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any) {
    _excludeRetainedVariantProperties.addAll(listOf(*excludeRetainedVariantProperties))
  }

  public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: Collection<Any>) {
    _excludeRetainedVariantProperties.addAll(excludeRetainedVariantProperties)
  }

  public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
    cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties)
  }

  public fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
    cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
  }

  public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
    cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
  }

  public fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
    cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
  }

  public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
    cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEndpointProps {
    if(_excludeRetainedVariantProperties.isNotEmpty())
        cdkBuilder.excludeRetainedVariantProperties(_excludeRetainedVariantProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
