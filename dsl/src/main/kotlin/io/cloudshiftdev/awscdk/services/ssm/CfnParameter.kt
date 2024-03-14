package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnParameter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A regular expression used to validate the parameter value.
   */
  public open fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  /**
   * A regular expression used to validate the parameter value.
   */
  public open fun allowedPattern(`value`: String) {
    unwrap(this).setAllowedPattern(`value`)
  }

  /**
   * Returns the type of the parameter.
   *
   * Valid values are `String` or `StringList` .
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * Returns the value of the parameter.
   */
  public open fun attrValue(): String = unwrap(this).getAttrValue()

  /**
   * The data type of the parameter, such as `text` or `aws:ec2:image` .
   */
  public open fun dataType(): String? = unwrap(this).getDataType()

  /**
   * The data type of the parameter, such as `text` or `aws:ec2:image` .
   */
  public open fun dataType(`value`: String) {
    unwrap(this).setDataType(`value`)
  }

  /**
   * Information about the parameter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the parameter.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the parameter.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the parameter.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Information about the policies assigned to a parameter.
   */
  public open fun policies(): String? = unwrap(this).getPolicies()

  /**
   * Information about the policies assigned to a parameter.
   */
  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The parameter tier.
   */
  public open fun tier(): String? = unwrap(this).getTier()

  /**
   * The parameter tier.
   */
  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  /**
   * The type of parameter.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of parameter.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The parameter value.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  /**
   * The parameter value.
   */
  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnParameter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for `String` types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern)
     * @param allowedPattern A regular expression used to validate the parameter value. 
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * The data type of the parameter, such as `text` or `aws:ec2:image` .
     *
     * The default is `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-datatype)
     * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` . 
     */
    public fun dataType(dataType: String)

    /**
     * Information about the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description)
     * @param description Information about the parameter. 
     */
    public fun description(description: String)

    /**
     * The name of the parameter.
     *
     *
     * The maximum length constraint listed below includes capacity for additional system attributes
     * that aren't part of the name. The maximum length for a parameter name, including the full length
     * of the parameter Amazon Resource Name (ARN), is 1011 characters. For example, the length of the
     * following parameter name is 65 characters, not 20 characters:
     * `arn:aws:ssm:us-east-2:111222333444:parameter/ExampleParameterName`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name)
     * @param name The name of the parameter. 
     */
    public fun name(name: String)

    /**
     * Information about the policies assigned to a parameter.
     *
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-policies)
     * @param policies Information about the policies assigned to a parameter. 
     */
    public fun policies(policies: String)

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
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The parameter tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tier)
     * @param tier The parameter tier. 
     */
    public fun tier(tier: String)

    /**
     * The type of parameter.
     *
     *
     * Although `SecureString` is included in the list of valid values, AWS CloudFormation does
     * *not* currently support creating `SecureString` parameters.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type)
     * @param type The type of parameter. 
     */
    public fun type(type: String)

    /**
     * The parameter value.
     *
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value)
     * @param value The parameter value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnParameter.Builder =
        software.amazon.awscdk.services.ssm.CfnParameter.Builder.create(scope, id)

    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for `String` types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern)
     * @param allowedPattern A regular expression used to validate the parameter value. 
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * The data type of the parameter, such as `text` or `aws:ec2:image` .
     *
     * The default is `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-datatype)
     * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` . 
     */
    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    /**
     * Information about the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description)
     * @param description Information about the parameter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the parameter.
     *
     *
     * The maximum length constraint listed below includes capacity for additional system attributes
     * that aren't part of the name. The maximum length for a parameter name, including the full length
     * of the parameter Amazon Resource Name (ARN), is 1011 characters. For example, the length of the
     * following parameter name is 65 characters, not 20 characters:
     * `arn:aws:ssm:us-east-2:111222333444:parameter/ExampleParameterName`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name)
     * @param name The name of the parameter. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Information about the policies assigned to a parameter.
     *
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-policies)
     * @param policies Information about the policies assigned to a parameter. 
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

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
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The parameter tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tier)
     * @param tier The parameter tier. 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * The type of parameter.
     *
     *
     * Although `SecureString` is included in the list of valid values, AWS CloudFormation does
     * *not* currently support creating `SecureString` parameters.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type)
     * @param type The type of parameter. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The parameter value.
     *
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value)
     * @param value The parameter value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnParameter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnParameter): CfnParameter =
        CfnParameter(cdkObject)

    internal fun unwrap(wrapped: CfnParameter): software.amazon.awscdk.services.ssm.CfnParameter =
        wrapped.cdkObject
  }
}
