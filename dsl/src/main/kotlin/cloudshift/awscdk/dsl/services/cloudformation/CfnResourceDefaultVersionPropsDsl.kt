@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps

@CdkDslMarker
public class CfnResourceDefaultVersionPropsDsl {
  private val cdkBuilder: CfnResourceDefaultVersionProps.Builder =
      CfnResourceDefaultVersionProps.builder()

  /**
   * @param typeName The name of the resource.
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  /**
   * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version.
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   */
  public fun typeVersionArn(typeVersionArn: String) {
    cdkBuilder.typeVersionArn(typeVersionArn)
  }

  /**
   * @param versionId The ID of a specific version of the resource.
   * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
   * resource version when it's registered.
   *
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnResourceDefaultVersionProps = cdkBuilder.build()
}
