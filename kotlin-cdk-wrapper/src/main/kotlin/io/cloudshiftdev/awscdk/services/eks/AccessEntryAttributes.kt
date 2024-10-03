@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Represents the attributes of an access entry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessEntryAttributes accessEntryAttributes = AccessEntryAttributes.builder()
 * .accessEntryArn("accessEntryArn")
 * .accessEntryName("accessEntryName")
 * .build();
 * ```
 */
public interface AccessEntryAttributes {
  /**
   * The Amazon Resource Name (ARN) of the access entry.
   */
  public fun accessEntryArn(): String

  /**
   * The name of the access entry.
   */
  public fun accessEntryName(): String

  /**
   * A builder for [AccessEntryAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEntryArn The Amazon Resource Name (ARN) of the access entry. 
     */
    public fun accessEntryArn(accessEntryArn: String)

    /**
     * @param accessEntryName The name of the access entry. 
     */
    public fun accessEntryName(accessEntryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessEntryAttributes.Builder =
        software.amazon.awscdk.services.eks.AccessEntryAttributes.builder()

    /**
     * @param accessEntryArn The Amazon Resource Name (ARN) of the access entry. 
     */
    override fun accessEntryArn(accessEntryArn: String) {
      cdkBuilder.accessEntryArn(accessEntryArn)
    }

    /**
     * @param accessEntryName The name of the access entry. 
     */
    override fun accessEntryName(accessEntryName: String) {
      cdkBuilder.accessEntryName(accessEntryName)
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessEntryAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AccessEntryAttributes,
  ) : CdkObject(cdkObject),
      AccessEntryAttributes {
    /**
     * The Amazon Resource Name (ARN) of the access entry.
     */
    override fun accessEntryArn(): String = unwrap(this).getAccessEntryArn()

    /**
     * The name of the access entry.
     */
    override fun accessEntryName(): String = unwrap(this).getAccessEntryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessEntryAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessEntryAttributes):
        AccessEntryAttributes = CdkObjectWrappers.wrap(cdkObject) as? AccessEntryAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessEntryAttributes):
        software.amazon.awscdk.services.eks.AccessEntryAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.AccessEntryAttributes
  }
}
