@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicSemanticEntityTypePropertyDsl {
  private val cdkBuilder: CfnTopic.SemanticEntityTypeProperty.Builder =
      CfnTopic.SemanticEntityTypeProperty.builder()

  public fun subTypeName(subTypeName: String) {
    cdkBuilder.subTypeName(subTypeName)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun typeParameters(typeParameters: Map<String, String>) {
    cdkBuilder.typeParameters(typeParameters)
  }

  public fun typeParameters(typeParameters: IResolvable) {
    cdkBuilder.typeParameters(typeParameters)
  }

  public fun build(): CfnTopic.SemanticEntityTypeProperty = cdkBuilder.build()
}
