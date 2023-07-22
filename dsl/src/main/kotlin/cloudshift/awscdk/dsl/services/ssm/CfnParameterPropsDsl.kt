@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnParameterProps

@CdkDslMarker
public class CfnParameterPropsDsl {
  private val cdkBuilder: CfnParameterProps.Builder = CfnParameterProps.builder()

  /**
   * @param allowedPattern A regular expression used to validate the parameter value.
   * For example, for String types with values restricted to numbers, you can specify the following:
   * `AllowedPattern=^\d+$`
   */
  public fun allowedPattern(allowedPattern: String) {
    cdkBuilder.allowedPattern(allowedPattern)
  }

  /**
   * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` .
   * The default is `text` .
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param description Information about the parameter.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the parameter.
   *
   * The maximum length constraint listed below includes capacity for additional system attributes
   * that aren't part of the name. The maximum length for a parameter name, including the full length
   * of the parameter ARN, is 1011 characters. For example, the length of the following parameter name
   * is 65 characters, not 20 characters:
   * `arn:aws:ssm:us-east-2:111222333444:parameter/ExampleParameterName`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policies Information about the policies assigned to a parameter.
   * [Assigning parameter
   * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun policies(policies: String) {
    cdkBuilder.policies(policies)
  }

  /**
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs).
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a Systems Manager parameter to identify the type
   * of resource to which it applies, the environment, or the type of configuration data referenced by
   * the parameter.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs).
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a Systems Manager parameter to identify the type
   * of resource to which it applies, the environment, or the type of configuration data referenced by
   * the parameter.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param tier The parameter tier.
   */
  public fun tier(tier: String) {
    cdkBuilder.tier(tier)
  }

  /**
   * @param type The type of parameter. 
   *
   * AWS CloudFormation doesn't support creating a `SecureString` parameter type.
   *
   *
   * *Allowed Values* : String | StringList
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The parameter value. 
   *
   * If type is `StringList` , the system returns a comma-separated string with no spaces between
   * commas in the `Value` field.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnParameterProps = cdkBuilder.build()
}
