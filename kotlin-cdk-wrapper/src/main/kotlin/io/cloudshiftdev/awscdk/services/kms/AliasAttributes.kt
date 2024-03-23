@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of a reference to an existing KMS Alias.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * AliasAttributes aliasAttributes = AliasAttributes.builder()
 * .aliasName("aliasName")
 * .aliasTargetKey(key)
 * .build();
 * ```
 */
public interface AliasAttributes {
  /**
   * Specifies the alias name.
   *
   * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
   */
  public fun aliasName(): String

  /**
   * The customer master key (CMK) to which the Alias refers.
   */
  public fun aliasTargetKey(): IKey

  /**
   * A builder for [AliasAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName Specifies the alias name. 
     * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
     */
    public fun aliasName(aliasName: String)

    /**
     * @param aliasTargetKey The customer master key (CMK) to which the Alias refers. 
     */
    public fun aliasTargetKey(aliasTargetKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.AliasAttributes.Builder =
        software.amazon.awscdk.services.kms.AliasAttributes.builder()

    /**
     * @param aliasName Specifies the alias name. 
     * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param aliasTargetKey The customer master key (CMK) to which the Alias refers. 
     */
    override fun aliasTargetKey(aliasTargetKey: IKey) {
      cdkBuilder.aliasTargetKey(aliasTargetKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.AliasAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kms.AliasAttributes,
  ) : CdkObject(cdkObject), AliasAttributes {
    /**
     * Specifies the alias name.
     *
     * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * The customer master key (CMK) to which the Alias refers.
     */
    override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.AliasAttributes):
        AliasAttributes = CdkObjectWrappers.wrap(cdkObject) as? AliasAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasAttributes):
        software.amazon.awscdk.services.kms.AliasAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.AliasAttributes
  }
}
