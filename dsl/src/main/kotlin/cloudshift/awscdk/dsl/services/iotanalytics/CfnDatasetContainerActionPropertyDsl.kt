@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetContainerActionPropertyDsl {
  private val cdkBuilder: CfnDataset.ContainerActionProperty.Builder =
      CfnDataset.ContainerActionProperty.builder()

  private val _variables: MutableList<Any> = mutableListOf()

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun resourceConfiguration(resourceConfiguration: IResolvable) {
    cdkBuilder.resourceConfiguration(resourceConfiguration)
  }

  public
      fun resourceConfiguration(resourceConfiguration: CfnDataset.ResourceConfigurationProperty) {
    cdkBuilder.resourceConfiguration(resourceConfiguration)
  }

  public fun variables(vararg variables: Any) {
    _variables.addAll(listOf(*variables))
  }

  public fun variables(variables: Collection<Any>) {
    _variables.addAll(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnDataset.ContainerActionProperty {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    return cdkBuilder.build()
  }
}
