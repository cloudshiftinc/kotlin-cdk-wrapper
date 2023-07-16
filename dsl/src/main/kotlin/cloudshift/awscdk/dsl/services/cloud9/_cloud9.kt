@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloud9

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
import software.constructs.Construct

public object cloud9 {
  public inline fun cfnEnvironmentEC2(
    scope: Construct,
    id: String,
    block: CfnEnvironmentEC2Dsl.() -> Unit = {},
  ): CfnEnvironmentEC2 {
    val builder = CfnEnvironmentEC2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironmentEC2Props(block: CfnEnvironmentEC2PropsDsl.() -> Unit = {}):
      CfnEnvironmentEC2Props {
    val builder = CfnEnvironmentEC2PropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentEC2RepositoryProperty(block: CfnEnvironmentEC2RepositoryPropertyDsl.() -> Unit
      = {}): CfnEnvironmentEC2.RepositoryProperty {
    val builder = CfnEnvironmentEC2RepositoryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
