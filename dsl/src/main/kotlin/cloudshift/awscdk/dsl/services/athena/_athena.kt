@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnCapacityReservationProps
import software.amazon.awscdk.services.athena.CfnDataCatalog
import software.amazon.awscdk.services.athena.CfnDataCatalogProps
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps
import software.constructs.Construct

public object athena {
  public inline fun cfnCapacityReservation(
    scope: Construct,
    id: String,
    block: CfnCapacityReservationDsl.() -> Unit = {},
  ): CfnCapacityReservation {
    val builder = CfnCapacityReservationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationCapacityAssignmentConfigurationProperty(block: CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl.() -> Unit
      = {}): CfnCapacityReservation.CapacityAssignmentConfigurationProperty {
    val builder = CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationCapacityAssignmentProperty(block: CfnCapacityReservationCapacityAssignmentPropertyDsl.() -> Unit
      = {}): CfnCapacityReservation.CapacityAssignmentProperty {
    val builder = CfnCapacityReservationCapacityAssignmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCapacityReservationProps(block: CfnCapacityReservationPropsDsl.() -> Unit =
      {}): CfnCapacityReservationProps {
    val builder = CfnCapacityReservationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataCatalog(
    scope: Construct,
    id: String,
    block: CfnDataCatalogDsl.() -> Unit = {},
  ): CfnDataCatalog {
    val builder = CfnDataCatalogDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataCatalogProps(block: CfnDataCatalogPropsDsl.() -> Unit = {}):
      CfnDataCatalogProps {
    val builder = CfnDataCatalogPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNamedQuery(
    scope: Construct,
    id: String,
    block: CfnNamedQueryDsl.() -> Unit = {},
  ): CfnNamedQuery {
    val builder = CfnNamedQueryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNamedQueryProps(block: CfnNamedQueryPropsDsl.() -> Unit = {}):
      CfnNamedQueryProps {
    val builder = CfnNamedQueryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPreparedStatement(
    scope: Construct,
    id: String,
    block: CfnPreparedStatementDsl.() -> Unit = {},
  ): CfnPreparedStatement {
    val builder = CfnPreparedStatementDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPreparedStatementProps(block: CfnPreparedStatementPropsDsl.() -> Unit = {}):
      CfnPreparedStatementProps {
    val builder = CfnPreparedStatementPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkGroup(
    scope: Construct,
    id: String,
    block: CfnWorkGroupDsl.() -> Unit = {},
  ): CfnWorkGroup {
    val builder = CfnWorkGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupAclConfigurationProperty(block: CfnWorkGroupAclConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.AclConfigurationProperty {
    val builder = CfnWorkGroupAclConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupCustomerContentEncryptionConfigurationProperty(block: CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty {
    val builder = CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupEncryptionConfigurationProperty(block: CfnWorkGroupEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.EncryptionConfigurationProperty {
    val builder = CfnWorkGroupEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupEngineVersionProperty(block: CfnWorkGroupEngineVersionPropertyDsl.() -> Unit =
      {}): CfnWorkGroup.EngineVersionProperty {
    val builder = CfnWorkGroupEngineVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkGroupProps(block: CfnWorkGroupPropsDsl.() -> Unit = {}):
      CfnWorkGroupProps {
    val builder = CfnWorkGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupResultConfigurationProperty(block: CfnWorkGroupResultConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.ResultConfigurationProperty {
    val builder = CfnWorkGroupResultConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkGroupWorkGroupConfigurationProperty(block: CfnWorkGroupWorkGroupConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.WorkGroupConfigurationProperty {
    val builder = CfnWorkGroupWorkGroupConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
