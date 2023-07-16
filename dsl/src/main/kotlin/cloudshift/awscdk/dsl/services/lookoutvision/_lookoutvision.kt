@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutvision

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutvision.CfnProject
import software.amazon.awscdk.services.lookoutvision.CfnProjectProps
import software.constructs.Construct

public object lookoutvision {
  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
