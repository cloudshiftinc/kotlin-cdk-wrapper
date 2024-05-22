@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class KeyGroup(
  cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroup,
) : Resource(cdkObject), IKeyGroup {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyGroupProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.KeyGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(KeyGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyGroupProps.Builder.() -> Unit,
  ) : this(scope, id, KeyGroupProps(props)
  )

  /**
   * The ID of the key group.
   */
  public override fun keyGroupId(): String = unwrap(this).getKeyGroupId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.KeyGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment to describe the key group.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the key group. 
     */
    public fun comment(comment: String)

    /**
     * A list of public keys to add to the key group.
     *
     * @param items A list of public keys to add to the key group. 
     */
    public fun items(items: List<IPublicKey>)

    /**
     * A list of public keys to add to the key group.
     *
     * @param items A list of public keys to add to the key group. 
     */
    public fun items(vararg items: IPublicKey)

    /**
     * A name to identify the key group.
     *
     * Default: - generated from the `id`
     *
     * @param keyGroupName A name to identify the key group. 
     */
    public fun keyGroupName(keyGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyGroup.Builder =
        software.amazon.awscdk.services.cloudfront.KeyGroup.Builder.create(scope, id)

    /**
     * A comment to describe the key group.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the key group. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * A list of public keys to add to the key group.
     *
     * @param items A list of public keys to add to the key group. 
     */
    override fun items(items: List<IPublicKey>) {
      cdkBuilder.items(items.map(IPublicKey.Companion::unwrap))
    }

    /**
     * A list of public keys to add to the key group.
     *
     * @param items A list of public keys to add to the key group. 
     */
    override fun items(vararg items: IPublicKey): Unit = items(items.toList())

    /**
     * A name to identify the key group.
     *
     * Default: - generated from the `id`
     *
     * @param keyGroupName A name to identify the key group. 
     */
    override fun keyGroupName(keyGroupName: String) {
      cdkBuilder.keyGroupName(keyGroupName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromKeyGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyGroupId: String,
    ): IKeyGroup =
        software.amazon.awscdk.services.cloudfront.KeyGroup.fromKeyGroupId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, keyGroupId).let(IKeyGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeyGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeyGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroup): KeyGroup =
        KeyGroup(cdkObject)

    internal fun unwrap(wrapped: KeyGroup): software.amazon.awscdk.services.cloudfront.KeyGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudfront.KeyGroup
  }
}
