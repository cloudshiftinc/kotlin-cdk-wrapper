@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps

/**
 * Properties for defining a `CfnObjectType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnObjectTypeProps cfnObjectTypeProps = CfnObjectTypeProps.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .allowProfileCreation(false)
 * .description("description")
 * .encryptionKey("encryptionKey")
 * .expirationDays(123)
 * .fields(List.of(FieldMapProperty.builder()
 * .name("name")
 * .objectTypeField(ObjectTypeFieldProperty.builder()
 * .contentType("contentType")
 * .source("source")
 * .target("target")
 * .build())
 * .build()))
 * .keys(List.of(KeyMapProperty.builder()
 * .name("name")
 * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
 * .fieldNames(List.of("fieldNames"))
 * .standardIdentifiers(List.of("standardIdentifiers"))
 * .build()))
 * .build()))
 * .objectTypeName("objectTypeName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateId("templateId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html)
 */
@CdkDslMarker
public class CfnObjectTypePropsDsl {
  private val cdkBuilder: CfnObjectTypeProps.Builder = CfnObjectTypeProps.builder()

  private val _fields: MutableList<Any> = mutableListOf()

  private val _keys: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param allowProfileCreation Indicates whether a profile should be created when data is received
   * if one doesn’t exist for an object of this type.
   * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the service
   * tries to fetch a standard profile and associate this object with the profile. If it is set to
   * `TRUE` , and if no match is found, then the service creates a new standard profile.
   */
  public fun allowProfileCreation(allowProfileCreation: Boolean) {
    cdkBuilder.allowProfileCreation(allowProfileCreation)
  }

  /**
   * @param allowProfileCreation Indicates whether a profile should be created when data is received
   * if one doesn’t exist for an object of this type.
   * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the service
   * tries to fetch a standard profile and associate this object with the profile. If it is set to
   * `TRUE` , and if no match is found, then the service creates a new standard profile.
   */
  public fun allowProfileCreation(allowProfileCreation: IResolvable) {
    cdkBuilder.allowProfileCreation(allowProfileCreation)
  }

  /**
   * @param description The description of the profile object type mapping.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param encryptionKey The customer-provided key to encrypt the profile object that will be
   * created in this profile object type mapping.
   * If not specified the system will use the encryption key of the domain.
   */
  public fun encryptionKey(encryptionKey: String) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param expirationDays The number of days until the data of this type expires.
   */
  public fun expirationDays(expirationDays: Number) {
    cdkBuilder.expirationDays(expirationDays)
  }

  /**
   * @param fields A list of field definitions for the object type mapping.
   */
  public fun fields(vararg fields: Any) {
    _fields.addAll(listOf(*fields))
  }

  /**
   * @param fields A list of field definitions for the object type mapping.
   */
  public fun fields(fields: Collection<Any>) {
    _fields.addAll(fields)
  }

  /**
   * @param fields A list of field definitions for the object type mapping.
   */
  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  /**
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile.
   */
  public fun keys(vararg keys: Any) {
    _keys.addAll(listOf(*keys))
  }

  /**
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile.
   */
  public fun keys(keys: Collection<Any>) {
    _keys.addAll(keys)
  }

  /**
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile.
   */
  public fun keys(keys: IResolvable) {
    cdkBuilder.keys(keys)
  }

  /**
   * @param objectTypeName The name of the profile object type.
   */
  public fun objectTypeName(objectTypeName: String) {
    cdkBuilder.objectTypeName(objectTypeName)
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
   * @param templateId A unique identifier for the template mapping.
   * This can be used instead of specifying the Keys and Fields properties directly.
   */
  public fun templateId(templateId: String) {
    cdkBuilder.templateId(templateId)
  }

  public fun build(): CfnObjectTypeProps {
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    if(_keys.isNotEmpty()) cdkBuilder.keys(_keys)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
