@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.cxapi.CloudAssembly

@CdkDslMarker
public class CloudAssemblyDsl(
  directory: String,
) {
  private val cdkBuilder: CloudAssembly.Builder = CloudAssembly.Builder.create(directory)

  public fun skipEnumCheck(skipEnumCheck: Boolean) {
    cdkBuilder.skipEnumCheck(skipEnumCheck)
  }

  public fun skipVersionCheck(skipVersionCheck: Boolean) {
    cdkBuilder.skipVersionCheck(skipVersionCheck)
  }

  public fun topoSort(topoSort: Boolean) {
    cdkBuilder.topoSort(topoSort)
  }

  public fun build(): CloudAssembly = cdkBuilder.build()
}
