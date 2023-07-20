@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnApplication
import software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
import software.constructs.Construct

public object servicecatalogappregistry {
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAttributeGroup(
    scope: Construct,
    id: String,
    block: CfnAttributeGroupDsl.() -> Unit = {},
  ): CfnAttributeGroup {
    val builder = CfnAttributeGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAttributeGroupAssociation(
    scope: Construct,
    id: String,
    block: CfnAttributeGroupAssociationDsl.() -> Unit = {},
  ): CfnAttributeGroupAssociation {
    val builder = CfnAttributeGroupAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAttributeGroupAssociationProps(block: CfnAttributeGroupAssociationPropsDsl.() -> Unit =
      {}): CfnAttributeGroupAssociationProps {
    val builder = CfnAttributeGroupAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAttributeGroupProps(block: CfnAttributeGroupPropsDsl.() -> Unit = {}):
      CfnAttributeGroupProps {
    val builder = CfnAttributeGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceAssociation(
    scope: Construct,
    id: String,
    block: CfnResourceAssociationDsl.() -> Unit = {},
  ): CfnResourceAssociation {
    val builder = CfnResourceAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceAssociationProps(block: CfnResourceAssociationPropsDsl.() -> Unit =
      {}): CfnResourceAssociationProps {
    val builder = CfnResourceAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
