@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType

@CdkDslMarker
public class CfnCustomActionTypeConfigurationPropertiesPropertyDsl {
  private val cdkBuilder: CfnCustomActionType.ConfigurationPropertiesProperty.Builder =
      CfnCustomActionType.ConfigurationPropertiesProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun key(key: Boolean) {
    cdkBuilder.key(key)
  }

  public fun key(key: IResolvable) {
    cdkBuilder.key(key)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun queryable(queryable: Boolean) {
    cdkBuilder.queryable(queryable)
  }

  public fun queryable(queryable: IResolvable) {
    cdkBuilder.queryable(queryable)
  }

  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  public fun secret(secret: Boolean) {
    cdkBuilder.secret(secret)
  }

  public fun secret(secret: IResolvable) {
    cdkBuilder.secret(secret)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCustomActionType.ConfigurationPropertiesProperty = cdkBuilder.build()
}
