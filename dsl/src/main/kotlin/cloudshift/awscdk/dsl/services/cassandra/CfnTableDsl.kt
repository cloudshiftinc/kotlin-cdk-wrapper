@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable
import software.constructs.Construct

@CdkDslMarker
public class CfnTableDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

  private val _clusteringKeyColumns: MutableList<Any> = mutableListOf()

  private val _partitionKeyColumns: MutableList<Any> = mutableListOf()

  private val _regularColumns: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun billingMode(billingMode: IResolvable) {
    cdkBuilder.billingMode(billingMode)
  }

  public fun billingMode(billingMode: CfnTable.BillingModeProperty) {
    cdkBuilder.billingMode(billingMode)
  }

  public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
    cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
  }

  public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
    cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
  }

  public fun clusteringKeyColumns(vararg clusteringKeyColumns: Any) {
    _clusteringKeyColumns.addAll(listOf(*clusteringKeyColumns))
  }

  public fun clusteringKeyColumns(clusteringKeyColumns: Collection<Any>) {
    _clusteringKeyColumns.addAll(clusteringKeyColumns)
  }

  public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable) {
    cdkBuilder.clusteringKeyColumns(clusteringKeyColumns)
  }

  public fun defaultTimeToLive(defaultTimeToLive: Number) {
    cdkBuilder.defaultTimeToLive(defaultTimeToLive)
  }

  public fun encryptionSpecification(encryptionSpecification: IResolvable) {
    cdkBuilder.encryptionSpecification(encryptionSpecification)
  }

  public
      fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty) {
    cdkBuilder.encryptionSpecification(encryptionSpecification)
  }

  public fun keyspaceName(keyspaceName: String) {
    cdkBuilder.keyspaceName(keyspaceName)
  }

  public fun partitionKeyColumns(vararg partitionKeyColumns: Any) {
    _partitionKeyColumns.addAll(listOf(*partitionKeyColumns))
  }

  public fun partitionKeyColumns(partitionKeyColumns: Collection<Any>) {
    _partitionKeyColumns.addAll(partitionKeyColumns)
  }

  public fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
    cdkBuilder.partitionKeyColumns(partitionKeyColumns)
  }

  public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
    cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
  }

  public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
    cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
  }

  public fun regularColumns(vararg regularColumns: Any) {
    _regularColumns.addAll(listOf(*regularColumns))
  }

  public fun regularColumns(regularColumns: Collection<Any>) {
    _regularColumns.addAll(regularColumns)
  }

  public fun regularColumns(regularColumns: IResolvable) {
    cdkBuilder.regularColumns(regularColumns)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTable {
    if(_clusteringKeyColumns.isNotEmpty()) cdkBuilder.clusteringKeyColumns(_clusteringKeyColumns)
    if(_partitionKeyColumns.isNotEmpty()) cdkBuilder.partitionKeyColumns(_partitionKeyColumns)
    if(_regularColumns.isNotEmpty()) cdkBuilder.regularColumns(_regularColumns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
