@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.emr.CfnCluster

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
