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

  /**
   * @param description The description of the action configuration property that is displayed to
   * users.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param key Whether the configuration property is a key. 
   */
  public fun key(key: Boolean) {
    cdkBuilder.key(key)
  }

  /**
   * @param key Whether the configuration property is a key. 
   */
  public fun key(key: IResolvable) {
    cdkBuilder.key(key)
  }

  /**
   * @param name The name of the action configuration property. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param queryable Indicates that the property is used with `PollForJobs` .
   * When creating a custom action, an action can have up to one queryable property. If it has one,
   * that property must be both required and not secret.
   *
   * If you create a pipeline with a custom action type, and that custom action contains a queryable
   * property, the value for that configuration property is subject to other restrictions. The value
   * must be less than or equal to twenty (20) characters. The value can contain only alphanumeric
   * characters, underscores, and hyphens.
   */
  public fun queryable(queryable: Boolean) {
    cdkBuilder.queryable(queryable)
  }

  /**
   * @param queryable Indicates that the property is used with `PollForJobs` .
   * When creating a custom action, an action can have up to one queryable property. If it has one,
   * that property must be both required and not secret.
   *
   * If you create a pipeline with a custom action type, and that custom action contains a queryable
   * property, the value for that configuration property is subject to other restrictions. The value
   * must be less than or equal to twenty (20) characters. The value can contain only alphanumeric
   * characters, underscores, and hyphens.
   */
  public fun queryable(queryable: IResolvable) {
    cdkBuilder.queryable(queryable)
  }

  /**
   * @param required Whether the configuration property is a required value. 
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  /**
   * @param required Whether the configuration property is a required value. 
   */
  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  /**
   * @param secret Whether the configuration property is secret. 
   * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
   * `PollForJobs` , and `PollForThirdPartyJobs` .
   *
   * When updating a pipeline, passing * * * * * without changing any other values of the action
   * preserves the previous value of the secret.
   */
  public fun secret(secret: Boolean) {
    cdkBuilder.secret(secret)
  }

  /**
   * @param secret Whether the configuration property is secret. 
   * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
   * `PollForJobs` , and `PollForThirdPartyJobs` .
   *
   * When updating a pipeline, passing * * * * * without changing any other values of the action
   * preserves the previous value of the secret.
   */
  public fun secret(secret: IResolvable) {
    cdkBuilder.secret(secret)
  }

  /**
   * @param type The type of the configuration property.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCustomActionType.ConfigurationPropertiesProperty = cdkBuilder.build()
}
