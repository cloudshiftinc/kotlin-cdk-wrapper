@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * Configuration of the script to run during a bootstrap action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
 * ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScriptBootstrapActionConfig.html)
 */
@CdkDslMarker
public class EmrCreateClusterScriptBootstrapActionConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder =
      EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder()

  private val _args: MutableList<String> = mutableListOf()

  /**
   * @param args A list of command line arguments to pass to the bootstrap action script.
   */
  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  /**
   * @param args A list of command line arguments to pass to the bootstrap action script.
   */
  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  /**
   * @param path Location of the script to run during a bootstrap action. 
   * Can be either a location in Amazon S3 or on a local file system.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): EmrCreateCluster.ScriptBootstrapActionConfigProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}
