@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnApplication
import software.amazon.awscdk.services.appstream.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .appBlockArn("appBlockArn")
 * .iconS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build())
 * .instanceFamilies(List.of("instanceFamilies"))
 * .launchPath("launchPath")
 * .name("name")
 * .platforms(List.of("platforms"))
 * // the properties below are optional
 * .attributesToDelete(List.of("attributesToDelete"))
 * .description("description")
 * .displayName("displayName")
 * .launchParameters("launchParameters")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  private val _attributesToDelete: MutableList<String> = mutableListOf()

  private val _instanceFamilies: MutableList<String> = mutableListOf()

  private val _platforms: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param appBlockArn The app block ARN with which the application should be associated. 
   */
  public fun appBlockArn(appBlockArn: String) {
    cdkBuilder.appBlockArn(appBlockArn)
  }

  /**
   * @param attributesToDelete A list of attributes to delete from an application.
   */
  public fun attributesToDelete(vararg attributesToDelete: String) {
    _attributesToDelete.addAll(listOf(*attributesToDelete))
  }

  /**
   * @param attributesToDelete A list of attributes to delete from an application.
   */
  public fun attributesToDelete(attributesToDelete: Collection<String>) {
    _attributesToDelete.addAll(attributesToDelete)
  }

  /**
   * @param description The description of the application.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The display name of the application.
   * This name is visible to users in the application catalog.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param iconS3Location The icon S3 location of the application. 
   */
  public fun iconS3Location(iconS3Location: IResolvable) {
    cdkBuilder.iconS3Location(iconS3Location)
  }

  /**
   * @param iconS3Location The icon S3 location of the application. 
   */
  public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty) {
    cdkBuilder.iconS3Location(iconS3Location)
  }

  /**
   * @param instanceFamilies The instance families the application supports. 
   * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
   */
  public fun instanceFamilies(vararg instanceFamilies: String) {
    _instanceFamilies.addAll(listOf(*instanceFamilies))
  }

  /**
   * @param instanceFamilies The instance families the application supports. 
   * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
   */
  public fun instanceFamilies(instanceFamilies: Collection<String>) {
    _instanceFamilies.addAll(instanceFamilies)
  }

  /**
   * @param launchParameters The launch parameters of the application.
   */
  public fun launchParameters(launchParameters: String) {
    cdkBuilder.launchParameters(launchParameters)
  }

  /**
   * @param launchPath The launch path of the application. 
   */
  public fun launchPath(launchPath: String) {
    cdkBuilder.launchPath(launchPath)
  }

  /**
   * @param name The name of the application. 
   * This name is visible to users when a name is not specified in the DisplayName property.
   *
   * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param platforms The platforms the application supports. 
   * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
   */
  public fun platforms(vararg platforms: String) {
    _platforms.addAll(listOf(*platforms))
  }

  /**
   * @param platforms The platforms the application supports. 
   * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
   */
  public fun platforms(platforms: Collection<String>) {
    _platforms.addAll(platforms)
  }

  /**
   * @param tags The tags of the application.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags of the application.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param workingDirectory The working directory of the application.
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): CfnApplicationProps {
    if(_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
    if(_instanceFamilies.isNotEmpty()) cdkBuilder.instanceFamilies(_instanceFamilies)
    if(_platforms.isNotEmpty()) cdkBuilder.platforms(_platforms)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
