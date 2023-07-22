@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnKeyPairProps

/**
 * Properties for defining a `CfnKeyPair`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnKeyPairProps cfnKeyPairProps = CfnKeyPairProps.builder()
 * .keyName("keyName")
 * // the properties below are optional
 * .keyFormat("keyFormat")
 * .keyType("keyType")
 * .publicKeyMaterial("publicKeyMaterial")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html)
 */
@CdkDslMarker
public class CfnKeyPairPropsDsl {
  private val cdkBuilder: CfnKeyPairProps.Builder = CfnKeyPairProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param keyFormat The format of the key pair.
   * Default: `pem`
   */
  public fun keyFormat(keyFormat: String) {
    cdkBuilder.keyFormat(keyFormat)
  }

  /**
   * @param keyName A unique name for the key pair. 
   * Constraints: Up to 255 ASCII characters
   */
  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  /**
   * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
   * instances.
   * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
   * key type is inferred from the `PublicKeyMaterial` value.
   *
   * Default: `rsa`
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  /**
   * @param publicKeyMaterial The public key material.
   * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
   * specified, then a new key pair will be created.
   */
  public fun publicKeyMaterial(publicKeyMaterial: String) {
    cdkBuilder.publicKeyMaterial(publicKeyMaterial)
  }

  /**
   * @param tags The tags to apply to the key pair.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to apply to the key pair.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnKeyPairProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
