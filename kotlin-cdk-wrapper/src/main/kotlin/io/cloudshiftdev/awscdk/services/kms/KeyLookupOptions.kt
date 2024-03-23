@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
   * A builder for [KeyLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName The alias name of the Key. 
     * Must be in the format `alias/&lt;AliasName&gt;`.
     */
    public fun aliasName(aliasName: String)
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

    public fun build(): software.amazon.awscdk.services.kms.KeyLookupOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kms.KeyLookupOptions,
  ) : CdkObject(cdkObject), KeyLookupOptions {
    /**
     * The alias name of the Key.
     *
     * Must be in the format `alias/&lt;AliasName&gt;`.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()
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
