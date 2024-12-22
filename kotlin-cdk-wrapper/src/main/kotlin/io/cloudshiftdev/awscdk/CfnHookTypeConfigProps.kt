@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnHookTypeConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnHookTypeConfigProps cfnHookTypeConfigProps = CfnHookTypeConfigProps.builder()
 * .configuration("configuration")
 * // the properties below are optional
 * .configurationAlias("configurationAlias")
 * .typeArn("typeArn")
 * .typeName("typeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
 */
public interface CfnHookTypeConfigProps {
  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   *
   * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configuration)
   */
  public fun configuration(): String

  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   *
   * Defaults to `default` alias. Hook types currently support default configuration alias.
   *
   * Default: - "default"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configurationalias)
   */
  public fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

  /**
   * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
   *
   * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typearn)
   */
  public fun typeArn(): String? = unwrap(this).getTypeArn()

  /**
   * The unique name for your Hook.
   *
   * Specifies a three-part namespace for your Hook, with a recommended pattern of
   * `Organization::Service::Hook` .
   *
   * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typename)
   */
  public fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * A builder for [CfnHookTypeConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration Specifies the activated Hook type configuration, in this AWS account and
     * AWS Region . 
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    public fun configuration(configuration: String)

    /**
     * @param configurationAlias Specifies the activated Hook type configuration, in this AWS
     * account and AWS Region .
     * Defaults to `default` alias. Hook types currently support default configuration alias.
     */
    public fun configurationAlias(configurationAlias: String)

    /**
     * @param typeArn The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    public fun typeArn(typeArn: String)

    /**
     * @param typeName The unique name for your Hook.
     * Specifies a three-part namespace for your Hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookTypeConfigProps.Builder =
        software.amazon.awscdk.CfnHookTypeConfigProps.builder()

    /**
     * @param configuration Specifies the activated Hook type configuration, in this AWS account and
     * AWS Region . 
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * @param configurationAlias Specifies the activated Hook type configuration, in this AWS
     * account and AWS Region .
     * Defaults to `default` alias. Hook types currently support default configuration alias.
     */
    override fun configurationAlias(configurationAlias: String) {
      cdkBuilder.configurationAlias(configurationAlias)
    }

    /**
     * @param typeArn The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    override fun typeArn(typeArn: String) {
      cdkBuilder.typeArn(typeArn)
    }

    /**
     * @param typeName The unique name for your Hook.
     * Specifies a three-part namespace for your Hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookTypeConfigProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnHookTypeConfigProps,
  ) : CdkObject(cdkObject),
      CfnHookTypeConfigProps {
    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configuration)
     */
    override fun configuration(): String = unwrap(this).getConfiguration()

    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * Defaults to `default` alias. Hook types currently support default configuration alias.
     *
     * Default: - "default"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configurationalias)
     */
    override fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

    /**
     * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typearn)
     */
    override fun typeArn(): String? = unwrap(this).getTypeArn()

    /**
     * The unique name for your Hook.
     *
     * Specifies a three-part namespace for your Hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typename)
     */
    override fun typeName(): String? = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookTypeConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookTypeConfigProps):
        CfnHookTypeConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnHookTypeConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookTypeConfigProps):
        software.amazon.awscdk.CfnHookTypeConfigProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnHookTypeConfigProps
  }
}
