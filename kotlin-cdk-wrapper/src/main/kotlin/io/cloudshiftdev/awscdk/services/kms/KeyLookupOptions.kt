@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing Key.
 *
 * Example:
 *
 * ```
 * IKey myKeyLookup = Key.fromLookup(this, "MyKeyLookup", KeyLookupOptions.builder()
 * .aliasName("alias/KeyAlias")
 * .build());
 * Role role = Role.Builder.create(this, "MyRole")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .build();
 * myKeyLookup.grantEncryptDecrypt(role);
 * ```
 */
public interface KeyLookupOptions {
  /**
   * The alias name of the Key.
   *
   * Must be in the format `alias/&lt;AliasName&gt;`.
   */
  public fun aliasName(): String

  /**
   * Whether to return a dummy key if the key was not found.
   *
   * If it is set to `true` and the key was not found, a dummy
   * key with a key id '1234abcd-12ab-34cd-56ef-1234567890ab'
   * will be returned. The value of the dummy key id can also
   * be referenced using the `Key.DEFAULT_DUMMY_KEY_ID` variable,
   * and you can check if the key is a dummy key by using the
   * `Key.isLookupDummy()` method.
   *
   * Default: false
   */
  public fun returnDummyKeyOnMissing(): Boolean? = unwrap(this).getReturnDummyKeyOnMissing()

  /**
   * A builder for [KeyLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName The alias name of the Key. 
     * Must be in the format `alias/&lt;AliasName&gt;`.
     */
    public fun aliasName(aliasName: String)

    /**
     * @param returnDummyKeyOnMissing Whether to return a dummy key if the key was not found.
     * If it is set to `true` and the key was not found, a dummy
     * key with a key id '1234abcd-12ab-34cd-56ef-1234567890ab'
     * will be returned. The value of the dummy key id can also
     * be referenced using the `Key.DEFAULT_DUMMY_KEY_ID` variable,
     * and you can check if the key is a dummy key by using the
     * `Key.isLookupDummy()` method.
     */
    public fun returnDummyKeyOnMissing(returnDummyKeyOnMissing: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.KeyLookupOptions.Builder =
        software.amazon.awscdk.services.kms.KeyLookupOptions.builder()

    /**
     * @param aliasName The alias name of the Key. 
     * Must be in the format `alias/&lt;AliasName&gt;`.
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param returnDummyKeyOnMissing Whether to return a dummy key if the key was not found.
     * If it is set to `true` and the key was not found, a dummy
     * key with a key id '1234abcd-12ab-34cd-56ef-1234567890ab'
     * will be returned. The value of the dummy key id can also
     * be referenced using the `Key.DEFAULT_DUMMY_KEY_ID` variable,
     * and you can check if the key is a dummy key by using the
     * `Key.isLookupDummy()` method.
     */
    override fun returnDummyKeyOnMissing(returnDummyKeyOnMissing: Boolean) {
      cdkBuilder.returnDummyKeyOnMissing(returnDummyKeyOnMissing)
    }

    public fun build(): software.amazon.awscdk.services.kms.KeyLookupOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions,
  ) : CdkObject(cdkObject),
      KeyLookupOptions {
    /**
     * The alias name of the Key.
     *
     * Must be in the format `alias/&lt;AliasName&gt;`.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * Whether to return a dummy key if the key was not found.
     *
     * If it is set to `true` and the key was not found, a dummy
     * key with a key id '1234abcd-12ab-34cd-56ef-1234567890ab'
     * will be returned. The value of the dummy key id can also
     * be referenced using the `Key.DEFAULT_DUMMY_KEY_ID` variable,
     * and you can check if the key is a dummy key by using the
     * `Key.isLookupDummy()` method.
     *
     * Default: false
     */
    override fun returnDummyKeyOnMissing(): Boolean? = unwrap(this).getReturnDummyKeyOnMissing()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions):
        KeyLookupOptions = CdkObjectWrappers.wrap(cdkObject) as? KeyLookupOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyLookupOptions):
        software.amazon.awscdk.services.kms.KeyLookupOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.KeyLookupOptions
  }
}
