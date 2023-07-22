@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

/**
 * Describes a data repository association's automatic export policy.
 *
 * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
 * automatically exported to the data repository. As you create, modify, or delete files, Amazon FSx
 * for Lustre automatically exports the defined changes asynchronously once your application finishes
 * modifying the file.
 *
 * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
 * repository association.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * AutoExportPolicyProperty autoExportPolicyProperty = AutoExportPolicyProperty.builder()
 * .events(List.of("events"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoexportpolicy.html)
 */
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
