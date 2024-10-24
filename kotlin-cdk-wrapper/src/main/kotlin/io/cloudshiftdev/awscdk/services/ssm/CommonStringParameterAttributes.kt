@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Common attributes for string parameters.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CommonStringParameterAttributes commonStringParameterAttributes =
 * CommonStringParameterAttributes.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .simpleName(false)
 * .build();
 * ```
 */
public interface CommonStringParameterAttributes {
  /**
   * The name of the parameter store value.
   *
   * This value can be a token or a concrete string. If it is a concrete string
   * and includes "/" it must also be prefixed with a "/" (fully-qualified).
   */
  public fun parameterName(): String

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
  public fun simpleName(): Boolean? = unwrap(this).getSimpleName()

  /**
   * A builder for [CommonStringParameterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ssm.CommonStringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes,
  ) : CdkObject(cdkObject),
      CommonStringParameterAttributes {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonStringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes):
        CommonStringParameterAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        CommonStringParameterAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonStringParameterAttributes):
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CommonStringParameterAttributes
  }
}
