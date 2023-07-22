@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnApplication
import software.amazon.awscdk.services.m2.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .definition(DefinitionProperty.builder()
 * .content("content")
 * .s3Location("s3Location")
 * .build())
 * .engineType("engineType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .roleArn("roleArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  /**
   * @param definition The application definition for a particular application. You can specify
   * either inline JSON or an Amazon S3 bucket location. 
   * For information about application definitions, see the [AWS Mainframe Modernization User
   * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param definition The application definition for a particular application. You can specify
   * either inline JSON or an Amazon S3 bucket location. 
   * For information about application definitions, see the [AWS Mainframe Modernization User
   * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
   */
  public fun definition(definition: CfnApplication.DefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param description The description of the application.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engineType The type of the target platform for this application. 
   */
  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  /**
   * @param kmsKeyId The identifier of a customer managed key.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param name The name of the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn the value to be set.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnApplicationProps = cdkBuilder.build()
}
