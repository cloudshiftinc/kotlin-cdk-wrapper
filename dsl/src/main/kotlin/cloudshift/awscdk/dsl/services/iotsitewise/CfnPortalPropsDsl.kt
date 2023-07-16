@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnPortalProps

@CdkDslMarker
public class CfnPortalPropsDsl {
  private val cdkBuilder: CfnPortalProps.Builder = CfnPortalProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun alarms(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.alarms(builder.map)
  }

  public fun alarms(alarms: Any) {
    cdkBuilder.alarms(alarms)
  }

  public fun notificationSenderEmail(notificationSenderEmail: String) {
    cdkBuilder.notificationSenderEmail(notificationSenderEmail)
  }

  public fun portalAuthMode(portalAuthMode: String) {
    cdkBuilder.portalAuthMode(portalAuthMode)
  }

  public fun portalContactEmail(portalContactEmail: String) {
    cdkBuilder.portalContactEmail(portalContactEmail)
  }

  public fun portalDescription(portalDescription: String) {
    cdkBuilder.portalDescription(portalDescription)
  }

  public fun portalName(portalName: String) {
    cdkBuilder.portalName(portalName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPortalProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
