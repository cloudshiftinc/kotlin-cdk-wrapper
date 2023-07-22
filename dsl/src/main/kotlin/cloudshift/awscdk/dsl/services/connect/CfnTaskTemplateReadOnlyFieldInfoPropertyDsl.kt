@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

/**
 * Indicates a field that is read-only to an agent.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * ReadOnlyFieldInfoProperty readOnlyFieldInfoProperty = ReadOnlyFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-readonlyfieldinfo.html)
 */
@CdkDslMarker
public class CfnTaskTemplateReadOnlyFieldInfoPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.ReadOnlyFieldInfoProperty.Builder =
      CfnTaskTemplate.ReadOnlyFieldInfoProperty.builder()

  /**
   * @param id Identifier of the read-only field. 
   */
  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  /**
   * @param id Identifier of the read-only field. 
   */
  public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnTaskTemplate.ReadOnlyFieldInfoProperty = cdkBuilder.build()
}
