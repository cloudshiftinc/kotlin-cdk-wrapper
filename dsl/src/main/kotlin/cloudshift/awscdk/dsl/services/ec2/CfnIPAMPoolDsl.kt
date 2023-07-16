@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

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
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.constructs.Construct

@CdkDslMarker
public class CfnIPAMPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIPAMPool.Builder = CfnIPAMPool.Builder.create(scope, id)

  private val _allocationResourceTags: MutableList<Any> = mutableListOf()

  private val _provisionedCidrs: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun addressFamily(addressFamily: String) {
    cdkBuilder.addressFamily(addressFamily)
  }

  public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
    cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
  }

  public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
    cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
  }

  public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
    cdkBuilder.allocationMinNetmaskLength(allocationMinNetmaskLength)
  }

  public fun allocationResourceTags(vararg allocationResourceTags: Any) {
    _allocationResourceTags.addAll(listOf(*allocationResourceTags))
  }

  public fun allocationResourceTags(allocationResourceTags: Collection<Any>) {
    _allocationResourceTags.addAll(allocationResourceTags)
  }

  public fun allocationResourceTags(allocationResourceTags: IResolvable) {
    cdkBuilder.allocationResourceTags(allocationResourceTags)
  }

  public fun autoImport(autoImport: Boolean) {
    cdkBuilder.autoImport(autoImport)
  }

  public fun autoImport(autoImport: IResolvable) {
    cdkBuilder.autoImport(autoImport)
  }

  public fun awsService(awsService: String) {
    cdkBuilder.awsService(awsService)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun ipamScopeId(ipamScopeId: String) {
    cdkBuilder.ipamScopeId(ipamScopeId)
  }

  public fun locale(locale: String) {
    cdkBuilder.locale(locale)
  }

  public fun provisionedCidrs(vararg provisionedCidrs: Any) {
    _provisionedCidrs.addAll(listOf(*provisionedCidrs))
  }

  public fun provisionedCidrs(provisionedCidrs: Collection<Any>) {
    _provisionedCidrs.addAll(provisionedCidrs)
  }

  public fun provisionedCidrs(provisionedCidrs: IResolvable) {
    cdkBuilder.provisionedCidrs(provisionedCidrs)
  }

  public fun publicIpSource(publicIpSource: String) {
    cdkBuilder.publicIpSource(publicIpSource)
  }

  public fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
    cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
  }

  public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
    cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
  }

  public fun sourceIpamPoolId(sourceIpamPoolId: String) {
    cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIPAMPool {
    if(_allocationResourceTags.isNotEmpty())
        cdkBuilder.allocationResourceTags(_allocationResourceTags)
    if(_provisionedCidrs.isNotEmpty()) cdkBuilder.provisionedCidrs(_provisionedCidrs)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
