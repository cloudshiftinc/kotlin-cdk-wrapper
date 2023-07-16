@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnListenerProps

@CdkDslMarker
public class CfnListenerPropsDsl {
  private val cdkBuilder: CfnListenerProps.Builder = CfnListenerProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun defaultAction(defaultAction: IResolvable) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnListenerProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
