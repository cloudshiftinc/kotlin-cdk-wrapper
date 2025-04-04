@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Attributes for parameters of various types of string.
 *
 * Example:
 *
 * ```
 * Number parameterVersion = Token.asNumber(Map.of("Ref", "MyParameter"));
 * // Retrieve the latest value of the non-secret parameter
 * // with name "/My/String/Parameter".
 * String stringValue = StringParameter.fromStringParameterAttributes(this, "MyValue",
 * StringParameterAttributes.builder()
 * .parameterName("/My/Public/Parameter")
 * .build()).getStringValue();
 * String stringValueVersionFromToken = StringParameter.fromStringParameterAttributes(this,
 * "MyValueVersionFromToken", StringParameterAttributes.builder()
 * .parameterName("/My/Public/Parameter")
 * // parameter version from token
 * .version(parameterVersion)
 * .build()).getStringValue();
 * // Retrieve a specific version of the secret (SecureString) parameter.
 * // 'version' is always required.
 * IStringParameter secretValue = StringParameter.fromSecureStringParameterAttributes(this,
 * "MySecureValue", SecureStringParameterAttributes.builder()
 * .parameterName("/My/Secret/Parameter")
 * .version(5)
 * .build());
 * IStringParameter secretValueVersionFromToken =
 * StringParameter.fromSecureStringParameterAttributes(this, "MySecureValueVersionFromToken",
 * SecureStringParameterAttributes.builder()
 * .parameterName("/My/Secret/Parameter")
 * // parameter version from token
 * .version(parameterVersion)
 * .build());
 * ```
 *
 * [Documentation](ParameterType)
 */
public interface StringParameterAttributes : CommonStringParameterAttributes {
  /**
   * Use a dynamic reference as the representation in CloudFormation template level.
   *
   * By default, CDK tries to deduce an appropriate representation based on the parameter value (a
   * CfnParameter or a dynamic reference). Use this flag to override the representation when it does
   * not work.
   *
   * Default: false
   */
  public fun forceDynamicReference(): Boolean? = unwrap(this).getForceDynamicReference()

  /**
   * (deprecated) The type of the string parameter.
   *
   * Default: ParameterType.STRING
   *
   * * use valueType instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

  /**
   * The type of the string parameter value.
   *
   * Using specific types can be helpful in catching invalid values
   * at the start of creating or updating a stack. CloudFormation validates
   * the values against existing values in the account.
   *
   * Note - if you want to allow values from different AWS accounts, use
   * ParameterValueType.STRING
   *
   * Default: ParameterValueType.STRING
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types)
   */
  public fun valueType(): ParameterValueType? =
      unwrap(this).getValueType()?.let(ParameterValueType::wrap)

  /**
   * The version number of the value you wish to retrieve.
   *
   * Default: The latest version will be retrieved.
   */
  public fun version(): Number? = unwrap(this).getVersion()

  /**
   * A builder for [StringParameterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param forceDynamicReference Use a dynamic reference as the representation in CloudFormation
     * template level.
     * By default, CDK tries to deduce an appropriate representation based on the parameter value (a
     * CfnParameter or a dynamic reference). Use this flag to override the representation when it does
     * not work.
     */
    public fun forceDynamicReference(forceDynamicReference: Boolean)

    /**
     * @param parameterName The name of the parameter store value. 
     * This value can be a token or a concrete string. If it is a concrete string
     * and includes "/" it must also be prefixed with a "/" (fully-qualified).
     */
    public fun parameterName(parameterName: String)

    /**
     * @param simpleName Indicates whether the parameter name is a simple name.
     * A parameter name
     * without any "/" is considered a simple name. If the parameter name includes
     * "/", setting simpleName to true might cause unintended issues such
     * as duplicate "/" in the resulting ARN.
     *
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     */
    public fun simpleName(simpleName: Boolean)

    /**
     * @param type The type of the string parameter.
     * @deprecated - use valueType instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType)

    /**
     * @param valueType The type of the string parameter value.
     * Using specific types can be helpful in catching invalid values
     * at the start of creating or updating a stack. CloudFormation validates
     * the values against existing values in the account.
     *
     * Note - if you want to allow values from different AWS accounts, use
     * ParameterValueType.STRING
     */
    public fun valueType(valueType: ParameterValueType)

