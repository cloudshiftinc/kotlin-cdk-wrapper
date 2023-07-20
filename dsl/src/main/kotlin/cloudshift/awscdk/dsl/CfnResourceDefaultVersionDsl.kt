@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceDefaultVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceDefaultVersion.Builder =
      CfnResourceDefaultVersion.Builder.create(scope, id)

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun typeVersionArn(typeVersionArn: String) {
    cdkBuilder.typeVersionArn(typeVersionArn)
  }

  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnResourceDefaultVersion = cdkBuilder.build()
}
