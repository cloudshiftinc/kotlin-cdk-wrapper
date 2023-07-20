@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryVisualReferencePropertyDsl {
  private val cdkBuilder: CfnCanary.VisualReferenceProperty.Builder =
      CfnCanary.VisualReferenceProperty.builder()

  private val _baseScreenshots: MutableList<Any> = mutableListOf()

  public fun baseCanaryRunId(baseCanaryRunId: String) {
    cdkBuilder.baseCanaryRunId(baseCanaryRunId)
  }

  public fun baseScreenshots(vararg baseScreenshots: Any) {
    _baseScreenshots.addAll(listOf(*baseScreenshots))
  }

  public fun baseScreenshots(baseScreenshots: Collection<Any>) {
    _baseScreenshots.addAll(baseScreenshots)
  }

  public fun baseScreenshots(baseScreenshots: IResolvable) {
    cdkBuilder.baseScreenshots(baseScreenshots)
  }

  public fun build(): CfnCanary.VisualReferenceProperty {
    if(_baseScreenshots.isNotEmpty()) cdkBuilder.baseScreenshots(_baseScreenshots)
    return cdkBuilder.build()
  }
}
