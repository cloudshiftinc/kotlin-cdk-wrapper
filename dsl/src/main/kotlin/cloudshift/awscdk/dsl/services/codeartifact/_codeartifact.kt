@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeartifact

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnDomain
import software.amazon.awscdk.services.codeartifact.CfnDomainProps
import software.amazon.awscdk.services.codeartifact.CfnRepository
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
import software.constructs.Construct

public object codeartifact {
  public inline fun cfnDomain(
    scope: Construct,
    id: String,
    block: CfnDomainDsl.() -> Unit = {},
  ): CfnDomain {
    val builder = CfnDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
    val builder = CfnDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepository(
    scope: Construct,
    id: String,
    block: CfnRepositoryDsl.() -> Unit = {},
  ): CfnRepository {
    val builder = CfnRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}):
      CfnRepositoryProps {
    val builder = CfnRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
