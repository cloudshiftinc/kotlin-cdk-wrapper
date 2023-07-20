@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codegurureviewer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
import software.constructs.Construct

public object codegurureviewer {
  public inline fun cfnRepositoryAssociation(
    scope: Construct,
    id: String,
    block: CfnRepositoryAssociationDsl.() -> Unit = {},
  ): CfnRepositoryAssociation {
    val builder = CfnRepositoryAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepositoryAssociationProps(block: CfnRepositoryAssociationPropsDsl.() -> Unit
      = {}): CfnRepositoryAssociationProps {
    val builder = CfnRepositoryAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
