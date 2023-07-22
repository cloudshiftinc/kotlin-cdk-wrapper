@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

@CdkDslMarker
public class CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl {
  private val cdkBuilder: CfnDataRepositoryAssociation.AutoExportPolicyProperty.Builder =
      CfnDataRepositoryAssociation.AutoExportPolicyProperty.builder()

  private val _events: MutableList<String> = mutableListOf()

  /**
   * @param events The `AutoExportPolicy` can have the following event values:. 
   * * `NEW` - New files and directories are automatically exported to the data repository as they
   * are added to the file system.
   * * `CHANGED` - Changes to files and directories on the file system are automatically exported to
   * the data repository.
   * * `DELETED` - Files and directories are automatically deleted on the data repository when they
   * are deleted on the file system.
   *
   * You can define any combination of event types for your `AutoExportPolicy` .
   */
  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events The `AutoExportPolicy` can have the following event values:. 
   * * `NEW` - New files and directories are automatically exported to the data repository as they
   * are added to the file system.
   * * `CHANGED` - Changes to files and directories on the file system are automatically exported to
   * the data repository.
   * * `DELETED` - Files and directories are automatically deleted on the data repository when they
   * are deleted on the file system.
   *
   * You can define any combination of event types for your `AutoExportPolicy` .
   */
  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  public fun build(): CfnDataRepositoryAssociation.AutoExportPolicyProperty {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
