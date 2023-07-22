@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookTypeConfig
import software.constructs.Construct

/**
 * The `HookTypeConfig` resource specifies the configuration of a hook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
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
@CdkDslMarker
public class CfnHookTypeConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHookTypeConfig.Builder = CfnHookTypeConfig.Builder.create(scope, id)

  /**
   * Specifies the activated hook type configuration, in this AWS account and AWS Region .
   *
   * You must specify either `TypeName` and `Configuration` or `TypeARN` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configuration)
   * @param configuration Specifies the activated hook type configuration, in this AWS account and
   * AWS Region . 
   */
  public fun configuration(configuration: String) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * Specifies the activated hook type configuration, in this AWS account and AWS Region .
   *
   * Defaults to `default` alias. Hook types currently support default configuration alias.
   *
   * Default: - "default"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-configurationalias)
   * @param configurationAlias Specifies the activated hook type configuration, in this AWS account
   * and AWS Region . 
   */
  public fun configurationAlias(configurationAlias: String) {
    cdkBuilder.configurationAlias(configurationAlias)
  }

  /**
   * The Amazon Resource Number (ARN) for the hook to set `Configuration` for.
   *
   * You must specify either `TypeName` and `Configuration` or `TypeARN` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typearn)
   * @param typeArn The Amazon Resource Number (ARN) for the hook to set `Configuration` for. 
   */
  public fun typeArn(typeArn: String) {
    cdkBuilder.typeArn(typeArn)
  }

  /**
   * The unique name for your hook.
   *
   * Specifies a three-part namespace for your hook, with a recommended pattern of
   * `Organization::Service::Hook` .
   *
   * You must specify either `TypeName` and `Configuration` or `TypeARN` and `Configuration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html#cfn-cloudformation-hooktypeconfig-typename)
   * @param typeName The unique name for your hook. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnHookTypeConfig = cdkBuilder.build()
}
