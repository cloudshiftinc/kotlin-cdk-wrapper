@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.constructs.Construct

/**
 * When you create an extension or configure an AWS authored extension, you associate the extension
 * with an AWS AppConfig application, environment, or configuration profile.
 *
 * For example, you can choose to run the `AWS AppConfig deployment events to Amazon SNS` AWS
 * authored extension and receive notifications on an Amazon SNS topic anytime a configuration
 * deployment is started for a specific application. Defining which extension to associate with an AWS
 * AppConfig resource is called an *extension association* . An extension association is a specified
 * relationship between an extension and an AWS AppConfig resource, such as an application or a
 * configuration profile. For more information about extensions and associations, see [Working with AWS
 * AppConfig
 * extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 * in the *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnExtensionAssociation cfnExtensionAssociation = CfnExtensionAssociation.Builder.create(this,
 * "MyCfnExtensionAssociation")
 * .extensionIdentifier("extensionIdentifier")
 * .extensionVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html)
 */
@CdkDslMarker
public class CfnExtensionAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnExtensionAssociation.Builder =
      CfnExtensionAssociation.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionidentifier)
   * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
   * extension. 
   */
  public fun extensionIdentifier(extensionIdentifier: String) {
    cdkBuilder.extensionIdentifier(extensionIdentifier)
  }

  /**
   * The version number of the extension.
   *
   * If not specified, AWS AppConfig uses the maximum version of the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionversionnumber)
   * @param extensionVersionNumber The version number of the extension. 
   */
  public fun extensionVersionNumber(extensionVersionNumber: Number) {
    cdkBuilder.extensionVersionNumber(extensionVersionNumber)
  }

  /**
   * The parameter names and values defined in the extensions.
   *
   * Extension parameters marked `Required` must be entered for this field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
   * @param parameters The parameter names and values defined in the extensions. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * The parameter names and values defined in the extensions.
   *
   * Extension parameters marked `Required` must be entered for this field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
   * @param parameters The parameter names and values defined in the extensions. 
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * The ARN of an application, configuration profile, or environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-resourceidentifier)
   * @param resourceIdentifier The ARN of an application, configuration profile, or environment. 
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  /**
   * Adds one or more tags for the specified extension association.
   *
   * Tags are metadata that help you categorize resources in different ways, for example, by
   * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
   * you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
   * @param tags Adds one or more tags for the specified extension association. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Adds one or more tags for the specified extension association.
   *
   * Tags are metadata that help you categorize resources in different ways, for example, by
   * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
   * you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
   * @param tags Adds one or more tags for the specified extension association. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnExtensionAssociation {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
