@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnPartition

@CdkDslMarker
public class CfnPartitionPartitionInputPropertyDsl {
  private val cdkBuilder: CfnPartition.PartitionInputProperty.Builder =
      CfnPartition.PartitionInputProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun storageDescriptor(storageDescriptor: IResolvable) {
    cdkBuilder.storageDescriptor(storageDescriptor)
  }

  public fun storageDescriptor(storageDescriptor: CfnPartition.StorageDescriptorProperty) {
    cdkBuilder.storageDescriptor(storageDescriptor)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnPartition.PartitionInputProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
