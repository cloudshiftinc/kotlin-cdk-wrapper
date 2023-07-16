@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps

@CdkDslMarker
public class CfnEndpointConfigPropsDsl {
  private val cdkBuilder: CfnEndpointConfigProps.Builder = CfnEndpointConfigProps.builder()

  private val _productionVariants: MutableList<Any> = mutableListOf()

  private val _shadowProductionVariants: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  public
      fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty) {
    cdkBuilder.asyncInferenceConfig(asyncInferenceConfig)
  }

  public fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  public fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty) {
    cdkBuilder.dataCaptureConfig(dataCaptureConfig)
  }

  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  public fun explainerConfig(explainerConfig: IResolvable) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  public fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty) {
    cdkBuilder.explainerConfig(explainerConfig)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun productionVariants(vararg productionVariants: Any) {
    _productionVariants.addAll(listOf(*productionVariants))
  }

  public fun productionVariants(productionVariants: Collection<Any>) {
    _productionVariants.addAll(productionVariants)
  }

  public fun productionVariants(productionVariants: IResolvable) {
    cdkBuilder.productionVariants(productionVariants)
  }

  public fun shadowProductionVariants(vararg shadowProductionVariants: Any) {
    _shadowProductionVariants.addAll(listOf(*shadowProductionVariants))
  }

  public fun shadowProductionVariants(shadowProductionVariants: Collection<Any>) {
    _shadowProductionVariants.addAll(shadowProductionVariants)
  }

  public fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
    cdkBuilder.shadowProductionVariants(shadowProductionVariants)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEndpointConfigProps {
    if(_productionVariants.isNotEmpty()) cdkBuilder.productionVariants(_productionVariants)
    if(_shadowProductionVariants.isNotEmpty())
        cdkBuilder.shadowProductionVariants(_shadowProductionVariants)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
