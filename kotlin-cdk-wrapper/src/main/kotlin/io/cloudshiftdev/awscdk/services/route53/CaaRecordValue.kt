@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a CAA record value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CaaRecordValue caaRecordValue = CaaRecordValue.builder()
 * .flag(123)
 * .tag(CaaTag.ISSUE)
 * .value("value")
 * .build();
 * ```
 */
public interface CaaRecordValue {
  /**
   * The flag.
   */
  public fun flag(): Number

  /**
   * The tag.
   */
  public fun tag(): CaaTag

  /**
   * The value associated with the tag.
   */
  public fun `value`(): String

  /**
   * A builder for [CaaRecordValue]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param flag The flag. 
     */
    public fun flag(flag: Number)

    /**
     * @param tag The tag. 
     */
    public fun tag(tag: CaaTag)

    /**
     * @param value The value associated with the tag. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CaaRecordValue.Builder =
        software.amazon.awscdk.services.route53.CaaRecordValue.builder()

    /**
     * @param flag The flag. 
     */
    override fun flag(flag: Number) {
      cdkBuilder.flag(flag)
    }

    /**
     * @param tag The tag. 
     */
    override fun tag(tag: CaaTag) {
      cdkBuilder.tag(tag.let(CaaTag::unwrap))
    }

    /**
     * @param value The value associated with the tag. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.route53.CaaRecordValue = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CaaRecordValue,
  ) : CdkObject(cdkObject), CaaRecordValue {
    /**
     * The flag.
     */
    override fun flag(): Number = unwrap(this).getFlag()

    /**
     * The tag.
     */
    override fun tag(): CaaTag = unwrap(this).getTag().let(CaaTag::wrap)

    /**
     * The value associated with the tag.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CaaRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CaaRecordValue):
        CaaRecordValue = CdkObjectWrappers.wrap(cdkObject) as CaaRecordValue

    internal fun unwrap(wrapped: CaaRecordValue):
        software.amazon.awscdk.services.route53.CaaRecordValue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CaaRecordValue
  }
}
