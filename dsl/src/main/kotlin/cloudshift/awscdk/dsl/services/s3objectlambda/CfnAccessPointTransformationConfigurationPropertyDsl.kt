@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointTransformationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.TransformationConfigurationProperty.Builder =
      CfnAccessPoint.TransformationConfigurationProperty.builder()

  private val _actions: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  public fun contentTransformation(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.contentTransformation(builder.map)
  }

  public fun contentTransformation(contentTransformation: Any) {
    cdkBuilder.contentTransformation(contentTransformation)
  }

  public fun build(): CfnAccessPoint.TransformationConfigurationProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
