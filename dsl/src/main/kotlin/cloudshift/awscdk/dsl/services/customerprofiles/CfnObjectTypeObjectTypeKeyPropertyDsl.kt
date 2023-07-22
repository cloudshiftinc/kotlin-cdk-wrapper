@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

/**
 * An object that defines the Key element of a ProfileObject.
 *
 * A Key is a special element that can be used to search for a customer profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ObjectTypeKeyProperty objectTypeKeyProperty = ObjectTypeKeyProperty.builder()
 * .fieldNames(List.of("fieldNames"))
 * .standardIdentifiers(List.of("standardIdentifiers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html)
 */
@CdkDslMarker
public class CfnObjectTypeObjectTypeKeyPropertyDsl {
  private val cdkBuilder: CfnObjectType.ObjectTypeKeyProperty.Builder =
      CfnObjectType.ObjectTypeKeyProperty.builder()

  private val _fieldNames: MutableList<String> = mutableListOf()

  private val _standardIdentifiers: MutableList<String> = mutableListOf()

  /**
   * @param fieldNames The reference for the key name of the fields map.
   */
  public fun fieldNames(vararg fieldNames: String) {
    _fieldNames.addAll(listOf(*fieldNames))
  }

  /**
   * @param fieldNames The reference for the key name of the fields map.
   */
  public fun fieldNames(fieldNames: Collection<String>) {
    _fieldNames.addAll(fieldNames)
  }

  /**
   * @param standardIdentifiers The types of keys that a ProfileObject can have.
   * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
   * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely
   * identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
   * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile
   * but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the
   * profile does not already exist before the object is ingested, otherwise it is only used for
   * matching objects to profiles.
   */
  public fun standardIdentifiers(vararg standardIdentifiers: String) {
    _standardIdentifiers.addAll(listOf(*standardIdentifiers))
  }

  /**
   * @param standardIdentifiers The types of keys that a ProfileObject can have.
   * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
   * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely
   * identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
   * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile
   * but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the
   * profile does not already exist before the object is ingested, otherwise it is only used for
   * matching objects to profiles.
   */
  public fun standardIdentifiers(standardIdentifiers: Collection<String>) {
    _standardIdentifiers.addAll(standardIdentifiers)
  }

  public fun build(): CfnObjectType.ObjectTypeKeyProperty {
    if(_fieldNames.isNotEmpty()) cdkBuilder.fieldNames(_fieldNames)
    if(_standardIdentifiers.isNotEmpty()) cdkBuilder.standardIdentifiers(_standardIdentifiers)
    return cdkBuilder.build()
  }
}
