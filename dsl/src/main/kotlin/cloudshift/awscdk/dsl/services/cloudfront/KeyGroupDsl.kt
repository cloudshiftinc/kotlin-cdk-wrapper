@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.IPublicKey
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.constructs.Construct

/**
 * A Key Group configuration.
 *
 * Example:
 *
 * ```
 * // Validating signed URLs or signed cookies with Trusted Key Groups
 * // public key in PEM format
 * String publicKey;
 * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
 * .encodedKey(publicKey)
 * .build();
 * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
 * .items(List.of(pubKey))
 * .build();
 * Distribution.Builder.create(this, "Dist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .trustedKeyGroups(List.of(keyGroup))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class KeyGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: KeyGroup.Builder = KeyGroup.Builder.create(scope, id)

  private val _items: MutableList<IPublicKey> = mutableListOf()

  /**
   * A comment to describe the key group.
   *
   * Default: - no comment
   *
   * @param comment A comment to describe the key group. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * A list of public keys to add to the key group.
   *
   * @param items A list of public keys to add to the key group. 
   */
  public fun items(vararg items: IPublicKey) {
    _items.addAll(listOf(*items))
  }

  /**
   * A list of public keys to add to the key group.
   *
   * @param items A list of public keys to add to the key group. 
   */
  public fun items(items: Collection<IPublicKey>) {
    _items.addAll(items)
  }

  /**
   * A name to identify the key group.
   *
   * Default: - generated from the `id`
   *
   * @param keyGroupName A name to identify the key group. 
   */
  public fun keyGroupName(keyGroupName: String) {
    cdkBuilder.keyGroupName(keyGroupName)
  }

  public fun build(): KeyGroup {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
