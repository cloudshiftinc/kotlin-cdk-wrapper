@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties needed to create a StringList SSM Parameter.
 *
 * Example:
 *
 * ```
 * // Grant read access to some Role
 * IRole role;
 * // Create a new SSM Parameter holding a String
 * StringParameter param = StringParameter.Builder.create(this, "StringParameter")
 * // description: 'Some user-friendly description',
 * // name: 'ParameterName',
 * .stringValue("Initial parameter value")
 * .build();
 * param.grantRead(role);
 * // Create a new SSM Parameter holding a StringList
 * StringListParameter listParameter = StringListParameter.Builder.create(this,
 * "StringListParameter")
 * // description: 'Some user-friendly description',
 * // name: 'ParameterName',
 * .stringListValue(List.of("Initial parameter value A", "Initial parameter value B"))
 * .build();
 * ```
 */
public interface StringListParameterProps : ParameterOptions {
  /**
   * The values of the parameter.
   *
   * It may not reference another parameter and `{{}}` cannot be used in the value.
   */
  public fun stringListValue(): List<String>

  /**
   * A builder for [StringListParameterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * @param description Information about the parameter that you want to add to the system.
     */
    public fun description(description: String)

    /**
     * @param parameterName The name of the parameter.
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
     * @param stringListValue The values of the parameter. 
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     */
    public fun stringListValue(stringListValue: List<String>)

    /**
     * @param stringListValue The values of the parameter. 
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     */
    public fun stringListValue(vararg stringListValue: String)

    /**
     * @param tier The tier of the string parameter.
     */
    public fun tier(tier: ParameterTier)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringListParameterProps.Builder =
        software.amazon.awscdk.services.ssm.StringListParameterProps.builder()

    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * @param description Information about the parameter that you want to add to the system.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param parameterName The name of the parameter.
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
     * @param stringListValue The values of the parameter. 
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     */
    override fun stringListValue(stringListValue: List<String>) {
      cdkBuilder.stringListValue(stringListValue)
    }

    /**
     * @param stringListValue The values of the parameter. 
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     */
    override fun stringListValue(vararg stringListValue: String): Unit =
        stringListValue(stringListValue.toList())

    /**
     * @param tier The tier of the string parameter.
     */
    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringListParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.StringListParameterProps,
  ) : CdkObject(cdkObject),
      StringListParameterProps {
    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     *
     * Default: no validation is performed
     */
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    /**
     * Information about the parameter that you want to add to the system.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parameter.
     *
     * Default: - a name will be generated by CloudFormation
     */
    override fun parameterName(): String? = unwrap(this).getParameterName()

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
     * The values of the parameter.
     *
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     */
    override fun stringListValue(): List<String> = unwrap(this).getStringListValue()

    /**
     * The tier of the string parameter.
     *
     * Default: - undefined
     */
    override fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringListParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringListParameterProps):
        StringListParameterProps = CdkObjectWrappers.wrap(cdkObject) as? StringListParameterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringListParameterProps):
        software.amazon.awscdk.services.ssm.StringListParameterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.StringListParameterProps
  }
}
