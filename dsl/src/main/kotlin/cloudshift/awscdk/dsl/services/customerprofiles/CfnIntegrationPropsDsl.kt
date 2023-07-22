@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps

@CdkDslMarker
public class CfnIntegrationPropsDsl {
  private val cdkBuilder: CfnIntegrationProps.Builder = CfnIntegrationProps.builder()

  private val _objectTypeNames: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param flowDefinition The configuration that controls how Customer Profiles retrieves data from
   * the source.
   */
  public fun flowDefinition(flowDefinition: IResolvable) {
    cdkBuilder.flowDefinition(flowDefinition)
  }

  /**
   * @param flowDefinition The configuration that controls how Customer Profiles retrieves data from
   * the source.
   */
  public fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty) {
    cdkBuilder.flowDefinition(flowDefinition)
  }

  /**
   * @param objectTypeName The name of the profile object type mapping to use.
   */
  public fun objectTypeName(objectTypeName: String) {
    cdkBuilder.objectTypeName(objectTypeName)
  }

  /**
   * @param objectTypeNames The object type mapping.
   */
  public fun objectTypeNames(vararg objectTypeNames: Any) {
    _objectTypeNames.addAll(listOf(*objectTypeNames))
  }

  /**
   * @param objectTypeNames The object type mapping.
   */
  public fun objectTypeNames(objectTypeNames: Collection<Any>) {
    _objectTypeNames.addAll(objectTypeNames)
  }

  /**
   * @param objectTypeNames The object type mapping.
   */
  public fun objectTypeNames(objectTypeNames: IResolvable) {
    cdkBuilder.objectTypeNames(objectTypeNames)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param uri The URI of the S3 bucket or any other type of data source.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnIntegrationProps {
    if(_objectTypeNames.isNotEmpty()) cdkBuilder.objectTypeNames(_objectTypeNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
