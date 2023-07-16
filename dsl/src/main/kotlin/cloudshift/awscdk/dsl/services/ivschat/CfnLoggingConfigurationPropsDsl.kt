@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps

@CdkDslMarker
public class CfnLoggingConfigurationPropsDsl {
  private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
      CfnLoggingConfigurationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun destinationConfiguration(destinationConfiguration: IResolvable) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  public
      fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLoggingConfigurationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
