@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.CfnResolver

/**
 * Use the `PipelineConfig` property type to specify `PipelineConfig` for an AWS AppSync resolver.
 *
 * `PipelineConfig` is a property of the
 * [AWS::AppSync::Resolver](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * PipelineConfigProperty pipelineConfigProperty = PipelineConfigProperty.builder()
 * .functions(List.of("functions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html)
 */
@CdkDslMarker
public class CfnResolverPipelineConfigPropertyDsl {
  private val cdkBuilder: CfnResolver.PipelineConfigProperty.Builder =
      CfnResolver.PipelineConfigProperty.builder()

  private val _functions: MutableList<String> = mutableListOf()

  /**
   * @param functions A list of `Function` objects.
   */
  public fun functions(vararg functions: String) {
    _functions.addAll(listOf(*functions))
  }

  /**
   * @param functions A list of `Function` objects.
   */
  public fun functions(functions: Collection<String>) {
    _functions.addAll(functions)
  }

  public fun build(): CfnResolver.PipelineConfigProperty {
    if(_functions.isNotEmpty()) cdkBuilder.functions(_functions)
    return cdkBuilder.build()
  }
}
