@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for ResourceUpdateConstraint.
 *
 * Example:
 *
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * // to disable tag updates:
 * portfolio.constrainTagUpdates(product, TagUpdateConstraintOptions.builder()
 * .allow(false)
 * .build());
 * ```
 */
public interface TagUpdateConstraintOptions : CommonConstraintOptions {
  /**
   * Toggle for if users should be allowed to change/update tags on provisioned products.
   *
   * Default: true
   */
  public fun allow(): Boolean? = unwrap(this).getAllow()

  /**
   * A builder for [TagUpdateConstraintOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allow Toggle for if users should be allowed to change/update tags on provisioned
     * products.
     */
    public fun allow(allow: Boolean)

    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions.builder()

    /**
     * @param allow Toggle for if users should be allowed to change/update tags on provisioned
     * products.
     */
    override fun allow(allow: Boolean) {
      cdkBuilder.allow(allow)
    }

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions,
  ) : CdkObject(cdkObject), TagUpdateConstraintOptions {
    /**
     * Toggle for if users should be allowed to change/update tags on provisioned products.
     *
     * Default: true
     */
    override fun allow(): Boolean? = unwrap(this).getAllow()

    /**
     * The description of the constraint.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The language code.
     *
     * Configures the language for error messages from service catalog.
     *
     * Default: - English
     */
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagUpdateConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions):
        TagUpdateConstraintOptions = CdkObjectWrappers.wrap(cdkObject) as?
        TagUpdateConstraintOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagUpdateConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions
  }
}
