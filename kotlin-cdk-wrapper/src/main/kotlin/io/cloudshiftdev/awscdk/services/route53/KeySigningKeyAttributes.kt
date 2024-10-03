@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The attributes of a key signing key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * HostedZone hostedZone;
 * KeySigningKeyAttributes keySigningKeyAttributes = KeySigningKeyAttributes.builder()
 * .hostedZone(hostedZone)
 * .keySigningKeyName("keySigningKeyName")
 * .build();
 * ```
 */
public interface KeySigningKeyAttributes {
  /**
   * The hosted zone that the key signing key signs.
   */
  public fun hostedZone(): IHostedZone

  /**
   * The name of the key signing key.
   */
  public fun keySigningKeyName(): String

  /**
   * A builder for [KeySigningKeyAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedZone The hosted zone that the key signing key signs. 
     */
    public fun hostedZone(hostedZone: IHostedZone)

    /**
     * @param keySigningKeyName The name of the key signing key. 
     */
    public fun keySigningKeyName(keySigningKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.KeySigningKeyAttributes.Builder
        = software.amazon.awscdk.services.route53.KeySigningKeyAttributes.builder()

    /**
     * @param hostedZone The hosted zone that the key signing key signs. 
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone.Companion::unwrap))
    }

    /**
     * @param keySigningKeyName The name of the key signing key. 
     */
    override fun keySigningKeyName(keySigningKeyName: String) {
      cdkBuilder.keySigningKeyName(keySigningKeyName)
    }

    public fun build(): software.amazon.awscdk.services.route53.KeySigningKeyAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.KeySigningKeyAttributes,
  ) : CdkObject(cdkObject),
      KeySigningKeyAttributes {
    /**
     * The hosted zone that the key signing key signs.
     */
    override fun hostedZone(): IHostedZone = unwrap(this).getHostedZone().let(IHostedZone::wrap)

    /**
     * The name of the key signing key.
     */
    override fun keySigningKeyName(): String = unwrap(this).getKeySigningKeyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeySigningKeyAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.KeySigningKeyAttributes):
        KeySigningKeyAttributes = CdkObjectWrappers.wrap(cdkObject) as? KeySigningKeyAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeySigningKeyAttributes):
        software.amazon.awscdk.services.route53.KeySigningKeyAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.KeySigningKeyAttributes
  }
}
