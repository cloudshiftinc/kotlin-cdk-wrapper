@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `HookTypeConfig` resource specifies the configuration of a Hook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnHookTypeConfig cfnHookTypeConfig = CfnHookTypeConfig.Builder.create(this,
 * "MyCfnHookTypeConfig")
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
public open class CfnHookTypeConfig(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookTypeConfigProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHookTypeConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookTypeConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHookTypeConfigProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) of the activated Hook type configuration, in this account and
   * Region.
   */
  public open fun attrConfigurationArn(): String = unwrap(this).getAttrConfigurationArn()

  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   */
  public open fun configuration(): String = unwrap(this).getConfiguration()

  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   */
  public open fun configuration(`value`: String) {
    unwrap(this).setConfiguration(`value`)
  }

  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   */
  public open fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

  /**
   * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
   */
  public open fun configurationAlias(`value`: String) {
    unwrap(this).setConfigurationAlias(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
   */
  public open fun typeArn(): String? = unwrap(this).getTypeArn()

  /**
   * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
   */
  public open fun typeArn(`value`: String) {
    unwrap(this).setTypeArn(`value`)
  }

  /**
   * The unique name for your Hook.
   */
  public open fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The unique name for your Hook.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnHookTypeConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configuration)
     * @param configuration Specifies the activated Hook type configuration, in this AWS account and
     * AWS Region . 
     */
    public fun configuration(configuration: String)

    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * Defaults to `default` alias. Hook types currently support default configuration alias.
     *
     * Default: - "default"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configurationalias)
     * @param configurationAlias Specifies the activated Hook type configuration, in this AWS
     * account and AWS Region . 
     */
    public fun configurationAlias(configurationAlias: String)

    /**
     * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typearn)
     * @param typeArn The Amazon Resource Number (ARN) for the Hook to set `Configuration` for. 
     */
    public fun typeArn(typeArn: String)

    /**
     * The unique name for your Hook.
     *
     * Specifies a three-part namespace for your Hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typename)
     * @param typeName The unique name for your Hook. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig.Builder
        = software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig.Builder.create(scope, id)

    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configuration)
     * @param configuration Specifies the activated Hook type configuration, in this AWS account and
     * AWS Region . 
     */
    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * Specifies the activated Hook type configuration, in this AWS account and AWS Region .
     *
     * Defaults to `default` alias. Hook types currently support default configuration alias.
     *
     * Default: - "default"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configurationalias)
     * @param configurationAlias Specifies the activated Hook type configuration, in this AWS
     * account and AWS Region . 
     */
    override fun configurationAlias(configurationAlias: String) {
      cdkBuilder.configurationAlias(configurationAlias)
    }

    /**
     * The Amazon Resource Number (ARN) for the Hook to set `Configuration` for.
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typearn)
     * @param typeArn The Amazon Resource Number (ARN) for the Hook to set `Configuration` for. 
     */
    override fun typeArn(typeArn: String) {
      cdkBuilder.typeArn(typeArn)
    }

    /**
     * The unique name for your Hook.
     *
     * Specifies a three-part namespace for your Hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeArn` and `Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typename)
     * @param typeName The unique name for your Hook. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookTypeConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookTypeConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig):
        CfnHookTypeConfig = CfnHookTypeConfig(cdkObject)

    internal fun unwrap(wrapped: CfnHookTypeConfig):
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
  }
}
