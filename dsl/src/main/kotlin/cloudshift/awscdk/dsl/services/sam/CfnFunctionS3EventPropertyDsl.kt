@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionS3EventPropertyDsl {
  private val cdkBuilder: CfnFunction.S3EventProperty.Builder =
      CfnFunction.S3EventProperty.builder()

  private val _events: MutableList<String> = mutableListOf()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun events(events: String) {
    cdkBuilder.events(events)
  }

  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  public fun filter(filter: CfnFunction.S3NotificationFilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun build(): CfnFunction.S3EventProperty {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
