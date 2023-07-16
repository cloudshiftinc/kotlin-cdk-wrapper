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

  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnCluster.ScriptBootstrapActionConfigProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}
