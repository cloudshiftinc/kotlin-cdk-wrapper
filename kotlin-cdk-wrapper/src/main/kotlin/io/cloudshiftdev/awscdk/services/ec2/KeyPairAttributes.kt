@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes of a Key Pair.
 *
 * Example:
 *
 * ```
 * IKeyPair keyPair = KeyPair.fromKeyPairAttributes(this, "KeyPair", KeyPairAttributes.builder()
 * .keyPairName("the-keypair-name")
 * .type(KeyPairType.RSA)
 * .build());
 * ```
 */
public interface KeyPairAttributes {
  /**
   * The unique name of the key pair.
   */
  public fun keyPairName(): String

  /**
   * The type of the key pair.
   *
   * Default: no type specified
   */
  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  /**
   * A builder for [KeyPairAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param keyPairName The unique name of the key pair. 
     */
    public fun keyPairName(keyPairName: String)

    /**
     * @param type The type of the key pair.
     */
    public fun type(type: KeyPairType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPairAttributes.Builder =
        software.amazon.awscdk.services.ec2.KeyPairAttributes.builder()

    /**
     * @param keyPairName The unique name of the key pair. 
     */
    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    /**
     * @param type The type of the key pair.
     */
    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPairAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes,
  ) : CdkObject(cdkObject), KeyPairAttributes {
    /**
     * The unique name of the key pair.
     */
    override fun keyPairName(): String = unwrap(this).getKeyPairName()

    /**
     * The type of the key pair.
     *
     * Default: no type specified
     */
    override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyPairAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes):
        KeyPairAttributes = CdkObjectWrappers.wrap(cdkObject) as? KeyPairAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyPairAttributes):
        software.amazon.awscdk.services.ec2.KeyPairAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.KeyPairAttributes
  }
}
