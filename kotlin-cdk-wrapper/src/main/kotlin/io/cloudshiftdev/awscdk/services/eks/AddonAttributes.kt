@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Represents the attributes of an addon for an Amazon EKS cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AddonAttributes addonAttributes = AddonAttributes.builder()
 * .addonName("addonName")
 * .clusterName("clusterName")
 * .build();
 * ```
 */
public interface AddonAttributes {
  /**
   * The name of the addon.
   */
  public fun addonName(): String

  /**
   * The name of the Amazon EKS cluster the addon is associated with.
   */
  public fun clusterName(): String

  /**
   * A builder for [AddonAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addonName The name of the addon. 
     */
    public fun addonName(addonName: String)

    /**
     * @param clusterName The name of the Amazon EKS cluster the addon is associated with. 
     */
    public fun clusterName(clusterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AddonAttributes.Builder =
        software.amazon.awscdk.services.eks.AddonAttributes.builder()

    /**
     * @param addonName The name of the addon. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * @param clusterName The name of the Amazon EKS cluster the addon is associated with. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public fun build(): software.amazon.awscdk.services.eks.AddonAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AddonAttributes,
  ) : CdkObject(cdkObject),
      AddonAttributes {
    /**
     * The name of the addon.
     */
    override fun addonName(): String = unwrap(this).getAddonName()

    /**
     * The name of the Amazon EKS cluster the addon is associated with.
     */
    override fun clusterName(): String = unwrap(this).getClusterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddonAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AddonAttributes):
        AddonAttributes = CdkObjectWrappers.wrap(cdkObject) as? AddonAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddonAttributes):
        software.amazon.awscdk.services.eks.AddonAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.AddonAttributes
  }
}
