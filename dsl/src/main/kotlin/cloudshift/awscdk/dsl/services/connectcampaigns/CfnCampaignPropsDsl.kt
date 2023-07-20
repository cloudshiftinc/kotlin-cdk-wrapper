@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps

@CdkDslMarker
public class CfnCampaignPropsDsl {
  private val cdkBuilder: CfnCampaignProps.Builder = CfnCampaignProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun connectInstanceArn(connectInstanceArn: String) {
    cdkBuilder.connectInstanceArn(connectInstanceArn)
  }

  public fun dialerConfig(dialerConfig: IResolvable) {
    cdkBuilder.dialerConfig(dialerConfig)
  }

  public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty) {
    cdkBuilder.dialerConfig(dialerConfig)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outboundCallConfig(outboundCallConfig: IResolvable) {
    cdkBuilder.outboundCallConfig(outboundCallConfig)
  }

  public fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty) {
    cdkBuilder.outboundCallConfig(outboundCallConfig)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCampaignProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
