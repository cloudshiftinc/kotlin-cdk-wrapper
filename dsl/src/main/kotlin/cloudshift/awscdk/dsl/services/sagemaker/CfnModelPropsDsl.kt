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
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelProps

@CdkDslMarker
public class CfnModelPropsDsl {
  private val cdkBuilder: CfnModelProps.Builder = CfnModelProps.builder()

  private val _containers: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun containers(vararg containers: Any) {
    _containers.addAll(listOf(*containers))
  }

  public fun containers(containers: Collection<Any>) {
    _containers.addAll(containers)
  }

  public fun containers(containers: IResolvable) {
    cdkBuilder.containers(containers)
  }

  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
    cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig)
  }

  public
      fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty) {
    cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun primaryContainer(primaryContainer: IResolvable) {
    cdkBuilder.primaryContainer(primaryContainer)
  }

  public fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty) {
    cdkBuilder.primaryContainer(primaryContainer)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnModelProps {
    if(_containers.isNotEmpty()) cdkBuilder.containers(_containers)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
