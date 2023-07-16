@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex
import software.constructs.Construct

@CdkDslMarker
public class CfnIndexDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIndex.Builder = CfnIndex.Builder.create(scope, id)

  private val _documentMetadataConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _userTokenConfigurations: MutableList<Any> = mutableListOf()

  public fun capacityUnits(capacityUnits: IResolvable) {
    cdkBuilder.capacityUnits(capacityUnits)
  }

  public fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty) {
    cdkBuilder.capacityUnits(capacityUnits)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any) {
    _documentMetadataConfigurations.addAll(listOf(*documentMetadataConfigurations))
  }

  public fun documentMetadataConfigurations(documentMetadataConfigurations: Collection<Any>) {
    _documentMetadataConfigurations.addAll(documentMetadataConfigurations)
  }

  public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
    cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations)
  }

  public fun edition(edition: String) {
    cdkBuilder.edition(edition)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public
      fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userContextPolicy(userContextPolicy: String) {
    cdkBuilder.userContextPolicy(userContextPolicy)
  }

  public fun userTokenConfigurations(vararg userTokenConfigurations: Any) {
    _userTokenConfigurations.addAll(listOf(*userTokenConfigurations))
  }

  public fun userTokenConfigurations(userTokenConfigurations: Collection<Any>) {
    _userTokenConfigurations.addAll(userTokenConfigurations)
  }

  public fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
    cdkBuilder.userTokenConfigurations(userTokenConfigurations)
  }

  public fun build(): CfnIndex {
    if(_documentMetadataConfigurations.isNotEmpty())
        cdkBuilder.documentMetadataConfigurations(_documentMetadataConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_userTokenConfigurations.isNotEmpty())
        cdkBuilder.userTokenConfigurations(_userTokenConfigurations)
    return cdkBuilder.build()
  }
}
