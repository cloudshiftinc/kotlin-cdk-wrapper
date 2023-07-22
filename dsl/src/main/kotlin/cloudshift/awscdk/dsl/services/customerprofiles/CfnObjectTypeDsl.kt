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
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.constructs.Construct

/**
 * Specifies an Amazon Connect Customer Profiles Object Type Mapping.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnObjectType cfnObjectType = CfnObjectType.Builder.create(this, "MyCfnObjectType")
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
public class CfnObjectTypeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnObjectType.Builder = CfnObjectType.Builder.create(scope, id)

  private val _fields: MutableList<Any> = mutableListOf()

  private val _keys: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   *
   * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the service
   * tries to fetch a standard profile and associate this object with the profile. If it is set to
   * `TRUE` , and if no match is found, then the service creates a new standard profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
   * @param allowProfileCreation Indicates whether a profile should be created when data is received
   * if one doesn’t exist for an object of this type. 
   */
  public fun allowProfileCreation(allowProfileCreation: Boolean) {
    cdkBuilder.allowProfileCreation(allowProfileCreation)
  }

  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   *
   * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the service
   * tries to fetch a standard profile and associate this object with the profile. If it is set to
   * `TRUE` , and if no match is found, then the service creates a new standard profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
   * @param allowProfileCreation Indicates whether a profile should be created when data is received
   * if one doesn’t exist for an object of this type. 
   */
  public fun allowProfileCreation(allowProfileCreation: IResolvable) {
    cdkBuilder.allowProfileCreation(allowProfileCreation)
  }

  /**
   * The description of the profile object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-description)
   * @param description The description of the profile object type mapping. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-domainname)
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The customer-provided key to encrypt the profile object that will be created in this profile
   * object type mapping.
   *
   * If not specified the system will use the encryption key of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-encryptionkey)
   * @param encryptionKey The customer-provided key to encrypt the profile object that will be
   * created in this profile object type mapping. 
   */
  public fun encryptionKey(encryptionKey: String) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * The number of days until the data of this type expires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-expirationdays)
   * @param expirationDays The number of days until the data of this type expires. 
   */
  public fun expirationDays(expirationDays: Number) {
    cdkBuilder.expirationDays(expirationDays)
  }

  /**
   * A list of field definitions for the object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
   * @param fields A list of field definitions for the object type mapping. 
   */
  public fun fields(vararg fields: Any) {
    _fields.addAll(listOf(*fields))
  }

  /**
   * A list of field definitions for the object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
   * @param fields A list of field definitions for the object type mapping. 
   */
  public fun fields(fields: Collection<Any>) {
    _fields.addAll(fields)
  }

  /**
   * A list of field definitions for the object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
   * @param fields A list of field definitions for the object type mapping. 
   */
  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile. 
   */
  public fun keys(vararg keys: Any) {
    _keys.addAll(listOf(*keys))
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile. 
   */
  public fun keys(keys: Collection<Any>) {
    _keys.addAll(keys)
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
   * @param keys A list of keys that can be used to map data to the profile or search for the
   * profile. 
   */
  public fun keys(keys: IResolvable) {
    cdkBuilder.keys(keys)
  }

  /**
   * The name of the profile object type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-objecttypename)
   * @param objectTypeName The name of the profile object type. 
   */
  public fun objectTypeName(objectTypeName: String) {
    cdkBuilder.objectTypeName(objectTypeName)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A unique identifier for the template mapping.
   *
   * This can be used instead of specifying the Keys and Fields properties directly.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-templateid)
   * @param templateId A unique identifier for the template mapping. 
   */
  public fun templateId(templateId: String) {
    cdkBuilder.templateId(templateId)
  }

  public fun build(): CfnObjectType {
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    if(_keys.isNotEmpty()) cdkBuilder.keys(_keys)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
