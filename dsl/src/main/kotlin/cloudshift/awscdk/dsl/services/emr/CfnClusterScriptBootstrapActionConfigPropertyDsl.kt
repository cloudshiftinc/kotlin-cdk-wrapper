@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `ScriptBootstrapActionConfig` is a subproperty of the `BootstrapActionConfig` property type.
 *
 * `ScriptBootstrapActionConfig` specifies the arguments and location of the bootstrap script for
 * EMR to run on all cluster nodes before it installs open-source big data applications on them.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
 * ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html)
 */
@CdkDslMarker
public class CfnClusterScriptBootstrapActionConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.ScriptBootstrapActionConfigProperty.Builder =
      CfnCluster.ScriptBootstrapActionConfigProperty.builder()

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
   * @param path Location in Amazon S3 of the script to run during a bootstrap action. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnCluster.ScriptBootstrapActionConfigProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}
