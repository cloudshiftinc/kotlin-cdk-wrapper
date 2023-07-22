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
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockProps

/**
 * Properties for defining a `CfnAppBlock`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnAppBlockProps cfnAppBlockProps = CfnAppBlockProps.builder()
 * .name("name")
 * .sourceS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .displayName("displayName")
 * .packagingType("packagingType")
 * .postSetupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .setupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
 */
@CdkDslMarker
public class CfnAppBlockPropsDsl {
  private val cdkBuilder: CfnAppBlockProps.Builder = CfnAppBlockProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the app block.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The display name of the app block.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param name The name of the app block. 
   * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param packagingType The packaging type of the app block.
   */
  public fun packagingType(packagingType: String) {
    cdkBuilder.packagingType(packagingType)
  }

  /**
   * @param postSetupScriptDetails The post setup script details of the app block.
   */
  public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
    cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
  }

  /**
   * @param postSetupScriptDetails The post setup script details of the app block.
   */
  public fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
    cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
  }

  /**
   * @param setupScriptDetails The setup script details of the app block.
   */
  public fun setupScriptDetails(setupScriptDetails: IResolvable) {
    cdkBuilder.setupScriptDetails(setupScriptDetails)
  }

  /**
   * @param setupScriptDetails The setup script details of the app block.
   */
  public fun setupScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
    cdkBuilder.setupScriptDetails(setupScriptDetails)
  }

  /**
   * @param sourceS3Location The source S3 location of the app block. 
   */
  public fun sourceS3Location(sourceS3Location: IResolvable) {
    cdkBuilder.sourceS3Location(sourceS3Location)
  }

  /**
   * @param sourceS3Location The source S3 location of the app block. 
   */
  public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty) {
    cdkBuilder.sourceS3Location(sourceS3Location)
  }

  /**
   * @param tags The tags of the app block.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags of the app block.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAppBlockProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
