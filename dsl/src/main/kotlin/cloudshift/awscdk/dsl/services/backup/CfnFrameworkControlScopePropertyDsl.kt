@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.backup.CfnFramework

/**
 * A framework consists of one or more controls.
 *
 * Each control has its own control scope. The control scope can include one or more resource types,
 * a combination of a tag key and value, or a combination of one resource type and one resource ID. If
 * no scope is specified, evaluations for the rule are triggered when any resource in your recording
 * group changes in configuration.
 *
 *
 * To set a control scope that includes all of a particular resource, leave the `ControlScope` empty
 * or do not pass it when calling `CreateFramework` .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ControlScopeProperty controlScopeProperty = ControlScopeProperty.builder()
 * .complianceResourceIds(List.of("complianceResourceIds"))
 * .complianceResourceTypes(List.of("complianceResourceTypes"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html)
 */
@CdkDslMarker
public class CfnFrameworkControlScopePropertyDsl {
  private val cdkBuilder: CfnFramework.ControlScopeProperty.Builder =
      CfnFramework.ControlScopeProperty.builder()

  private val _complianceResourceIds: MutableList<String> = mutableListOf()

  private val _complianceResourceTypes: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param complianceResourceIds The ID of the only AWS resource that you want your control scope
   * to contain.
   */
  public fun complianceResourceIds(vararg complianceResourceIds: String) {
    _complianceResourceIds.addAll(listOf(*complianceResourceIds))
  }

  /**
   * @param complianceResourceIds The ID of the only AWS resource that you want your control scope
   * to contain.
   */
  public fun complianceResourceIds(complianceResourceIds: Collection<String>) {
    _complianceResourceIds.addAll(complianceResourceIds)
  }

  /**
   * @param complianceResourceTypes Describes whether the control scope includes one or more types
   * of resources, such as `EFS` or `RDS` .
   */
  public fun complianceResourceTypes(vararg complianceResourceTypes: String) {
    _complianceResourceTypes.addAll(listOf(*complianceResourceTypes))
  }

  /**
   * @param complianceResourceTypes Describes whether the control scope includes one or more types
   * of resources, such as `EFS` or `RDS` .
   */
  public fun complianceResourceTypes(complianceResourceTypes: Collection<String>) {
    _complianceResourceTypes.addAll(complianceResourceTypes)
  }

  /**
   * @param tags The tag key-value pair applied to those AWS resources that you want to trigger an
   * evaluation for a rule.
   * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an
   * empty string. The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tag key-value pair applied to those AWS resources that you want to trigger an
   * evaluation for a rule.
   * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an
   * empty string. The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFramework.ControlScopeProperty {
    if(_complianceResourceIds.isNotEmpty()) cdkBuilder.complianceResourceIds(_complianceResourceIds)
    if(_complianceResourceTypes.isNotEmpty())
        cdkBuilder.complianceResourceTypes(_complianceResourceTypes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