    /**
     * @param version The version number of the value you wish to retrieve.
     */
    public fun version(version: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.StringParameterAttributes.builder()

    /**
     * @param forceDynamicReference Use a dynamic reference as the representation in CloudFormation
     * template level.
     * By default, CDK tries to deduce an appropriate representation based on the parameter value (a
     * CfnParameter or a dynamic reference). Use this flag to override the representation when it does
     * not work.
     */
    override fun forceDynamicReference(forceDynamicReference: Boolean) {
      cdkBuilder.forceDynamicReference(forceDynamicReference)
    }

    /**
     * @param parameterName The name of the parameter store value. 
     * This value can be a token or a concrete string. If it is a concrete string
     * and includes "/" it must also be prefixed with a "/" (fully-qualified).
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param simpleName Indicates whether the parameter name is a simple name.
     * A parameter name
     * without any "/" is considered a simple name. If the parameter name includes
     * "/", setting simpleName to true might cause unintended issues such
     * as duplicate "/" in the resulting ARN.
     *
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     */
    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    /**
     * @param type The type of the string parameter.
     * @deprecated - use valueType instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun type(type: ParameterType) {
      cdkBuilder.type(type.let(ParameterType.Companion::unwrap))
    }

    /**
     * @param valueType The type of the string parameter value.
     * Using specific types can be helpful in catching invalid values
     * at the start of creating or updating a stack. CloudFormation validates
     * the values against existing values in the account.
     *
     * Note - if you want to allow values from different AWS accounts, use
     * ParameterValueType.STRING
     */
    override fun valueType(valueType: ParameterValueType) {
      cdkBuilder.valueType(valueType.let(ParameterValueType.Companion::unwrap))
    }

    /**
     * @param version The version number of the value you wish to retrieve.
     */
    override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes,
  ) : CdkObject(cdkObject),
      StringParameterAttributes {
    /**
     * Use a dynamic reference as the representation in CloudFormation template level.
     *
     * By default, CDK tries to deduce an appropriate representation based on the parameter value (a
     * CfnParameter or a dynamic reference). Use this flag to override the representation when it does
     * not work.
     *
     * Default: false
     */
    override fun forceDynamicReference(): Boolean? = unwrap(this).getForceDynamicReference()

    /**
     * The name of the parameter store value.
     *
     * This value can be a token or a concrete string. If it is a concrete string
     * and includes "/" it must also be prefixed with a "/" (fully-qualified).
     */
    override fun parameterName(): String = unwrap(this).getParameterName()

    /**
     * Indicates whether the parameter name is a simple name.
     *
     * A parameter name
     * without any "/" is considered a simple name. If the parameter name includes
     * "/", setting simpleName to true might cause unintended issues such
     * as duplicate "/" in the resulting ARN.
     *
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     *
     * Default: - auto-detect based on `parameterName`
     */
    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    /**
     * (deprecated) The type of the string parameter.
     *
     * Default: ParameterType.STRING
     *
     * * use valueType instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

    /**
     * The type of the string parameter value.
     *
     * Using specific types can be helpful in catching invalid values
     * at the start of creating or updating a stack. CloudFormation validates
     * the values against existing values in the account.
     *
     * Note - if you want to allow values from different AWS accounts, use
     * ParameterValueType.STRING
     *
     * Default: ParameterValueType.STRING
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types)
     */
    override fun valueType(): ParameterValueType? =
        unwrap(this).getValueType()?.let(ParameterValueType::wrap)

    /**
     * The version number of the value you wish to retrieve.
     *
     * Default: The latest version will be retrieved.
     */
    override fun version(): Number? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes):
        StringParameterAttributes = CdkObjectWrappers.wrap(cdkObject) as? StringParameterAttributes
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringParameterAttributes):
        software.amazon.awscdk.services.ssm.StringParameterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.StringParameterAttributes
  }
}
