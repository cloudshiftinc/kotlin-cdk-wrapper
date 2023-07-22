@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnExtension

/**
 * An action for an extension to take at a specific action point.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .name("name")
 * .uri("uri")
 * // the properties below are optional
 * .description("description")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html)
 */
@CdkDslMarker
public class CfnExtensionActionPropertyDsl {
  private val cdkBuilder: CfnExtension.ActionProperty.Builder =
      CfnExtension.ActionProperty.builder()

  /**
   * @param description The description of the extension Action.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the extension action. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The ARN of the role for invoking the extension action.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param uri The URI of the extension action. 
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnExtension.ActionProperty = cdkBuilder.build()
}
