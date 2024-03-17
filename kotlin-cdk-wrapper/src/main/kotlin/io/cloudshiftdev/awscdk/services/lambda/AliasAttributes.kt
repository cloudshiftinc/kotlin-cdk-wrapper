@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Version version;
 * AliasAttributes aliasAttributes = AliasAttributes.builder()
 * .aliasName("aliasName")
 * .aliasVersion(version)
 * .build();
 * ```
 */
public interface AliasAttributes {
  /**
   *
   */
  public fun aliasName(): String

  /**
   *
   */
  public fun aliasVersion(): IVersion

  /**
   * A builder for [AliasAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName the value to be set. 
     */
    public fun aliasName(aliasName: String)

    /**
     * @param aliasVersion the value to be set. 
     */
    public fun aliasVersion(aliasVersion: IVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AliasAttributes.Builder =
        software.amazon.awscdk.services.lambda.AliasAttributes.builder()

    /**
     * @param aliasName the value to be set. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param aliasVersion the value to be set. 
     */
    override fun aliasVersion(aliasVersion: IVersion) {
      cdkBuilder.aliasVersion(aliasVersion.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AliasAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.AliasAttributes,
  ) : CdkObject(cdkObject), AliasAttributes {
    /**
     *
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     *
     */
    override fun aliasVersion(): IVersion = unwrap(this).getAliasVersion().let(IVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AliasAttributes):
        AliasAttributes = CdkObjectWrappers.wrap(cdkObject) as? AliasAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasAttributes):
        software.amazon.awscdk.services.lambda.AliasAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.AliasAttributes
  }
}
