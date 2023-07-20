@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketInventoryConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.InventoryConfigurationProperty.Builder =
      CfnBucket.InventoryConfigurationProperty.builder()

  private val _optionalFields: MutableList<String> = mutableListOf()

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun destination(destination: CfnBucket.DestinationProperty) {
    cdkBuilder.destination(destination)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun includedObjectVersions(includedObjectVersions: String) {
    cdkBuilder.includedObjectVersions(includedObjectVersions)
  }

  public fun optionalFields(vararg optionalFields: String) {
    _optionalFields.addAll(listOf(*optionalFields))
  }

  public fun optionalFields(optionalFields: Collection<String>) {
    _optionalFields.addAll(optionalFields)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun scheduleFrequency(scheduleFrequency: String) {
    cdkBuilder.scheduleFrequency(scheduleFrequency)
  }

  public fun build(): CfnBucket.InventoryConfigurationProperty {
    if(_optionalFields.isNotEmpty()) cdkBuilder.optionalFields(_optionalFields)
    return cdkBuilder.build()
  }
}
