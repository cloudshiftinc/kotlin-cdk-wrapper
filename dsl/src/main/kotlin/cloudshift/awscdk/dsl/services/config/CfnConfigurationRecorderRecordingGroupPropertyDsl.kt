@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

@CdkDslMarker
public class CfnConfigurationRecorderRecordingGroupPropertyDsl {
  private val cdkBuilder: CfnConfigurationRecorder.RecordingGroupProperty.Builder =
      CfnConfigurationRecorder.RecordingGroupProperty.builder()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  public fun allSupported(allSupported: Boolean) {
    cdkBuilder.allSupported(allSupported)
  }

  public fun allSupported(allSupported: IResolvable) {
    cdkBuilder.allSupported(allSupported)
  }

  public fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
    cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
  }

  public fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
    cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
  }

  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  public fun build(): CfnConfigurationRecorder.RecordingGroupProperty {
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    return cdkBuilder.build()
  }
}
