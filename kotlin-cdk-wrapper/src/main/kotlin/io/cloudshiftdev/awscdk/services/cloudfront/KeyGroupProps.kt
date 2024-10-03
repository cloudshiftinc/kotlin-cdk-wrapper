@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for creating a Public Key.
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
public interface KeyGroupProps {
  /**
   * A comment to describe the key group.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A list of public keys to add to the key group.
   */
  public fun items(): List<IPublicKey>

  /**
   * A name to identify the key group.
   *
   * Default: - generated from the `id`
   */
  public fun keyGroupName(): String? = unwrap(this).getKeyGroupName()

  /**
   * A builder for [KeyGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to describe the key group.
     */
    public fun comment(comment: String)

    /**
     * @param items A list of public keys to add to the key group. 
     */
    public fun items(items: List<IPublicKey>)

    /**
     * @param items A list of public keys to add to the key group. 
     */
    public fun items(vararg items: IPublicKey)

    /**
     * @param keyGroupName A name to identify the key group.
     */
    public fun keyGroupName(keyGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.KeyGroupProps.builder()

    /**
     * @param comment A comment to describe the key group.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param items A list of public keys to add to the key group. 
     */
    override fun items(items: List<IPublicKey>) {
      cdkBuilder.items(items.map(IPublicKey.Companion::unwrap))
    }

    /**
     * @param items A list of public keys to add to the key group. 
     */
    override fun items(vararg items: IPublicKey): Unit = items(items.toList())

    /**
     * @param keyGroupName A name to identify the key group.
     */
    override fun keyGroupName(keyGroupName: String) {
      cdkBuilder.keyGroupName(keyGroupName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroupProps,
  ) : CdkObject(cdkObject),
      KeyGroupProps {
    /**
     * A comment to describe the key group.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * A list of public keys to add to the key group.
     */
    override fun items(): List<IPublicKey> = unwrap(this).getItems().map(IPublicKey::wrap)

    /**
     * A name to identify the key group.
     *
     * Default: - generated from the `id`
     */
    override fun keyGroupName(): String? = unwrap(this).getKeyGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroupProps):
        KeyGroupProps = CdkObjectWrappers.wrap(cdkObject) as? KeyGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyGroupProps):
        software.amazon.awscdk.services.cloudfront.KeyGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.KeyGroupProps
  }
}
