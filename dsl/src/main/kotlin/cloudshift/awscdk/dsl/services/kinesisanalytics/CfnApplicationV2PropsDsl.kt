@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props

@CdkDslMarker
public class CfnApplicationV2PropsDsl {
  private val cdkBuilder: CfnApplicationV2Props.Builder = CfnApplicationV2Props.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun applicationConfiguration(applicationConfiguration: IResolvable) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  public
      fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  public fun applicationDescription(applicationDescription: String) {
    cdkBuilder.applicationDescription(applicationDescription)
  }

  public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  public
      fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  public fun applicationMode(applicationMode: String) {
    cdkBuilder.applicationMode(applicationMode)
  }

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun runConfiguration(runConfiguration: IResolvable) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  public fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  public fun runtimeEnvironment(runtimeEnvironment: String) {
    cdkBuilder.runtimeEnvironment(runtimeEnvironment)
  }

  public fun serviceExecutionRole(serviceExecutionRole: String) {
    cdkBuilder.serviceExecutionRole(serviceExecutionRole)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplicationV2Props {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
