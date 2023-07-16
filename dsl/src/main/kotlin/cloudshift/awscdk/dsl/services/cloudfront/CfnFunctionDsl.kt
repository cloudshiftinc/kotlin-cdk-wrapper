@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.constructs.Construct

@CdkDslMarker
public class CfnFunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

  public fun autoPublish(autoPublish: Boolean) {
    cdkBuilder.autoPublish(autoPublish)
  }

  public fun autoPublish(autoPublish: IResolvable) {
    cdkBuilder.autoPublish(autoPublish)
  }

  public fun functionCode(functionCode: String) {
    cdkBuilder.functionCode(functionCode)
  }

  public fun functionConfig(functionConfig: IResolvable) {
    cdkBuilder.functionConfig(functionConfig)
  }

  public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
    cdkBuilder.functionConfig(functionConfig)
  }

  public fun functionMetadata(functionMetadata: IResolvable) {
    cdkBuilder.functionMetadata(functionMetadata)
  }

  public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
    cdkBuilder.functionMetadata(functionMetadata)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnFunction = cdkBuilder.build()
}
