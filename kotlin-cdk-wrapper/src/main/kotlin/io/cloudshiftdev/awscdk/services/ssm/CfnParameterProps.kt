@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnParameter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CfnParameterProps cfnParameterProps = CfnParameterProps.builder()
 * .type("type")
 * .value("value")
 * // the properties below are optional
 * .allowedPattern("allowedPattern")
 * .dataType("dataType")
 * .description("description")
 * .name("name")
 * .policies("policies")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .tier("tier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html)
 */
public interface CfnParameterProps {
  /**
   * A regular expression used to validate the parameter value.
   *
   * For example, for `String` types with values restricted to numbers, you can specify the
   * following: `AllowedPattern=^\d+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern)
   */
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  /**
   * The data type of the parameter, such as `text` or `aws:ec2:image` .
   *
   * The default is `text` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-datatype)
   */
  public fun dataType(): String? = unwrap(this).getDataType()

  /**
   * Information about the parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the parameter.
   *
   *
   * The reported maximum length of 2048 characters for a parameter name includes 1037 characters
   * that are reserved for internal use by Systems Manager . The maximum length for a parameter name
   * that you specify is 1011 characters.
   *
   * This count of 1011 characters includes the characters in the ARN that precede the name you
   * specify. This ARN length will vary depending on your partition and Region. For example, the
   * following 45 characters count toward the 1011 character maximum for a parameter created in the US
   * East (Ohio) Region: `arn:aws:ssm:us-east-2:111122223333:parameter/` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Information about the policies assigned to a parameter.
   *
   * [Assigning parameter
   * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
   * in the *AWS Systems Manager User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-policies)
   */
  public fun policies(): String? = unwrap(this).getPolicies()

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a Systems Manager parameter to identify the type
   * of resource to which it applies, the environment, or the type of configuration data referenced by
   * the parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The parameter tier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tier)
   */
  public fun tier(): String? = unwrap(this).getTier()

  /**
   * The type of parameter.
   *
   *
   * Parameters of type `SecureString` are not supported by AWS CloudFormation .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type)
   */
  public fun type(): String

  /**
   * The parameter value.
   *
   *
   * If type is `StringList` , the system returns a comma-separated string with no spaces between
   * commas in the `Value` field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value)
   */
  public fun `value`(): String

  /**
   * A builder for [CfnParameterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for `String` types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` .
     * The default is `text` .
     */
    public fun dataType(dataType: String)

    /**
     * @param description Information about the parameter.
     */
    public fun description(description: String)

    /**
     * @param name The name of the parameter.
     *
     * The reported maximum length of 2048 characters for a parameter name includes 1037 characters
     * that are reserved for internal use by Systems Manager . The maximum length for a parameter name
     * that you specify is 1011 characters.
     *
     * This count of 1011 characters includes the characters in the ARN that precede the name you
     * specify. This ARN length will vary depending on your partition and Region. For example, the
     * following 45 characters count toward the 1011 character maximum for a parameter created in the
     * US East (Ohio) Region: `arn:aws:ssm:us-east-2:111122223333:parameter/` .
     */
    public fun name(name: String)

    /**
     * @param policies Information about the policies assigned to a parameter.
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     */
    public fun policies(policies: String)

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager parameter to identify the type
     * of resource to which it applies, the environment, or the type of configuration data referenced
     * by the parameter.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param tier The parameter tier.
     */
    public fun tier(tier: String)

    /**
     * @param type The type of parameter. 
     *
     * Parameters of type `SecureString` are not supported by AWS CloudFormation .
     */
    public fun type(type: String)

    /**
     * @param value The parameter value. 
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnParameterProps.Builder =
        software.amazon.awscdk.services.ssm.CfnParameterProps.builder()

    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for `String` types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` .
     * The default is `text` .
     */
    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    /**
     * @param description Information about the parameter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the parameter.
     *
     * The reported maximum length of 2048 characters for a parameter name includes 1037 characters
     * that are reserved for internal use by Systems Manager . The maximum length for a parameter name
     * that you specify is 1011 characters.
     *
     * This count of 1011 characters includes the characters in the ARN that precede the name you
     * specify. This ARN length will vary depending on your partition and Region. For example, the
     * following 45 characters count toward the 1011 character maximum for a parameter created in the
     * US East (Ohio) Region: `arn:aws:ssm:us-east-2:111122223333:parameter/` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policies Information about the policies assigned to a parameter.
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager parameter to identify the type
     * of resource to which it applies, the environment, or the type of configuration data referenced
     * by the parameter.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param tier The parameter tier.
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * @param type The type of parameter. 
     *
     * Parameters of type `SecureString` are not supported by AWS CloudFormation .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param value The parameter value. 
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnParameterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.CfnParameterProps,
  ) : CdkObject(cdkObject),
      CfnParameterProps {
    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for `String` types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern)
     */
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    /**
     * The data type of the parameter, such as `text` or `aws:ec2:image` .
     *
     * The default is `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-datatype)
     */
    override fun dataType(): String? = unwrap(this).getDataType()

    /**
     * Information about the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parameter.
     *
     *
     * The reported maximum length of 2048 characters for a parameter name includes 1037 characters
     * that are reserved for internal use by Systems Manager . The maximum length for a parameter name
     * that you specify is 1011 characters.
     *
     * This count of 1011 characters includes the characters in the ARN that precede the name you
     * specify. This ARN length will vary depending on your partition and Region. For example, the
     * following 45 characters count toward the 1011 character maximum for a parameter created in the
     * US East (Ohio) Region: `arn:aws:ssm:us-east-2:111122223333:parameter/` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Information about the policies assigned to a parameter.
     *
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-policies)
     */
    override fun policies(): String? = unwrap(this).getPolicies()

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager parameter to identify the type
     * of resource to which it applies, the environment, or the type of configuration data referenced
     * by the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The parameter tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tier)
     */
    override fun tier(): String? = unwrap(this).getTier()

    /**
     * The type of parameter.
     *
     *
     * Parameters of type `SecureString` are not supported by AWS CloudFormation .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * The parameter value.
     *
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value)
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnParameterProps):
        CfnParameterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnParameterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterProps):
        software.amazon.awscdk.services.ssm.CfnParameterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.CfnParameterProps
  }
}
