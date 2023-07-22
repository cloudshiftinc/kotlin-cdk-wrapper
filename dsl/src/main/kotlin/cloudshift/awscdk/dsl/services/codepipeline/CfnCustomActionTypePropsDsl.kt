@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps

/**
 * Properties for defining a `CfnCustomActionType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * CfnCustomActionTypeProps cfnCustomActionTypeProps = CfnCustomActionTypeProps.builder()
 * .category("category")
 * .inputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .outputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .provider("provider")
 * .version("version")
 * // the properties below are optional
 * .configurationProperties(List.of(ConfigurationPropertiesProperty.builder()
 * .key(false)
 * .name("name")
 * .required(false)
 * .secret(false)
 * // the properties below are optional
 * .description("description")
 * .queryable(false)
 * .type("type")
 * .build()))
 * .settings(SettingsProperty.builder()
 * .entityUrlTemplate("entityUrlTemplate")
 * .executionUrlTemplate("executionUrlTemplate")
 * .revisionUrlTemplate("revisionUrlTemplate")
 * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
@CdkDslMarker
public class CfnCustomActionTypePropsDsl {
  private val cdkBuilder: CfnCustomActionTypeProps.Builder = CfnCustomActionTypeProps.builder()

  private val _configurationProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param category The category of the custom action, such as a build action or a test action. 
   */
  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  /**
   * @param configurationProperties The configuration properties for the custom action.
   *
   * You can refer to a name in the configuration properties of the custom action within the URL
   * templates by following the format of {Config:name}, as long as the configuration property is both
   * required and not secret. For more information, see [Create a Custom Action for a
   * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
   * .
   */
  public fun configurationProperties(vararg configurationProperties: Any) {
    _configurationProperties.addAll(listOf(*configurationProperties))
  }

  /**
   * @param configurationProperties The configuration properties for the custom action.
   *
   * You can refer to a name in the configuration properties of the custom action within the URL
   * templates by following the format of {Config:name}, as long as the configuration property is both
   * required and not secret. For more information, see [Create a Custom Action for a
   * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
   * .
   */
  public fun configurationProperties(configurationProperties: Collection<Any>) {
    _configurationProperties.addAll(configurationProperties)
  }

  /**
   * @param configurationProperties The configuration properties for the custom action.
   *
   * You can refer to a name in the configuration properties of the custom action within the URL
   * templates by following the format of {Config:name}, as long as the configuration property is both
   * required and not secret. For more information, see [Create a Custom Action for a
   * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
   * .
   */
  public fun configurationProperties(configurationProperties: IResolvable) {
    cdkBuilder.configurationProperties(configurationProperties)
  }

  /**
   * @param inputArtifactDetails The details of the input artifact for the action, such as its
   * commit ID. 
   */
  public fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
    cdkBuilder.inputArtifactDetails(inputArtifactDetails)
  }

  /**
   * @param inputArtifactDetails The details of the input artifact for the action, such as its
   * commit ID. 
   */
  public
      fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
    cdkBuilder.inputArtifactDetails(inputArtifactDetails)
  }

  /**
   * @param outputArtifactDetails The details of the output artifact of the action, such as its
   * commit ID. 
   */
  public fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
    cdkBuilder.outputArtifactDetails(outputArtifactDetails)
  }

  /**
   * @param outputArtifactDetails The details of the output artifact of the action, such as its
   * commit ID. 
   */
  public
      fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
    cdkBuilder.outputArtifactDetails(outputArtifactDetails)
  }

  /**
   * @param provider The provider of the service used in the custom action, such as CodeDeploy. 
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param settings URLs that provide users information about this custom action.
   */
  public fun settings(settings: IResolvable) {
    cdkBuilder.settings(settings)
  }

  /**
   * @param settings URLs that provide users information about this custom action.
   */
  public fun settings(settings: CfnCustomActionType.SettingsProperty) {
    cdkBuilder.settings(settings)
  }

  /**
   * @param tags The tags for the custom action.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the custom action.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param version The version identifier of the custom action. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnCustomActionTypeProps {
    if(_configurationProperties.isNotEmpty())
        cdkBuilder.configurationProperties(_configurationProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
