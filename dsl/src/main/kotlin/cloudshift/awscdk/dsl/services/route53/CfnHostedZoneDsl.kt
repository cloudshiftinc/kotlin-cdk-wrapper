@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.constructs.Construct

@CdkDslMarker
public class CfnHostedZoneDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHostedZone.Builder = CfnHostedZone.Builder.create(scope, id)

  private val _hostedZoneTags: MutableList<CfnHostedZone.HostedZoneTagProperty> = mutableListOf()

  private val _vpcs: MutableList<Any> = mutableListOf()

  public fun hostedZoneConfig(hostedZoneConfig: IResolvable) {
    cdkBuilder.hostedZoneConfig(hostedZoneConfig)
  }

  public fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty) {
    cdkBuilder.hostedZoneConfig(hostedZoneConfig)
  }

  public fun hostedZoneTags(hostedZoneTags: CfnHostedZoneHostedZoneTagPropertyDsl.() -> Unit) {
    _hostedZoneTags.add(CfnHostedZoneHostedZoneTagPropertyDsl().apply(hostedZoneTags).build())
  }

  public fun hostedZoneTags(hostedZoneTags: Collection<CfnHostedZone.HostedZoneTagProperty>) {
    _hostedZoneTags.addAll(hostedZoneTags)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun queryLoggingConfig(queryLoggingConfig: IResolvable) {
    cdkBuilder.queryLoggingConfig(queryLoggingConfig)
  }

  public fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty) {
    cdkBuilder.queryLoggingConfig(queryLoggingConfig)
  }

  public fun vpcs(vararg vpcs: Any) {
    _vpcs.addAll(listOf(*vpcs))
  }

  public fun vpcs(vpcs: Collection<Any>) {
    _vpcs.addAll(vpcs)
  }

  public fun vpcs(vpcs: IResolvable) {
    cdkBuilder.vpcs(vpcs)
  }

  public fun build(): CfnHostedZone {
    if(_hostedZoneTags.isNotEmpty()) cdkBuilder.hostedZoneTags(_hostedZoneTags)
    if(_vpcs.isNotEmpty()) cdkBuilder.vpcs(_vpcs)
    return cdkBuilder.build()
  }
}
