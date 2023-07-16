@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdbelastic

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdbelastic.CfnCluster
import software.amazon.awscdk.services.docdbelastic.CfnClusterProps
import software.constructs.Construct

public object docdbelastic {
  public inline fun cfnCluster(
    scope: Construct,
    id: String,
    block: CfnClusterDsl.() -> Unit = {},
  ): CfnCluster {
    val builder = CfnClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
    val builder = CfnClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
